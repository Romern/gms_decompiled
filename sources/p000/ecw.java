package p000;

import java.util.Arrays;
import java.util.concurrent.Future;

/* renamed from: ecw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ecw extends dwu implements dqm {

    /* renamed from: a */
    private final doh f14707a;

    public ecw(doh doh) {
        super("DeviceRegistrationSync", "device registration sync", new Object[0]);
        sdo.m34959a(doh);
        this.f14707a = doh;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ecv.a(doh, boolean):ecu
     arg types: [doh, int]
     candidates:
      ecv.a(doh, ecu):void
      ecv.a(doh, tjq):void
      eev.a(doh, tjq):void
      ecv.a(doh, boolean):ecu */
    /* renamed from: a */
    public final Future mo9446a() {
        if (!this.f14707a.mo9338b()) {
            sdo.m34970a(!isDone());
            new Object[1][0] = this.f14707a;
            dwt w = dwq.m9679w();
            ecu a = dwq.m9678v().mo9974a(this.f14707a, false);
            if (a.mo9972a() && !a.f14703a.f46295c.isEmpty()) {
                doh doh = this.f14707a;
                tnj tnj = a.f14703a;
                drv k = dwq.m9667k();
                dqx a2 = dqy.m9123a("NetworkManager#registerDevice");
                if (doh.mo9338b()) {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                    bnsl.mo68432a("dwt", "a", 102, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("[NetworkManager] Cannot use an anonymous account for registerDevice RPC.");
                    dwt.m9709a(this, k, a2);
                } else {
                    a2.mo9467f();
                    new dxi(w.f14313a, doh, tnj, this, k).mo9516a(a2);
                }
            }
            return this;
        }
        new Object[1][0] = this.f14707a;
        return dps.f13792a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ecw) {
            return this.f14707a.equals(((ecw) obj).f14707a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14707a, getClass().getSimpleName()});
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ecv.a(doh, boolean):ecu
     arg types: [doh, int]
     candidates:
      ecv.a(doh, ecu):void
      ecv.a(doh, tjq):void
      eev.a(doh, tjq):void
      ecv.a(doh, boolean):ecu */
    /* renamed from: a */
    public final void mo9976a(bxjb bxjb) {
        tni tni;
        ecu a = dwq.m9678v().mo9974a(this.f14707a, false);
        tni tni2 = tni.NOT_SYNCED_MISSING_GCM_ID;
        tni a2 = tni.m37265a(a.f14703a.f46296d);
        if (a2 == null) {
            a2 = tni.NOT_SYNCED_MISSING_GCM_ID;
        }
        int ordinal = a2.ordinal();
        if (ordinal == 0) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("ecw", "a", 72, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[DeviceRegistrationSync] Latest device registration is missing gcm id state but got synced.");
        } else if (ordinal == 1 || ordinal == 2) {
            new Object[1][0] = this.f14707a;
            a.mo9971a(tni.SYNCED);
            ecv.m10129a(this.f14707a, a);
        } else {
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
            bnsl2.mo68432a("ecw", "a", 85, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            tnj tnj = a.f14703a;
            if ((tnj.f46293a & 4) != 0) {
                tni = tni.m37265a(tnj.f46296d);
                if (tni == null) {
                    tni = tni.NOT_SYNCED_MISSING_GCM_ID;
                }
            } else {
                tni = null;
            }
            bnsl2.mo68420a("[DeviceRegistrationSync] onSuccess: Unknown registration state=%s", tni);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ecv.a(doh, boolean):ecu
     arg types: [doh, int]
     candidates:
      ecv.a(doh, ecu):void
      ecv.a(doh, tjq):void
      eev.a(doh, tjq):void
      ecv.a(doh, boolean):ecu */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9478a(Object obj) {
        tni tni;
        bxjb bxjb = (bxjb) obj;
        ecu a = dwq.m9678v().mo9974a(this.f14707a, false);
        tni tni2 = tni.NOT_SYNCED_MISSING_GCM_ID;
        tni a2 = tni.m37265a(a.f14703a.f46296d);
        if (a2 == null) {
            a2 = tni.NOT_SYNCED_MISSING_GCM_ID;
        }
        int ordinal = a2.ordinal();
        if (ordinal == 0) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("ecw", "a", 72, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[DeviceRegistrationSync] Latest device registration is missing gcm id state but got synced.");
        } else if (ordinal == 1 || ordinal == 2) {
            new Object[1][0] = this.f14707a;
            a.mo9971a(tni.SYNCED);
            ecv.m10129a(this.f14707a, a);
        } else {
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
            bnsl2.mo68432a("ecw", "a", 85, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            tnj tnj = a.f14703a;
            if ((tnj.f46293a & 4) != 0) {
                tni = tni.m37265a(tnj.f46296d);
                if (tni == null) {
                    tni = tni.NOT_SYNCED_MISSING_GCM_ID;
                }
            } else {
                tni = null;
            }
            bnsl2.mo68420a("[DeviceRegistrationSync] onSuccess: Unknown registration state=%s", tni);
        }
    }
}
