package p000;

import com.google.android.gms.fido.u2f.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.google.android.gms.fido.u2f.api.view.ViewOptions;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jzq implements xxm {

    /* renamed from: a */
    final /* synthetic */ kaf f23583a;

    /* renamed from: b */
    final /* synthetic */ kaa f23584b;

    public jzq(kaa kaa, kaf kaf) {
        this.f23584b = kaa;
        this.f23583a = kaf;
    }

    /* renamed from: a */
    public final void mo14253a() {
        kaa.f23599d.mo25409a("onDisableNfcReaderMode is called", new Object[0]);
        xhy a = xhy.m42973a(this.f23584b.getActivity().getApplicationContext());
        if (a != null) {
            a.mo29773a(this.f23584b.getActivity().getContainerActivity());
        } else {
            kaa.f23599d.mo25418e("onDisableNfcReaderMode: NfcAdapterApi19.getDefaultAdapter is null!", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo14254a(ErrorResponseData errorResponseData) {
        kaa kaa = this.f23584b;
        kaa.mo14279e(kaa.f23616C.mo30310a(errorResponseData).toString());
    }

    /* renamed from: a */
    public final void mo14255a(SignResponseData signResponseData) {
        kaa kaa = this.f23584b;
        kaa.mo14279e(kaa.f23616C.mo30310a(signResponseData).toString());
    }

    /* renamed from: a */
    public final void mo14256a(String str) {
        kaa.f23599d.mo25409a("onViewSelected is called with %s", str);
        try {
            this.f23583a.mo14326a(ViewOptions.m23647a(new JSONObject(str)));
        } catch (JSONException e) {
            kaa.f23599d.mo25417e("Invalid ViewOptions json.", e, new Object[0]);
            this.f23584b.mo14274a(ErrorCode.OTHER_ERROR);
        }
    }

    /* renamed from: a */
    public final void mo14257a(xhx xhx, int i) {
        kaa.f23599d.mo25409a("onEnableNfcReaderMode is called", new Object[0]);
        jzp jzp = new jzp(xhx);
        xhy a = xhy.m42973a(this.f23584b.getActivity().getApplicationContext());
        if (a != null) {
            a.mo29774a(this.f23584b.getActivity().getContainerActivity(), jzp, i);
        } else {
            kaa.f23599d.mo25418e("onEnableNfcReaderMode: NfcAdapterApi19.getDefaultAdapter is null!", new Object[0]);
        }
    }
}
