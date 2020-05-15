package p000;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: cox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cox extends Fragment {

    /* renamed from: a */
    public final C0087com f11747a;

    /* renamed from: b */
    public final cpa f11748b = new cow(this);

    /* renamed from: c */
    public ccd f11749c;

    /* renamed from: d */
    private final Set f11750d = new HashSet();

    /* renamed from: e */
    private cox f11751e;

    public cox() {
        C0087com com2 = new C0087com();
        this.f11747a = com2;
    }

    /* renamed from: a */
    private final void m7234a() {
        cox cox = this.f11751e;
        if (cox != null) {
            cox.f11750d.remove(this);
            this.f11751e = null;
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m7234a();
            cox a = cbo.m3902a(activity).f6407e.mo8075a(activity.getFragmentManager(), coz.m7237b(activity));
            this.f11751e = a;
            if (!equals(a)) {
                this.f11751e.f11750d.add(this);
            }
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f11747a.mo4041c();
        m7234a();
    }

    public final void onDetach() {
        super.onDetach();
        m7234a();
    }

    public final void onStart() {
        super.onStart();
        this.f11747a.mo4037a();
    }

    public final void onStop() {
        super.onStop();
        this.f11747a.mo4039b();
    }

    public final String toString() {
        String fragment = super.toString();
        int i = Build.VERSION.SDK_INT;
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = null;
        }
        String valueOf = String.valueOf(parentFragment);
        StringBuilder sb = new StringBuilder(String.valueOf(fragment).length() + 9 + String.valueOf(valueOf).length());
        sb.append(fragment);
        sb.append("{parent=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
