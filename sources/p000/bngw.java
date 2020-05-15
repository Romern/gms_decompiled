package p000;

import java.util.List;

/* renamed from: bngw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bngw extends bngx {

    /* renamed from: a */
    final transient int f131609a;

    /* renamed from: b */
    final transient int f131610b;

    /* renamed from: c */
    final /* synthetic */ bngx f131611c;

    public bngw(bngx bngx, int i, int i2) {
        this.f131611c = bngx;
        this.f131609a = i;
        this.f131610b = i2;
    }

    /* renamed from: a */
    public final bngx mo67669a(int i, int i2) {
        bmxy.m108585a(i, i2, this.f131610b);
        bngx bngx = this.f131611c;
        int i3 = this.f131609a;
        return bngx.subList(i + i3, i2 + i3);
    }

    /* renamed from: b */
    public final Object[] mo67634b() {
        return this.f131611c.mo67634b();
    }

    /* renamed from: c */
    public final int mo67635c() {
        return this.f131611c.mo67635c() + this.f131609a;
    }

    /* renamed from: f */
    public final int mo67638f() {
        return this.f131611c.mo67635c() + this.f131609a + this.f131610b;
    }

    public final Object get(int i) {
        bmxy.m108584a(i, this.f131610b);
        return this.f131611c.get(i + this.f131609a);
    }

    /* renamed from: h */
    public final boolean mo67640h() {
        return true;
    }

    public final int size() {
        return this.f131610b;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
