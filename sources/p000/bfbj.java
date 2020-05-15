package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bfbj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfbj {

    /* renamed from: a */
    public final AtomicInteger f113306a = new AtomicInteger(0);

    /* renamed from: b */
    public final bezz f113307b;

    /* renamed from: c */
    public final ArrayList f113308c = new ArrayList();

    /* renamed from: d */
    public final bfbi f113309d = new bfbi();

    /* renamed from: e */
    public final double f113310e;

    /* renamed from: f */
    public final double f113311f;

    /* renamed from: g */
    public final int f113312g;

    /* renamed from: h */
    public final boolean f113313h;

    /* renamed from: i */
    public final boolean f113314i;

    /* renamed from: j */
    public final double f113315j;

    /* renamed from: k */
    public Map f113316k = new HashMap();

    /* renamed from: l */
    public float[] f113317l = new float[0];

    /* renamed from: m */
    public double f113318m;

    /* renamed from: n */
    public double f113319n;

    /* renamed from: o */
    public int f113320o;

    /* renamed from: p */
    public int f113321p;

    /* renamed from: q */
    public final beyh f113322q;

    public bfbj(beyh beyh, double d, double d2, int i, boolean z, boolean z2, double d3, bezz bezz) {
        this.f113307b = bezz;
        this.f113322q = beyh;
        this.f113310e = d;
        this.f113311f = d2;
        this.f113312g = i;
        this.f113313h = z;
        this.f113314i = z2;
        this.f113315j = d3;
    }

    /* renamed from: a */
    public final void mo61363a() {
        this.f113306a.incrementAndGet();
        this.f113308c.clear();
        this.f113308c.trimToSize();
        this.f113309d.f113305a.clear();
        this.f113316k = new HashMap();
        this.f113317l = new float[0];
        this.f113307b.mo61323k();
    }
}
