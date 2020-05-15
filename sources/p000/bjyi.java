package p000;

/* renamed from: bjyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjyi implements Runnable {

    /* renamed from: a */
    private final int f123626a;

    /* renamed from: b */
    private final bjyh f123627b;

    /* renamed from: c */
    private final String f123628c;

    /* renamed from: d */
    private final String f123629d;

    /* renamed from: e */
    private final bjym f123630e;

    /* renamed from: f */
    private final int f123631f;

    public bjyi(int i, bjyh bjyh, String str, String str2, bjym bjym, int i2) {
        this.f123626a = i;
        this.f123627b = bjyh;
        this.f123628c = str;
        this.f123629d = str2;
        this.f123630e = bjym;
        this.f123631f = i2;
    }

    public final void run() {
        int i = this.f123626a;
        if (i == 1) {
            this.f123627b.mo65403b(this.f123628c, this.f123630e);
        } else if (i == 2) {
            this.f123627b.mo65402a(this.f123628c, this.f123630e);
        } else if (i == 3) {
            this.f123627b.mo65299E();
        } else if (i == 4) {
            this.f123627b.mo65404f(this.f123629d);
        } else if (i != 5) {
            this.f123627b.mo65400F();
        } else {
            this.f123627b.mo65401a(this.f123631f, this.f123629d);
        }
    }
}
