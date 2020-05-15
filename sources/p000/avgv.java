package p000;

import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* renamed from: avgv */
final /* synthetic */ class avgv implements rkl {

    /* renamed from: a */
    private final avgw f93160a;

    /* renamed from: b */
    private final String f93161b;

    /* renamed from: c */
    private final bxsk f93162c;

    public avgv(avgw avgw, String str, bxsk bxsk) {
        this.f93160a = avgw;
        this.f93161b = str;
        this.f93162c = bxsk;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, java.lang.String]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* renamed from: a */
    public final void mo9454a(rkk rkk) {
        alzr alzr;
        avgw avgw = this.f93160a;
        String str = this.f93161b;
        bxsk bxsk = this.f93162c;
        alky alky = (alky) rkk;
        try {
            Status bo = alky.mo7183bo();
            String str2 = null;
            if (!bo.mo17710c()) {
                bnsl bnsl = (bnsl) avgw.f93163a.mo68388c();
                bnsl.mo68432a("avgw", "a", 147, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68413a("Error (%d) loading owner data: %s", bo.f30115i, (Object) bo.f30116j);
            } else {
                amey b = alky.mo12459b();
                if (b != null) {
                    Iterator it = b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            alzr = (alzr) it.next();
                            if (alzr.mo41063c().equals(str)) {
                                break;
                            }
                        } else {
                            bnsl bnsl2 = (bnsl) avgw.f93163a.mo68388c();
                            bnsl2.mo68432a("avgw", "a", 172, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl2.mo68405a("No Owner found for the current account");
                            alzr = null;
                            break;
                        }
                    }
                } else {
                    bnsl bnsl3 = (bnsl) avgw.f93163a.mo68388c();
                    bnsl3.mo68432a("avgw", "a", 162, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("No owners data arrived with successful response");
                    alzr = null;
                }
                if (alzr != null && alzr.mo41065f()) {
                    str2 = alzr.mo41064d();
                }
            }
            avgw.mo51215a(str2, bxsk);
        } finally {
            alky.mo12460c();
        }
    }
}
