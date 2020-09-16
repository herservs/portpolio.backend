'use strict';

export default class Bbs {

    moveBbs() {
        console.log('bbs.do');
        
        location.href = "/bbs/bbs.do";
             
    }

    moveMain() {
        console.log('main.do');
        location.href = "/main/main.do";
    }

    moveFree() {
        console.log('free.do');
        location.href = "/bbs/free.do";
    }

    moveVisit() {
        console.log('visit.do');
        location.href = "/bbs/visit.do";
    }
}