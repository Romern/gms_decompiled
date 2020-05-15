package p000;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* renamed from: bshr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bshr implements Closeable {

    /* renamed from: j */
    private static final char[] f144607j = ")]}'\n".toCharArray();

    /* renamed from: a */
    public boolean f144608a = false;

    /* renamed from: b */
    public final char[] f144609b = new char[1024];

    /* renamed from: c */
    public int f144610c = 0;

    /* renamed from: d */
    public int f144611d = 0;

    /* renamed from: e */
    public long f144612e;

    /* renamed from: f */
    public int f144613f;

    /* renamed from: g */
    public String f144614g;

    /* renamed from: h */
    public int f144615h;

    /* renamed from: i */
    public int[] f144616i;

    /* renamed from: k */
    private final Reader f144617k;

    /* renamed from: l */
    private int f144618l = 0;

    /* renamed from: m */
    private int f144619m = 0;

    /* renamed from: n */
    private int f144620n = 0;

    /* renamed from: o */
    private int[] f144621o;

    /* renamed from: p */
    private String[] f144622p;

    public bshr(Reader reader) {
        int[] iArr = new int[32];
        this.f144621o = iArr;
        this.f144615h = 1;
        iArr[0] = 6;
        this.f144622p = new String[32];
        this.f144616i = new int[32];
        this.f144617k = reader;
    }

    /* renamed from: a */
    private final int m115786a(boolean z) {
        char[] cArr = this.f144609b;
        int i = this.f144610c;
        int i2 = this.f144618l;
        while (true) {
            if (i == i2) {
                this.f144610c = i;
                if (m115790b(1)) {
                    i = this.f144610c;
                    i2 = this.f144618l;
                } else if (!z) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + mo70612l());
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == 10) {
                this.f144619m++;
                this.f144620n = i3;
            } else if (!(c == ' ' || c == 13 || c == 9)) {
                if (c == '/') {
                    this.f144610c = i3;
                    if (i3 == i2) {
                        this.f144610c = i3 - 1;
                        boolean b = m115790b(2);
                        this.f144610c++;
                        if (!b) {
                            return 47;
                        }
                    }
                    m115791o();
                    int i4 = this.f144610c;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f144610c = i4 + 1;
                        while (true) {
                            if (this.f144610c + 2 > this.f144618l && !m115790b(2)) {
                                throw m115787a("Unterminated comment");
                            }
                            char[] cArr2 = this.f144609b;
                            int i5 = this.f144610c;
                            if (cArr2[i5] != 10) {
                                int i6 = 0;
                                while (i6 < 2) {
                                    if (this.f144609b[this.f144610c + i6] == "*/".charAt(i6)) {
                                        i6++;
                                    }
                                }
                                i = 2 + this.f144610c;
                                i2 = this.f144618l;
                                break;
                            }
                            this.f144619m++;
                            this.f144620n = i5 + 1;
                            this.f144610c++;
                        }
                    } else if (c2 != '/') {
                        return 47;
                    } else {
                        this.f144610c = i4 + 1;
                        m115792p();
                        i = this.f144610c;
                        i2 = this.f144618l;
                    }
                } else if (c == '#') {
                    this.f144610c = i3;
                    m115791o();
                    m115792p();
                    i = this.f144610c;
                    i2 = this.f144618l;
                } else {
                    this.f144610c = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* renamed from: b */
    private final boolean m115789b(char c) {
        if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m115791o();
        return false;
    }

    /* renamed from: o */
    private final void m115791o() {
        if (!this.f144608a) {
            throw m115787a("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: p */
    private final void m115792p() {
        char c;
        do {
            if (this.f144610c < this.f144618l || m115790b(1)) {
                char[] cArr = this.f144609b;
                int i = this.f144610c;
                int i2 = i + 1;
                this.f144610c = i2;
                c = cArr[i];
                if (c == 10) {
                    this.f144619m++;
                    this.f144620n = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* renamed from: c */
    public final void mo70602c() {
        int i = this.f144611d;
        if (i == 0) {
            i = mo70606f();
        }
        if (i == 1) {
            m115788a(3);
            this.f144611d = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + ((Object) bshs.m115808a(mo70614n())) + mo70612l());
    }

    public final void close() {
        this.f144611d = 0;
        this.f144621o[0] = 8;
        this.f144615h = 1;
        this.f144617k.close();
    }

    /* renamed from: d */
    public final void mo70604d() {
        int i = this.f144611d;
        if (i == 0) {
            i = mo70606f();
        }
        if (i == 2) {
            int i2 = this.f144615h - 1;
            this.f144615h = i2;
            this.f144622p[i2] = null;
            int[] iArr = this.f144616i;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f144611d = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + ((Object) bshs.m115808a(mo70614n())) + mo70612l());
    }

    /* renamed from: e */
    public final boolean mo70605e() {
        int i = this.f144611d;
        if (i == 0) {
            i = mo70606f();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0212, code lost:
        if (m115789b(r6) == false) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0239, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x023b, code lost:
        if (r4 != 2) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x023d, code lost:
        if (r16 == false) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0243, code lost:
        if (r13 == Long.MIN_VALUE) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0246, code lost:
        if (r17 != false) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x024d, code lost:
        if (r13 != 0) goto L_0x0251;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x024f, code lost:
        if (r17 != false) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0251, code lost:
        if (r17 != false) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0253, code lost:
        r13 = -r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0254, code lost:
        r0.f144612e = r13;
        r0.f144610c += r7;
        r0.f144611d = 15;
        r6 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0262, code lost:
        if (r4 != 2) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0266, code lost:
        if (r4 == 4) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0269, code lost:
        if (r4 == 7) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x026c, code lost:
        r0.f144613f = r7;
        r0.f144611d = 16;
        r6 = 16;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0294 A[RETURN] */
    /* renamed from: f */
    public final int mo70606f() {
        int i;
        int i2;
        int i3;
        String str;
        String str2;
        int i4;
        int a;
        int i5;
        int[] iArr = this.f144621o;
        int i6 = this.f144615h - 1;
        int i7 = iArr[i6];
        boolean z = true;
        if (i7 == 1) {
            iArr[i6] = 2;
        } else if (i7 == 2) {
            int a2 = m115786a(true);
            if (a2 != 44) {
                if (a2 == 59) {
                    m115791o();
                } else if (a2 == 93) {
                    this.f144611d = 4;
                    return 4;
                } else {
                    throw m115787a("Unterminated array");
                }
            }
        } else if (i7 == 3 || i7 == 5) {
            iArr[i6] = 4;
            if (i7 == 5 && (a = m115786a(true)) != 44) {
                if (a == 59) {
                    m115791o();
                } else if (a == 125) {
                    this.f144611d = 2;
                    return 2;
                } else {
                    throw m115787a("Unterminated object");
                }
            }
            int a3 = m115786a(true);
            if (a3 == 34) {
                i4 = 13;
            } else if (a3 == 39) {
                m115791o();
                i4 = 12;
            } else if (a3 != 125) {
                m115791o();
                this.f144610c--;
                if (m115789b((char) a3)) {
                    this.f144611d = 14;
                    return 14;
                }
                throw m115787a("Expected name");
            } else if (i7 != 5) {
                this.f144611d = 2;
                return 2;
            } else {
                throw m115787a("Expected name");
            }
            this.f144611d = i4;
            return i4;
        } else if (i7 == 4) {
            iArr[i6] = 5;
            int a4 = m115786a(true);
            if (a4 != 58) {
                if (a4 == 61) {
                    m115791o();
                    if (this.f144610c < this.f144618l || m115790b(1)) {
                        char[] cArr = this.f144609b;
                        int i8 = this.f144610c;
                        if (cArr[i8] == '>') {
                            this.f144610c = i8 + 1;
                        }
                    }
                } else {
                    throw m115787a("Expected ':'");
                }
            }
        } else if (i7 == 6) {
            if (this.f144608a) {
                m115786a(true);
                int i9 = this.f144610c - 1;
                this.f144610c = i9;
                char[] cArr2 = f144607j;
                if (i9 + cArr2.length <= this.f144618l) {
                    i5 = 0;
                } else if (m115790b(cArr2.length)) {
                    i5 = 0;
                }
                while (true) {
                    char[] cArr3 = f144607j;
                    if (i5 < cArr3.length) {
                        if (this.f144609b[this.f144610c + i5] != cArr3[i5]) {
                            break;
                        }
                        i5++;
                    } else {
                        this.f144610c += cArr3.length;
                        break;
                    }
                }
            }
            this.f144621o[this.f144615h - 1] = 7;
        } else if (i7 == 7) {
            if (m115786a(false) != -1) {
                m115791o();
                this.f144610c--;
            } else {
                this.f144611d = 17;
                return 17;
            }
        } else if (i7 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int a5 = m115786a(true);
        if (a5 == 34) {
            i = 9;
        } else if (a5 != 39) {
            if (!(a5 == 44 || a5 == 59)) {
                if (a5 == 91) {
                    this.f144611d = 3;
                    return 3;
                } else if (a5 != 93) {
                    if (a5 != 123) {
                        int i10 = this.f144610c - 1;
                        this.f144610c = i10;
                        char c = this.f144609b[i10];
                        if (c == 't' || c == 'T') {
                            str2 = "true";
                            str = "TRUE";
                            i2 = 5;
                        } else if (c == 'f' || c == 'F') {
                            str2 = "false";
                            str = "FALSE";
                            i2 = 6;
                        } else {
                            if (c == 'n' || c == 'N') {
                                str2 = "null";
                                str = "NULL";
                                i2 = 7;
                            }
                            i2 = 0;
                            if (i2 == 0) {
                                return i2;
                            }
                            char[] cArr4 = this.f144609b;
                            int i11 = this.f144610c;
                            int i12 = this.f144618l;
                            long j = 0;
                            long j2 = 0;
                            char c2 = 0;
                            int i13 = 0;
                            boolean z2 = true;
                            boolean z3 = false;
                            while (true) {
                                if (i11 + i13 == i12) {
                                    if (i13 != cArr4.length) {
                                        if (!m115790b(i13 + 1)) {
                                            break;
                                        }
                                        i11 = this.f144610c;
                                        i12 = this.f144618l;
                                    } else {
                                        i3 = 0;
                                        break;
                                    }
                                }
                                char c3 = cArr4[i11 + i13];
                                if (c3 == '+') {
                                    if (c2 != 5) {
                                        break;
                                    }
                                } else if (c3 != 'E' && c3 != 'e') {
                                    if (c3 == '-') {
                                        if (c2 != 0) {
                                            if (c2 != 5) {
                                                break;
                                            }
                                        } else {
                                            c2 = 1;
                                            z3 = true;
                                            i13++;
                                            z = true;
                                            j = 0;
                                        }
                                    } else if (c3 == '.') {
                                        if (c2 != 2) {
                                            break;
                                        }
                                        c2 = 3;
                                        i13++;
                                        z = true;
                                        j = 0;
                                    } else if (c3 >= '0' && c3 <= '9') {
                                        if (c2 != z) {
                                            if (c2 != 0) {
                                                if (c2 == 2) {
                                                    if (j2 == j) {
                                                        i3 = 0;
                                                        break;
                                                    }
                                                    long j3 = (10 * j2) - ((long) (c3 - '0'));
                                                    z2 &= j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2);
                                                    j2 = j3;
                                                } else if (c2 == 3) {
                                                    c2 = 4;
                                                } else if (c2 == 5) {
                                                    c2 = 7;
                                                } else if (c2 == 6) {
                                                    c2 = 7;
                                                }
                                                i13++;
                                                z = true;
                                                j = 0;
                                            }
                                        }
                                        j2 = (long) (-(c3 - '0'));
                                        c2 = 2;
                                        i13++;
                                        z = true;
                                        j = 0;
                                    }
                                } else if (c2 != 2 && c2 != 4) {
                                    break;
                                } else {
                                    c2 = 5;
                                    i13++;
                                    z = true;
                                    j = 0;
                                }
                                c2 = 6;
                                i13++;
                                z = true;
                                j = 0;
                            }
                            if (i3 != 0) {
                                return i3;
                            }
                            if (m115789b(this.f144609b[this.f144610c])) {
                                m115791o();
                                this.f144611d = 10;
                                return 10;
                            }
                            throw m115787a("Expected value");
                        }
                        int length = str2.length();
                        int i14 = 1;
                        while (true) {
                            if (i14 >= length) {
                                if ((this.f144610c + length >= this.f144618l && !m115790b(length + 1)) || !m115789b(this.f144609b[this.f144610c + length])) {
                                    this.f144610c += length;
                                    this.f144611d = i2;
                                } else {
                                    i2 = 0;
                                }
                            } else if (this.f144610c + i14 >= this.f144618l && !m115790b(i14 + 1)) {
                                break;
                            } else {
                                char c4 = this.f144609b[this.f144610c + i14];
                                if (c4 != str2.charAt(i14) && c4 != str.charAt(i14)) {
                                    i2 = 0;
                                    break;
                                }
                                i14++;
                                z = true;
                            }
                        }
                        if (i2 == 0) {
                        }
                    } else {
                        this.f144611d = 1;
                        return 1;
                    }
                } else if (i7 == 1) {
                    this.f144611d = 4;
                    return 4;
                }
            }
            if (i7 == 1 || i7 == 2) {
                m115791o();
                this.f144610c--;
                this.f144611d = 7;
                return 7;
            }
            throw m115787a("Unexpected value");
        } else {
            m115791o();
            i = 8;
        }
        this.f144611d = i;
        return i;
    }

    /* renamed from: g */
    public final String mo70607g() {
        String str;
        int i = this.f144611d;
        if (i == 0) {
            i = mo70606f();
        }
        if (i == 14) {
            str = mo70611k();
        } else if (i == 12) {
            str = mo70599a('\'');
        } else if (i == 13) {
            str = mo70599a('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + ((Object) bshs.m115808a(mo70614n())) + mo70612l());
        }
        this.f144611d = 0;
        this.f144622p[this.f144615h - 1] = str;
        return str;
    }

    /* renamed from: h */
    public final String mo70608h() {
        String str;
        int i = this.f144611d;
        if (i == 0) {
            i = mo70606f();
        }
        if (i == 10) {
            str = mo70611k();
        } else if (i == 8) {
            str = mo70599a('\'');
        } else if (i == 9) {
            str = mo70599a('\"');
        } else if (i == 11) {
            str = this.f144614g;
            this.f144614g = null;
        } else if (i == 15) {
            str = Long.toString(this.f144612e);
        } else if (i == 16) {
            str = new String(this.f144609b, this.f144610c, this.f144613f);
            this.f144610c += this.f144613f;
        } else {
            throw new IllegalStateException("Expected a string but was " + ((Object) bshs.m115808a(mo70614n())) + mo70612l());
        }
        this.f144611d = 0;
        int[] iArr = this.f144616i;
        int i2 = this.f144615h - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: i */
    public final boolean mo70609i() {
        int i = this.f144611d;
        if (i == 0) {
            i = mo70606f();
        }
        if (i == 5) {
            this.f144611d = 0;
            int[] iArr = this.f144616i;
            int i2 = this.f144615h - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f144611d = 0;
            int[] iArr2 = this.f144616i;
            int i3 = this.f144615h - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + ((Object) bshs.m115808a(mo70614n())) + mo70612l());
        }
    }

    /* renamed from: j */
    public final void mo70610j() {
        int i = this.f144611d;
        if (i == 0) {
            i = mo70606f();
        }
        if (i == 7) {
            this.f144611d = 0;
            int[] iArr = this.f144616i;
            int i2 = this.f144615h - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + ((Object) bshs.m115808a(mo70614n())) + mo70612l());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        m115791o();
     */
    /* renamed from: k */
    public final String mo70611k() {
        String str;
        int i = 0;
        StringBuilder sb = null;
        int i2 = 0;
        while (true) {
            int i3 = this.f144610c + i2;
            if (i3 < this.f144618l) {
                char c = this.f144609b[i3];
                if (!(c == 9 || c == 10 || c == 12 || c == 13 || c == ' ')) {
                    if (c != '#') {
                        if (c != ',') {
                            if (!(c == '/' || c == '=')) {
                                if (!(c == '{' || c == '}' || c == ':')) {
                                    if (c != ';') {
                                        switch (c) {
                                            case '[':
                                            case ']':
                                                break;
                                            case '\\':
                                                break;
                                            default:
                                                i2++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (i2 >= this.f144609b.length) {
                if (sb == null) {
                    sb = new StringBuilder(Math.max(i2, 16));
                }
                sb.append(this.f144609b, this.f144610c, i2);
                this.f144610c += i2;
                if (m115790b(1)) {
                    i2 = 0;
                }
            } else if (!m115790b(i2 + 1)) {
            }
        }
        i = i2;
        if (sb != null) {
            sb.append(this.f144609b, this.f144610c, i);
            str = sb.toString();
        } else {
            str = new String(this.f144609b, this.f144610c, i);
        }
        this.f144610c += i;
        return str;
    }

    /* renamed from: l */
    public final String mo70612l() {
        int i = this.f144619m;
        int i2 = this.f144610c;
        int i3 = this.f144620n;
        return " at line " + (i + 1) + " column " + ((i2 - i3) + 1) + " path " + mo70613m();
    }

    /* renamed from: m */
    public final String mo70613m() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.f144615h;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f144621o[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.f144616i[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.f144622p[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: n */
    public final int mo70614n() {
        int i = this.f144611d;
        if (i == 0) {
            i = mo70606f();
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
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public final String toString() {
        return getClass().getSimpleName() + mo70612l();
    }

    /* renamed from: b */
    private final boolean m115790b(int i) {
        int i2;
        char[] cArr = this.f144609b;
        int i3 = this.f144620n;
        int i4 = this.f144610c;
        this.f144620n = i3 - i4;
        int i5 = this.f144618l;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.f144618l = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.f144618l = 0;
        }
        this.f144610c = 0;
        do {
            Reader reader = this.f144617k;
            int i7 = this.f144618l;
            int read = reader.read(cArr, i7, cArr.length - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.f144618l + read;
            this.f144618l = i2;
            if (this.f144619m == 0 && this.f144620n == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f144610c++;
                this.f144620n = 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: b */
    public final void mo70601b() {
        int i = this.f144611d;
        if (i == 0) {
            i = mo70606f();
        }
        if (i == 4) {
            int i2 = this.f144615h - 1;
            this.f144615h = i2;
            int[] iArr = this.f144616i;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f144611d = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + ((Object) bshs.m115808a(mo70614n())) + mo70612l());
    }

    /* renamed from: a */
    private final IOException m115787a(String str) {
        throw new bshu(str + mo70612l());
    }

    /* renamed from: a */
    private final void m115788a(int i) {
        int i2 = this.f144615h;
        int[] iArr = this.f144621o;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            String[] strArr = new String[i3];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f144616i, 0, iArr3, 0, this.f144615h);
            System.arraycopy(this.f144622p, 0, strArr, 0, this.f144615h);
            this.f144621o = iArr2;
            this.f144616i = iArr3;
            this.f144622p = strArr;
        }
        int[] iArr4 = this.f144621o;
        int i4 = this.f144615h;
        this.f144615h = i4 + 1;
        iArr4[i4] = i;
    }

    /* renamed from: a */
    public final String mo70599a(char c) {
        int i;
        char[] cArr = this.f144609b;
        StringBuilder sb = null;
        do {
            int i2 = this.f144610c;
            int i3 = this.f144618l;
            int i4 = i2;
            while (i2 < i3) {
                int i5 = i2 + 1;
                char c2 = cArr[i2];
                if (c2 == c) {
                    this.f144610c = i5;
                    int i6 = (i5 - i4) - 1;
                    if (sb == null) {
                        return new String(cArr, i4, i6);
                    }
                    sb.append(cArr, i4, i6);
                    return sb.toString();
                }
                char c3 = 10;
                if (c2 == '\\') {
                    this.f144610c = i5;
                    int i7 = (i5 - i4) - 1;
                    if (sb == null) {
                        int i8 = i7 + 1;
                        sb = new StringBuilder(Math.max(i8 + i8, 16));
                    }
                    sb.append(cArr, i4, i7);
                    if (this.f144610c != this.f144618l || m115790b(1)) {
                        char[] cArr2 = this.f144609b;
                        int i9 = this.f144610c;
                        int i10 = i9 + 1;
                        this.f144610c = i10;
                        char c4 = cArr2[i9];
                        if (c4 == 10) {
                            this.f144619m++;
                            this.f144620n = i10;
                        } else if (!(c4 == '\"' || c4 == '\'' || c4 == '/' || c4 == '\\')) {
                            if (c4 == 'b') {
                                c3 = 8;
                            } else if (c4 == 'f') {
                                c3 = 12;
                            } else if (c4 != 'n') {
                                if (c4 == 'r') {
                                    c3 = 13;
                                } else if (c4 == 't') {
                                    c3 = 9;
                                } else if (c4 != 'u') {
                                    throw m115787a("Invalid escape sequence");
                                } else if (i10 + 4 > this.f144618l && !m115790b(4)) {
                                    throw m115787a("Unterminated escape sequence");
                                } else {
                                    int i11 = this.f144610c;
                                    int i12 = i11 + 4;
                                    c3 = 0;
                                    while (i11 < i12) {
                                        char c5 = this.f144609b[i11];
                                        char c6 = (char) (c3 << 4);
                                        if (c5 >= '0' && c5 <= '9') {
                                            i = c5 - '0';
                                        } else if (c5 >= 'a' && c5 <= 'f') {
                                            i = c5 - 'W';
                                        } else if (c5 < 'A' || c5 > 'F') {
                                            throw new NumberFormatException("\\u" + new String(this.f144609b, this.f144610c, 4));
                                        } else {
                                            i = c5 - '7';
                                        }
                                        c3 = (char) (c6 + i);
                                        i11++;
                                    }
                                    this.f144610c += 4;
                                }
                            }
                            sb.append(c3);
                            i2 = this.f144610c;
                            i3 = this.f144618l;
                            i4 = i2;
                        }
                        c3 = c4;
                        sb.append(c3);
                        i2 = this.f144610c;
                        i3 = this.f144618l;
                        i4 = i2;
                    } else {
                        throw m115787a("Unterminated escape sequence");
                    }
                } else {
                    if (c2 == 10) {
                        this.f144619m++;
                        this.f144620n = i5;
                    }
                    i2 = i5;
                }
            }
            if (sb == null) {
                int i13 = i2 - i4;
                sb = new StringBuilder(Math.max(i13 + i13, 16));
            }
            sb.append(cArr, i4, i2 - i4);
            this.f144610c = i2;
        } while (m115790b(1));
        throw m115787a("Unterminated string");
    }

    /* renamed from: a */
    public final void mo70600a() {
        int i = this.f144611d;
        if (i == 0) {
            i = mo70606f();
        }
        if (i == 3) {
            m115788a(1);
            this.f144616i[this.f144615h - 1] = 0;
            this.f144611d = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + ((Object) bshs.m115808a(mo70614n())) + mo70612l());
    }
}
