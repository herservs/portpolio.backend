'use strict';

import Bbs from './bbs.js';

const bbs = new Bbs();

const bbsNavbarMenu = document.querySelector('.bbs__navbar__menu');
bbsNavbarMenu.addEventListener('click', (event) => {

    const target = event.target;
    const link = target.dataset.link;
    
    if (link == null) {        
        return;
    }

    if (link === '#home') {
        bbs.moveMain();
    }

    if (link === '#free') {
        bbs.moveFree();
    }

    if (link === '#visit') {
        bbs.moveVisit();
    }

    if (link === '#board') {
        bbs.moveBbs();
    }

});
