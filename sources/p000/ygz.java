package p000;

/* renamed from: ygz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ygz {

    /* renamed from: a */
    public final long f53796a;

    /* renamed from: b */
    public final long f53797b;

    /* renamed from: c */
    public final int f53798c;

    /* renamed from: d */
    public final bmxv f53799d;

    /* renamed from: e */
    public final String f53800e;

    /* renamed from: f */
    public final ygd f53801f;

    /* renamed from: g */
    public final boolean f53802g;

    /* renamed from: h */
    public final ynn f53803h;

    /* renamed from: i */
    public final boolean f53804i;

    /* renamed from: j */
    public final boolean f53805j;

    public ygz(ygy ygy) {
        this.f53796a = ygy.f53792g;
        this.f53797b = ygy.f53793h;
        this.f53798c = ygy.f53795j;
        this.f53799d = ygy.f53794i;
        String str = ygy.f53786a;
        this.f53800e = str;
        ygd b = ygv.m44055b(str);
        ygd ygd = ygy.f53787b;
        if (ygd != null) {
            b = ygv.m44053a(b, ygd);
        }
        this.f53801f = b;
        this.f53802g = ygy.f53788c;
        this.f53803h = ygy.f53789d;
        this.f53804i = ygy.f53790e;
        this.f53805j = ygy.f53791f;
    }

    public final String toString() {
        return String.format("DataStreamDescriptor{dataTypeName=%s, dataSourcePredicate=%s, supplemental=%s, dataStreamOrigin=%s, oneOutputPerInputDataSource=%s}", this.f53800e, this.f53801f, Boolean.valueOf(this.f53802g), this.f53803h, Boolean.valueOf(this.f53804i));
    }
}
