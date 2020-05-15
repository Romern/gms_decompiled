package p000;

import android.util.Log;
import com.google.android.gms.wearable.internal.GetLocalNodeResponse;
import com.google.android.gms.wearable.internal.NodeParcelable;

/* renamed from: ayhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayhq extends ayfu {

    /* renamed from: c */
    final /* synthetic */ axrs f97616c;

    /* renamed from: d */
    final /* synthetic */ ayja f97617d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayhq(ayja ayja, String str, axrs axrs) {
        super(str);
        this.f97617d = ayja;
        this.f97616c = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            axzf a = this.f97617d.mo54021a();
            this.f97616c.mo53456a(new GetLocalNodeResponse(0, new NodeParcelable(a.f96814a, a.f96815b, 0, true)));
        } catch (Exception e) {
            Log.e("WearableService", "getLocalNode: exception during processing", e);
            this.f97616c.mo53456a(new GetLocalNodeResponse(8, null));
        }
    }
}
