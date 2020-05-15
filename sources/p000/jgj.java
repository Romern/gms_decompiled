package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.common.Feature;

/* renamed from: jgj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jgj extends Fragment implements LoaderManager.LoaderCallbacks {

    /* renamed from: a */
    public boolean f22417a;

    /* renamed from: b */
    public String f22418b = "";

    /* renamed from: c */
    private Account f22419c;

    /* renamed from: d */
    private boolean f22420d;

    /* renamed from: e */
    private jgk f22421e;

    /* renamed from: a */
    public final void mo13711a() {
        jgi jgi = (jgi) getActivity();
        if (jgi != null && this.f22420d && this.f22417a) {
            jgk jgk = this.f22421e;
            jgi.mo7755a(jgk.f22422a, jgk.f22423b, this.f22418b);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f22419c = (Account) getArguments().getParcelable("account");
        this.f22420d = false;
        this.f22417a = false;
        getLoaderManager().initLoader(0, null, this);
        if (ccgq.m129635b()) {
            arez a = aqxc.m72188a(getActivity());
            roz b = rpa.m34196b();
            b.f43472a = arep.f87542a;
            b.f43473b = new Feature[]{aqwz.f87014b};
            a.mo24701a(b.mo24977a()).mo50371a(new jgh(this));
            return;
        }
        this.f22417a = true;
    }

    public final Loader onCreateLoader(int i, Bundle bundle) {
        return new jgl(getActivity(), this.f22419c);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bizb.a(android.view.Window, boolean):void
     arg types: [android.view.Window, int]
     candidates:
      bizb.a(android.view.Window, int):void
      bizb.a(android.view.Window, biyz):void
      bizb.a(android.view.Window, boolean):void */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Activity activity = getActivity();
        if (!rrp.m34306a(getArguments().getString("theme"))) {
            i = C0126R.C0128layout.auth_device_management_progress;
        } else {
            i = C0126R.C0128layout.auth_device_management_progress_glif;
        }
        rrr a = rrr.m34310a(activity, i);
        rrp.m34302a(a.mo25046a());
        View findViewById = a.mo25046a().findViewById(C0126R.C0129id.circular_progress_bar);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        } else {
            a.mo25048a(true);
        }
        a.mo25051c(false);
        a.mo25049b();
        bizb.m103020a(getActivity().getWindow(), false);
        a.mo25050b(false);
        getActivity().setTitle((int) C0126R.string.auth_gls_name_checking_info_title);
        a.mo25047a(getActivity().getTitle());
        return a.mo25046a();
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.f22420d = true;
        this.f22421e = (jgk) obj;
        mo13711a();
    }

    public final void onLoaderReset(Loader loader) {
    }
}
