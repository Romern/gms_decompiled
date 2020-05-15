package p000;

import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;

/* renamed from: adms */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class adms extends Fragment {

    /* renamed from: d */
    protected admr f62171d;

    /* renamed from: e */
    protected admp f62172e;

    /* renamed from: f */
    protected admq f62173f;

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f62171d = (admr) activity;
            this.f62172e = (admp) activity;
            this.f62173f = (admq) activity;
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(activity);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
            sb.append(valueOf);
            sb.append(" must implement SetupFragment callbacks");
            throw new ClassCastException(sb.toString());
        }
    }
}
