package com.github.yimeng261.maidspell.api;

import com.github.tartaricacid.touhoulittlemaid.api.bauble.IMaidBauble;
import com.github.tartaricacid.touhoulittlemaid.entity.passive.EntityMaid;

public interface IExtendBauble extends IMaidBauble {
    public void onRemove(EntityMaid maid);

}
