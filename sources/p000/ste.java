package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import com.google.android.gms.common.util.ScreenEventMonitor$1;

/* renamed from: ste */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ste {

    /* renamed from: a */
    private final Context f45121a;

    /* renamed from: b */
    private final Handler f45122b;

    /* renamed from: c */
    private final PowerManager f45123c;

    /* renamed from: d */
    private std f45124d;

    /* renamed from: e */
    private BroadcastReceiver f45125e;

    public ste(Context context, Handler handler) {
        this.f45121a = context.getApplicationContext();
        this.f45122b = handler;
        this.f45123c = (PowerManager) context.getSystemService("power");
    }

    /* renamed from: a */
    public final synchronized void mo26067a() {
        if (this.f45124d != null) {
            this.f45124d = null;
            this.f45121a.unregisterReceiver(this.f45125e);
            this.f45125e = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo26068a(Intent intent) {
        std std;
        if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            std std2 = this.f45124d;
            if (std2 != null) {
                std2.mo26065cp();
            }
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()) && (std = this.f45124d) != null) {
            std.mo26066cq();
        }
    }

    /* renamed from: b */
    public final boolean mo26070b() {
        int i = Build.VERSION.SDK_INT;
        return this.f45123c.isInteractive();
    }

    /* renamed from: a */
    public final synchronized void mo26069a(std std) {
        boolean z;
        sdo.m34959a(std);
        if (this.f45124d == null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        this.f45124d = std;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        ScreenEventMonitor$1 screenEventMonitor$1 = new ScreenEventMonitor$1(this, "common-base");
        this.f45125e = screenEventMonitor$1;
        this.f45121a.registerReceiver(screenEventMonitor$1, intentFilter, null, this.f45122b);
    }
}
