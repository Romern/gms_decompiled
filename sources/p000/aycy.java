package p000;

import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: aycy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aycy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConnectionConfiguration f97192a;

    /* renamed from: b */
    final /* synthetic */ aydn f97193b;

    public aycy(aydn aydn, ConnectionConfiguration connectionConfiguration) {
        this.f97193b = aydn;
        this.f97192a = connectionConfiguration;
    }

    public final void run() {
        this.f97193b.mo53954b(this.f97192a);
    }
}
