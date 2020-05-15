package p000;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: dny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class dny extends avh {

    /* renamed from: b */
    private final FragmentManager f13657b;

    /* renamed from: c */
    private FragmentTransaction f13658c = null;

    /* renamed from: d */
    private final ArrayList f13659d = new ArrayList();

    /* renamed from: e */
    private final ArrayList f13660e = new ArrayList();

    /* renamed from: f */
    private Fragment f13661f = null;

    public dny(FragmentManager fragmentManager) {
        this.f13657b = fragmentManager;
    }

    /* renamed from: a */
    public abstract Fragment mo9326a(int i);

    /* renamed from: a */
    public final Object mo2711a(ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f13660e.size() > i && (fragment = (Fragment) this.f13660e.get(i)) != null) {
            return fragment;
        }
        if (this.f13658c == null) {
            this.f13658c = this.f13657b.beginTransaction();
        }
        Fragment a = mo9326a(i);
        if (this.f13659d.size() > i && (savedState = (Fragment.SavedState) this.f13659d.get(i)) != null) {
            a.setInitialSavedState(savedState);
        }
        while (this.f13660e.size() <= i) {
            this.f13660e.add(null);
        }
        a.setMenuVisibility(false);
        a.setUserVisibleHint(false);
        this.f13660e.set(i, a);
        this.f13658c.add(viewGroup.getId(), a);
        return a;
    }

    /* renamed from: b */
    public final Parcelable mo2717b() {
        Bundle bundle;
        if (this.f13659d.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f13659d.size()];
            this.f13659d.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f13660e.size(); i++) {
            Fragment fragment = (Fragment) this.f13660e.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                StringBuilder sb = new StringBuilder(12);
                sb.append("f");
                sb.append(i);
                this.f13657b.putFragment(bundle, sb.toString(), fragment);
            }
        }
        return bundle;
    }

    /* renamed from: d */
    public final void mo2721d() {
        FragmentTransaction fragmentTransaction = this.f13658c;
        if (fragmentTransaction != null) {
            fragmentTransaction.commitNowAllowingStateLoss();
            this.f13658c = null;
        }
    }

    /* renamed from: b */
    public final void mo2718b(Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f13661f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f13661f.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f13661f = fragment;
        }
    }

    /* renamed from: a */
    public final void mo2713a(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f13659d.clear();
            this.f13660e.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f13659d.add((Fragment.SavedState) parcelable2);
                }
            }
            Iterator<T> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                T t = (String) it.next();
                if (t.startsWith("f")) {
                    int parseInt = Integer.parseInt(t.substring(1));
                    Fragment fragment = this.f13657b.getFragment(bundle, t);
                    if (fragment != null) {
                        while (this.f13660e.size() <= parseInt) {
                            this.f13660e.add(null);
                        }
                        fragment.setMenuVisibility(false);
                        this.f13660e.set(parseInt, fragment);
                    } else {
                        String valueOf = String.valueOf(t);
                        Log.w("FragmentStatePagerAdapter", valueOf.length() == 0 ? new String("Bad fragment at key ") : "Bad fragment at key ".concat(valueOf));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo2714a(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append("ViewPager with adapter ");
            sb.append(valueOf);
            sb.append(" requires a view id");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo2715a(ViewGroup viewGroup, int i, Object obj) {
        Fragment.SavedState savedState;
        Fragment fragment = (Fragment) obj;
        if (this.f13658c == null) {
            this.f13658c = this.f13657b.beginTransaction();
        }
        while (this.f13659d.size() <= i) {
            this.f13659d.add(null);
        }
        ArrayList arrayList = this.f13659d;
        if (fragment.isAdded()) {
            savedState = this.f13657b.saveFragmentInstanceState(fragment);
        } else {
            savedState = null;
        }
        arrayList.set(i, savedState);
        this.f13660e.set(i, null);
        this.f13658c.remove(fragment);
    }

    /* renamed from: a */
    public final boolean mo2716a(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }
}
