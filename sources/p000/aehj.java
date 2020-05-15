package p000;

import java.util.List;

/* renamed from: aehj */
public final /* synthetic */ class aehj implements roo {

    /* renamed from: a */
    private final List f63400a;

    public aehj(List list) {
        this.f63400a = list;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        boolean z;
        List list = this.f63400a;
        aekl aekl = (aekl) obj;
        aehk aehk = new aehk((aucf) obj2);
        aekl.mo25288A();
        if (list == null || list.size() <= 0) {
            z = false;
        } else {
            z = true;
        }
        sdo.m34975b(z, "geofenceRequestIds can't be null nor empty.");
        sdo.m34966a(aehk, "ResultHolder not provided.");
        aekk aekk = new aekk(aehk);
        ((aekb) aekl.mo25289B()).mo34233a((String[]) list.toArray(new String[0]), aekk, aekl.f43948r.getPackageName());
    }
}
