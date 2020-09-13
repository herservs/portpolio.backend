'use strict';

import Bbs from './bbs.js';

const bbs = new Bbs();

const bbsNavbarMenu = document.querySelector('.bbs__navbar__menu');
bbsNavbarMenu.addEventListener('click', (event) => {

    const target = event.target;
    const link = target.dataset.link;

    console.log('bbsNavbarMenu 1');

    if (link == null) {
        console.log('bbsNavbarMenu 2');
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

/*
const bbsNavbarLogo = document.querySelector('.bbs__navbar__logo');
bbsNavbarLogo.addEventListener('click', (event) => {

    const target = event.target;
    const link = target.dataset.link;

    console.log('bbsNavbarLogo');

    if (link == null) {
        console.log('bbsNavbarLogo null');
        return;
    }

    console.log('bbsNavbarLogo good');

    if (link === '#home') {
        bbs.moveMain();
    }
});

*/