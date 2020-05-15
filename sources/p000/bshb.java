package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: bshb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bshb {
    /* renamed from: a */
    public static final bshb m115769a() {
        return new bshb();
    }

    /* renamed from: a */
    public final bsgt mo70551a(bshr bshr) {
        int n = bshr.mo70614n() - 1;
        if (n == 0) {
            bsgs bsgs = new bsgs();
            bshr.mo70600a();
            while (bshr.mo70605e()) {
                Object a = mo70551a(bshr);
                if (a == null) {
                    a = bsgv.f144548a;
                }
                bsgs.f144547a.add(a);
            }
            bshr.mo70601b();
            return bsgs;
        } else if (n == 2) {
            bsgw bsgw = new bsgw();
            bshr.mo70602c();
            while (bshr.mo70605e()) {
                String g = bshr.mo70607g();
                Object a2 = mo70551a(bshr);
                if (a2 == null) {
                    a2 = bsgv.f144548a;
                }
                bsgw.f144549a.put(g, a2);
            }
            bshr.mo70604d();
            return bsgw;
        } else if (n == 5) {
            return new bsgz(bshr.mo70608h());
        } else {
            if (n == 6) {
                return new bsgz(new bshc(bshr.mo70608h()));
            }
            if (n == 7) {
                return new bsgz(Boolean.valueOf(bshr.mo70609i()));
            }
            if (n == 8) {
                bshr.mo70610j();
                return bsgv.f144548a;
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public final void mo70552a(bsht bsht, bsgt bsgt) {
        boolean z;
        if (bsgt == null || (bsgt instanceof bsgv)) {
            bsht.mo70621c();
        } else if (bsgt instanceof bsgz) {
            bsgz bsgz = (bsgz) bsgt;
            if (bsgz.mo70546c()) {
                Number d = bsgz.mo70547d();
                if (d != null) {
                    bsht.mo70616a();
                    String obj = d.toString();
                    if (bsht.f144627c || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
                        bsht.mo70620b();
                        bsht.f144625a.append((CharSequence) obj);
                        return;
                    }
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
                }
                bsht.mo70621c();
            } else if (!bsgz.mo70544a()) {
                String e = bsgz.mo70548e();
                if (e != null) {
                    bsht.mo70616a();
                    bsht.mo70620b();
                    bsht.mo70619a(e);
                    return;
                }
                bsht.mo70621c();
            } else {
                if (bsgz.mo70544a()) {
                    z = bsgz.mo70545b().booleanValue();
                } else {
                    z = Boolean.parseBoolean(bsgz.mo70548e());
                }
                bsht.mo70616a();
                bsht.mo70620b();
                bsht.f144625a.write(!z ? "false" : "true");
            }
        } else if (bsgt instanceof bsgs) {
            bsht.mo70616a();
            bsht.mo70618a(1, "[");
            Iterator it = ((bsgs) bsgt).iterator();
            while (it.hasNext()) {
                mo70552a(bsht, (bsgt) it.next());
            }
            bsht.mo70617a(1, 2, "]");
        } else if (bsgt instanceof bsgw) {
            bsht.mo70616a();
            bsht.mo70618a(3, "{");
            for (Map.Entry entry : ((bsgw) bsgt).f144549a.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new NullPointerException("name == null");
                } else if (bsht.f144628d != null) {
                    throw new IllegalStateException();
                } else if (bsht.f144626b != 0) {
                    bsht.f144628d = str;
                    mo70552a(bsht, (bsgt) entry.getValue());
                } else {
                    throw new IllegalStateException("JsonWriter is closed.");
                }
            }
            bsht.mo70617a(3, 5, "}");
        } else {
            throw new IllegalArgumentException("Couldn't write " + bsgt.getClass());
        }
    }
}
