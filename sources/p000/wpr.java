package p000;

import android.os.Bundle;
import android.widget.EditText;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: wpr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wpr implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    final /* synthetic */ boolean f51110a;

    /* renamed from: b */
    final /* synthetic */ EditText f51111b;

    /* renamed from: c */
    final /* synthetic */ wpu f51112c;

    public wpr(wpu wpu, boolean z, EditText editText) {
        this.f51112c = wpu;
        this.f51110a = z;
        this.f51111b = editText;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new wqj(this.f51112c.getActivity(), this.f51112c.f51114a, this.f51110a, this.f51111b.getText().toString());
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        String str;
        wif wif = (wif) obj;
        wpu wpu = this.f51112c;
        if (wpu.f51115b != null) {
            if (wif.f50708a) {
                wgn.m41923c("ReAuthDialogFragment", "Auth successful continue with action", new Object[0]);
                this.f51112c.dismissAllowingStateLoss();
                this.f51112c.f51115b.mo18497bt();
            } else {
                TextInputLayout textInputLayout = (TextInputLayout) wpu.f51116c.findViewById(C0126R.C0129id.fm_credential_type);
                int i = wif.f50709b;
                if (i == 0 || i != 1) {
                    if (this.f51110a) {
                        str = this.f51112c.getString(C0126R.string.common_password);
                    } else {
                        str = this.f51112c.getString(C0126R.string.fm_pin_description);
                    }
                    textInputLayout.mo71272c(this.f51112c.getResources().getString(C0126R.string.fm_reauth_error, str));
                } else if (this.f51110a) {
                    textInputLayout.mo71272c(this.f51112c.getResources().getString(C0126R.string.fm_invalid_password));
                } else {
                    textInputLayout.mo71272c(this.f51112c.getResources().getString(C0126R.string.fm_invalid_pin));
                }
            }
            this.f51112c.getActivity().getSupportLoaderManager().destroyLoader(this.f51112c.f51115b.mo18496bs());
        }
    }

    public final void onLoaderReset(Loader loader) {
    }
}
