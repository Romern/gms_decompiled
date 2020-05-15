package p000;

/* renamed from: bnzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnzz {

    /* renamed from: a */
    public static final bnri f132439a;

    static {
        bnrk a = bnrl.m110170a();
        a.mo68385a('\"', "&quot;");
        a.mo68385a('\'', "&#39;");
        a.mo68385a('&', "&amp;");
        a.mo68385a('<', "&lt;");
        a.mo68385a('>', "&gt;");
        f132439a = new bnrf(a, a.f132038a);
    }

    /* renamed from: a */
    public static String m110959a(String str) {
        int i;
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 != length) {
            int i4 = i3 + 1;
            char charAt = str.charAt(i3);
            if (charAt > '~' ? charAt >= 55296 || charAt < 160 : charAt < ' ') {
                if (charAt >= 55296) {
                    if (charAt <= 57343) {
                        int codePointAt = Character.codePointAt(str, i4 - 1);
                        if (codePointAt >= 65536 && (codePointAt & 65534) != 65534) {
                            i3 = i4 + 1;
                        }
                    } else if (charAt >= 64976) {
                        if (charAt > 65007) {
                            if (charAt >= 65534) {
                            }
                        }
                    }
                } else if (!(charAt == 10 || charAt == 13 || charAt == 9 || charAt == 12)) {
                }
                int length2 = str.length();
                StringBuilder sb = new StringBuilder(length2);
                while (i2 < length2) {
                    char charAt2 = str.charAt(i2);
                    if (bsjm.m115860a(charAt2)) {
                        sb.append(charAt2);
                        i2++;
                    } else {
                        int codePointAt2 = Character.codePointAt(str, i2);
                        if (!bsjm.m115860a(codePointAt2)) {
                            i = 65533;
                        } else {
                            i = codePointAt2;
                        }
                        sb.appendCodePoint(i);
                        i2 += Character.charCount(codePointAt2);
                    }
                }
                return sb.toString();
            }
            i3 = i4;
        }
        return str;
    }
}
