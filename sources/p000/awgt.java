package p000;

import com.google.android.gms.wallet.common.p079ui.PopoverView;

/* renamed from: awgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awgt implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f94315a;

    /* renamed from: b */
    final /* synthetic */ PopoverView f94316b;

    public awgt(PopoverView popoverView, boolean z) {
        this.f94316b = popoverView;
        this.f94315a = z;
    }

    public final void run() {
        boolean z;
        PopoverView popoverView = this.f94316b;
        awhb awhb = popoverView.f110099e;
        int f = popoverView.mo59881f();
        if (!this.f94316b.f110108n || !this.f94315a) {
            z = false;
        } else {
            z = true;
        }
        awhb.mo71902a(f, z, false);
    }
}
