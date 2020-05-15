package p000;

import android.util.Log;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.internal.GetConfigResponse;

/* renamed from: ayhy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayhy extends ayfu {

    /* renamed from: c */
    final /* synthetic */ axrs f97640c;

    /* renamed from: d */
    final /* synthetic */ ayja f97641d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayhy(ayja ayja, String str, axrs axrs) {
        super(str);
        this.f97641d = ayja;
        this.f97640c = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            ConnectionConfiguration[] b = this.f97641d.f97730i.mo53955b();
            if (b == null || b.length <= 0) {
                this.f97640c.mo53451a(new GetConfigResponse(0, new ConnectionConfiguration(null, null, 0, 0, false)));
            } else {
                this.f97640c.mo53451a(new GetConfigResponse(0, b[0]));
            }
        } catch (Exception e) {
            Log.e("WearableService", "getConfig: exception during processing", e);
            this.f97640c.mo53451a(new GetConfigResponse(8, null));
        }
    }
}
