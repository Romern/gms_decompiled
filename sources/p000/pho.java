package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* renamed from: pho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pho implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ phq f39132a;

    /* renamed from: b */
    private final int f39133b;

    public pho(phq phq, int i) {
        this.f39132a = phq;
        this.f39133b = i;
    }

    public final void afterTextChanged(Editable editable) {
        int i;
        if (editable.length() == 1) {
            int i2 = this.f39133b;
            EditText[] editTextArr = this.f39132a.f39137c;
            int length = editTextArr.length;
            if (i2 < 3) {
                editTextArr[i2 + 1].requestFocus();
                phq phq = this.f39132a;
                phq.f39136b.setEnabled(phj.m30330a(phq.mo23093a()));
            }
        }
        if (editable.length() == 0 && (i = this.f39133b) > 0) {
            this.f39132a.f39137c[i - 1].requestFocus();
        }
        phq phq2 = this.f39132a;
        phq2.f39136b.setEnabled(phj.m30330a(phq2.mo23093a()));
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
