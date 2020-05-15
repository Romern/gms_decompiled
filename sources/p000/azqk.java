package p000;

import java.lang.reflect.Method;

/* renamed from: azqk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azqk implements bqfp {

    /* renamed from: a */
    final /* synthetic */ Method f99890a;

    /* renamed from: b */
    final /* synthetic */ aztz f99891b;

    /* renamed from: c */
    final /* synthetic */ azql f99892c;

    public azqk(azql azql, Method method, aztz aztz) {
        this.f99892c = azql;
        this.f99890a = method;
        this.f99891b = aztz;
    }

    /* renamed from: a */
    public final void mo6480a(Object obj) {
        new Object[1][0] = this.f99890a.getName();
        azua e = azub.m86259e();
        e.mo55295a(this.f99891b.mo55228a());
        e.mo55296a(false);
        e.mo55294a(obj);
        this.f99892c.mo55225a(e.mo55293a());
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        azoj.m85931a("AsyncJsBridge", th, "Call to %s failed.", this.f99890a.getName());
        azph.m85998a(this.f99892c.f99895b).mo55126a(1717, 59);
        Throwable cause = th.getCause();
        String valueOf = String.valueOf(cause == null ? th.getMessage() : cause.getMessage());
        String str = valueOf.length() == 0 ? new String("Error in native method: ") : "Error in native method: ".concat(valueOf);
        azua e = azub.m86259e();
        e.mo55295a(this.f99891b.mo55228a());
        e.mo55296a(false);
        e.mo55297b(str);
        this.f99892c.mo55225a(e.mo55293a());
    }
}
