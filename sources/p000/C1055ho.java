package p000;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p001v4.app.FragmentState;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import java.util.List;
import java.util.UUID;

/* renamed from: ho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1055ho {

    /* renamed from: a */
    public final C1018gh f20099a;

    /* renamed from: b */
    public int f20100b = -1;

    /* renamed from: c */
    private final C1037gy f20101c;

    /* renamed from: d */
    private final C1056hp f20102d;

    /* renamed from: e */
    private boolean f20103e = false;

    /* renamed from: f */
    private C1187mg f20104f;

    /* renamed from: g */
    private C1187mg f20105g;

    public C1055ho(C1037gy gyVar, C1056hp hpVar, C1018gh ghVar) {
        this.f20101c = gyVar;
        this.f20102d = hpVar;
        this.f20099a = ghVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo12642a() {
        C1018gh ghVar = this.f20099a;
        if (ghVar.f18205v == null) {
            return ghVar.f18188e;
        }
        int i = this.f20100b;
        if (ghVar.f18200q) {
            if (ghVar.f18201r) {
                i = Math.max(i, 1);
            } else if (i < 3) {
                i = Math.min(i, ghVar.f18188e);
            } else {
                i = Math.min(i, 1);
            }
        }
        if (!this.f20099a.f18198o) {
            i = Math.min(i, 1);
        }
        C1018gh ghVar2 = this.f20099a;
        if (ghVar2.f18199p) {
            if (ghVar2.mo11817b()) {
                i = Math.min(i, 1);
            } else {
                i = Math.min(i, -1);
            }
        }
        C1018gh ghVar3 = this.f20099a;
        if (ghVar3.f18175L && ghVar3.f18188e < 4) {
            i = Math.min(i, 3);
        }
        C0007ae aeVar = C0007ae.DESTROYED;
        int ordinal = this.f20099a.f18183T.ordinal();
        if (ordinal == 2) {
            return Math.min(i, 1);
        }
        if (ordinal != 3) {
            return ordinal != 4 ? Math.min(i, -1) : i;
        }
        return Math.min(i, 4);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12644b() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (!this.f20103e) {
            boolean z = false;
            z = true;
            try {
                while (true) {
                    int a = mo12642a();
                    int i = this.f20099a.f18188e;
                    if (a == i) {
                        this.f20103e = z;
                        return;
                    } else if (a <= i) {
                        int i2 = i - 1;
                        C1187mg mgVar = this.f20104f;
                        if (mgVar != null) {
                            mgVar.mo15461b();
                        }
                        switch (i2) {
                            case -1:
                                mo12659q();
                                break;
                            case 0:
                                mo12658p();
                                break;
                            case 1:
                                mo12657o();
                                break;
                            case 2:
                                if (C1050hj.m14443a(3)) {
                                    "movefrom ACTIVITY_CREATED: " + this.f20099a;
                                }
                                C1018gh ghVar = this.f20099a;
                                if (!(ghVar.f18174K == null || (viewGroup2 = ghVar.f18173J) == null)) {
                                    C1125ka a2 = C1125ka.m17549a(viewGroup2, ghVar.getParentFragmentManager());
                                    C1187mg mgVar2 = new C1187mg();
                                    this.f20105g = mgVar2;
                                    a2.mo14272a(this, mgVar2);
                                }
                                this.f20099a.f18188e = 2;
                                break;
                            case 3:
                                mo12654l();
                                break;
                            case 4:
                                this.f20099a.f18188e = 4;
                                break;
                            case 5:
                                mo12653k();
                                break;
                        }
                    } else {
                        int i3 = i + 1;
                        C1187mg mgVar3 = this.f20105g;
                        if (mgVar3 != null) {
                            mgVar3.mo15461b();
                        }
                        switch (i3) {
                            case 0:
                                mo12646d();
                                continue;
                            case 1:
                                mo12647e();
                                continue;
                            case 2:
                                mo12645c();
                                mo12648f();
                                mo12649g();
                                mo12650h();
                                continue;
                            case 3:
                                C1018gh ghVar2 = this.f20099a;
                                if (!(ghVar2.f18174K == null || (viewGroup = ghVar2.f18173J) == null)) {
                                    C1125ka a3 = C1125ka.m17549a(viewGroup, ghVar2.getParentFragmentManager());
                                    C1187mg mgVar4 = new C1187mg();
                                    this.f20104f = mgVar4;
                                    a3.mo14272a(this, mgVar4);
                                }
                                this.f20099a.f18188e = 3;
                                continue;
                            case 4:
                                mo12651i();
                                continue;
                            case 5:
                                this.f20099a.f18188e = 5;
                                continue;
                            case 6:
                                mo12652j();
                                continue;
                            default:
                                continue;
                        }
                    }
                }
            } finally {
                this.f20103e = z;
            }
        } else if (C1050hj.m14443a(2)) {
            "Ignoring re-entrant call to moveToExpectedState() for " + this.f20099a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo12645c() {
        C1018gh ghVar = this.f20099a;
        if (ghVar.f18200q && ghVar.f18201r && !ghVar.f18203t) {
            if (C1050hj.m14443a(3)) {
                "moveto CREATE_VIEW: " + this.f20099a;
            }
            C1018gh ghVar2 = this.f20099a;
            ghVar2.mo11578a(ghVar2.mo11810a(ghVar2.f18189f), null, this.f20099a.f18189f);
            View view = this.f20099a.f18174K;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                C1018gh ghVar3 = this.f20099a;
                ghVar3.f18174K.setTag(C0126R.C0129id.fragment_container_view_tag, ghVar3);
                C1018gh ghVar4 = this.f20099a;
                if (ghVar4.f18166C) {
                    ghVar4.f18174K.setVisibility(8);
                }
                C1018gh ghVar5 = this.f20099a;
                ghVar5.onViewCreated(ghVar5.f18174K, ghVar5.f18189f);
                C1037gy gyVar = this.f20101c;
                C1018gh ghVar6 = this.f20099a;
                gyVar.mo12306a(ghVar6, ghVar6.f18174K, ghVar6.f18189f, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo12646d() {
        if (C1050hj.m14443a(3)) {
            "moveto ATTACHED: " + this.f20099a;
        }
        C1018gh ghVar = this.f20099a;
        C1018gh ghVar2 = ghVar.f18194k;
        C1055ho hoVar = null;
        if (ghVar2 != null) {
            C1055ho b = this.f20102d.mo12665b(ghVar2.f18192i);
            if (b != null) {
                C1018gh ghVar3 = this.f20099a;
                ghVar3.f18195l = ghVar3.f18194k.f18192i;
                ghVar3.f18194k = null;
                hoVar = b;
            } else {
                throw new IllegalStateException("Fragment " + this.f20099a + " declared target fragment " + this.f20099a.f18194k + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = ghVar.f18195l;
            if (str != null && (hoVar = this.f20102d.mo12665b(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f20099a + " declared target fragment " + this.f20099a.f18195l + " that does not belong to this FragmentManager!");
            }
        }
        if (hoVar != null && hoVar.f20099a.f18188e <= 0) {
            hoVar.mo12644b();
        }
        C1018gh ghVar4 = this.f20099a;
        C1050hj hjVar = ghVar4.f18205v;
        ghVar4.f18206w = hjVar.f19860k;
        ghVar4.f18208y = hjVar.f19862m;
        this.f20101c.mo12307a(ghVar4, false);
        C1018gh ghVar5 = this.f20099a;
        ghVar5.f18207x.mo12524a(ghVar5.f18206w, new C1014gd(ghVar5), ghVar5);
        ghVar5.f18188e = 0;
        ghVar5.f18172I = false;
        ghVar5.onAttach(ghVar5.f18206w.f19059c);
        if (ghVar5.f18172I) {
            if (ghVar5.f18208y == null) {
                ((C1019gi) ghVar5.f18206w).f18282a.mo11920a(ghVar5);
            }
            C1050hj hjVar2 = ghVar5.f18207x;
            hjVar2.f19864o = false;
            hjVar2.f19865p = false;
            hjVar2.f19867r.f20009i = false;
            hjVar2.mo12545c(0);
            this.f20101c.mo12309b(this.f20099a, false);
            return;
        }
        throw new C1126kb("Fragment " + ghVar5 + " did not call through to super.onAttach()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo12647e() {
        if (C1050hj.m14443a(3)) {
            "moveto CREATED: " + this.f20099a;
        }
        C1018gh ghVar = this.f20099a;
        if (!ghVar.f18182S) {
            this.f20101c.mo12305a(ghVar, ghVar.f18189f, false);
            C1018gh ghVar2 = this.f20099a;
            Bundle bundle = ghVar2.f18189f;
            ghVar2.f18207x.noteStateNotSaved();
            ghVar2.f18188e = 1;
            ghVar2.f18172I = false;
            ghVar2.f18186W.mo2255a(bundle);
            ghVar2.onCreate(bundle);
            ghVar2.f18182S = true;
            if (ghVar2.f18172I) {
                ghVar2.f18184U.mo1023a(C0005ad.ON_CREATE);
                C1037gy gyVar = this.f20101c;
                C1018gh ghVar3 = this.f20099a;
                gyVar.mo12308b(ghVar3, ghVar3.f18189f, false);
                return;
            }
            throw new C1126kb("Fragment " + ghVar2 + " did not call through to super.onCreate()");
        }
        ghVar.mo11816b(ghVar.f18189f);
        this.f20099a.f18188e = 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo12648f() {
        String str;
        if (!this.f20099a.f18200q) {
            if (C1050hj.m14443a(3)) {
                "moveto CREATE_VIEW: " + this.f20099a;
            }
            C1018gh ghVar = this.f20099a;
            ViewGroup viewGroup = ghVar.f18173J;
            if (viewGroup == null) {
                int i = ghVar.f18164A;
                if (i == 0) {
                    viewGroup = null;
                } else if (i != -1) {
                    viewGroup = (ViewGroup) ghVar.f18205v.f19861l.mo11664a(i);
                    if (viewGroup == null) {
                        C1018gh ghVar2 = this.f20099a;
                        if (!ghVar2.f18202s) {
                            try {
                                str = ghVar2.getResources().getResourceName(this.f20099a.f18164A);
                            } catch (Resources.NotFoundException e) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f20099a.f18164A) + " (" + str + ") for fragment " + this.f20099a);
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f20099a + " for a container view with no id");
                }
            }
            C1018gh ghVar3 = this.f20099a;
            ghVar3.f18173J = viewGroup;
            ghVar3.mo11578a(ghVar3.mo11810a(ghVar3.f18189f), viewGroup, this.f20099a.f18189f);
            View view = this.f20099a.f18174K;
            if (view != null) {
                boolean z = false;
                view.setSaveFromParentEnabled(false);
                C1018gh ghVar4 = this.f20099a;
                ghVar4.f18174K.setTag(C0126R.C0129id.fragment_container_view_tag, ghVar4);
                if (viewGroup != null) {
                    viewGroup.addView(this.f20099a.f18174K);
                }
                C1018gh ghVar5 = this.f20099a;
                if (ghVar5.f18166C) {
                    ghVar5.f18174K.setVisibility(8);
                }
                C1280ps.m19937s(this.f20099a.f18174K);
                C1018gh ghVar6 = this.f20099a;
                ghVar6.onViewCreated(ghVar6.f18174K, ghVar6.f18189f);
                C1037gy gyVar = this.f20101c;
                C1018gh ghVar7 = this.f20099a;
                gyVar.mo12306a(ghVar7, ghVar7.f18174K, ghVar7.f18189f, false);
                C1018gh ghVar8 = this.f20099a;
                if (ghVar8.f18174K.getVisibility() == 0 && this.f20099a.f18173J != null) {
                    z = true;
                }
                ghVar8.f18178O = z;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo12649g() {
        if (C1050hj.m14443a(3)) {
            "moveto ACTIVITY_CREATED: " + this.f20099a;
        }
        C1018gh ghVar = this.f20099a;
        Bundle bundle = ghVar.f18189f;
        ghVar.f18207x.noteStateNotSaved();
        ghVar.f18188e = 2;
        ghVar.f18172I = false;
        ghVar.onActivityCreated(bundle);
        if (ghVar.f18172I) {
            ghVar.f18207x.mo12559i();
            C1037gy gyVar = this.f20101c;
            C1018gh ghVar2 = this.f20099a;
            gyVar.mo12310c(ghVar2, ghVar2.f18189f, false);
            return;
        }
        throw new C1126kb("Fragment " + ghVar + " did not call through to super.onActivityCreated()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo12650h() {
        if (C1050hj.m14443a(3)) {
            "moveto RESTORE_VIEW_STATE: " + this.f20099a;
        }
        C1018gh ghVar = this.f20099a;
        View view = ghVar.f18174K;
        if (view != null) {
            Bundle bundle = ghVar.f18189f;
            SparseArray sparseArray = ghVar.f18190g;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                ghVar.f18190g = null;
            }
            ghVar.f18172I = false;
            ghVar.onViewStateRestored(bundle);
            if (!ghVar.f18172I) {
                throw new C1126kb("Fragment " + ghVar + " did not call through to super.onViewStateRestored()");
            } else if (ghVar.f18174K != null) {
                ghVar.f18185V.mo13077a(C0005ad.ON_CREATE);
            }
        }
        this.f20099a.f18189f = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo12651i() {
        if (C1050hj.m14443a(3)) {
            "moveto STARTED: " + this.f20099a;
        }
        C1018gh ghVar = this.f20099a;
        ghVar.f18207x.noteStateNotSaved();
        ghVar.f18207x.mo12535a(true);
        ghVar.f18188e = 4;
        ghVar.f18172I = false;
        ghVar.onStart();
        if (ghVar.f18172I) {
            ghVar.f18184U.mo1023a(C0005ad.ON_START);
            if (ghVar.f18174K != null) {
                ghVar.f18185V.mo13077a(C0005ad.ON_START);
            }
            ghVar.f18207x.mo12561j();
            this.f20101c.mo12311c(this.f20099a, false);
            return;
        }
        throw new C1126kb("Fragment " + ghVar + " did not call through to super.onStart()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo12652j() {
        if (C1050hj.m14443a(3)) {
            "moveto RESUMED: " + this.f20099a;
        }
        C1018gh ghVar = this.f20099a;
        ghVar.f18207x.noteStateNotSaved();
        ghVar.f18207x.mo12535a(true);
        ghVar.f18188e = 6;
        ghVar.f18172I = false;
        ghVar.onResume();
        if (ghVar.f18172I) {
            ghVar.f18184U.mo1023a(C0005ad.ON_RESUME);
            if (ghVar.f18174K != null) {
                ghVar.f18185V.mo13077a(C0005ad.ON_RESUME);
            }
            ghVar.f18207x.mo12563k();
            this.f20101c.mo12313d(this.f20099a, false);
            C1018gh ghVar2 = this.f20099a;
            ghVar2.f18189f = null;
            ghVar2.f18190g = null;
            return;
        }
        throw new C1126kb("Fragment " + ghVar + " did not call through to super.onResume()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo12653k() {
        if (C1050hj.m14443a(3)) {
            "movefrom RESUMED: " + this.f20099a;
        }
        C1018gh ghVar = this.f20099a;
        ghVar.f18207x.mo12565l();
        if (ghVar.f18174K != null) {
            ghVar.f18185V.mo13077a(C0005ad.ON_PAUSE);
        }
        ghVar.f18184U.mo1023a(C0005ad.ON_PAUSE);
        ghVar.f18188e = 5;
        ghVar.f18172I = false;
        ghVar.onPause();
        if (ghVar.f18172I) {
            this.f20101c.mo12314e(this.f20099a, false);
            return;
        }
        throw new C1126kb("Fragment " + ghVar + " did not call through to super.onPause()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo12654l() {
        if (C1050hj.m14443a(3)) {
            "movefrom STARTED: " + this.f20099a;
        }
        C1018gh ghVar = this.f20099a;
        ghVar.f18207x.mo12567m();
        if (ghVar.f18174K != null) {
            ghVar.f18185V.mo13077a(C0005ad.ON_STOP);
        }
        ghVar.f18184U.mo1023a(C0005ad.ON_STOP);
        ghVar.f18188e = 3;
        ghVar.f18172I = false;
        ghVar.onStop();
        if (ghVar.f18172I) {
            this.f20101c.mo12315f(this.f20099a, false);
            return;
        }
        throw new C1126kb("Fragment " + ghVar + " did not call through to super.onStop()");
    }

    /* renamed from: m */
    public final Bundle mo12655m() {
        Bundle bundle = new Bundle();
        C1018gh ghVar = this.f20099a;
        ghVar.onSaveInstanceState(bundle);
        ghVar.f18186W.mo2256b(bundle);
        Parcelable g = ghVar.f18207x.mo12555g();
        if (g != null) {
            bundle.putParcelable("android:support:fragments", g);
        }
        this.f20101c.mo12312d(this.f20099a, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f20099a.f18174K != null) {
            mo12656n();
        }
        if (this.f20099a.f18190g != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f20099a.f18190g);
        }
        if (!this.f20099a.f18176M) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f20099a.f18176M);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo12656n() {
        if (this.f20099a.f18174K != null) {
            SparseArray sparseArray = new SparseArray();
            this.f20099a.f18174K.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f20099a.f18190g = sparseArray;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo12657o() {
        this.f20099a.mo11820d();
        this.f20101c.mo12316g(this.f20099a, false);
        C1018gh ghVar = this.f20099a;
        ghVar.f18173J = null;
        ghVar.f18174K = null;
        ghVar.f18185V = null;
        ghVar.f18187X.mo2450b((Object) null);
        this.f20099a.f18201r = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo12658p() {
        boolean z;
        C1018gh c;
        if (C1050hj.m14443a(3)) {
            "movefrom CREATED: " + this.f20099a;
        }
        C1018gh ghVar = this.f20099a;
        boolean z2 = true;
        if (ghVar.f18199p) {
            z = !ghVar.mo11817b();
        } else {
            z = false;
        }
        if (z || this.f20102d.f20149c.mo12607b(this.f20099a)) {
            C1034gv gvVar = this.f20099a.f18206w;
            if (gvVar instanceof C0062bt) {
                z2 = this.f20102d.f20149c.f20008h;
            } else if (((Activity) gvVar.f19059c).isChangingConfigurations()) {
                z2 = false;
            }
            if (z || z2) {
                C1053hm hmVar = this.f20102d.f20149c;
                C1018gh ghVar2 = this.f20099a;
                if (C1050hj.m14443a(3)) {
                    "Clearing non-config state for " + ghVar2;
                }
                C1053hm hmVar2 = (C1053hm) hmVar.f20005e.get(ghVar2.f18192i);
                if (hmVar2 != null) {
                    hmVar2.mo3218f();
                    hmVar.f20005e.remove(ghVar2.f18192i);
                }
                C0061bs bsVar = (C0061bs) hmVar.f20006f.get(ghVar2.f18192i);
                if (bsVar != null) {
                    bsVar.mo3468a();
                    hmVar.f20006f.remove(ghVar2.f18192i);
                }
            }
            C1018gh ghVar3 = this.f20099a;
            ghVar3.f18207x.mo12568n();
            ghVar3.f18184U.mo1023a(C0005ad.ON_DESTROY);
            ghVar3.f18188e = 0;
            ghVar3.f18172I = false;
            ghVar3.f18182S = false;
            ghVar3.onDestroy();
            if (ghVar3.f18172I) {
                this.f20101c.mo12317h(this.f20099a, false);
                List b = this.f20102d.mo12666b();
                int size = b.size();
                for (int i = 0; i < size; i++) {
                    C1055ho hoVar = (C1055ho) b.get(i);
                    if (hoVar != null) {
                        C1018gh ghVar4 = hoVar.f20099a;
                        if (this.f20099a.f18192i.equals(ghVar4.f18195l)) {
                            ghVar4.f18194k = this.f20099a;
                            ghVar4.f18195l = null;
                        }
                    }
                }
                C1018gh ghVar5 = this.f20099a;
                String str = ghVar5.f18195l;
                if (str != null) {
                    ghVar5.f18194k = this.f20102d.mo12669c(str);
                }
                this.f20102d.mo12668b(this);
                return;
            }
            throw new C1126kb("Fragment " + ghVar3 + " did not call through to super.onDestroy()");
        }
        String str2 = this.f20099a.f18195l;
        if (!(str2 == null || (c = this.f20102d.mo12669c(str2)) == null || !c.f18168E)) {
            this.f20099a.f18194k = c;
        }
        this.f20099a.f18188e = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo12659q() {
        if (C1050hj.m14443a(3)) {
            "movefrom ATTACHED: " + this.f20099a;
        }
        C1018gh ghVar = this.f20099a;
        ghVar.f18188e = -1;
        ghVar.f18172I = false;
        ghVar.onDetach();
        ghVar.f18181R = null;
        if (ghVar.f18172I) {
            C1050hj hjVar = ghVar.f18207x;
            if (!hjVar.f19866q) {
                hjVar.mo12568n();
                ghVar.f18207x = new C1050hj();
            }
            this.f20101c.mo12318i(this.f20099a, false);
            C1018gh ghVar2 = this.f20099a;
            ghVar2.f18188e = -1;
            ghVar2.f18206w = null;
            ghVar2.f18208y = null;
            ghVar2.f18205v = null;
            if ((ghVar2.f18199p && !ghVar2.mo11817b()) || this.f20102d.f20149c.mo12607b(this.f20099a)) {
                if (C1050hj.m14443a(3)) {
                    "initState called for fragment: " + this.f20099a;
                }
                C1018gh ghVar3 = this.f20099a;
                ghVar3.mo11818bn();
                ghVar3.f18192i = UUID.randomUUID().toString();
                ghVar3.f18198o = false;
                ghVar3.f18199p = false;
                ghVar3.f18200q = false;
                ghVar3.f18201r = false;
                ghVar3.f18202s = false;
                ghVar3.f18204u = 0;
                ghVar3.f18205v = null;
                ghVar3.f18207x = new C1050hj();
                ghVar3.f18206w = null;
                ghVar3.f18209z = 0;
                ghVar3.f18164A = 0;
                ghVar3.f18165B = null;
                ghVar3.f18166C = false;
                ghVar3.f18167D = false;
                return;
            }
            return;
        }
        throw new C1126kb("Fragment " + ghVar + " did not call through to super.onDetach()");
    }

    public C1055ho(C1037gy gyVar, C1056hp hpVar, C1018gh ghVar, FragmentState fragmentState) {
        String str;
        this.f20101c = gyVar;
        this.f20102d = hpVar;
        this.f20099a = ghVar;
        ghVar.f18190g = null;
        ghVar.f18204u = 0;
        ghVar.f18201r = false;
        ghVar.f18198o = false;
        C1018gh ghVar2 = ghVar.f18194k;
        if (ghVar2 != null) {
            str = ghVar2.f18192i;
        } else {
            str = null;
        }
        ghVar.f18195l = str;
        ghVar.f18194k = null;
        Bundle bundle = fragmentState.f1022m;
        ghVar.f18189f = bundle == null ? new Bundle() : bundle;
    }

    public C1055ho(C1037gy gyVar, C1056hp hpVar, ClassLoader classLoader, C1033gu guVar, FragmentState fragmentState) {
        this.f20101c = gyVar;
        this.f20102d = hpVar;
        this.f20099a = guVar.mo12222c(classLoader, fragmentState.f1010a);
        Bundle bundle = fragmentState.f1019j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        this.f20099a.setArguments(fragmentState.f1019j);
        C1018gh ghVar = this.f20099a;
        ghVar.f18192i = fragmentState.f1011b;
        ghVar.f18200q = fragmentState.f1012c;
        ghVar.f18202s = true;
        ghVar.f18209z = fragmentState.f1013d;
        ghVar.f18164A = fragmentState.f1014e;
        ghVar.f18165B = fragmentState.f1015f;
        ghVar.f18168E = fragmentState.f1016g;
        ghVar.f18199p = fragmentState.f1017h;
        ghVar.f18167D = fragmentState.f1018i;
        ghVar.f18166C = fragmentState.f1020k;
        ghVar.f18183T = C0007ae.values()[fragmentState.f1021l];
        Bundle bundle2 = fragmentState.f1022m;
        if (bundle2 == null) {
            this.f20099a.f18189f = new Bundle();
        } else {
            this.f20099a.f18189f = bundle2;
        }
        if (C1050hj.m14443a(2)) {
            "Instantiated fragment " + this.f20099a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12643a(ClassLoader classLoader) {
        Bundle bundle = this.f20099a.f18189f;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            C1018gh ghVar = this.f20099a;
            ghVar.f18190g = ghVar.f18189f.getSparseParcelableArray("android:view_state");
            C1018gh ghVar2 = this.f20099a;
            ghVar2.f18195l = ghVar2.f18189f.getString("android:target_state");
            C1018gh ghVar3 = this.f20099a;
            if (ghVar3.f18195l != null) {
                ghVar3.f18196m = ghVar3.f18189f.getInt("android:target_req_state", 0);
            }
            C1018gh ghVar4 = this.f20099a;
            Boolean bool = ghVar4.f18191h;
            if (bool != null) {
                ghVar4.f18176M = bool.booleanValue();
                this.f20099a.f18191h = null;
            } else {
                ghVar4.f18176M = ghVar4.f18189f.getBoolean("android:user_visible_hint", true);
            }
            C1018gh ghVar5 = this.f20099a;
            if (!ghVar5.f18176M) {
                ghVar5.f18175L = true;
            }
        }
    }
}
