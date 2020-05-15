package p000;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* renamed from: bljl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bljl {

    /* renamed from: a */
    public ExecutorService f126677a;

    /* renamed from: b */
    public bqgk f126678b;

    /* renamed from: c */
    public final Set f126679c = new HashSet();

    /* renamed from: d */
    public boolean f126680d = false;

    /* renamed from: e */
    public blkc f126681e;

    /* renamed from: f */
    public blkb f126682f;

    /* renamed from: g */
    public bmxv f126683g = bmvz.f131120a;

    /* renamed from: h */
    public int f126684h = 2;

    /* renamed from: i */
    private final Set f126685i = new HashSet();

    /* renamed from: a */
    public final bljj mo66594a() {
        bljn bljn;
        aytg aytg = new aytg();
        if (this.f126680d) {
            ExecutorService executorService = this.f126677a;
            bmxy.m108581a(executorService);
            blii blii = new blii(executorService);
            bqgk bqgk = this.f126678b;
            bmxy.m108581a(bqgk);
            bljk bljk = new bljk(this);
            blkc blkc = this.f126681e;
            bmxy.m108581a(blkc);
            bmxy.m108581a(this.f126682f);
            bljn = new bljq(blii, aytg, bqgk, bljk, blkc, new blir(), this.f126683g);
        } else {
            bljn = new bliv();
        }
        return new bljj(bljn, this.f126685i, this.f126684h);
    }

    /* renamed from: a */
    public final void mo66595a(bljm bljm) {
        this.f126679c.add(bljm);
    }
}
