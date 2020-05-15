package p000;

import android.view.View;
import android.widget.Switch;

/* renamed from: lmk */
final /* synthetic */ class lmk implements View.OnClickListener {

    /* renamed from: a */
    private final lmu f26384a;

    /* renamed from: b */
    private final Switch f26385b;

    public lmk(lmu lmu, Switch switchR) {
        this.f26384a = lmu;
        this.f26385b = switchR;
    }

    public void onClick(View view) {
        lmu lmu = this.f26384a;
        boolean isChecked = this.f26385b.isChecked();
        lmu.f26405e.mo15102a(isChecked);
        if (ccjf.m130034d()) {
            lmu.mo15274a(isChecked);
        }
    }
}
