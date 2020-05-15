package com.google.android.gms.magictether.host;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class HotspotEnabler$2 extends aacn {

    /* renamed from: a */
    final /* synthetic */ aki f79815a;

    /* renamed from: b */
    final /* synthetic */ boolean f79816b;

    /* renamed from: c */
    final /* synthetic */ ResultReceiver f79817c;

    /* renamed from: d */
    final /* synthetic */ afan f79818d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HotspotEnabler$2(afan afan, String str, aki aki, boolean z, ResultReceiver resultReceiver) {
        super(str);
        this.f79818d = afan;
        this.f79815a = aki;
        this.f79816b = z;
        this.f79817c = resultReceiver;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        this.f79815a.mo872a(this);
        afan afan = this.f79818d;
        boolean z = this.f79816b;
        ResultReceiver resultReceiver = this.f79817c;
        long j = afan.f64089a;
        afan.mo34714a(z, resultReceiver);
    }
}
