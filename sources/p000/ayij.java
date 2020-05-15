package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: ayij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayij extends ayfu {

    /* renamed from: c */
    final /* synthetic */ axrs f97665c;

    /* renamed from: d */
    final /* synthetic */ ayja f97666d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayij(ayja ayja, String str, axrs axrs) {
        super(str);
        this.f97666d = ayja;
        this.f97665c = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            ConnectionConfiguration[] b = this.f97666d.f97730i.mo53955b();
            if (b.length > 0) {
                this.f97666d.f97730i.mo53953a(b[0].f110864a, true);
                this.f97665c.mo53437a(new Status(0));
                return;
            }
            throw new Exception();
        } catch (Exception e) {
            Log.e("WearableService", "enableConnection: exception during processing", e);
            this.f97665c.mo53437a(new Status(8));
        }
    }
}
