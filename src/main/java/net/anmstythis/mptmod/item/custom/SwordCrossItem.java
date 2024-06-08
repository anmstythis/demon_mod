package net.anmstythis.mptmod.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class SwordCrossItem extends SwordItem {

    //параметры инструмента, урон, скорость, свойства предмета
    public SwordCrossItem(Tier tier, int damage, float speed, Properties properties) {
        super(tier, damage, speed, properties);
    }

    //урон врагу.
    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 200), attacker); //добавление эффекта. эффект парение, длительность 200 мс
        return super.hurtEnemy(stack, target, attacker);
    }

}
