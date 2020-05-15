package p000;

import com.google.android.gms.wallet.common.p079ui.PopoverView;

/* renamed from: awgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class awgy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f94320a;

    /* renamed from: b */
    final /* synthetic */ awhb f94321b;

    public awgy(awhb awhb, int i) {
        this.f94321b = awhb;
        this.f94320a = i;
    }

    public final void run() {
        if (this.f94320a > this.f94321b.f94332a.f110095a.getHeight() || !this.f94321b.f94340i) {
            awhb awhb = this.f94321b;
            awhb.f94340i = true;
            awhb.f94332a.f110095a.getLayoutParams().height = this.f94320a;
            this.f94321b.f94332a.f110095a.requestLayout();
        }
        PopoverView popoverView = this.f94321b.f94332a;
        popoverView.f110096b.setMinimumHeight(this.f94320a - popoverView.f110107m);
        awhb awhb2 = this.f94321b;
        if (!awhb2.f94333b) {
            awhb2.f94333b = true;
            awhb2.post(new awgz(awhb2, this.f94320a, true ^ awhb2.f94335d));
            return;
        }
        awhb2.post(new awha(awhb2));
    }
}
