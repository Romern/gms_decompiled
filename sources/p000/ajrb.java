package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ajrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajrb implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C1350sh f71173a;

    /* renamed from: b */
    final /* synthetic */ EditText f71174b;

    public ajrb(C1350sh shVar, EditText editText) {
        this.f71173a = shVar;
        this.f71174b = editText;
    }

    public final void afterTextChanged(Editable editable) {
        Button a = this.f71173a.mo15913a(-1);
        if (a != null) {
            String trim = editable.toString().trim();
            boolean z = false;
            if (trim.length() > 0 && !trim.equals(this.f71174b.getTag(C0126R.C0129id.device_name))) {
                z = true;
            }
            a.setEnabled(z);
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
