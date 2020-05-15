package p000;

import android.os.Message;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: bfzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfzh extends bfze {

    /* renamed from: a */
    final /* synthetic */ bfzt f115768a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfzh(bfzt bfzt, bfyy bfyy) {
        super(bfzt, bfyy);
        this.f115768a = bfzt;
    }

    /* renamed from: a */
    public final bpms mo62472a() {
        return bpms.DISABLED;
    }

    /* renamed from: g */
    public final String mo62478g() {
        return "DisabledState";
    }

    /* renamed from: k */
    public final void mo62503k() {
        super.mo62503k();
        bfyy bfyy = this.f115763b;
        bfyy.f115747e.mo62519a();
        bfyy.f115746d.mo62720a();
        bfxa.f115569a.mo62410a(-1293285128, -1);
        if (!cexq.f183497a.mo6606a().preserveGeofencesWhenNetworkLocationTurnsOff()) {
            bfwg bfwg = bfyy.f115748f;
            bfwg.mo62362a(1000);
            bfwg.f115499e.mo25986a();
            try {
                bfwg.mo62364b();
            } catch (IOException e) {
                if (bfwg.f115496b != null) {
                    bfwg.f115496b.mo25064a(new ArrayList());
                }
            }
        } else {
            bfyy.f115748f.mo62361a();
        }
    }

    /* renamed from: a */
    public final boolean mo62484a(Message message) {
        boolean z = bfxc.f115575a;
        int i = message.what;
        if (i == 1) {
            if (this.f115768a.f115819x.mo62522a()) {
                if (Log.isLoggable("GeofencerStateMachine", 4)) {
                    bfxc.m98132a("GeofencerStateMachine", "Network location enabled.");
                }
                if (this.f115763b.mo62464c()) {
                    bfzt bfzt = this.f115768a;
                    bfzt.mo62547b(bfzt.f115798c);
                } else {
                    bfzt bfzt2 = this.f115768a;
                    bfzt2.mo62547b(bfzt2.f115796a);
                }
            }
            return true;
        } else if (i == 4) {
            if (Log.isLoggable("GeofencerStateMachine", 5)) {
                bfxc.m98134c("GeofencerStateMachine", "Ignoring addGeofence because network location is disabled.");
            }
            ((bfyl) message.obj).mo62449a((Object) 1000);
            return true;
        } else if (i != 5) {
            return mo62502b(message);
        } else {
            mo62499a((bgae) message.obj);
            return true;
        }
    }
}
