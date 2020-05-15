package p000;

import android.view.View;
import android.widget.CheckBox;

/* renamed from: bjrj */
final /* synthetic */ class bjrj implements View.OnClickListener {

    /* renamed from: a */
    private final bjrk f123179a;

    public bjrj(bjrk bjrk) {
        this.f123179a = bjrk;
    }

    public void onClick(View view) {
        CheckBox checkBox = this.f123179a.f123182p;
        checkBox.setChecked(!checkBox.isChecked());
    }
}
