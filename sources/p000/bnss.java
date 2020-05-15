package p000;

/* renamed from: bnss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnss {

    /* renamed from: a */
    public static final bnss f132100a = new bnss(0, -1, -1);

    /* renamed from: e */
    private static final long f132101e;

    /* renamed from: b */
    public final int f132102b;

    /* renamed from: c */
    public final int f132103c;

    /* renamed from: d */
    public final int f132104d;

    static {
        long j = 0;
        for (int i = 0; i < 7; i++) {
            j |= (((long) i) + 1) << ((int) (((long) (" #(+,-0".charAt(i) - ' ')) * 3));
        }
        f132101e = j;
    }

    public bnss(int i, int i2, int i3) {
        this.f132102b = i;
        this.f132103c = i2;
        this.f132104d = i3;
    }

    /* renamed from: a */
    private static int m110332a(char c) {
        return ((int) ((f132101e >>> ((c - ' ') * 3)) & 7)) - 1;
    }

    /* renamed from: a */
    public final boolean mo68464a() {
        return this == f132100a;
    }

    /* renamed from: b */
    public final boolean mo68466b() {
        return (this.f132102b & 128) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bnss) {
            bnss bnss = (bnss) obj;
            return bnss.f132102b == this.f132102b && bnss.f132103c == this.f132103c && bnss.f132104d == this.f132104d;
        }
    }

    public final int hashCode() {
        return (((this.f132102b * 31) + this.f132103c) * 31) + this.f132104d;
    }

    /* renamed from: a */
    private static int m110333a(String str, int i, int i2) {
        if (i != i2) {
            int i3 = 0;
            int i4 = i;
            while (i4 < i2) {
                char charAt = (char) (str.charAt(i4) - '0');
                if (charAt < 10) {
                    i3 = (i3 * 10) + charAt;
                    if (i3 <= 999999) {
                        i4++;
                    } else {
                        throw bnuv.m110465a("precision too large", str, i, i2);
                    }
                } else {
                    throw bnuv.m110464a("invalid precision character", str, i4);
                }
            }
            if (i3 != 0 || i2 == i + 1) {
                return i3;
            }
            throw bnuv.m110465a("invalid precision", str, i, i2);
        }
        throw bnuv.m110464a("missing precision", str, i - 1);
    }

    /* renamed from: a */
    static int m110334a(String str, boolean z) {
        int i = 0;
        int i2 = !z ? 0 : 128;
        while (i < str.length()) {
            int a = m110332a(str.charAt(i));
            if (a >= 0) {
                i2 |= 1 << a;
                i++;
            } else {
                throw new IllegalArgumentException(str.length() == 0 ? new String("invalid flags: ") : "invalid flags: ".concat(str));
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static bnss m110335a(String str, int i, int i2, boolean z) {
        if (i == i2 && !z) {
            return f132100a;
        }
        int i3 = !z ? 0 : 128;
        while (i != i2) {
            int i4 = i + 1;
            char charAt = str.charAt(i);
            if (charAt >= ' ' && charAt <= '0') {
                int a = m110332a(charAt);
                if (a >= 0) {
                    int i5 = 1 << a;
                    if ((i3 & i5) == 0) {
                        i3 |= i5;
                        i = i4;
                    } else {
                        throw bnuv.m110464a("repeated flag", str, i4 - 1);
                    }
                } else if (charAt == '.') {
                    return new bnss(i3, -1, m110333a(str, i4, i2));
                } else {
                    throw bnuv.m110464a("invalid flag", str, i4 - 1);
                }
            } else {
                int i6 = i4 - 1;
                if (charAt <= '9') {
                    int i7 = charAt - '0';
                    while (i4 != i2) {
                        int i8 = i4 + 1;
                        char charAt2 = str.charAt(i4);
                        if (charAt2 == '.') {
                            return new bnss(i3, i7, m110333a(str, i8, i2));
                        }
                        char c = (char) (charAt2 - '0');
                        if (c < 10) {
                            i7 = (i7 * 10) + c;
                            if (i7 <= 999999) {
                                i4 = i8;
                            } else {
                                throw bnuv.m110465a("width too large", str, i6, i2);
                            }
                        } else {
                            throw bnuv.m110464a("invalid width character", str, i8 - 1);
                        }
                    }
                    return new bnss(i3, i7, -1);
                }
                throw bnuv.m110464a("invalid flag", str, i6);
            }
        }
        return new bnss(i3, -1, -1);
    }

    /* renamed from: a */
    public final void mo68463a(StringBuilder sb) {
        if (!mo68464a()) {
            int i = this.f132102b & -129;
            int i2 = 0;
            while (true) {
                int i3 = 1 << i2;
                if (i3 > i) {
                    break;
                }
                if ((i3 & i) != 0) {
                    sb.append(" #(+,-0".charAt(i2));
                }
                i2++;
            }
            int i4 = this.f132103c;
            if (i4 != -1) {
                sb.append(i4);
            }
            if (this.f132104d != -1) {
                sb.append('.');
                sb.append(this.f132104d);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo68465a(int i, boolean z) {
        int i2;
        if (mo68464a()) {
            return true;
        }
        int i3 = this.f132102b;
        if (((i ^ -1) & i3) != 0) {
            return false;
        }
        if (!z && this.f132104d != -1) {
            return false;
        }
        int i4 = this.f132103c;
        if ((i3 & 9) == 9 || (i2 = i3 & 96) == 96) {
            return false;
        }
        return i2 == 0 || i4 != -1;
    }
}
