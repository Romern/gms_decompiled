package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import com.google.android.location.util.LowPowerModeHelper$1;

/* renamed from: bhca */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhca {

    /* renamed from: a */
    public boolean f118279a = false;

    /* renamed from: b */
    private final Context f118280b;

    /* renamed from: c */
    private final PowerManager f118281c;

    /* renamed from: d */
    private final bhbz f118282d;

    /* renamed from: e */
    private final Handler f118283e;

    /* renamed from: f */
    private final IntentFilter f118284f;

    /* renamed from: g */
    private final BroadcastReceiver f118285g = new LowPowerModeHelper$1(this, "location");

    /* renamed from: h */
    private boolean f118286h = false;

    /* renamed from: i */
    private boolean f118287i = false;

    /* renamed from: j */
    private boolean f118288j = false;

    public bhca(Context context, bhbz bhbz, Looper looper) {
        this.f118280b = context;
        this.f118282d = bhbz;
        this.f118281c = (PowerManager) context.getSystemService("power");
        this.f118283e = new adzt(looper);
        IntentFilter intentFilter = new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED");
        this.f118284f = intentFilter;
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.f118284f.addAction("android.intent.action.SCREEN_ON");
    }

    /* renamed from: a */
    public final void mo63543a() {
        int i = Build.VERSION.SDK_INT;
        if (!this.f118286h) {
            this.f118280b.registerReceiver(this.f118285g, this.f118284f, null, this.f118283e);
            this.f118286h = true;
        }
        this.f118287i = this.f118281c.isScreenOn();
        this.f118279a = mo63547c();
        mo63546b(true);
    }

    /* renamed from: b */
    public final void mo63545b() {
        int i = Build.VERSION.SDK_INT;
        if (this.f118286h) {
            this.f118280b.unregisterReceiver(this.f118285g);
            this.f118286h = false;
        }
    }

    /* renamed from: c */
    public final boolean mo63547c() {
        int i = Build.VERSION.SDK_INT;
        return this.f118281c.isPowerSaveMode();
    }

    /* renamed from: b */
    public final void mo63546b(boolean z) {
        boolean z2 = false;
        if (!this.f118287i && this.f118279a) {
            z2 = true;
        }
        if (z2 != this.f118288j || z) {
            this.f118288j = z2;
            this.f118282d.mo62189b(z2);
        }
    }

    /* renamed from: a */
    public final void mo63544a(boolean z) {
        if (this.f118287i != z) {
            this.f118287i = z;
            mo63546b(false);
        }
    }
}
