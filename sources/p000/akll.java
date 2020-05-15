package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* renamed from: akll */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akll extends adzx {

    /* renamed from: a */
    private static akll f72212a;

    /* renamed from: b */
    private final Context f72213b;

    private akll(Context context) {
        super("netrec", "SystemWifiAssistantToggleObserver", null);
        this.f72213b = context;
    }

    /* renamed from: a */
    public static synchronized void m59971a(Context context) {
        synchronized (akll.class) {
            int i = spn.f44932a;
            if (f72212a == null) {
                Context applicationContext = context.getApplicationContext();
                f72212a = new akll(applicationContext);
                ContentResolver contentResolver = applicationContext.getContentResolver();
                int i2 = Build.VERSION.SDK_INT;
                contentResolver.registerContentObserver(Settings.Global.getUriFor("use_open_wifi_package"), false, f72212a);
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m59972b(Context context) {
        synchronized (akll.class) {
            int i = spn.f44932a;
            if (f72212a != null) {
                context.getApplicationContext().getContentResolver().unregisterContentObserver(f72212a);
                f72212a = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo13611a(boolean z, Uri uri) {
        aklk.m59959a(this.f72213b);
    }
}
