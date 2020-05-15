package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: ayhe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayhe extends ayfu {

    /* renamed from: c */
    final /* synthetic */ boolean f97579c;

    /* renamed from: d */
    final /* synthetic */ axrs f97580d;

    /* renamed from: e */
    final /* synthetic */ ayja f97581e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayhe(ayja ayja, String str, boolean z, axrs axrs) {
        super(str);
        this.f97581e = ayja;
        this.f97579c = z;
        this.f97580d = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            this.f97581e.f97739r.mo53563c(this.f97579c);
            this.f97580d.mo53437a(new Status(0));
        } catch (Exception e) {
            Log.e("WearableService", "setCloudSyncSetting: exception during processing", e);
            this.f97580d.mo53437a(new Status(8));
        }
    }
}
