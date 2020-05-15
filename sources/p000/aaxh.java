package p000;

import android.content.Context;
import com.android.volley.Response;
import com.google.android.gms.googlehelp.common.HelpConfig;

/* renamed from: aaxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aaxh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Context f56756a;

    /* renamed from: b */
    final /* synthetic */ HelpConfig f56757b;

    /* renamed from: c */
    final /* synthetic */ abcr f56758c;

    /* renamed from: d */
    final /* synthetic */ long f56759d;

    /* renamed from: e */
    final /* synthetic */ Response.Listener f56760e;

    /* renamed from: f */
    final /* synthetic */ Response.ErrorListener f56761f;

    public aaxh(Context context, HelpConfig helpConfig, abcr abcr, long j, Response.Listener listener, Response.ErrorListener errorListener) {
        this.f56756a = context;
        this.f56757b = helpConfig;
        this.f56758c = abcr;
        this.f56759d = j;
        this.f56760e = listener;
        this.f56761f = errorListener;
    }

    public final void run() {
        aaxl.m47163a(this.f56756a, this.f56757b, this.f56758c, this.f56759d, (String) null, this.f56760e, this.f56761f);
    }
}
