package p000;

import com.google.android.gms.auth.cryptauth.DeviceFeatureStatus;
import com.google.android.gms.auth.cryptauth.DeviceMetadata;
import com.google.android.gms.auth.proximity.firstparty.SyncedCryptauthDevice;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jkq {

    /* renamed from: a */
    private static final sek f22716a = jsy.m17256a("DeviceConverter");

    /* renamed from: a */
    public static SyncedCryptauthDevice m16849a(DeviceMetadata deviceMetadata) {
        jqx jqx = new jqx();
        jqx.f23092b = deviceMetadata.f10529f;
        jqx.f23093c = deviceMetadata.f10527d;
        jqx.f23098h = "unknown";
        if (deviceMetadata.f10528e != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List list = deviceMetadata.f10528e;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                DeviceFeatureStatus deviceFeatureStatus = (DeviceFeatureStatus) list.get(i);
                if (deviceFeatureStatus.f10520c) {
                    String str = deviceFeatureStatus.f10519b;
                    if (str.endsWith("_SUPPORTED")) {
                        arrayList2.add(str.substring(0, str.length() - 10));
                    } else {
                        arrayList.add(str);
                    }
                }
            }
            jqx.mo14009c(arrayList2);
            jqx.mo14008b(arrayList);
        }
        byte[] bArr = deviceMetadata.f10526c;
        if (bArr != null) {
            try {
                jtp jtp = (jtp) bxvk.m124014a(jtp.f23191d, bArr);
                jqx.f23091a = jtp.f23193a.mo73780k();
                jqx.mo14007a(jij.m16760b(jtp.f23195c));
            } catch (bxwf e) {
                f22716a.mo25415d("Invalid device metadata", e, new Object[0]);
            }
        }
        return jqx.mo14006a();
    }

    /* renamed from: a */
    public static SyncedCryptauthDevice m16850a(jrn jrn, String str) {
        jqx jqx = new jqx();
        jqx.f23091a = sqd.m35971c(jrn.mo7840m());
        jqx.f23092b = str;
        jqx.f23093c = jrn.mo7836i();
        jqx.f23096f = jrn.mo7838k();
        jqx.f23094d = jrn.mo7845r();
        jqx.f23095e = jrn.mo7844q();
        jqx.f23099i = jrn.mo7837j();
        jqx.f23097g = jrn.mo7832d();
        jqx.f23098h = jrn.mo7833f();
        jqx.f23100j = jrn.mo7839l();
        jqx.f23101k = jrn.mo7830b();
        jqx.mo14007a(jrn.mo7831c());
        if (jrn.mo7843p()) {
            jqx.mo14009c(bnkn.m109668a(jrn.mo7842o(), jko.f22714a));
        }
        if (jrn.mo7835h()) {
            jqx.mo14008b(bnkn.m109668a(jrn.mo7834g(), jkp.f22715a));
        }
        return jqx.mo14006a();
    }

    /* renamed from: a */
    public static String m16851a(bsni bsni) {
        return bmwg.UPPER_UNDERSCORE.mo66826b(bmwg.LOWER_CAMEL, bsni.name());
    }

    /* renamed from: a */
    public static String m16852a(String str) {
        return bmwg.LOWER_CAMEL.mo66826b(bmwg.UPPER_UNDERSCORE, str);
    }
}
