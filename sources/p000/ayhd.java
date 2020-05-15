package p000;

import android.util.Log;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInStatusResponse;

/* renamed from: ayhd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayhd extends ayfu {

    /* renamed from: c */
    final /* synthetic */ axrs f97577c;

    /* renamed from: d */
    final /* synthetic */ ayja f97578d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayhd(ayja ayja, String str, axrs axrs) {
        super(str);
        this.f97578d = ayja;
        this.f97577c = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            axom b = this.f97578d.f97739r.mo53561b();
            if (Log.isLoggable("WearableService", 3)) {
                String valueOf = String.valueOf(b);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                sb.append("CloudSync opt in/out status: ");
                sb.append(valueOf);
                Log.d("WearableService", sb.toString());
            }
            this.f97577c.mo53449a(new GetCloudSyncOptInStatusResponse(0, b.f96221a, b.f96222b));
        } catch (Exception e) {
            Log.e("WearableService", "getCloudSyncOptInStatus: exception during processing", e);
            this.f97577c.mo53449a(new GetCloudSyncOptInStatusResponse(8, false, false));
        }
    }
}
