package com.google.android.gms.ads.internal.appcontent;

import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.flag.C0394g;
import com.google.android.gms.ads.internal.util.client.C0633h;

/* renamed from: com.google.android.gms.ads.internal.appcontent.e */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0314e extends Thread {

    /* renamed from: a */
    public boolean f8076a = false;

    /* renamed from: b */
    public final Object f8077b = new Object();

    /* renamed from: c */
    private boolean f8078c = false;

    /* renamed from: d */
    private final int f8079d;

    public C0314e() {
        new C0310a();
        ((Long) C0394g.f8331d.mo6621a()).intValue();
        ((Long) C0394g.f8328a.mo6621a()).intValue();
        ((Long) C0394g.f8332e.mo6621a()).intValue();
        ((Long) C0394g.f8330c.mo6621a()).intValue();
        ((Integer) C0371o.f8257j.mo6604a()).intValue();
        ((Integer) C0371o.f8258k.mo6604a()).intValue();
        ((Integer) C0371o.f8259l.mo6604a()).intValue();
        this.f8079d = ((Long) C0394g.f8333f.mo6621a()).intValue();
        String str = (String) C0371o.f8260m.mo6604a();
        ((Boolean) C0371o.f8261n.mo6604a()).booleanValue();
        ((Boolean) C0371o.f8262o.mo6604a()).booleanValue();
        ((Boolean) C0371o.f8263p.mo6604a()).booleanValue();
        setName("ContentFetchTask");
    }

    public final void run() {
        while (true) {
            try {
                C0313d c = C0387d.m5365c();
                synchronized (c.f8074a) {
                    if (c.f8075b != null) {
                    }
                }
            } catch (Throwable th) {
                try {
                    C0387d.m5366d().mo6783a(th, "ContentFetchTask.isInForeground");
                } catch (InterruptedException e) {
                    C0633h.m5669b("Error in ContentFetchTask", e);
                } catch (Exception e2) {
                    C0633h.m5669b("Error in ContentFetchTask", e2);
                    C0387d.m5366d().mo6783a(e2, "ContentFetchTask.run");
                }
            }
            C0633h.m5664a("ContentFetchTask: sleeping");
            synchronized (this.f8077b) {
                this.f8078c = true;
                StringBuilder sb = new StringBuilder(42);
                sb.append("ContentFetchThread: paused, mPause = ");
                sb.append(true);
                C0633h.m5664a(sb.toString());
            }
            Thread.sleep((long) (this.f8079d * 1000));
            synchronized (this.f8077b) {
                while (this.f8078c) {
                    try {
                        C0633h.m5664a("ContentFetchTask: waiting");
                        this.f8077b.wait();
                    } catch (InterruptedException e3) {
                    }
                }
            }
        }
    }
}
