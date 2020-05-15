package p000;

import android.content.Context;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: cpd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cpd extends C1018gh {

    /* renamed from: Y */
    private final Set f11764Y = new HashSet();

    /* renamed from: Z */
    private cpd f11765Z;

    /* renamed from: a */
    public final C0087com f11766a;

    /* renamed from: b */
    public final cpa f11767b = new cpc(this);

    /* renamed from: c */
    public ccd f11768c;

    public cpd() {
        C0087com com2 = new C0087com();
        this.f11766a = com2;
    }

    /* renamed from: j */
    private final void m7243j() {
        cpd cpd = this.f11765Z;
        if (cpd != null) {
            cpd.f11764Y.remove(this);
            this.f11765Z = null;
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        C1018gh ghVar = this;
        while (ghVar.getParentFragment() != null) {
            ghVar = ghVar.getParentFragment();
        }
        C1050hj fragmentManager = ghVar.getFragmentManager();
        if (fragmentManager != null) {
            try {
                Context context2 = getContext();
                m7243j();
                cpd a = cbo.m3902a(context2).f6407e.mo8076a(fragmentManager, coz.m7237b(context2));
                this.f11765Z = a;
                if (!equals(a)) {
                    this.f11765Z.f11764Y.add(this);
                }
            } catch (IllegalStateException e) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e);
                }
            }
        } else if (Log.isLoggable("SupportRMFragment", 5)) {
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f11766a.mo4041c();
        m7243j();
    }

    public final void onDetach() {
        super.onDetach();
        m7243j();
    }

    public final void onStart() {
        super.onStart();
        this.f11766a.mo4037a();
    }

    public final void onStop() {
        super.onStop();
        this.f11766a.mo4039b();
    }

    public final String toString() {
        String ghVar = super.toString();
        C1018gh parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = null;
        }
        String valueOf = String.valueOf(parentFragment);
        StringBuilder sb = new StringBuilder(String.valueOf(ghVar).length() + 9 + String.valueOf(valueOf).length());
        sb.append(ghVar);
        sb.append("{parent=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
