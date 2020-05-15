package p000;

import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import com.google.android.gms.cast.activity.CastNearbyPinChimeraActivity;

/* renamed from: pgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pgw extends phs {
    public pgw(CastNearbyPinChimeraActivity castNearbyPinChimeraActivity) {
        super(castNearbyPinChimeraActivity);
    }

    /* renamed from: a */
    public final void mo23064a(int i, int i2, Intent intent) {
        if (i == 2) {
            Intent intent2 = new Intent();
            intent2.putExtra("com.google.android.gms.media.USER_CONSENT_REQUEST_RESULT", i2);
            intent2.setAction("com.google.android.gms.cast.media.PROJECT");
            if (i2 == -1) {
                intent2.putExtra("extra_projection_intent", intent);
            }
            this.f39139m.sendBroadcast(intent2);
        }
        this.f39139m.finish();
    }

    /* renamed from: a */
    public final void mo23065a(Bundle bundle) {
        this.f39139m.startActivityForResult(((MediaProjectionManager) this.f39139m.getSystemService("media_projection")).createScreenCaptureIntent(), 2);
    }
}
