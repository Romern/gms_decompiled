package p000;

import android.view.View;

/* renamed from: eyr */
final /* synthetic */ class eyr implements View.OnClickListener {

    /* renamed from: a */
    private final eyu f16039a;

    public eyr(eyu eyu) {
        this.f16039a = eyu;
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f16039a.f16063q;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
