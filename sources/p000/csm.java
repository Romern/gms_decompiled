package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: csm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class csm extends crz {

    /* renamed from: a */
    public static final Map f11914a;

    /* renamed from: b */
    public static final Map f11915b;

    /* renamed from: c */
    private static final List f11916c = Collections.unmodifiableList(Arrays.asList(new C0914csi(), new csh(), new csj(), new csf("9F36"), new csg("00DC")));

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("00D4", "CVM-Accumulator");
        hashMap.put("00D9", "CVM-Counter");
        hashMap.put("DF40", "CL-Accumulator");
        hashMap.put("DF43", "CL-Counter");
        hashMap.put("00DA", "CVM-Cons_limit_1");
        hashMap.put("00DB", "CVM-Cons_limit_2");
        hashMap.put("00D5", "CVM-Cum_limit_1");
        hashMap.put("00D6", "CVM-Cum_limit_2");
        hashMap.put("00D7", "CVM-Sta_limit_1");
        hashMap.put("00D8", "CVM-Sta_limit_2");
        hashMap.put("DF44", "CL-Cons_limit");
        hashMap.put("DF41", "CL-Cum_limit");
        hashMap.put("DF42", "CL-STA_limit");
        hashMap.put("00CE", "COA");
        hashMap.put("00CD", "NCOT");
        hashMap.put("00CB", "LCOL");
        hashMap.put("00CC", "UCOL");
        hashMap.put("00C8", "LCOA");
        hashMap.put("00C9", "UCOA");
        hashMap.put("00CA", "STA");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("0082", "AIP");
        hashMap2.put("0094", "AFL");
        hashMap2.put("00C0", "CL_ACO");
        hashMap2.put("00DE", "CACO");
        hashMap2.put("00C2", "Issuer_Life_Cycle_Data");
        hashMap2.put("DF30", "CRM-CAC_Switch_Interface");
        hashMap2.put("DF31", "CRM-CAC_Denial");
        hashMap2.put("DF32", "CRM-CAC_Online");
        hashMap2.put("DF33", "CRM-CAC_Default");
        hashMap2.put("DF34", "CVM-CAC_Online-PIN");
        hashMap2.put("00D2", "CRM_Country_Code");
        hashMap2.put("00D3", "CRM_Currency_Code");
        hashMap2.put("9F07", "AUC");
        hashMap2.put("9F6C", "CTQ");
        hashMap2.put("9F71", "CPR");
        hashMap2.put("9F78", "Application_State");
        hashMap2.put("00D0", "IADOL");
        f11914a = Collections.unmodifiableMap(hashMap2);
        f11915b = Collections.unmodifiableMap(hashMap);
    }

    public csm() {
        super(crv.class);
    }

    /* renamed from: a */
    public static void m7452a(crv crv, byte[] bArr) {
        int i;
        Byte d = crv.mo8194d();
        int length = bArr.length + 2;
        if (crv.mo8191a() == 0) {
            i = 0;
        } else {
            i = 1;
        }
        byte b = (byte) (length + i);
        if (d.byteValue() != 0 && d.byteValue() != b) {
            throw new ctu(new csq(b));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0037  */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ czf mo8202a(crn crn, csn csn) {
        crv crv = (crv) crn;
        if (csn.mo8212a().mo8463a(czt.GET_DATA_AFTER_GPO)) {
            csp.m7470a(csn);
        }
        boolean z = false;
        String upperCase = czm.m8019b(crv.mo8191a(), crv.mo8192b()).toUpperCase();
        Iterator it = f11916c.iterator();
        csr csr = null;
        while (it.hasNext() && (csr = ((csl) it.next()).mo8208a(upperCase, crv, csn)) == null) {
            while (it.hasNext()) {
                while (it.hasNext()) {
                }
            }
        }
        if (csr == null) {
            z = true;
        }
        css.REFERENCED_DATA_NOT_FOUND.mo8229a(z);
        return czf.m7989a(csr);
    }
}
