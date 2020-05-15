package p000;

import android.util.Log;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.libs.vcdiff.VcDiffDecoder;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: efe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class efe {
    /* renamed from: a */
    public static ContextData m10295a(doh doh, bxkw bxkw, tka tka) {
        bxiq bxiq;
        if (VcDiffDecoder.f79290a) {
            byte[] k = bxkw.f163807c.getKey();
            if (k != null && k.length > 0) {
                bxik bxik = bxkw.f163806b;
                if (bxik == null) {
                    bxik = bxik.f163530b;
                }
                bxco a = bxco.m122577a(bxkw.f163805a);
                if (a == null) {
                    a = bxco.UNKNOWN_CONTEXT_NAME;
                }
                if (bxik != null && bxik.f163532a.size() != 0) {
                    bxwc bxwc = bxik.f163532a;
                    int size = bxwc.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        bxiq = (bxiq) bxwc.get(i);
                        bxco a2 = bxco.m122577a(bxiq.f163556b);
                        if (a2 == null) {
                            a2 = bxco.UNKNOWN_CONTEXT_NAME;
                        }
                        i++;
                        if (a2 == a) {
                            break;
                        }
                    }
                }
                bxiq = null;
                if (bxiq == null) {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                    bnsl.mo68432a("efe", "a", 64, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bxco a3 = bxco.m122577a(bxkw.f163805a);
                    if (a3 == null) {
                        a3 = bxco.UNKNOWN_CONTEXT_NAME;
                    }
                    bnsl.mo68420a("[ContextDeltaHandler] Received invalid delta context sync token for context = %s", a3);
                    return null;
                }
                tit tit = new tit();
                bxco a4 = bxco.m122577a(bxiq.f163556b);
                if (a4 == null) {
                    a4 = bxco.UNKNOWN_CONTEXT_NAME;
                }
                int i2 = a4.f162973bD;
                long a5 = dqt.m9097a(bxiq.f163557c);
                tkb tkb = new tkb();
                tkb.mo26622a(a5, a5);
                tit.mo26580a(i2, tkb.mo26620a());
                ArrayList arrayList = dwq.m9672p().mo10037a((ContextDataFilterImpl) tit.mo26578a(), dwq.m9652a(doh, "ContextDeltaHandler")).f14776b;
                ContextData contextData = arrayList.size() > 0 ? (ContextData) arrayList.get(0) : null;
                if (contextData == null) {
                    bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                    bnsl2.mo68432a("efe", "a", 73, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bxco a6 = bxco.m122577a(bxkw.f163805a);
                    if (a6 == null) {
                        a6 = bxco.UNKNOWN_CONTEXT_NAME;
                    }
                    bnsl2.mo68420a("[ContextDeltaHandler] No existing data for context name = %s", a6);
                    return null;
                }
                byte[] nativeDecoder = VcDiffDecoder.nativeDecoder(contextData.mo18023k(), k);
                if (nativeDecoder == null) {
                    return null;
                }
                new Object[1][0] = Integer.valueOf(nativeDecoder.length);
                tip tip = new tip(contextData.mo18017f(), contextData.mo18018g(), contextData.mo18021i());
                int i3 = (bxkw.f163808d << 3) | 2;
                sdo.m34959a(nativeDecoder);
                byte[] bArr = new byte[(bxuk.m123657i(i3) + bxuk.m123646d(nativeDecoder))];
                bxuk a7 = bxuk.m123637a(bArr);
                try {
                    a7.mo73855d(i3);
                    a7.mo73867c(nativeDecoder);
                    bxuc a8 = bxuc.m123419a(bArr);
                    bxvd bxvd = tip.f46141a;
                    bxus c = bxus.m123744c();
                    GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) bxcf.f162779a.mo74142c(4);
                    bxxv a9 = bxxm.f165037a.mo74228a(GeneratedMessageLite);
                    a9.mo74220a(GeneratedMessageLite, bxud.m123454a(a8), c);
                    a9.mo74225d(GeneratedMessageLite);
                    GeneratedMessageLite.m124027b(GeneratedMessageLite);
                    bxcf bxcf = (bxcf) GeneratedMessageLite;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bxce bxce = (bxce) bxvd.f164949b;
                    bxce bxce2 = bxce.f162766k;
                    bxcf.getClass();
                    bxce.f162775h = bxcf;
                    bxce.f162768a |= 64;
                } catch (IOException e) {
                    if (!(e.getCause() instanceof bxwf)) {
                        throw new bxwf(e.getMessage());
                    }
                    throw ((bxwf) e.getCause());
                } catch (RuntimeException e2) {
                    if (e2.getCause() instanceof bxwf) {
                        throw ((bxwf) e2.getCause());
                    }
                    throw e2;
                } catch (IOException e3) {
                    Log.e("ContextData", "Could not write extension.", e3);
                }
                tip.mo26574a(tka);
                ContextData a10 = tip.mo26570a();
                a10.mo18010a(contextData.mo18015e().mo26585c(), contextData.mo18015e().f46200a.f162980e);
                return a10;
            }
            bnsl bnsl3 = (bnsl) dss.f13961a.mo68388c();
            bnsl3.mo68432a("efe", "a", 54, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bxco a11 = bxco.m122577a(bxkw.f163805a);
            if (a11 == null) {
                a11 = bxco.UNKNOWN_CONTEXT_NAME;
            }
            bnsl3.mo68420a("[ContextDeltaHandler] Received invalid encoded differential for context = %s", a11);
            return null;
        }
        bnsl bnsl4 = (bnsl) dss.f13961a.mo68387b();
        bnsl4.mo68432a("efe", "a", 47, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl4.mo68405a("[ContextDeltaHandler] VcDiff decoding library is not initialized!!!!");
        return null;
    }
}
