package p000;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: annh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class annh extends Fragment implements rjz, rka {

    /* renamed from: a */
    public anul f77187a = anuy.f77749a;

    /* renamed from: b */
    public anuy f77188b;

    /* renamed from: c */
    public boolean f77189c;

    /* renamed from: d */
    public boolean f77190d;

    /* renamed from: e */
    public anxl f77191e;

    /* renamed from: f */
    public boolean f77192f;

    /* renamed from: g */
    public ConnectionResult f77193g;

    /* renamed from: h */
    public boolean f77194h;

    /* renamed from: i */
    private Account f77195i;

    /* renamed from: j */
    private anng f77196j;

    /* renamed from: a */
    public final void mo7244a(int i) {
        boolean z;
        if (this.f77190d) {
            this.f77188b.mo42332x();
            z = true;
        } else {
            z = false;
        }
        this.f77189c = z;
    }

    /* renamed from: b */
    public final void mo41982b(ConnectionResult connectionResult) {
        anng anng;
        this.f77193g = connectionResult;
        this.f77194h = true;
        if (this.f77190d && (anng = this.f77196j) != null) {
            boolean z = !anng.mo41981a(connectionResult, this.f77191e);
            this.f77194h = z;
            if (!z) {
                this.f77190d = false;
            }
        }
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        String str;
        this.f77189c = false;
        if (this.f77190d) {
            anuy anuy = this.f77188b;
            String i = this.f77191e.mo42358i();
            String c = this.f77191e.mo42353c();
            boolean z = this.f77192f;
            if (this.f77191e.mo42354d() != null) {
                str = this.f77191e.mo42354d().packageName;
            } else {
                str = null;
            }
            anuy.mo42306a(this, i, c, z, str);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof anng) {
            this.f77196j = (anng) activity;
            return;
        }
        throw new IllegalStateException("DisconnectSourceChimeraFragment must be hosted by an activity that implements DisconnectSourceCallbacks.");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f77195i = (Account) getArguments().getParcelable("account");
        this.f77188b = anme.m64737b(this.f77187a, getActivity().getApplicationContext(), this, this, this.f77195i.name);
        this.f77194h = false;
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f77188b.mo24648p() || this.f77189c) {
            this.f77188b.mo14032j();
        }
        this.f77188b = null;
        this.f77189c = false;
        this.f77190d = false;
        this.f77191e = null;
    }

    public final void onDetach() {
        super.onDetach();
        this.f77196j = null;
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        anng anng;
        this.f77189c = false;
        this.f77193g = connectionResult;
        this.f77194h = true;
        if (this.f77190d && (anng = this.f77196j) != null) {
            boolean z = !anng.mo41981a(connectionResult, this.f77191e);
            this.f77194h = z;
            if (!z) {
                this.f77190d = false;
            }
        }
    }
}
