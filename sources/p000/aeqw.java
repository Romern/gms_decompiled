package p000;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;

/* renamed from: aeqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aeqw extends aequ {

    /* renamed from: d */
    private final adzx f63649d = new aeqv(this, "location", "LocationModeContentObserver");

    public aeqw(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo34469b() {
        this.f63645a.getContentResolver().unregisterContentObserver(this.f63649d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo34467a() {
        int i = Build.VERSION.SDK_INT;
        try {
            this.f63645a.getContentResolver().registerContentObserver(Settings.Secure.getUriFor("location_mode"), true, this.f63649d);
        } catch (SecurityException e) {
            Log.e("LocationSettings", "Google Play services lost unknown permission!", e);
        }
    }
}
