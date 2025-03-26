<template>
	<div class="addEdit-block" :style='{"padding":"30px","fontSize":"14px","color":"#666","background":"none"}'>
		<el-form
			:style='{"border":"0px solid rgba(255,255,255,1)","padding":"40px 30px 20px","boxShadow":"0 1px 10px 1px rgba(115,108,203,.1)","borderRadius":"3px","alignItems":"flex-start","flexWrap":"wrap","background":"rgba(255,255,255,1)","display":"flex","fontSize":"inherit"}'
			class="add-update-preview"
			ref="ruleForm"
			:model="ruleForm"
			:rules="rules"
			label-width="150px"
		>
			<template >
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="果树名称" prop="guoshumingcheng">
					<el-input v-model="ruleForm.guoshumingcheng" placeholder="果树名称" clearable  :readonly="ro.guoshumingcheng"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="果树名称" prop="guoshumingcheng">
					<el-input v-model="ruleForm.guoshumingcheng" placeholder="果树名称" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="果树类型" prop="guoshuleixing">
					<el-input v-model="ruleForm.guoshuleixing" placeholder="果树类型" clearable  :readonly="ro.guoshuleixing"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="果树类型" prop="guoshuleixing">
					<el-input v-model="ruleForm.guoshuleixing" placeholder="果树类型" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="upload" v-if="type!='info' && !ro.guoshutupian" label="果树图片" prop="guoshutupian">
					<file-upload
						tip="点击上传果树图片"
						action="file/upload"
						:limit="3"
						:multiple="true"
						:fileUrls="ruleForm.guoshutupian?ruleForm.guoshutupian:''"
						@change="guoshutupianUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="upload" v-else-if="ruleForm.guoshutupian" label="果树图片" prop="guoshutupian">
					<img v-if="ruleForm.guoshutupian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.guoshutupian.split(',')[0]" width="100" height="100">
					<img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.guoshutupian.split(',')" :src="$base.url+item" width="100" height="100">
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="select" v-if="type!='info'"  label="生长阶段" prop="shengzhangjieduan">
					<el-select :disabled="ro.shengzhangjieduan" v-model="ruleForm.shengzhangjieduan" placeholder="请选择生长阶段" >
						<el-option
							v-for="(item,index) in shengzhangjieduanOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="生长阶段" prop="shengzhangjieduan">
					<el-input v-model="ruleForm.shengzhangjieduan"
						placeholder="生长阶段" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="果树高度" prop="guoshugaodu">
					<el-input v-model="ruleForm.guoshugaodu" placeholder="果树高度" clearable  :readonly="ro.guoshugaodu"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="果树高度" prop="guoshugaodu">
					<el-input v-model="ruleForm.guoshugaodu" placeholder="果树高度" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="农场账号" prop="nongchangzhanghao">
					<el-input v-model="ruleForm.nongchangzhanghao" placeholder="农场账号" clearable  :readonly="ro.nongchangzhanghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="农场账号" prop="nongchangzhanghao">
					<el-input v-model="ruleForm.nongchangzhanghao" placeholder="农场账号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="负责人" prop="fuzeren">
					<el-input v-model="ruleForm.fuzeren" placeholder="负责人" clearable  :readonly="ro.fuzeren"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="负责人" prop="fuzeren">
					<el-input v-model="ruleForm.fuzeren" placeholder="负责人" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="date" v-if="type!='info'" label="发布时间" prop="fabushijian">
					<el-date-picker
						value-format="yyyy-MM-dd HH:mm:ss"
						v-model="ruleForm.fabushijian" 
						type="datetime"
						:readonly="ro.fabushijian"
						placeholder="发布时间"
					></el-date-picker>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-else-if="ruleForm.fabushijian" label="发布时间" prop="fabushijian">
					<el-input v-model="ruleForm.fabushijian" placeholder="发布时间" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="upload" v-if="type!='info'&& !ro.jianyineirong" label="建议内容" prop="jianyineirong">
					<file-upload
						tip="点击上传建议内容"
						action="file/upload"
						:limit="1"
						:multiple="true"
						:fileUrls="ruleForm.jianyineirong?ruleForm.jianyineirong:''"
						@change="jianyineirongUploadChange"
					></file-upload>
				</el-form-item>  
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else-if="ruleForm.jianyineirong" label="建议内容" prop="jianyineirong">
					<el-button :style='{"border":"0px solid #e5e9ec","cursor":"pointer","padding":"0 30px","margin":"0 20px 0 0","outline":"none","color":"#fff","borderRadius":"4px","background":"#2bb3c0","width":"auto","lineHeight":"36px","fontSize":"14px","height":"36px"}' type="text" size="small" @click="download($base.url+ruleForm.jianyineirong)">下载</el-button>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else-if="!ruleForm.jianyineirong" label="建议内容" prop="jianyineirong">
					<el-button :style='{"border":"0px solid #e5e9ec","cursor":"pointer","padding":"0 30px","margin":"0 20px 0 0","outline":"none","color":"#fff","borderRadius":"4px","background":"#2bb3c0","width":"auto","lineHeight":"36px","fontSize":"14px","height":"36px"}' type="text" size="small">无</el-button>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="upload" v-if="type!='info'&& !ro.zhidaoshipin" label="指导视频" prop="zhidaoshipin">
					<file-upload
						tip="点击上传指导视频"
						action="file/upload"
						:limit="1"
						:multiple="true"
						:fileUrls="ruleForm.zhidaoshipin?ruleForm.zhidaoshipin:''"
						@change="zhidaoshipinUploadChange"
					></file-upload>
				</el-form-item> 
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else-if="ruleForm.zhidaoshipin" label="指导视频" prop="zhidaoshipin">
					<el-button :style='{"border":"0px solid #e5e9ec","cursor":"pointer","padding":"0 30px","margin":"0 20px 0 0","outline":"none","color":"#fff","borderRadius":"4px","background":"#34bfa3","width":"auto","lineHeight":"36px","fontSize":"14px","height":"36px"}' type="text" size="small" @click="download($base.url+ruleForm.zhidaoshipin)">预览</el-button>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else-if="!ruleForm.zhidaoshipin" label="指导视频" prop="zhidaoshipin">
					<el-button :style='{"border":"0px solid #e5e9ec","cursor":"pointer","padding":"0 30px","margin":"0 20px 0 0","outline":"none","color":"#fff","borderRadius":"4px","background":"#34bfa3","width":"auto","lineHeight":"36px","fontSize":"14px","height":"36px"}' type="text" size="small">无</el-button>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="专家账号" prop="zhuanjiazhanghao">
					<el-input v-model="ruleForm.zhuanjiazhanghao" placeholder="专家账号" clearable  :readonly="ro.zhuanjiazhanghao"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="专家账号" prop="zhuanjiazhanghao">
					<el-input v-model="ruleForm.zhuanjiazhanghao" placeholder="专家账号" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-if="type!='info'"  label="专家姓名" prop="zhuanjiaxingming">
					<el-input v-model="ruleForm.zhuanjiaxingming" placeholder="专家姓名" clearable  :readonly="ro.zhuanjiaxingming"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else class="input" label="专家姓名" prop="zhuanjiaxingming">
					<el-input v-model="ruleForm.zhuanjiaxingming" placeholder="专家姓名" readonly></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="date" v-if="type!='info'" label="指导时间" prop="zhidaoshijian">
					<el-date-picker
						value-format="yyyy-MM-dd HH:mm:ss"
						v-model="ruleForm.zhidaoshijian" 
						type="datetime"
						:readonly="ro.zhidaoshijian"
						placeholder="指导时间"
					></el-date-picker>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="input" v-else-if="ruleForm.zhidaoshijian" label="指导时间" prop="zhidaoshijian">
					<el-input v-model="ruleForm.zhidaoshijian" placeholder="指导时间" readonly></el-input>
				</el-form-item>
			</template>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="textarea" v-if="type!='info'" label="病虫害发生" prop="bingchonghaifasheng">
					<el-input
					  style="min-width: 200px; max-width: 600px;"
					  type="textarea"
					  :rows="8"
					  placeholder="病虫害发生"
					  v-model="ruleForm.bingchonghaifasheng" >
					</el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else-if="ruleForm.bingchonghaifasheng" label="病虫害发生" prop="bingchonghaifasheng">
					<span :style='{"fontSize":"14px","lineHeight":"40px","color":"inherit","fontWeight":"500","display":"inline-block"}'>{{ruleForm.bingchonghaifasheng}}</span>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="textarea" v-if="type!='info'" label="施肥记录" prop="shifeijilu">
					<el-input
					  style="min-width: 200px; max-width: 600px;"
					  type="textarea"
					  :rows="8"
					  placeholder="施肥记录"
					  v-model="ruleForm.shifeijilu" >
					</el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else-if="ruleForm.shifeijilu" label="施肥记录" prop="shifeijilu">
					<span :style='{"fontSize":"14px","lineHeight":"40px","color":"inherit","fontWeight":"500","display":"inline-block"}'>{{ruleForm.shifeijilu}}</span>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' class="textarea" v-if="type!='info'" label="灌溉记录" prop="guangaijilu">
					<el-input
					  style="min-width: 200px; max-width: 600px;"
					  type="textarea"
					  :rows="8"
					  placeholder="灌溉记录"
					  v-model="ruleForm.guangaijilu" >
					</el-input>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else-if="ruleForm.guangaijilu" label="灌溉记录" prop="guangaijilu">
					<span :style='{"fontSize":"14px","lineHeight":"40px","color":"inherit","fontWeight":"500","display":"inline-block"}'>{{ruleForm.guangaijilu}}</span>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-if="type!='info'"  label="评估详情" prop="pingguxiangqing">
					<editor 
						style="min-width: 200px; max-width: 600px;"
						v-model="ruleForm.pingguxiangqing" 
						class="editor" 
						action="file/upload">
					</editor>
				</el-form-item>
				<el-form-item :style='{"width":"100%","margin":"0 0 30px 0","fontSize":"inherit","color":"inherit"}' v-else-if="ruleForm.pingguxiangqing" label="评估详情" prop="pingguxiangqing">
                    <span :style='{"fontSize":"14px","lineHeight":"40px","color":"inherit","fontWeight":"500","display":"inline-block"}' v-html="ruleForm.pingguxiangqing"></span>
                </el-form-item>
			<el-form-item :style='{"padding":"0","margin":"30px 0","alignItems":"center","textAlign":"center","display":"flex","width":"100%","perspective":"320px","-webkitPerspective":"320px","fontSize":"48px","justifyContent":"center"}' class="btn">
				<el-button class="btn3"  v-if="type!='info'" type="success" @click="onSubmit">
					<span class="icon iconfont icon-tijiao16" :style='{"margin":"0 2px","fontSize":"18px","color":"inherit","display":"none"}'></span>
					提交
				</el-button>
				<el-button class="btn4" v-if="type!='info'" type="success" @click="back()">
					<span class="icon iconfont icon-quxiao09" :style='{"margin":"0 2px","fontSize":"18px","color":"inherit","display":"none"}'></span>
					取消
				</el-button>
				<el-button class="btn5" v-if="type=='info'" type="success" @click="back()">
					<span class="icon iconfont icon-fanhui01" :style='{"margin":"0 2px","fontSize":"18px","color":"inherit","display":"none"}'></span>
					返回
				</el-button>
			</el-form-item>
		</el-form>
    

  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isPhone, isMobile,isURL,checkIdCard } from "@/utils/validate";
