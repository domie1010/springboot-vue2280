<template>
<div class="home-preview" :style='{"margin":"0px auto","flexWrap":"wrap","flexDirection":"column","background":"none","display":"flex","width":"100%","justifyContent":"center"}'>



		<!-- 关于我们 -->
		<div id="about" class="animate__animated" :style='{"padding":"30px 7%","boxShadow":"0 0px 0px rgba(255, 255, 255, .3)","margin":"0 0 10px","flexWrap":"wrap","background":"#fff","display":"flex","width":"100%","justifyContent":"space-between","height":"auto","order":"2"}'>
		  <div :style='{"margin":"10px 0 0","color":"#F5BB00","textAlign":"center","background":"url(http://codegen.caihongy.cn/20230915/b96d1e15768f4ac495e60a79e04cb731.png) no-repeat center bottom","width":"100%","lineHeight":"56px","fontSize":"32px"}'>{{aboutUsDetail.title}}</div>
		  <div :style='{"width":"100%","margin":"0 0 30px","lineHeight":"1.5","fontSize":"26px","color":"#C5C5C5","textAlign":"center"}'>{{aboutUsDetail.subtitle}}</div>
		  <div :style='{"width":"48%","padding":"0 0px","flexWrap":"wrap","display":"flex","height":"auto"}'>
		    <img :style='{"width":"100%","margin":"0 0px","objectFit":"cover","borderRadius":"6px","display":"block","height":"320px"}' :src="baseUrl + aboutUsDetail.picture1">
		    <img :style='{"margin":"0 10px","objectFit":"cover","flex":1,"display":"none","height":"120px"}' :src="baseUrl + aboutUsDetail.picture2">
		    <img :style='{"margin":"0 10px","objectFit":"cover","flex":1,"display":"none","height":"120px"}' :src="baseUrl + aboutUsDetail.picture3">
		  </div>
		  <div :style='{"padding":"0px","margin":"0 0 10px 0","overflow":"hidden","color":"rgb(102, 102, 102)","background":"none","width":"48%","fontSize":"16px","textIndent":"2em","height":"320px"}' v-html="aboutUsDetail.content"></div>
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"border":"0","cursor":"pointer","margin":"30px auto 0","borderRadius":"6px","textAlign":"center","background":"#F5BB00","display":"block","width":"120px","lineHeight":"36px"}' @click="toDetail('aboutusDetail',aboutUsDetail)">
		    <span :style='{"color":"#f5f5f5","fontSize":"14px"}'>点击查看</span>
		    <span class="icon iconfont icon-gengduo1" :style='{"color":"#f5f5f5","fontSize":"12px"}'></span>
		  </div>
		</div>
		<!-- 关于我们 -->

		<!-- 系统简介 -->
		<div id="system" class="animate__animated" :style='{"padding":"30px 7% 20px","margin":"20px auto 0","flexWrap":"wrap","background":"#f1f1f1","display":"flex","width":"100%","height":"auto","order":"5"}'>
		  <div :style='{"width":"100%","lineHeight":"56px","fontSize":"32px","color":"#F5BB00","textAlign":"center","background":"url(http://codegen.caihongy.cn/20230915/b96d1e15768f4ac495e60a79e04cb731.png) no-repeat center bottom"}'>{{systemIntroductionDetail.title}}</div>
		  <div :style='{"width":"100%","margin":"0 0 30px","lineHeight":"1.5","fontSize":"26px","color":"#C5C5C5","textAlign":"center"}'>{{systemIntroductionDetail.subtitle}}</div>
		  <div :style='{"width":"48%","padding":"0 0px","flexWrap":"wrap","display":"flex","height":"320px","order":"2"}'>
		    <img :style='{"width":"100%","margin":"0 10px","objectFit":"cover","borderRadius":"6px","display":"block","height":"100%"}' :src="baseUrl + systemIntroductionDetail.picture1">
		    <img :style='{"margin":"0 10px","objectFit":"cover","flex":1,"display":"none","height":"120px"}' :src="baseUrl + systemIntroductionDetail.picture2">
		    <img :style='{"margin":"0 10px","objectFit":"cover","flex":1,"display":"none","height":"120px"}' :src="baseUrl + systemIntroductionDetail.picture3">
		  </div>
		  <div :style='{"padding":"0px","margin":"0 0 10px 0","overflow":"hidden","color":"rgb(102, 102, 102)","width":"48%","lineHeight":"24px","fontSize":"16px","textIndent":"2em","height":"320px"}' v-html="systemIntroductionDetail.content"></div>
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"width":"285px","background":"url(http://codegen.caihongy.cn/20201114/7856ba26477849ea828f481fa2773a95.jpg) 0% 0% / cover no-repeat","display":"none","height":"100px"}' />
		  <div :style='{"border":"0","cursor":"pointer","margin":"20px auto","borderRadius":"6px","textAlign":"center","background":"#F5BB00","display":"block","width":"120px","lineHeight":"36px","order":"3"}' @click="toDetail('systemintroDetail',systemIntroductionDetail)">
		    <span :style='{"color":"#f5f5f5","fontSize":"14px"}'>点击查看</span>
		    <span class="icon iconfont icon-gengduo1" :style='{"color":"#f5f5f5","fontSize":"12px"}'></span>
		  </div>
		</div>
		<!-- 系统简介 -->
		
	<!-- 新闻资讯 -->
	<div id="animate_newsnews" class="news animate__animated" :style='{"padding":"0","margin":"0 0 10px","background":"#f1f1f1","order":"3"}'>
		<div v-if="false" class="idea newsIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
			<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
			<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
			<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		</div>
		
		<div class="title" :style='{"width":"100%","margin":"40px auto","lineHeight":"50px","textAlign":"center","background":"url(http://codegen.caihongy.cn/20230915/b96d1e15768f4ac495e60a79e04cb731.png) no-repeat center top"}'>
			<span :style='{"color":"#F5BB00","fontSize":"32px","lineHeight":"40px"}'>公告信息</span>
		</div>
		
			
			
			
			
			
			
			
			
			
			
		









		<div v-if="newsList.length" class="list list22 index-pv1" :style='{"width":"100%","padding":"10px 07%","fontSize":"14px","height":"auto"}'>
		  <div :style='{"width":"100%","color":"#fff","flexWrap":"wrap","justifyContent":"space-between","display":"flex","height":"auto"}'>
			<template v-for="(item,index) in newsList">
			<div v-if="index < 3" class="list-item animation-box" :style='{"cursor":"pointer","width":"31%","position":"relative","height":"auto"}' @click="toDetail('newsDetail', newsList[index*5])">
		      <img :style='{"width":"100%","objectFit":"cover","borderRadius":"6px","display":"block","height":"300px"}' :src="baseUrl + item.picture" alt="" />
			  <div :style='{"padding":"0 0 6px","borderRadius":"0 0 6px 6px","left":"0","bottom":"0","background":"rgba(0,0,0,.3)","width":"100%","position":"absolute"}'>
		        <div :style='{"padding":"0 10px","overflow":"hidden","whiteSpace":"nowrap","color":"#fff","width":"100%","lineHeight":"44px","fontSize":"16px","textOverflow":"ellipsis"}' class="title">{{item.title}}</div>
		        <div :style='{"padding":"0 10px"}'>
		          <span class="icon iconfont icon-shijian21" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'></span>
		          <span :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{item.addtime}}</span>
		        </div>
		        <div :style='{"padding":"0 10px","display":"inline-block"}'>
		          <span class="icon iconfont icon-geren16" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'></span>
		          <span :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{item.name}}</span>
		        </div>
		        <div :style='{"padding":"0 10px","display":"inline-block"}'>
		          <span class="icon iconfont icon-zan10" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'></span>
		          <span :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{item.thumbsupnum}}</span>
		        </div>
		        <div :style='{"padding":"0 10px","display":"inline-block"}'>
		          <span class="icon iconfont icon-shoucang10" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'></span>
		          <span :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{item.storeupnum}}</span>
		        </div>
		        <div :style='{"padding":"0 10px","display":"inline-block"}'>
		          <span class="icon iconfont icon-chakan9" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'></span>
		          <span :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{item.clicknum}}</span>
		        </div>
		      </div>
		    </div>
			</template>
		  </div>
		  <div :style='{"width":"100%","color":"#999","flexWrap":"wrap","display":"flex","height":"auto"}'>
			<template v-for="(item,index) in newsList">
			<div v-if="index > 2" class="list-item animation-box" :style='{"cursor":"pointer","width":"31.3%","margin":"20px 2% 0 0","display":"flex","height":"auto"}' @click="toDetail('newsDetail', item)">
		      <img :style='{"width":"150px","objectFit":"cover","borderRadius":"6px","display":"block","height":"130px"}' :src="baseUrl + item.picture" alt="" />
		  			  <div :style='{"padding":"10px","overflow":"hidden","flex":"1","height":"auto"}'>
		        <div :style='{"padding":"0 10px","lineHeight":"24px","fontSize":"14px","color":"#333","fontWeight":"600","height":"48px"}' class="title">{{item.title}}</div>
		        <div :style='{"padding":"0 10px","margin":"0 0 10px"}'>
		          <span class="icon iconfont icon-shijian21" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'></span>
		          <span :style='{"color":"inherit","lineHeight":"24px","fontSize":"inherit"}'>{{item.addtime}}</span>
		        </div>
		        <div :style='{"padding":"0 10px","display":"inline-block"}'>
		          <span class="icon iconfont icon-geren16" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'></span>
		          <span :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{item.name}}</span>
		        </div>
		        <div :style='{"padding":"0 10px","display":"inline-block"}'>
		          <span class="icon iconfont icon-zan10" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'></span>
		          <span :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{item.thumbsupnum}}</span>
		        </div>
		        <div :style='{"padding":"0 10px","display":"inline-block"}'>
		          <span class="icon iconfont icon-shoucang10" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'></span>
		          <span :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{item.storeupnum}}</span>
		        </div>
		        <div :style='{"padding":"0 10px","display":"inline-block"}'>
		          <span class="icon iconfont icon-chakan9" :style='{"margin":"0 2px 0 0","lineHeight":"1.5","fontSize":"inherit","color":"inherit"}'></span>
		          <span :style='{"color":"inherit","lineHeight":"1.5","fontSize":"inherit"}'>{{item.clicknum}}</span>
		        </div>
		      </div>
		    </div>
			</template>
		  </div>
		</div>


		<div @click="moreBtn('news')" :style='{"border":"0","cursor":"pointer","margin":"40px auto","borderRadius":"6px","textAlign":"center","background":"#F5BB00","display":"block","width":"120px","lineHeight":"36px"}'>
			<span :style='{"color":"#f5f5f5","fontSize":"14px"}'>查看更多</span>
			<i :style='{"color":"#f5f5f5","fontSize":"12px"}' class="icon iconfont icon-gengduo1"></i>
		</div>
		
		</div>
	<!-- 新闻资讯 -->


