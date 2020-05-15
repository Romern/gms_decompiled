package p000;

import android.content.Context;

/* renamed from: azgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azgk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f99275a;

    /* renamed from: b */
    final /* synthetic */ String f99276b;

    /* renamed from: c */
    final /* synthetic */ boolean f99277c;

    /* renamed from: d */
    final /* synthetic */ boolean f99278d;

    public azgk(Context context, String str, boolean z, boolean z2) {
        this.f99275a = context;
        this.f99276b = str;
        this.f99277c = z;
        this.f99278d = z2;
    }

    public final void run() {
        azan.m85141a(this.f99275a).mo54539a(this.f99276b, this.f99277c, this.f99278d);
    }
}
