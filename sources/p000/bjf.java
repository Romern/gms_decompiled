package p000;

/* renamed from: bjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjf {
    /* renamed from: a */
    public static byte m3184a(int i, int i2) {
        return (biy.m3166a().f3345a[i + 1] & i2) != i2 ? (byte) -91 : 92;
    }

    /* renamed from: b */
    public static void m3188b(int i, int i2) {
        byte[] bArr = biy.m3166a().f3347c;
        int i3 = i + 20;
        bArr[i3] = (byte) (i2 | bArr[i3]);
    }

    /* renamed from: c */
    public static void m3189c(int i, int i2) {
        byte[] bArr = biy.m3166a().f3347c;
        int i3 = i + 20;
        bArr[i3] = (byte) ((i2 ^ -1) & bArr[i3]);
    }

    /* renamed from: a */
    public static void m3185a() {
        bix a = biy.m3166a();
        if (m3184a(4, 1) == 92) {
            if (a.f3347c[23] == 92) {
                m3186a(0, (byte) 1);
                m3186a(2, (byte) 2);
                byte b = a.f3347c[24];
                if (b == -73) {
                    m3188b(1, 1);
                    m3189c(0, 4);
                    m3188b(0, 2);
                } else if (b == -33) {
                    m3188b(0, 4);
                    m3189c(0, 2);
                } else if (b == 69 || b == 105) {
                    m3188b(1, 1);
                    m3189c(0, 4);
                    m3189c(0, 2);
                }
            } else {
                m3186a(0, (byte) 63);
                m3186a(2, (byte) 0);
            }
            if (a.f3347c[25] == 92) {
                m3186a(1, (byte) 3);
            } else {
                m3186a(1, (byte) 0);
            }
        }
    }

    /* renamed from: a */
    private static void m3186a(int i, byte b) {
        biy.m3166a().f3347c[i + 28] = b;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* renamed from: a */
    public static byte[] m3187a(byte[] bArr, byte[] bArr2, byte b) {
        bix a = biy.m3166a();
        String a2 = bji.m3201a(bArr2);
        String a3 = bji.m3201a(bArr);
        if (a.f3347c[14] == -94) {
            String a4 = bji.m3201a(a.mo3177a(73492));
            String a5 = bji.m3200a(a4.substring(0, a4.length() - 1), 16);
            String a6 = bji.m3201a(a.mo3177a(73489));
            StringBuilder sb = new StringBuilder(16);
            sb.append("%1$-48s");
            String replace = String.format(sb.toString(), a6).replace(' ', '0');
            if (b == -121) {
                Object[] objArr = new Object[1];
                String upperCase = a2.substring(10, 16).toUpperCase();
                int i = 0;
                for (int i2 = 0; i2 < upperCase.length(); i2++) {
                    i = (i * 16) + "0123456789ABCDEF".indexOf(upperCase.charAt(i2));
                }
                objArr[0] = Integer.valueOf(i);
                String format = String.format("%05d", objArr);
                while (format.length() > 5) {
                    format = format.substring(1);
                }
                a2 = bji.m3200a(format, 6);
                String valueOf = String.valueOf(a3.substring(4));
                a3 = valueOf.length() == 0 ? new String("0000") : "0000".concat(valueOf);
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(replace).length() + String.valueOf(a5).length() + String.valueOf(a3).length() + String.valueOf(a2).length());
            sb2.append(replace);
            sb2.append(a5);
            sb2.append(a3);
            sb2.append(a2);
            return bji.m3208b(41).digest(bji.m3204a(sb2.toString()));
        }
        throw new bic(bib.f3275e);
    }
}
