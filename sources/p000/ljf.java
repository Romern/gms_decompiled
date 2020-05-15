package p000;

import android.view.View;
import android.widget.Switch;

/* renamed from: ljf */
final /* synthetic */ class ljf implements View.OnClickListener {

    /* renamed from: a */
    private final ljh f26186a;

    /* renamed from: b */
    private final Switch f26187b;

    public ljf(ljh ljh, Switch switchR) {
        this.f26186a = ljh;
        this.f26187b = switchR;
    }

    public void onClick(View view) {
        this.f26186a.f26190d.mo15112f(this.f26187b.isChecked());
    }
}
