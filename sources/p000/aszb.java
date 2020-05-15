package p000;

import android.view.View;
import android.widget.Button;

/* renamed from: aszb */
final /* synthetic */ class aszb implements View.OnClickListener {

    /* renamed from: a */
    private final aszc f89906a;

    /* renamed from: b */
    private final Button f89907b;

    /* renamed from: c */
    private final Button f89908c;

    public aszb(aszc aszc, Button button, Button button2) {
        this.f89906a = aszc;
        this.f89907b = button;
        this.f89908c = button2;
    }

    public void onClick(View view) {
        aszc aszc = this.f89906a;
        Button button = this.f89907b;
        Button button2 = this.f89908c;
        button.setEnabled(false);
        button2.setEnabled(false);
        aszc.mo49710j();
    }
}
