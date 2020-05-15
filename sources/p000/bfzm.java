package p000;

import android.os.Message;
import android.util.Log;

/* renamed from: bfzm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfzm extends bfze {

    /* renamed from: a */
    final /* synthetic */ bfzt f115779a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfzm(bfzt bfzt, bfyy bfyy) {
        super(bfzt, bfyy);
        this.f115779a = bfzt;
    }

    /* renamed from: a */
    public final bpms mo62472a() {
        return bpms.NO_GEOFENCE;
    }

    /* renamed from: g */
    public final String mo62478g() {
        return "NoGeofenceState";
    }

    /* renamed from: k */
    public final void mo62503k() {
        super.mo62503k();
        this.f115763b.mo62466e();
    }

    /* renamed from: a */
    public final boolean mo62484a(Message message) {
        boolean z = bfxc.f115575a;
        int i = message.what;
        if (i == 1) {
            if (!this.f115779a.f115819x.mo62522a()) {
                if (Log.isLoggable("GeofencerStateMachine", 4)) {
                    bfxc.m98132a("GeofencerStateMachine", "Network location disabled.");
                }
                bfzt bfzt = this.f115779a;
                bfzt.mo62547b(bfzt.f115797b);
            }
            return true;
        } else if (i != 10) {
            if (i != 16) {
                switch (i) {
                    case 4:
                        this.f115779a.mo62542a(message);
                        bfzt bfzt2 = this.f115779a;
                        bfzt2.mo62547b(bfzt2.f115798c);
                        return true;
                    case 5:
                        mo62499a((bgae) message.obj);
                        return true;
                    case 6:
                    case 7:
                    case 8:
                        return true;
                }
            } else if (this.f115763b.mo62464c()) {
                this.f115779a.mo62542a(message);
                bfzt bfzt3 = this.f115779a;
                bfzt3.mo62547b(bfzt3.f115798c);
                return true;
            }
            return mo62502b(message);
        } else {
            this.f115763b.mo62468g();
            return true;
        }
    }
}
