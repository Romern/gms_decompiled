package p000;

/* renamed from: agks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agks {
    /* renamed from: a */
    public static String m54437a(String str, String[] strArr, String[] strArr2) {
        sdo.m34959a(strArr);
        sdo.m34959a(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }
}
