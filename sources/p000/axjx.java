package p000;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.walletp2p.feature.transfer.TransferMoneyChimeraActivity;

/* renamed from: axjx */
public final /* synthetic */ class axjx implements View.OnTouchListener {

    /* renamed from: a */
    private final TransferMoneyChimeraActivity f96060a;

    /* renamed from: b */
    private final boolean[] f96061b;

    public axjx(TransferMoneyChimeraActivity transferMoneyChimeraActivity, boolean[] zArr) {
        this.f96060a = transferMoneyChimeraActivity;
        this.f96061b = zArr;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        TransferMoneyChimeraActivity transferMoneyChimeraActivity = this.f96060a;
        boolean[] zArr = this.f96061b;
        if (transferMoneyChimeraActivity.isDestroyed()) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            zArr[0] = true;
            transferMoneyChimeraActivity.f110722j.postDelayed(new axkl(transferMoneyChimeraActivity, zArr), 5000);
            return true;
        } else if (motionEvent.getAction() != 1) {
            return true;
        } else {
            zArr[0] = false;
            return true;
        }
    }
}
