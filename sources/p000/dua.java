package p000;

import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

/* renamed from: dua */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dua {
    /* renamed from: a */
    public static void m9358a(dus dus, ego ego, drb drb, ContextManagerClientInfo contextManagerClientInfo) {
        dus dus2 = dus;
        bxcl bxcl = bxcl.UNKNOWN_CONTEXT_FENCE_TYPE;
        switch (dus2.f14074a.ordinal()) {
            case 1:
            case 2:
            case 3:
            case 22:
                for (dus dus3 : dus.mo9661a()) {
                    m9358a(dus3, ego, drb, contextManagerClientInfo);
                }
                break;
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 24:
                for (int i : dus.mo9652g()) {
                    m9359a(ego, tiq.m37051b(i), dwj.m9630a(), null, drb, contextManagerClientInfo);
                }
                break;
            case 6:
                int i2 = dus.mo9665k().f14075b;
                if (i2 == 4) {
                    bxco bxco = bxco.PLACES;
                    dwj b = dwj.m9631b();
                    bxvd da = bxdf.f163018j.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bxdf bxdf = (bxdf) da.f164949b;
                    bxdf.f163021b = 7;
                    bxdf.f163020a |= 1;
                    m9359a(ego, bxco, b, new dwk((bxdf) da.mo74062i()), drb, contextManagerClientInfo);
                    m9359a(ego, bxco.SCREEN, dwj.m9631b(), null, drb, contextManagerClientInfo);
                    m9359a(ego, bxco.USER_LOCATION, dwj.m9631b(), null, drb, contextManagerClientInfo);
                    break;
                } else {
                    if (i2 == 5) {
                        m9359a(ego, bxco.PLACES, dwj.m9631b(), dwk.m9636a(cdgp.m133217z(), (int) cdgp.m133215x()), drb, contextManagerClientInfo);
                        if (!cdgp.m133208q()) {
                            break;
                        }
                    }
                    m9359a(ego, bxco.PLACES, dwj.m9631b(), null, drb, contextManagerClientInfo);
                    break;
                }
            case 12:
                List a = dus.mo9666l().mo9656a();
                int size = a.size();
                for (int i3 = 0; i3 < size; i3++) {
                    bxby bxby = (bxby) a.get(i3);
                    bxco bxco2 = bxco.DETECTED_BEACON;
                    dwj a2 = dwj.m9630a();
                    String str = bxby.f162755b;
                    String str2 = bxby.f162756c;
                    byte[] k = bxby.f162757d.mo73780k();
                    bxvd da2 = bxdf.f163018j.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bxdf bxdf2 = (bxdf) da2.f164949b;
                    bxdf2.f163021b = 4;
                    bxdf2.f163020a |= 1;
                    if (!TextUtils.isEmpty(str)) {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bxdf bxdf3 = (bxdf) da2.f164949b;
                        str.getClass();
                        bxdf3.f163020a |= 8;
                        bxdf3.f163024e = str;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bxdf bxdf4 = (bxdf) da2.f164949b;
                        str2.getClass();
                        bxdf4.f163020a |= 16;
                        bxdf4.f163025f = str2;
                    }
                    if (k != null && k.length > 0) {
                        bxtx a3 = bxtx.m123261a(k);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bxdf bxdf5 = (bxdf) da2.f164949b;
                        a3.getClass();
                        bxdf5.f163020a |= 32;
                        bxdf5.f163026g = a3;
                    }
                    m9359a(ego, bxco2, a2, new dwk((bxdf) da2.mo74062i()), drb, contextManagerClientInfo);
                }
                break;
            case 14:
            default:
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("dua", "a", (int) MfiClientException.TYPE_MFICLIENT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68409a("[InterestRecordAppender] Unexpected fence type : %s", dus2.f14074a.f162810z);
                break;
            case 23:
                bxco bxco3 = bxco.DND_MODE;
                dwj a4 = dwj.m9630a();
                bxvd da3 = bxdf.f163018j.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bxdf bxdf6 = (bxdf) da3.f164949b;
                bxdf6.f163021b = 9;
                int i4 = bxdf6.f163020a | 1;
                bxdf6.f163020a = i4;
                bxdf6.f163020a = i4 | 512;
                bxdf6.f163028i = 64;
                m9359a(ego, bxco3, a4, new dwk((bxdf) da3.mo74062i()), drb, contextManagerClientInfo);
                break;
        }
        if (!sqw.m36041a((Collection) dus.mo9667m())) {
            long v = cdgp.m133213v();
            if (v > 0) {
                for (Integer num : dus.mo9667m()) {
                    if (num.intValue() == 1) {
                        m9359a(ego, bxco.USER_LOCATION, dwj.m9631b(), dwk.m9636a(v, 102), drb, contextManagerClientInfo);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m9359a(ego ego, bxco bxco, dwj dwj, dwk dwk, drb drb, ContextManagerClientInfo contextManagerClientInfo) {
        dvy dvy = new dvy(UUID.randomUUID().toString(), bxco, dwj, contextManagerClientInfo);
        dvy.mo9736a(dvq.m9548a());
        dvy.mo9735a(drb, null);
        if (dwk != null) {
            dvy.mo9737a(dwk);
        }
        ego.mo10098a(bxco.f162973bD, dvy.mo9734a());
        new Object[1][0] = Integer.valueOf(bxco.f162973bD);
    }
}
