<template>
	<div>

	<div class="container" :style='{"minHeight":"100vh","alignItems":"center","background":"url(http://codegen.caihongy.cn/20230918/e4c3de45e8454be08468ba32acc9108f.jpg)","display":"flex","width":"100%","backgroundSize":"cover","backgroundPosition":"center center","backgroundRepeat":"no-repeat","justifyContent":"center"}'>
		<el-form class='rgs-form' v-if="pageFlag=='register'" :style='{"width":"30vw","padding":"0px","margin":"0 0 0 50vw","borderRadius":"0px","background":"#fff","height":"auto"}' ref="registerForm" :model="registerForm" :rules="rules">
			<div v-if="false" :style='{"width":"100%","margin":"0 0 10px 0","lineHeight":"44px","fontSize":"20px","color":"rgba(64, 158, 255, 1)","textAlign":"center"}'>USER / REGISTER</div>
			<div v-if="true" :style='{"width":"80%","margin":"20px auto 10px","lineHeight":"44px","fontSize":"28px","color":"#333","textAlign":"left"}'>果树的生长信息管理系统注册</p></div>
			<el-form-item :style='{"width":"auto","padding":"0","margin":"0 auto 15px 10%","background":"none","height":"auto"}' v-if="tableName=='nongchangzhu'" prop="nongchangzhanghao">
				<div v-if="true" :style='{"width":"100%","lineHeight":"36px","fontSize":"14px","color":"#333"}' :class="changeRules('nongchangzhanghao')?'required':''">农场账号：</div>
				<el-input v-model="registerForm.nongchangzhanghao"  placeholder="请输入农场账号" />
			</el-form-item>
			<el-form-item :style='{"width":"auto","padding":"0","margin":"0 auto 15px 10%","background":"none","height":"auto"}' v-if="tableName=='nongchangzhu'" prop="fuzeren">
				<div v-if="true" :style='{"width":"100%","lineHeight":"36px","fontSize":"14px","color":"#333"}' :class="changeRules('fuzeren')?'required':''">负责人：</div>
				<el-input v-model="registerForm.fuzeren"  placeholder="请输入负责人" />
			</el-form-item>
			<el-form-item :style='{"width":"auto","padding":"0","margin":"0 auto 15px 10%","background":"none","height":"auto"}' v-if="tableName=='nongchangzhu'" prop="mima">
				<div v-if="true" :style='{"width":"100%","lineHeight":"36px","fontSize":"14px","color":"#333"}' :class="changeRules('mima')?'required':''">密码：</div>
				<el-input v-model="registerForm.mima" type="password" placeholder="请输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"auto","padding":"0","margin":"0 auto 15px 10%","background":"none","height":"auto"}' v-if="tableName=='nongchangzhu'" prop="mima2">
				<div v-if="true" :style='{"width":"100%","lineHeight":"36px","fontSize":"14px","color":"#333"}' :class="changeRules('mima')?'required':''">确认密码：</div>
				<el-input v-model="registerForm.mima2" type="password" placeholder="请再次输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"auto","padding":"0","margin":"0 auto 15px 10%","background":"none","height":"auto"}' v-if="tableName=='nongchangzhu'" prop="xingbie">
				<div v-if="true" :style='{"width":"100%","lineHeight":"36px","fontSize":"14px","color":"#333"}' :class="changeRules('xingbie')?'required':''">性别：</div>
                <el-select v-model="registerForm.xingbie" placeholder="请选择性别" >
                  <el-option
                      v-for="(item,index) in nongchangzhuxingbieOptions"
                      :key="index"
                      :label="item"
                      :value="item">
                  </el-option>
                </el-select>
			</el-form-item>
			<el-form-item :style='{"width":"auto","padding":"0","margin":"0 auto 15px 10%","background":"none","height":"auto"}' v-if="tableName=='nongchangzhu'" prop="touxiang">
				<div v-if="true" :style='{"width":"100%","lineHeight":"36px","fontSize":"14px","color":"#333"}' :class="changeRules('touxiang')?'required':''">头像：</div>
                <file-upload
					tip="点击上传头像"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.touxiang?registerForm.touxiang:''"
					@change="nongchangzhutouxiangUploadChange"
				></file-upload>
			</el-form-item>
			<el-form-item :style='{"width":"auto","padding":"0","margin":"0 auto 15px 10%","background":"none","height":"auto"}' v-if="tableName=='nongchangzhu'" prop="dianhuahaoma">
				<div v-if="true" :style='{"width":"100%","lineHeight":"36px","fontSize":"14px","color":"#333"}' :class="changeRules('dianhuahaoma')?'required':''">电话号码：</div>
				<el-input v-model="registerForm.dianhuahaoma"  placeholder="请输入电话号码" />
			</el-form-item>
			<el-form-item :style='{"width":"auto","padding":"0","margin":"0 auto 15px 10%","background":"none","height":"auto"}' v-if="tableName=='zhuanjia'" prop="zhuanjiazhanghao">
				<div v-if="true" :style='{"width":"100%","lineHeight":"36px","fontSize":"14px","color":"#333"}' :class="changeRules('zhuanjiazhanghao')?'required':''">专家账号：</div>
				<el-input v-model="registerForm.zhuanjiazhanghao"  placeholder="请输入专家账号" />
			</el-form-item>
			<el-form-item :style='{"width":"auto","padding":"0","margin":"0 auto 15px 10%","background":"none","height":"auto"}' v-if="tableName=='zhuanjia'" prop="mima">
				<div v-if="true" :style='{"width":"100%","lineHeight":"36px","fontSize":"14px","color":"#333"}' :class="changeRules('mima')?'required':''">密码：</div>
				<el-input v-model="registerForm.mima" type="password" placeholder="请输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"auto","padding":"0","margin":"0 auto 15px 10%","background":"none","height":"auto"}' v-if="tableName=='zhuanjia'" prop="mima2">
				<div v-if="true" :style='{"width":"100%","lineHeight":"36px","fontSize":"14px","color":"#333"}' :class="changeRules('mima')?'required':''">确认密码：</div>
				<el-input v-model="registerForm.mima2" type="password" placeholder="请再次输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"auto","padding":"0","margin":"0 auto 15px 10%","background":"none","height":"auto"}' v-if="tableName=='zhuanjia'" prop="zhuanjiaxingming">
				<div v-if="true" :style='{"width":"100%","lineHeight":"36px","fontSize":"14px","color":"#333"}' :class="changeRules('zhuanjiaxingming')?'required':''">专家姓名：</div>
				<el-input v-model="registerForm.zhuanjiaxingming"  placeholder="请输入专家姓名" />
			</el-form-item>
			<el-form-item :style='{"width":"auto","padding":"0","margin":"0 auto 15px 10%","background":"none","height":"auto"}' v-if="tableName=='zhuanjia'" prop="touxiang">
				<div v-if="true" :style='{"width":"100%","lineHeight":"36px","fontSize":"14px","color":"#333"}' :class="changeRules('touxiang')?'required':''">头像：</div>
                <file-upload
					tip="点击上传头像"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.touxiang?registerForm.touxiang:''"
					@change="zhuanjiatouxiangUploadChange"
				></file-upload>
			</el-form-item>
			<el-form-item :style='{"width":"auto","padding":"0","margin":"0 auto 15px 10%","background":"none","height":"auto"}' v-if="tableName=='zhuanjia'" prop="xingbie">
				<div v-if="true" :style='{"width":"100%","lineHeight":"36px","fontSize":"14px","color":"#333"}' :class="changeRules('xingbie')?'required':''">性别：</div>
                <el-select v-model="registerForm.xingbie" placeholder="请选择性别" >
                  <el-option
                      v-for="(item,index) in zhuanjiaxingbieOptions"
                      :key="index"
                      :label="item"
                      :value="item">
                  </el-option>
                </el-select>
			</el-form-item>
			<el-form-item :style='{"width":"auto","padding":"0","margin":"0 auto 15px 10%","background":"none","height":"auto"}' v-if="tableName=='zhuanjia'" prop="lianxidianhua">
				<div v-if="true" :style='{"width":"100%","lineHeight":"36px","fontSize":"14px","color":"#333"}' :class="changeRules('lianxidianhua')?'required':''">联系电话：</div>
				<el-input v-model="registerForm.lianxidianhua"  placeholder="请输入联系电话" />
			</el-form-item>
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0 10px","margin":"20px auto 5px 10%","color":"#fff","display":"block","minWidth":"400px","outline":"none","borderRadius":"4px","background":"#ffc000","width":"auto","fontSize":"16px","height":"44px"}' type="primary" @click="submitForm('registerForm')">注册</el-button>
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0 10px","margin":"0px auto 0px 10%","color":"#666","textAlign":"right","display":"block","minWidth":"400px","outline":"none","borderRadius":"8px","background":"none","width":"auto","fontSize":"16px","height":"44px"}' @click="resetForm('registerForm')">重置</el-button>
			<router-link :style='{"cursor":"pointer","padding":"0 10%","margin":"0 0 40px","color":"rgba(159, 159, 159, 1)","display":"inline-block","lineHeight":"1","fontSize":"14px","textDecoration":"none"}' to="/login">已有账户登录</router-link>
			<div class="idea1" :style='{"width":"100%","background":"red","display":"none","height":"40px"}'></div>
			<div class="idea2" :style='{"width":"100%","background":"blue","display":"none","height":"40px"}'></div>
		</el-form>
    </div>
  </div>
