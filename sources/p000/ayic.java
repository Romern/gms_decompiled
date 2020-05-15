package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: ayic */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayic extends ayfu {

    /* renamed from: c */
    final /* synthetic */ axrs f97647c;

    /* renamed from: d */
    final /* synthetic */ ayja f97648d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayic(ayja ayja, String str, axrs axrs) {
        super(str);
        this.f97648d = ayja;
        this.f97647c = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            if (!this.f97648d.f97735n.mo53856a(true)) {
                this.f97647c.mo53437a(new Status(4008));
            } else {
                this.f97647c.mo53437a(new Status(0));
            }
        } catch (Exception e) {
            Log.e("WearableService", "syncWifiCredentials: exception during processing", e);
            this.f97647c.mo53437a(new Status(8));
        }
    }
}
