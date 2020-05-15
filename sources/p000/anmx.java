package p000;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: anmx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anmx extends Fragment implements rjz, rka {

    /* renamed from: a */
    public anul f77169a = anuy.f77749a;

    /* renamed from: b */
    public anuy f77170b;

    /* renamed from: c */
    public boolean f77171c;

    /* renamed from: d */
    public anmw f77172d;

    /* renamed from: e */
    public boolean f77173e;

    /* renamed from: f */
    public String f77174f;

    /* renamed from: g */
    private Account f77175g;

    /* renamed from: a */
    public final void mo7244a(int i) {
        boolean z;
        if (this.f77173e) {
            this.f77170b.mo42332x();
            z = true;
        } else {
            z = false;
        }
        this.f77171c = z;
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        this.f77171c = false;
        if (this.f77173e) {
            this.f77170b.mo42305a(this, this.f77174f);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof anmw) {
            this.f77172d = (anmw) activity;
            return;
        }
        throw new IllegalStateException("DeleteMomentChimeraFragment must be hosted by an activity that implements DeleteMomentCallbacks.");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f77175g = (Account) getArguments().getParcelable("account");
        this.f77170b = anme.m64734a(this.f77169a, getActivity().getApplicationContext(), this, this, this.f77175g.name);
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f77170b.mo24648p() || this.f77171c) {
            this.f77170b.mo14032j();
        }
        this.f77170b = null;
        this.f77171c = false;
        this.f77173e = false;
        this.f77174f = null;
    }

    public final void onDetach() {
        super.onDetach();
        this.f77172d = null;
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        anmw anmw;
        this.f77171c = false;
        if (this.f77173e && (anmw = this.f77172d) != null) {
            anmw.mo41973a(this.f77174f, true);
        }
        this.f77173e = false;
    }
}
