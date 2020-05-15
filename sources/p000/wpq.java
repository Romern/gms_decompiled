package p000;

import android.view.View;
import android.widget.EditText;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: wpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wpq implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ boolean f51108a;

    /* renamed from: b */
    final /* synthetic */ wpu f51109b;

    public wpq(wpu wpu, boolean z) {
        this.f51109b = wpu;
        this.f51108a = z;
    }

    public void onClick(View view) {
        String str;
        TextInputLayout textInputLayout = (TextInputLayout) this.f51109b.f51116c.findViewById(C0126R.C0129id.fm_credential_type);
        textInputLayout.mo71272c((CharSequence) null);
        String obj = ((EditText) this.f51109b.f51116c.findViewById(C0126R.C0129id.fm_reauth_password)).getText().toString();
        if (obj == null || obj.trim().length() == 0) {
            if (this.f51108a) {
                str = this.f51109b.getString(C0126R.string.fm_missing_password);
            } else {
                str = this.f51109b.getString(C0126R.string.fm_missing_pin);
            }
            textInputLayout.mo71272c(str);
            return;
        }
        wpu wpu = this.f51109b;
        wpu.getActivity().getSupportLoaderManager().initLoader(wpu.f51115b.mo18496bs(), null, new wpr(wpu, this.f51108a, (EditText) wpu.f51116c.findViewById(C0126R.C0129id.fm_reauth_password)));
    }
}
