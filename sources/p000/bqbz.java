package p000;

/* renamed from: bqbz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqbz {

    /* renamed from: a */
    final String f140446a;

    /* renamed from: b */
    int f140447b = 0;

    public bqbz(String str) {
        this.f140446a = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final char mo69016a() {
        bmxy.m108600b(mo69020b());
        return this.f140446a.charAt(this.f140447b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo69019b(bmwx bmwx) {
        int i = this.f140447b;
        String a = mo69017a(bmwx);
        bmxy.m108600b(this.f140447b != i);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo69017a(bmwx bmwx) {
        bmxy.m108600b(mo69020b());
        int i = this.f140447b;
        this.f140447b = bmwx.mo66832a().mo66831a(this.f140446a, i);
        return mo69020b() ? this.f140446a.substring(i, this.f140447b) : this.f140446a.substring(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo69020b() {
        int i = this.f140447b;
        return i >= 0 && i < this.f140446a.length();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo69018a(char c) {
        bmxy.m108600b(mo69020b());
        bmxy.m108600b(mo69016a() == c);
        this.f140447b++;
    }
}
