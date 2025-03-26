<template>
<div :style='{"width":"100%","padding":"30px 7% 40px","margin":"0px auto","position":"relative","background":"#fff"}'>
    <el-form
	  :style='{"border":"1px solid #eee","width":"100%","padding":"30px","position":"relative","background":"#fcfcfc"}'
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="180px"
    >
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="果树名称" prop="guoshumingcheng">
            <el-input v-model="ruleForm.guoshumingcheng" 
                placeholder="果树名称" clearable :disabled=" false  ||ro.guoshumingcheng"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="果树类型" prop="guoshuleixing">
            <el-input v-model="ruleForm.guoshuleixing" 
                placeholder="果树类型" clearable :disabled=" false  ||ro.guoshuleixing"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="适宜温度" prop="shiyiwendu">
            <el-input v-model="ruleForm.shiyiwendu" 
                placeholder="适宜温度" clearable :disabled=" false  ||ro.shiyiwendu"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="适宜湿度" prop="shiyishidu">
            <el-input v-model="ruleForm.shiyishidu" 
                placeholder="适宜湿度" clearable :disabled=" false  ||ro.shiyishidu"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="果树图片" v-if="type!='cross' || (type=='cross' && !ro.guoshutupian)" prop="guoshutupian">
            <file-upload
            tip="点击上传果树图片"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.guoshutupian?ruleForm.guoshutupian:''"
            @change="guoshutupianUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' class="upload" v-else label="果树图片" prop="guoshutupian">
                <img v-if="ruleForm.guoshutupian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.guoshutupian.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.guoshutupian.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="咨询时间" prop="zixunshijian">
              <el-date-picker
				  :disabled=" false  ||ro.zixunshijian"
                  value-format="yyyy-MM-dd HH:mm:ss"
                  v-model="ruleForm.zixunshijian" 
                  type="datetime"
                  placeholder="咨询时间">
              </el-date-picker>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="农场账号" prop="nongchangzhanghao">
            <el-input v-model="ruleForm.nongchangzhanghao" 
                placeholder="农场账号" clearable :disabled=" false  ||ro.nongchangzhanghao"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="负责人" prop="fuzeren">
            <el-input v-model="ruleForm.fuzeren" 
                placeholder="负责人" clearable :disabled=" false  ||ro.fuzeren"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="专家账号" prop="zhuanjiazhanghao">
            <el-input v-model="ruleForm.zhuanjiazhanghao" 
                placeholder="专家账号" clearable :disabled=" false  ||ro.zhuanjiazhanghao"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="专家姓名" prop="zhuanjiaxingming">
            <el-input v-model="ruleForm.zhuanjiaxingming" 
                placeholder="专家姓名" clearable :disabled=" false  ||ro.zhuanjiaxingming"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="适宜土壤" prop="shiyiturang">
            <el-input
              type="textarea"
              :rows="8"
              placeholder="适宜土壤"
              v-model="ruleForm.shiyiturang">
            </el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="灌溉方式" prop="guangaifangshi">
            <el-input
              type="textarea"
              :rows="8"
              placeholder="灌溉方式"
              v-model="ruleForm.guangaifangshi">
            </el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="种植详情" prop="zhongzhixiangqing">
            <editor 
                :style='{"minHeight":"250px","padding":"0","boxShadow":"0 0 0px rgba(75,223,201,.5)","margin":"0","borderColor":"#eee","backgroundColor":"#fff","borderRadius":"0","borderWidth":"1px","width":"100%","borderStyle":"solid","height":"auto"}'
                v-model="ruleForm.zhongzhixiangqing" 
                class="editor" 
                action="file/upload">
            </editor>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="咨询内容" prop="zixunneirong">
            <editor 
                :style='{"minHeight":"250px","padding":"0","boxShadow":"0 0 0px rgba(75,223,201,.5)","margin":"0","borderColor":"#eee","backgroundColor":"#fff","borderRadius":"0","borderWidth":"1px","width":"100%","borderStyle":"solid","height":"auto"}'
                v-model="ruleForm.zixunneirong" 
                class="editor" 
                action="file/upload">
            </editor>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="建议内容" prop="jianyineirong">
            <editor 
                :style='{"minHeight":"250px","padding":"0","boxShadow":"0 0 0px rgba(75,223,201,.5)","margin":"0","borderColor":"#eee","backgroundColor":"#fff","borderRadius":"0","borderWidth":"1px","width":"100%","borderStyle":"solid","height":"auto"}'
                v-model="ruleForm.jianyineirong" 
                class="editor" 
                action="file/upload">
            </editor>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px","background":"none"}' label="知识普及" prop="zhishipuji">
            <editor 
                :style='{"minHeight":"250px","padding":"0","boxShadow":"0 0 0px rgba(75,223,201,.5)","margin":"0","borderColor":"#eee","backgroundColor":"#fff","borderRadius":"0","borderWidth":"1px","width":"100%","borderStyle":"solid","height":"auto"}'
                v-model="ruleForm.zhishipuji" 
                class="editor" 
                action="file/upload">
            </editor>
          </el-form-item>

      <el-form-item :style='{"padding":"0","margin":"0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"4px","background":"#F5BB00","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"0px solid rgba(64, 158, 255, 1)","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#fff","borderRadius":"4px","background":"#333","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
	  let self = this
      return {
        id: '',
        baseUrl: '',
        ro:{
				guoshumingcheng : false,
				guoshuleixing : false,
				shiyiwendu : false,
				shiyishidu : false,
				zhongzhixiangqing : false,
				shiyiturang : false,
				guangaifangshi : false,
				guoshutupian : false,
				zixunneirong : false,
				zixunshijian : false,
				nongchangzhanghao : false,
				fuzeren : false,
				zhuanjiazhanghao : false,
				zhuanjiaxingming : false,
				jianyineirong : false,
				zhishipuji : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          guoshumingcheng: '',
          guoshuleixing: '',
          shiyiwendu: '',
          shiyishidu: '',
          zhongzhixiangqing: '',
          shiyiturang: '',
          guangaifangshi: '',
          guoshutupian: '',
          zixunneirong: '',
          zixunshijian: '',
          nongchangzhanghao: '',
          fuzeren: '',
          zhuanjiazhanghao: '',
          zhuanjiaxingming: '',
          jianyineirong: '',
          zhishipuji: '',
        },


        rules: {
          guoshumingcheng: [
            { required: true, message: '果树名称不能为空', trigger: 'blur' },
          ],
          guoshuleixing: [
          ],
          shiyiwendu: [
          ],
          shiyishidu: [
          ],
          zhongzhixiangqing: [
          ],
          shiyiturang: [
          ],
          guangaifangshi: [
          ],
          guoshutupian: [
          ],
          zixunneirong: [
          ],
          zixunshijian: [
          ],
          nongchangzhanghao: [
          ],
          fuzeren: [
          ],
          zhuanjiazhanghao: [
          ],
          zhuanjiaxingming: [
          ],
          jianyineirong: [
          ],
          zhishipuji: [
          ],
        },
		centerType: false,
      };
    },
    computed: {



    },
    components: {
    },
    created() {
		if(this.$route.query.centerType){
			this.centerType = true
		}
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.baseUrl = this.$config.baseUrl;
      this.ruleForm.zixunshijian = this.getCurDateTime()
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
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
            if(o=='shiyiwendu'){
              this.ruleForm.shiyiwendu = obj[o];
              this.ro.shiyiwendu = true;
              continue;
            }
            if(o=='shiyishidu'){
              this.ruleForm.shiyishidu = obj[o];
              this.ro.shiyishidu = true;
              continue;
            }
            if(o=='zhongzhixiangqing'){
              this.ruleForm.zhongzhixiangqing = obj[o];
              this.ro.zhongzhixiangqing = true;
              continue;
            }
            if(o=='shiyiturang'){
              this.ruleForm.shiyiturang = obj[o];
              this.ro.shiyiturang = true;
              continue;
            }
            if(o=='guangaifangshi'){
              this.ruleForm.guangaifangshi = obj[o];
              this.ro.guangaifangshi = true;
              continue;
            }
            if(o=='guoshutupian'){
              this.ruleForm.guoshutupian = obj[o].split(",")[0];
              this.ro.guoshutupian = true;
              continue;
            }
            if(o=='zixunneirong'){
              this.ruleForm.zixunneirong = obj[o];
              this.ro.zixunneirong = true;
              continue;
            }
            if(o=='zixunshijian'){
              this.ruleForm.zixunshijian = obj[o];
              this.ro.zixunshijian = true;
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
            if(o=='jianyineirong'){
              this.ruleForm.jianyineirong = obj[o];
              this.ro.jianyineirong = true;
              continue;
            }
            if(o=='zhishipuji'){
              this.ruleForm.zhishipuji = obj[o];
              this.ro.zhishipuji = true;
              continue;
            }
          }
        }else if(type=='edit'){
			this.info()
		}
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
            if((json.zhuanjiazhanghao!=''&&json.zhuanjiazhanghao) || json.zhuanjiazhanghao==0){
                this.ruleForm.zhuanjiazhanghao = json.zhuanjiazhanghao
            }
            if((json.zhuanjiaxingming!=''&&json.zhuanjiaxingming) || json.zhuanjiaxingming==0){
                this.ruleForm.zhuanjiaxingming = json.zhuanjiaxingming
            }
          }
        });

		if (localStorage.getItem('raffleType') && localStorage.getItem('raffleType') != null) {
			localStorage.removeItem('raffleType')
			setTimeout(() => {
				this.onSubmit()
			}, 300)
		}
      },

    // 多级联动参数
      // 多级联动参数
      info() {
        this.$http.get(`huidawenti/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

			//更新跨表属性
			var crossuserid;
			var crossrefid;
			var crossoptnum;
			this.$refs["ruleForm"].validate(valid => {
				if(valid) {
					if(this.type=='cross'){
						var statusColumnName = localStorage.getItem('statusColumnName');
						var statusColumnValue = localStorage.getItem('statusColumnValue');
						if(statusColumnName && statusColumnName!='') {
							var obj = JSON.parse(localStorage.getItem('crossObj'));
							if(!statusColumnName.startsWith("[")) {
								for (var o in obj){
									if(o==statusColumnName){
										obj[o] = statusColumnValue;
									}
								}
								var table = localStorage.getItem('crossTable');
								this.$http.post(table+'/update', obj).then(res => {});
							} else {
								crossuserid=Number(localStorage.getItem('frontUserid'));
								crossrefid=obj['id'];
								crossoptnum=localStorage.getItem('statusColumnName');
								crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
							}
						}
					}
					if(crossrefid && crossuserid) {
						this.ruleForm.crossuserid=crossuserid;
						this.ruleForm.crossrefid=crossrefid;
						var params = {
							page: 1,
							limit: 10,
							crossuserid:crossuserid,
							crossrefid:crossrefid,
						}
						this.$http.get('huidawenti/list', {
							params: params
						}).then(res => {
							if(res.data.data.total>=crossoptnum) {
								this.$message({
									message: localStorage.getItem('tips'),
									type: 'error',
									duration: 1500,
								});
								return false;
							} else {
								// 跨表计算


								this.$http.post(`huidawenti/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
									if (res.data.code == 0) {
										this.$message({
											message: '操作成功',
											type: 'success',
											duration: 1500,
											onClose: () => {
												this.$router.go(-1);
											}
										});
									} else {
										this.$message({
											message: res.data.msg,
											type: 'error',
											duration: 1500
										});
									}
								});
							}
						});
					} else {


						this.$http.post(`huidawenti/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
							if (res.data.code == 0) {
								this.$message({
									message: '操作成功',
									type: 'success',
									duration: 1500,
									onClose: () => {
										this.$router.go(-1);
									}
								});
							} else {
								this.$message({
									message: res.data.msg,
									type: 'error',
									duration: 1500
								});
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
			this.$router.go(-1);
		},
      guoshutupianUploadChange(fileUrls) {
          this.ruleForm.guoshutupian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #666;
	  font-weight: 500;
	  width: 180px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 180px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  border: 1px solid #ddd;
	  border-radius: 4px;
	  padding: 0 12px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  color: #666;
	  background: #fff;
	  width: 400px;
	  font-size: 14px;
	  height: 40px;
	}
	.add-update-preview .el-input-number /deep/ .el-input__inner {
		text-align: left;
	  border: 1px solid #ddd;
	  border-radius: 4px;
	  padding: 0 12px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  color: #666;
	  background: #fff;
	  width: 400px;
	  font-size: 14px;
	  height: 40px;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__decrease {
		display: none;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__increase {
		display: none;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border: 1px solid #ddd;
	  border-radius: 4px;
	  padding: 0 10px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  color: #666;
	  background: #fff;
	  width: 200px;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border: 1px solid #ddd;
	  border-radius: 4px;
	  padding: 0 10px 0 30px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  color: #666;
	  background: #fff;
	  width: 200px;
	  font-size: 14px;
	  height: 40px;
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
	  border: 1px solid #ddd;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #999;
	  background: #fff;
	  width: 200px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  border: 1px solid #ddd;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #999;
	  background: #fff;
	  width: 200px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  border: 1px solid #ddd;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #999;
	  background: #fff;
	  width: 200px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 1px solid #ddd;
	  border-radius: 4px;
	  padding: 12px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  color: #666;
	  background: #fff;
	  width: 400px;
	  font-size: 14px;
	  height: 120px;
	}
</style>
