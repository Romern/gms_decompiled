package p000;

import android.app.Activity;

/* renamed from: az */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0040az extends C1531z {

    /* renamed from: a */
    final /* synthetic */ C0042ba f2610a;

    public C0040az(C0042ba baVar) {
        this.f2610a = baVar;
    }

    public final void onActivityPostResumed(Activity activity) {
        C0043bb bbVar = this.f2610a.f2751a;
        int i = bbVar.f2822b + 1;
        bbVar.f2822b = i;
        if (i != 1) {
            return;
        }
        if (bbVar.f2823c) {
            bbVar.f2826f.mo1023a(C0005ad.ON_RESUME);
            bbVar.f2823c = false;
            return;
        }
        bbVar.f2825e.removeCallbacks(bbVar.f2827g);
    }

    public final void onActivityPostStarted(Activity activity) {
        C0043bb bbVar = this.f2610a.f2751a;
        int i = bbVar.f2821a + 1;
        bbVar.f2821a = i;
        if (i == 1 && bbVar.f2824d) {
            bbVar.f2826f.mo1023a(C0005ad.ON_START);
            bbVar.f2824d = false;
        }
    }
}
