package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: chvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chvi extends chsz {

    /* renamed from: a */
    public final chsz f189262a;

    /* renamed from: b */
    public final Context f189263b;

    /* renamed from: c */
    public final ConnectivityManager f189264c;

    /* renamed from: d */
    private final Object f189265d = new Object();

    /* renamed from: e */
    private Runnable f189266e;

    public chvi(chsz chsz, Context context) {
        this.f189262a = chsz;
        this.f189263b = context;
        if (context != null) {
            this.f189264c = (ConnectivityManager) context.getSystemService("connectivity");
            try {
                int i = Build.VERSION.SDK_INT;
                if (this.f189264c == null) {
                    chvh chvh = new chvh(this);
                    this.f189263b.registerReceiver(chvh, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.f189266e = new chvf(this, chvh);
                    return;
                }
                chvg chvg = new chvg(this);
                this.f189264c.registerDefaultNetworkCallback(chvg);
                this.f189266e = new chve(this, chvg);
            } catch (SecurityException e) {
                Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e);
            }
        } else {
            this.f189264c = null;
        }
    }

    /* renamed from: b */
    private final void m149630b() {
        synchronized (this.f189265d) {
            Runnable runnable = this.f189266e;
            if (runnable != null) {
                runnable.run();
                this.f189266e = null;
            }
        }
    }

    /* renamed from: a */
    public final chqs mo70053a(chtv chtv, chqo chqo) {
        return this.f189262a.mo70053a(chtv, chqo);
    }

    /* renamed from: c */
    public final chsz mo85624c() {
        m149630b();
        return this.f189262a.mo85624c();
    }

    /* renamed from: d */
    public final boolean mo85625d() {
        return this.f189262a.mo85625d();
    }

    /* renamed from: e */
    public final chsz mo85626e() {
        m149630b();
        return this.f189262a.mo85626e();
    }

    /* renamed from: f */
    public final void mo85627f() {
        this.f189262a.mo85627f();
    }

    /* renamed from: g */
    public final void mo85628g() {
        this.f189262a.mo85628g();
    }

    /* renamed from: a */
    public final String mo70054a() {
        return this.f189262a.mo70054a();
    }

    /* renamed from: a */
    public final boolean mo85623a(long j, TimeUnit timeUnit) {
        return this.f189262a.mo85623a(j, timeUnit);
    }
}
