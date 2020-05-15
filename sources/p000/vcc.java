package p000;

import android.content.SyncResult;

/* renamed from: vcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vcc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ vcd f49007a;

    /* renamed from: b */
    final /* synthetic */ SyncResult f49008b;

    public vcc(vcd vcd, SyncResult syncResult) {
        this.f49007a = vcd;
        this.f49008b = syncResult;
    }

    public final void run() {
        this.f49007a.mo26997a(this.f49008b);
    }
}
