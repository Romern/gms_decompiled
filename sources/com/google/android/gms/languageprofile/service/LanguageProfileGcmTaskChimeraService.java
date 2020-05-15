package com.google.android.gms.languageprofile.service;

import android.accounts.Account;
import android.os.Build;
import android.util.Log;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LanguageProfileGcmTaskChimeraService extends aeah {
    /* renamed from: a */
    static void m66811a(aeat aeat, aecs aecs) {
        if (cere.m138102c()) {
            Log.i("LPGcmTaskChimeraService", "Scheduling sync task.");
            aecs.mo34081b();
            return;
        }
        Log.i("LPGcmTaskChimeraService", "Unscheduling sync tasks.");
        aeat.mo33986a("languageprofile.SyncPeriodicUploadTask", "com.google.android.gms.languageprofile.GcmTaskService");
        aeat.mo33986a("languageprofile.SyncPeriodicWipeoutTask", "com.google.android.gms.languageprofile.GcmTaskService");
        aeat.mo33986a("languageprofile.CleanupPeriodicTask", "com.google.android.gms.languageprofile.GcmTaskService");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnkn.a(java.util.List, bmxj):java.util.List
     arg types: [bngx, bmxj]
     candidates:
      bnkn.a(java.util.List, int):java.util.List
      bnkn.a(java.util.List, java.lang.Object):boolean
      bnkn.a(java.util.List, bmxj):java.util.List */
    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        boolean z = false;
        int i = 0;
        if (!cere.m138102c()) {
            return 0;
        }
        bbjl a = advu.m51252b().mo34111a(aecc.f63128a);
        advd advd = advd.SYNC_ID_UNKNOWN;
        int ordinal = ((advd) a.mo56168a()).ordinal();
        if (ordinal == 1) {
            if (a.mo56169b() == 3) {
                List a2 = bnkn.m109668a((List) adwg.m51270b(), adwy.f62854a);
                bsje bsje = (bsje) bsjf.f144784c.mo74144da();
                bsje.mo70628a(a2);
                String b = cere.m138101b();
                if (bsje.f164950c) {
                    bsje.mo74035c();
                    bsje.f164950c = false;
                }
                b.getClass();
                ((bsjf) bsje.f164949b).f144787b = b;
                int i2 = Build.VERSION.SDK_INT;
                if (bsje.f164950c) {
                    bsje.mo74035c();
                    bsje.f164950c = false;
                }
                ((bsjf) bsje.f164949b).f144788d = false;
                bsjf bsjf = (bsjf) bsje.mo74062i();
                adxl.m51314a();
                bmxv a3 = adwg.m51268a();
                if (a3.mo66813a()) {
                    Account[] accountArr = (Account[]) a3.mo66814b();
                    int length = accountArr.length;
                    for (i++; i < length; i++) {
                        adxl.m51318a(accountArr[i], bsjf);
                    }
                    z = true;
                } else {
                    z = true;
                }
            }
            aecs a4 = advu.m51251a();
            return a4.mo34073a(a4.mo34074a(a, new adxj(adxl.m51314a(), z), advu.m51253c()));
        } else if (ordinal == 2) {
            aecs a5 = advu.m51251a();
            return a5.mo34073a(a5.mo34074a(a, new adxr(adxt.m51334a()), advu.m51253c()));
        } else if (ordinal == 3) {
            aect a6 = advu.m51251a().mo34060a((advd) a.mo56168a());
            return a6.mo34063a(a6.mo34066a(adww.f62852a, a.mo56169b(), advu.m51253c()), a.mo56169b());
        } else if (ordinal != 4) {
            return 0;
        } else {
            aect a7 = advu.m51251a().mo34060a((advd) a.mo56168a());
            return a7.mo34063a(a7.mo34066a(adwx.f62853a, a.mo56169b(), advu.m51253c()), a.mo56169b());
        }
    }
}
