package p000;

/* renamed from: bkxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkxi {

    /* renamed from: a */
    public boolean f125378a = true;

    /* renamed from: b */
    private final String f125379b;

    /* renamed from: c */
    private final int f125380c;

    /* renamed from: d */
    private int f125381d;

    /* renamed from: e */
    private final StringBuilder f125382e = new StringBuilder();

    /* renamed from: f */
    private int f125383f;

    /* renamed from: g */
    private int f125384g;

    /* renamed from: h */
    private char f125385h = 0;

    public bkxi(String str) {
        this.f125379b = str;
        this.f125380c = str.length();
    }

    /* renamed from: a */
    private final IllegalArgumentException m106832a(String str) {
        int i = this.f125384g - 1;
        int max = Math.max(i - 10, 0);
        int min = Math.min(i + 10, this.f125380c);
        String substring = this.f125379b.substring(max, min);
        int i2 = this.f125380c;
        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 110 + String.valueOf(str).length());
        sb.append("JSON parsing error at character ");
        sb.append(i);
        sb.append(" {input chars ");
        sb.append(max);
        sb.append("-");
        sb.append(min);
        sb.append(" = \"");
        sb.append(substring);
        sb.append("\"; length = ");
        sb.append(i2);
        sb.append("}: ");
        sb.append(str);
        return new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private static boolean m106833a(char c) {
        return c >= '0' && c <= '9';
    }

    /* renamed from: b */
    private static boolean m106834b(char c) {
        return m106833a(c) || c == 'e' || c == 'E' || c == '+' || c == '-' || c == '.';
    }

    /* renamed from: c */
    private final void m106835c(char c) {
        char p = m106847p();
        this.f125384g--;
        this.f125381d++;
        if (p == c) {
            m106849r();
        }
    }

    /* renamed from: d */
    private final void m106836d(char c) {
        char c2 = this.f125385h;
        if (c2 == c) {
            m106849r();
            return;
        }
        StringBuilder sb = new StringBuilder(46);
        sb.append("Expected collection end character ");
        sb.append(c);
        sb.append(" but was: ");
        sb.append(c2);
        throw m106832a(sb.toString());
    }

    /* renamed from: e */
    private final boolean m106837e(char c) {
        if (c == 't') {
            m106838f('r');
            m106838f('u');
            m106838f('e');
            m106849r();
            return true;
        } else if (c == 'f') {
            m106838f('a');
            m106838f('l');
            m106838f('s');
            m106838f('e');
            m106849r();
            return false;
        } else {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Invalid character in boolean: ");
            sb.append(c);
            throw m106832a(sb.toString());
        }
    }

    /* renamed from: f */
    private final void m106838f(char c) {
        char p = m106847p();
        if (c == p) {
            return;
        }
        if (p != 0) {
            StringBuilder sb = new StringBuilder(23);
            sb.append("Expceted '");
            sb.append(c);
            sb.append("' but was: ");
            sb.append(p);
            throw m106832a(sb.toString());
        }
        throw m106832a("Unexpected end of input.");
    }

    /* renamed from: h */
    private final void m106839h() {
        while (true) {
            char q = m106848q();
            if (q == '\\') {
                m106846o();
            } else if (q == '\"') {
                return;
            } else {
                if (q == 0) {
                    throw m106832a("Unexpected end of string.");
                }
            }
        }
    }

    /* renamed from: i */
    private final void m106840i() {
        m106835c(']');
    }

    /* renamed from: j */
    private final void m106841j() {
        m106835c('}');
    }

    /* renamed from: k */
    private final void m106842k() {
        while (this.f125378a) {
            m106838f('\"');
            m106839h();
            m106838f(':');
            mo66428a();
        }
        m106836d('}');
    }

    /* renamed from: l */
    private final void m106843l() {
        m106838f('u');
        m106838f('l');
        m106838f('l');
        m106849r();
    }

    /* renamed from: m */
    private final String m106844m() {
        char q;
        this.f125383f = this.f125384g;
        do {
            q = m106848q();
            if (q == '\"') {
                return this.f125379b.subSequence(this.f125383f, this.f125384g - 1).toString();
            }
            if (q == 0) {
                throw m106832a("Input ended before end of string.");
            }
        } while (q != '\\');
        this.f125382e.setLength(0);
        m106846o();
        while (true) {
            String str = this.f125379b;
            int i = this.f125384g;
            this.f125384g = i + 1;
            char charAt = str.charAt(i);
            if (charAt == '\"') {
                m106845n();
                return this.f125382e.toString();
            } else if (charAt == '\\') {
                m106846o();
            }
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
    /* renamed from: n */
    private final void m106845n() {
        this.f125382e.append((CharSequence) this.f125379b, this.f125383f, this.f125384g - 1);
    }

    /* renamed from: o */
    private final void m106846o() {
        m106845n();
        String str = this.f125379b;
        int i = this.f125384g;
        this.f125384g = i + 1;
        char charAt = str.charAt(i);
        if (charAt == '\"') {
            this.f125382e.append('\"');
        } else if (charAt == '/') {
            this.f125382e.append('/');
        } else if (charAt == '\\') {
            this.f125382e.append('\\');
        } else if (charAt == 'b') {
            this.f125382e.append(8);
        } else if (charAt == 'f') {
            this.f125382e.append(12);
        } else if (charAt == 'n') {
            this.f125382e.append(10);
        } else if (charAt == 'r') {
            this.f125382e.append(13);
        } else if (charAt == 't') {
            this.f125382e.append(9);
        } else if (charAt == 'u') {
            StringBuilder sb = this.f125382e;
            int i2 = this.f125384g;
            int i3 = i2 + 4;
            this.f125384g = i3;
            char c = 0;
            while (i2 < i3) {
                c = (char) (((char) (c * 16)) + Character.digit(this.f125379b.charAt(i2), 16));
                i2++;
            }
            sb.append(c);
        } else {
            StringBuilder sb2 = new StringBuilder(17);
            sb2.append("Invalid escape: ");
            sb2.append(charAt);
            throw m106832a(sb2.toString());
        }
        this.f125383f = this.f125384g;
    }

    /* renamed from: p */
    private final char m106847p() {
        char q;
        while (true) {
            q = m106848q();
            if (q > ' ' || !(q == ' ' || q == 9 || q == 10 || q == 13)) {
                return q;
            }
        }
        return q;
    }

    /* renamed from: q */
    private final char m106848q() {
        int i = this.f125384g;
        char charAt = i < this.f125380c ? this.f125379b.charAt(i) : 0;
        this.f125384g++;
        return charAt;
    }

    /* renamed from: r */
    private final void m106849r() {
        if (this.f125381d > 0) {
            char p = m106847p();
            if (p == ',') {
                this.f125378a = true;
            } else if (p == ']' || p == '}') {
                this.f125385h = p;
                this.f125378a = false;
                this.f125381d--;
            } else if (p != 0) {
                StringBuilder sb = new StringBuilder(39);
                sb.append("Unexpected character in array/object: ");
                sb.append(p);
                throw m106832a(sb.toString());
            } else {
                throw m106832a("Input ended before end of array/object.");
            }
        } else {
            char p2 = m106847p();
            if (p2 != 0) {
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Unexpected character at end of input: ");
                sb2.append(p2);
                throw m106832a(sb2.toString());
            }
        }
    }

    /* renamed from: g */
    public final String mo66434g() {
        if (this.f125378a) {
            char p = m106847p();
            if (p == 'n') {
                m106843l();
            } else if (p == '\"') {
                String m = m106844m();
                m106849r();
                return m;
            } else {
                StringBuilder sb = new StringBuilder(30);
                sb.append("Expected \" or null, but was: ");
                sb.append(p);
                throw m106832a(sb.toString());
            }
        }
        return null;
    }

    /* renamed from: b */
    public final int mo66429b() {
        int i = 0;
        if (this.f125378a) {
            char p = m106847p();
            if (p != '-') {
                i = p - '0';
            }
            char p2 = m106847p();
            while (m106833a(p2)) {
                i = (i * 10) + (p2 - '0');
                p2 = m106848q();
            }
            this.f125384g--;
            m106849r();
            if (p == '-') {
                return -i;
            }
        }
        return i;
    }

    /* renamed from: c */
    public final void mo66430c() {
        m106838f('[');
        m106840i();
    }

    /* renamed from: d */
    public final void mo66431d() {
        while (this.f125378a) {
            mo66428a();
        }
        m106836d(']');
    }

    /* renamed from: e */
    public final boolean mo66432e() {
        return this.f125378a && m106837e(m106847p());
    }

    /* renamed from: f */
    public final boolean mo66433f() {
        if (m106847p() != 'n') {
            this.f125384g--;
            return false;
        }
        m106843l();
        return true;
    }

    /* renamed from: a */
    public final Object mo66427a(bkxj bkxj) {
        if (!this.f125378a) {
            return bkxj.mo66215a();
        }
        char p = m106847p();
        if (p == '\"') {
            Object a = bkxj.mo66219a(m106844m());
            m106849r();
            return a;
        } else if (p != '[') {
            if (p != 'f') {
                if (p == 'n') {
                    m106843l();
                    return bkxj.mo66215a();
                } else if (p != 't') {
                    if (p == '{') {
                        Object b = bkxj.mo66223b();
                        m106841j();
                        while (this.f125378a) {
                            m106838f('\"');
                            String m = m106844m();
                            m106838f(':');
                            bkxj.mo66222a(m, mo66427a(bkxj), b);
                        }
                        m106842k();
                        return bkxj.mo66218a(b);
                    } else if ((p < '0' || p > '9') && p != '-') {
                        StringBuilder sb = new StringBuilder(20);
                        sb.append("Invalid character: ");
                        sb.append(p);
                        throw m106832a(sb.toString());
                    } else {
                        int i = p != '-' ? p - '0' : 0;
                        int i2 = this.f125384g - 1;
                        char q = m106848q();
                        while (m106833a(q) && this.f125384g - i2 < 10) {
                            i = (i * 10) + (q - '0');
                            q = m106848q();
                        }
                        if (q != 0 && m106834b(q)) {
                            while (m106834b(q)) {
                                q = m106848q();
                            }
                            int i3 = this.f125384g - 1;
                            this.f125384g = i3;
                            Object a2 = bkxj.mo66216a(Double.parseDouble(this.f125379b.subSequence(i2, i3).toString()));
                            m106849r();
                            return a2;
                        }
                        this.f125384g--;
                        m106849r();
                        if (p == '-') {
                            i = -i;
                        }
                        return bkxj.mo66217a(i);
                    }
                }
            }
            return bkxj.mo66220a(m106837e(p));
        } else {
            Object c = bkxj.mo66225c();
            m106840i();
            while (this.f125378a) {
                bkxj.mo66221a(mo66427a(bkxj), c);
            }
            mo66431d();
            return bkxj.mo66224b(c);
        }
    }

    /* renamed from: a */
    public final void mo66428a() {
        if (this.f125378a) {
            char p = m106847p();
            if (p == '\"') {
                m106839h();
                m106849r();
            } else if (p != '[') {
                if (p != 'f') {
                    if (p == 'n') {
                        m106843l();
                        return;
                    } else if (p != 't') {
                        if (p == '{') {
                            m106841j();
                            m106842k();
                            return;
                        } else if ((p < '0' || p > '9') && p != '-') {
                            StringBuilder sb = new StringBuilder(20);
                            sb.append("Invalid character: ");
                            sb.append(p);
                            throw m106832a(sb.toString());
                        } else {
                            while (m106834b(p)) {
                                p = m106848q();
                            }
                            this.f125384g--;
                            m106849r();
                            return;
                        }
                    }
                }
                m106837e(p);
            } else {
                m106840i();
                mo66431d();
            }
        }
    }
}
