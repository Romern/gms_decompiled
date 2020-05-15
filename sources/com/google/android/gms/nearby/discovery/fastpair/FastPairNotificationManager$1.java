package com.google.android.gms.nearby.discovery.fastpair;

import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FastPairNotificationManager$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ String f80492a;

    /* renamed from: b */
    final /* synthetic */ String f80493b;

    /* renamed from: c */
    final /* synthetic */ ahyw f80494c;

    /* renamed from: d */
    final /* synthetic */ String f80495d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FastPairNotificationManager$1(String str, String str2, String str3, ahyw ahyw, String str4) {
        super(str);
        this.f80492a = str2;
        this.f80493b = str3;
        this.f80494c = ahyw;
        this.f80495d = str4;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("Send the device info to companion app %s", intent.getData().getSchemeSpecificPart());
        if (intent.getData().getSchemeSpecificPart().equals(this.f80492a)) {
            Intent a = ahvb.m56687a(context, this.f80492a, this.f80493b);
            ahyw ahyw = this.f80494c;
            if (ahyw != null) {
                aiad a2 = aiae.m56945a(context, ahyw);
                if (a2.f68557b == 2) {
                    a = a2.f68556a;
                    a.putExtra("com.google.android.gms.nearby.discovery:EXTRA_PRIVATE_BLE_ADDRESS", this.f80494c.f68400i);
                }
            }
            if (a != null) {
                a.addFlags(268435456);
                context.startActivity(a);
                ((ahsi) ahgz.m55754a(context, ahsi.class)).mo37018a(bvin.FAST_PAIR_POST_ACTION_LAUNCH_COMPANION_APP, this.f80495d, this.f80492a);
            }
            try {
                context.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
            }
        }
    }
}
