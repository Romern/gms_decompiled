package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.RemoveListenerRequest;

/* renamed from: ayhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayhx extends ayfu {

    /* renamed from: c */
    final /* synthetic */ RemoveListenerRequest f97637c;

    /* renamed from: d */
    final /* synthetic */ axrs f97638d;

    /* renamed from: e */
    final /* synthetic */ ayja f97639e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayhx(ayja ayja, String str, RemoveListenerRequest removeListenerRequest, axrs axrs) {
        super(str);
        this.f97639e = ayja;
        this.f97637c = removeListenerRequest;
        this.f97638d = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            ayiz ayiz = (ayiz) this.f97639e.f97723b.remove(this.f97637c.f110962b.asBinder());
            if (ayiz != null) {
                ayiz.binderDied();
                this.f97638d.mo53437a(new Status(0));
                return;
            }
            this.f97638d.mo53437a(new Status(4002));
        } catch (Exception e) {
            Log.e("WearableService", "removeListener: exception during processing", e);
            this.f97638d.mo53437a(new Status(8));
        }
    }
}
