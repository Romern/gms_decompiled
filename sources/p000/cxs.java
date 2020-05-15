package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: cxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cxs extends cvq {
    public cxs(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cvv mo8339a(cuf cuf, cvs cvs) {
        boolean z;
        boolean z2;
        cux cux;
        cur cur = (cur) cuf;
        cur.mo8303f();
        for (byte[] bArr : cur.f12073b) {
            if (Arrays.equals(bArr, cur.mo8302e())) {
                cys cys = ((cyp) cvs).f12399b;
                if (cys.f12411d == null) {
                    byte[] a = cys.f12408a.mo3395a();
                    if (a != null) {
                        try {
                            if (a.length != 0) {
                                cux = cve.m7664a(cve.m7668a(a), cuw.FCI_TEMPLATE);
                                cys.f12411d = cux;
                            }
                        } catch (IOException e) {
                            throw new cvl(e);
                        }
                    }
                    cux = cve.m7663a(cuw.FCI_TEMPLATE);
                    cys.f12411d = cux;
                }
                return cvv.m7696a(cut.m7621a(cys.f12411d));
            }
        }
        byte[] e2 = cur.mo8302e();
        cuu cuu = cuu.WRONG_LENGTH;
        if (e2.length < 5) {
            z = true;
        } else {
            z = false;
        }
        cuu.mo8315a(z);
        String a2 = cvz.m7704a(e2);
        ArrayList arrayList = new ArrayList();
        cyp cyp = (cyp) cvs;
        if (cyp.f12401d == null) {
            cys cys2 = cyp.f12399b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (cvp cvp : cys2.f12408a.f12425c) {
                linkedHashMap.put(cvp.f12200a.toUpperCase(), cvp);
            }
            cyp.f12401d = Collections.unmodifiableMap(linkedHashMap);
        }
        for (Map.Entry entry : cyp.f12401d.entrySet()) {
            if (((String) entry.getKey()).startsWith(a2)) {
                arrayList.add((cvp) entry.getValue());
            }
        }
        cuu cuu2 = cuu.FILE_OR_APP_NOT_FOUND;
        if (arrayList.size() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        cuu2.mo8315a(z2);
        cvp cvp2 = (cvp) arrayList.get(0);
        cuu.FILE_OR_APP_NOT_FOUND.mo8315a(!(cvp2.f12202c instanceof cxh));
        cyp cyp2 = new cyp(cyp.f12399b, cyp.f12400c, cvp2, cyp.f12402e);
        return cvv.m7695a(new czb(cyp2.f12399b, cyp2.f12400c, cvp2, cyp2.mo8405f(), null), ((cxh) cvp2.f12202c).f12372d.mo8337a(cvp2, !cxt.m7848a(cyp, cvz.m7704a(cur.mo8302e())) ? cuu.SUCCESS : cuu.APPLICATION_BLOCKED));
    }
}
