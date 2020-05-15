package com.google.android.chimera;

import android.os.Bundle;
import android.support.p001v4.app.Fragment$SavedState;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.annotation.ChimeraApiVersion;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FragmentManager {
    public static final int POP_BACK_STACK_INCLUSIVE = 1;

    /* renamed from: a */
    private static WeakHashMap f7626a = new WeakHashMap();

    /* renamed from: b */
    private final C1050hj f7627b;

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class BackStackEntry {

        /* renamed from: a */
        C1045he f7628a;

        public BackStackEntry(C1045he heVar) {
            this.f7628a = heVar;
        }

        public CharSequence getBreadCrumbShortTitle() {
            return this.f7628a.mo11292e();
        }

        public int getBreadCrumbShortTitleRes() {
            return this.f7628a.mo11288c();
        }

        public CharSequence getBreadCrumbTitle() {
            return this.f7628a.mo11290d();
        }

        public int getBreadCrumbTitleRes() {
            return this.f7628a.mo11286b();
        }

        public int getId() {
            return this.f7628a.mo11278a();
        }

        public String getName() {
            return this.f7628a.mo11298j();
        }
    }

    @ChimeraApiVersion(added = 0)
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface OnBackStackChangedListener {
        void onBackStackChanged();
    }

    private FragmentManager(C1050hj hjVar) {
        this.f7627b = hjVar;
    }

    static FragmentManager get(C1050hj hjVar) {
        FragmentManager fragmentManager = null;
        if (hjVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) f7626a.get(hjVar);
        if (weakReference != null) {
            fragmentManager = (FragmentManager) weakReference.get();
        }
        if (fragmentManager != null) {
            return fragmentManager;
        }
        FragmentManager fragmentManager2 = new FragmentManager(hjVar);
        f7626a.put(hjVar, new WeakReference(fragmentManager2));
        return fragmentManager2;
    }

    public void addOnBackStackChangedListener(OnBackStackChangedListener onBackStackChangedListener) {
        C1050hj hjVar = this.f7627b;
        dei a = dei.m8250a(onBackStackChangedListener, true);
        bmxy.m108581a(a);
        if (hjVar.f19856g == null) {
            hjVar.f19856g = new ArrayList();
        }
        hjVar.f19856g.add(a);
    }

    public FragmentTransaction beginTransaction() {
        return new FragmentTransaction(this.f7627b.mo12516a());
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f7627b.mo12528a(str, fileDescriptor, printWriter, strArr);
    }

    public boolean executePendingTransactions() {
        return this.f7627b.mo12535a(true);
    }

    public Fragment findFragmentById(int i) {
        Fragment.ProxyCallbacks proxyCallbacks = (Fragment.ProxyCallbacks) this.f7627b.mo12536b(i);
        if (proxyCallbacks != null) {
            return proxyCallbacks.getModuleFragment();
        }
        return null;
    }

    public Fragment findFragmentByTag(String str) {
        Fragment.ProxyCallbacks proxyCallbacks = (Fragment.ProxyCallbacks) this.f7627b.mo12515a(str);
        if (proxyCallbacks != null) {
            return proxyCallbacks.getModuleFragment();
        }
        return null;
    }

    public BackStackEntry getBackStackEntryAt(int i) {
        return new BackStackEntry((C1045he) this.f7627b.f19851b.get(i));
    }

    public int getBackStackEntryCount() {
        return this.f7627b.mo12549d();
    }

    public Fragment getFragment(Bundle bundle, String str) {
        C1018gh ghVar;
        C1050hj hjVar = this.f7627b;
        String string = bundle.getString(str);
        if (string != null) {
            ghVar = hjVar.mo12544c(string);
            if (ghVar == null) {
                hjVar.mo12527a(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
            }
        } else {
            ghVar = null;
        }
        Fragment.ProxyCallbacks proxyCallbacks = (Fragment.ProxyCallbacks) ghVar;
        if (proxyCallbacks != null) {
            return proxyCallbacks.getModuleFragment();
        }
        return null;
    }

    public List getFragments() {
        List<C1018gh> e = this.f7627b.mo12552e();
        ArrayList arrayList = new ArrayList(e.size());
        for (C1018gh ghVar : e) {
            if (ghVar != null && (ghVar instanceof Fragment.ProxyCallbacks)) {
                Fragment moduleFragment = ((Fragment.ProxyCallbacks) ghVar).getModuleFragment();
                bmxy.m108581a(moduleFragment);
                arrayList.add(moduleFragment);
            }
        }
        return arrayList;
    }

    public C1050hj getNativeFragmentManager() {
        return this.f7627b;
    }

    public boolean isDestroyed() {
        return this.f7627b.f19866q;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: hj.a(hh, boolean):void
     arg types: [hi, int]
     candidates:
      hj.a(java.util.ArrayList, java.util.ArrayList):void
      hj.a(int, int):void
      hj.a(int, boolean):void
      hj.a(gh, int):void
      hj.a(gh, ae):void
      hj.a(gh, boolean):void
      hj.a(android.view.Menu, android.view.MenuInflater):boolean
      hj.a(hh, boolean):void */
    public void popBackStack() {
        C1050hj hjVar = this.f7627b;
        hjVar.mo12525a((C1048hh) new C1049hi(hjVar, null, -1, 0), false);
    }

    public boolean popBackStackImmediate() {
        return this.f7627b.mo12548c();
    }

    public void putFragment(Bundle bundle, String str, Fragment fragment) {
        C1050hj hjVar = this.f7627b;
        C1018gh supportContainerFragment = fragment.getSupportContainerFragment();
        if (supportContainerFragment.f18205v != hjVar) {
            hjVar.mo12527a(new IllegalStateException("Fragment " + supportContainerFragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, supportContainerFragment.f18192i);
    }

    public void removeOnBackStackChangedListener(OnBackStackChangedListener onBackStackChangedListener) {
        ArrayList arrayList;
        dei a = dei.m8250a(onBackStackChangedListener, false);
        if (a != null && (arrayList = this.f7627b.f19856g) != null) {
            arrayList.remove(a);
        }
    }

    public Fragment.SavedState saveFragmentInstanceState(Fragment fragment) {
        Fragment$SavedState fragment$SavedState;
        Bundle m;
        C1050hj hjVar = this.f7627b;
        C1018gh supportContainerFragment = fragment.getSupportContainerFragment();
        C1055ho b = hjVar.f19850a.mo12665b(supportContainerFragment.f18192i);
        if (b == null || !b.f20099a.equals(supportContainerFragment)) {
            hjVar.mo12527a(new IllegalStateException("Fragment " + supportContainerFragment + " is not currently in the FragmentManager"));
        }
        if (b.f20099a.f18188e < 0 || (m = b.mo12655m()) == null) {
            fragment$SavedState = null;
        } else {
            fragment$SavedState = new Fragment$SavedState(m);
        }
        if (fragment$SavedState != null) {
            return new Fragment.SavedState(fragment$SavedState);
        }
        return null;
    }

    public boolean popBackStackImmediate(int i, int i2) {
        C1050hj hjVar = this.f7627b;
        if (i >= 0) {
            return hjVar.mo12533a((String) null, i, i2);
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    public void popBackStack(int i, int i2) {
        this.f7627b.mo12517a(i, i2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: hj.a(hh, boolean):void
     arg types: [hi, int]
     candidates:
      hj.a(java.util.ArrayList, java.util.ArrayList):void
      hj.a(int, int):void
      hj.a(int, boolean):void
      hj.a(gh, int):void
      hj.a(gh, ae):void
      hj.a(gh, boolean):void
      hj.a(android.view.Menu, android.view.MenuInflater):boolean
      hj.a(hh, boolean):void */
    public void popBackStack(String str, int i) {
        C1050hj hjVar = this.f7627b;
        hjVar.mo12525a((C1048hh) new C1049hi(hjVar, str, -1, i), false);
    }

    public boolean popBackStackImmediate(String str, int i) {
        return this.f7627b.mo12533a(str, -1, i);
    }
}