<!-- 商品推荐 -->
<div id="animate_recommendguoshuxinxi" class="recommend animate__animated" :style='{"width":"100%","padding":"20px 0","margin":"0 0 20px","background":"#f1f1f1","order":"1"}'>
	<div v-if="false" class="idea recommendIdea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
    <div class="title" :style='{"width":"100%","margin":"30px auto","lineHeight":"50px","textAlign":"center","background":"url(http://codegen.caihongy.cn/20230915/b96d1e15768f4ac495e60a79e04cb731.png) no-repeat center top"}'>
		<span :style='{"color":"#F5BB00","fontSize":"32px","lineHeight":"40px"}'>果树信息推荐</span>
	</div>
	
	
	
	
	
	
	
	
	
	



	<div v-if="guoshuxinxiRecommend.length" class="list list12 index-pv1 list12guoshuxinxi" :style='{"width":"100%","padding":"0 7%","background":"none","height":"auto"}'>
	  <div class="tab" :style='{"width":"100%","margin":"0 0 20px","justifyContent":"center","display":"flex","height":"auto"}'>
	    <template v-for="item,index in recommendList12guoshuxinxi">
		<div v-if="index < 6" @click="recommendIndexClick12(index + 1, 'guoshuxinxi')" class="item" :class="index + 1 == recommendIndex12guoshuxinxi ? 'active' : ''">
			<img v-if="item.image" :style='{"width":"34px","margin":"10px 5px 0 0","objectFit":"cover","borderRadius":"4px","display":"block","height":"34px"}' :src="baseUrl + (item.image?item.image.split(',')[0]:'')">
			<div :style='{"color":"inherit","fontSize":"14px"}'>{{item[recommendColumn12guoshuxinxi]}}</div>
		</div>
		</template>
		<div class="more" @click="moreBtn('guoshuxinxi')">
		  <div :style='{"color":"inherit","fontSize":"14px"}'>更多</div>
		  <span class="icon iconfont icon-jiantou25" :style='{"color":"inherit","margin":"0 0 0 2px","fontSize":"14px"}'></span>
		</div>
	  </div>
	  <div class="list" :style='{"margin":"30px 0 0","overflow":"hidden","flexWrap":"wrap","flex":"1","background":"none","display":"flex","height":"auto"}'>
	    <div :style='{"cursor":"pointer","width":"31.3%","margin":"0 2% 20px 0","overflow":"hidden","position":"relative","height":"auto"}' class="item list-item animation-box" v-for="item,index in guoshuxinxiRecommend" :key="index" @click="toDetail('guoshuxinxiDetail', item)">
			<img :name="item.id" :style='{"width":"100%","margin":"0 0 6px","objectFit":"cover","borderRadius":"6px","display":"block","height":"280px"}' v-if="preHttp(item.tupian)" :src="item.tupian.split(',')[0]" alt="" />
			<img :name="item.id" :style='{"width":"100%","margin":"0 0 6px","objectFit":"cover","borderRadius":"6px","display":"block","height":"280px"}' v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
			<div class="line1" :style='{"padding":"0 10px","borderColor":"#ddd","margin":"0 0 6px","whiteSpace":"nowrap","color":"#333","overflow":"hidden","borderRadius":"6px","borderWidth":"0 0 1px","background":"#fff","width":"100%","lineHeight":"36px","fontSize":"14px","textOverflow":"ellipsis","borderStyle":"solid"}'>{{item.guoshumingcheng}}</div>
			<div class="line1" :style='{"padding":"0 10px","borderColor":"#ddd","margin":"0 0 6px","whiteSpace":"nowrap","color":"#333","overflow":"hidden","borderRadius":"6px","borderWidth":"0 0 1px","background":"#fff","width":"100%","lineHeight":"36px","fontSize":"14px","textOverflow":"ellipsis","borderStyle":"solid"}'>{{item.guoshuleixing}}</div>
	    </div>
	  </div>
	</div>




	
	<div @click="moreBtn('guoshuxinxi')" :style='{"border":"0","cursor":"pointer","margin":"0px auto 20px","borderRadius":"6px","textAlign":"center","background":"#F5BB00","display":"block","width":"120px","lineHeight":"36px"}'>
		<span :style='{"color":"#f5f5f5","fontSize":"14px"}'>查看更多</span>
		<i :style='{"color":"#f5f5f5","fontSize":"12px"}' class="icon iconfont icon-gengduo1"></i>
	</div>
	
