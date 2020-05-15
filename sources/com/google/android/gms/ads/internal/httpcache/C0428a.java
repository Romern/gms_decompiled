package com.google.android.gms.ads.internal.httpcache;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.ads.internal.C0317b;
import com.google.android.gms.ads.internal.reward.C0573a;

/* renamed from: com.google.android.gms.ads.internal.httpcache.a */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0428a extends C0317b {
    public C0428a(Context context, Looper looper, sac sac, sad sad) {
        super(C0573a.m5575a(context), looper, 166, sac, sad);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        if (queryLocalInterface instanceof C0436i) {
            return (C0436i) queryLocalInterface;
        }
        return new C0434g(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    /* renamed from: e */
    public final C0436i mo6628e() {
        return (C0436i) super.mo25289B();
    }
}
