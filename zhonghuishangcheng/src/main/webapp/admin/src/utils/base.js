const base = {
    get() {
        return {
            url : "http://localhost:8080/zhonghuishangcheng/",
            name: "zhonghuishangcheng",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/zhonghuishangcheng/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "众惠商城"
        } 
    }
}
export default base
