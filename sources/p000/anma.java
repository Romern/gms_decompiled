package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: anma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anma implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Status f77104a;

    /* renamed from: b */
    final /* synthetic */ anmb f77105b;

    public anma(anmb anmb, Status status) {
        this.f77105b = anmb;
        this.f77104a = status;
    }

    public final void run() {
        if (this.f77104a.mo17710c()) {
            this.f77105b.f77106a.mo41940c();
        }
    }
}
