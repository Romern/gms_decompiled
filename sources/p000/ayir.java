package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: ayir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayir extends ayfu {

    /* renamed from: c */
    final /* synthetic */ axrs f97694c;

    /* renamed from: d */
    final /* synthetic */ byte f97695d;

    /* renamed from: e */
    final /* synthetic */ ayja f97696e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayir(ayja ayja, String str, axrs axrs, byte b) {
        super(str);
        this.f97696e = ayja;
        this.f97694c = axrs;
        this.f97695d = b;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            if (((aybi) this.f97696e.f97738q.mo6606a()) == null) {
                Log.e("WearableService", "AmsHandler is not set up");
                this.f97694c.mo53437a(new Status(8));
                return;
            }
            throw null;
        } catch (Exception e) {
            byte b = this.f97695d;
            StringBuilder sb = new StringBuilder(52);
            sb.append("sendRemoteCommand: exception during processing: ");
            sb.append((int) b);
            Log.e("WearableService", sb.toString(), e);
            this.f97694c.mo53437a(new Status(8));
        }
    }
}
