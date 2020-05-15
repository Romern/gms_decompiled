package p000;

import android.view.View;

/* renamed from: eyq */
final /* synthetic */ class eyq implements View.OnClickListener {

    /* renamed from: a */
    private final eyu f16038a;

    public eyq(eyu eyu) {
        this.f16038a = eyu;
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f16038a.f16063q;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
