package p000;

import java.util.List;
import java.util.Map;

/* renamed from: cxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cxo extends cyc {

    /* renamed from: a */
    static final cxo f12378a = new cxo();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cwn.a(cwl, boolean):void
     arg types: [cxa, int]
     candidates:
      cwn.a(int, byte):void
      cwn.a(int, int):void
      cwn.a(cwl, boolean):void */
    /* renamed from: a */
    public final cvv mo8383a(cuq cuq, cyq cyq) {
        cwe cwe;
        List list;
        Map map = (Map) cyc.f12385b.get(Integer.valueOf(cuq.mo8311g()));
        if (map == null || map.isEmpty() || (cwe = (cwe) map.get(Integer.valueOf(cuq.mo8298a()))) == null || !cyc.m7861b(cuq, cyq) || (list = (List) cwe.mo8353a(cyq)) == null || list.isEmpty()) {
            return super.mo8383a(cuq, cyq);
        }
        cvv a = cvv.m7696a(cut.m7621a(cuw.RECORD_TEMPLATE.mo8317a((cvc[]) list.toArray(new cvc[list.size()]))));
        cwf cwf = cyq.f12405h;
        cwi i = cyq.mo8408i();
        byte g = cuq.mo8311g();
        byte a2 = cuq.mo8298a();
        if (cwf.f12233d.intValue() > 0 && i != null && i.mo8358a(g, a2)) {
            int intValue = cwf.f12233d.intValue() - 1;
            cwf.f12233d = Integer.valueOf(intValue);
            if (intValue == 0) {
                cwz.m7801a(cwf);
                cwn a3 = cwz.m7800a(cwf.f12232c);
                a3.mo8366a((cwl) cxa.ODA_FAILED, false);
                cwf.f12232c = a3.mo8368a();
            }
        }
        return a;
    }
}
