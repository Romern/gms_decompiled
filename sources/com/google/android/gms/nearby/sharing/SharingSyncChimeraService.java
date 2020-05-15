package com.google.android.gms.nearby.sharing;

import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SharingSyncChimeraService extends aeah {
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("SharingSyncChimeraService periodic task firing now.");
        Intent intent = new Intent("com.google.android.gms.nearby.sharing.SYNC_SERVER");
        intent.setPackage(getPackageName());
        ahhd.m55768a(this, intent);
        return 0;
    }
}
