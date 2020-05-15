package p000;

import java.io.EOFException;

/* renamed from: beg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class beg extends bef {

    /* renamed from: f */
    private static final cipx f3070f = cipx.m150785a("'\\");

    /* renamed from: g */
    private static final cipx f3071g = cipx.m150785a("\"\\");

    /* renamed from: h */
    private static final cipx f3072h = cipx.m150785a("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: i */
    private static final cipx f3073i = cipx.m150785a("\n\r");

    /* renamed from: j */
    private static final cipx f3074j = cipx.m150785a("*/");

    /* renamed from: k */
    private final cipw f3075k;

    /* renamed from: l */
    private final cipu f3076l;

    /* renamed from: m */
    private int f3077m = 0;

    /* renamed from: n */
    private long f3078n;

    /* renamed from: o */
    private int f3079o;

    /* renamed from: p */
    private String f3080p;

    public beg(cipw cipw) {
        this.f3075k = cipw;
        this.f3076l = ((ciqm) cipw).f191247a;
        mo3022a(6);
    }

    /* renamed from: a */
    private final int m2774a(String str, bed bed) {
        int length = bed.f3063a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(bed.f3063a[i])) {
                this.f3077m = 0;
                this.f3068d[this.f3066b - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    private final void m2777b(cipx cipx) {
        while (true) {
            long a = this.f3075k.mo86282a(cipx);
            if (a == -1) {
                throw mo3020a("Unterminated string");
            } else if (this.f3076l.mo86297c(a) == 92) {
                this.f3076l.mo86317h(a + 1);
                m2784t();
            } else {
                this.f3076l.mo86317h(a + 1);
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01cd, code lost:
        if (m2778b(r11) != false) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x01f3, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x01f5, code lost:
        if (r2 != 2) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x01f7, code lost:
        if (r5 == false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x01fd, code lost:
        if (r6 == Long.MIN_VALUE) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0200, code lost:
        if (r9 != false) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0207, code lost:
        if (r6 != 0) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0209, code lost:
        if (r9 != false) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x020b, code lost:
        if (r9 != false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x020d, code lost:
        r6 = -r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0210, code lost:
        r0.f3078n = r6;
        r0.f3076l.mo86317h((long) r4);
        r0.f3077m = 16;
        r3 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x021f, code lost:
        if (r2 != 2) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0223, code lost:
        if (r2 == 4) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0225, code lost:
        if (r2 == 7) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0227, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0229, code lost:
        r0.f3079o = r4;
        r0.f3077m = 17;
        r3 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0231, code lost:
        if (r3 != 0) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x023f, code lost:
        if (m2778b(r0.f3076l.mo86297c(0L)) == false) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0241, code lost:
        m2782r();
        r0.f3077m = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0248, code lost:
        return 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x024f, code lost:
        throw mo3020a("Expected value");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0250, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0251 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0148  */
    /* renamed from: o */
    private final int m2779o() {
        int i;
        String str;
        String str2;
        int[] iArr = this.f3067c;
        int i2 = this.f3066b - 1;
        int i3 = iArr[i2];
        boolean z = true;
        if (i3 == 1) {
            iArr[i2] = 2;
        } else if (i3 == 2) {
            int a = m2775a(true);
            this.f3076l.mo86305e();
            if (a != 44) {
                if (a == 59) {
                    m2782r();
                } else if (a == 93) {
                    this.f3077m = 4;
                    return 4;
                } else {
                    throw mo3020a("Unterminated array");
                }
            }
        } else if (i3 == 3 || i3 == 5) {
            iArr[i2] = 4;
            if (i3 == 5) {
                int a2 = m2775a(true);
                this.f3076l.mo86305e();
                if (a2 != 44) {
                    if (a2 == 59) {
                        m2782r();
                    } else if (a2 == 125) {
                        this.f3077m = 2;
                        return 2;
                    } else {
                        throw mo3020a("Unterminated object");
                    }
                }
            }
            int a3 = m2775a(true);
            if (a3 == 34) {
                this.f3076l.mo86305e();
                this.f3077m = 13;
                return 13;
            } else if (a3 == 39) {
                this.f3076l.mo86305e();
                m2782r();
                this.f3077m = 12;
                return 12;
            } else if (a3 != 125) {
                m2782r();
                if (m2778b((char) a3)) {
                    this.f3077m = 14;
                    return 14;
                }
                throw mo3020a("Expected name");
            } else if (i3 != 5) {
                this.f3076l.mo86305e();
                this.f3077m = 2;
                return 2;
            } else {
                throw mo3020a("Expected name");
            }
        } else if (i3 == 4) {
            iArr[i2] = 5;
            int a4 = m2775a(true);
            this.f3076l.mo86305e();
            if (a4 != 58) {
                if (a4 == 61) {
                    m2782r();
                    if (this.f3075k.mo86296b(1) && this.f3076l.mo86297c(0L) == 62) {
                        this.f3076l.mo86305e();
                    }
                } else {
                    throw mo3020a("Expected ':'");
                }
            }
        } else if (i3 == 6) {
            iArr[i2] = 7;
        } else if (i3 == 7) {
            if (m2775a(false) == -1) {
                this.f3077m = 18;
                return 18;
            }
            m2782r();
        } else if (i3 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int a5 = m2775a(true);
        if (a5 == 34) {
            this.f3076l.mo86305e();
            this.f3077m = 9;
            return 9;
        } else if (a5 != 39) {
            if (!(a5 == 44 || a5 == 59)) {
                if (a5 == 91) {
                    this.f3076l.mo86305e();
                    this.f3077m = 3;
                    return 3;
                } else if (a5 != 93) {
                    if (a5 != 123) {
                        byte c = this.f3076l.mo86297c(0L);
                        if (c == 116 || c == 84) {
                            str2 = "true";
                            str = "TRUE";
                            i = 5;
                        } else if (c == 102 || c == 70) {
                            str2 = "false";
                            str = "FALSE";
                            i = 6;
                        } else {
                            if (c == 110 || c == 78) {
                                str2 = "null";
                                str = "NULL";
                                i = 7;
                            }
                            i = 0;
                            if (i == 0) {
                                return i;
                            }
                            long j = 0;
                            char c2 = 0;
                            int i4 = 0;
                            boolean z2 = true;
                            boolean z3 = false;
                            while (true) {
                                int i5 = i4 + 1;
                                if (!this.f3075k.mo86296b((long) i5)) {
                                    break;
                                }
                                byte c3 = this.f3076l.mo86297c((long) i4);
                                if (c3 == 43) {
                                    if (c2 != 5) {
                                        break;
                                    }
                                } else if (c3 != 69 && c3 != 101) {
                                    if (c3 == 45) {
                                        if (c2 != 0) {
                                            if (c2 != 5) {
                                                break;
                                            }
                                        } else {
                                            c2 = 1;
                                            z3 = true;
                                            i4 = i5;
                                            z = true;
                                        }
                                    } else if (c3 == 46) {
                                        if (c2 != 2) {
                                            break;
                                        }
                                        c2 = 3;
                                        i4 = i5;
                                        z = true;
                                    } else if (c3 >= 48 && c3 <= 57) {
                                        if (c2 != z) {
                                            if (c2 != 0) {
                                                if (c2 == 2) {
                                                    if (j == 0) {
                                                        int i6 = 0;
                                                        break;
                                                    }
                                                    long j2 = (10 * j) - ((long) (c3 - 48));
                                                    z2 &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                                                    j = j2;
                                                } else if (c2 == 3) {
                                                    c2 = 4;
                                                } else if (c2 == 5) {
                                                    c2 = 7;
                                                } else if (c2 == 6) {
                                                    c2 = 7;
                                                }
                                                i4 = i5;
                                                z = true;
                                            }
                                        }
                                        j = (long) (-(c3 - 48));
                                        c2 = 2;
                                        i4 = i5;
                                        z = true;
                                    }
                                } else if (c2 != 2 && c2 != 4) {
                                    break;
                                } else {
                                    c2 = 5;
                                    i4 = i5;
                                    z = true;
                                }
                                c2 = 6;
                                i4 = i5;
                                z = true;
                            }
                        }
                        int length = str2.length();
                        int i7 = 1;
                        while (true) {
                            if (i7 < length) {
                                int i8 = i7 + 1;
                                if (!this.f3075k.mo86296b((long) i8)) {
                                    i = 0;
                                    break;
                                }
                                byte c4 = this.f3076l.mo86297c((long) i7);
                                if (c4 != str2.charAt(i7) && c4 != str.charAt(i7)) {
                                    i = 0;
                                    break;
                                }
                                i7 = i8;
                            } else if (!this.f3075k.mo86296b((long) (length + 1)) || !m2778b(this.f3076l.mo86297c((long) length))) {
                                this.f3076l.mo86317h((long) length);
                                this.f3077m = i;
                            }
                        }
                        if (i == 0) {
                        }
                    } else {
                        this.f3076l.mo86305e();
                        this.f3077m = 1;
                        return 1;
                    }
                } else if (i3 == 1) {
                    this.f3076l.mo86305e();
                    this.f3077m = 4;
                    return 4;
                }
            }
            if (i3 == 1 || i3 == 2) {
                m2782r();
                this.f3077m = 7;
                return 7;
            }
            throw mo3020a("Unexpected value");
        } else {
            m2782r();
            this.f3076l.mo86305e();
            this.f3077m = 8;
            return 8;
        }
    }

    /* renamed from: p */
    private final String m2780p() {
        long a = this.f3075k.mo86282a(f3072h);
        return a == -1 ? this.f3076l.mo86324k() : this.f3076l.mo86306e(a);
    }

    /* renamed from: q */
    private final void m2781q() {
        long a = this.f3075k.mo86282a(f3072h);
        cipu cipu = this.f3076l;
        if (a == -1) {
            a = cipu.f191213b;
        }
        cipu.mo86317h(a);
    }

    /* renamed from: r */
    private final void m2782r() {
        throw mo3020a("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    /* renamed from: s */
    private final void m2783s() {
        long a = this.f3075k.mo86282a(f3073i);
        cipu cipu = this.f3076l;
        cipu.mo86317h(a != -1 ? a + 1 : cipu.f191213b);
    }

    /* renamed from: t */
    private final char m2784t() {
        int i;
        if (this.f3075k.mo86296b(1)) {
            byte e = this.f3076l.mo86305e();
            if (e == 10 || e == 34 || e == 39 || e == 47 || e == 92) {
                return (char) e;
            }
            if (e == 98) {
                return 8;
            }
            if (e == 102) {
                return 12;
            }
            if (e == 110) {
                return 10;
            }
            if (e == 114) {
                return 13;
            }
            if (e == 116) {
                return 9;
            }
            if (e != 117) {
                throw mo3020a("Invalid escape sequence: \\" + ((char) e));
            } else if (this.f3075k.mo86296b(4)) {
                char c = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    byte c2 = this.f3076l.mo86297c((long) i2);
                    char c3 = (char) (c << 4);
                    if (c2 >= 48 && c2 <= 57) {
                        i = c2 - 48;
                    } else if (c2 >= 97 && c2 <= 102) {
                        i = c2 - 87;
                    } else if (c2 < 65 || c2 > 70) {
                        throw mo3020a("\\u" + this.f3076l.mo86306e(4L));
                    } else {
                        i = c2 - 55;
                    }
                    c = (char) (c3 + i);
                }
                this.f3076l.mo86317h(4L);
                return c;
            } else {
                throw new EOFException("Unterminated escape sequence at path " + mo3034m());
            }
        } else {
            throw mo3020a("Unterminated escape sequence");
        }
    }

    /* renamed from: c */
    public final void mo3024c() {
        int i = this.f3077m;
        if (i == 0) {
            i = m2779o();
        }
        if (i == 1) {
            mo3022a(3);
            this.f3077m = 0;
            return;
        }
        throw new beb("Expected BEGIN_OBJECT but was " + ((Object) bee.m2755a(mo3035n())) + " at path " + mo3034m());
    }

    public final void close() {
        this.f3077m = 0;
        this.f3067c[0] = 8;
        this.f3066b = 1;
        this.f3076l.mo86328n();
        this.f3075k.close();
    }

    /* renamed from: d */
    public final void mo3025d() {
        int i = this.f3077m;
        if (i == 0) {
            i = m2779o();
        }
        if (i == 2) {
            int i2 = this.f3066b - 1;
            this.f3066b = i2;
            this.f3068d[i2] = null;
            int[] iArr = this.f3069e;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f3077m = 0;
            return;
        }
        throw new beb("Expected END_OBJECT but was " + ((Object) bee.m2755a(mo3035n())) + " at path " + mo3034m());
    }

    /* renamed from: e */
    public final boolean mo3026e() {
        int i = this.f3077m;
        if (i == 0) {
            i = m2779o();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    /* renamed from: f */
    public final String mo3027f() {
        String str;
        int i = this.f3077m;
        if (i == 0) {
            i = m2779o();
        }
        if (i == 14) {
            str = m2780p();
        } else if (i == 13) {
            str = m2776a(f3071g);
        } else if (i == 12) {
            str = m2776a(f3070f);
        } else if (i == 15) {
            str = this.f3080p;
        } else {
            throw new beb("Expected a name but was " + ((Object) bee.m2755a(mo3035n())) + " at path " + mo3034m());
        }
        this.f3077m = 0;
        this.f3068d[this.f3066b - 1] = str;
        return str;
    }

    /* renamed from: g */
    public final void mo3028g() {
        int i = this.f3077m;
        if (i == 0) {
            i = m2779o();
        }
        if (i == 14) {
            m2781q();
        } else if (i == 13) {
            m2777b(f3071g);
        } else if (i == 12) {
            m2777b(f3070f);
        } else if (i != 15) {
            throw new beb("Expected a name but was " + ((Object) bee.m2755a(mo3035n())) + " at path " + mo3034m());
        }
        this.f3077m = 0;
        this.f3068d[this.f3066b - 1] = "null";
    }

    /* renamed from: h */
    public final String mo3029h() {
        String str;
        int i = this.f3077m;
        if (i == 0) {
            i = m2779o();
        }
        if (i == 10) {
            str = m2780p();
        } else if (i == 9) {
            str = m2776a(f3071g);
        } else if (i == 8) {
            str = m2776a(f3070f);
        } else if (i == 11) {
            str = this.f3080p;
            this.f3080p = null;
        } else if (i == 16) {
            str = Long.toString(this.f3078n);
        } else if (i == 17) {
            str = this.f3076l.mo86306e((long) this.f3079o);
        } else {
            throw new beb("Expected a string but was " + ((Object) bee.m2755a(mo3035n())) + " at path " + mo3034m());
        }
        this.f3077m = 0;
        int[] iArr = this.f3069e;
        int i2 = this.f3066b - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: i */
    public final boolean mo3030i() {
        int i = this.f3077m;
        if (i == 0) {
            i = m2779o();
        }
        if (i == 5) {
            this.f3077m = 0;
            int[] iArr = this.f3069e;
            int i2 = this.f3066b - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f3077m = 0;
            int[] iArr2 = this.f3069e;
            int i3 = this.f3066b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new beb("Expected a boolean but was " + ((Object) bee.m2755a(mo3035n())) + " at path " + mo3034m());
        }
    }

    /* renamed from: j */
    public final double mo3031j() {
        int i = this.f3077m;
        if (i == 0) {
            i = m2779o();
        }
        if (i == 16) {
            this.f3077m = 0;
            int[] iArr = this.f3069e;
            int i2 = this.f3066b - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f3078n;
        }
        if (i == 17) {
            this.f3080p = this.f3076l.mo86306e((long) this.f3079o);
        } else if (i == 9) {
            this.f3080p = m2776a(f3071g);
        } else if (i == 8) {
            this.f3080p = m2776a(f3070f);
        } else if (i == 10) {
            this.f3080p = m2780p();
        } else if (i != 11) {
            throw new beb("Expected a double but was " + ((Object) bee.m2755a(mo3035n())) + " at path " + mo3034m());
        }
        this.f3077m = 11;
        try {
            double parseDouble = Double.parseDouble(this.f3080p);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new bec("JSON forbids NaN and infinities: " + parseDouble + " at path " + mo3034m());
            }
            this.f3080p = null;
            this.f3077m = 0;
            int[] iArr2 = this.f3069e;
            int i3 = this.f3066b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        } catch (NumberFormatException e) {
            throw new beb("Expected a double but was " + this.f3080p + " at path " + mo3034m());
        }
    }

    /* renamed from: k */
    public final int mo3032k() {
        String str;
        int i = this.f3077m;
        if (i == 0) {
            i = m2779o();
        }
        if (i == 16) {
            long j = this.f3078n;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f3077m = 0;
                int[] iArr = this.f3069e;
                int i3 = this.f3066b - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new beb("Expected an int but was " + this.f3078n + " at path " + mo3034m());
        }
        if (i == 17) {
            this.f3080p = this.f3076l.mo86306e((long) this.f3079o);
        } else {
            if (i == 9) {
                str = m2776a(f3071g);
            } else if (i == 8) {
                str = m2776a(f3070f);
            } else if (i != 11) {
                throw new beb("Expected an int but was " + ((Object) bee.m2755a(mo3035n())) + " at path " + mo3034m());
            }
            this.f3080p = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.f3077m = 0;
                int[] iArr2 = this.f3069e;
                int i4 = this.f3066b - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException e) {
            }
        }
        this.f3077m = 11;
        try {
            double parseDouble = Double.parseDouble(this.f3080p);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.f3080p = null;
                this.f3077m = 0;
                int[] iArr3 = this.f3069e;
                int i6 = this.f3066b - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new beb("Expected an int but was " + this.f3080p + " at path " + mo3034m());
        } catch (NumberFormatException e2) {
            throw new beb("Expected an int but was " + this.f3080p + " at path " + mo3034m());
        }
    }

    /* renamed from: l */
    public final void mo3033l() {
        int i = 0;
        do {
            int i2 = this.f3077m;
            if (i2 == 0) {
                i2 = m2779o();
            }
            if (i2 == 3) {
                mo3022a(1);
                i++;
            } else if (i2 == 1) {
                mo3022a(3);
                i++;
            } else if (i2 == 4) {
                i--;
                if (i >= 0) {
                    this.f3066b--;
                } else {
                    throw new beb("Expected a value but was " + ((Object) bee.m2755a(mo3035n())) + " at path " + mo3034m());
                }
            } else if (i2 == 2) {
                i--;
                if (i >= 0) {
                    this.f3066b--;
                } else {
                    throw new beb("Expected a value but was " + ((Object) bee.m2755a(mo3035n())) + " at path " + mo3034m());
                }
            } else if (i2 == 14 || i2 == 10) {
                m2781q();
            } else if (i2 == 9 || i2 == 13) {
                m2777b(f3071g);
            } else if (i2 == 8 || i2 == 12) {
                m2777b(f3070f);
            } else if (i2 == 17) {
                this.f3076l.mo86317h((long) this.f3079o);
            } else if (i2 == 18) {
                throw new beb("Expected a value but was " + ((Object) bee.m2755a(mo3035n())) + " at path " + mo3034m());
            }
            this.f3077m = 0;
        } while (i != 0);
        int[] iArr = this.f3069e;
        int i3 = this.f3066b - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f3068d[i3] = "null";
    }

    /* renamed from: n */
    public final int mo3035n() {
        int i = this.f3077m;
        if (i == 0) {
            i = m2779o();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            default:
                return 10;
        }
    }

    public final String toString() {
        return "JsonReader(" + this.f3075k + ")";
    }

    /* renamed from: a */
    private final int m2775a(boolean z) {
        long j;
        ciqm ciqm;
        long j2;
        long j3;
        long j4;
        int i;
        beg beg = this;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (beg.f3075k.mo86296b((long) i4)) {
                byte c = beg.f3076l.mo86297c((long) i3);
                if (c == 10 || c == 32 || c == 13 || c == 9) {
                    i3 = i4;
                    beg = beg;
                    i2 = 0;
                } else {
                    beg.f3076l.mo86317h((long) (i4 - 1));
                    if (c != 47) {
                        beg beg2 = beg;
                        if (c != 35) {
                            return c;
                        }
                        m2782r();
                        m2783s();
                        beg = beg2;
                        i2 = 0;
                        i3 = 0;
                    } else if (!beg.f3075k.mo86296b(2)) {
                        return 47;
                    } else {
                        m2782r();
                        long j5 = 1;
                        byte c2 = beg.f3076l.mo86297c(1L);
                        if (c2 == 42) {
                            beg.f3076l.mo86305e();
                            beg.f3076l.mo86305e();
                            cipw cipw = beg.f3075k;
                            cipx cipx = f3074j;
                            ciqm ciqm2 = (ciqm) cipw;
                            if (!ciqm2.f191249c) {
                                long j6 = 0;
                                long j7 = 0;
                                while (true) {
                                    cipu cipu = ciqm2.f191247a;
                                    if (cipx.mo86345e() == 0) {
                                        throw new IllegalArgumentException("bytes is empty");
                                    } else if (j7 >= j6) {
                                        ciqn ciqn = cipu.f191212a;
                                        if (ciqn != null) {
                                            long j8 = cipu.f191213b;
                                            if (j8 - j7 >= j7) {
                                                j3 = j6;
                                                while (true) {
                                                    long j9 = ((long) (ciqn.f191252c - ciqn.f191251b)) + j3;
                                                    if (j9 >= j7) {
                                                        break;
                                                    }
                                                    ciqn = ciqn.f191255f;
                                                    j3 = j9;
                                                }
                                            } else {
                                                while (j3 > j7) {
                                                    ciqn = ciqn.f191256g;
                                                    j8 = j3 - ((long) (ciqn.f191252c - ciqn.f191251b));
                                                }
                                            }
                                            byte a = cipx.mo86335a(i2);
                                            int e = cipx.mo86345e();
                                            ciqm = ciqm2;
                                            long j10 = (cipu.f191213b - ((long) e)) + j5;
                                            long j11 = j7;
                                            while (true) {
                                                if (j3 >= j10) {
                                                    j = j7;
                                                    j2 = -1;
                                                    break;
                                                }
                                                byte[] bArr = ciqn.f191250a;
                                                j = j7;
                                                int min = (int) Math.min((long) ciqn.f191252c, (((long) ciqn.f191251b) + j10) - j3);
                                                int i5 = (int) ((((long) ciqn.f191251b) + j11) - j3);
                                                while (i5 < min) {
                                                    if (bArr[i5] == a) {
                                                        int i6 = i5 + 1;
                                                        int i7 = ciqn.f191252c;
                                                        byte[] bArr2 = ciqn.f191250a;
                                                        int i8 = 1;
                                                        ciqn ciqn2 = ciqn;
                                                        while (i8 < e) {
                                                            if (i6 == i7) {
                                                                ciqn2 = ciqn2.f191255f;
                                                                bArr2 = ciqn2.f191250a;
                                                                i6 = ciqn2.f191251b;
                                                                i7 = ciqn2.f191252c;
                                                            }
                                                            i = min;
                                                            j4 = j10;
                                                            if (bArr2[i6] == cipx.mo86335a(i8)) {
                                                                i6++;
                                                                i8++;
                                                                min = i;
                                                                j10 = j4;
                                                            }
                                                        }
                                                        j2 = ((long) (i5 - ciqn.f191251b)) + j3;
                                                        break;
                                                    }
                                                    i = min;
                                                    j4 = j10;
                                                    i5++;
                                                    min = i;
                                                    j10 = j4;
                                                }
                                                j11 = j3 + ((long) (ciqn.f191252c - ciqn.f191251b));
                                                ciqn = ciqn.f191255f;
                                                j3 = j11;
                                                j7 = j;
                                            }
                                        } else {
                                            ciqm = ciqm2;
                                            j = j7;
                                            j2 = -1;
                                        }
                                        if (j2 != -1) {
                                            break;
                                        }
                                        ciqm2 = ciqm;
                                        cipu cipu2 = ciqm2.f191247a;
                                        long j12 = cipu2.f191213b;
                                        if (ciqm2.f191248b.mo74995c(cipu2, 8192) == -1) {
                                            j2 = -1;
                                            break;
                                        }
                                        j7 = Math.max(j, (j12 - ((long) cipx.mo86345e())) + 1);
                                        j6 = 0;
                                        j5 = 1;
                                        i2 = 0;
                                        beg = this;
                                    } else {
                                        throw new IllegalArgumentException("fromIndex < 0");
                                    }
                                }
                                cipu cipu3 = this.f3076l;
                                cipu3.mo86317h(j2 != -1 ? ((long) f3074j.mo86345e()) + j2 : cipu3.f191213b);
                                if (j2 != -1) {
                                    beg = this;
                                    i2 = 0;
                                    i3 = 0;
                                } else {
                                    throw mo3020a("Unterminated comment");
                                }
                            } else {
                                throw new IllegalStateException("closed");
                            }
                        } else if (c2 != 47) {
                            return 47;
                        } else {
                            beg.f3076l.mo86305e();
                            beg.f3076l.mo86305e();
                            m2783s();
                            i3 = 0;
                        }
                    }
                }
            } else if (!z) {
                return -1;
            } else {
                throw new EOFException("End of input");
            }
        }
    }

    /* renamed from: b */
    private final boolean m2778b(int i) {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m2782r();
        return false;
    }

    /* renamed from: b */
    public final void mo3023b() {
        int i = this.f3077m;
        if (i == 0) {
            i = m2779o();
        }
        if (i == 4) {
            int i2 = this.f3066b - 1;
            this.f3066b = i2;
            int[] iArr = this.f3069e;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f3077m = 0;
            return;
        }
        throw new beb("Expected END_ARRAY but was " + ((Object) bee.m2755a(mo3035n())) + " at path " + mo3034m());
    }

    /* renamed from: a */
    private final String m2776a(cipx cipx) {
        StringBuilder sb = null;
        while (true) {
            long a = this.f3075k.mo86282a(cipx);
            if (a == -1) {
                throw mo3020a("Unterminated string");
            } else if (this.f3076l.mo86297c(a) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.f3076l.mo86306e(a));
                this.f3076l.mo86305e();
                sb.append(m2784t());
            } else if (sb != null) {
                sb.append(this.f3076l.mo86306e(a));
                this.f3076l.mo86305e();
                return sb.toString();
            } else {
                String e = this.f3076l.mo86306e(a);
                this.f3076l.mo86305e();
                return e;
            }
        }
    }

    /* renamed from: a */
    public final int mo3019a(bed bed) {
        int i;
        int i2;
        bed bed2 = bed;
        int i3 = this.f3077m;
        if (i3 == 0) {
            i3 = m2779o();
        }
        int i4 = -1;
        if (i3 < 12 || i3 > 15) {
            return -1;
        }
        if (i3 == 15) {
            return m2774a(this.f3080p, bed2);
        }
        cipw cipw = this.f3075k;
        ciqi ciqi = bed2.f3064b;
        ciqm ciqm = (ciqm) cipw;
        if (!ciqm.f191249c) {
            while (true) {
                ciqn ciqn = ciqm.f191247a.f191212a;
                if (ciqn != null) {
                    byte[] bArr = ciqn.f191250a;
                    int i5 = ciqn.f191251b;
                    int i6 = ciqn.f191252c;
                    int[] iArr = ciqi.f191241b;
                    ciqn ciqn2 = ciqn;
                    int i7 = 0;
                    i = -1;
                    while (true) {
                        int i8 = i7 + 1;
                        int i9 = iArr[i7];
                        int i10 = i8 + 1;
                        int i11 = iArr[i8];
                        if (i11 != i4) {
                            i = i11;
                        }
                        if (ciqn2 != null) {
                            if (i9 < 0) {
                                int i12 = i10 + (-i9);
                                while (true) {
                                    int i13 = i5 + 1;
                                    int i14 = i10 + 1;
                                    if ((bArr[i5] & 255) != iArr[i10]) {
                                        break;
                                    }
                                    if (i13 == i6) {
                                        ciqn ciqn3 = ciqn2.f191255f;
                                        int i15 = ciqn3.f191251b;
                                        bArr = ciqn3.f191250a;
                                        int i16 = ciqn3.f191252c;
                                        if (ciqn3 == ciqn) {
                                            if (i14 != i12) {
                                                break;
                                            }
                                            i6 = i16;
                                            ciqn2 = null;
                                            i5 = i15;
                                        } else {
                                            ciqn2 = ciqn3;
                                            i6 = i16;
                                            i5 = i15;
                                        }
                                    } else {
                                        i5 = i13;
                                    }
                                    if (i14 == i12) {
                                        i2 = iArr[i14];
                                        break;
                                    }
                                    i10 = i14;
                                }
                            } else {
                                int i17 = i5 + 1;
                                byte b = bArr[i5] & 255;
                                int i18 = i10 + i9;
                                int i19 = i10;
                                while (true) {
                                    if (i19 == i18) {
                                        break;
                                    } else if (b == iArr[i19]) {
                                        i2 = iArr[i19 + i9];
                                        if (i17 == i6) {
                                            ciqn2 = ciqn2.f191255f;
                                            int i20 = ciqn2.f191251b;
                                            byte[] bArr2 = ciqn2.f191250a;
                                            int i21 = ciqn2.f191252c;
                                            if (ciqn2 != ciqn) {
                                                i5 = i20;
                                                bArr = bArr2;
                                                i6 = i21;
                                            } else {
                                                i5 = i20;
                                                bArr = bArr2;
                                                i6 = i21;
                                                ciqn2 = null;
                                            }
                                        } else {
                                            i5 = i17;
                                        }
                                    } else {
                                        i19++;
                                    }
                                }
                            }
                            if (i2 >= 0) {
                                i = i2;
                                break;
                            }
                            i7 = -i2;
                            i4 = -1;
                        } else {
                            break;
                        }
                    }
                }
                i = -2;
                if (i == -1) {
                    i = -1;
                    break;
                } else if (i != -2) {
                    ciqm.f191247a.mo86317h((long) ciqi.f191240a[i].mo86345e());
                    break;
                } else if (ciqm.f191248b.mo74995c(ciqm.f191247a, 8192) == -1) {
                    i = -1;
                    break;
                } else {
                    i4 = -1;
                }
            }
            if (i == -1) {
                String str = this.f3068d[this.f3066b - 1];
                String f = mo3027f();
                int a = m2774a(f, bed2);
                if (a != -1) {
                    return a;
                }
                this.f3077m = 15;
                this.f3080p = f;
                this.f3068d[this.f3066b - 1] = str;
                return -1;
            }
            this.f3077m = 0;
            this.f3068d[this.f3066b - 1] = bed2.f3063a[i];
            return i;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: a */
    public final void mo3021a() {
        int i = this.f3077m;
        if (i == 0) {
            i = m2779o();
        }
        if (i == 3) {
            mo3022a(1);
            this.f3069e[this.f3066b - 1] = 0;
            this.f3077m = 0;
            return;
        }
        throw new beb("Expected BEGIN_ARRAY but was " + ((Object) bee.m2755a(mo3035n())) + " at path " + mo3034m());
    }
}
