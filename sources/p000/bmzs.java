package p000;

/* renamed from: bmzs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmzs {
    /* renamed from: a */
    public static void m108696a(Object obj) {
        m108697a(obj, "expected a non-null reference", new Object[0]);
    }

    /* renamed from: a */
    public static void m108697a(Object obj, String str, Object... objArr) {
        m108700a(obj != null, str, objArr);
    }

    /* renamed from: a */
    public static void m108698a(boolean z) {
        if (!z) {
            throw new bmzt();
        }
    }

    /* renamed from: a */
    public static void m108699a(boolean z, String str, Object obj) {
        if (!z) {
            throw new bmzt(bmzh.m108675a(str, obj));
        }
    }

    /* renamed from: a */
    public static void m108700a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new bmzt(bmzh.m108675a(str, objArr));
        }
    }
}
