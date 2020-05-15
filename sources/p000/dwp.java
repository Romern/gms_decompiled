package p000;

import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.WriteBatchImpl;
import java.util.ArrayList;

/* renamed from: dwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dwp {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, doh, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* renamed from: a */
    static void m9643a() {
        tit tit = new tit();
        tit.mo26579a(10002);
        tiu a = tit.mo26578a();
        for (doh doh : dwq.m9681y().mo9331a()) {
            if (!doh.mo9338b()) {
                WriteBatchImpl b = tjj.m37080b();
                eej a2 = dwq.m9672p().mo10037a((ContextDataFilterImpl) a, dwq.m9652a(doh, "ContextManagerInitializer"));
                if (a2.f14775a != 0) {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                    bnsl.mo68432a("dwp", "a", 107, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68422a("[ContextManagerInitializer] Unable to read from store for account %s, status code is %s", (Object) doh, a2.f14775a);
                } else {
                    ArrayList arrayList = a2.f14776b;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        ArrayList arrayList2 = a2.f14776b;
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            ContextData contextData = (ContextData) arrayList2.get(i);
                            tka a3 = dqt.m9102a(contextData.mo18022j());
                            if (a3 != null) {
                                bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                                bnsl2.mo68432a("dwp", "a", 118, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl2.mo68405a("[ContextManagerInitializer] Fixing UDC Model timestamps");
                                tip tip = new tip(contextData);
                                tip.mo26574a(a3);
                                b.mo18101a(tip.mo26570a());
                            }
                        }
                    }
                    dwq.m9672p().mo10036a(b, dwq.m9652a(doh, "ContextManagerInitializer"));
                }
            }
        }
    }
}
