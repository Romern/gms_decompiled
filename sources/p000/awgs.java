package p000;

import com.google.android.gms.wallet.common.p079ui.PopoverView;

/* renamed from: awgs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awgs implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f94312a;

    /* renamed from: b */
    final /* synthetic */ int f94313b;

    /* renamed from: c */
    final /* synthetic */ PopoverView f94314c;

    public awgs(PopoverView popoverView, int i, int i2) {
        this.f94314c = popoverView;
        this.f94312a = i;
        this.f94313b = i2;
    }

    public final void run() {
        this.f94314c.f110099e.scrollTo(this.f94312a, this.f94313b);
    }
}
