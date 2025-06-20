export function isAuth(tableName, key) {
  let role = localStorage.getItem("UserTableName");
  let menus = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["新增","查看","修改","删除"],"menu":"医生","menuJump":"列表","tableName":"yisheng"}],"menu":"医生管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"科室分类","menuJump":"列表","tableName":"keshifenlei"}],"menu":"科室分类管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除"],"menu":"科室信息","menuJump":"列表","tableName":"keshixinxi"}],"menu":"科室信息管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看","修改","删除","支付"],"menu":"在线挂号","menuJump":"列表","tableName":"zaixianguahao"}],"menu":"在线挂号管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","修改","删除"],"menu":"预约体检","menuJump":"列表","tableName":"yuyuetijian"}],"menu":"预约体检管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","修改","删除"],"menu":"体检报告","menuJump":"列表","tableName":"tijianbaogao"}],"menu":"体检报告管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["新增","查看","修改","删除"],"menu":"药品类型","menuJump":"列表","tableName":"yaopinleixing"}],"menu":"药品类型管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看","修改","删除","新增"],"menu":"药品信息","menuJump":"列表","tableName":"yaopinxinxi"}],"menu":"药品信息管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","修改","删除"],"menu":"处方信息","menuJump":"列表","tableName":"chufangxinxi"}],"menu":"处方信息管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看","修改","删除"],"menu":"交费信息","menuJump":"列表","tableName":"jiaofeixinxi"}],"menu":"交费信息管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看","修改","删除"],"menu":"病历信息","menuJump":"列表","tableName":"binglixinxi"}],"menu":"病历信息管理"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["新增","查看","修改","删除"],"menu":"智能导诊","menuJump":"列表","tableName":"zhinengdaozhen"}],"menu":"智能导诊管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除"],"menu":"导航服务","menuJump":"列表","tableName":"daohangfuwu"}],"menu":"导航服务管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看","修改","删除"],"menu":"就诊卡充值","menuJump":"列表","tableName":"jiuzhenkachongzhi"}],"menu":"就诊卡充值管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["新增","查看","修改","删除"],"menu":"项目名称","menuJump":"列表","tableName":"xiangmumingcheng"}],"menu":"项目名称管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"},{"appFrontIcon":"cuIcon-brand","buttons":["查看","修改"],"menu":"关于我们","tableName":"aboutus"},{"appFrontIcon":"cuIcon-form","buttons":["查看","修改"],"menu":"系统简介","tableName":"systemintro"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","挂号"],"menu":"科室信息列表","menuJump":"列表","tableName":"keshixinxi"}],"menu":"科室信息模块"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看"],"menu":"导航服务列表","menuJump":"列表","tableName":"daohangfuwu"}],"menu":"导航服务模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-camera","buttons":["查看","充值"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看"],"menu":"在线挂号","menuJump":"列表","tableName":"zaixianguahao"}],"menu":"在线挂号管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看"],"menu":"预约体检","menuJump":"列表","tableName":"yuyuetijian"}],"menu":"预约体检管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看"],"menu":"体检报告","menuJump":"列表","tableName":"tijianbaogao"}],"menu":"体检报告管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","支付","交费"],"menu":"处方信息","menuJump":"列表","tableName":"chufangxinxi"}],"menu":"处方信息管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看"],"menu":"交费信息","menuJump":"列表","tableName":"jiaofeixinxi"}],"menu":"交费信息管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看"],"menu":"病历信息","menuJump":"列表","tableName":"binglixinxi"}],"menu":"病历信息管理"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看"],"menu":"智能导诊","menuJump":"列表","tableName":"zhinengdaozhen"}],"menu":"智能导诊管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看","支付","修改","删除"],"menu":"就诊卡充值","menuJump":"列表","tableName":"jiuzhenkachongzhi"}],"menu":"就诊卡充值管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","挂号"],"menu":"科室信息列表","menuJump":"列表","tableName":"keshixinxi"}],"menu":"科室信息模块"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看"],"menu":"导航服务列表","menuJump":"列表","tableName":"daohangfuwu"}],"menu":"导航服务模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看"],"menu":"科室信息","menuJump":"列表","tableName":"keshixinxi"}],"menu":"科室信息管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看","体检"],"menu":"在线挂号","menuJump":"列表","tableName":"zaixianguahao"}],"menu":"在线挂号管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","体检报告"],"menu":"预约体检","menuJump":"列表","tableName":"yuyuetijian"}],"menu":"预约体检管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","开处方","登记"],"menu":"体检报告","menuJump":"列表","tableName":"tijianbaogao"}],"menu":"体检报告管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看"],"menu":"药品信息","menuJump":"列表","tableName":"yaopinxinxi"}],"menu":"药品信息管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看"],"menu":"处方信息","menuJump":"列表","tableName":"chufangxinxi"}],"menu":"处方信息管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看"],"menu":"交费信息","menuJump":"列表","tableName":"jiaofeixinxi"}],"menu":"交费信息管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看"],"menu":"病历信息","menuJump":"列表","tableName":"binglixinxi"}],"menu":"病历信息管理"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看"],"menu":"智能导诊","menuJump":"列表","tableName":"zhinengdaozhen"}],"menu":"智能导诊管理"},{"child":[{"appFrontIcon":"cuIcon-service","buttons":["新增","查看","修改","删除"],"menu":"我的消息","tableName":"chat"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","挂号"],"menu":"科室信息列表","menuJump":"列表","tableName":"keshixinxi"}],"menu":"科室信息模块"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["查看"],"menu":"导航服务列表","menuJump":"列表","tableName":"daohangfuwu"}],"menu":"导航服务模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"医生","tableName":"yisheng"}];
  for(let i=0;i<menus.length;i++){
    if(menus[i].tableName==role){
      for(let j=0;j<menus[i].frontMenu.length;j++){
          for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
            if(tableName==menus[i].frontMenu[j].child[k].tableName){
              let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
              return buttons.indexOf(key) !== -1 || false
            }
          }
      }
    }
  }
  return false;
}

/**
 *  * 获取当前时间（yyyy-MM-dd hh:mm:ss）
 *   */
export function getCurDateTime() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate(),
    hour = currentTime.getHours(),
    minute = currentTime.getMinutes(),
    second = currentTime.getSeconds();
    return year + "-" + month + "-" + day + " " +hour +":" +minute+":"+second;
}

/**
 *  * 获取当前日期（yyyy-MM-dd）
 *   */
export function getCurDate() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate();
    return year + "-" + month + "-" + day;
}
