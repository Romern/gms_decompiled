package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: ayis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayis extends ayfu {

    /* renamed from: c */
    final /* synthetic */ axrs f97697c;

    /* renamed from: d */
    final /* synthetic */ ayja f97698d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayis(ayja ayja, String str, axrs axrs) {
        super(str);
        this.f97698d = ayja;
        this.f97697c = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            ConnectionConfiguration[] b = this.f97698d.f97730i.mo53955b();
            if (b.length > 0) {
                this.f97698d.f97730i.mo53953a(b[0].f110864a, false);
                this.f97697c.mo53437a(new Status(0));
                return;
            }
            throw new Exception();
        } catch (Exception e) {
            Log.e("WearableService", "disableConnection: exception during processing", e);
            this.f97697c.mo53437a(new Status(8));
        }
    }
}