</div>
<!-- 商品推荐 -->


<!-- 特价商品 -->
<div id="animate_listnongchangxinxi" class="lists animate__animated" :style='{"margin":"0 0 20px","background":"#fff","order":"4"}'>
	<div v-if="false" class="idea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"width":"100%","margin":"30px auto","lineHeight":"50px","textAlign":"center","background":"url(http://codegen.caihongy.cn/20230915/b96d1e15768f4ac495e60a79e04cb731.png) no-repeat center top"}'>
	  <span :style='{"color":"#F5BB00","fontSize":"32px","lineHeight":"40px"}'>农场信息展示</span>
	</div>
	
	
	
	
	
	
	
	
	
	


	<div v-if="nongchangxinxiList.length" class="list list11 index-pv1" :style='{"width":"100%","padding":"0 7%","background":"#fff","justifyContent":"space-between","display":"flex","height":"auto"}'>
	  <div class="list" :style='{"flexWrap":"wrap","flex":"1","background":"#fff","display":"flex","height":"auto"}'>
	    <div :style='{"cursor":"pointer","width":"31.3%","margin":"0 2% 20px 0","overflow":"hidden","position":"relative","height":"auto"}' class="item list-item animation-box" v-for="item,index in nongchangxinxiList" :key="index" @click="toDetail('nongchangxinxiDetail', item)">
			<img :name="item.id" :style='{"width":"100%","objectFit":"cover","borderRadius":"6px","display":"block","height":"200px"}' v-if="preHttp(item.nongchangtupian)" :src="item.nongchangtupian.split(',')[0]" alt="" />
			<img :name="item.id" :style='{"width":"100%","objectFit":"cover","borderRadius":"6px","display":"block","height":"200px"}' v-else :src="baseUrl + (item.nongchangtupian?item.nongchangtupian.split(',')[0]:'')" alt="" />
			<div class="line1" :style='{"padding":"0 10px","borderColor":"#ddd","overflow":"hidden","whiteSpace":"nowrap","color":"#333","borderWidth":"0 0 1px","width":"100%","lineHeight":"40px","fontSize":"16px","textOverflow":"ellipsis","borderStyle":"solid","height":"40px"}'>{{item.nongchangmingcheng}}</div>
	    </div>
	  </div>
	</div>




	
	
	<div @click="moreBtn('nongchangxinxi')" :style='{"border":"0","cursor":"pointer","margin":"30px auto 10px","borderRadius":"6px","textAlign":"center","background":"#F5BB00","display":"block","width":"120px","lineHeight":"36px"}'>
		<span :style='{"color":"#f5f5f5","fontSize":"14px"}'>查看更多</span>
		<i :style='{"color":"#f5f5f5","fontSize":"14px"}' class="icon iconfont icon-gengduo1"></i>
	</div>
	

</div>
<!-- 特价商品 -->

<!-- 特价商品 -->
<div id="animate_listguoshuzhishi" class="lists animate__animated" :style='{"margin":"0 0 20px","background":"#fff","order":"4"}'>
	<div v-if="false" class="idea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"width":"100%","margin":"30px auto","lineHeight":"50px","textAlign":"center","background":"url(http://codegen.caihongy.cn/20230915/b96d1e15768f4ac495e60a79e04cb731.png) no-repeat center top"}'>
	  <span :style='{"color":"#F5BB00","fontSize":"32px","lineHeight":"40px"}'>果树知识展示</span>
	</div>
	
	
	
	
	
	
	
	
	
	


	<div v-if="guoshuzhishiList.length" class="list list11 index-pv1" :style='{"width":"100%","padding":"0 7%","background":"#fff","justifyContent":"space-between","display":"flex","height":"auto"}'>
	  <div class="list" :style='{"flexWrap":"wrap","flex":"1","background":"#fff","display":"flex","height":"auto"}'>
	    <div :style='{"cursor":"pointer","width":"31.3%","margin":"0 2% 20px 0","overflow":"hidden","position":"relative","height":"auto"}' class="item list-item animation-box" v-for="item,index in guoshuzhishiList" :key="index" @click="toDetail('guoshuzhishiDetail', item)">
			<img :name="item.id" :style='{"width":"100%","objectFit":"cover","borderRadius":"6px","display":"block","height":"200px"}' v-if="preHttp(item.guoshutupian)" :src="item.guoshutupian.split(',')[0]" alt="" />
			<img :name="item.id" :style='{"width":"100%","objectFit":"cover","borderRadius":"6px","display":"block","height":"200px"}' v-else :src="baseUrl + (item.guoshutupian?item.guoshutupian.split(',')[0]:'')" alt="" />
			<div class="line1" :style='{"padding":"0 10px","borderColor":"#ddd","overflow":"hidden","whiteSpace":"nowrap","color":"#333","borderWidth":"0 0 1px","width":"100%","lineHeight":"40px","fontSize":"16px","textOverflow":"ellipsis","borderStyle":"solid","height":"40px"}'>{{item.guoshumingcheng}}</div>
	    </div>
	  </div>
	</div>




	
	
	<div @click="moreBtn('guoshuzhishi')" :style='{"border":"0","cursor":"pointer","margin":"30px auto 10px","borderRadius":"6px","textAlign":"center","background":"#F5BB00","display":"block","width":"120px","lineHeight":"36px"}'>
		<span :style='{"color":"#f5f5f5","fontSize":"14px"}'>查看更多</span>
		<i :style='{"color":"#f5f5f5","fontSize":"14px"}' class="icon iconfont icon-gengduo1"></i>
	</div>
	

</div>
<!-- 特价商品 -->

<!-- 特价商品 -->
<div id="animate_listguoshuxinxi" class="lists animate__animated" :style='{"margin":"0 0 20px","background":"#fff","order":"4"}'>
	<div v-if="false" class="idea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"width":"100%","margin":"30px auto","lineHeight":"50px","textAlign":"center","background":"url(http://codegen.caihongy.cn/20230915/b96d1e15768f4ac495e60a79e04cb731.png) no-repeat center top"}'>
	  <span :style='{"color":"#F5BB00","fontSize":"32px","lineHeight":"40px"}'>果树信息展示</span>
	</div>
	
	
	
	
	
	
	
	
	
	


	<div v-if="guoshuxinxiList.length" class="list list11 index-pv1" :style='{"width":"100%","padding":"0 7%","background":"#fff","justifyContent":"space-between","display":"flex","height":"auto"}'>
	  <div class="tab" :style='{"width":"260px","margin":"0 20px 0 0","flexDirection":"column","display":"flex","height":"auto"}'>
		<template v-for="item,index in listList11guoshuxinxi">
	    <div v-if="index < 6" :style='{"cursor":"pointer","padding":"4px 20px","margin":"0","borderColor":"#efefef","borderWidth":"0 0 1px 0","width":"100%","borderStyle":"solid","height":"auto"}' class="item" @click="listIndexClick11(item, 'guoshuxinxi')">
	      <span class="icon iconfont icon-jiantou34" :style='{"margin":"0 5px 0 0","lineHeight":"44px","fontSize":"16px","color":"#333"}'></span>
	      <img v-if="item.image" :style='{"width":"44px","margin":"0 5px 0 0","objectFit":"cover","borderRadius":"4px","display":"inline-block","height":"44px"}' :src="baseUrl + (item.image?item.image.split(',')[0]:'')">
		  <span :style='{"color":"#333","lineHeight":"44px","fontSize":"16px"}'>{{item[listColumn11guoshuxinxi]}}</span>
	    </div>
		</template>
		<div :style='{"cursor":"pointer","padding":"0 20px","margin":"0","borderColor":"#efefef","borderWidth":"0 0 1px 0","display":"none","width":"100%","borderStyle":"solid","height":"auto"}' class="more" @click="moreBtn('guoshuxinxi')">
		  <span class="icon iconfont icon-jiantou34" :style='{"margin":"0 5px 0 0","lineHeight":"44px","fontSize":"16px","color":"#999","display":"inline-block"}'></span>
		  <div :style='{"lineHeight":"44px","fontSize":"16px","color":"#999","display":"inline-block"}'>更多</div>
		</div>
	  </div>
	  <div class="list" :style='{"flexWrap":"wrap","flex":"1","background":"#fff","display":"flex","height":"auto"}'>
	    <div :style='{"cursor":"pointer","width":"31.3%","margin":"0 2% 20px 0","overflow":"hidden","position":"relative","height":"auto"}' class="item list-item animation-box" v-for="item,index in guoshuxinxiList" :key="index" @click="toDetail('guoshuxinxiDetail', item)">
			<img :name="item.id" :style='{"width":"100%","objectFit":"cover","borderRadius":"6px","display":"block","height":"200px"}' v-if="preHttp(item.tupian)" :src="item.tupian.split(',')[0]" alt="" />
			<img :name="item.id" :style='{"width":"100%","objectFit":"cover","borderRadius":"6px","display":"block","height":"200px"}' v-else :src="baseUrl + (item.tupian?item.tupian.split(',')[0]:'')" alt="" />
			<div class="line1" :style='{"padding":"0 10px","borderColor":"#ddd","overflow":"hidden","whiteSpace":"nowrap","color":"#333","borderWidth":"0 0 1px","width":"100%","lineHeight":"40px","fontSize":"16px","textOverflow":"ellipsis","borderStyle":"solid","height":"40px"}'>{{item.guoshumingcheng}}</div>
			<div class="line1" :style='{"padding":"0 10px","borderColor":"#ddd","overflow":"hidden","whiteSpace":"nowrap","color":"#333","borderWidth":"0 0 1px","width":"100%","lineHeight":"40px","fontSize":"16px","textOverflow":"ellipsis","borderStyle":"solid","height":"40px"}'>{{item.guoshuleixing}}</div>
	    </div>
	  </div>
	</div>




	
	
	<div @click="moreBtn('guoshuxinxi')" :style='{"border":"0","cursor":"pointer","margin":"30px auto 10px","borderRadius":"6px","textAlign":"center","background":"#F5BB00","display":"block","width":"120px","lineHeight":"36px"}'>
		<span :style='{"color":"#f5f5f5","fontSize":"14px"}'>查看更多</span>
		<i :style='{"color":"#f5f5f5","fontSize":"14px"}' class="icon iconfont icon-gengduo1"></i>
	</div>
	

</div>
<!-- 特价商品 -->

<!-- 特价商品 -->
<div id="animate_listzhongzhixinxi" class="lists animate__animated" :style='{"margin":"0 0 20px","background":"#fff","order":"4"}'>
	<div v-if="false" class="idea" :style='{"padding":"20px","flexWrap":"wrap","background":"#efefef","justifyContent":"space-between","display":"flex"}'>
		<div class="box1" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"width":"100%","margin":"30px auto","lineHeight":"50px","textAlign":"center","background":"url(http://codegen.caihongy.cn/20230915/b96d1e15768f4ac495e60a79e04cb731.png) no-repeat center top"}'>
	  <span :style='{"color":"#F5BB00","fontSize":"32px","lineHeight":"40px"}'>种植信息展示</span>
	</div>
	
	
	
	
	
	
	
	
	
	


	<div v-if="zhongzhixinxiList.length" class="list list11 index-pv1" :style='{"width":"100%","padding":"0 7%","background":"#fff","justifyContent":"space-between","display":"flex","height":"auto"}'>
	  <div class="list" :style='{"flexWrap":"wrap","flex":"1","background":"#fff","display":"flex","height":"auto"}'>
	    <div :style='{"cursor":"pointer","width":"31.3%","margin":"0 2% 20px 0","overflow":"hidden","position":"relative","height":"auto"}' class="item list-item animation-box" v-for="item,index in zhongzhixinxiList" :key="index" @click="toDetail('zhongzhixinxiDetail', item)">
			<img :name="item.id" :style='{"width":"100%","objectFit":"cover","borderRadius":"6px","display":"block","height":"200px"}' v-if="preHttp(item.guoshutupian)" :src="item.guoshutupian.split(',')[0]" alt="" />
			<img :name="item.id" :style='{"width":"100%","objectFit":"cover","borderRadius":"6px","display":"block","height":"200px"}' v-else :src="baseUrl + (item.guoshutupian?item.guoshutupian.split(',')[0]:'')" alt="" />
			<div class="line1" :style='{"padding":"0 10px","borderColor":"#ddd","overflow":"hidden","whiteSpace":"nowrap","color":"#333","borderWidth":"0 0 1px","width":"100%","lineHeight":"40px","fontSize":"16px","textOverflow":"ellipsis","borderStyle":"solid","height":"40px"}'>{{item.guoshumingcheng}}</div>
			<div class="line1" :style='{"padding":"0 10px","borderColor":"#ddd","overflow":"hidden","whiteSpace":"nowrap","color":"#333","borderWidth":"0 0 1px","width":"100%","lineHeight":"40px","fontSize":"16px","textOverflow":"ellipsis","borderStyle":"solid","height":"40px"}'>{{item.shengzhangjieduan}}</div>
	    </div>
	  </div>
	</div>




	
	
	<div @click="moreBtn('zhongzhixinxi')" :style='{"border":"0","cursor":"pointer","margin":"30px auto 10px","borderRadius":"6px","textAlign":"center","background":"#F5BB00","display":"block","width":"120px","lineHeight":"36px"}'>
		<span :style='{"color":"#f5f5f5","fontSize":"14px"}'>查看更多</span>
		<i :style='{"color":"#f5f5f5","fontSize":"14px"}' class="icon iconfont icon-gengduo1"></i>
	</div>
	

</div>
<!-- 特价商品 -->
	
</div>
</template>

<script>
import 'animate.css'
import Swiper from "swiper";

  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        aboutUsDetail: {},
        systemIntroductionDetail: {},
        newsList: [],
        guoshuxinxiRecommend: [],

        nongchangxinxiList: [],
        guoshuzhishiList: [],
        guoshuxinxiList: [],
        zhongzhixinxiList: [],


		recommendIndex12guoshuxinxi: 0,
		recommendList12guoshuxinxi: [],
		recommendColumn12guoshuxinxi: '',

		listIndex11guoshuxinxi: 0,
		listList11guoshuxinxi: [],
		listColumn11guoshuxinxi: '',

      }
    },
    created() {
		this.baseUrl = this.$config.baseUrl;
		this.getNewsList();
		this.getAboutUs();
		this.getSystemIntroduction();
		this.getList();
		this.guoshuxinxiRecommendCate()
		this.guoshuxinxiListCate()
    },
	mounted() {
		window.addEventListener('scroll', this.handleScroll)
		setTimeout(()=>{
			this.handleScroll()
		},100)
		
		this.swiperChanges()
	},
	beforeDestroy() {
	  window.removeEventListener('scroll', this.handleScroll)
	},
    //方法集合
    methods: {
		swiperChanges() {
			setTimeout(()=>{
			},750)
		},
		guoshuxinxiRecommendCate(){
			this.$http.get('guoshuleixing/list',{}).then(res => {
			  if (res.data.code == 0) {
				this.recommendList12guoshuxinxi = res.data.data.list
			  }
			});
			this.recommendColumn12guoshuxinxi = 'guoshuleixing'
		},
		recommendIndexClick12(index, name) {
			this['recommendIndex12' + name] = index
			this.getList()
			
			document.querySelectorAll('.recommend .list12' + name + ' .list .item').forEach(el => {
			  el.classList.remove("active")
			})
			setTimeout(() => {
			  document.querySelectorAll('.recommend .list12' + name + ' .list .item').forEach(el => {
			    el.classList.add("active")
			  })
			}, 1);
		},

		guoshuxinxiListCate(){
			this.$http.get('guoshuleixing/list',{}).then(res => {
			  if (res.data.code == 0) {
				this.listList11guoshuxinxi = res.data.data.list
			  }
			});
			this.listColumn11guoshuxinxi = 'guoshuleixing'
		},
		listIndexClick11(index, name) {
			this['listIndex11' + name] = index[this['listColumn11' + name]]
			this.getList()
		},

		handleScroll() {
			let arr = [
				{id:'search',css:'animate__bounce'},
				{id:'about',css:'animate__fadeInUp'},
				{id:'system',css:'animate__fadeInUp'},
				{id:'animate_listnongchangxinxi',css:'animate__fadeInUp'},
				{id:'animate_listguoshuzhishi',css:'animate__fadeInUp'},
				{id:'animate_recommendguoshuxinxi',css:'animate__fadeInUp'},
				{id:'animate_listguoshuxinxi',css:'animate__fadeInUp'},
				{id:'animate_listzhongzhixinxi',css:'animate__fadeInUp'},
				{id:'animate_newsnews',css:'animate__fadeInUp'},
				{id:'msgs',css:'animate__bounce'},
				{id:'friendly',css:'animate__bounce'}
			]
			
			for (let i in arr) {
				let doc = document.getElementById(arr[i].id)
				if (doc) {
					let top = doc.offsetTop
					let win_top = window.innerHeight + window.pageYOffset
					// console.log(top,win_top)
					if (win_top > top && doc.classList.value.indexOf(arr[i].css) < 0) {
						// console.log(doc)
						doc.classList.add(arr[i].css)
					}
				}
			}
		},
      preHttp(str) {
          return str && str.substr(0,4)=='http';
      },
      getAboutUs() {
          this.$http.get('aboutus/detail/1', {}).then(res => {
            if(res.data.code == 0) {
              this.aboutUsDetail = res.data.data;
            }
          })
      },
      getSystemIntroduction() {
          this.$http.get('systemintro/detail/1', {}).then(res => {
            if(res.data.code == 0) {
              this.systemIntroductionDetail = res.data.data;
            }
          })
      },
		getNewsList() {
			let data = {
				page: 1,
				limit: 15,
                sort: 'addtime',
				order: 'desc'
			}
			this.$http.get('news/list', {params: data}).then(res => {
				if (res.data.code == 0) {
					this.newsList = res.data.data.list;
					
					
				}
			});
		},
		getList() {
			let autoSortUrl = "";
			let data = {}
          autoSortUrl = "guoshuxinxi/autoSort";
			data = {
				page: 1,
				limit: 6,
			}
			if(this.recommendIndex12guoshuxinxi != 0){
				data.guoshuleixing = this.recommendList12guoshuxinxi[this.recommendIndex12guoshuxinxi - 1].guoshuleixing
			}
			this.$http.get(autoSortUrl, {params: data}).then(res => {
				if (res.data.code == 0) {
					this.guoshuxinxiRecommend = res.data.data.list;
					
					
					// 商品列表样式五
					
				}
			});
			
			data = {
				page: 1,
				limit: 6,
			}
			this.$http.get('nongchangxinxi/list', {params: data}).then(res => {
				if (res.data.code == 0) {
					this.nongchangxinxiList = res.data.data.list;
					
					// 商品列表样式五
					
				}
			});
			data = {
				page: 1,
				limit: 6,
			}
			this.$http.get('guoshuzhishi/list', {params: data}).then(res => {
				if (res.data.code == 0) {
					this.guoshuzhishiList = res.data.data.list;
					
					// 商品列表样式五
					
				}
			});
			data = {
				page: 1,
				limit: 6,
			}
			if(this.listIndex11guoshuxinxi){
				data.guoshuleixing = this.listIndex11guoshuxinxi
			}
			this.$http.get('guoshuxinxi/list', {params: data}).then(res => {
				if (res.data.code == 0) {
					this.guoshuxinxiList = res.data.data.list;
					
					// 商品列表样式五
					
				}
			});
			data = {
				page: 1,
				limit: 6,
			}
			this.$http.get('zhongzhixinxi/list', {params: data}).then(res => {
				if (res.data.code == 0) {
					this.zhongzhixinxiList = res.data.data.list;
					
					// 商品列表样式五
					
				}
			});
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {id: item.id}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
		// -------- search --------
		.search .select /deep/ .el-input__inner {
			border: 1px solid #ddd;
			border-radius: 4px;
			padding: 0 30px 0 10px;
			box-shadow: 0 0 0px rgba(64, 158, 255, .3);
			outline: none;
			color: rgba(64, 158, 255, 1);
			width: 180px;
			font-size: 14px;
			height: 36px;
		}
		
		.search .input /deep/ .el-input__inner {
			border: 1px solid #ddd;
			border-radius: 4px;
			padding: 0 10px;
			box-shadow: 0 0 0px rgba(64, 158, 255, .3);
			outline: none;
			color: rgba(64, 158, 255, 1);
			width: 180px;
			font-size: 14px;
			height: 36px;
		}
		// -------- search --------
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1.01) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }
        
        .list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 10px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
			}
		}
	}
	







	.home-preview .recommend .list12 .tab .item {
				cursor: pointer;
				border: 0;
				border-radius: 6px;
				padding: 0 20px;
				margin: 0 10px;
				color: #fff;
				background: #333;
				width: auto;
				font-size: 16px;
				line-height: 40px;
			}
	
	.home-preview .recommend .list12 .tab .item:hover {
				color: #fff;
				background: #F5BB00;
				border-color: #F5BB00;
				border-width: 0 0 0px 0;
				border-style: solid;
			}
	
	.home-preview .recommend .list12 .tab .item.active {
				color: #fff;
				background: #F5BB00;
				border-color: #F5BB00;
				border-width: 0 0 0px 0;
				border-style: solid;
			}
	
	.home-preview .recommend .list12 .tab .more {
				cursor: pointer;
				padding: 5px 10px;
				margin: 0 10px;
				color: #666;
				background: #fff;
				display: none;
				line-height: 44px;
				align-items: center;
			}
	
	.home-preview .recommend .list12 .tab .more:hover {
				color: red;
			}
	
	.home-preview .recommend .list12 .item.active {
	  animation-name: mymove;
	
	  &:nth-of-type(1) {
	    animation-duration: 1s;
	  }
	  &:nth-of-type(2) {
	    animation-duration: 1.2s;
	  }
	  &:nth-of-type(3) {
	    animation-duration: 1.4s;
	  }
	  &:nth-of-type(4) {
	    animation-duration: 1.6s;
	  }
	  &:nth-of-type(5) {
	    animation-duration: 1.8s;
	  }
	  &:nth-of-type(6) {
	    animation-duration: 2s;
	  }
	}
	
	@keyframes mymove
	{
		from {top: 320px;}
		to {top: 0;}
	}



</style>
