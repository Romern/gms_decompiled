package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: csc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class csc extends crz {
    public csc(Class cls) {
        super(cls);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ czf mo8202a(crn crn, csn csn) {
        cry cry = (cry) crn;
        cry.mo8196f();
        byte[] e = cry.mo8195e();
        boolean z = true;
        css.WRONG_LENGTH.mo8229a(e.length < 5);
        String b = czm.m8019b(e);
        ArrayList arrayList = new ArrayList();
        if (csn.f11919c == null) {
            ctn ctn = csn.f11918b;
            HashMap hashMap = new HashMap();
            cso.m7469a(hashMap, ctn.mo8280b(), ctw.ZIP);
            cso.m7469a(hashMap, ctn.mo8276a(), ctw.DPAS);
            cso.m7469a(hashMap, ctn.m7564a(ctn.f12028a.mo8272c("Common_debit_FCI")), ctw.DPAS);
            cso.m7469a(hashMap, ctn.m7564a(ctn.f12028a.mo8272c("ALT_FCI_1")), ctw.DPAS);
            cso.m7469a(hashMap, ctn.m7564a(ctn.f12028a.mo8272c("ALT_FCI_2")), ctw.DPAS);
            csn.f11919c = Collections.unmodifiableMap(hashMap);
        }
        for (Map.Entry entry : csn.f11919c.entrySet()) {
            if (((String) entry.getKey()).startsWith(b)) {
                arrayList.add((cty) entry.getValue());
            }
        }
        css css = css.FILE_OR_APP_NOT_FOUND;
        if (arrayList.size() == 1) {
            z = false;
        }
        css.mo8229a(z);
        cty cty = (cty) arrayList.get(0);
        return czf.m7988a(new czi(csn.mo8210a(cty), cty), cty.f12049c.f12045c.mo8295a(cty));
    }
}
