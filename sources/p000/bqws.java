package p000;

import java.util.Map;

/* renamed from: bqws */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqws extends bqxt {

    /* renamed from: a */
    private final int f141759a;

    /* renamed from: b */
    private final int f141760b;

    /* renamed from: c */
    private final int f141761c;

    /* renamed from: d */
    private final bqxo f141762d;

    /* renamed from: e */
    private final Map f141763e;

    /* renamed from: f */
    private final int f141764f;

    /* renamed from: g */
    private final bqxu f141765g;

    /* renamed from: h */
    private final int f141766h;

    public bqws(int i, int i2, int i3, bqxo bqxo, Map map, int i4, bqxu bqxu, int i5) {
        this.f141759a = i;
        this.f141760b = i2;
        this.f141761c = i3;
        this.f141762d = bqxo;
        this.f141763e = map;
        this.f141764f = i4;
        this.f141765g = bqxu;
        this.f141766h = i5;
    }

    /* renamed from: a */
    public final int mo69386a() {
        return this.f141759a;
    }

    /* renamed from: b */
    public final int mo69387b() {
        return this.f141760b;
    }

    /* renamed from: c */
    public final int mo69388c() {
        return this.f141761c;
    }

    /* renamed from: d */
    public final bqxo mo69389d() {
        return this.f141762d;
    }

    /* renamed from: e */
    public final Map mo69390e() {
        return this.f141763e;
    }

    public final boolean equals(Object obj) {
        bqxo bqxo;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqxt) {
            bqxt bqxt = (bqxt) obj;
            return this.f141759a == bqxt.mo69386a() && this.f141760b == bqxt.mo69387b() && this.f141761c == bqxt.mo69388c() && ((bqxo = this.f141762d) == null ? bqxt.mo69389d() == null : bqxo.equals(bqxt.mo69389d())) && this.f141763e.equals(bqxt.mo69390e()) && this.f141764f == bqxt.mo69392f() && this.f141765g.equals(bqxt.mo69393g()) && this.f141766h == bqxt.mo69394h();
        }
    }

    /* renamed from: f */
    public final int mo69392f() {
        return this.f141764f;
    }

    /* renamed from: g */
    public final bqxu mo69393g() {
        return this.f141765g;
    }

    /* renamed from: h */
    public final int mo69394h() {
        return this.f141766h;
    }

    public final int hashCode() {
        int i;
        int i2 = (((((this.f141759a ^ 1000003) * 1000003) ^ this.f141760b) * 1000003) ^ this.f141761c) * 1000003;
        bqxo bqxo = this.f141762d;
        if (bqxo != null) {
            i = bqxo.hashCode();
        } else {
            i = 0;
        }
        return ((((((((i2 ^ i) * 1000003) ^ this.f141763e.hashCode()) * 1000003) ^ this.f141764f) * 1000003) ^ this.f141765g.hashCode()) * 1000003) ^ this.f141766h;
    }
}
