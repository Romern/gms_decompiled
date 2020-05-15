package p000;

/* renamed from: bmxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmxu {
    /* renamed from: a */
    public static bmxt m108562a(Class cls) {
        return new bmxt(cls.getSimpleName());
    }

    /* renamed from: a */
    public static bmxt m108564a(String str) {
        return new bmxt(str);
    }

    /* renamed from: a */
    public static bmxt m108563a(Object obj) {
        return new bmxt(obj.getClass().getSimpleName());
    }

    /* renamed from: a */
    public static Object m108565a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }
}
