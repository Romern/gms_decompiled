package p000;

import android.util.Log;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInOutDoneResponse;

/* renamed from: ayhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayhc extends ayfu {

    /* renamed from: c */
    final /* synthetic */ axrs f97575c;

    /* renamed from: d */
    final /* synthetic */ ayja f97576d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayhc(ayja ayja, String str, axrs axrs) {
        super(str);
        this.f97576d = ayja;
        this.f97575c = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            boolean a = this.f97576d.f97739r.mo53560a();
            if (Log.isLoggable("WearableService", 3)) {
                StringBuilder sb = new StringBuilder(35);
                sb.append("CloudSync opt in/out is done: ");
                sb.append(a);
                Log.d("WearableService", sb.toString());
            }
            this.f97575c.mo53448a(new GetCloudSyncOptInOutDoneResponse(0, a));
        } catch (Exception e) {
            Log.e("WearableService", "getCloudSyncOptInOutDone: exception during processing", e);
            this.f97575c.mo53448a(new GetCloudSyncOptInOutDoneResponse(8, false));
        }
    }
}
