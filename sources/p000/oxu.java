package p000;

import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;

/* renamed from: oxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class oxu extends Fragment {

    /* renamed from: a */
    private oxt f38584a;

    /* renamed from: c */
    public int f38585c;

    static {
        odk.m28481a("FsmFragment");
    }

    /* renamed from: a */
    public final void mo22762a(bpea bpea) {
        this.f38584a.mo17450a(getClass(), bpea);
    }

    /* renamed from: b */
    public final oxr mo22763b() {
        return this.f38584a.mo17455h();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f38585c = getArguments().getInt("com.google.android.fsm.FsmController.ARG_STATE_ID");
        oxv oxv = ((oxt) activity).mo17455h().f38577f;
        this.f38584a = (oxt) getActivity();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f38584a.mo17448a(getClass());
        }
    }
}
