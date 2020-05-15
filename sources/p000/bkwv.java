package p000;

/* renamed from: bkwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkwv {
    /* renamed from: a */
    public static boolean m106779a(Object obj, Object obj2) {
        if (obj != obj2) {
            return (obj == null || obj2 == null || !obj.equals(obj2)) ? false : true;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m106780a(Object... objArr) {
        if ((objArr.length & 1) == 0) {
            for (int i = 0; i < objArr.length; i += 2) {
                if (!m106779a(objArr[i], objArr[i + 1])) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException("There must be an even number of fields to compare.");
    }
}
