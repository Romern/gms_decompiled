package p000;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bjsr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjsr extends dnw {

    /* renamed from: a */
    bjsg f123248a;

    /* renamed from: b */
    public Handler f123249b;

    /* renamed from: c */
    public Context f123250c;

    /* renamed from: d */
    public int f123251d;

    /* renamed from: e */
    private boolean f123252e;

    /* renamed from: f */
    private C1187mg f123253f;

    public bjsr() {
        new C1177lx(this);
    }

    /* renamed from: b */
    private final void m104504b(int i) {
        if (!bjss.m104508a()) {
            bjsg bjsg = this.f123248a;
            Context context = this.f123250c;
            if (i == 10) {
                context.getString(C0126R.string.fingerprint_error_user_canceled);
            } else if (i != 11) {
                context.getString(C0126R.string.fingerprint_error_hw_not_present);
            } else {
                context.getString(C0126R.string.fingerprint_error_no_fingerprints);
            }
            bjsg.mo52011a(i);
        }
    }

    /* renamed from: a */
    public final void mo65504a() {
        this.f123252e = false;
        dnx dnx = (dnx) getActivity();
        if (getFragmentManager() != null) {
            getFragmentManager().beginTransaction().detach(this).commitAllowingStateLoss();
        }
        if (!bjss.m104508a()) {
            bjss.m104507a(dnx);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f123250c = getContext();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CancellationSignal cancellationSignal;
        if (!this.f123252e) {
            this.f123253f = new C1187mg();
            this.f123251d = 0;
            C1178ly a = C1178ly.m19617a(this.f123250c);
            if (!a.mo15435b()) {
                m104504b(12);
            } else if (a.mo15434a()) {
                C1187mg mgVar = this.f123253f;
                int i = Build.VERSION.SDK_INT;
                FingerprintManager b = C1178ly.m19618b(a.f26668a);
                if (b != null) {
                    if (mgVar != null) {
                        cancellationSignal = (CancellationSignal) mgVar.mo15462c();
                    } else {
                        cancellationSignal = null;
                    }
                    b.authenticate(null, cancellationSignal, 0, new C1176lw(), null);
                }
                this.f123252e = true;
            } else {
                m104504b(11);
            }
            throw null;
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65505a(int i) {
        this.f123251d = i;
        if (i == 1) {
            m104504b(10);
        }
        C1187mg mgVar = this.f123253f;
        if (mgVar != null) {
            mgVar.mo15461b();
        }
        mo65504a();
    }
}
