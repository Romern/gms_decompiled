package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.TimeUnit;

/* renamed from: ascm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ascm {

    /* renamed from: a */
    public static final int f88705a = ((int) TimeUnit.SECONDS.toMillis(121));

    /* renamed from: b */
    public final ContentResolver f88706b;

    /* renamed from: c */
    public int f88707c;

    /* renamed from: d */
    public boolean f88708d;

    /* renamed from: e */
    public asby f88709e;

    /* renamed from: f */
    private final Context f88710f;

    public ascm(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f88710f = applicationContext;
        this.f88706b = applicationContext.getContentResolver();
    }

    /* renamed from: a */
    public final void mo49044a() {
        ascu.m73796a();
        if (this.f88708d) {
            this.f88708d = false;
            int i = Settings.System.getInt(this.f88706b, "screen_off_timeout", 0);
            int i2 = this.f88707c;
            if (i2 > 0 && i == f88705a) {
                mo49045a(i2);
            }
            Thread.setDefaultUncaughtExceptionHandler(this.f88709e.f88684a);
        }
    }

    /* renamed from: a */
    public final void mo49045a(int i) {
        Settings.System.putInt(this.f88706b, "screen_off_timeout", i);
    }
}
