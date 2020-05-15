package com.google.android.gms.ads.adinfo;

import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.util.future.C0645d;

/* renamed from: com.google.android.gms.ads.adinfo.a */
final /* synthetic */ class C0183a implements bqeh {

    /* renamed from: a */
    private final C0191i f7825a;

    /* renamed from: b */
    private final String f7826b;

    /* renamed from: c */
    private final PackageInfo f7827c;

    public C0183a(C0191i iVar, String str, PackageInfo packageInfo) {
        this.f7825a = iVar;
        this.f7826b = str;
        this.f7827c = packageInfo;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bqgg bqgg;
        C0191i iVar = this.f7825a;
        String str = this.f7826b;
        PackageInfo packageInfo = this.f7827c;
        bqgg a = bqga.m112775a(str);
        if (iVar.f7837b == null) {
            return a;
        }
        bqgg[] bqggArr = new bqgg[2];
        if (((Boolean) C0371o.f8194H.mo6604a()).booleanValue()) {
            bqgg = bqga.m112775a((Object) null);
        } else {
            bqgg = bqdf.m112620a(bqdx.m112673a(iVar.mo6380a(rpr.m34216b()), C0187e.f7831a, C0645d.f8977e), Throwable.class, C0188f.f7832a, C0645d.f8977e);
        }
        bqggArr[0] = bqgg;
        bqggArr[1] = C0645d.f8973a.mo25819b(new C0189g(iVar, packageInfo));
        return bqdx.m112673a(bqga.m112779a(bqggArr), new C0190h(str), C0645d.f8977e);
    }
}
