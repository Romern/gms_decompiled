package p000;

import android.util.Log;
import com.google.android.gms.wearable.internal.GetCapabilityResponse;

/* renamed from: ayhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayhs extends ayfu {

    /* renamed from: c */
    final /* synthetic */ String f97620c;

    /* renamed from: d */
    final /* synthetic */ int f97621d;

    /* renamed from: e */
    final /* synthetic */ axrs f97622e;

    /* renamed from: f */
    final /* synthetic */ ayja f97623f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayhs(ayja ayja, String str, String str2, int i, axrs axrs) {
        super(str);
        this.f97623f = ayja;
        this.f97620c = str2;
        this.f97621d = i;
        this.f97622e = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            ayja ayja = this.f97623f;
            this.f97622e.mo53445a(new GetCapabilityResponse(0, ayfy.m83946a(this.f97620c, ayja.f97729h.mo53606b(ayja.f97726e, this.f97620c, this.f97621d))));
        } catch (Exception e) {
            Log.e("WearableService", "getConnectedCapability: exception during processing", e);
            this.f97622e.mo53445a(new GetCapabilityResponse(8, null));
        }
    }
}
