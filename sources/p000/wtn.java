package p000;

import android.content.DialogInterface;
import android.widget.EditText;

/* renamed from: wtn */
final /* synthetic */ class wtn implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final wts f51305a;

    /* renamed from: b */
    private final EditText f51306b;

    public wtn(wts wts, EditText editText) {
        this.f51305a = wts;
        this.f51306b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f51305a.renameDevice(this.f51306b.getText().toString());
    }
}
