package com.google.android.gms.tapandpay.secard;

import android.content.Context;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import java.io.IOException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FelicaCardStateSyncTaskOperation implements aspm {

    /* renamed from: a */
    private static final srn f108652a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aebi.a(long, long):void
     arg types: [int, int]
     candidates:
      aebz.a(int, int):void
      aebi.a(long, long):void */
    /* renamed from: b */
    public static void m93095b(Context context) {
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
        aebi.f63099k = "secard_CardsStateSync";
        aebi.mo34004a(0L, 1L);
        aebi.mo34023a(0);
        aebi.mo34024a(0, 0);
        aebi.mo34027b(0);
        aeat.m51532a(context).mo33984a(aebi.mo33974b());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atgn.a(atgu, boolean):boolean
     arg types: [atgu, int]
     candidates:
      atgn.a(java.util.List, java.util.List):java.util.Map
      atgn.a(java.lang.String, int):boolean
      atgn.a(atgu, boolean):boolean */
    /* renamed from: a */
    public final int mo49332a(aecc aecc, Context context) {
        boolean z;
        ((bnsl) f108652a.mo68390d()).mo68405a("Executing card state change task");
        String str = aecc.f63128a;
        if (!"secard_CardsStateSync".equals(str)) {
            ((bnsl) f108652a.mo68388c()).mo68420a("Got an unexpected task service tag: %s", str);
            return 2;
        }
        String b = askc.m74272b();
        try {
            AccountInfo b2 = asix.m74201b(context, b);
            atgf a = atgf.m75807a(context);
            if (b2 == null || !a.mo49940a()) {
                return 0;
            }
            askf askf = new askf(b2, b, context);
            atgn a2 = atgn.m75827a(askf);
            try {
                boolean z2 = true;
                for (atgu atgu : a2.mo49946a()) {
                    int i = atgu.f90325b;
                    if (i == 0 || i == 1) {
                        z = true;
                    } else if (i == 2) {
                        ((bnsl) f108652a.mo68390d()).mo68405a("Executing card deletion");
                        btiy btiy = atgu.f90324a.f149123a;
                        if (btiy == null) {
                            btiy = btiy.f149054c;
                        }
                        z = a2.mo49953a(btiy.f149056a, 5);
                    } else if (i == 3) {
                        ((bnsl) f108652a.mo68390d()).mo68405a("Executing card suspension");
                        z = a2.mo49950a(atgu, true);
                    } else if (i == 4) {
                        if (atgu.f90324a.f149123a == null) {
                            btiy btiy2 = btiy.f149054c;
                        }
                        bxvd da = btjw.f149188c.mo74144da();
                        bxvd da2 = btju.f149180c.mo74144da();
                        String str2 = atgu.f90324a.f149147y;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        btju btju = (btju) da2.f164949b;
                        str2.getClass();
                        btju.f149182a = str2;
                        String str3 = atgu.f90328e;
                        if (str3 != null) {
                            str3.getClass();
                            btju.f149183b = str3;
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        btjw btjw = (btjw) da.f164949b;
                        btju btju2 = (btju) da2.mo74062i();
                        btju2.getClass();
                        btjw.f149191b = btju2;
                        btjw.f149190a = 3;
                        try {
                            btiy btiy3 = atgu.f90324a.f149123a;
                            if (btiy3 == null) {
                                btiy3 = btiy.f149054c;
                            }
                            atdm.m75641a(askf, btiy3, atgu.f90329f, atgu.f90330g, (btjw) da.mo74062i(), 392);
                            btiy btiy4 = atgu.f90324a.f149123a;
                            if (btiy4 == null) {
                                btiy4 = btiy.f149054c;
                            }
                            String str4 = btiy4.f149056a;
                            btpr btpr = atgu.f90324a.f149134l;
                            if (btpr == null) {
                                btpr = btpr.f149879b;
                            }
                            int b3 = btpq.m117019b(btpr.f149881a);
                            if (b3 == 0) {
                                b3 = 1;
                            }
                            a2.mo49948a(str4, b3, 0);
                            z = true;
                        } catch (asks | atfh | IOException e) {
                            bnsl bnsl = (bnsl) f108652a.mo68387b();
                            bnsl.mo68437a(e);
                            bnsl.mo68405a("Error while acknowledging payment bundle");
                            z = false;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(29);
                        sb.append("unexpected state: ");
                        sb.append(i);
                        throw new AssertionError(sb.toString());
                    }
                    z2 &= z;
                }
                ((bnsl) f108652a.mo68390d()).mo68420a("Finished executing card state change task. Success: %s", Boolean.valueOf(z2));
                atkl.f90415a.mo50008a();
                if (z2) {
                    return 0;
                }
                return 1;
            } catch (asks e2) {
                return 1;
            }
        } catch (asks e3) {
            ((bnsl) f108652a.mo68387b()).mo68405a("Error retrieving active account");
            return 2;
        }
    }

    /* renamed from: a */
    public final void mo49333a(Context context) {
    }
}