</div>
</template>

<script>

export default {
    //数据集合
    data() {
		return {
            pageFlag : '',
			tableName: '',
			registerForm: {},
			forgetForm: {},
			rules: {},
			requiredRules: {},
            nongchangzhuxingbieOptions: [],
            zhuanjiaxingbieOptions: [],
		}
    },
	mounted() {
		if(this.$route.query.pageFlag=='register'){
			
			this.tableName = this.$route.query.role;
			if(this.tableName=='nongchangzhu'){
				this.registerForm = {
					nongchangzhanghao: '',
					fuzeren: '',
					mima: '',
					mima2: '',
					xingbie: '',
					touxiang: '',
					dianhuahaoma: '',
				}
			}
			if(this.tableName=='zhuanjia'){
				this.registerForm = {
					zhuanjiazhanghao: '',
					mima: '',
					mima2: '',
					zhuanjiaxingming: '',
					touxiang: '',
					xingbie: '',
					lianxidianhua: '',
					gerenjianjie: '',
				}
			}
			if ('nongchangzhu' == this.tableName) {
				this.requiredRules.nongchangzhanghao = [{ required: true, message: '请输入农场账号', trigger: 'blur' }]
			}
			if ('nongchangzhu' == this.tableName) {
				this.requiredRules.fuzeren = [{ required: true, message: '请输入负责人', trigger: 'blur' }]
			}
			if ('nongchangzhu' == this.tableName) {
				this.requiredRules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
			}
			if ('zhuanjia' == this.tableName) {
				this.requiredRules.zhuanjiazhanghao = [{ required: true, message: '请输入专家账号', trigger: 'blur' }]
			}
			if ('zhuanjia' == this.tableName) {
				this.requiredRules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
			}
			if ('zhuanjia' == this.tableName) {
				this.requiredRules.zhuanjiaxingming = [{ required: true, message: '请输入专家姓名', trigger: 'blur' }]
			}
		}
	},
    created() {
		this.pageFlag = this.$route.query.pageFlag;
		if(this.$route.query.pageFlag=='register'){
		  if ('nongchangzhu' == this.tableName) {
			this.rules.nongchangzhanghao = [{ required: true, message: '请输入农场账号', trigger: 'blur' }];
		  }
		  if ('nongchangzhu' == this.tableName) {
			this.rules.fuzeren = [{ required: true, message: '请输入负责人', trigger: 'blur' }];
		  }
		  if ('nongchangzhu' == this.tableName) {
			this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }];
		  }
			this.nongchangzhuxingbieOptions = "男,女".split(',');
		  if ('nongchangzhu' == this.tableName) {
			this.rules.dianhuahaoma = [{ required: true, validator: this.$validate.isMobile, trigger: 'blur' }];
		  }
		  if ('zhuanjia' == this.tableName) {
			this.rules.zhuanjiazhanghao = [{ required: true, message: '请输入专家账号', trigger: 'blur' }];
		  }
		  if ('zhuanjia' == this.tableName) {
			this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }];
		  }
		  if ('zhuanjia' == this.tableName) {
			this.rules.zhuanjiaxingming = [{ required: true, message: '请输入专家姓名', trigger: 'blur' }];
		  }
			this.zhuanjiaxingbieOptions = "男,女".split(',');
		  if ('zhuanjia' == this.tableName) {
			this.rules.lianxidianhua = [{ required: true, validator: this.$validate.isMobile, trigger: 'blur' }];
		  }
		}
    },
    //方法集合
    methods: {
		changeRules(name){
			if(this.requiredRules[name]){
				return true
			}
			return false
		},
      // 获取uuid
      getUUID () {
        return new Date().getTime();
      },
        // 下二随
      nongchangzhutouxiangUploadChange(fileUrls) {
          this.registerForm.touxiang = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },
      zhuanjiatouxiangUploadChange(fileUrls) {
          this.registerForm.touxiang = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },

        // 多级联动参数


      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            var url=this.tableName+"/register";
				if((!this.registerForm.nongchangzhanghao) && `nongchangzhu` == this.tableName){
					this.$message.error(`农场账号不能为空`);
					return
				}
				if((!this.registerForm.fuzeren) && `nongchangzhu` == this.tableName){
					this.$message.error(`负责人不能为空`);
					return
				}
               if(`nongchangzhu` == this.tableName && this.registerForm.mima!=this.registerForm.mima2) {
                this.$message.error(`两次密码输入不一致`);
                return
               }
				if((!this.registerForm.mima) && `nongchangzhu` == this.tableName){
					this.$message.error(`密码不能为空`);
					return
				}
					if(`nongchangzhu` == this.tableName && this.registerForm.dianhuahaoma &&(!this.$validate.isMobile2(this.registerForm.dianhuahaoma))){
						this.$message.error(`电话号码应输入手机格式`);
						return
					}
				if((!this.registerForm.zhuanjiazhanghao) && `zhuanjia` == this.tableName){
					this.$message.error(`专家账号不能为空`);
					return
				}
               if(`zhuanjia` == this.tableName && this.registerForm.mima!=this.registerForm.mima2) {
                this.$message.error(`两次密码输入不一致`);
                return
               }
				if((!this.registerForm.mima) && `zhuanjia` == this.tableName){
					this.$message.error(`密码不能为空`);
					return
				}
				if((!this.registerForm.zhuanjiaxingming) && `zhuanjia` == this.tableName){
					this.$message.error(`专家姓名不能为空`);
					return
				}
					if(`zhuanjia` == this.tableName && this.registerForm.lianxidianhua &&(!this.$validate.isMobile2(this.registerForm.lianxidianhua))){
						this.$message.error(`联系电话应输入手机格式`);
						return
					}
            this.$http.post(url, this.registerForm).then(res => {
              if (res.data.code === 0) {
                this.$message({
                  message: '注册成功',
                  type: 'success',
                  duration: 1500,
                  onClose: () => {
                    this.$router.push('/login');
                  }
                });
              } else {
                this.$message.error(res.data.msg);
              }
            });
          } else {
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.container {
		position: relative;
		background: url(http://codegen.caihongy.cn/20230918/e4c3de45e8454be08468ba32acc9108f.jpg);
		
		.el-input {
		  width: auto;
		}
		
		.el-date-editor.el-input {
			width: auto;
		}
		
		.el-form-item /deep/ .el-form-item__content {
						display: block;
						width: 100%;
					}
		
		.rgs-form .el-input /deep/ .el-input__inner {
						border: 1px solid #ddd;
						border-radius: 4px;
						padding: 0 10px;
						outline: none;
						color: #666;
						width: 100%;
						font-size: 14px;
						min-width: 400px;
						height: 40px;
					}
		
		.rgs-form .el-select /deep/ .el-input__inner {
						border: 1px solid #ddd;
						border-radius: 4px;
						padding: 0 10px;
						outline: none;
						color: #666;
						width: 100%;
						font-size: 14px;
						min-width: 400px;
						height: 40px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 1px solid #ddd;
						border-radius: 4px;
						padding: 0 10px 0 30px;
						outline: none;
						color: #666;
						width: 1;
						font-size: 14px;
						min-width: 400px;
						height: 40px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border: 1px solid #ddd;
						border-radius: 4px;
						padding: 0 10px 0 30px;
						outline: none;
						color: #666;
						width: 1;
						font-size: 14px;
						min-width: 400px;
						height: 40px;
					}
		
		.rgs-form /deep/ .el-upload--picture-card {
			background: transparent;
			border: 0;
			border-radius: 0;
			width: auto;
			height: auto;
			line-height: initial;
			vertical-align: middle;
		}
		
		.rgs-form /deep/ .upload .upload-img {
		  		  border: 1px solid #ddd;
		  		  cursor: pointer;
		  		  border-radius: 4px;
		  		  color: #999;
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 80px;
		  		  text-align: center;
		  		  height: 80px;
		  		}
		
		.rgs-form /deep/ .el-upload-list .el-upload-list__item {
		  		  border: 1px solid #ddd;
		  		  cursor: pointer;
		  		  border-radius: 4px;
		  		  color: #999;
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 80px;
		  		  text-align: center;
		  		  height: 80px;
		  		}
		
		.rgs-form /deep/ .el-upload .el-icon-plus {
		  		  border: 1px solid #ddd;
		  		  cursor: pointer;
		  		  border-radius: 4px;
		  		  color: #999;
		  		  width: 160px;
		  		  font-size: 32px;
		  		  line-height: 80px;
		  		  text-align: center;
		  		  height: 80px;
		  		}
	}
	.required {
		position: relative;
	}
	.required::after{
				color: red;
				left: -10px;
				position: absolute;
				content: "*";
			}
</style>
