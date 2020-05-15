package p000;

import android.app.Activity;
import android.content.Intent;

/* renamed from: aepn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aepn extends aepe {
    public aepn() {
        super("com.google.android.gms.location.places.ui.PICK_PLACE");
        this.f63586a.putExtra("gmscore_client_jar_version", rfi.f42869b);
    }

    /* renamed from: a */
    public final Intent mo34414a(Activity activity) {
        return super.mo34414a(activity);
    }

    /* renamed from: a */
    public final void mo34439a(int i, int i2, int i3) {
        this.f63586a.putExtra("reference_marker_overlay_resource_id", i);
        this.f63586a.putExtra("reference_marker_overlay_width_meters", i2);
        this.f63586a.putExtra("reference_marker_overlay_height_meters", i3);
    }
}
