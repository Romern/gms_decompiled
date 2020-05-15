package p000;

import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.view.ViewOptions;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jzs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jzs implements xoo {

    /* renamed from: a */
    final /* synthetic */ jyq f23586a;

    /* renamed from: b */
    final /* synthetic */ kaa f23587b;

    public jzs(kaa kaa, jyq jyq) {
        this.f23587b = kaa;
        this.f23586a = jyq;
    }

    /* renamed from: a */
    public final void mo14253a() {
        kaa.f23599d.mo25409a("onDisableNfcReaderMode is called", new Object[0]);
        xhy a = xhy.m42973a(this.f23587b.getActivity().getApplicationContext());
        if (a != null) {
            a.mo29773a(this.f23587b.getActivity().getContainerActivity());
        } else {
            kaa.f23599d.mo25418e("onDisableNfcReaderMode: NfcAdapterApi19.getDefaultAdapter is null!", new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo14262b() {
        throw new UnsupportedOperationException("hideFingerprintOption should never be called for Fido2 request.");
    }

    /* renamed from: a */
    public final void mo14259a(AuthenticatorErrorResponse authenticatorErrorResponse) {
        this.f23587b.mo14276a(authenticatorErrorResponse.mo18664a());
    }

    /* renamed from: a */
    public final void mo14260a(PublicKeyCredential publicKeyCredential) {
        AuthenticatorResponse a = publicKeyCredential.mo18710a();
        if (a instanceof AuthenticatorAssertionResponse) {
            this.f23587b.mo14276a(((AuthenticatorAssertionResponse) a).mo18664a());
        }
    }

    /* renamed from: a */
    public final void mo14261a(String str) {
        kaa.f23599d.mo25409a("onViewSelected is called with %s", str);
        try {
            ViewOptions a = ViewOptions.m23543a(new JSONObject(str));
            jyq jyq = this.f23586a;
            sek sek = jyq.f23543a;
            String valueOf = String.valueOf(a.mo18759c());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("fido2viewSelected(...) ");
            sb.append(valueOf);
            sek.mo25412b(sb.toString(), new Object[0]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "select_view");
                jSONObject.put("data", a.mo18664a());
                jyq.f23544b.mo14280f(String.format("window.setFido2SkUiEvent(%s);", jSONObject));
            } catch (JSONException e) {
                throw new IllegalStateException(e);
            }
        } catch (JSONException e2) {
            kaa.f23599d.mo25417e("Invalid ViewOptions json.", e2, new Object[0]);
            this.f23587b.mo14273a(ErrorCode.ENCODING_ERR);
        }
    }

    /* renamed from: a */
    public final void mo14257a(xhx xhx, int i) {
        kaa.f23599d.mo25409a("onEnableNfcReaderMode is called", new Object[0]);
        jzr jzr = new jzr(xhx);
        xhy a = xhy.m42973a(this.f23587b.getActivity().getApplicationContext());
        if (a != null) {
            a.mo29774a(this.f23587b.getActivity().getContainerActivity(), jzr, i);
        } else {
            kaa.f23599d.mo25418e("onEnableNfcReaderMode: NfcAdapterApi19.getDefaultAdapter is null!", new Object[0]);
        }
    }
}
