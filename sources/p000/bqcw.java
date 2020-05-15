package p000;

/* renamed from: bqcw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqcw {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.String, long):void
     arg types: [int, java.lang.String, long]
     candidates:
      bmxy.a(int, int, java.lang.String):java.lang.String
      bmxy.a(int, int, int):void
      bmxy.a(java.lang.Object, java.lang.String, int):void
      bmxy.a(java.lang.Object, java.lang.String, java.lang.Object):void
      bmxy.a(boolean, java.lang.String, char):void
      bmxy.a(boolean, java.lang.String, int):void
      bmxy.a(boolean, java.lang.String, java.lang.Object):void
      bmxy.a(boolean, java.lang.String, long):void */
    /* renamed from: a */
    public static byte m112604a(long j) {
        bmxy.m108593a(true, "out of range: %s", j);
        return (byte) ((int) j);
    }

    /* renamed from: a */
    public static int m112606a(byte b) {
        return b & 255;
    }

    /* renamed from: a */
    public static byte m112605a(String str) {
        bmxy.m108581a(str);
        int parseInt = Integer.parseInt(str, 16);
        if ((parseInt >> 8) == 0) {
            return (byte) parseInt;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("out of range: ");
        sb.append(parseInt);
        throw new NumberFormatException(sb.toString());
    }

    /* renamed from: a */
    public static int m112607a(byte b, byte b2) {
        return m112606a(b) - m112606a(b2);
    }
}
