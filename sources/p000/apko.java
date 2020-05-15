package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import java.io.PrintWriter;

/* renamed from: apko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apko implements apkq {

    /* renamed from: a */
    public int f84621a;

    /* renamed from: b */
    private final bnhe f84622b;

    /* renamed from: c */
    private final Context f84623c;

    public apko(Context context) {
        bnha bnha = new bnha();
        bnha.mo67695b(3, new apkn(this, 2, bngx.m109376e()));
        bnha.mo67695b(7, new apkn(this, 1, bngx.m109356a((Object) 11)));
        this.f84622b = bnha.mo67618b();
        this.f84623c = context;
    }

    /* renamed from: a */
    public final ConnectivityManager mo47370a() {
        return (ConnectivityManager) this.f84623c.getSystemService("connectivity");
    }

    /* renamed from: a */
    public final synchronized void mo47371a(Context context, int i) {
        apkn apkn = (apkn) this.f84622b.get(Integer.valueOf(i));
        if (apkn != null) {
            this.f84621a |= apkn.f84617a;
            apkn.mo47368a(mo47370a());
        }
    }

    /* renamed from: a */
    public final synchronized void mo47372a(PrintWriter printWriter) {
        apkp.m70538a(printWriter, this.f84621a);
    }
}
