package p000;

import android.os.Message;
import android.util.Log;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: bfzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfzk extends bfze {

    /* renamed from: a */
    final /* synthetic */ bfzt f115774a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfzk(bfzt bfzt, bfyy bfyy) {
        super(bfzt, bfyy);
        this.f115774a = bfzt;
    }

    /* renamed from: a */
    private final void m98305a(boolean z) {
        bxvd bxvd = this.f115774a.f115791D;
        if (bxvd != null) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpmn bpmn = (bpmn) bxvd.f164949b;
            bpmn bpmn2 = bpmn.f138303g;
            bpmn.f138305a |= 16;
            bpmn.f138310f = z;
        }
        if (!z) {
            this.f115774a.mo62547b(mo62496a(this.f115763b.mo62469h()));
        } else {
            bfzt bfzt = this.f115774a;
            bfzt.mo62547b(bfzt.f115805j);
        }
        this.f115774a.mo62553d(8);
    }

    /* renamed from: g */
    public final String mo62478g() {
        return "HasGeofenceState";
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0108  */
    /* renamed from: k */
    public final void mo62503k() {
        bxvd bxvd;
        super.mo62503k();
        bfyq bfyq = this.f115763b.f115753k;
        if (bfyq.f115725t) {
            bfyq.f115714i = bfyq.f115713h.mo72627a(5147455389092024324L);
            bugr bugr = bfyq.f115714i;
            if (bugr != null) {
                int c = bugr.mo72647c();
                bfyq.f115722q = c;
                int i = 2;
                if (c < 65536) {
                    if (Log.isLoggable("ChreGeofenceHardware", 5)) {
                        bfxc.m98134c("ChreGeofenceHardware", String.format("CHRE is disabled because NanoApp version is too low. Expected 0x%08x and above, actual 0x%08x", Integer.valueOf((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE), Integer.valueOf(bfyq.f115722q)));
                    }
                } else if (!ceue.f183435a.mo6606a().ignoreOldChreGeofenceVersions() || bfyq.f115722q >= 262151) {
                    sns sns = new sns("CHRE Handler", 10);
                    sns.start();
                    snr snr = new snr(sns);
                    bfyq.f115713h.mo72629a(5147455389092024324L, bfyq, snr);
                    bfyq.f115713h.mo72637b((bugs) bfyq);
                    bfyq.f115714i.mo72643a(bfyq, snr);
                    bfyq.f115712g = -1;
                    bfyq.f115723r = 1;
                    buew buew = (buew) buey.f153665e.mo74144da();
                    if (!ceub.m138247b()) {
                        i = 1;
                    }
                    if (buew.f164950c) {
                        buew.mo74035c();
                        buew.f164950c = false;
                    }
                    buey buey = (buey) buew.f164949b;
                    buey.f153668b = i - 1;
                    buey.f153667a |= 1;
                    bfyq.mo62426a((buey) buew.mo74062i());
                    bxvd bxvd2 = this.f115774a.f115790C;
                    if (bxvd2 != null) {
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        bpmn bpmn = (bpmn) bxvd2.f164949b;
                        bpmn bpmn2 = bpmn.f138303g;
                        bpmn.f138305a |= 16;
                        bpmn.f138310f = true;
                        return;
                    }
                    return;
                } else {
                    buew buew2 = (buew) buey.f153665e.mo74144da();
                    if (buew2.f164950c) {
                        buew2.mo74035c();
                        buew2.f164950c = false;
                    }
                    buey buey2 = (buey) buew2.f164949b;
                    buey2.f153668b = 0;
                    buey2.f153667a |= 1;
                    bfyq.mo62426a((buey) buew2.mo74062i());
                    bfyq.f115712g = 0;
                }
                bxvd = this.f115774a.f115790C;
                if (bxvd != null) {
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bpmn bpmn3 = (bpmn) bxvd.f164949b;
                    bpmn bpmn4 = bpmn.f138303g;
                    bpmn3.f138305a |= 16;
                    bpmn3.f138310f = false;
                }
                m98305a(false);
            }
        }
        bfyq.f115712g = 0;
        bxvd = this.f115774a.f115790C;
        if (bxvd != null) {
        }
        m98305a(false);
    }

    /* renamed from: a */
    public final bpms mo62472a() {
        return bpms.HAS_GEOFENCE;
    }

    /* renamed from: a */
    public final boolean mo62484a(Message message) {
        boolean z = bfxc.f115575a;
        int i = message.what;
        if (i == 1) {
            if (!this.f115774a.f115819x.mo62522a()) {
                if (Log.isLoggable("GeofencerStateMachine", 4)) {
                    bfxc.m98132a("GeofencerStateMachine", "Network location disabled.");
                }
                bfzt bfzt = this.f115774a;
                bfzt.mo62547b(bfzt.f115797b);
            }
            return true;
        } else if (i == 4 || i == 8 || i == 16) {
            this.f115774a.mo62542a(message);
            return true;
        } else if (i != 153) {
            return mo62502b(message);
        } else {
            m98305a(((Boolean) message.obj).booleanValue());
            return true;
        }
    }
}
