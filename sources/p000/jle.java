package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: jle */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jle extends jmh {

    /* renamed from: a */
    public static final sek f22738a = jsy.m17256a("ExecutorLocalDeviceDataFetcher");

    /* renamed from: b */
    public final List f22739b;

    /* renamed from: c */
    public final Object f22740c;

    /* renamed from: d */
    public byte[] f22741d;

    /* renamed from: e */
    public List f22742e;

    /* renamed from: f */
    public boolean f22743f;

    /* renamed from: g */
    public boolean f22744g;

    /* renamed from: h */
    public boolean f22745h = false;

    /* renamed from: i */
    private final bqgj f22746i;

    public jle() {
        bqgj a = snp.m35702a(10);
        this.f22746i = bqgs.m112811a((ExecutorService) a);
        this.f22739b = new ArrayList();
        this.f22740c = new Object();
    }

    /* renamed from: a */
    public final void mo13848a(jmg jmg) {
        synchronized (this.f22740c) {
            this.f22739b.add(jmg);
            if (!this.f22745h) {
                this.f22745h = true;
                this.f22741d = null;
                this.f22742e = null;
                this.f22743f = false;
                this.f22744g = false;
                bqga.m112779a(this.f22746i.mo25812a(new jlb(this)), this.f22746i.mo25812a(new jlc(this))).mo741a(new jld(this), bqfb.INSTANCE);
            }
        }
    }
}
