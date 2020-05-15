package p000;

import com.google.android.gms.update.ChimeraUpdateFromSdCardActivity;

/* renamed from: avjv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avjv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f93282a;

    /* renamed from: b */
    final /* synthetic */ ChimeraUpdateFromSdCardActivity f93283b;

    public avjv(ChimeraUpdateFromSdCardActivity chimeraUpdateFromSdCardActivity, long j) {
        this.f93283b = chimeraUpdateFromSdCardActivity;
        this.f93282a = j;
    }

    public final void run() {
        this.f93283b.mo59649a(this.f93282a);
    }
}
