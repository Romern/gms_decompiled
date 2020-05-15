package p000;

import android.telecom.TelecomManager;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: ayid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayid extends ayfu {

    /* renamed from: c */
    final /* synthetic */ axrs f97649c;

    /* renamed from: d */
    final /* synthetic */ ayja f97650d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayid(ayja ayja, String str, axrs axrs) {
        super(str);
        this.f97650d = ayja;
        this.f97649c = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            TelecomManager telecomManager = this.f97650d.f97734m;
            if (telecomManager != null) {
                telecomManager.acceptRingingCall();
                this.f97649c.mo53437a(new Status(0));
                return;
            }
            this.f97649c.mo53437a(new Status(10));
        } catch (Exception e) {
            Log.e("WearableService", "acceptRingingCall: exception during processing", e);
            this.f97649c.mo53437a(new Status(8));
        }
    }
}
