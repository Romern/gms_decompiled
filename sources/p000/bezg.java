package p000;

import java.util.BitSet;

/* renamed from: bezg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bezg extends bezi {

    /* renamed from: a */
    private final float f113126a;

    /* renamed from: b */
    private final double f113127b;

    /* renamed from: c */
    private final double f113128c;

    /* renamed from: d */
    private final int f113129d;

    /* renamed from: e */
    private final int f113130e;

    /* renamed from: f */
    private final double f113131f;

    /* renamed from: g */
    private final bezk f113132g;

    /* renamed from: h */
    private final BitSet f113133h;

    /* renamed from: i */
    private final BitSet f113134i;

    /* renamed from: j */
    private final short[] f113135j;

    public bezg(bezh bezh) {
        boolean z;
        this.f113127b = bezh.f113137b;
        this.f113128c = bezh.f113138c;
        this.f113129d = bezh.f113139d;
        this.f113130e = bezh.f113140e;
        this.f113131f = bezh.f113141f;
        this.f113132g = bezh.f113136a;
        this.f113133h = bezh.f113142g;
        this.f113134i = bezh.f113143h;
        short[] sArr = bezh.f113144i;
        this.f113135j = sArr;
        if (sArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        short s = sArr[0];
        for (int i = 1; i < sArr.length; i++) {
            short s2 = sArr[i];
            if (s2 > s) {
                s = s2;
            }
        }
        this.f113126a = bezi.m96134a(s);
    }

    /* renamed from: a */
    public final float mo61273a() {
        return this.f113126a;
    }

    /* renamed from: b */
    public final double mo61275b() {
        return this.f113127b;
    }

    /* renamed from: c */
    public final double mo61277c() {
        return this.f113128c;
    }

    /* renamed from: d */
    public final int mo61278d() {
        return this.f113129d;
    }

    /* renamed from: e */
    public final int mo61279e() {
        return this.f113130e;
    }

    /* renamed from: f */
    public final double mo61280f() {
        return this.f113131f;
    }

    /* renamed from: g */
    public final bezk mo61281g() {
        return this.f113132g;
    }

    /* renamed from: a */
    public final bznr mo61274a(int i) {
        if (this.f113134i.get(i)) {
            return !this.f113133h.get(i) ? bznr.CLUTTER_OPEN : bznr.CLUTTER_BUILDING;
        }
        return bznr.CLUTTER_UNKNOWN;
    }

    /* renamed from: b */
    public final float mo61276b(int i) {
        return bezi.m96134a(this.f113135j[i]);
    }
}
