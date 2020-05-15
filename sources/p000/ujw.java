package p000;

import java.util.Iterator;

/* renamed from: ujw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ujw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f47823a;

    /* renamed from: b */
    final /* synthetic */ ujx f47824b;

    public ujw(ujx ujx, boolean z) {
        this.f47824b = ujx;
        this.f47823a = z;
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
    public final void run() {
        boolean z;
        ukt a;
        ujx ujx = this.f47824b;
        boolean z2 = this.f47823a;
        sdo.m34970a(ujx.mo27596c());
        Iterator it = ujx.f47828d.mo28337c().iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            uot uot = (uot) it.next();
            sdo.m34971a(!uot.f48428c, (Object) "Cannot delete an already deleted domain class");
            uot.f48426a.mo27425b(uot.f48427b);
            uot.f48428c = true;
        }
        ujx.mo27580ap();
        if (ujx.mo27571ag() && (a = ujx.f47828d.mo28336a()) != null) {
            ujx.f47825a.f47877F = false;
            ujx.f47828d.mo27425b(a);
        }
        vea vea = ujx.f47828d;
        for (umn umn : vea.f49098a.mo27387e(vea.f49105b)) {
            ujx.f47828d.mo27425b(umn);
        }
        for (ukc ukc : ujx.f47828d.mo28338d()) {
            ujx.f47828d.mo27425b(ukc);
        }
        vea vea2 = ujx.f47828d;
        sdo.m34974b(vea2.f49105b.mo27498a());
        vea2.f49098a.mo27381b(vea2.f49105b.f47676a.longValue());
        ukg ukg = ujx.f47825a;
        if (!ukg.f47876E || !ukg.mo27656d() || ukg.f47916h != null) {
            z = false;
        }
        sdo.m34970a(z);
        ukg.f47887P = "";
        ukg.f47879H = false;
        ukg.f47878G = false;
        ukg.mo27652a(ung.UNTRASHED);
        ukg.mo27651a(uml.UNPINNED);
        ukg.f47894W = false;
        ukg.f47891T = false;
        ukg.f47883L = ukg.f47870a;
        ukg.f47884M = ukg.f47870a;
        ukg.f47911c = null;
        ukg.f47910b = null;
        ukg.f47913e = null;
        ukg.mo27649a("");
        ukg.f47921m = null;
        ukg.f47885N = null;
        ukg.f47926r = null;
        ukg.f47927s = null;
        ukg.f47928t = null;
        ukg.f47917i = null;
        ukg.f47930v = null;
        ukg.f47922n = null;
        ukg.f47892U = false;
        ukg.f47923o = null;
        ukg.f47924p = null;
        ukg.f47903af = 0;
        ukg.f47915g = null;
        ukg.f47925q = null;
        ukg.f47900ac = false;
        ukg.f47899ab = false;
        ukg.f47931w = null;
        ukg.f47905ah = 0;
        ukg.f47872A = null;
        ukg.f47873B = null;
        ukg.f47893V = false;
        ukg.mo27653b((String) null);
        ukg.f47881J = 0;
        ukg.f47906ai = null;
        ukg.f47929u = null;
        ukg.f47919k = null;
        ukg.f47918j = null;
        ukg.f47901ad = false;
        ukg.f47877F = false;
        ukg.f47882K = 0;
        ukg.f47895X = false;
        ukg.f47896Y = false;
        ukg.f47904ag = 0;
        ukg.f47912d = null;
        ukg.f47933y = null;
        ukg.f47920l = null;
        ujx.mo27627m(z2);
    }
}
