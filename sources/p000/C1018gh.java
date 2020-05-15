package p000;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p001v4.app.Fragment$SavedState;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: gh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class C1018gh implements ComponentCallbacks, View.OnCreateContextMenuListener, C0013ak, C0062bt, ape {

    /* renamed from: d */
    static final Object f18163d = new Object();

    /* renamed from: A */
    public int f18164A;

    /* renamed from: B */
    public String f18165B;

    /* renamed from: C */
    public boolean f18166C;

    /* renamed from: D */
    public boolean f18167D;

    /* renamed from: E */
    public boolean f18168E;

    /* renamed from: F */
    boolean f18169F;

    /* renamed from: G */
    boolean f18170G;

    /* renamed from: H */
    boolean f18171H = true;

    /* renamed from: I */
    public boolean f18172I;

    /* renamed from: J */
    ViewGroup f18173J;

    /* renamed from: K */
    View f18174K;

    /* renamed from: L */
    boolean f18175L;

    /* renamed from: M */
    boolean f18176M = true;

    /* renamed from: N */
    C1015ge f18177N;

    /* renamed from: O */
    boolean f18178O;

    /* renamed from: P */
    boolean f18179P;

    /* renamed from: Q */
    float f18180Q;

    /* renamed from: R */
    LayoutInflater f18181R;

    /* renamed from: S */
    boolean f18182S;

    /* renamed from: T */
    public C0007ae f18183T;

    /* renamed from: U */
    C0015am f18184U;

    /* renamed from: V */
    C1079ik f18185V;

    /* renamed from: W */
    apd f18186W;

    /* renamed from: X */
    final C0034at f18187X;

    /* renamed from: e */
    public int f18188e = -1;

    /* renamed from: f */
    Bundle f18189f;

    /* renamed from: g */
    SparseArray f18190g;

    /* renamed from: h */
    Boolean f18191h;

    /* renamed from: i */
    public String f18192i = UUID.randomUUID().toString();

    /* renamed from: j */
    public Bundle f18193j;

    /* renamed from: k */
    C1018gh f18194k;

    /* renamed from: l */
    String f18195l = null;

    /* renamed from: m */
    int f18196m;

    /* renamed from: n */
    public Boolean f18197n = null;

    /* renamed from: o */
    boolean f18198o;

    /* renamed from: p */
    public boolean f18199p;

    /* renamed from: q */
    public boolean f18200q;

    /* renamed from: r */
    boolean f18201r;

    /* renamed from: s */
    boolean f18202s;

    /* renamed from: t */
    boolean f18203t;

    /* renamed from: u */
    int f18204u;

    /* renamed from: v */
    public C1050hj f18205v;

    /* renamed from: w */
    C1034gv f18206w;

    /* renamed from: x */
    C1050hj f18207x = new C1050hj();

    /* renamed from: y */
    C1018gh f18208y;

    /* renamed from: z */
    public int f18209z;

    public C1018gh() {
        new C1011gb(this);
        this.f18183T = C0007ae.RESUMED;
        this.f18187X = new C0034at();
        new AtomicInteger();
        mo11818bn();
    }

    @Deprecated
    public static C1018gh instantiate(Context context, String str, Bundle bundle) {
        try {
            return (C1018gh) C1033gu.m13903b(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e) {
            throw new C1016gf("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new C1016gf("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C1016gf("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C1016gf("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    /* renamed from: j */
    private final C1015ge mo63753j() {
        if (this.f18177N == null) {
            this.f18177N = new C1015ge();
        }
        return this.f18177N;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final LayoutInflater mo11810a(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.f18181R = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11815b(int i) {
        if (this.f18177N != null || i != 0) {
            mo63753j();
            this.f18177N.f17995d = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo11817b() {
        return this.f18204u > 0;
    }

    /* renamed from: bn */
    public final void mo11818bn() {
        this.f18184U = new C0015am(this);
        this.f18186W = apd.m1789a(this);
        int i = Build.VERSION.SDK_INT;
        this.f18184U.mo557a(new C1012gc(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo11819c() {
        C1018gh parentFragment = getParentFragment();
        return parentFragment != null && (parentFragment.isRemoving() || parentFragment.mo11819c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo11820d() {
        this.f18207x.mo12545c(1);
        if (this.f18174K != null) {
            this.f18185V.mo13077a(C0005ad.ON_DESTROY);
        }
        this.f18188e = 1;
        this.f18172I = false;
        onDestroyView();
        if (this.f18172I) {
            C1091iu iuVar = ((C1092iv) C1087iq.m15879a(this)).f21843a;
            int c = iuVar.f21758d.mo15640c();
            for (int i = 0; i < c; i++) {
                ((C1088ir) iuVar.f21758d.mo15641c(i)).mo13291e();
            }
            this.f18203t = false;
            return;
        }
        throw new C1126kb("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f18209z));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f18164A));
        printWriter.print(" mTag=");
        printWriter.println(this.f18165B);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f18188e);
        printWriter.print(" mWho=");
        printWriter.print(this.f18192i);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f18204u);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f18198o);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f18199p);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f18200q);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f18201r);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f18166C);
        printWriter.print(" mDetached=");
        printWriter.print(this.f18167D);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f18171H);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f18170G);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f18168E);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f18176M);
        if (this.f18205v != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f18205v);
        }
        if (this.f18206w != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f18206w);
        }
        if (this.f18208y != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f18208y);
        }
        if (this.f18193j != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f18193j);
        }
        if (this.f18189f != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f18189f);
        }
        if (this.f18190g != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f18190g);
        }
        C1018gh targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f18196m);
        }
        if (mo11821e() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(mo11821e());
        }
        if (this.f18173J != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f18173J);
        }
        if (this.f18174K != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f18174K);
        }
        if (mo11823f() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(mo11823f());
        }
        if (getContext() != null) {
            C1087iq.m15879a(this).mo13250a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f18207x + ":");
        C1050hj hjVar = this.f18207x;
        hjVar.mo12528a(str + "  ", fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final int mo11821e() {
        C1015ge geVar = this.f18177N;
        if (geVar != null) {
            return geVar.f17994c;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final View mo11823f() {
        C1015ge geVar = this.f18177N;
        if (geVar != null) {
            return geVar.f17992a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo11824g() {
        C1015ge geVar = this.f18177N;
        if (geVar != null) {
            return geVar.f18005n;
        }
        return false;
    }

    public final C1021gj getActivity() {
        C1034gv gvVar = this.f18206w;
        if (gvVar != null) {
            return (C1021gj) gvVar.f19058b;
        }
        return null;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C1015ge geVar = this.f18177N;
        if (geVar == null || (bool = geVar.f18003l) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C1015ge geVar = this.f18177N;
        if (geVar == null || (bool = geVar.f18002k) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final Bundle getArguments() {
        return this.f18193j;
    }

    public final C1050hj getChildFragmentManager() {
        if (this.f18206w != null) {
            return this.f18207x;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        C1034gv gvVar = this.f18206w;
        if (gvVar != null) {
            return gvVar.f19059c;
        }
        return null;
    }

    public Object getEnterTransition() {
        C1015ge geVar = this.f18177N;
        if (geVar != null) {
            return geVar.f17996e;
        }
        return null;
    }

    public Object getExitTransition() {
        C1015ge geVar = this.f18177N;
        if (geVar != null) {
            return geVar.f17998g;
        }
        return null;
    }

    @Deprecated
    public final C1050hj getFragmentManager() {
        return this.f18205v;
    }

    public final Object getHost() {
        C1034gv gvVar = this.f18206w;
        if (gvVar != null) {
            return ((C1019gi) gvVar).f18282a;
        }
        return null;
    }

    public final int getId() {
        return this.f18209z;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        C1034gv gvVar = this.f18206w;
        if (gvVar != null) {
            C1019gi giVar = (C1019gi) gvVar;
            LayoutInflater cloneInContext = giVar.f18282a.getLayoutInflater().cloneInContext(giVar.f18282a);
            C1259oy.m19819a(cloneInContext, this.f18207x.f19852c);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public C0008af getLifecycle() {
        return this.f18184U;
    }

    @Deprecated
    public C1087iq getLoaderManager() {
        return C1087iq.m15879a(this);
    }

    public final C1018gh getParentFragment() {
        return this.f18208y;
    }

    public final C1050hj getParentFragmentManager() {
        C1050hj hjVar = this.f18205v;
        if (hjVar != null) {
            return hjVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public Object getReenterTransition() {
        C1015ge geVar = this.f18177N;
        if (geVar == null) {
            return null;
        }
        if (geVar.f17999h != f18163d) {
            return this.f18177N.f17999h;
        }
        return getExitTransition();
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        return this.f18168E;
    }

    public Object getReturnTransition() {
        C1015ge geVar = this.f18177N;
        if (geVar == null) {
            return null;
        }
        if (geVar.f17997f != f18163d) {
            return this.f18177N.f17997f;
        }
        return getEnterTransition();
    }

    public final apc getSavedStateRegistry() {
        return this.f18186W.f1922a;
    }

    public Object getSharedElementEnterTransition() {
        C1015ge geVar = this.f18177N;
        if (geVar != null) {
            return geVar.f18000i;
        }
        return null;
    }

    public Object getSharedElementReturnTransition() {
        C1015ge geVar = this.f18177N;
        if (geVar == null) {
            return null;
        }
        if (geVar.f18001j != f18163d) {
            return this.f18177N.f18001j;
        }
        return getSharedElementEnterTransition();
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.f18165B;
    }

    @Deprecated
    public final C1018gh getTargetFragment() {
        String str;
        C1018gh ghVar = this.f18194k;
        if (ghVar != null) {
            return ghVar;
        }
        C1050hj hjVar = this.f18205v;
        if (hjVar == null || (str = this.f18195l) == null) {
            return null;
        }
        return hjVar.mo12544c(str);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        return this.f18196m;
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.f18176M;
    }

    public View getView() {
        return this.f18174K;
    }

    public C0034at getViewLifecycleOwnerLiveData() {
        return this.f18187X;
    }

    public C0061bs getViewModelStore() {
        C1050hj hjVar = this.f18205v;
        if (hjVar != null) {
            C1053hm hmVar = hjVar.f19867r;
            C0061bs bsVar = (C0061bs) hmVar.f20006f.get(this.f18192i);
            if (bsVar != null) {
                return bsVar;
            }
            C0061bs bsVar2 = new C0061bs();
            hmVar.f20006f.put(this.f18192i, bsVar2);
            return bsVar2;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo11843h() {
        C1015ge geVar = this.f18177N;
    }

    public final boolean hasOptionsMenu() {
        return this.f18170G;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo11846i() {
        C1015ge geVar = this.f18177N;
    }

    public final boolean isAdded() {
        return this.f18206w != null && this.f18198o;
    }

    public final boolean isDetached() {
        return this.f18167D;
    }

    public final boolean isHidden() {
        return this.f18166C;
    }

    public final boolean isInLayout() {
        return this.f18201r;
    }

    public final boolean isMenuVisible() {
        return this.f18171H;
    }

    public final boolean isRemoving() {
        return this.f18199p;
    }

    public final boolean isResumed() {
        return this.f18188e >= 6;
    }

    public final boolean isStateSaved() {
        C1050hj hjVar = this.f18205v;
        if (hjVar != null) {
            return hjVar.mo12554f();
        }
        return false;
    }

    public final boolean isVisible() {
        View view;
        return isAdded() && !isHidden() && (view = this.f18174K) != null && view.getWindowToken() != null && this.f18174K.getVisibility() == 0;
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.f18172I = true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.f18172I = true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f18172I = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.f18172I = true;
        mo11816b(bundle);
        C1050hj hjVar = this.f18207x;
        if (hjVar.f19859j <= 0) {
            hjVar.mo12557h();
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void onDestroy() {
        this.f18172I = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.f18172I = true;
    }

    public void onDetach() {
        this.f18172I = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f18172I = true;
    }

    public void onLowMemory() {
        this.f18172I = true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.f18172I = true;
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onResume() {
        this.f18172I = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.f18172I = true;
    }

    public void onStop() {
        this.f18172I = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.f18172I = true;
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public final C1021gj requireActivity() {
        C1021gj activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        mo63753j().f18003l = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        mo63753j().f18002k = Boolean.valueOf(z);
    }

    public void setArguments(Bundle bundle) {
        if (this.f18205v == null || !isStateSaved()) {
            this.f18193j = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void setEnterTransition(Object obj) {
        mo63753j().f17996e = obj;
    }

    public void setExitTransition(Object obj) {
        mo63753j().f17998g = obj;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.f18170G != z) {
            this.f18170G = z;
            if (isAdded() && !isHidden()) {
                this.f18206w.mo11897b();
            }
        }
    }

    public void setInitialSavedState(Fragment$SavedState fragment$SavedState) {
        Bundle bundle;
        if (this.f18205v == null) {
            Bundle bundle2 = null;
            if (!(fragment$SavedState == null || (bundle = fragment$SavedState.f1002a) == null)) {
                bundle2 = bundle;
            }
            this.f18189f = bundle2;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z) {
        if (this.f18171H != z) {
            this.f18171H = z;
            if (this.f18170G && isAdded() && !isHidden()) {
                this.f18206w.mo11897b();
            }
        }
    }

    public void setReenterTransition(Object obj) {
        mo63753j().f17999h = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        this.f18168E = z;
        C1050hj hjVar = this.f18205v;
        if (hjVar == null) {
            this.f18169F = true;
        } else if (!z) {
            hjVar.f19867r.mo12608c(this);
        } else {
            hjVar.f19867r.mo12606a(this);
        }
    }

    public void setReturnTransition(Object obj) {
        mo63753j().f17997f = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        mo63753j().f18000i = obj;
    }

    public void setSharedElementReturnTransition(Object obj) {
        mo63753j().f18001j = obj;
    }

    @Deprecated
    public void setTargetFragment(C1018gh ghVar, int i) {
        C1050hj hjVar;
        C1050hj hjVar2 = this.f18205v;
        if (ghVar != null) {
            hjVar = ghVar.f18205v;
        } else {
            hjVar = null;
        }
        if (hjVar2 == null || hjVar == null || hjVar2 == hjVar) {
            C1018gh ghVar2 = ghVar;
            while (ghVar2 != null) {
                if (!ghVar2.equals(this)) {
                    ghVar2 = ghVar2.getTargetFragment();
                } else {
                    throw new IllegalArgumentException("Setting " + ghVar + " as the target of " + this + " would create a target cycle");
                }
            }
            if (ghVar == null) {
                this.f18195l = null;
            } else if (this.f18205v == null || ghVar.f18205v == null) {
                this.f18195l = null;
                this.f18194k = ghVar;
                this.f18196m = i;
                return;
            } else {
                this.f18195l = ghVar.f18192i;
            }
            this.f18194k = null;
            this.f18196m = i;
            return;
        }
        throw new IllegalArgumentException("Fragment " + ghVar + " must share the same FragmentManager to be set as a target fragment");
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        if (!this.f18176M && z && this.f18188e < 4 && this.f18205v != null && isAdded() && this.f18182S) {
            C1050hj hjVar = this.f18205v;
            hjVar.mo12526a(hjVar.mo12551e(this));
        }
        this.f18176M = z;
        boolean z2 = false;
        if (this.f18188e < 4 && !z) {
            z2 = true;
        }
        this.f18175L = z2;
        if (this.f18189f != null) {
            this.f18191h = Boolean.valueOf(z);
        }
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        int i5 = i;
        C1034gv gvVar = this.f18206w;
        if (gvVar != null) {
            C1021gj gjVar = ((C1019gi) gvVar).f18282a;
            gjVar.f18329f = true;
            if (i5 != -1) {
                try {
                    C1021gj.m13233b(i);
                    C1133kh.m17841a(gjVar, intentSender, ((gjVar.mo11925b(this) + 1) << 16) + ((char) i5), intent, i2, i3, i4, bundle);
                } finally {
                    gjVar.f18329f = false;
                }
            } else {
                C1133kh.m17841a(gjVar, intentSender, -1, intent, i2, i3, i4, bundle);
                gjVar.f18329f = false;
            }
        } else {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
    }

    public void startPostponedEnterTransition() {
        if (this.f18177N != null) {
            boolean z = mo63753j().f18004m;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f18192i);
        sb.append(")");
        if (this.f18209z != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f18209z));
        }
        if (this.f18165B != null) {
            sb.append(" ");
            sb.append(this.f18165B);
        }
        sb.append('}');
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11811a(int i) {
        if (this.f18177N != null || i != 0) {
            mo63753j().f17994c = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11816b(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f18207x.mo12520a(parcelable);
            this.f18207x.mo12557h();
        }
    }

    public void onAttach(Context context) {
        this.f18172I = true;
        C1034gv gvVar = this.f18206w;
        Activity activity = gvVar != null ? gvVar.f19058b : null;
        if (activity != null) {
            this.f18172I = false;
            onAttach(activity);
        }
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f18172I = true;
        C1034gv gvVar = this.f18206w;
        Activity activity = gvVar != null ? gvVar.f19058b : null;
        if (activity != null) {
            this.f18172I = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    public void startActivity(Intent intent, Bundle bundle) {
        C1034gv gvVar = this.f18206w;
        if (gvVar != null) {
            gvVar.mo11896a(this, intent, -1);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        C1034gv gvVar = this.f18206w;
        if (gvVar != null) {
            gvVar.mo11896a(this, intent, i);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11812a(Animator animator) {
        mo63753j().f17993b = animator;
    }

    /* renamed from: a */
    public void mo11578a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f18207x.noteStateNotSaved();
        this.f18203t = true;
        this.f18185V = new C1079ik();
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.f18174K = onCreateView;
        if (onCreateView != null) {
            this.f18185V.mo13076a();
            C0063bu.m3626a(this.f18174K, this.f18185V);
            this.f18187X.mo2450b(this.f18185V);
        } else if (this.f18185V.f21161a == null) {
            this.f18185V = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11813a(View view) {
        mo63753j().f17992a = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo11814a(boolean z) {
        mo63753j().f18005n = z;
    }
}
