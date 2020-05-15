package p000;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.setupdesign.GlifLayout;

/* renamed from: mna */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mna extends Fragment {

    /* renamed from: a */
    public static final lvn f34027a = new lvn("LockScreenFragment");

    /* renamed from: b */
    public mmz f34028b;

    /* renamed from: c */
    private boolean f34029c;

    /* renamed from: d */
    private boolean f34030d;

    /* renamed from: a */
    public static boolean m25357a(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        return keyguardManager != null && !keyguardManager.isKeyguardSecure();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 2) {
            return;
        }
        if (i2 != -1) {
            f34027a.mo25416d("User failed to verify via lockscreen", new Object[0]);
            this.f34028b.mo17233j();
            return;
        }
        f34027a.mo25412b("Successfully verified via lockscreen", new Object[0]);
        this.f34030d = true;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f34028b = (mmz) activity;
        } catch (ClassCastException e) {
            throw new RuntimeException("Containing activity must implement LockScreenFragment.Listener", e);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f34029c = (bundle == null || !bundle.containsKey("lockscreenShown")) ? false : bundle.getBoolean("lockscreenShown");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        GlifLayout glifLayout = (GlifLayout) layoutInflater.inflate((int) C0126R.C0128layout.fragment_lock_screen, viewGroup, false);
        biyo biyo = new biyo(getContext());
        biyo.f122328c = 5;
        biyo.f122329d = 2132018229;
        biyo.mo64883a(C0126R.string.sud_next_button_label);
        biyo.f122327b = new mmy(this);
        ((biyn) glifLayout.mo71342a(biyn.class)).mo52733a(biyo.mo64882a());
        return glifLayout;
    }

    public final void onDetach() {
        super.onDetach();
        this.f34028b = null;
    }

    public final void onPause() {
        f34027a.mo25412b("onPause", new Object[0]);
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        f34027a.mo25412b("onResume", new Object[0]);
        if (this.f34029c) {
            this.f34029c = false;
            this.f34028b.mo17231h();
        }
        if (this.f34030d) {
            this.f34028b.mo17231h();
            this.f34030d = false;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("lockscreenShown", this.f34029c);
    }
}
