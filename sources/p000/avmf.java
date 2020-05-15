package p000;

import android.content.Intent;
import com.google.android.gms.update.control.ActiveStateTrackingBroadcastReceiver;

/* renamed from: avmf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avmf extends soa {

    /* renamed from: a */
    final /* synthetic */ Intent f93385a;

    /* renamed from: b */
    final /* synthetic */ ActiveStateTrackingBroadcastReceiver f93386b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public avmf(ActiveStateTrackingBroadcastReceiver activeStateTrackingBroadcastReceiver, Intent intent) {
        super(9);
        this.f93386b = activeStateTrackingBroadcastReceiver;
        this.f93385a = intent;
    }

    public final void run() {
        synchronized (this.f93386b.f109489a) {
            ActiveStateTrackingBroadcastReceiver activeStateTrackingBroadcastReceiver = this.f93386b;
            if (activeStateTrackingBroadcastReceiver.f109490b) {
                activeStateTrackingBroadcastReceiver.mo59675a(this.f93385a);
            }
        }
    }
}
