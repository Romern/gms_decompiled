package p000;

import android.util.Log;
import com.google.android.gms.wearable.internal.GetCloudSyncSettingResponse;

/* renamed from: ayhf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayhf extends ayfu {

    /* renamed from: c */
    final /* synthetic */ axrs f97582c;

    /* renamed from: d */
    final /* synthetic */ ayja f97583d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayhf(ayja ayja, String str, axrs axrs) {
        super(str);
        this.f97583d = ayja;
        this.f97582c = axrs;
    }

    /* renamed from: a */
    public final void mo53991a() {
        try {
            boolean c = this.f97583d.f97739r.mo53564c();
            if (Log.isLoggable("WearableService", 3)) {
                StringBuilder sb = new StringBuilder(35);
                sb.append("CloudSync setting is enabled: ");
                sb.append(c);
                Log.d("WearableService", sb.toString());
            }
            this.f97582c.mo53450a(new GetCloudSyncSettingResponse(0, c));
        } catch (Exception e) {
            Log.e("WearableService", "getCloudSyncSetting: exception during processing", e);
            this.f97582c.mo53450a(new GetCloudSyncSettingResponse(8, false));
        }
    }
}
