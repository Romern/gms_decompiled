package p000;

import java.io.Serializable;

/* renamed from: bnnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnnt extends bnny implements Serializable {

    /* renamed from: a */
    public static final bnnt f131877a = new bnnt();
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    private transient bnny f131878b;

    /* renamed from: c */
    private transient bnny f131879c;

    private bnnt() {
    }

    private Object readResolve() {
        return f131877a;
    }

    /* renamed from: a */
    public final bnny mo67377a() {
        return bnop.f131931a;
    }

    /* renamed from: b */
    public final bnny mo68137b() {
        bnny bnny = this.f131878b;
        if (bnny != null) {
            return bnny;
        }
        bnny b = super.mo68137b();
        this.f131878b = b;
        return b;
    }

    /* renamed from: c */
    public final bnny mo68138c() {
        bnny bnny = this.f131879c;
        if (bnny != null) {
            return bnny;
        }
        bnny c = super.mo68138c();
        this.f131879c = c;
        return c;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        bmxy.m108581a(comparable);
        bmxy.m108581a(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
