package com.google.android.chimera;

import android.view.View;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.util.ArrayList;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FragmentTransaction {
    public static final int TRANSIT_ENTER_MASK = 4096;
    public static final int TRANSIT_EXIT_MASK = 8192;
    public static final int TRANSIT_FRAGMENT_CLOSE = 8194;
    public static final int TRANSIT_FRAGMENT_FADE = 4099;
    public static final int TRANSIT_FRAGMENT_OPEN = 4097;
    public static final int TRANSIT_NONE = 0;
    public static final int TRANSIT_UNSET = -1;

    /* renamed from: a */
    private final C1058hr f7630a;

    public FragmentTransaction(C1058hr hrVar) {
        this.f7630a = hrVar;
    }

    public FragmentTransaction add(int i, Fragment fragment) {
        this.f7630a.mo11281a(i, fragment.getSupportContainerFragment(), (String) null, 1);
        return this;
    }

    public FragmentTransaction addSharedElement(View view, String str) {
        C1058hr hrVar = this.f7630a;
        if (!(C1066hz.f20575a == null && C1066hz.f20576b == null)) {
            String q = C1280ps.m19935q(view);
            if (q != null) {
                if (hrVar.f20283q == null) {
                    hrVar.f20283q = new ArrayList();
                    hrVar.f20284r = new ArrayList();
                } else if (hrVar.f20284r.contains(str)) {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                } else if (hrVar.f20283q.contains(q)) {
                    throw new IllegalArgumentException("A shared element with the source name '" + q + "' has already been added to the transaction.");
                }
                hrVar.f20283q.add(q);
                hrVar.f20284r.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    public FragmentTransaction addToBackStack(String str) {
        C1058hr hrVar = this.f7630a;
        if (hrVar.f20277k) {
            hrVar.f20276j = true;
            hrVar.f20278l = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public FragmentTransaction attach(Fragment fragment) {
        this.f7630a.mo12687a(new C1057hq(7, fragment.getSupportContainerFragment()));
        return this;
    }

    public int commit() {
        return this.f7630a.mo11294f();
    }

    public int commitAllowingStateLoss() {
        return this.f7630a.mo11295g();
    }

    public void commitNow() {
        this.f7630a.mo11296h();
    }

    public void commitNowAllowingStateLoss() {
        this.f7630a.mo11297i();
    }

    public FragmentTransaction detach(Fragment fragment) {
        this.f7630a.mo11282a(fragment.getSupportContainerFragment());
        return this;
    }

    public FragmentTransaction disallowAddToBackStack() {
        this.f7630a.mo12689l();
        return this;
    }

    public C1058hr getNativeFragmentTransaction() {
        return this.f7630a;
    }

    public FragmentTransaction hide(Fragment fragment) {
        this.f7630a.mo11287b(fragment.getSupportContainerFragment());
        return this;
    }

    public boolean isAddToBackStackAllowed() {
        return this.f7630a.f20277k;
    }

    public boolean isEmpty() {
        return this.f7630a.mo11299k();
    }

    public FragmentTransaction remove(Fragment fragment) {
        this.f7630a.mo11289c(fragment.getSupportContainerFragment());
        return this;
    }

    public FragmentTransaction replace(int i, Fragment fragment) {
        this.f7630a.mo12684a(i, fragment.getSupportContainerFragment());
        return this;
    }

    public FragmentTransaction runOnCommit(Runnable runnable) {
        C1058hr hrVar = this.f7630a;
        hrVar.mo12689l();
        if (hrVar.f20286t == null) {
            hrVar.f20286t = new ArrayList();
        }
        hrVar.f20286t.add(runnable);
        return this;
    }

    public FragmentTransaction setBreadCrumbShortTitle(int i) {
        C1058hr hrVar = this.f7630a;
        hrVar.f20281o = i;
        hrVar.f20282p = null;
        return this;
    }

    public FragmentTransaction setBreadCrumbShortTitle(CharSequence charSequence) {
        C1058hr hrVar = this.f7630a;
        hrVar.f20281o = 0;
        hrVar.f20282p = charSequence;
        return this;
    }

    public FragmentTransaction setBreadCrumbTitle(int i) {
        C1058hr hrVar = this.f7630a;
        hrVar.f20279m = i;
        hrVar.f20280n = null;
        return this;
    }

    public FragmentTransaction setBreadCrumbTitle(CharSequence charSequence) {
        C1058hr hrVar = this.f7630a;
        hrVar.f20279m = 0;
        hrVar.f20280n = charSequence;
        return this;
    }

    public FragmentTransaction setCustomAnimations(int i, int i2) {
        this.f7630a.mo12683a(i, i2, 0, 0);
        return this;
    }

    public FragmentTransaction setPrimaryNavigationFragment(Fragment fragment) {
        this.f7630a.mo11291d(fragment.getSupportContainerFragment());
        return this;
    }

    public FragmentTransaction setTransition(int i) {
        this.f7630a.f20275i = i;
        return this;
    }

    public FragmentTransaction setTransitionStyle(int i) {
        return this;
    }

    public FragmentTransaction show(Fragment fragment) {
        this.f7630a.mo11293e(fragment.getSupportContainerFragment());
        return this;
    }

    public FragmentTransaction replace(int i, Fragment fragment, String str) {
        this.f7630a.mo12688b(i, fragment.getSupportContainerFragment(), str);
        return this;
    }

    public FragmentTransaction add(int i, Fragment fragment, String str) {
        this.f7630a.mo12685a(i, fragment.getSupportContainerFragment(), str);
        return this;
    }

    public FragmentTransaction setCustomAnimations(int i, int i2, int i3, int i4) {
        this.f7630a.mo12683a(i, i2, i3, i4);
        return this;
    }

    public FragmentTransaction add(Fragment fragment, String str) {
        this.f7630a.mo12686a(fragment.getSupportContainerFragment(), str);
        return this;
    }
}
