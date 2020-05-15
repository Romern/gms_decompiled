package p000;

import android.os.Bundle;

/* renamed from: agke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agke implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f65776a;

    /* renamed from: b */
    final /* synthetic */ String f65777b;

    /* renamed from: c */
    final /* synthetic */ long f65778c;

    /* renamed from: d */
    final /* synthetic */ Bundle f65779d;

    /* renamed from: e */
    final /* synthetic */ String f65780e;

    /* renamed from: f */
    final /* synthetic */ agkm f65781f;

    public agke(agkm agkm, String str, String str2, long j, Bundle bundle, String str3) {
        this.f65781f = agkm;
        this.f65776a = str;
        this.f65777b = str2;
        this.f65778c = j;
        this.f65779d = bundle;
        this.f65780e = str3;
    }

    public final void run() {
        this.f65781f.mo35568a(this.f65776a, this.f65777b, this.f65778c, this.f65779d, this.f65780e);
    }
}
