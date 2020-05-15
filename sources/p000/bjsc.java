package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Activity;
import java.util.concurrent.Executor;

/* renamed from: bjsc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjsc extends dnw {

    /* renamed from: a */
    public Context f123204a;

    /* renamed from: b */
    public Bundle f123205b;

    /* renamed from: c */
    Executor f123206c;

    /* renamed from: d */
    DialogInterface.OnClickListener f123207d;

    /* renamed from: e */
    bjsg f123208e;

    /* renamed from: f */
    public CharSequence f123209f;

    /* renamed from: g */
    public boolean f123210g;

    /* renamed from: h */
    public final adzt f123211h = new adzt(Looper.getMainLooper());

    /* renamed from: i */
    final BiometricPrompt.AuthenticationCallback f123212i = new bjry(this);

    /* renamed from: j */
    private boolean f123213j;

    /* renamed from: k */
    private BiometricPrompt f123214k;

    /* renamed from: l */
    private CancellationSignal f123215l;

    /* renamed from: m */
    private final Executor f123216m = new bjru(this);

    /* renamed from: n */
    private final DialogInterface.OnClickListener f123217n = new bjrz(this);

    public bjsc() {
        new bjsa(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65490a() {
        int i = Build.VERSION.SDK_INT;
        if (mo65493c() && !this.f123210g) {
            Log.w("BiometricFragment", "Ignoring fast cancel signal");
            return;
        }
        CancellationSignal cancellationSignal = this.f123215l;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        mo65492b();
    }

    /* renamed from: a */
    public final void mo65491a(Executor executor, DialogInterface.OnClickListener onClickListener, bjsg bjsg) {
        this.f123206c = executor;
        this.f123207d = onClickListener;
        this.f123208e = bjsg;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo65492b() {
        this.f123213j = false;
        dnx dnx = (dnx) getActivity();
        if (getFragmentManager() != null) {
            getFragmentManager().beginTransaction().detach(this).commitAllowingStateLoss();
        }
        bjss.m104507a(dnx);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo65493c() {
        Bundle bundle = this.f123205b;
        return bundle != null && bundle.getBoolean("allow_device_credential", false);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f123204a = activity;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        if (!this.f123213j && (bundle2 = this.f123205b) != null) {
            this.f123209f = bundle2.getCharSequence("negative_text");
            BiometricPrompt.Builder builder = new BiometricPrompt.Builder(getContext());
            builder.setTitle(this.f123205b.getCharSequence("title")).setSubtitle(this.f123205b.getCharSequence("subtitle")).setDescription(this.f123205b.getCharSequence("description"));
            boolean z = this.f123205b.getBoolean("allow_device_credential");
            if (z) {
                int i = Build.VERSION.SDK_INT;
            }
            if (!TextUtils.isEmpty(this.f123209f)) {
                builder.setNegativeButton(this.f123209f, this.f123206c, this.f123217n);
            }
            int i2 = Build.VERSION.SDK_INT;
            builder.setConfirmationRequired(this.f123205b.getBoolean("require_confirmation", true));
            builder.setDeviceCredentialAllowed(z);
            if (z) {
                this.f123210g = false;
                this.f123211h.postDelayed(new bjsb(this), 250);
            }
            this.f123214k = builder.build();
            CancellationSignal cancellationSignal = new CancellationSignal();
            this.f123215l = cancellationSignal;
            this.f123214k.authenticate(cancellationSignal, this.f123216m, this.f123212i);
        }
        this.f123213j = true;
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
