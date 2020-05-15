package p000;

/* renamed from: kom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kom {

    /* renamed from: A */
    private int f24601A = -1;

    /* renamed from: a */
    public final String f24602a;

    /* renamed from: b */
    public final String f24603b;

    /* renamed from: c */
    public final int f24604c;

    /* renamed from: d */
    public final String f24605d;

    /* renamed from: e */
    public final String f24606e;

    /* renamed from: f */
    public final int f24607f;

    /* renamed from: g */
    public final CharSequence[] f24608g;

    /* renamed from: h */
    public final Object f24609h;

    /* renamed from: i */
    public final bnic f24610i;

    /* renamed from: j */
    public final int f24611j;

    /* renamed from: k */
    public final int f24612k;

    /* renamed from: l */
    public final int f24613l;

    /* renamed from: m */
    public final int f24614m;

    /* renamed from: n */
    public final int f24615n;

    /* renamed from: o */
    public final int f24616o;

    /* renamed from: p */
    public final int f24617p;

    /* renamed from: q */
    public final int f24618q;

    /* renamed from: r */
    public final String f24619r;

    /* renamed from: s */
    public final boolean f24620s;

    /* renamed from: t */
    public final boolean f24621t;

    /* renamed from: u */
    public final String f24622u;

    /* renamed from: v */
    public final kol f24623v;

    /* renamed from: w */
    public final bmxv f24624w;

    /* renamed from: x */
    public bmxv f24625x;

    /* renamed from: y */
    public final bngx f24626y;

    /* renamed from: z */
    public final bmxv f24627z;

    public kom(String str, String str2, int i, String str3, String str4, int i2, CharSequence[] charSequenceArr, Object obj, bnic bnic, int i3, bmxv bmxv, int i4, int i5, int i6, int i7, int i8, int i9, int i10, String str5, boolean z, boolean z2, String str6, kol kol, koq koq, bngx bngx) {
        bnic bnic2;
        this.f24602a = str;
        this.f24603b = str2;
        this.f24604c = i;
        this.f24605d = str3;
        this.f24606e = str4;
        this.f24607f = i2;
        this.f24608g = charSequenceArr;
        this.f24609h = obj;
        if (bnic == null) {
            bnic2 = bnon.f131923a;
        } else {
            bnic2 = bnic;
        }
        this.f24610i = bnic2;
        this.f24611j = i3;
        this.f24627z = bmxv;
        this.f24612k = i4;
        this.f24613l = i5;
        this.f24614m = i6;
        this.f24615n = i7;
        this.f24616o = i8;
        this.f24617p = i9;
        this.f24618q = i10;
        this.f24619r = str5;
        this.f24620s = z;
        this.f24621t = z2;
        this.f24622u = str6;
        this.f24623v = kol;
        this.f24624w = bmxv.m108567c(koq);
        this.f24626y = bngx;
        this.f24625x = bmvz.f131120a;
    }

    /* renamed from: a */
    public final int mo14754a() {
        int i = this.f24601A;
        if (i < 0) {
            if (this.f24607f != 0) {
                i = 1;
            } else {
                i = 0;
            }
            bnre i2 = this.f24626y.listIterator();
            while (i2.hasNext()) {
                i += ((kom) i2.next()).mo14754a();
            }
            this.f24601A = i;
        }
        return i;
    }
}
