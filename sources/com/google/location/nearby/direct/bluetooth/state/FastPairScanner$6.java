package com.google.location.nearby.direct.bluetooth.state;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FastPairScanner$6 extends aacn {

    /* renamed from: a */
    final /* synthetic */ buyc f191767a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FastPairScanner$6(buyc buyc, String str) {
        super(str);
        this.f191767a = buyc;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (intent.getAction().equals("com.google.android.gms.nearby.ACTION_FAST_PAIR_CONNECTED")) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68390d();
            bnsl.mo68432a("com.google.location.nearby.direct.bluetooth.state.FastPairScanner$6", "a", 257, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Change connect status and change mode connect");
            buyc buyc = this.f191767a;
            int i = buyc.f155286l;
            buyc.f155294g = true;
        }
        if (intent.getAction().equals("com.google.android.gms.nearby.ACTION_FAST_PAIR_DISCONNECTED")) {
            bnsl bnsl2 = (bnsl) bvcm.f155598a.mo68390d();
            bnsl2.mo68432a("com.google.location.nearby.direct.bluetooth.state.FastPairScanner$6", "a", 261, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Change connect status and change mode disconnect");
            buyc buyc2 = this.f191767a;
            int i2 = buyc.f155286l;
            buyc2.f155294g = false;
        }
        buyc buyc3 = this.f191767a;
        int i3 = buyc.f155286l;
        if (buyc3.mo73249c()) {
            buyc buyc4 = this.f191767a;
            buyc4.f155288a.mo72987c(buyc4.f155297j);
        }
    }
}
