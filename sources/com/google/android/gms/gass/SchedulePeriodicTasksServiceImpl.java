package com.google.android.gms.gass;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.settings.C0287e;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SchedulePeriodicTasksServiceImpl extends aeah {
    /* renamed from: a */
    public static void m24289a(Context context) {
        bxvd da = aaii.f28175f.mo74144da();
        String c = C0287e.m5194a(rpr.m34216b()).mo6512c();
        if (!TextUtils.isEmpty(c)) {
            bxtx a = bxtx.m123261a(c.getBytes());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aaii aaii = (aaii) da.f164949b;
            a.getClass();
            aaii.f28177a |= 1;
            aaii.f28178b = a;
        } else {
            bxtx a2 = bxtx.m123261a(new byte[16]);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aaii aaii2 = (aaii) da.f164949b;
            a2.getClass();
            aaii2.f28177a |= 1;
            aaii2.f28178b = a2;
        }
        aaii aaii3 = (aaii) da.f164949b;
        int i = aaii3.f28177a | 2;
        aaii3.f28177a = i;
        aaii3.f28179c = 201515033;
        aaii3.f28177a = i | 4;
        aaii3.f28180d = 1;
        long longValue = aagu.m21241a().longValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aaii aaii4 = (aaii) da.f164949b;
        aaii4.f28177a |= 8;
        aaii4.f28181e = longValue;
        aagu.m21242a(context, aagu.m21240a(3, ((aaii) da.mo74062i()).mo73642k()));
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        String str = aecc.f63128a;
        if ("GASS_PERIODIC_TASKS_AD_ATTESTATION_SIGNAL".equals(str)) {
            m24289a(this);
            return 0;
        }
        if ("GPTGLS".equals(str)) {
            if (cebd.m135901e()) {
                aagu.m21242a(this, aagu.m21240a(4, (byte[]) null));
                return 0;
            }
        } else if ("GPDT".equals(str) && cebg.m135923b()) {
            aaip a = aagu.m21240a(5, (byte[]) null);
            dcg a2 = dcg.m8153a(aecc.f63129b.getInt("PDTAKey", -1));
            if (a2 == null) {
                return 2;
            }
            aagi a3 = aagi.m21209a(this);
            aahg aahg = new aahg(new aahj(snp.m35704b(9), rpr.m34216b().getRequestQueue(), a3), new vyu(), a3, a2);
            String valueOf = String.valueOf(a2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
            sb.append("Gass program download task scheduled for architecture:");
            sb.append(valueOf);
            sb.toString();
            return aahg.mo16868a(this, a);
        }
        return 2;
    }
}
