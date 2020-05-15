package p000;

import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: ayde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayde implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ConnectionConfiguration f97203a;

    /* renamed from: b */
    final /* synthetic */ aydn f97204b;

    public ayde(aydn aydn, ConnectionConfiguration connectionConfiguration) {
        this.f97204b = aydn;
        this.f97203a = connectionConfiguration;
    }

    public final void run() {
        aycm aycm = this.f97204b.f97225f;
        if (aycm != null) {
            aycm.mo53901b(this.f97203a);
        }
    }
}
