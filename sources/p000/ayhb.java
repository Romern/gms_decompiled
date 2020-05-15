package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: ayhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayhb extends ayfu {

    /* renamed from: c */
    final /* synthetic */ boolean f97572c;

    /* renamed from: d */
    final /* synthetic */ axrs f97573d;

    /* renamed from: e */
    final /* synthetic */ ayja f97574e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayhb(ayja ayja, String str, boolean z, axrs axrs) {
        super(str);
        this.f97574e = ayja;
        this.f97572c = z;
        this.f97573d = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            this.f97574e.f97739r.mo53559a(this.f97572c);
            if (Log.isLoggable("WearableService", 3)) {
                boolean z = this.f97572c;
                StringBuilder sb = new StringBuilder(23);
                sb.append("opt in CloudSync: ");
                sb.append(z);
                Log.d("WearableService", sb.toString());
            }
            this.f97573d.mo53437a(new Status(0));
        } catch (Exception e) {
            Log.e("WearableService", "optInCloudSync: exception during processing", e);
            this.f97573d.mo53437a(new Status(8));
        }
    }
}