export default {
	data() {
		let self = this
		var validateIdCard = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!checkIdCard(value)) {
				callback(new Error("请输入正确的身份证号码"));
			} else {
				callback();
			}
		};
		var validateUrl = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isURL(value)) {
				callback(new Error("请输入正确的URL地址"));
			} else {
				callback();
			}
		};
		var validateMobile = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isMobile(value)) {
				callback(new Error("请输入正确的手机号码"));
			} else {
				callback();
			}
		};
		var validatePhone = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isPhone(value)) {
				callback(new Error("请输入正确的电话号码"));
			} else {
				callback();
			}
		};
		var validateEmail = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isEmail(value)) {
				callback(new Error("请输入正确的邮箱地址"));
			} else {
				callback();
			}
		};
		var validateNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isNumber(value)) {
				callback(new Error("请输入数字"));
			} else {
				callback();
			}
		};
		var validateIntNumber = (rule, value, callback) => {
			if(!value){
				callback();
			} else if (!isIntNumer(value)) {
				callback(new Error("请输入整数"));
			} else {
				callback();
			}
		};
		return {
			id: '',
			type: '',
			
			
			ro:{
				guoshumingcheng : false,
				guoshuleixing : false,
				guoshutupian : false,
				shengzhangjieduan : false,
				guoshugaodu : false,
				bingchonghaifasheng : false,
				shifeijilu : false,
				guangaijilu : false,
				nongchangzhanghao : false,
				fuzeren : false,
				fabushijian : false,
				pingguxiangqing : false,
				jianyineirong : false,
				zhidaoshipin : false,
				zhuanjiazhanghao : false,
				zhuanjiaxingming : false,
				zhidaoshijian : false,
			},
			
			
			ruleForm: {
				guoshumingcheng: '',
				guoshuleixing: '',
				guoshutupian: '',
				shengzhangjieduan: '',
				guoshugaodu: '',
				bingchonghaifasheng: '',
				shifeijilu: '',
				guangaijilu: '',
				nongchangzhanghao: '',
				fuzeren: '',
				fabushijian: '',
				pingguxiangqing: '',
				jianyineirong: '',
				zhidaoshipin: '',
				zhuanjiazhanghao: '',
				zhuanjiaxingming: '',
				zhidaoshijian: '',
			},
		
			shengzhangjieduanOptions: [],

			
			rules: {
				guoshumingcheng: [
				],
				guoshuleixing: [
				],
				guoshutupian: [
				],
				shengzhangjieduan: [
				],
				guoshugaodu: [
				],
				bingchonghaifasheng: [
				],
				shifeijilu: [
				],
				guangaijilu: [
				],
				nongchangzhanghao: [
				],
				fuzeren: [
				],
				fabushijian: [
				],
				pingguxiangqing: [
				],
				jianyineirong: [
				],
				zhidaoshipin: [
				],
				zhuanjiazhanghao: [
				],
				zhuanjiaxingming: [
				],
				zhidaoshijian: [
				],
			}
		};
	},
	props: ["parent"],
	computed: {



	},
    components: {
    },
	created() {
		this.ruleForm.fabushijian = this.getCurDateTime()
		this.ruleForm.zhidaoshijian = this.getCurDateTime()
	},
	methods: {
		
		// 下载
		download(file){
			window.open(`${file}`)
		},
		// 初始化
		init(id,type) {
			if (id) {
				this.id = id;
				this.type = type;
			}
			if(this.type=='info'||this.type=='else'){
				this.info(id);
			}else if(this.type=='logistics'){
				this.logistics=false;
				this.info(id);
			}else if(this.type=='cross'){
				var obj = this.$storage.getObj('crossObj');
				for (var o in obj){
						if(o=='guoshumingcheng'){
							this.ruleForm.guoshumingcheng = obj[o];
							this.ro.guoshumingcheng = true;
							continue;
						}
						if(o=='guoshuleixing'){
							this.ruleForm.guoshuleixing = obj[o];
							this.ro.guoshuleixing = true;
							continue;
						}
						if(o=='guoshutupian'){
							this.ruleForm.guoshutupian = obj[o];
							this.ro.guoshutupian = true;
							continue;
						}
						if(o=='shengzhangjieduan'){
							this.ruleForm.shengzhangjieduan = obj[o];
							this.ro.shengzhangjieduan = true;
							continue;
						}
						if(o=='guoshugaodu'){
							this.ruleForm.guoshugaodu = obj[o];
							this.ro.guoshugaodu = true;
							continue;
						}
						if(o=='bingchonghaifasheng'){
							this.ruleForm.bingchonghaifasheng = obj[o];
							this.ro.bingchonghaifasheng = true;
							continue;
						}
						if(o=='shifeijilu'){
							this.ruleForm.shifeijilu = obj[o];
							this.ro.shifeijilu = true;
							continue;
						}
						if(o=='guangaijilu'){
							this.ruleForm.guangaijilu = obj[o];
							this.ro.guangaijilu = true;
							continue;
						}
						if(o=='nongchangzhanghao'){
							this.ruleForm.nongchangzhanghao = obj[o];
							this.ro.nongchangzhanghao = true;
							continue;
						}
						if(o=='fuzeren'){
							this.ruleForm.fuzeren = obj[o];
							this.ro.fuzeren = true;
							continue;
						}
						if(o=='fabushijian'){
							this.ruleForm.fabushijian = obj[o];
							this.ro.fabushijian = true;
							continue;
						}
						if(o=='pingguxiangqing'){
							this.ruleForm.pingguxiangqing = obj[o];
							this.ro.pingguxiangqing = true;
							continue;
						}
						if(o=='jianyineirong'){
							this.ruleForm.jianyineirong = obj[o];
							this.ro.jianyineirong = true;
							continue;
						}
						if(o=='zhidaoshipin'){
							this.ruleForm.zhidaoshipin = obj[o];
							this.ro.zhidaoshipin = true;
							continue;
						}
						if(o=='zhuanjiazhanghao'){
							this.ruleForm.zhuanjiazhanghao = obj[o];
							this.ro.zhuanjiazhanghao = true;
							continue;
						}
						if(o=='zhuanjiaxingming'){
							this.ruleForm.zhuanjiaxingming = obj[o];
							this.ro.zhuanjiaxingming = true;
							continue;
						}
						if(o=='zhidaoshijian'){
							this.ruleForm.zhidaoshijian = obj[o];
							this.ro.zhidaoshijian = true;
							continue;
						}
				}
				

















			}
			
			// 获取用户信息
			this.$http({
				url: `${this.$storage.get('sessionTable')}/session`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code === 0) {
					
					var json = data.data;
					if(((json.zhuanjiazhanghao!=''&&json.zhuanjiazhanghao) || json.zhuanjiazhanghao==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.zhuanjiazhanghao = json.zhuanjiazhanghao
						this.ro.zhuanjiazhanghao = true;
					}
					if(((json.zhuanjiaxingming!=''&&json.zhuanjiaxingming) || json.zhuanjiaxingming==0) && this.$storage.get("role")!="管理员"){
						this.ruleForm.zhuanjiaxingming = json.zhuanjiaxingming
						this.ro.zhuanjiaxingming = true;
					}
				} else {
					this.$message.error(data.msg);
				}
			});
			
            this.shengzhangjieduanOptions = "苗期,生长期,开花期,结果期".split(',')
			
		},
    // 多级联动参数

    info(id) {
      this.$http({
        url: `zhongzhipinggu/info/${id}`,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
        this.ruleForm = data.data;
        //解决前台上传图片后台不显示的问题
        let reg=new RegExp('../../../upload','g')//g代表全部
        this.ruleForm.pingguxiangqing = this.ruleForm.pingguxiangqing.replace(reg,'../../../springbootvij64xig/upload');
        } else {
          this.$message.error(data.msg);
        }
      });
    },


    // 提交
    onSubmit() {



	if(this.ruleForm.guoshutupian!=null) {
		this.ruleForm.guoshutupian = this.ruleForm.guoshutupian.replace(new RegExp(this.$base.url,"g"),"");
	}










	if(this.ruleForm.jianyineirong!=null) {
		this.ruleForm.jianyineirong = this.ruleForm.jianyineirong.replace(new RegExp(this.$base.url,"g"),"");
	}

	if(this.ruleForm.zhidaoshipin!=null) {
		this.ruleForm.zhidaoshipin = this.ruleForm.zhidaoshipin.replace(new RegExp(this.$base.url,"g"),"");
	}




var objcross = this.$storage.getObj('crossObj');
      //更新跨表属性
       var crossuserid;
       var crossrefid;
       var crossoptnum;
       if(this.type=='cross'){
                var statusColumnName = this.$storage.get('statusColumnName');
                var statusColumnValue = this.$storage.get('statusColumnValue');
                if(statusColumnName!='') {
                        var obj = this.$storage.getObj('crossObj');
                       if(statusColumnName && !statusColumnName.startsWith("[")) {
                               for (var o in obj){
                                 if(o==statusColumnName){
                                   obj[o] = statusColumnValue;
                                 }
                               }
                               var table = this.$storage.get('crossTable');
                             this.$http({
                                 url: `${table}/update`,
                                 method: "post",
                                 data: obj
                               }).then(({ data }) => {});
                       } else {
                               crossuserid=this.$storage.get('userid');
                               crossrefid=obj['id'];
                               crossoptnum=this.$storage.get('statusColumnName');
                               crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                        }
                }
        }
		this.$refs["ruleForm"].validate(valid => {
			if (valid) {
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid = crossuserid;
					this.ruleForm.crossrefid = crossrefid;
					let params = { 
						page: 1, 
						limit: 10, 
						crossuserid:this.ruleForm.crossuserid,
						crossrefid:this.ruleForm.crossrefid,
					} 
				this.$http({ 
					url: "zhongzhipinggu/page", 
					method: "get", 
					params: params 
				}).then(({ 
					data 
				}) => { 
					if (data && data.code === 0) { 
						if(data.data.total>=crossoptnum) {
							this.$message.error(this.$storage.get('tips'));
							return false;
						} else {
							this.$http({
								url: `zhongzhipinggu/${!this.ruleForm.id ? "save" : "update"}`,
								method: "post",
								data: this.ruleForm
							}).then(({ data }) => {
								if (data && data.code === 0) {
									this.$message({
										message: "操作成功",
										type: "success",
										duration: 1500,
										onClose: () => {
											this.parent.showFlag = true;
											this.parent.addOrUpdateFlag = false;
											this.parent.zhongzhipingguCrossAddOrUpdateFlag = false;
											this.parent.search();
											this.parent.contentStyleChange();
										}
									});
								} else {
									this.$message.error(data.msg);
								}
							});

						}
					} else { 
				} 
			});
		} else {
			this.$http({
				url: `zhongzhipinggu/${!this.ruleForm.id ? "save" : "update"}`,
				method: "post",
			   data: this.ruleForm
			}).then(({ data }) => {
				if (data && data.code === 0) {
					this.$message({
						message: "操作成功",
						type: "success",
						duration: 1500,
						onClose: () => {
							this.parent.showFlag = true;
							this.parent.addOrUpdateFlag = false;
							this.parent.zhongzhipingguCrossAddOrUpdateFlag = false;
							this.parent.search();
							this.parent.contentStyleChange();
						}
					});
				} else {
					this.$message.error(data.msg);
			   }
			});
		 }
         }
       });
    },
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    // 返回
    back() {
      this.parent.showFlag = true;
      this.parent.addOrUpdateFlag = false;
      this.parent.zhongzhipingguCrossAddOrUpdateFlag = false;
      this.parent.contentStyleChange();
    },
    guoshutupianUploadChange(fileUrls) {
	    this.ruleForm.guoshutupian = fileUrls;
    },
    jianyineirongUploadChange(fileUrls) {
	    this.ruleForm.jianyineirong = fileUrls;
    },
    zhidaoshipinUploadChange(fileUrls) {
	    this.ruleForm.zhidaoshipin = fileUrls;
    },
  }
};
</script>
<style lang="scss" scoped>
	.amap-wrapper {
		width: 100%;
		height: 500px;
	}
	
	.search-box {
		position: absolute;
	}
	
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  	  padding: 0 10px 0 0;
	  	  color: inherit;
	  	  font-weight: 500;
	  	  display: inline-block;
	  	  width: 150px;
	  	  font-size: inherit;
	  	  line-height: 40px;
	  	  text-align: right;
	  	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 150px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  	  border: 1px solid #e5e9ec;
	  	  border-radius: 4px;
	  	  padding: 0 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: #fff;
	  	  width: auto;
	  	  font-size: 14px;
	  	  min-width: 350px;
	  	  height: 39px;
	  	}
	.add-update-preview .el-input-number /deep/ .el-input__inner {
		text-align: left;
	  	  border: 1px solid #e5e9ec;
	  	  border-radius: 4px;
	  	  padding: 0 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: #fff;
	  	  width: auto;
	  	  font-size: 14px;
	  	  min-width: 350px;
	  	  height: 39px;
	  	}
	.add-update-preview .el-input-number /deep/ .el-input-number__decrease {
		display: none;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__increase {
		display: none;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  	  border: 1px solid #e5e9ec;
	  	  border-radius: 4px;
	  	  padding: 0 10px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: #fff;
	  	  width: auto;
	  	  font-size: 14px;
	  	  height: 39px;
	  	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  	  border: 1px solid #e5e9ec;
	  	  border-radius: 4px;
	  	  padding: 0 10px 0 30px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: #fff;
	  	  width: auto;
	  	  font-size: 14px;
	  	  height: 39px;
	  	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  	  border: 1px solid #e5e9ec;
	  	  cursor: pointer;
	  	  border-radius: 4px;
	  	  color: #ccd9e2;
	  	  background: #fff;
	  	  object-fit: cover;
	  	  width: 180px;
	  	  font-size: 32px;
	  	  line-height: 80px;
	  	  text-align: center;
	  	  height: 80px;
	  	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  	  border: 1px solid #e5e9ec;
	  	  cursor: pointer;
	  	  border-radius: 4px;
	  	  color: #ccd9e2;
	  	  background: #fff;
	  	  object-fit: cover;
	  	  width: 180px;
	  	  font-size: 32px;
	  	  line-height: 80px;
	  	  text-align: center;
	  	  height: 80px;
	  	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  	  border: 1px solid #e5e9ec;
	  	  cursor: pointer;
	  	  border-radius: 4px;
	  	  color: #ccd9e2;
	  	  background: #fff;
	  	  object-fit: cover;
	  	  width: 180px;
	  	  font-size: 32px;
	  	  line-height: 80px;
	  	  text-align: center;
	  	  height: 80px;
	  	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  	  border: 1px solid #e5e9ec;
	  	  border-radius: 4px;
	  	  padding: 12px;
	  	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  	  outline: none;
	  	  color: inherit;
	  	  background: #fff;
	  	  width: 550px;
	  	  font-size: 14px;
	  	  height: 150px;
	  	}
	
	.add-update-preview .btn .btn1 {
				border: 0px solid rgba(126, 96, 16, .2);
				cursor: pointer;
				padding: 0 20px;
				margin: 0px 4px;
				color: #fff;
				display: inline-block;
				font-size: 14px;
				line-height: 24px;
				border-radius: 4px;
				outline: none;
				background: #a768f3;
				width: auto;
				height: 36px;
			}
	
	.add-update-preview .btn .btn1:hover {
				transform: scale(0.9) translate3d(0px, -10px, 0px);
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn2 {
				border: 0px solid rgba(126, 96, 16, .2);
				cursor: pointer;
				border-radius: 4px;
				padding: 0 20px;
				margin: 0px 4px;
				outline: none;
				color: #fff;
				background: #34bfa3;
				width: auto;
				font-size: 14px;
				line-height: 24px;
				height: 36px;
			}
	
	.add-update-preview .btn .btn2:hover {
				transform: scale(0.9) translate3d(0px, -10px, 0px);
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn3 {
				border: 0px solid rgba(126, 96, 16, .2);
				cursor: pointer;
				border-radius: 4px;
				padding: 0 20px;
				margin: 0px 4px;
				outline: none;
				color: #fff;
				background: #2bb3c0;
				width: auto;
				font-size: 14px;
				line-height: 24px;
				height: 36px;
			}
	
	.add-update-preview .btn .btn3:hover {
				transform: scale(0.9) translate3d(0px, -10px, 0px);
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn4 {
				border: 0px solid rgba(126, 96, 16, .2);
				cursor: pointer;
				border-radius: 4px;
				padding: 0 20px;
				margin: 0px 4px;
				outline: none;
				color: #fff;
				background: #ff518a;
				width: auto;
				font-size: 14px;
				line-height: 24px;
				height: 36px;
			}
	
	.add-update-preview .btn .btn4:hover {
				transform: scale(0.9) translate3d(0px, -10px, 0px);
				opacity: 0.8;
			}
	
	.add-update-preview .btn .btn5 {
				border: 0px solid rgba(126, 96, 16, .2);
				cursor: pointer;
				border-radius: 4px;
				padding: 0 20px;
				margin: 4px;
				outline: none;
				color: #fff;
				background: #6c757d;
				width: auto;
				font-size: 14px;
				line-height: 24px;
				height: 36px;
			}
	
	.add-update-preview .btn .btn5:hover {
				transform: scale(0.9) translate3d(0px, -10px, 0px);
				opacity: 0.8;
			}
</style>
