package p000;

/* renamed from: agnt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agnt {
    /* renamed from: a */
    public static /* synthetic */ String m54672a(int i) {
        return i != 1 ? i != 2 ? "null" : "UPSELL_OFFER" : "BALANCE_UPDATE";
    }

    /* renamed from: a */
    public static int[] m54673a() {
        return new int[]{1, 2};
    }

    /* renamed from: b */
    public static int m54674b(int i) {
        int[] a = m54673a();
        int length = a.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = a[i2];
            if (i3 == 0) {
                throw null;
            } else if (i3 == i) {
                return i3;
            } else {
                i2++;
            }
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Unsupported MobileDataPlan event integer: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
