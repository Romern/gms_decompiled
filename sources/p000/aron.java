package p000;

import android.os.Bundle;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentTransaction;

/* renamed from: aron */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aron {

    /* renamed from: a */
    private static final int f88011a = C0126R.C0129id.fragment_container;

    /* renamed from: b */
    private final Activity f88012b;

    /* renamed from: c */
    private final arom f88013c;

    /* renamed from: d */
    private int f88014d = -1;

    /* renamed from: e */
    private Fragment f88015e;

    static {
        ascp.m73787a("D2D", "UI", "FragmentTransitionController");
    }

    /* renamed from: a */
    public final void mo48709a(int i, int i2) {
        mo48710a(i, i2, null);
    }

    public aron(Activity activity, arom arom) {
        this.f88012b = activity;
        this.f88013c = arom;
    }

    /* renamed from: a */
    public final void mo48710a(int i, int i2, Bundle bundle) {
        if (!this.f88012b.isFinishing()) {
            if (this.f88014d == i) {
                i2 = 4;
            }
            this.f88014d = i;
            this.f88015e = this.f88013c.mo48708a(i, bundle);
            FragmentTransaction beginTransaction = this.f88012b.getSupportFragmentManager().beginTransaction();
            if (i2 == 1) {
                beginTransaction.setCustomAnimations(C0126R.anim.slide_next_in, C0126R.anim.slide_next_out);
            } else if (i2 == 2) {
                beginTransaction.setCustomAnimations(C0126R.anim.slide_back_in, C0126R.anim.slide_back_out);
            } else if (i2 == 3) {
                beginTransaction.setCustomAnimations(17432576, 17432577);
            }
            Fragment fragment = this.f88015e;
            if (fragment instanceof DialogFragment) {
                beginTransaction.add(fragment, (String) null);
            } else {
                beginTransaction.replace(f88011a, fragment);
            }
            beginTransaction.commit();
        }
    }
}
