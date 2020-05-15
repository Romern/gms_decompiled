package p000;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: asrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asrs implements assh {

    /* renamed from: a */
    public static final srn f89540a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: asrs.a(org.json.JSONObject, boolean):caou
     arg types: [org.json.JSONObject, int]
     candidates:
      asrs.a(org.json.JSONObject, org.json.JSONObject):asrx
      assh.a(org.json.JSONObject, org.json.JSONObject):asrx
      asrs.a(org.json.JSONObject, boolean):caou */
    /* renamed from: a */
    public static final assc m74598a(asro asro, JSONObject jSONObject, asse asse) {
        caou a = m74599a(jSONObject, false);
        casa casa = asro.f89531a;
        asrt asrt = new asrt(a);
        caof a2 = caog.m126869a(casa, asrt, asrt, asrt, asrt, null);
        try {
            a2.mo74718a();
            carp carp = new carp();
            carp.f175690b = 1;
            carp.f175689a = asse.f89557a;
            try {
                carr a3 = cars.m127065a(carp, a2);
                int i = a3.f175696b;
                int i2 = i - 1;
                if (i2 == 0) {
                    return new asrn(a3, a);
                }
                if (i2 == 1) {
                    throw new assb(4, "Internal Error");
                } else if (i2 == 3) {
                    throw new assb(1, "Invalid Input");
                } else if (i2 != 4) {
                    String a4 = cart.m127066a(i);
                    StringBuilder sb = new StringBuilder(a4.length() + 24);
                    sb.append("Unexpected result code: ");
                    sb.append(a4);
                    throw new RuntimeException(sb.toString());
                } else {
                    throw new assb(3, "Declined");
                }
            } catch (GeneralSecurityException e) {
                throw new assb(4, "unknown reason");
            } catch (capg e2) {
                throw new assb(1, "unknown reason");
            }
        } catch (capi e3) {
            throw new assb(2, "Profile doesn't support in-app payments");
        }
    }

    /* renamed from: a */
    private static final caou m74599a(JSONObject jSONObject, boolean z) {
        return new asrm(jSONObject, z);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ asrx mo3414a(JSONObject jSONObject, JSONObject jSONObject2) {
        return new asro(jSONObject);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: asrs.a(org.json.JSONObject, boolean):caou
     arg types: [org.json.JSONObject, int]
     candidates:
      asrs.a(org.json.JSONObject, org.json.JSONObject):asrx
      assh.a(org.json.JSONObject, org.json.JSONObject):asrx
      asrs.a(org.json.JSONObject, boolean):caou */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ asry mo3415a(asrx asrx, JSONObject jSONObject, byte[] bArr, asrz asrz, Set set) {
        bngx bngx;
        asro asro = (asro) asrx;
        caou a = m74599a(jSONObject, true);
        asrl asrl = new asrl(asrz);
        if (set != null) {
            bngs j = bngx.m109377j();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                assa assa = (assa) it.next();
                j.mo67668c(new caol(String.format("%02X", Integer.valueOf(assa.f89551a)), assa.f89552b));
            }
            bngx = j.mo67664a();
        } else {
            bngx = null;
        }
        return new asrr(asro, a, asrl, bngx);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ assc mo3416a(asrx asrx, JSONObject jSONObject, byte[] bArr, asse asse, asrz asrz) {
        return m74598a((asro) asrx, jSONObject, asse);
    }
}
