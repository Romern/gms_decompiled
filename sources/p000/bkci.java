package p000;

import android.os.CountDownTimer;
import com.google.android.wallet.p097ui.common.CountDownTextView;

/* renamed from: bkci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkci extends CountDownTimer {

    /* renamed from: a */
    final /* synthetic */ CountDownTextView f123995a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bkci(CountDownTextView countDownTextView, long j) {
        super(j, 1000);
        this.f123995a = countDownTextView;
    }

    public final void onFinish() {
        CountDownTextView countDownTextView = this.f123995a;
        countDownTextView.f151928a = -1;
        countDownTextView.mo71875a(0);
    }

    public final void onTick(long j) {
        this.f123995a.mo71875a(j);
    }
}
