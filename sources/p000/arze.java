package p000;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;

/* renamed from: arze */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class arze extends Fragment {

    /* renamed from: b */
    private static final sek f88508b = ascp.m73787a("Setup", "UI", "LockScreenFragment");

    /* renamed from: a */
    arzd f88509a;

    /* renamed from: c */
    private boolean f88510c;

    /* renamed from: d */
    private String f88511d;

    /* renamed from: a */
    public static boolean m73708a(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        return keyguardManager != null && !keyguardManager.isKeyguardSecure();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 5) {
            return;
        }
        if (i2 != -1) {
            f88508b.mo25416d("User skipped lock screen", new Object[0]);
            this.f88509a.mo48962i();
            return;
        }
        f88508b.mo25412b("Successfully verified via lockscreen", new Object[0]);
        this.f88509a.mo48960g();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f88509a = (arzd) activity;
        } catch (ClassCastException e) {
            throw new RuntimeException("Containing activity must implement LockScreenFragment.Listener", e);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = false;
        if (bundle != null && bundle.getBoolean("lockscreenShown")) {
            z = true;
        }
        this.f88510c = z;
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = Bundle.EMPTY;
        }
        this.f88511d = arguments.getString("lockScreenText", getString(C0126R.string.smartdevice_d2d_lockscreen_description));
    }

    public final void onPause() {
        f88508b.mo25412b("onPause", new Object[0]);
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        f88508b.mo25412b("onResume", new Object[0]);
        if (this.f88510c) {
            this.f88510c = false;
            this.f88509a.mo48960g();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("lockscreenShown", this.f88510c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48964a() {
        f88508b.mo25412b("preparing to lock device", new Object[0]);
        this.f88509a.mo48963j();
        Activity activity = getActivity();
        if (activity == null) {
            f88508b.mo25416d("activity not attached", new Object[0]);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        f88508b.mo25412b("locking screen on L+ device", new Object[0]);
        int i2 = Build.VERSION.SDK_INT;
        KeyguardManager keyguardManager = (KeyguardManager) activity.getSystemService("keyguard");
        if (keyguardManager != null) {
            Intent createConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent(null, this.f88511d);
            if (createConfirmDeviceCredentialIntent != null) {
                startActivityForResult(createConfirmDeviceCredentialIntent, 5);
                activity.overridePendingTransition(C0126R.anim.slide_next_in, C0126R.anim.slide_next_out);
                return;
            }
            f88508b.mo25418e("Received null intent from KeyguardManager.", new Object[0]);
            this.f88509a.mo48961h();
            return;
        }
        f88508b.mo25418e("Keyguard manager was null.", new Object[0]);
        this.f88509a.mo48961h();
    }
}
