package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.api.Status;

/* renamed from: hbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hbp extends adce {

    /* renamed from: a */
    public static final int f19424a = C0126R.C0129id.main_dialog_container;

    /* renamed from: b */
    public static final int f19425b = C0126R.C0129id.consent_dialog_container;

    /* renamed from: c */
    public static final bnhe f19426c;

    /* renamed from: d */
    public String f19427d;

    /* renamed from: e */
    public hix f19428e;

    /* renamed from: f */
    private View f19429f;

    /* renamed from: g */
    private hdi f19430g;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b(1, "loading_page");
        h.mo67695b(2, "account_chooser_page");
        h.mo67695b(3, "consent_page");
        f19426c = h.mo67618b();
    }

    /* renamed from: a */
    public static hbp m14174a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("calling_package", str);
        hbp hbp = new hbp();
        hbp.setArguments(bundle);
        return hbp;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        this.f19430g = (hdi) adcj.m50161a(activity).mo3444a(hdi.class);
        adcj.m50161a(activity).mo3444a(aczc.class);
        this.f19430g.f19527f.mo2445a(this, new hbm(this));
        this.f19430g.f19530i.mo2445a(this, new hbn(this));
        this.f19428e = new hix(this, this.f19430g.f19524a, null);
    }

    public final void onCreate(Bundle bundle) {
        setStyle(1, C0126R.style.CredentialsDialogTheme);
        this.f19427d = getArguments().getString("calling_package");
        super.onCreate(bundle);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new hbo(this, getActivity(), getTheme());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f19429f = layoutInflater.inflate((int) C0126R.C0128layout.credentials_authorization_dialog, viewGroup, false);
        new qws(getContext(), "IDENTITY_GMSCORE", null);
        return this.f19429f;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (!getActivity().isChangingConfigurations()) {
            this.f19430g.mo12408a(new hdh(Status.f30111e, bmvz.f131120a));
        }
        super.onDismiss(dialogInterface);
    }
}
