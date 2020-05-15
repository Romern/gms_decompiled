package p000;

import android.view.View;
import android.widget.CheckBox;

/* renamed from: atvj */
final /* synthetic */ class atvj implements View.OnClickListener {

    /* renamed from: a */
    private final atvl f91010a;

    /* renamed from: b */
    private final CheckBox f91011b;

    /* renamed from: c */
    private final CheckBox f91012c;

    public atvj(atvl atvl, CheckBox checkBox, CheckBox checkBox2) {
        this.f91010a = atvl;
        this.f91011b = checkBox;
        this.f91012c = checkBox2;
    }

    public void onClick(View view) {
        this.f91010a.mo50232a(this.f91011b.isChecked(), this.f91012c.isChecked());
    }
}
