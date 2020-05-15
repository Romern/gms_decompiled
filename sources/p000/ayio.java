package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: ayio */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayio extends ayfu {

    /* renamed from: c */
    final /* synthetic */ axrs f97685c;

    /* renamed from: d */
    final /* synthetic */ int f97686d;

    /* renamed from: e */
    final /* synthetic */ ayja f97687e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayio(ayja ayja, String str, axrs axrs, int i) {
        super(str);
        this.f97687e = ayja;
        this.f97685c = axrs;
        this.f97686d = i;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            if (((aybk) this.f97687e.f97737p.mo6606a()) == null) {
                Log.e("WearableService", "AncsHandler is not set up");
                this.f97685c.mo53437a(new Status(8));
                return;
            }
            aybk.m83747b();
            this.f97685c.mo53437a(new Status(0));
        } catch (Exception e) {
            int i = this.f97686d;
            StringBuilder sb = new StringBuilder(60);
            sb.append("sendPositiveAction: exception during processing: ");
            sb.append(i);
            Log.e("WearableService", sb.toString(), e);
            this.f97685c.mo53437a(new Status(8));
        }
    }
}
