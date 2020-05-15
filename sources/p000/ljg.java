package p000;

import android.view.View;
import android.widget.Switch;

/* renamed from: ljg */
final /* synthetic */ class ljg implements View.OnClickListener {

    /* renamed from: a */
    private final ljh f26188a;

    /* renamed from: b */
    private final Switch f26189b;

    public ljg(ljh ljh, Switch switchR) {
        this.f26188a = ljh;
        this.f26189b = switchR;
    }

    public void onClick(View view) {
        this.f26188a.f26190d.mo15105b(this.f26189b.isChecked());
    }
}
