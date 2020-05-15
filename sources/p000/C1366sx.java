package p000;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: sx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class C1366sx {

    /* renamed from: a */
    private BroadcastReceiver f27043a;

    /* renamed from: b */
    final /* synthetic */ C1372tc f27044b;

    public C1366sx(C1372tc tcVar) {
        this.f27044b = tcVar;
    }

    /* renamed from: a */
    public abstract int mo15974a();

    /* renamed from: b */
    public abstract void mo15975b();

    /* renamed from: c */
    public abstract IntentFilter mo15976c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo15978d() {
        mo15979e();
        IntentFilter c = mo15976c();
        if (c != null && c.countActions() != 0) {
            if (this.f27043a == null) {
                this.f27043a = new C1365sw(this);
            }
            this.f27044b.f27100e.registerReceiver(this.f27043a, c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo15979e() {
        BroadcastReceiver broadcastReceiver = this.f27043a;
        if (broadcastReceiver != null) {
            try {
                this.f27044b.f27100e.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
            }
            this.f27043a = null;
        }
    }
}
