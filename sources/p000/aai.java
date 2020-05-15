package p000;

import android.view.View;

/* renamed from: aai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aai implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aap f49a;

    public aai(aap aap) {
        this.f49a = aap;
    }

    public final void run() {
        View view = this.f49a.f67l;
        if (view != null && view.getWindowToken() != null) {
            this.f49a.mo101aI();
        }
    }
}
