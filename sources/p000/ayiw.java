package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: ayiw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayiw extends ayfu {

    /* renamed from: c */
    final /* synthetic */ String f97707c;

    /* renamed from: d */
    final /* synthetic */ axrs f97708d;

    /* renamed from: e */
    final /* synthetic */ ayja f97709e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayiw(ayja ayja, String str, String str2, axrs axrs) {
        super(str);
        this.f97709e = ayja;
        this.f97707c = str2;
        this.f97708d = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            this.f97709e.f97730i.mo53953a(this.f97707c, true);
            this.f97708d.mo53437a(new Status(0));
        } catch (Exception e) {
            Log.e("WearableService", "enableConnection: exception during processing", e);
            this.f97708d.mo53437a(new Status(8));
        }
    }
}
