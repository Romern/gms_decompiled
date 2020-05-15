package p000;

/* renamed from: bnon */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnon extends bnic {

    /* renamed from: a */
    public static final bnon f131923a = new bnon(new Object[0], 0, null, 0, 0);

    /* renamed from: b */
    final transient Object[] f131924b;

    /* renamed from: c */
    final transient Object[] f131925c;

    /* renamed from: d */
    public final transient int f131926d;

    /* renamed from: e */
    private final transient int f131927e;

    /* renamed from: f */
    private final transient int f131928f;

    public bnon(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f131924b = objArr;
        this.f131925c = objArr2;
        this.f131927e = i2;
        this.f131926d = i;
        this.f131928f = i3;
    }

    /* renamed from: a */
    public final int mo67630a(Object[] objArr, int i) {
        System.arraycopy(this.f131924b, 0, objArr, i, this.f131928f);
        return i + this.f131928f;
    }

    /* renamed from: b */
    public final Object[] mo67634b() {
        return this.f131924b;
    }

    /* renamed from: c */
    public final int mo67635c() {
        return 0;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.f131925c;
        if (obj != null && objArr != null) {
            int a = bngg.m109305a(obj);
            while (true) {
                int i = a & this.f131927e;
                Object obj2 = objArr[i];
                if (obj2 == null) {
                    break;
                } else if (obj2.equals(obj)) {
                    return true;
                } else {
                    a = i + 1;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo67658d() {
        return true;
    }

    /* renamed from: f */
    public final int mo67638f() {
        return this.f131928f;
    }

    /* renamed from: h */
    public final boolean mo67640h() {
        return false;
    }

    public final int hashCode() {
        return this.f131926d;
    }

    /* renamed from: i */
    public final bngx mo67756i() {
        return bngx.m109374b(this.f131924b, this.f131928f);
    }

    public final int size() {
        return this.f131928f;
    }

    /* renamed from: a */
    public final bnrd iterator() {
        return mo67639g().listIterator();
    }
}
