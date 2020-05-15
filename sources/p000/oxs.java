package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.carsetup.fsm.impl.FsmController$StackEntry;

/* renamed from: oxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class oxs extends Fragment {

    /* renamed from: d */
    public oxr f38583d;

    /* renamed from: a */
    public int mo22665a(String str) {
        return 0;
    }

    /* renamed from: a */
    public void mo22668a(int i, int i2, int i3) {
    }

    /* renamed from: a */
    public void mo22669a(bped bped) {
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f38583d.f38577f == null && !getActivity().isFinishing()) {
            oxr oxr = this.f38583d;
            if (oxr.f38577f == null) {
                int size = oxr.f38576e.size();
                while (size > 0) {
                    int i = size - 1;
                    if (((FsmController$StackEntry) oxr.f38576e.get(i)).f29667c) {
                        break;
                    }
                    oxr.f38576e.remove(i);
                    size = i;
                }
                if (size != 0) {
                    FsmController$StackEntry fsmController$StackEntry = (FsmController$StackEntry) oxr.f38576e.get(size - 1);
                    oxv oxv = oxr.f38577f;
                    Class cls = fsmController$StackEntry.f29665a;
                    Parcelable parcelable = fsmController$StackEntry.f29666b;
                    oxr.f38577f = oxr.mo22760b(cls);
                    oxr.mo22759a(oxv, oxr.f38577f, (String) null);
                    oxr.mo22756a((String) null, (Object) null);
                    return;
                }
                oxr.mo22753a(oxr.f38575d, (String) null, (Parcelable) null);
                return;
            }
            oxr.mo22748a();
            throw new RuntimeException("start already called");
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        oxr oxr = this.f38583d;
        if (oxr != null) {
            oxt oxt = (oxt) activity;
            oxr.mo22758a(oxt);
            oxt.mo17451a(this.f38583d);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Activity activity = getActivity();
        oxt oxt = (oxt) activity;
        setRetainInstance(true);
        oxr oxr = new oxr(activity, oxt.mo17453e(), oxt.mo17454g(), this, bundle);
        this.f38583d = oxr;
        oxt.mo17451a(oxr);
        this.f38583d.mo22758a(oxt);
    }

    public final void onDetach() {
        oxr oxr = this.f38583d;
        if (oxr != null) {
            oxr.f38580i = null;
        }
        super.onDetach();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList(oxr.f38570a, this.f38583d.f38576e);
    }
}
