package p000;

import java.io.File;
import java.util.List;

/* renamed from: cex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cex implements cfb, cds {

    /* renamed from: a */
    private final List f6633a;

    /* renamed from: b */
    private final cfc f6634b;

    /* renamed from: c */
    private final cfa f6635c;

    /* renamed from: d */
    private int f6636d = -1;

    /* renamed from: e */
    private cdg f6637e;

    /* renamed from: f */
    private List f6638f;

    /* renamed from: g */
    private int f6639g;

    /* renamed from: h */
    private volatile cjp f6640h;

    /* renamed from: i */
    private File f6641i;

    public cex(List list, cfc cfc, cfa cfa) {
        this.f6633a = list;
        this.f6634b = cfc;
        this.f6635c = cfa;
    }

    /* renamed from: c */
    private final boolean m4087c() {
        return this.f6639g < this.f6638f.size();
    }

    /* renamed from: a */
    public final void mo3761a(Exception exc) {
        this.f6635c.mo3792a(this.f6637e, exc, this.f6640h.f6950c, 3);
    }

    /* renamed from: b */
    public final void mo3789b() {
        cjp cjp = this.f6640h;
        if (cjp != null) {
            cjp.f6950c.mo3754c();
        }
    }

    /* renamed from: a */
    public final void mo3762a(Object obj) {
        this.f6635c.mo3793a(this.f6637e, obj, this.f6640h.f6950c, 3, this.f6637e);
    }

    /* renamed from: a */
    public final boolean mo3788a() {
        while (true) {
            boolean z = false;
            if (this.f6638f != null && m4087c()) {
                this.f6640h = null;
                while (!z && m4087c()) {
                    List list = this.f6638f;
                    int i = this.f6639g;
                    this.f6639g = i + 1;
                    File file = this.f6641i;
                    cfc cfc = this.f6634b;
                    this.f6640h = ((cjq) list.get(i)).mo3930a(file, cfc.f6653e, cfc.f6654f, cfc.f6656h);
                    if (this.f6640h != null && this.f6634b.mo3797a(this.f6640h.f6950c.mo3747a())) {
                        this.f6640h.f6950c.mo3751a(this.f6634b.f6662n, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f6636d + 1;
            this.f6636d = i2;
            if (i2 >= this.f6633a.size()) {
                return false;
            }
            cdg cdg = (cdg) this.f6633a.get(this.f6636d);
            File a = this.f6634b.mo3795a().mo3902a(new cey(cdg, this.f6634b.f6661m));
            this.f6641i = a;
            if (a != null) {
                this.f6637e = cdg;
                this.f6638f = this.f6634b.mo3796a(a);
                this.f6639g = 0;
            }
        }
    }
}
