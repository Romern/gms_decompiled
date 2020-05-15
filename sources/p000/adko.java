package p000;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;

/* renamed from: adko */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adko {

    /* renamed from: a */
    private final Context f62068a;

    private adko(Context context) {
        this.f62068a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static adko m50744a(Context context) {
        return new adko(context);
    }

    /* renamed from: a */
    public final boolean mo33605a() {
        if (aykr.m84203a()) {
            Context context = this.f62068a;
            int i = Build.VERSION.SDK_INT;
            if (adfl.f61561a == null) {
                adfl.f61561a = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.software.leanback"));
            }
            if (adfl.f61561a.booleanValue() && !cepl.f183185a.mo6606a().mo79547r()) {
                return false;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (Settings.Secure.getInt(this.f62068a.getContentResolver(), "instant_apps_enabled", 1) != 0) {
                return true;
            }
        }
        return false;
    }
}
