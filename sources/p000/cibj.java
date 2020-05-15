package p000;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: cibj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cibj {

    /* renamed from: a */
    private static final Logger f189731a = Logger.getLogger(cibj.class.getName());

    private cibj() {
    }

    /* renamed from: a */
    private static Object m149967a(bshr bshr) {
        double d;
        char c;
        bmxy.m108601b(bshr.mo70605e(), "unexpected end of JSON");
        int n = bshr.mo70614n() - 1;
        boolean z = true;
        if (n == 0) {
            bshr.mo70600a();
            ArrayList arrayList = new ArrayList();
            while (bshr.mo70605e()) {
                arrayList.add(m149967a(bshr));
            }
            if (bshr.mo70614n() != 2) {
                z = false;
            }
            String valueOf = String.valueOf(bshr.mo70613m());
            bmxy.m108601b(z, valueOf.length() == 0 ? new String("Bad token: ") : "Bad token: ".concat(valueOf));
            bshr.mo70601b();
            return Collections.unmodifiableList(arrayList);
        } else if (n == 2) {
            bshr.mo70602c();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (bshr.mo70605e()) {
                linkedHashMap.put(bshr.mo70607g(), m149967a(bshr));
            }
            if (bshr.mo70614n() != 4) {
                z = false;
            }
            String valueOf2 = String.valueOf(bshr.mo70613m());
            bmxy.m108601b(z, valueOf2.length() == 0 ? new String("Bad token: ") : "Bad token: ".concat(valueOf2));
            bshr.mo70604d();
            return Collections.unmodifiableMap(linkedHashMap);
        } else if (n == 5) {
            return bshr.mo70608h();
        } else {
            if (n == 6) {
                int i = bshr.f144611d;
                if (i == 0) {
                    i = bshr.mo70606f();
                }
                if (i == 15) {
                    bshr.f144611d = 0;
                    int[] iArr = bshr.f144616i;
                    int i2 = bshr.f144615h - 1;
                    iArr[i2] = iArr[i2] + 1;
                    d = (double) bshr.f144612e;
                } else {
                    if (i == 16) {
                        bshr.f144614g = new String(bshr.f144609b, bshr.f144610c, bshr.f144613f);
                        bshr.f144610c += bshr.f144613f;
                    } else if (i == 8 || i == 9) {
                        if (i == 8) {
                            c = '\'';
                        } else {
                            c = '\"';
                        }
                        bshr.f144614g = bshr.mo70599a(c);
                    } else if (i == 10) {
                        bshr.f144614g = bshr.mo70611k();
                    } else if (i != 11) {
                        throw new IllegalStateException("Expected a double but was " + ((Object) bshs.m115808a(bshr.mo70614n())) + bshr.mo70612l());
                    }
                    bshr.f144611d = 11;
                    d = Double.parseDouble(bshr.f144614g);
                    if (bshr.f144608a || (!Double.isNaN(d) && !Double.isInfinite(d))) {
                        bshr.f144614g = null;
                        bshr.f144611d = 0;
                        int[] iArr2 = bshr.f144616i;
                        int i3 = bshr.f144615h - 1;
                        iArr2[i3] = iArr2[i3] + 1;
                    } else {
                        throw new bshu("JSON forbids NaN and infinities: " + d + bshr.mo70612l());
                    }
                }
                return Double.valueOf(d);
            } else if (n == 7) {
                return Boolean.valueOf(bshr.mo70609i());
            } else {
                if (n != 8) {
                    String valueOf3 = String.valueOf(bshr.mo70613m());
                    throw new IllegalStateException(valueOf3.length() == 0 ? new String("Bad token: ") : "Bad token: ".concat(valueOf3));
                }
                bshr.mo70610j();
                return null;
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.io.IOException]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* renamed from: a */
    public static Object m149968a(String str) {
        bshr bshr = new bshr(new StringReader(str));
        try {
            return m149967a(bshr);
        } finally {
            try {
                bshr.close();
            } catch (IOException e) {
                f189731a.logp(Level.WARNING, "io.grpc.internal.JsonParser", "parse", "Failed to close", (Throwable) e);
            }
        }
    }
}
