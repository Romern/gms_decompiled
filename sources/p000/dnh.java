package p000;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* renamed from: dnh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dnh extends dnl {

    /* renamed from: a */
    private EditText f13622a;

    /* renamed from: c */
    private CharSequence f13623c;

    /* renamed from: c */
    private final EditTextPreference m8873c() {
        return (EditTextPreference) mo9309b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9304a(View view) {
        super.mo9304a(view);
        EditText editText = (EditText) view.findViewById(16908291);
        this.f13622a = editText;
        if (editText != null) {
            editText.setText(this.f13623c);
            return;
        }
        throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo9306a() {
        return true;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f13623c = m8873c().f1561g;
        } else {
            this.f13623c = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f13623c);
    }

    /* renamed from: a */
    public final void mo9305a(boolean z) {
        if (z) {
            String obj = this.f13622a.getText().toString();
            if (m8873c().mo1988b((Object) obj)) {
                m8873c().mo1962a(obj);
            }
        }
    }
}
