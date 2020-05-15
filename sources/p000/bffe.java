package p000;

import android.content.Context;
import android.content.IntentFilter;

/* renamed from: bffe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bffe extends bfgs {

    /* renamed from: a */
    protected final bffd f113630a = new bffd(this);

    /* renamed from: b */
    protected final Context f113631b;

    public bffe(Context context, bfev bfev, bfew bfew, bhdb bhdb) {
        super(bfev, bfew, bhdb);
        this.f113631b = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61527a() {
        bffd bffd = this.f113630a;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        bffe bffe = bffd.f113629a;
        bffe.f113631b.registerReceiver(bffd, intentFilter, null, bffe.f113805h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo61529b() {
        bffd bffd = this.f113630a;
        bffd.f113629a.f113631b.unregisterReceiver(bffd);
    }

    /* renamed from: a */
    public final void mo61574a(int i, long j) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("adding newDeviceState: ");
        sb.append(i);
        sb.toString();
        this.f113805h.f113606a.mo61588a(i, j);
    }
}
