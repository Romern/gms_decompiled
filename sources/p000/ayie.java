package p000;

import android.telecom.TelecomManager;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: ayie */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayie extends ayfu {

    /* renamed from: c */
    final /* synthetic */ axrs f97651c;

    /* renamed from: d */
    final /* synthetic */ ayja f97652d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayie(ayja ayja, String str, axrs axrs) {
        super(str);
        this.f97652d = ayja;
        this.f97651c = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            TelecomManager telecomManager = this.f97652d.f97734m;
            if (telecomManager != null) {
                telecomManager.silenceRinger();
                this.f97651c.mo53437a(new Status(0));
                return;
            }
            this.f97651c.mo53437a(new Status(10));
        } catch (Exception | NoSuchMethodError e) {
            Log.e("WearableService", "silenceRinger: exception during processing", e);
            this.f97651c.mo53437a(new Status(8));
        }
    }
}
