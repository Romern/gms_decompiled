package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: ayix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayix extends ayfu {

    /* renamed from: c */
    final /* synthetic */ String f97710c;

    /* renamed from: d */
    final /* synthetic */ axrs f97711d;

    /* renamed from: e */
    final /* synthetic */ ayja f97712e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayix(ayja ayja, String str, String str2, axrs axrs) {
        super(str);
        this.f97712e = ayja;
        this.f97710c = str2;
        this.f97711d = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            this.f97712e.f97730i.mo53953a(this.f97710c, false);
            this.f97711d.mo53437a(new Status(0));
        } catch (Exception e) {
            Log.e("WearableService", "disableConnection: exception during processing", e);
            this.f97711d.mo53437a(new Status(8));
        }
    }
}
