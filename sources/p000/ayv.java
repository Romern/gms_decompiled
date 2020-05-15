package p000;

/* renamed from: ayv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ayx f2602a;

    public ayv(ayx ayx) {
        this.f2602a = ayx;
    }

    public final void run() {
        if (this.f2602a.f2605b != null) {
            ayu ayu = this.f2602a.f2605b;
            Object obj = ayu.f2600a;
            if (obj == null) {
                this.f2602a.mo2915a(ayu.f2601b);
            } else {
                this.f2602a.mo2914a(obj);
            }
        }
    }
}
