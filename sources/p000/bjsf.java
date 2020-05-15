package p000;

import android.os.Build;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bjsf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bjsf implements C1504y {

    /* renamed from: a */
    final /* synthetic */ bjsj f123220a;

    public bjsf(bjsj bjsj) {
        this.f123220a = bjsj;
    }

    /* renamed from: a */
    public final void mo2a() {
    }

    /* renamed from: a */
    public final void mo3a(C0013ak akVar) {
    }

    /* renamed from: b */
    public final void mo4b() {
        bjsr bjsr;
        dnx dnx = this.f123220a.f123223a;
        if (dnx == null || !dnx.isChangingConfigurations()) {
            int i = Build.VERSION.SDK_INT;
            bjsj bjsj = this.f123220a;
            bjsc bjsc = bjsj.f123228f;
            if (bjsc == null) {
                bjsq bjsq = bjsj.f123226d;
                if (!(bjsq == null || (bjsr = bjsj.f123227e) == null)) {
                    if (bjsq.getFragmentManager() == null) {
                        Log.e("FingerprintDialogFrag", "Failed to dismiss fingerprint dialog fragment. Fragment manager was null.");
                    } else {
                        bjsq.dismissAllowingStateLoss();
                    }
                    bjsr.mo65505a(0);
                }
            } else if (bjsc.mo65493c()) {
                bjsj bjsj2 = this.f123220a;
                if (!bjsj2.f123229g) {
                    bjsj2.f123229g = true;
                } else {
                    bjsj2.f123228f.mo65490a();
                }
            } else {
                this.f123220a.f123228f.mo65490a();
            }
            bjsk bjsk = bjsk.f123233a;
            if (bjsk != null) {
                bjsk.mo65499d();
            }
        }
    }

    /* renamed from: c */
    public final void mo5c() {
        bjsk bjsk;
        bjsj bjsj = this.f123220a;
        int i = Build.VERSION.SDK_INT;
        bjsj.f123228f = (bjsc) this.f123220a.mo65496a().findFragmentByTag("BiometricFragment");
        int i2 = Build.VERSION.SDK_INT;
        bjsj bjsj2 = this.f123220a;
        bjsc bjsc = bjsj2.f123228f;
        if (bjsc != null) {
            bjsc.mo65491a(bjsj2.f123224b, bjsj2.f123231i, bjsj2.f123225c);
        } else {
            bjsj2.f123226d = (bjsq) bjsj2.mo65496a().findFragmentByTag("FingerprintDialogFragment");
            bjsj bjsj3 = this.f123220a;
            bjsj3.f123227e = (bjsr) bjsj3.mo65496a().findFragmentByTag("FingerprintHelperFragment");
            bjsj bjsj4 = this.f123220a;
            bjsq bjsq = bjsj4.f123226d;
            if (bjsq != null) {
                bjsq.f123245c = bjsj4.f123231i;
            }
            bjsr bjsr = bjsj4.f123227e;
            if (bjsr != null) {
                bjsr.f123248a = bjsj4.f123225c;
                if (bjsq != null) {
                    bjsr.f123249b = null;
                }
            }
        }
        bjsj bjsj5 = this.f123220a;
        if (!bjsj5.f123230h && (bjsk = bjsk.f123233a) != null) {
            int i3 = bjsk.f123237e;
            if (i3 == 1) {
                bjsj5.f123225c.mo52010a();
                bjsk.mo65498c();
                bjsk.mo65499d();
            } else if (i3 == 2) {
                dnx dnx = bjsj5.f123223a;
                if (dnx != null) {
                    dnx.getString(C0126R.string.generic_error_user_canceled);
                }
                bjsj5.f123225c.mo52011a(10);
                bjsk.mo65498c();
                bjsk.mo65499d();
            }
        }
        int i4 = Build.VERSION.SDK_INT;
    }

    /* renamed from: d */
    public final void mo6d() {
    }

    /* renamed from: e */
    public final void mo7e() {
    }
}
