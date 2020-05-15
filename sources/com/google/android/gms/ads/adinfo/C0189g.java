package com.google.android.gms.ads.adinfo;

import android.content.pm.PackageInfo;
import com.google.ads.afma.proto2api.C0152c;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.util.client.C0633h;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.adinfo.g */
final /* synthetic */ class C0189g implements Callable {

    /* renamed from: a */
    private final C0191i f7833a;

    /* renamed from: b */
    private final PackageInfo f7834b;

    public C0189g(C0191i iVar, PackageInfo packageInfo) {
        this.f7833a = iVar;
        this.f7834b = packageInfo;
    }

    public final Object call() {
        C0191i iVar = this.f7833a;
        PackageInfo packageInfo = this.f7834b;
        try {
            C0152c a = aags.m21239a(iVar.f7836a, packageInfo.packageName, Long.toString((long) packageInfo.versionCode));
            if (a.f7532o.isEmpty()) {
                return null;
            }
            return a;
        } catch (Throwable th) {
            C0633h.m5664a("Failed to get gmscore side info.");
            C0387d.m5366d().mo6783a(th, "SignalsDecorator.maybeGetSignals");
            return null;
        }
    }
}
