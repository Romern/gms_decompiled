package p000;

import android.view.View;

/* renamed from: eyp */
final /* synthetic */ class eyp implements View.OnClickListener {

    /* renamed from: a */
    private final eyu f16037a;

    public eyp(eyu eyu) {
        this.f16037a = eyu;
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f16037a.f16063q;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
