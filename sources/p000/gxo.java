package p000;

import android.graphics.Typeface;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import java.util.List;

/* renamed from: gxo */
final /* synthetic */ class gxo implements C0038ax {

    /* renamed from: a */
    private final gxt f19181a;

    public gxo(gxt gxt) {
        this.f19181a = gxt;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        gxt gxt = this.f19181a;
        InternalSignInCredentialWrapper internalSignInCredentialWrapper = (InternalSignInCredentialWrapper) ((List) obj).get(0);
        if (!TextUtils.isEmpty(internalSignInCredentialWrapper.f10233g.f10253f)) {
            gxt.f19188c.setText(internalSignInCredentialWrapper.f10233g.f10248a);
            gxt.f19189d.setText(gxt.getString(C0126R.string.credentials_assisted_hidden_password));
            gxt.f19189d.setTypeface(Typeface.MONOSPACE);
        } else {
            gxt.f19188c.setText(internalSignInCredentialWrapper.f10233g.f10249b);
            gxt.f19189d.setText(internalSignInCredentialWrapper.f10232f.name);
            gxt.f19189d.setTypeface(Typeface.SANS_SERIF);
        }
        gxt.f19193h = hek.m14269a(gxt.getContext(), internalSignInCredentialWrapper, gxt.f19191f.f19325n);
        gxt.f19190e.mo60577a(gxt.f19193h);
        gxt.f19187b.setText((int) C0126R.string.credentials_assisted_confirmation_header);
    }
}
