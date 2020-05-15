package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: gxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gxn extends adce {

    /* renamed from: a */
    public static final bnhe f19178a;

    /* renamed from: b */
    public hix f19179b;

    /* renamed from: c */
    private hay f19180c;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b(1, "account_list");
        h.mo67695b(2, "consent");
        f19178a = h.mo67618b();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        hay hay = (hay) adcj.m50161a(getActivity()).mo3444a(hay.class);
        this.f19180c = hay;
        hay.f19388l.mo2445a(this, new gxl(this));
        this.f19179b = new hix(this, this.f19180c.f19381e.f10226c, null);
    }

    public final void onCreate(Bundle bundle) {
        setStyle(1, C0126R.style.CredentialsDialogTheme);
        super.onCreate(bundle);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new gxm(this, getActivity(), getTheme());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate((int) C0126R.C0128layout.credentials_google_sign_in_dialog, viewGroup, false);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (!getActivity().isChangingConfigurations() && this.f19180c.f19390n.mo2448b() == null) {
            this.f19180c.mo12368a(haz.m14155a());
        }
    }
}
