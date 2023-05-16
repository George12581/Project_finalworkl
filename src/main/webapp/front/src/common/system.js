export function isAuth(tableName, key) {
  let role = localStorage.getItem("UserTableName");
  let menus = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["新增","查看","修改","删除"],"menu":"patient","menuJump":"列表","tableName":"patient"}],"menu":"patient管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["新增","查看","修改","删除"],"menu":"doctor","menuJump":"列表","tableName":"doctor"}],"menu":"doctor管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["新增","查看","修改","删除"],"menu":"nurse","menuJump":"列表","tableName":"nurse"}],"menu":"nurse管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","修改","删除"],"menu":"inpatientregistration","menuJump":"列表","tableName":"inpatientregistration"}],"menu":"inpatientregistration管理"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["新增","查看","修改","删除"],"menu":"bedinformation","menuJump":"列表","tableName":"bedinformation"}],"menu":"bedinformation管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","修改","删除"],"menu":"nursinginformation","menuJump":"列表","tableName":"nursinginformation"}],"menu":"nursinginformation管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","修改","删除"],"menu":"dischargeinformation","menuJump":"列表","tableName":"dischargeinformation"}],"menu":"dischargeinformation管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除"],"menu":"druginformation","menuJump":"列表","tableName":"druginformation"}],"menu":"druginformation管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","修改","删除"],"menu":"medicationinformation","menuJump":"列表","tableName":"medicationinformation"}],"menu":"medicationinformation管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-similar","buttons":["新增","查看","修改","删除"],"menu":"新闻资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看"],"menu":"doctor","menuJump":"列表","tableName":"doctor"}],"menu":"doctor模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"nurse","menuJump":"列表","tableName":"nurse"}],"menu":"nurse模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","新增","修改","删除"],"menu":"patient","menuJump":"列表","tableName":"patient"}],"menu":"patient管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看"],"menu":"doctor","menuJump":"列表","tableName":"doctor"}],"menu":"doctor管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看"],"menu":"nurse","menuJump":"列表","tableName":"nurse"}],"menu":"nurse管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["新增","查看","修改","出院"],"menu":"inpatientregistration","menuJump":"列表","tableName":"inpatientregistration"}],"menu":"inpatientregistration管理"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看"],"menu":"bedinformation","menuJump":"列表","tableName":"bedinformation"}],"menu":"bedinformation管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看"],"menu":"nursinginformation","menuJump":"列表","tableName":"nursinginformation"}],"menu":"nursinginformation管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看","修改"],"menu":"dischargeinformation","menuJump":"列表","tableName":"dischargeinformation"}],"menu":"dischargeinformation管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看","用药记录"],"menu":"druginformation","menuJump":"列表","tableName":"druginformation"}],"menu":"druginformation管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看"],"menu":"medicationinformation","menuJump":"列表","tableName":"medicationinformation"}],"menu":"medicationinformation管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看"],"menu":"doctor","menuJump":"列表","tableName":"doctor"}],"menu":"doctor模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"nurse","menuJump":"列表","tableName":"nurse"}],"menu":"nurse模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"否","roleName":"doctor","tableName":"doctor"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看"],"menu":"patient","menuJump":"列表","tableName":"patient"}],"menu":"patient管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看"],"menu":"doctor","menuJump":"列表","tableName":"doctor"}],"menu":"doctor管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看"],"menu":"nurse","menuJump":"列表","tableName":"nurse"}],"menu":"nurse管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看","护理"],"menu":"inpatientregistration","menuJump":"列表","tableName":"inpatientregistration"}],"menu":"inpatientregistration管理"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看","修改"],"menu":"bedinformation","menuJump":"列表","tableName":"bedinformation"}],"menu":"bedinformation管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看"],"menu":"nursinginformation","menuJump":"列表","tableName":"nursinginformation"}],"menu":"nursinginformation管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["查看"],"menu":"dischargeinformation","menuJump":"列表","tableName":"dischargeinformation"}],"menu":"dischargeinformation管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看"],"menu":"doctor","menuJump":"列表","tableName":"doctor"}],"menu":"doctor模块"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"nurse","menuJump":"列表","tableName":"nurse"}],"menu":"nurse模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"否","roleName":"nurse","tableName":"nurse"}];
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
