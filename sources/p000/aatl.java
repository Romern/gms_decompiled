package p000;

import android.content.Context;
import com.android.volley.Response;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: aatl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aatl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f56549a;

    /* renamed from: b */
    final /* synthetic */ HelpConfig f56550b;

    /* renamed from: c */
    final /* synthetic */ abcr f56551c;

    /* renamed from: d */
    final /* synthetic */ String f56552d;

    /* renamed from: e */
    final /* synthetic */ String f56553e;

    /* renamed from: f */
    final /* synthetic */ String f56554f;

    /* renamed from: g */
    final /* synthetic */ Response.Listener f56555g;

    /* renamed from: h */
    final /* synthetic */ Response.ErrorListener f56556h;

    public aatl(Context context, HelpConfig helpConfig, abcr abcr, String str, String str2, String str3, Response.Listener listener, Response.ErrorListener errorListener) {
        this.f56549a = context;
        this.f56550b = helpConfig;
        this.f56551c = abcr;
        this.f56552d = str;
        this.f56553e = str2;
        this.f56554f = str3;
        this.f56555g = listener;
        this.f56556h = errorListener;
    }

    public final void run() {
        aatm.m46988a(this.f56549a, this.f56550b, this.f56551c, this.f56552d, this.f56553e, this.f56554f, null, this.f56555g, this.f56556h);
    }
}
