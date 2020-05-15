package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.backup.settings.backupnow.WaitForKeySyncFuture$1;

/* renamed from: mui */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mui extends bqdt {

    /* renamed from: a */
    public static final lvn f34770a = new lvn("WaitForKeySyncFuture");

    /* renamed from: b */
    private final Context f34771b;

    /* renamed from: c */
    private final BroadcastReceiver f34772c = new WaitForKeySyncFuture$1(this, "backup");

    public mui(Context context) {
        sdo.m34959a(context);
        this.f34771b = context;
        f34770a.mo25412b("Waiting for key sync", new Object[0]);
        context.registerReceiver(this.f34772c, new IntentFilter("com.google.android.gms.auth.folsom.SYNC_DONE"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: bc */
    public final void mo19850bc() {
        this.f34771b.unregisterReceiver(this.f34772c);
    }
}
