package p000;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: xvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xvt extends FingerprintManager.AuthenticationCallback {

    /* renamed from: g */
    public static final sek f53242g = new sek(new String[]{"FingerprintUiHelper"}, (short[]) null);

    /* renamed from: a */
    final Runnable f53243a = new xvp(this);

    /* renamed from: b */
    public final Context f53244b;

    /* renamed from: c */
    public final ImageView f53245c;

    /* renamed from: d */
    public final TextView f53246d;

    /* renamed from: e */
    public final xvs f53247e;

    /* renamed from: f */
    public CancellationSignal f53248f;

    /* renamed from: h */
    private final Button f53249h;

    /* renamed from: i */
    private final Button f53250i;

    /* renamed from: j */
    private final boolean f53251j;

    public xvt(Context context, ImageView imageView, TextView textView, Button button, Button button2, boolean z, xvs xvs) {
        this.f53244b = context;
        this.f53245c = imageView;
        this.f53246d = textView;
        this.f53249h = button;
        this.f53250i = button2;
        this.f53251j = z;
        this.f53247e = xvs;
    }

    /* renamed from: a */
    private final void m43488a(CharSequence charSequence) {
        this.f53245c.setImageResource(C0126R.C0127drawable.quantum_ic_error_outline_red_48);
        this.f53246d.setText(charSequence);
        TextView textView = this.f53246d;
        textView.setTextColor(textView.getResources().getColor(C0126R.color.warning_color, null));
        if (this.f53251j) {
            this.f53246d.requestFocus();
            this.f53246d.sendAccessibilityEvent(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
            return;
        }
        this.f53246d.removeCallbacks(this.f53243a);
        this.f53246d.postDelayed(this.f53243a, 1600);
    }

    /* renamed from: d */
    private final FingerprintManager m43489d() {
        if (this.f53244b.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) this.f53244b.getSystemService("fingerprint");
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo30166b() {
        FingerprintManager d = m43489d();
        return d != null && d.hasEnrolledFingerprints();
    }

    /* renamed from: c */
    public final void mo30167c() {
        CancellationSignal cancellationSignal = this.f53248f;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
            this.f53248f = null;
        }
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        if (this.f53248f != null) {
            m43488a(charSequence);
            this.f53245c.postDelayed(new xvq(this), 1600);
        }
    }

    public final void onAuthenticationFailed() {
        m43488a(this.f53245c.getResources().getString(C0126R.string.fido_fingerprint_not_recognized));
    }

    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        m43488a(charSequence);
    }

    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        this.f53246d.removeCallbacks(this.f53243a);
        this.f53245c.setImageResource(C0126R.C0127drawable.fido_ic_fingerprint_success);
        TextView textView = this.f53246d;
        textView.setTextColor(textView.getResources().getColor(C0126R.color.success_color, null));
        TextView textView2 = this.f53246d;
        textView2.setText(textView2.getResources().getString(C0126R.string.fingerprint_success));
        if (this.f53251j) {
            this.f53246d.requestFocus();
            this.f53246d.sendAccessibilityEvent(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
        }
        this.f53249h.setClickable(false);
        this.f53250i.setClickable(false);
        this.f53245c.postDelayed(new xvr(this), 1300);
    }

    /* renamed from: a */
    public final boolean mo30165a() {
        FingerprintManager d = m43489d();
        return d != null && d.isHardwareDetected();
    }
}
