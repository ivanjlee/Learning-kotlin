package com.learning.strategy.game;

/**
 * no weapon
 *
 * @author  Ivan on 2018-05-23 23:27.
 * @version v0.1
 * @since   v1.0
 */
class NoWeapon implements Weapon {

    @Override
    public void useWeapon() {
        System.out.println("no weapon behavior");
    }
}