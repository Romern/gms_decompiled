package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: uxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uxx {

    /* renamed from: a */
    public static final Map f48706a = new HashMap();

    static {
        m39711a(uxs.f48679a);
        m39711a(uxs.f48680b);
        m39711a(uxs.f48681c);
        m39711a(uxs.f48682d);
        m39711a(uxs.f48683e);
        m39711a(uxs.f48684f);
        m39711a(uxs.f48689k);
        m39711a(uxs.f48685g);
        m39711a(uxs.f48686h);
        m39711a(uxs.f48687i);
        m39711a(uxs.f48688j);
        m39711a(uxs.f48690l);
        m39711a(uxs.f48691m);
        m39711a(uxs.f48692n);
        m39711a(uxs.f48693o);
        m39711a(uxs.f48694p);
        m39711a(uxs.f48695q);
        m39711a(uxs.f48696r);
        m39711a(uxs.f48697s);
        m39711a(uxs.f48698t);
        m39711a(uxs.f48699u);
        m39711a(uxs.f48700v);
        m39711a(uxs.f48701w);
        m39711a(uxs.f48702x);
        m39711a(uxs.f48703y);
        m39711a(uxs.f48704z);
        m39711a(uxs.f48662A);
        m39711a(uxs.f48663B);
        m39711a(uxs.f48664C);
        m39711a(uxs.f48665D);
        m39711a(uxs.f48666E);
        m39711a(uxs.f48667F);
        m39711a(uxs.f48668G);
        m39711a(uxs.f48669H);
        m39711a(uxs.f48672K);
        m39711a(uxs.f48670I);
        m39711a(uxs.f48671J);
        m39711a(uxs.f48673L);
        m39711a(uxs.f48674M);
        m39711a(uxs.f48675N);
        m39711a(uxs.f48676O);
        m39711a(uxs.f48677P);
        m39711a(uxs.f48678Q);
        m39711a(uyf.f48708a);
        m39711a(uyf.f48709b);
        m39711a(uyf.f48710c);
        m39711a(uyf.f48711d);
        m39711a(uyf.f48712e);
        m39711a(uyf.f48713f);
        m39711a(uym.f48718a);
        m39711a(uym.f48719b);
        for (uvy uvy : uyu.m39795a()) {
            if (f48706a.get(uvy) == null) {
                String valueOf = String.valueOf(uvy.mo28084a());
                throw new IllegalStateException(valueOf.length() == 0 ? new String("No registered converter for field: ") : "No registered converter for field: ".concat(valueOf));
            }
        }
        for (uvy uvy2 : f48706a.keySet()) {
            if (uyu.m39796a(uvy2.mo28084a()) == null) {
                String valueOf2 = String.valueOf(uvy2.mo28084a());
                throw new IllegalStateException(valueOf2.length() == 0 ? new String("Registered converter for unregistered field: ") : "Registered converter for unregistered field: ".concat(valueOf2));
            }
        }
    }

    /* renamed from: a */
    public static uyk m39710a(uvy uvy) {
        return (uyk) f48706a.get(uvy);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    private static void m39711a(uyk uyk) {
        if (uyk.f48716b instanceof uvu) {
            sdo.m34971a(uyk instanceof uxw, (Object) "Converters for collection fields must be collection converters.");
        }
        f48706a.put(uyk.f48716b, uyk);
    }
}
