package p000;

/* renamed from: bnuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bnuw extends bnuu {

    /* renamed from: a */
    private static final String f132209a;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r0.matches("\\n|\\r(?:\\n)?") == false) goto L_0x0010;
     */
    static {
        String str;
        try {
            str = System.getProperty("line.separator");
        } catch (SecurityException e) {
        }
        str = "\n";
        f132209a = str;
    }

    /* renamed from: a */
    static int m110468a(String str, int i) {
        while (i < str.length()) {
            int i2 = i + 1;
            if (str.charAt(i) != '%') {
                i = i2;
            } else if (i2 < str.length()) {
                char charAt = str.charAt(i2);
                if (charAt != '%' && charAt != 'n') {
                    return i2 - 1;
                }
                i = i2 + 1;
            } else {
                throw bnuv.m110466b("trailing unquoted '%' character", str, i2 - 1);
            }
        }
        return -1;
    }

    /* renamed from: a */
    public abstract int mo68500a(bnut bnut, int i, String str, int i2, int i3, int i4);

    /* renamed from: a */
    public final void mo68503a(bnut bnut) {
        int i;
        int i2;
        int i3;
        String b = bnut.mo68502b();
        int a = m110468a(b, 0);
        int i4 = -1;
        int i5 = 0;
        while (a >= 0) {
            int i6 = a + 1;
            int i7 = i6;
            int i8 = 0;
            while (i7 < b.length()) {
                int i9 = i7 + 1;
                char charAt = b.charAt(i7);
                char c = (char) (charAt - '0');
                if (c < 10) {
                    i8 = (i8 * 10) + c;
                    if (i8 < 1000000) {
                        i7 = i9;
                    } else {
                        throw bnuv.m110465a("index too large", b, a, i9);
                    }
                } else {
                    if (charAt == '$') {
                        if ((i9 - 1) - i6 == 0) {
                            throw bnuv.m110465a("missing index", b, a, i9);
                        } else if (b.charAt(i6) != '0') {
                            int i10 = i8 - 1;
                            if (i9 != b.length()) {
                                b.charAt(i9);
                                i2 = i10;
                                i = i5;
                                i3 = i9;
                                i9++;
                            } else {
                                throw bnuv.m110466b("unterminated parameter", b, a);
                            }
                        } else {
                            throw bnuv.m110465a("index has leading zero", b, a, i9);
                        }
                    } else if (charAt != '<') {
                        i = i5 + 1;
                        i2 = i5;
                        i3 = i6;
                    } else if (i4 == -1) {
                        throw bnuv.m110465a("invalid relative parameter", b, a, i9);
                    } else if (i9 != b.length()) {
                        b.charAt(i9);
                        i2 = i4;
                        i = i5;
                        i3 = i9;
                        i9++;
                    } else {
                        throw bnuv.m110466b("unterminated parameter", b, a);
                    }
                    int i11 = i9 - 1;
                    while (i11 < b.length()) {
                        if (((char) ((b.charAt(i11) & 65503) - 'A')) < 26) {
                            a = m110468a(b, mo68500a(bnut, i2, b, a, i3, i11));
                            i4 = i2;
                            i5 = i;
                        } else {
                            i11++;
                        }
                    }
                    throw bnuv.m110466b("unterminated parameter", b, a);
                }
            }
            throw bnuv.m110466b("unterminated parameter", b, a);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder}
     arg types: [java.lang.String, int, int]
     candidates:
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(char[], int, int):java.lang.StringBuilder}
      ClspMth{java.lang.Appendable.append(java.lang.CharSequence, int, int):java.lang.Appendable throws java.io.IOException}
      ClspMth{java.lang.StringBuilder.append(java.lang.CharSequence, int, int):java.lang.StringBuilder} */
    /* renamed from: a */
    public final void mo68504a(StringBuilder sb, String str, int i, int i2) {
        int i3 = i;
        while (i < i2) {
            int i4 = i + 1;
            if (str.charAt(i) == '%') {
                if (i4 == i2) {
                    break;
                }
                char charAt = str.charAt(i4);
                if (charAt == '%') {
                    sb.append((CharSequence) str, i3, i4);
                } else if (charAt == 'n') {
                    sb.append((CharSequence) str, i3, i4 - 1);
                    sb.append(f132209a);
                }
                i3 = i4 + 1;
                i = i3;
            }
            i = i4;
        }
        if (i3 < i2) {
            sb.append((CharSequence) str, i3, i2);
        }
    }
}
