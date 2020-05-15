package p000;

import java.util.BitSet;

@Deprecated
/* renamed from: bezj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bezj extends bezi {

    /* renamed from: a */
    public double f113145a;

    /* renamed from: b */
    public double f113146b;

    /* renamed from: c */
    public int f113147c;

    /* renamed from: d */
    public int f113148d;

    /* renamed from: e */
    public double f113149e;

    /* renamed from: f */
    public short[] f113150f = new short[0];

    /* renamed from: g */
    public float f113151g;

    /* renamed from: h */
    public bezk f113152h;

    /* renamed from: i */
    public BitSet f113153i = new BitSet();

    /* renamed from: j */
    public BitSet f113154j = new BitSet();

    /* renamed from: a */
    public final float mo61273a() {
        if (Float.isNaN(this.f113151g)) {
            this.f113151g = -999999.0f;
            for (int i = 0; i < mo61290h(); i++) {
                this.f113151g = Math.max(mo61276b(i), this.f113151g);
            }
        }
        return this.f113151g;
    }

    /* renamed from: b */
    public final double mo61275b() {
        return this.f113145a;
    }

    /* renamed from: c */
    public final double mo61277c() {
        return this.f113146b;
    }

    /* renamed from: d */
    public final int mo61278d() {
        return this.f113147c;
    }

    /* renamed from: e */
    public final int mo61279e() {
        return this.f113148d;
    }

    /* renamed from: f */
    public final double mo61280f() {
        return this.f113149e;
    }

    /* renamed from: g */
    public final bezk mo61281g() {
        return this.f113152h;
    }

    /* renamed from: b */
    public final float mo61276b(int i) {
        return bezi.m96134a(this.f113150f[i]);
    }

    /* renamed from: a */
    public final bznr mo61274a(int i) {
        if (this.f113154j.get(i)) {
            return !this.f113153i.get(i) ? bznr.CLUTTER_OPEN : bznr.CLUTTER_BUILDING;
        }
        return bznr.CLUTTER_UNKNOWN;
    }
}
