package p000;

/* renamed from: bic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bic extends Exception {

    /* renamed from: a */
    public bin f3290a;

    /* renamed from: b */
    public final short f3291b;

    public bic(bin bin) {
        super(bin.f3323e);
        this.f3291b = 28416;
        this.f3290a = bin;
    }

    public bic(String str) {
        super(str);
        this.f3291b = 28416;
    }

    public bic(short s) {
        this.f3291b = s;
        this.f3290a = bib.f3279i;
    }

    public bic(short s, bin bin) {
        this.f3291b = s;
        this.f3290a = bin;
    }
}
