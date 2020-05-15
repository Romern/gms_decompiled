package p000;

import android.view.View;

/* renamed from: aea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aea extends C1287pz {

    /* renamed from: a */
    final /* synthetic */ int f307a;

    /* renamed from: b */
    final /* synthetic */ aeb f308b;

    /* renamed from: c */
    private boolean f309c = false;

    public aea(aeb aeb, int i) {
        this.f308b = aeb;
        this.f307a = i;
    }

    /* renamed from: a */
    public final void mo483a() {
        this.f309c = true;
    }

    /* renamed from: b */
    public final void mo485b() {
        this.f308b.f310a.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo484a(View view) {
        if (!this.f309c) {
            this.f308b.f310a.setVisibility(this.f307a);
        }
    }
}
