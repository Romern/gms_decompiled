package p000;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;

/* renamed from: ajxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajxg extends ajxf {

    /* renamed from: c */
    private final PowerManager f71504c;

    /* renamed from: d */
    private final KeyguardManager f71505d;

    public ajxg(Context context) {
        super(context);
        this.f71504c = (PowerManager) context.getSystemService("power");
        this.f71505d = (KeyguardManager) context.getSystemService("keyguard");
    }

    /* renamed from: a */
    public final boolean mo39062a() {
        if (!(this.f71504c == null || this.f71505d == null)) {
            int i = Build.VERSION.SDK_INT;
            return this.f71504c.isInteractive() && !this.f71505d.isKeyguardLocked();
        }
    }

    /* renamed from: b */
    public final IntentFilter mo39063b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        return intentFilter;
    }
}
