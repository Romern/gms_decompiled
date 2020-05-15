package p000;

import java.util.Collection;

/* renamed from: azvh */
final /* synthetic */ class azvh implements bmxj {

    /* renamed from: a */
    private final azvv f100084a;

    public azvh(azvv azvv) {
        this.f100084a = azvv;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: azqf.a(java.util.Collection, bmxj):org.json.JSONArray
     arg types: [bngx, azvm]
     candidates:
      azqf.a(java.lang.String, bmxj):bmxv
      azqf.a(bmxv, bmxv):java.lang.String
      azqf.a(java.lang.String, java.lang.Object[]):java.lang.String
      azqf.a(java.util.List, bmxj):java.util.List
      azqf.a(java.util.Collection, bmxj):org.json.JSONArray */
    public final Object apply(Object obj) {
        azvv azvv = this.f100084a;
        azqf.m86130a(azvv.f99942a);
        azqf.m86130a(azvv.f99942a);
        return azqf.m86139a(azqf.m86142a((Collection) ((bngx) obj), (bmxj) new azvm(azvv)));
    }
}
