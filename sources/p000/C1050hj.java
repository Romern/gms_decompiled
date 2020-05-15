package p000;

import android.animation.Animator;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.p001v4.app.BackStackState;
import android.support.p001v4.app.FragmentManagerState;
import android.support.p001v4.app.FragmentState;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentTransaction;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: hj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1050hj {

    /* renamed from: A */
    private ArrayList f19845A;

    /* renamed from: B */
    private ArrayList f19846B;

    /* renamed from: C */
    private final Runnable f19847C;

    /* renamed from: D */
    private final C1038gz f19848D;

    /* renamed from: E */
    private final C1041hb f19849E;

    /* renamed from: a */
    public final C1056hp f19850a = new C1056hp();

    /* renamed from: b */
    public ArrayList f19851b;

    /* renamed from: c */
    public final C1035gw f19852c = new C1035gw(this);

    /* renamed from: d */
    public ags f19853d;

    /* renamed from: e */
    public final agp f19854e = new agp(this);

    /* renamed from: f */
    public final AtomicInteger f19855f = new AtomicInteger();

    /* renamed from: g */
    public ArrayList f19856g;

    /* renamed from: h */
    public final ConcurrentHashMap f19857h;

    /* renamed from: i */
    public final C1037gy f19858i;

    /* renamed from: j */
    int f19859j;

    /* renamed from: k */
    public C1034gv f19860k;

    /* renamed from: l */
    public C1030gr f19861l;

    /* renamed from: m */
    public C1018gh f19862m;

    /* renamed from: n */
    C1018gh f19863n;

    /* renamed from: o */
    public boolean f19864o;

    /* renamed from: p */
    public boolean f19865p;

    /* renamed from: q */
    public boolean f19866q;

    /* renamed from: r */
    public C1053hm f19867r;

    /* renamed from: s */
    private final ArrayList f19868s = new ArrayList();

    /* renamed from: t */
    private boolean f19869t;

    /* renamed from: u */
    private ArrayList f19870u;

    /* renamed from: v */
    private final ConcurrentHashMap f19871v = new ConcurrentHashMap();

    /* renamed from: w */
    private final C1033gu f19872w;

    /* renamed from: x */
    private boolean f19873x;

    /* renamed from: y */
    private boolean f19874y;

    /* renamed from: z */
    private ArrayList f19875z;

    public C1050hj() {
        new ConcurrentHashMap();
        this.f19857h = new ConcurrentHashMap();
        this.f19848D = new C1038gz(this);
        this.f19858i = new C1037gy(this);
        this.f19859j = -1;
        this.f19872w = new C1040ha(this);
        this.f19849E = new C1041hb();
        this.f19847C = new C1042hc(this);
    }

    /* renamed from: a */
    static C1018gh m14440a(View view) {
        Object tag = view.getTag(C0126R.C0129id.fragment_container_view_tag);
        if (tag instanceof C1018gh) {
            return (C1018gh) tag;
        }
        return null;
    }

    /* renamed from: d */
    private final void m14444d(boolean z) {
        if (this.f19869t) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f19860k != null) {
            if (Looper.myLooper() == this.f19860k.f19060d.getLooper()) {
                if (!z) {
                    m14451s();
                }
                if (this.f19875z == null) {
                    this.f19875z = new ArrayList();
                    this.f19845A = new ArrayList();
                }
                this.f19869t = true;
                this.f19869t = false;
                return;
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (this.f19866q) {
            throw new IllegalStateException("FragmentManager has been destroyed");
        } else {
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
    }

    /* renamed from: m */
    static final void m14445m(C1018gh ghVar) {
        if (m14443a(2)) {
            "show: " + ghVar;
        }
        if (ghVar.f18166C) {
            ghVar.f18166C = false;
            ghVar.f18179P = !ghVar.f18179P;
        }
    }

    /* renamed from: n */
    private final void m14446n(C1018gh ghVar) {
        HashSet hashSet = (HashSet) this.f19857h.get(ghVar);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((C1187mg) it.next()).mo15461b();
            }
            hashSet.clear();
            mo12540b(ghVar);
            this.f19857h.remove(ghVar);
        }
    }

    /* renamed from: o */
    private final void m14447o(C1018gh ghVar) {
        ViewGroup p = m14448p(ghVar);
        if (p != null) {
            if (p.getTag(C0126R.C0129id.visible_removing_fragment_view_tag) == null) {
                p.setTag(C0126R.C0129id.visible_removing_fragment_view_tag, ghVar);
            }
            ((C1018gh) p.getTag(C0126R.C0129id.visible_removing_fragment_view_tag)).mo11811a(ghVar.mo11821e());
        }
    }

    /* renamed from: p */
    private final ViewGroup m14448p(C1018gh ghVar) {
        if (ghVar.f18164A > 0 && this.f19861l.mo11665a()) {
            View a = this.f19861l.mo11664a(ghVar.f18164A);
            if (a instanceof ViewGroup) {
                return (ViewGroup) a;
            }
        }
        return null;
    }

    /* renamed from: q */
    private static final boolean m14449q(C1018gh ghVar) {
        if (ghVar.f18170G && ghVar.f18171H) {
            return true;
        }
        List d = ghVar.f18207x.f19850a.mo12671d();
        int size = d.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            C1018gh ghVar2 = (C1018gh) d.get(i);
            if (ghVar2 != null) {
                z = m14449q(ghVar2);
            }
            i++;
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    private final void m14450r() {
        List b = this.f19850a.mo12666b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            mo12526a((C1055ho) b.get(i));
        }
    }

    /* renamed from: s */
    private final void m14451s() {
        if (mo12554f()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: t */
    private final void m14452t() {
        this.f19869t = false;
        this.f19845A.clear();
        this.f19875z.clear();
    }

    /* renamed from: u */
    private final void m14453u() {
        if (!this.f19857h.isEmpty()) {
            for (C1018gh ghVar : this.f19857h.keySet()) {
                m14446n(ghVar);
                mo12546c(ghVar);
            }
        }
    }

    /* renamed from: v */
    private final void m14454v() {
        if (this.f19874y) {
            this.f19874y = false;
            m14450r();
        }
    }

    /* renamed from: b */
    public final C1018gh mo12536b(int i) {
        C1056hp hpVar = this.f19850a;
        for (int size = hpVar.f20147a.size() - 1; size >= 0; size--) {
            C1018gh ghVar = (C1018gh) hpVar.f20147a.get(size);
            if (ghVar != null && ghVar.f18209z == i) {
                return ghVar;
            }
        }
        for (C1055ho hoVar : hpVar.f20148b.values()) {
            if (hoVar != null) {
                C1018gh ghVar2 = hoVar.f20099a;
                if (ghVar2.f18209z == i) {
                    return ghVar2;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public final C1018gh mo12544c(String str) {
        return this.f19850a.mo12669c(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C1055ho mo12551e(C1018gh ghVar) {
        C1055ho b = this.f19850a.mo12665b(ghVar.f18192i);
        if (b != null) {
            return b;
        }
        C1055ho hoVar = new C1055ho(this.f19858i, this.f19850a, ghVar);
        hoVar.mo12643a(this.f19860k.f19059c.getClassLoader());
        hoVar.f20100b = this.f19859j;
        return hoVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo12553f(C1018gh ghVar) {
        if (m14443a(2)) {
            "add: " + ghVar;
        }
        this.f19850a.mo12663a(mo12551e(ghVar));
        if (!ghVar.f18167D) {
            this.f19850a.mo12662a(ghVar);
            ghVar.f18199p = false;
            if (ghVar.f18174K == null) {
                ghVar.f18179P = false;
            }
            if (m14449q(ghVar)) {
                this.f19873x = true;
            }
        }
    }

    /* renamed from: f */
    public final boolean mo12554f() {
        return this.f19864o || this.f19865p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final Parcelable mo12555g() {
        ArrayList arrayList;
        int size;
        m14453u();
        mo12535a(true);
        this.f19864o = true;
        this.f19867r.f20009i = true;
        C1056hp hpVar = this.f19850a;
        ArrayList arrayList2 = new ArrayList(hpVar.f20148b.size());
        for (C1055ho hoVar : hpVar.f20148b.values()) {
            if (hoVar != null) {
                C1018gh ghVar = hoVar.f20099a;
                FragmentState fragmentState = new FragmentState(ghVar);
                C1018gh ghVar2 = hoVar.f20099a;
                if (ghVar2.f18188e >= 0 && fragmentState.f1022m == null) {
                    fragmentState.f1022m = hoVar.mo12655m();
                    if (hoVar.f20099a.f18195l != null) {
                        if (fragmentState.f1022m == null) {
                            fragmentState.f1022m = new Bundle();
                        }
                        fragmentState.f1022m.putString("android:target_state", hoVar.f20099a.f18195l);
                        int i = hoVar.f20099a.f18196m;
                        if (i != 0) {
                            fragmentState.f1022m.putInt("android:target_req_state", i);
                        }
                    }
                } else {
                    fragmentState.f1022m = ghVar2.f18189f;
                }
                arrayList2.add(fragmentState);
                if (m14443a(2)) {
                    "Saved state of " + ghVar + ": " + fragmentState.f1022m;
                }
            }
        }
        BackStackState[] backStackStateArr = null;
        if (!arrayList2.isEmpty()) {
            C1056hp hpVar2 = this.f19850a;
            synchronized (hpVar2.f20147a) {
                if (!hpVar2.f20147a.isEmpty()) {
                    arrayList = new ArrayList(hpVar2.f20147a.size());
                    Iterator it = hpVar2.f20147a.iterator();
                    while (it.hasNext()) {
                        C1018gh ghVar3 = (C1018gh) it.next();
                        arrayList.add(ghVar3.f18192i);
                        if (m14443a(2)) {
                            "saveAllState: adding fragment (" + ghVar3.f18192i + "): " + ghVar3;
                        }
                    }
                } else {
                    arrayList = null;
                }
            }
            ArrayList arrayList3 = this.f19851b;
            if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                backStackStateArr = new BackStackState[size];
                for (int i2 = 0; i2 < size; i2++) {
                    backStackStateArr[i2] = new BackStackState((C1002ft) this.f19851b.get(i2));
                    if (m14443a(2)) {
                        "saveAllState: adding back stack #" + i2 + ": " + this.f19851b.get(i2);
                    }
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f1003a = arrayList2;
            fragmentManagerState.f1004b = arrayList;
            fragmentManagerState.f1005c = backStackStateArr;
            fragmentManagerState.f1006d = this.f19855f.get();
            C1018gh ghVar4 = this.f19863n;
            if (ghVar4 != null) {
                fragmentManagerState.f1007e = ghVar4.f18192i;
            }
            fragmentManagerState.f1008f.addAll(this.f19871v.keySet());
            fragmentManagerState.f1009g.addAll(this.f19871v.values());
            return fragmentManagerState;
        }
        m14443a(2);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo12557h() {
        this.f19864o = false;
        this.f19865p = false;
        this.f19867r.f20009i = false;
        mo12545c(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo12559i() {
        this.f19864o = false;
        this.f19865p = false;
        this.f19867r.f20009i = false;
        mo12545c(3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo12561j() {
        this.f19864o = false;
        this.f19865p = false;
        this.f19867r.f20009i = false;
        mo12545c(4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo12563k() {
        this.f19864o = false;
        this.f19865p = false;
        this.f19867r.f20009i = false;
        mo12545c(6);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo12565l() {
        mo12545c(4);
    }

    public void noteStateNotSaved() {
        if (this.f19860k != null) {
            this.f19864o = false;
            this.f19865p = false;
            this.f19867r.f20009i = false;
            for (C1018gh ghVar : this.f19850a.mo12670c()) {
                if (ghVar != null) {
                    ghVar.f18207x.noteStateNotSaved();
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C1018gh ghVar = this.f19862m;
        if (ghVar != null) {
            sb.append(ghVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f19862m)));
            sb.append("}");
        } else {
            C1034gv gvVar = this.f19860k;
            if (gvVar != null) {
                sb.append(gvVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f19860k)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: a */
    private final void m14441a(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!((C1002ft) arrayList.get(i)).f20285s) {
                    if (i2 != i) {
                        m14442a(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (((Boolean) arrayList2.get(i)).booleanValue()) {
                        while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C1002ft) arrayList.get(i2)).f20285s) {
                            i2++;
                        }
                    }
                    m14442a(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                m14442a(arrayList, arrayList2, i2, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: hj.a(int, boolean):void
     arg types: [int, int]
     candidates:
      hj.a(java.util.ArrayList, java.util.ArrayList):void
      hj.a(int, int):void
      hj.a(gh, int):void
      hj.a(gh, ae):void
      hj.a(gh, boolean):void
      hj.a(hh, boolean):void
      hj.a(android.view.Menu, android.view.MenuInflater):boolean
      hj.a(int, boolean):void */
    /* renamed from: c */
    public final void mo12545c(int i) {
        try {
            this.f19869t = true;
            for (C1055ho hoVar : this.f19850a.f20148b.values()) {
                if (hoVar != null) {
                    hoVar.f20100b = i;
                }
            }
            mo12518a(i, false);
            this.f19869t = false;
            mo12535a(true);
        } catch (Throwable th) {
            this.f19869t = false;
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo12558h(C1018gh ghVar) {
        if (m14443a(2)) {
            "hide: " + ghVar;
        }
        if (!ghVar.f18166C) {
            ghVar.f18166C = true;
            ghVar.f18179P = true ^ ghVar.f18179P;
            m14447o(ghVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo12560i(C1018gh ghVar) {
        if (m14443a(2)) {
            "detach: " + ghVar;
        }
        if (!ghVar.f18167D) {
            ghVar.f18167D = true;
            if (ghVar.f18198o) {
                if (m14443a(2)) {
                    "remove from detach: " + ghVar;
                }
                this.f19850a.mo12667b(ghVar);
                if (m14449q(ghVar)) {
                    this.f19873x = true;
                }
                m14447o(ghVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo12562j(C1018gh ghVar) {
        if (m14443a(2)) {
            "attach: " + ghVar;
        }
        if (ghVar.f18167D) {
            ghVar.f18167D = false;
            if (!ghVar.f18198o) {
                this.f19850a.mo12662a(ghVar);
                if (m14443a(2)) {
                    "add from attach: " + ghVar;
                }
                if (m14449q(ghVar)) {
                    this.f19873x = true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo12564k(C1018gh ghVar) {
        if (ghVar != null && (!ghVar.equals(mo12544c(ghVar.f18192i)) || !(ghVar.f18206w == null || ghVar.f18205v == this))) {
            throw new IllegalArgumentException("Fragment " + ghVar + " is not an active fragment of FragmentManager " + this);
        }
        C1018gh ghVar2 = this.f19863n;
        this.f19863n = ghVar;
        mo12566l(ghVar2);
        mo12566l(this.f19863n);
    }

    /* renamed from: l */
    public final void mo12566l(C1018gh ghVar) {
        if (ghVar != null && ghVar.equals(mo12544c(ghVar.f18192i))) {
            boolean a = ghVar.f18205v.mo12532a(ghVar);
            Boolean bool = ghVar.f18197n;
            if (bool == null || bool.booleanValue() != a) {
                ghVar.f18197n = Boolean.valueOf(a);
                C1050hj hjVar = ghVar.f18207x;
                hjVar.mo12538b();
                hjVar.mo12566l(hjVar.f19863n);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo12567m() {
        this.f19865p = true;
        this.f19867r.f20009i = true;
        mo12545c(3);
    }

    /* renamed from: e */
    public final List mo12552e() {
        return this.f19850a.mo12670c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo12568n() {
        this.f19866q = true;
        mo12535a(true);
        m14453u();
        mo12545c(-1);
        this.f19860k = null;
        this.f19861l = null;
        this.f19862m = null;
        if (this.f19853d != null) {
            Iterator it = this.f19854e.f515b.iterator();
            while (it.hasNext()) {
                ((agj) it.next()).mo668a();
            }
            this.f19853d = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo12570o() {
        for (C1018gh ghVar : this.f19850a.mo12670c()) {
            if (ghVar != null) {
                ghVar.onLowMemory();
                ghVar.f18207x.mo12570o();
            }
        }
    }

    /* renamed from: p */
    public final C1033gu mo12571p() {
        C1018gh ghVar = this.f19862m;
        return ghVar != null ? ghVar.f18205v.mo12571p() : this.f19872w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final C1041hb mo12572q() {
        C1018gh ghVar = this.f19862m;
        return ghVar != null ? ghVar.f18205v.mo12572q() : this.f19849E;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C1018gh mo12537b(String str) {
        for (C1055ho hoVar : this.f19850a.f20148b.values()) {
            if (hoVar != null) {
                C1018gh ghVar = hoVar.f20099a;
                if (!str.equals(ghVar.f18192i)) {
                    ghVar = ghVar.f18207x.mo12537b(str);
                }
                if (ghVar != null) {
                    return ghVar;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12546c(C1018gh ghVar) {
        mo12521a(ghVar, this.f19859j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12547c(boolean z) {
        for (C1018gh ghVar : this.f19850a.mo12670c()) {
            if (ghVar != null) {
                ghVar.f18207x.mo12547c(z);
            }
        }
    }

    /* renamed from: d */
    public final int mo12549d() {
        ArrayList arrayList = this.f19851b;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo12550d(C1018gh ghVar) {
        int i;
        Animator animator;
        ViewGroup viewGroup;
        int indexOfChild;
        int indexOfChild2;
        if (this.f19850a.mo12664a(ghVar.f18192i)) {
            mo12546c(ghVar);
            if (ghVar.f18174K != null) {
                C1056hp hpVar = this.f19850a;
                ViewGroup viewGroup2 = ghVar.f18173J;
                C1018gh ghVar2 = null;
                if (viewGroup2 != null) {
                    int indexOf = hpVar.f20147a.indexOf(ghVar) - 1;
                    while (true) {
                        if (indexOf < 0) {
                            break;
                        }
                        C1018gh ghVar3 = (C1018gh) hpVar.f20147a.get(indexOf);
                        if (ghVar3.f18173J == viewGroup2 && ghVar3.f18174K != null) {
                            ghVar2 = ghVar3;
                            break;
                        }
                        indexOf--;
                    }
                }
                if (ghVar2 != null && (indexOfChild2 = viewGroup.indexOfChild(ghVar.f18174K)) < (indexOfChild = (viewGroup = ghVar.f18173J).indexOfChild(ghVar2.f18174K))) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(ghVar.f18174K, indexOfChild);
                }
                if (ghVar.f18178O && ghVar.f18173J != null) {
                    float f = ghVar.f18180Q;
                    if (f > 0.0f) {
                        ghVar.f18174K.setAlpha(f);
                    }
                    ghVar.f18180Q = 0.0f;
                    ghVar.f18178O = false;
                    C1027go a = C1029gq.m13697a(this.f19860k.f19059c, ghVar, true);
                    if (a != null) {
                        Animation animation = a.f18757a;
                        if (animation == null) {
                            a.f18758b.setTarget(ghVar.f18174K);
                            a.f18758b.start();
                        } else {
                            ghVar.f18174K.startAnimation(animation);
                        }
                    }
                }
            }
            if (ghVar.f18179P) {
                if (ghVar.f18174K != null) {
                    C1027go a2 = C1029gq.m13697a(this.f19860k.f19059c, ghVar, !ghVar.f18166C);
                    if (a2 == null || (animator = a2.f18758b) == null) {
                        if (a2 != null) {
                            ghVar.f18174K.startAnimation(a2.f18757a);
                            a2.f18757a.start();
                        }
                        if (!ghVar.f18166C || ghVar.mo11824g()) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        ghVar.f18174K.setVisibility(i);
                        if (ghVar.mo11824g()) {
                            ghVar.mo11814a(false);
                        }
                    } else {
                        animator.setTarget(ghVar.f18174K);
                        if (!ghVar.f18166C) {
                            ghVar.f18174K.setVisibility(0);
                        } else if (ghVar.mo11824g()) {
                            ghVar.mo11814a(false);
                        } else {
                            ViewGroup viewGroup3 = ghVar.f18173J;
                            View view = ghVar.f18174K;
                            viewGroup3.startViewTransition(view);
                            a2.f18758b.addListener(new C1044hd(viewGroup3, view, ghVar));
                        }
                        a2.f18758b.start();
                    }
                }
                if (ghVar.f18198o && m14449q(ghVar)) {
                    this.f19873x = true;
                }
                ghVar.f18179P = false;
                ghVar.onHiddenChanged(ghVar.f18166C);
            }
        } else if (m14443a(3)) {
            "Ignoring moving " + ghVar + " to state " + this.f19859j + "since it is not added to " + this;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (mo12549d() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (mo12532a(r4.f19862m) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.f514a = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r0 = r4.f19854e;
     */
    /* renamed from: b */
    public final void mo12538b() {
        synchronized (this.f19868s) {
            boolean z = true;
            if (!this.f19868s.isEmpty()) {
                this.f19854e.f514a = true;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo12548c() {
        return mo12533a((String) null, -1, 0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: hj.a(gh, boolean):void
     arg types: [gh, int]
     candidates:
      hj.a(java.util.ArrayList, java.util.ArrayList):void
      hj.a(int, int):void
      hj.a(int, boolean):void
      hj.a(gh, int):void
      hj.a(gh, ae):void
      hj.a(hh, boolean):void
      hj.a(android.view.Menu, android.view.MenuInflater):boolean
      hj.a(gh, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: hj.a(int, boolean):void
     arg types: [int, int]
     candidates:
      hj.a(java.util.ArrayList, java.util.ArrayList):void
      hj.a(int, int):void
      hj.a(gh, int):void
      hj.a(gh, ae):void
      hj.a(gh, boolean):void
      hj.a(hh, boolean):void
      hj.a(android.view.Menu, android.view.MenuInflater):boolean
      hj.a(int, boolean):void */
    /* renamed from: a */
    private final void m14442a(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i5;
        int i6;
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        int i7 = i;
        int i8 = i2;
        boolean z = ((C1002ft) arrayList5.get(i7)).f20285s;
        ArrayList arrayList7 = this.f19846B;
        if (arrayList7 == null) {
            this.f19846B = new ArrayList();
        } else {
            arrayList7.clear();
        }
        this.f19846B.addAll(this.f19850a.mo12670c());
        C1018gh ghVar = this.f19863n;
        int i9 = i7;
        boolean z2 = false;
        while (true) {
            int i10 = 3;
            int i11 = 1;
            if (i9 < i8) {
                C1002ft ftVar = (C1002ft) arrayList5.get(i9);
                if (((Boolean) arrayList6.get(i9)).booleanValue()) {
                    ArrayList arrayList8 = this.f19846B;
                    for (int size = ftVar.f20270d.size() - 1; size >= 0; size--) {
                        C1057hq hqVar = (C1057hq) ftVar.f20270d.get(size);
                        int i12 = hqVar.f20205a;
                        if (i12 != 1) {
                            if (i12 != 3) {
                                switch (i12) {
                                    case 8:
                                        ghVar = null;
                                        break;
                                    case 9:
                                        ghVar = hqVar.f20206b;
                                        break;
                                    case 10:
                                        hqVar.f20212h = hqVar.f20211g;
                                        break;
                                }
                            }
                            arrayList8.add(hqVar.f20206b);
                        }
                        arrayList8.remove(hqVar.f20206b);
                    }
                } else {
                    ArrayList arrayList9 = this.f19846B;
                    int i13 = 0;
                    while (i13 < ftVar.f20270d.size()) {
                        C1057hq hqVar2 = (C1057hq) ftVar.f20270d.get(i13);
                        int i14 = hqVar2.f20205a;
                        if (i14 != i11) {
                            if (i14 == 2) {
                                C1018gh ghVar2 = hqVar2.f20206b;
                                int i15 = ghVar2.f18164A;
                                int size2 = arrayList9.size() - 1;
                                boolean z3 = false;
                                while (size2 >= 0) {
                                    C1018gh ghVar3 = (C1018gh) arrayList9.get(size2);
                                    if (ghVar3.f18164A != i15) {
                                        i6 = i15;
                                    } else if (ghVar3 == ghVar2) {
                                        i6 = i15;
                                        z3 = true;
                                    } else {
                                        if (ghVar3 == ghVar) {
                                            i6 = i15;
                                            ftVar.f20270d.add(i13, new C1057hq(9, ghVar3));
                                            i13++;
                                            ghVar = null;
                                        } else {
                                            i6 = i15;
                                        }
                                        C1057hq hqVar3 = new C1057hq(3, ghVar3);
                                        hqVar3.f20207c = hqVar2.f20207c;
                                        hqVar3.f20209e = hqVar2.f20209e;
                                        hqVar3.f20208d = hqVar2.f20208d;
                                        hqVar3.f20210f = hqVar2.f20210f;
                                        ftVar.f20270d.add(i13, hqVar3);
                                        arrayList9.remove(ghVar3);
                                        i13++;
                                    }
                                    size2--;
                                    i15 = i6;
                                }
                                if (z3) {
                                    ftVar.f20270d.remove(i13);
                                    i13--;
                                    i5 = 1;
                                } else {
                                    i5 = 1;
                                    hqVar2.f20205a = 1;
                                    arrayList9.add(ghVar2);
                                }
                            } else if (i14 == i10 || i14 == 6) {
                                arrayList9.remove(hqVar2.f20206b);
                                C1018gh ghVar4 = hqVar2.f20206b;
                                if (ghVar4 == ghVar) {
                                    ftVar.f20270d.add(i13, new C1057hq(9, ghVar4));
                                    i13++;
                                    ghVar = null;
                                }
                                i5 = 1;
                            } else if (i14 != 7) {
                                if (i14 != 8) {
                                    i5 = 1;
                                } else {
                                    ftVar.f20270d.add(i13, new C1057hq(9, ghVar));
                                    i13++;
                                    ghVar = hqVar2.f20206b;
                                    i5 = 1;
                                }
                            }
                            i13 += i5;
                            i11 = 1;
                            i10 = 3;
                        }
                        i5 = 1;
                        arrayList9.add(hqVar2.f20206b);
                        i13 += i5;
                        i11 = 1;
                        i10 = 3;
                    }
                }
                z2 = z2 || ftVar.f20276j;
                i9++;
                arrayList5 = arrayList;
                arrayList6 = arrayList2;
            } else {
                this.f19846B.clear();
                if (z || this.f19859j <= 0) {
                    i3 = -1;
                } else {
                    i3 = -1;
                    C1066hz.m15060a(this.f19860k.f19059c, this.f19861l, arrayList, arrayList2, i, i2, false, this.f19848D);
                }
                int i16 = i;
                while (i16 < i8) {
                    C1002ft ftVar2 = (C1002ft) arrayList.get(i16);
                    if (((Boolean) arrayList2.get(i16)).booleanValue()) {
                        ftVar2.mo11280a(i3);
                        int i17 = i8 - 1;
                        for (int size3 = ftVar2.f20270d.size() + i3; size3 >= 0; size3--) {
                            C1057hq hqVar4 = (C1057hq) ftVar2.f20270d.get(size3);
                            C1018gh ghVar5 = hqVar4.f20206b;
                            if (ghVar5 != null) {
                                int i18 = ftVar2.f20275i;
                                int i19 = FragmentTransaction.TRANSIT_FRAGMENT_FADE;
                                if (i18 == 4097) {
                                    i19 = FragmentTransaction.TRANSIT_FRAGMENT_CLOSE;
                                } else if (i18 != 4099) {
                                    i19 = i18 != 8194 ? 0 : FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
                                }
                                ghVar5.mo11815b(i19);
                            }
                            switch (hqVar4.f20205a) {
                                case 1:
                                    ghVar5.mo11811a(hqVar4.f20210f);
                                    ftVar2.f17209a.mo12523a(ghVar5, true);
                                    ftVar2.f17209a.mo12556g(ghVar5);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + hqVar4.f20205a);
                                case 3:
                                    ghVar5.mo11811a(hqVar4.f20209e);
                                    ftVar2.f17209a.mo12553f(ghVar5);
                                    break;
                                case 4:
                                    ghVar5.mo11811a(hqVar4.f20209e);
                                    m14445m(ghVar5);
                                    break;
                                case 5:
                                    ghVar5.mo11811a(hqVar4.f20210f);
                                    ftVar2.f17209a.mo12523a(ghVar5, true);
                                    ftVar2.f17209a.mo12558h(ghVar5);
                                    break;
                                case 6:
                                    ghVar5.mo11811a(hqVar4.f20209e);
                                    ftVar2.f17209a.mo12562j(ghVar5);
                                    break;
                                case 7:
                                    ghVar5.mo11811a(hqVar4.f20210f);
                                    ftVar2.f17209a.mo12523a(ghVar5, true);
                                    ftVar2.f17209a.mo12560i(ghVar5);
                                    break;
                                case 8:
                                    ftVar2.f17209a.mo12564k(null);
                                    break;
                                case 9:
                                    ftVar2.f17209a.mo12564k(ghVar5);
                                    break;
                                case 10:
                                    ftVar2.f17209a.mo12522a(ghVar5, hqVar4.f20211g);
                                    break;
                            }
                            if (!ftVar2.f20285s) {
                                if (!(hqVar4.f20205a == 3 || ghVar5 == null)) {
                                    ftVar2.f17209a.mo12550d(ghVar5);
                                }
                            }
                        }
                        if (!ftVar2.f20285s) {
                            if (i16 == i17) {
                                C1050hj hjVar = ftVar2.f17209a;
                                hjVar.mo12518a(hjVar.f19859j, true);
                            }
                        }
                    } else {
                        ftVar2.mo11280a(1);
                        int size4 = ftVar2.f20270d.size();
                        for (int i20 = 0; i20 < size4; i20++) {
                            C1057hq hqVar5 = (C1057hq) ftVar2.f20270d.get(i20);
                            C1018gh ghVar6 = hqVar5.f20206b;
                            if (ghVar6 != null) {
                                ghVar6.mo11815b(ftVar2.f20275i);
                            }
                            switch (hqVar5.f20205a) {
                                case 1:
                                    ghVar6.mo11811a(hqVar5.f20207c);
                                    ftVar2.f17209a.mo12523a(ghVar6, false);
                                    ftVar2.f17209a.mo12553f(ghVar6);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + hqVar5.f20205a);
                                case 3:
                                    ghVar6.mo11811a(hqVar5.f20208d);
                                    ftVar2.f17209a.mo12556g(ghVar6);
                                    break;
                                case 4:
                                    ghVar6.mo11811a(hqVar5.f20208d);
                                    ftVar2.f17209a.mo12558h(ghVar6);
                                    break;
                                case 5:
                                    ghVar6.mo11811a(hqVar5.f20207c);
                                    ftVar2.f17209a.mo12523a(ghVar6, false);
                                    m14445m(ghVar6);
                                    break;
                                case 6:
                                    ghVar6.mo11811a(hqVar5.f20208d);
                                    ftVar2.f17209a.mo12560i(ghVar6);
                                    break;
                                case 7:
                                    ghVar6.mo11811a(hqVar5.f20207c);
                                    ftVar2.f17209a.mo12523a(ghVar6, false);
                                    ftVar2.f17209a.mo12562j(ghVar6);
                                    break;
                                case 8:
                                    ftVar2.f17209a.mo12564k(ghVar6);
                                    break;
                                case 9:
                                    ftVar2.f17209a.mo12564k(null);
                                    break;
                                case 10:
                                    ftVar2.f17209a.mo12522a(ghVar6, hqVar5.f20212h);
                                    break;
                            }
                            if (!(ftVar2.f20285s || hqVar5.f20205a == 1 || ghVar6 == null)) {
                                ftVar2.f17209a.mo12550d(ghVar6);
                            }
                        }
                        if (!ftVar2.f20285s) {
                            C1050hj hjVar2 = ftVar2.f17209a;
                            hjVar2.mo12518a(hjVar2.f19859j, true);
                        }
                    }
                    i16++;
                    i3 = -1;
                }
                ArrayList arrayList10 = arrayList;
                ArrayList arrayList11 = arrayList2;
                if (z) {
                    C1225nr nrVar = new C1225nr();
                    int i21 = this.f19859j;
                    if (i21 > 0) {
                        int min = Math.min(i21, 4);
                        for (C1018gh ghVar7 : this.f19850a.mo12670c()) {
                            if (ghVar7.f18188e < min) {
                                mo12521a(ghVar7, min);
                                if (ghVar7.f18174K != null && !ghVar7.f18166C && ghVar7.f18178O) {
                                    nrVar.add(ghVar7);
                                }
                            }
                        }
                    }
                    int i22 = i8 - 1;
                    while (true) {
                        i4 = i;
                        if (i22 >= i4) {
                            C1002ft ftVar3 = (C1002ft) arrayList10.get(i22);
                            ((Boolean) arrayList11.get(i22)).booleanValue();
                            for (int i23 = 0; i23 < ftVar3.f20270d.size(); i23++) {
                                C1018gh ghVar8 = ((C1057hq) ftVar3.f20270d.get(i23)).f20206b;
                            }
                            i22--;
                        } else {
                            int i24 = nrVar.f26758b;
                            for (int i25 = 0; i25 < i24; i25++) {
                                C1018gh ghVar9 = (C1018gh) nrVar.mo15513b(i25);
                                if (!ghVar9.f18198o) {
                                    View requireView = ghVar9.requireView();
                                    ghVar9.f18180Q = requireView.getAlpha();
                                    requireView.setAlpha(0.0f);
                                }
                            }
                        }
                    }
                } else {
                    i4 = i;
                }
                if (i8 == i4) {
                    arrayList3 = arrayList11;
                    arrayList4 = arrayList10;
                } else if (z) {
                    if (this.f19859j > 0) {
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList10;
                        C1066hz.m15060a(this.f19860k.f19059c, this.f19861l, arrayList, arrayList2, i, i2, true, this.f19848D);
                    } else {
                        arrayList3 = arrayList11;
                        arrayList4 = arrayList10;
                    }
                    mo12518a(this.f19859j, true);
                } else {
                    arrayList3 = arrayList11;
                    arrayList4 = arrayList10;
                }
                while (i4 < i8) {
                    C1002ft ftVar4 = (C1002ft) arrayList4.get(i4);
                    if (((Boolean) arrayList3.get(i4)).booleanValue()) {
                        if (ftVar4.f17211c >= 0) {
                            ftVar4.f17211c = -1;
                        }
                    }
                    if (ftVar4.f20286t != null) {
                        for (int i26 = 0; i26 < ftVar4.f20286t.size(); i26++) {
                            ((Runnable) ftVar4.f20286t.get(i26)).run();
                        }
                        ftVar4.f20286t = null;
                    }
                    i4++;
                }
                if (z2 && this.f19856g != null) {
                    for (int i27 = 0; i27 < this.f19856g.size(); i27++) {
                        ((C1047hg) this.f19856g.get(i27)).mo8595a();
                    }
                    return;
                }
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12539b(Menu menu) {
        if (this.f19859j > 0) {
            for (C1018gh ghVar : this.f19850a.mo12670c()) {
                if (ghVar != null && !ghVar.f18166C) {
                    if (ghVar.f18170G && ghVar.f18171H) {
                        ghVar.onOptionsMenuClosed(menu);
                    }
                    ghVar.f18207x.mo12539b(menu);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo12540b(C1018gh ghVar) {
        ghVar.mo11820d();
        this.f19858i.mo12316g(ghVar, false);
        ghVar.f18173J = null;
        ghVar.f18174K = null;
        ghVar.f18185V = null;
        ghVar.f18187X.mo2450b((Object) null);
        ghVar.f18201r = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12541b(C1048hh hhVar, boolean z) {
        if (!z || (this.f19860k != null && !this.f19866q)) {
            m14444d(z);
            if (hhVar.mo11285a(this.f19875z, this.f19845A)) {
                this.f19869t = true;
                try {
                    m14441a(this.f19875z, this.f19845A);
                } finally {
                    m14452t();
                }
            }
            mo12538b();
            m14454v();
            this.f19850a.mo12661a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12542b(boolean z) {
        for (C1018gh ghVar : this.f19850a.mo12670c()) {
            if (ghVar != null) {
                ghVar.f18207x.mo12542b(z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo12543b(MenuItem menuItem) {
        if (this.f19859j > 0) {
            for (C1018gh ghVar : this.f19850a.mo12670c()) {
                if (ghVar != null && !ghVar.f18166C) {
                    if (ghVar.onContextItemSelected(menuItem) || ghVar.f18207x.mo12543b(menuItem)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo12556g(C1018gh ghVar) {
        if (m14443a(2)) {
            "remove: " + ghVar + " nesting=" + ghVar.f18204u;
        }
        boolean z = !ghVar.mo11817b();
        if (!ghVar.f18167D || z) {
            this.f19850a.mo12667b(ghVar);
            if (m14449q(ghVar)) {
                this.f19873x = true;
            }
            ghVar.f18199p = true;
            m14447o(ghVar);
        }
    }

    /* renamed from: a */
    static boolean m14443a(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: a */
    public final C1018gh mo12515a(String str) {
        C1056hp hpVar = this.f19850a;
        if (str != null) {
            for (int size = hpVar.f20147a.size() - 1; size >= 0; size--) {
                C1018gh ghVar = (C1018gh) hpVar.f20147a.get(size);
                if (ghVar != null && str.equals(ghVar.f18165B)) {
                    return ghVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C1055ho hoVar : hpVar.f20148b.values()) {
            if (hoVar != null) {
                C1018gh ghVar2 = hoVar.f20099a;
                if (str.equals(ghVar2.f18165B)) {
                    return ghVar2;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C1058hr mo12516a() {
        return new C1002ft(this);
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
    /* renamed from: a */
    public final void mo12517a(int i, int i2) {
        if (i >= 0) {
            mo12525a((C1048hh) new C1049hi(this, null, i, i2), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12518a(int i, boolean z) {
        C1034gv gvVar;
        if (this.f19860k == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f19859j) {
            this.f19859j = i;
            for (C1018gh ghVar : this.f19850a.mo12670c()) {
                mo12550d(ghVar);
            }
            List b = this.f19850a.mo12666b();
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1055ho hoVar = (C1055ho) b.get(i2);
                C1018gh ghVar2 = hoVar.f20099a;
                if (!ghVar2.f18178O) {
                    mo12550d(ghVar2);
                }
                if (ghVar2.f18199p && !ghVar2.mo11817b()) {
                    this.f19850a.mo12668b(hoVar);
                }
            }
            m14450r();
            if (this.f19873x && (gvVar = this.f19860k) != null && this.f19859j == 6) {
                gvVar.mo11897b();
                this.f19873x = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12519a(Configuration configuration) {
        for (C1018gh ghVar : this.f19850a.mo12670c()) {
            if (ghVar != null) {
                ghVar.onConfigurationChanged(configuration);
                ghVar.f18207x.mo12519a(configuration);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ft.a(java.lang.String, java.io.PrintWriter, boolean):void
     arg types: [java.lang.String, java.io.PrintWriter, int]
     candidates:
      hr.a(int, gh, java.lang.String):void
      ft.a(java.lang.String, java.io.PrintWriter, boolean):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12520a(Parcelable parcelable) {
        C1055ho hoVar;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f1003a != null) {
                this.f19850a.f20148b.clear();
                ArrayList arrayList = fragmentManagerState.f1003a;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    FragmentState fragmentState = (FragmentState) arrayList.get(i);
                    if (fragmentState != null) {
                        C1018gh ghVar = (C1018gh) this.f19867r.f20004d.get(fragmentState.f1011b);
                        if (ghVar != null) {
                            if (m14443a(2)) {
                                "restoreSaveState: re-attaching retained " + ghVar;
                            }
                            hoVar = new C1055ho(this.f19858i, this.f19850a, ghVar, fragmentState);
                        } else {
                            hoVar = new C1055ho(this.f19858i, this.f19850a, this.f19860k.f19059c.getClassLoader(), mo12571p(), fragmentState);
                        }
                        C1018gh ghVar2 = hoVar.f20099a;
                        ghVar2.f18205v = this;
                        if (m14443a(2)) {
                            "restoreSaveState: active (" + ghVar2.f18192i + "): " + ghVar2;
                        }
                        hoVar.mo12643a(this.f19860k.f19059c.getClassLoader());
                        this.f19850a.mo12663a(hoVar);
                        hoVar.f20100b = this.f19859j;
                    }
                }
                ArrayList arrayList2 = new ArrayList(this.f19867r.f20004d.values());
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C1018gh ghVar3 = (C1018gh) arrayList2.get(i2);
                    if (!this.f19850a.mo12664a(ghVar3.f18192i)) {
                        if (m14443a(2)) {
                            "Discarding retained Fragment " + ghVar3 + " that was not found in the set of active Fragments " + fragmentManagerState.f1003a;
                        }
                        this.f19867r.mo12608c(ghVar3);
                        ghVar3.f18205v = this;
                        C1055ho hoVar2 = new C1055ho(this.f19858i, this.f19850a, ghVar3);
                        hoVar2.f20100b = 1;
                        hoVar2.mo12644b();
                        ghVar3.f18199p = true;
                        hoVar2.mo12644b();
                    }
                }
                C1056hp hpVar = this.f19850a;
                ArrayList arrayList3 = fragmentManagerState.f1004b;
                hpVar.f20147a.clear();
                if (arrayList3 != null) {
                    int size3 = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size3) {
                        String str = (String) arrayList3.get(i3);
                        C1018gh c = hpVar.mo12669c(str);
                        if (c != null) {
                            if (m14443a(2)) {
                                "restoreSaveState: added (" + str + "): " + c;
                            }
                            hpVar.mo12662a(c);
                            i3++;
                        } else {
                            throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                        }
                    }
                }
                BackStackState[] backStackStateArr = fragmentManagerState.f1005c;
                if (backStackStateArr != null) {
                    this.f19851b = new ArrayList(backStackStateArr.length);
                    int i4 = 0;
                    while (true) {
                        BackStackState[] backStackStateArr2 = fragmentManagerState.f1005c;
                        if (i4 >= backStackStateArr2.length) {
                            break;
                        }
                        BackStackState backStackState = backStackStateArr2[i4];
                        C1002ft ftVar = new C1002ft(this);
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < backStackState.f988a.length) {
                            C1057hq hqVar = new C1057hq();
                            int i7 = i5 + 1;
                            hqVar.f20205a = backStackState.f988a[i5];
                            if (m14443a(2)) {
                                "Instantiate " + ftVar + " op #" + i6 + " base fragment #" + backStackState.f988a[i7];
                            }
                            String str2 = (String) backStackState.f989b.get(i6);
                            if (str2 != null) {
                                hqVar.f20206b = mo12544c(str2);
                            } else {
                                hqVar.f20206b = null;
                            }
                            hqVar.f20211g = C0007ae.values()[backStackState.f990c[i6]];
                            hqVar.f20212h = C0007ae.values()[backStackState.f991d[i6]];
                            int i8 = i7 + 1;
                            int[] iArr = backStackState.f988a;
                            int i9 = iArr[i7];
                            hqVar.f20207c = i9;
                            int i10 = i8 + 1;
                            int i11 = iArr[i8];
                            hqVar.f20208d = i11;
                            int i12 = i10 + 1;
                            int i13 = iArr[i10];
                            hqVar.f20209e = i13;
                            int i14 = iArr[i12];
                            hqVar.f20210f = i14;
                            ftVar.f20271e = i9;
                            ftVar.f20272f = i11;
                            ftVar.f20273g = i13;
                            ftVar.f20274h = i14;
                            ftVar.mo12687a(hqVar);
                            i6++;
                            i5 = i12 + 1;
                        }
                        ftVar.f20275i = backStackState.f992e;
                        ftVar.f20278l = backStackState.f993f;
                        ftVar.f17211c = backStackState.f994g;
                        ftVar.f20276j = true;
                        ftVar.f20279m = backStackState.f995h;
                        ftVar.f20280n = backStackState.f996i;
                        ftVar.f20281o = backStackState.f997j;
                        ftVar.f20282p = backStackState.f998k;
                        ftVar.f20283q = backStackState.f999l;
                        ftVar.f20284r = backStackState.f1000m;
                        ftVar.f20285s = backStackState.f1001n;
                        ftVar.mo11280a(1);
                        if (m14443a(2)) {
                            "restoreAllState: back stack #" + i4 + " (index " + ftVar.f17211c + "): " + ftVar;
                            PrintWriter printWriter = new PrintWriter(new C1093iw());
                            ftVar.mo11284a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f19851b.add(ftVar);
                        i4++;
                    }
                } else {
                    this.f19851b = null;
                }
                this.f19855f.set(fragmentManagerState.f1006d);
                String str3 = fragmentManagerState.f1007e;
                if (str3 != null) {
                    C1018gh c2 = mo12544c(str3);
                    this.f19863n = c2;
                    mo12566l(c2);
                }
                ArrayList arrayList4 = fragmentManagerState.f1008f;
                if (arrayList4 != null) {
                    for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                        this.f19871v.put(arrayList4.get(i15), fragmentManagerState.f1009g.get(i15));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r2 != 4) goto L_0x0164;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0160  */
    /* renamed from: a */
    public final void mo12521a(C1018gh ghVar, int i) {
        ViewGroup viewGroup;
        C1055ho b = this.f19850a.mo12665b(ghVar.f18192i);
        int i2 = 1;
        if (b == null) {
            b = new C1055ho(this.f19858i, this.f19850a, ghVar);
            b.f20100b = 1;
        }
        int min = Math.min(i, b.mo12642a());
        int i3 = ghVar.f18188e;
        if (i3 <= min) {
            if (i3 < min && !this.f19857h.isEmpty()) {
                m14446n(ghVar);
            }
            int i4 = ghVar.f18188e;
            if (i4 != -1) {
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 3) {
                        }
                        if (min > 3) {
                            b.mo12651i();
                        }
                        if (min > 4) {
                            b.mo12652j();
                        }
                    }
                    if (min >= 0) {
                        b.mo12645c();
                    }
                    if (min > 1) {
                        b.mo12648f();
                        b.mo12649g();
                        b.mo12650h();
                    }
                    if (min > 3) {
                    }
                    if (min > 4) {
                    }
                }
            } else if (min >= 0) {
                b.mo12646d();
            }
            if (min > 0) {
                b.mo12647e();
            }
            if (min >= 0) {
            }
            if (min > 1) {
            }
            if (min > 3) {
            }
            if (min > 4) {
            }
        } else if (i3 > min) {
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 == 6) {
                                if (min < 6) {
                                    b.mo12653k();
                                }
                            }
                        }
                        if (min < 4) {
                            b.mo12654l();
                        }
                    }
                    if (min < 3) {
                        if (m14443a(3)) {
                            "movefrom ACTIVITY_CREATED: " + ghVar;
                        }
                        if (ghVar.f18174K != null && !((C1019gi) this.f19860k).f18282a.isFinishing() && ghVar.f18190g == null) {
                            b.mo12656n();
                        }
                        View view = ghVar.f18174K;
                        if (!(view == null || (viewGroup = ghVar.f18173J) == null)) {
                            viewGroup.endViewTransition(view);
                            ghVar.f18174K.clearAnimation();
                            if (!ghVar.mo11819c()) {
                                C1027go goVar = null;
                                if (this.f19859j >= 0 && !this.f19866q && ghVar.f18174K.getVisibility() == 0 && ghVar.f18180Q >= 0.0f) {
                                    goVar = C1029gq.m13697a(this.f19860k.f19059c, ghVar, false);
                                }
                                ghVar.f18180Q = 0.0f;
                                ViewGroup viewGroup2 = ghVar.f18173J;
                                View view2 = ghVar.f18174K;
                                if (goVar != null) {
                                    C1038gz gzVar = this.f19848D;
                                    viewGroup2.startViewTransition(view2);
                                    C1187mg mgVar = new C1187mg();
                                    mgVar.mo15459a(new C1022gk(ghVar));
                                    gzVar.mo12338a(ghVar, mgVar);
                                    Animation animation = goVar.f18757a;
                                    if (animation != null) {
                                        C1028gp gpVar = new C1028gp(animation, viewGroup2, view2);
                                        ghVar.mo11813a(ghVar.f18174K);
                                        gpVar.setAnimationListener(new C1024gm(viewGroup2, ghVar, gzVar, mgVar));
                                        ghVar.f18174K.startAnimation(gpVar);
                                    } else {
                                        Animator animator = goVar.f18758b;
                                        ghVar.mo11812a(animator);
                                        animator.addListener(new C1026gn(viewGroup2, view2, ghVar, gzVar, mgVar));
                                        animator.setTarget(ghVar.f18174K);
                                        animator.start();
                                    }
                                }
                                viewGroup2.removeView(view2);
                                if (viewGroup2 != ghVar.f18173J) {
                                    return;
                                }
                            }
                        }
                        if (this.f19857h.get(ghVar) == null) {
                            b.mo12657o();
                        }
                    }
                }
                if (min <= 0) {
                    if (this.f19857h.get(ghVar) == null) {
                        b.mo12658p();
                    }
                    if (i2 < 0) {
                        b.mo12659q();
                    }
                    min = i2;
                }
            }
            i2 = min;
            if (i2 < 0) {
            }
            min = i2;
        }
        if (ghVar.f18188e != min) {
            if (m14443a(3)) {
                "moveToState: Fragment state for " + ghVar + " not updated inline; expected state " + min + " found " + ghVar.f18188e;
            }
            ghVar.f18188e = min;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12522a(C1018gh ghVar, C0007ae aeVar) {
        if (!ghVar.equals(mo12544c(ghVar.f18192i)) || !(ghVar.f18206w == null || ghVar.f18205v == this)) {
            throw new IllegalArgumentException("Fragment " + ghVar + " is not an active fragment of FragmentManager " + this);
        }
        ghVar.f18183T = aeVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12523a(C1018gh ghVar, boolean z) {
        ViewGroup p = m14448p(ghVar);
        if (p != null && (p instanceof C1031gs)) {
            ((C1031gs) p).f18920a = !z;
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [bt, gv], assign insn: null */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final void mo12524a(C1034gv r5, C1030gr grVar, C1018gh ghVar) {
        C1018gh ghVar2;
        if (this.f19860k == null) {
            this.f19860k = r5;
            this.f19861l = grVar;
            this.f19862m = ghVar;
            if (ghVar != null) {
                mo12538b();
            }
            if (r5 instanceof agt) {
                this.f19853d = ((C1019gi) r5).f18282a.f513j;
                if (ghVar == null) {
                    ghVar2 = r5;
                } else {
                    ghVar2 = ghVar;
                }
                ags ags = this.f19853d;
                agp agp = this.f19854e;
                C0008af lifecycle = ghVar2.getLifecycle();
                if (lifecycle.mo556a() != C0007ae.DESTROYED) {
                    agp.mo684a(new agq(ags, lifecycle, agp));
                }
            }
            if (ghVar != null) {
                C1053hm hmVar = ghVar.f18205v.f19867r;
                C1053hm hmVar2 = (C1053hm) hmVar.f20005e.get(ghVar.f18192i);
                if (hmVar2 == null) {
                    hmVar2 = new C1053hm(hmVar.f20007g);
                    hmVar.f20005e.put(ghVar.f18192i, hmVar2);
                }
                this.f19867r = hmVar2;
            } else if (r5 instanceof C0062bt) {
                this.f19867r = (C1053hm) new C0060br(r5.getViewModelStore(), C1053hm.f20003a).mo3444a(C1053hm.class);
            } else {
                this.f19867r = new C1053hm(false);
            }
            this.f19867r.f20009i = mo12554f();
            this.f19850a.f20149c = this.f19867r;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /* renamed from: a */
    public final void mo12525a(C1048hh hhVar, boolean z) {
        if (!z) {
            if (this.f19860k != null) {
                m14451s();
            } else if (this.f19866q) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f19868s) {
            if (this.f19860k != null) {
                this.f19868s.add(hhVar);
                synchronized (this.f19868s) {
                    if (this.f19868s.size() == 1) {
                        this.f19860k.f19060d.removeCallbacks(this.f19847C);
                        this.f19860k.f19060d.post(this.f19847C);
                        mo12538b();
                    }
                }
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12526a(C1055ho hoVar) {
        C1018gh ghVar = hoVar.f20099a;
        if (!ghVar.f18175L) {
            return;
        }
        if (this.f19869t) {
            this.f19874y = true;
            return;
        }
        ghVar.f18175L = false;
        mo12546c(ghVar);
    }

    /* renamed from: a */
    public final void mo12527a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C1093iw());
        C1034gv gvVar = this.f19860k;
        if (gvVar != null) {
            try {
                ((C1019gi) gvVar).f18282a.dump("  ", null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                mo12528a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    /* renamed from: a */
    public final void mo12528a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        C1056hp hpVar = this.f19850a;
        String str3 = str + "    ";
        if (!hpVar.f20148b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (C1055ho hoVar : hpVar.f20148b.values()) {
                printWriter.print(str);
                if (hoVar != null) {
                    C1018gh ghVar = hoVar.f20099a;
                    printWriter.println(ghVar);
                    ghVar.dump(str3, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = hpVar.f20147a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(((C1018gh) hpVar.f20147a.get(i)).toString());
            }
        }
        ArrayList arrayList = this.f19870u;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(((C1018gh) this.f19870u.get(i2)).toString());
            }
        }
        ArrayList arrayList2 = this.f19851b;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C1002ft ftVar = (C1002ft) this.f19851b.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(ftVar.toString());
                ftVar.mo11283a(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f19855f.get());
        synchronized (this.f19868s) {
            int size4 = this.f19868s.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println((C1048hh) this.f19868s.get(i4));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f19860k);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f19861l);
        if (this.f19862m != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f19862m);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f19859j);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f19864o);
        printWriter.print(" mStopped=");
        printWriter.print(this.f19865p);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f19866q);
        if (this.f19873x) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f19873x);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo12529a(Menu menu) {
        boolean z;
        if (this.f19859j <= 0) {
            return false;
        }
        boolean z2 = false;
        for (C1018gh ghVar : this.f19850a.mo12670c()) {
            if (ghVar != null && !ghVar.f18166C) {
                if (!ghVar.f18170G || !ghVar.f18171H) {
                    z = false;
                } else {
                    ghVar.onPrepareOptionsMenu(menu);
                    z = true;
                }
                if (ghVar.f18207x.mo12529a(menu) || z) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo12530a(Menu menu, MenuInflater menuInflater) {
        boolean z;
        if (this.f19859j <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (C1018gh ghVar : this.f19850a.mo12670c()) {
            if (ghVar != null && !ghVar.f18166C) {
                if (!ghVar.f18170G || !ghVar.f18171H) {
                    z = false;
                } else {
                    ghVar.onCreateOptionsMenu(menu, menuInflater);
                    z = true;
                }
                if (z || ghVar.f18207x.mo12530a(menu, menuInflater)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(ghVar);
                    z2 = true;
                }
            }
        }
        if (this.f19870u != null) {
            for (int i = 0; i < this.f19870u.size(); i++) {
                C1018gh ghVar2 = (C1018gh) this.f19870u.get(i);
                if (arrayList == null || !arrayList.contains(ghVar2)) {
                    ghVar2.onDestroyOptionsMenu();
                }
            }
        }
        this.f19870u = arrayList;
        return z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo12531a(MenuItem menuItem) {
        if (this.f19859j > 0) {
            for (C1018gh ghVar : this.f19850a.mo12670c()) {
                if (ghVar != null && !ghVar.f18166C) {
                    if ((ghVar.f18170G && ghVar.f18171H && ghVar.onOptionsItemSelected(menuItem)) || ghVar.f18207x.mo12531a(menuItem)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo12532a(C1018gh ghVar) {
        if (ghVar == null) {
            return true;
        }
        C1050hj hjVar = ghVar.f18205v;
        return ghVar.equals(hjVar.f19863n) && mo12532a(hjVar.f19862m);
    }

    /* renamed from: a */
    public final boolean mo12533a(String str, int i, int i2) {
        mo12535a(false);
        m14444d(true);
        C1018gh ghVar = this.f19863n;
        if (ghVar != null && i < 0 && str == null && ghVar.getChildFragmentManager().mo12548c()) {
            return true;
        }
        boolean a = mo12534a(this.f19875z, this.f19845A, str, i, i2);
        if (a) {
            this.f19869t = true;
            try {
                m14441a(this.f19875z, this.f19845A);
            } finally {
                m14452t();
            }
        }
        mo12538b();
        m14454v();
        this.f19850a.mo12661a();
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo12534a(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList arrayList3 = this.f19851b;
        if (arrayList3 != null) {
            if (str == null && i < 0 && (i2 & 1) == 0) {
                int size = arrayList3.size() - 1;
                if (size < 0) {
                    return false;
                }
                arrayList.add(this.f19851b.remove(size));
                arrayList2.add(true);
            } else {
                if (str == null && i < 0) {
                    i3 = -1;
                } else {
                    int size2 = arrayList3.size() - 1;
                    while (i3 >= 0) {
                        C1002ft ftVar = (C1002ft) this.f19851b.get(i3);
                        if ((str != null && str.equals(ftVar.f20278l)) || (i >= 0 && i == ftVar.f17211c)) {
                            break;
                        }
                        size2 = i3 - 1;
                    }
                    if (i3 >= 0) {
                        if ((i2 & 1) != 0) {
                            i3--;
                            while (i3 >= 0) {
                                C1002ft ftVar2 = (C1002ft) this.f19851b.get(i3);
                                if ((str == null || !str.equals(ftVar2.f20278l)) && (i < 0 || i != ftVar2.f17211c)) {
                                    break;
                                }
                                i3--;
                            }
                        }
                    }
                }
                if (i3 != this.f19851b.size() - 1) {
                    for (int size3 = this.f19851b.size() - 1; size3 > i3; size3--) {
                        arrayList.add(this.f19851b.remove(size3));
                        arrayList2.add(true);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final boolean mo12535a(boolean z) {
        m14444d(z);
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f19875z;
            ArrayList arrayList2 = this.f19845A;
            synchronized (this.f19868s) {
                if (this.f19868s.isEmpty()) {
                    break;
                }
                int size = this.f19868s.size();
                boolean z3 = false;
                for (int i = 0; i < size; i++) {
                    z3 |= ((C1048hh) this.f19868s.get(i)).mo11285a(arrayList, arrayList2);
                }
                this.f19868s.clear();
                this.f19860k.f19060d.removeCallbacks(this.f19847C);
                if (!z3) {
                    break;
                }
                this.f19869t = true;
                try {
                    m14441a(this.f19875z, this.f19845A);
                    m14452t();
                    z2 = true;
                } catch (Throwable th) {
                    m14452t();
                    throw th;
                }
            }
        }
        mo12538b();
        m14454v();
        this.f19850a.mo12661a();
        return z2;
    }
}
