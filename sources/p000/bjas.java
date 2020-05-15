package p000;

import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* renamed from: bjas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjas implements biyr {

    /* renamed from: a */
    public boolean f122439a = false;

    /* renamed from: b */
    public bjar f122440b;

    /* renamed from: c */
    public bjaq f122441c;

    /* renamed from: d */
    private final Handler f122442d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private boolean f122443e = false;

    /* renamed from: b */
    private final void m103121b(boolean z) {
        this.f122442d.post(new bjap(this, z));
    }

    /* renamed from: a */
    public final View.OnClickListener mo64961a(View.OnClickListener onClickListener) {
        return new bjam(this, onClickListener);
    }

    /* renamed from: a */
    public final void mo64962a() {
        this.f122440b.mo64943a();
    }

    /* renamed from: a */
    public final void mo64963a(boolean z) {
        if (z == this.f122439a) {
            return;
        }
        if (!z) {
            m103121b(false);
            this.f122439a = false;
            this.f122443e = true;
        } else if (!this.f122443e) {
            m103121b(true);
            this.f122439a = true;
        }
    }
}
