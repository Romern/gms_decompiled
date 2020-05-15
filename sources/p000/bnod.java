package p000;

/* renamed from: bnod */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnod extends bngj {

    /* renamed from: b */
    public static final bnod f131893b = new bnod();

    /* renamed from: c */
    final transient Object[] f131894c;

    /* renamed from: d */
    public final transient bnod f131895d;

    /* renamed from: e */
    private final transient Object f131896e;

    /* renamed from: f */
    private final transient int f131897f;

    /* renamed from: g */
    private final transient int f131898g;

    private bnod() {
        this.f131896e = null;
        this.f131894c = new Object[0];
        this.f131897f = 0;
        this.f131898g = 0;
        this.f131895d = this;
    }

    /* renamed from: c */
    public final bngj mo67620c() {
        return this.f131895d;
    }

    /* renamed from: cR */
    public final bnic mo67697cR() {
        return new bnoh(this, new bnoi(this.f131894c, this.f131897f, this.f131898g));
    }

    /* renamed from: cT */
    public final boolean mo67651cT() {
        return false;
    }

    /* renamed from: g */
    public final bnic mo67698g() {
        return new bnog(this, this.f131894c, this.f131897f, this.f131898g);
    }

    public final Object get(Object obj) {
        return bnoj.m109971a(this.f131896e, this.f131894c, this.f131898g, this.f131897f, obj);
    }

    public final int size() {
        return this.f131898g;
    }

    private bnod(Object obj, Object[] objArr, int i, bnod bnod) {
        this.f131896e = obj;
        this.f131894c = objArr;
        this.f131897f = 1;
        this.f131898g = i;
        this.f131895d = bnod;
    }

    public bnod(Object[] objArr, int i) {
        int i2;
        this.f131894c = objArr;
        this.f131898g = i;
        this.f131897f = 0;
        if (i >= 2) {
            i2 = bnic.m109498b(i);
        } else {
            i2 = 0;
        }
        this.f131896e = bnoj.m109972a(objArr, i, i2, 0);
        this.f131895d = new bnod(bnoj.m109972a(objArr, i, i2, 1), objArr, i, this);
    }
}
