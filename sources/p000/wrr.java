package p000;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.gms.family.widget.DateSpinner;

/* renamed from: wrr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wrr implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ EditText f51205a;

    /* renamed from: b */
    final /* synthetic */ DateSpinner f51206b;

    public wrr(DateSpinner dateSpinner, EditText editText) {
        this.f51206b = dateSpinner;
        this.f51205a = editText;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        DateSpinner dateSpinner = this.f51206b;
        EditText editText = this.f51205a;
        String str = dateSpinner.f31479c;
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(editText.getText())) {
                String valueOf = String.valueOf(editText.getText());
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(valueOf).length());
                sb.append(str);
                sb.append(" ");
                sb.append(valueOf);
                editText.setContentDescription(sb.toString());
            } else {
                editText.setContentDescription(str);
            }
        }
        if (charSequence.length() == 4) {
            this.f51206b.mo18570a();
        }
        DateSpinner dateSpinner2 = this.f51206b;
        wim wim = dateSpinner2.f31480d;
        if (wim != null) {
            wim.mo29127a(dateSpinner2.mo18572b());
        }
    }
}
