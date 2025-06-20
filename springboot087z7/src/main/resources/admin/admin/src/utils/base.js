const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot087z7/",
            name: "springboot087z7",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot087z7/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "智慧医疗服务平台"
        } 
    }
}
export default base
