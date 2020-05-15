package p000;

import com.google.android.gms.tapandpay.firstparty.AccountInfo;

/* renamed from: atlk */
final /* synthetic */ class atlk implements aubw {

    /* renamed from: a */
    private final atln f90445a;

    public atlk(atln atln) {
        this.f90445a = atln;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        atln atln = this.f90445a;
        atln.f90448a = new atam(atln.getActivity(), (AccountInfo) obj);
        atam atam = atln.f90448a;
        if (atam != null) {
            if (atln.f90450c) {
                atam.mo49738a(atln.f90449b);
                atln.f90450c = false;
            }
            if (atln.f90451d) {
                atln.f90448a.mo49756b(atln.f90449b);
                atln.f90451d = false;
            }
            if (atln.f90452e) {
                atln.f90448a.mo49761c(atln.f90449b);
                atln.f90452e = false;
            }
        }
    }
}
