package p000;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* renamed from: bhpe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhpe implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ bhpf f119255a;

    public bhpe(bhpf bhpf) {
        this.f119255a = bhpf;
    }

    public void onClick(View view) {
        EditText editText = this.f119255a.f119220k.f151297a;
        if (editText != null) {
            int selectionEnd = editText.getSelectionEnd();
            if (this.f119255a.mo64128c()) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
        }
    }
}
