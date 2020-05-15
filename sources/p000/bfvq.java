package p000;

import android.os.Handler;

/* renamed from: bfvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfvq extends bfvo implements bgnt {

    /* renamed from: a */
    public bgnt f115433a;

    /* renamed from: b */
    public Handler f115434b;

    /* renamed from: c */
    private final bgnu f115435c;

    public bfvq(bgnu bgnu) {
        this.f115435c = bgnu;
        mo62321a(((bgod) bgnu).f116902d);
    }

    /* renamed from: E */
    public final void mo61097E() {
        this.f115434b.post(new bfvp(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62293a() {
        bgnu bgnu = this.f115435c;
        if (!((bgod) bgnu).f116902d) {
            return;
        }
        if (this.f115428u && this.f115429v) {
            bgnu.mo63025a(this);
            return;
        }
        bgnu.mo63027c();
        this.f115433a = null;
    }
}
