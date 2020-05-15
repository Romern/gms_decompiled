package p000;

import android.view.View;
import android.widget.Button;

/* renamed from: asza */
final /* synthetic */ class asza implements View.OnClickListener {

    /* renamed from: a */
    private final aszc f89903a;

    /* renamed from: b */
    private final Button f89904b;

    /* renamed from: c */
    private final Button f89905c;

    public asza(aszc aszc, Button button, Button button2) {
        this.f89903a = aszc;
        this.f89904b = button;
        this.f89905c = button2;
    }

    public void onClick(View view) {
        aszc aszc = this.f89903a;
        Button button = this.f89904b;
        Button button2 = this.f89905c;
        button.setEnabled(false);
        button2.setEnabled(false);
        aszc.mo49709i();
    }
}
