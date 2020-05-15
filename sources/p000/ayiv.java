package p000;

import android.util.Log;
import com.google.android.gms.wearable.internal.GetConfigsResponse;

/* renamed from: ayiv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayiv extends ayfu {

    /* renamed from: c */
    final /* synthetic */ axrs f97705c;

    /* renamed from: d */
    final /* synthetic */ ayja f97706d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayiv(ayja ayja, String str, axrs axrs) {
        super(str);
        this.f97706d = ayja;
        this.f97705c = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            this.f97705c.mo53452a(new GetConfigsResponse(0, this.f97706d.f97730i.mo53955b()));
        } catch (Exception e) {
            Log.e("WearableService", "getConfigs: exception during processing", e);
            this.f97705c.mo53452a(new GetConfigsResponse(8, null));
        }
    }
}
