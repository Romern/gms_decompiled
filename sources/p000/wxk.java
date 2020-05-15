package p000;

import android.widget.EditText;

/* renamed from: wxk */
final /* synthetic */ class wxk implements Runnable {

    /* renamed from: a */
    private final EditText f51542a;

    public wxk(EditText editText) {
        this.f51542a = editText;
    }

    public final void run() {
        this.f51542a.requestFocus();
    }
}
