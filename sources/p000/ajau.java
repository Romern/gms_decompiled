package p000;

import android.os.Binder;
import com.google.android.gms.nearby.messages.debug.DebugPokeChimeraService;
import com.google.android.gms.nearby.messages.service.NearbyMessagesChimeraService;
import com.google.location.nearby.messages.debug.internal.DebugPokeRequest;
import java.util.concurrent.TimeUnit;

/* renamed from: ajau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajau extends bvhd {

    /* renamed from: a */
    final /* synthetic */ DebugPokeChimeraService f70284a;

    public ajau(DebugPokeChimeraService debugPokeChimeraService) {
        this.f70284a = debugPokeChimeraService;
    }

    /* renamed from: a */
    public final void mo38428a(DebugPokeRequest debugPokeRequest, bvhc bvhc) {
        srn srn = ahfq.f67120a;
        String nameForUid = this.f70284a.getPackageManager().getNameForUid(Binder.getCallingUid());
        spn.m35872c(this.f70284a, nameForUid);
        DebugPokeChimeraService debugPokeChimeraService = this.f70284a;
        if (!cfos.m141992f() ? cfop.m141873c() || aixt.m58149a(debugPokeChimeraService, nameForUid, cfop.f185115a.mo6606a().mo82234m()) : aixt.m58148a(debugPokeChimeraService, nameForUid)) {
            try {
                this.f70284a.f80707a.await(2000, TimeUnit.MILLISECONDS);
                aiwp aiwp = (aiwp) NearbyMessagesChimeraService.m67417e().mo36473a(aiwp.class);
                aiwp.f69949b.mo72987c(new aiwo(aiwp, "debugPoke", bvhc, debugPokeRequest));
            } catch (InterruptedException e) {
                bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ajau", "a", 68, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Error waiting for NMS to initialize");
            }
        } else {
            String valueOf = String.valueOf(nameForUid);
            throw new SecurityException(valueOf.length() == 0 ? new String("DebugPokeService is not allowed for: ") : "DebugPokeService is not allowed for: ".concat(valueOf));
        }
    }
}
