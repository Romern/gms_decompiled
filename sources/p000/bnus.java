package p000;

/* renamed from: bnus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnus extends bnuw {

    /* renamed from: a */
    public static final bnuw f132205a = new bnus();

    private bnus() {
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [bnut, bnup], assign insn: null */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnss.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      bnss.a(java.lang.String, boolean):int
      bnss.a(int, boolean):boolean */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final int mo68500a(bnut r7, int i, String str, int i2, int i3, int i4) {
        bnuo bnuo;
        int i5 = i4 + 1;
        char charAt = str.charAt(i4);
        char c = charAt & ' ';
        bnss a = bnss.m110335a(str, i3, i4, c == 0);
        bnsr bnsr = bnsr.f132094k[bnsr.m110331a(charAt)];
        if (c == 0 && (bnsr == null || (bnsr.f132098n & 128) == 0)) {
            bnsr = null;
        }
        if (bnsr != null) {
            if (a.mo68465a(bnsr.f132098n, bnsr.f132097m.f132111f)) {
                bnuo = bnuq.m110456a(i, bnsr, a);
            } else {
                throw bnuv.m110465a("invalid format specifier", str, i2, i5);
            }
        } else if (charAt == 't' || charAt == 'T') {
            if (a.mo68465a(160, false)) {
                int i6 = i5 + 1;
                if (i6 <= str.length()) {
                    bnum bnum = (bnum) bnum.f132171F.get(Character.valueOf(str.charAt(i5)));
                    if (bnum != null) {
                        bnuo = new bnun(a, i, bnum);
                        i5 = i6;
                    } else {
                        throw bnuv.m110464a("illegal date/time conversion", str, i5);
                    }
                } else {
                    throw bnuv.m110464a("truncated format specifier", str, i2);
                }
            } else {
                throw bnuv.m110465a("invalid format specification", str, i2, i5);
            }
        } else if (charAt != 'h' && charAt != 'H') {
            throw bnuv.m110465a("invalid format specification", str, i2, i5);
        } else if (a.mo68465a(160, false)) {
            bnuo = new bnur(a, i);
        } else {
            throw bnuv.m110465a("invalid format specification", str, i2, i5);
        }
        int i7 = bnuo.f132201a;
        if (i7 < 32) {
            r7.f132207f |= 1 << i7;
        }
        r7.f132208g = Math.max(r7.f132208g, i7);
        bnti bnti = (bnti) r7;
        r7.mo68501a().mo68504a(bnti.f132126d, r7.mo68502b(), bnti.f132127e, i2);
        Object[] objArr = bnti.f132125c;
        int i8 = bnuo.f132201a;
        if (i8 >= objArr.length) {
            bnti.f132126d.append("[ERROR: MISSING LOG ARGUMENT]");
        } else {
            Object obj = objArr[i8];
            if (obj != null) {
                bnuo.mo68499a(r7, obj);
            } else {
                bnti.f132126d.append("null");
            }
        }
        bnti.f132127e = i5;
        return i5;
    }
}
