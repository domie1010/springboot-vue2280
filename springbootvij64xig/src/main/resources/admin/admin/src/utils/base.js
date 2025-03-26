const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootvij64xig/",
            name: "springbootvij64xig",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootvij64xig/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "果树的生长信息管理系统"
        } 
    }
}
export default base
