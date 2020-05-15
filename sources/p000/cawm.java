package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: cawm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cawm {

    /* renamed from: a */
    private static final String[] f176263a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: b */
    private static final String[] f176264b = new String[64];

    /* renamed from: c */
    private static final String[] f176265c = new String[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f176265c;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = String.format("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f176264b;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = String.valueOf(strArr2[i3]).concat("|PADDED");
        String[] strArr3 = f176264b;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            int i6 = iArr[0];
            String[] strArr4 = f176264b;
            String str = strArr4[i6];
            String str2 = strArr4[i5];
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
            int i7 = i6 | i5;
            sb.append(str);
            sb.append('|');
            sb.append(str2);
            strArr4[i7] = sb.toString();
            String[] strArr5 = f176264b;
            String str3 = strArr5[i6];
            String str4 = strArr5[i5];
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 8 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append('|');
            sb2.append(str4);
            sb2.append("|PADDED");
            strArr5[i7 | 8] = sb2.toString();
        }
        while (true) {
            String[] strArr6 = f176264b;
            if (i < strArr6.length) {
                if (strArr6[i] == null) {
                    strArr6[i] = f176265c[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    cawm() {
    }

    /* renamed from: a */
    static String m127407a(boolean z, int i, int i2, byte b, byte b2) {
        String str;
        String str2;
        String[] strArr = f176263a;
        String format = b >= strArr.length ? String.format("0x%02x", Byte.valueOf(b)) : strArr[b];
        if (b2 == 0) {
            str = "";
        } else {
            if (!(b == 2 || b == 3)) {
                if (b == 4 || b == 6) {
                    str = b2 != 1 ? f176265c[b2] : "ACK";
                } else if (!(b == 7 || b == 8)) {
                    String[] strArr2 = f176264b;
                    String str3 = b2 >= strArr2.length ? f176265c[b2] : strArr2[b2];
                    if (b == 5) {
                        if ((b2 & 4) != 0) {
                            str = str3.replace("HEADERS", "PUSH_PROMISE");
                        }
                    } else if (b == 0 && (b2 & 32) != 0) {
                        str = str3.replace("PRIORITY", "COMPRESSED");
                    }
                    str = str3;
                }
            }
            str = f176265c[b2];
        }
        Object[] objArr = new Object[5];
        if (!z) {
            str2 = ">>";
        } else {
            str2 = "<<";
        }
        objArr[0] = str2;
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = format;
        objArr[4] = str;
        return String.format("%s 0x%08x %5d %-13s %s", objArr);
    }
}
