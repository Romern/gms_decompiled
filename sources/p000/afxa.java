package p000;

import android.content.BroadcastReceiver;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import java.util.Set;

/* renamed from: afxa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afxa {

    /* renamed from: a */
    public static final bnsn f64903a = afvx.m53604b();

    /* renamed from: b */
    public final Set f64904b;

    public afxa(Set set) {
        this.f64904b = set;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35055a(BroadcastReceiver broadcastReceiver, Intent intent) {
        if (intent == null) {
            bnsi d = f64903a.mo68390d();
            d.mo68432a("afxa", "a", 34, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Skipping push message handling due to null intent...");
            return;
        }
        BroadcastReceiver.PendingResult goAsync = broadcastReceiver.goAsync();
        bngs j = bngx.m109377j();
        for (afwn afwn : this.f64904b) {
            j.mo67668c(afwn.mo35018a(intent));
        }
        bngx a = j.mo67664a();
        bqga.m112781a(bqga.m112782b(a).mo69216a(new afwy(a), bqfb.INSTANCE), new afwz(goAsync), bqfb.INSTANCE);
    }
}
