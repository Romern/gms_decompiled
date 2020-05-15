package p000;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: ecv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ecv extends dwm implements eev {

    /* renamed from: a */
    public final HashMap f14705a = new HashMap();

    /* renamed from: b */
    private final Context f14706b;

    public ecv(Context context) {
        this.f14706b = context;
    }

    /* renamed from: a */
    public static final void m10129a(doh doh, ecu ecu) {
        tjo tjo = new tjo(doh, 1);
        tjo.mo26589a(tka.m37117a(ecu.f14704b));
        tjo.mo26590a(ecu.f14703a.serializeToBytes());
        dwq.m9673q().mo10051a(tjo.mo26587a());
    }

    /* renamed from: a */
    public final ecu mo9974a(doh doh, boolean z) {
        ecw ecw;
        Object[] objArr = {doh, Boolean.valueOf(z)};
        sdo.m34959a(doh);
        ecu ecu = (ecu) this.f14705a.get(doh);
        if (ecu == null) {
            tjq a = dwq.m9673q().mo10053a(doh, 1);
            if (a == null || (ecu = ecu.m10126a(a)) == null) {
                ecu = null;
            } else {
                this.f14705a.put(doh, ecu);
            }
        }
        if (ecu == null) {
            bxvd da = tnj.f46291e.mo74144da();
            String valueOf = String.valueOf(UUID.randomUUID());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
            sb.append("1:");
            sb.append(valueOf);
            String sb2 = sb.toString();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            tnj tnj = (tnj) da.f164949b;
            sb2.getClass();
            tnj.f46293a |= 1;
            tnj.f46294b = sb2;
            String a2 = mo9975a();
            if (a2 == null) {
                tni tni = tni.NOT_SYNCED_MISSING_GCM_ID;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                tnj tnj2 = (tnj) da.f164949b;
                tnj2.f46296d = tni.f46290d;
                tnj2.f46293a |= 4;
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                tnj tnj3 = (tnj) da.f164949b;
                a2.getClass();
                tnj3.f46293a |= 2;
                tnj3.f46295c = a2;
                tni tni2 = tni.NOT_SYNCED_BUT_READY_TO_SYNC;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                tnj tnj4 = (tnj) da.f164949b;
                tnj4.f46296d = tni2.f46290d;
                tnj4.f46293a |= 4;
            }
            ecu ecu2 = new ecu((tnj) da.mo74062i(), dwq.m9665i().mo20505a());
            this.f14705a.put(doh, ecu2);
            m10129a(doh, ecu2);
            Object[] objArr2 = new Object[2];
            objArr2[0] = doh;
            tni a3 = tni.m37265a(ecu2.f14703a.f46296d);
            if (a3 == null) {
                a3 = tni.NOT_SYNCED_MISSING_GCM_ID;
            }
            objArr2[1] = a3;
            ecu = ecu2;
        }
        tnj tnj5 = ecu.f14703a;
        String a4 = mo9975a();
        if (a4 != null) {
            tni a5 = tni.m37265a(tnj5.f46296d);
            if (a5 == null) {
                a5 = tni.NOT_SYNCED_MISSING_GCM_ID;
            }
            if (a5 == tni.NOT_SYNCED_MISSING_GCM_ID || !TextUtils.equals(a4, tnj5.f46295c)) {
                tnj tnj6 = ecu.f14703a;
                bxvd bxvd = (bxvd) tnj6.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) tnj6);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                tnj tnj7 = (tnj) bxvd.f164949b;
                tnj tnj8 = tnj.f46291e;
                a4.getClass();
                tnj7.f46293a = 2 | tnj7.f46293a;
                tnj7.f46295c = a4;
                ecu.f14703a = (tnj) bxvd.mo74062i();
                ecu.f14704b = dwq.m9665i().mo20505a();
                ecu.mo9971a(tni.NOT_SYNCED_BUT_READY_TO_SYNC);
                m10129a(doh, ecu);
                new Object[1][0] = doh;
            }
        }
        if (z && ecu.mo9972a()) {
            new Object[1][0] = doh;
            efh z2 = dwq.m9682z();
            new Object[1][0] = doh;
            if (z2.f14823a != null) {
                ecw = new ecw(doh);
            } else {
                ecw = null;
            }
            z2.mo10070a(ecw, 0, Long.MAX_VALUE, "DeviceRegistrationSync", doh.f13690b);
        }
        return ecu;
    }

    /* renamed from: a */
    public final String mo9975a() {
        return aaks.m21407a(this.f14706b);
    }

    /* renamed from: a */
    public final void mo9535a(doh doh, tjq tjq) {
        ecu a = ecu.m10126a(tjq);
        if (a == null) {
            new Object[1][0] = Integer.valueOf(tjq.mo26591a());
            return;
        }
        this.f14705a.put(doh, a);
        new Object[1][0] = doh;
    }
}
