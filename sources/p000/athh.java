package p000;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: athh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class athh {

    /* renamed from: a */
    public static final /* synthetic */ int f90367a = 0;

    /* renamed from: b */
    private static final srn f90368b = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public static boolean m75883a(askf askf, atfh atfh) {
        return m75884a(askf, atfh.f90231a);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: asiv.a(askf, boolean):void
     arg types: [askf, int]
     candidates:
      asiv.a(java.lang.String, askf):void
      asiv.a(askf, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: atkm.a(boolean, long):void
     arg types: [int, long]
     candidates:
      atkm.a(int, int):void
      atkm.a(boolean, long):void */
    /* renamed from: b */
    public static void m75886b(askf askf) {
        try {
            asiv.m74184a(askf, false);
            new atkm(askf.f89126d).mo50014a(true, System.currentTimeMillis());
        } catch (asks e) {
            bnsl bnsl = (bnsl) f90368b.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("athh", "b", 185, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error in onAttestationPassed");
        }
    }

    /* renamed from: a */
    public static boolean m75884a(askf askf, btnf btnf) {
        boolean a = m75885a(btnf);
        try {
            asiv.m74184a(askf, a);
            new atkm(askf.f89126d).mo50014a(!a, System.currentTimeMillis());
            if (a) {
                athk a2 = athk.m75896a(askf.f89126d);
                Bundle a3 = a2.mo49992a();
                a3.remove(athk.m75897a(askf));
                a2.mo49994a(a3);
                atho.m75903a(askf);
                bnsl bnsl = (bnsl) f90368b.mo68388c();
                bnsl.mo68432a("athh", "a", 165, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Device fails attestation");
            }
        } catch (asks e) {
            bnsl bnsl2 = (bnsl) f90368b.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("athh", "a", 168, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Error in checkAndHandleAttestationFailure");
        }
        return a;
    }

    /* renamed from: a */
    public static boolean m75885a(btnf btnf) {
        char c = 2;
        btmz btmz = (btmz) atff.m75762a(btnf, btmz.f149585b, 2);
        if (btmz != null) {
            int i = btmz.f149587a;
            if (i != 0) {
                c = i != 1 ? i != 2 ? i != 3 ? (char) 0 : 5 : 4 : 3;
            }
            return c != 0 && c == 3;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: boam.a(boah, java.lang.Character):boan
     arg types: [boah, int]
     candidates:
      boam.a(byte[], java.lang.CharSequence):int
      boam.a(java.lang.String, int):boan
      boan.a(byte[], java.lang.CharSequence):int
      boan.a(java.lang.String, int):boan
      boan.a(byte[], int):java.lang.String
      boam.a(boah, java.lang.Character):boan */
    /* renamed from: a */
    public final btiw mo49987a(askf askf) {
        long currentTimeMillis = System.currentTimeMillis();
        int i = 1000;
        while (true) {
            try {
                byte[] k = ((btpa) atff.m75759a(askf, "t/security/getnonce", btoz.f149820a, btpa.f149822b)).f149824a.getKey();
                if (k == null || k.length == 0) {
                    throw new IOException("nonce for attestation verdict was null");
                }
                String a = cgwa.f187838a.mo6606a().mo84557a();
                sdo.m34977c(a);
                ByteString a2 = ByteString.m123261a(k);
                HashMap hashMap = new HashMap();
                boan boan = boan.f132470d;
                if (8 % ((boam) boan).f132467b.f132457d != 0) {
                    Character ch = ((boam) boan).f132468c;
                    if (ch != null) {
                        if (ch.charValue() == '=') {
                        }
                    }
                    boan = ((boam) boan).mo68780a(((boam) boan).f132467b, (Character) '=');
                }
                hashMap.put("nonce", boan.mo68794a(a2.getKey()));
                DroidGuardResultsRequest droidGuardResultsRequest = new DroidGuardResultsRequest();
                droidGuardResultsRequest.mo18378b((int) cgwa.f187838a.mo6606a().mo84558b());
                String a3 = new vvp(askf.f89126d).mo28903a(a, hashMap, droidGuardResultsRequest);
                bxvd da = btiw.f149044d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                ((btiw) da.f164949b).f149046a = 2;
                btiw btiw = (btiw) da.f164949b;
                a3.getClass();
                btiw.f149047b = a3;
                a2.getClass();
                btiw.f149048c = a2;
                return (btiw) da.mo74062i();
            } catch (IOException e) {
                if (System.currentTimeMillis() <= 10000 + currentTimeMillis) {
                    SystemClock.sleep((long) i);
                    i += i;
                } else {
                    throw e;
                }
            }
        }
    }
}
