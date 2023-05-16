const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm87m38/",
            name: "ssm87m38",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm87m38/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "SSM inpatient department management system"
        } 
    }
}
export default base
