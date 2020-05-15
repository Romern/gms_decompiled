package p000;

import android.widget.CompoundButton;

/* renamed from: lqb */
final /* synthetic */ class lqb implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private final lqk f26577a;

    public lqb(lqk lqk) {
        this.f26577a = lqk;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        lqk lqk = this.f26577a;
        if (lqk.f26600b != z) {
            lqk.f26600b = z;
            lqk.f26599a.accept(Boolean.valueOf(z));
        }
    }
}
