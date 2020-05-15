package p000;

/* renamed from: stn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class stn {
    /* renamed from: a */
    public static int m36303a(String str) {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, str, -1)).intValue();
        } catch (Exception e) {
            return -1;
        }
    }

    /* renamed from: a */
    public static String m36304a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception e) {
            return str2;
        }
    }
}
