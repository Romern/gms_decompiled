package p000;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.api.Status;

/* renamed from: hfv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hfv extends adce {

    /* renamed from: a */
    public static final bnhe f19686a;

    /* renamed from: b */
    public String f19687b;

    /* renamed from: c */
    private View f19688c;

    /* renamed from: d */
    private hgl f19689d;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b(1, "account_chooser_page");
        h.mo67695b(2, "loading_page");
        f19686a = h.mo67618b();
    }

    /* renamed from: a */
    public static hfv m14312a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("calling_package", str);
        hfv hfv = new hfv();
        hfv.setArguments(bundle);
        return hfv;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        hgl hgl = (hgl) adcj.m50161a(getActivity()).mo3444a(hgl.class);
        this.f19689d = hgl;
        hgl.f19719a.mo2445a(this, new hfu(this));
    }

    public final void onCreate(Bundle bundle) {
        setStyle(1, C0126R.style.CredentialsDialogTheme);
        this.f19687b = getArguments().getString("calling_package");
        super.onCreate(bundle);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f19688c = layoutInflater.inflate((int) C0126R.C0128layout.credentials_gis_token_saving_dialog, viewGroup, false);
        new qws(getContext(), "IDENTITY_GMSCORE", null);
        return this.f19688c;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (!getActivity().isChangingConfigurations()) {
            this.f19689d.mo12457a(new hgk(Status.f30111e, bmvz.f131120a));
        }
        super.onDismiss(dialogInterface);
    }
}
