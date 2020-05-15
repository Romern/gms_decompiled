package com.google.android.gms.trustlet.onbody.internal;

import android.content.Intent;
import com.google.android.gms.trustlet.onbody.discovery.PromoteScreenLockAndOnbodyChimeraActivity;
import com.google.android.gms.trustlet.onbody.discovery.WebpageOnbodyPromotionChimeraActivity;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleInitializationIntentOperation extends qlf {

    /* renamed from: a */
    public static final aunx f109248a = new aunx("TrustAgent", "ModuleInitializationIntentOperation");

    /* renamed from: b */
    final Collection f109249b = Arrays.asList(auva.m77911d(), PromoteScreenLockAndOnbodyChimeraActivity.f109233c, WebpageOnbodyPromotionChimeraActivity.f109247a);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        for (aumh aumh : this.f109249b) {
            String a = aumh.mo50622a();
            if (aumh.mo50624c()) {
                bqga.m112781a(aumh.mo50623b(), new auvp(this, a), bqfb.INSTANCE);
            }
        }
    }
}
