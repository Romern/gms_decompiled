package com.google.android.libraries.matchstick.data;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AvatarManager$AvatarUpdateEventReceiver extends aacn {
    public AvatarManager$AvatarUpdateEventReceiver() {
        super("matchstick");
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        Parcelable parcelableExtra = intent.getParcelableExtra("local_entity_id_extra");
        if (LocalEntityId.class.isInstance(parcelableExtra)) {
            azcj.m85279a(context).mo54625a((LocalEntityId) parcelableExtra);
            return;
        }
        azoj.m85932b("AvatarManager", "LocalEntityId data corrupted.", new Object[0]);
    }
}
