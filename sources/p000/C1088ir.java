package p000;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;

/* renamed from: ir */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1088ir extends C0034at implements C1139kn {

    /* renamed from: a */
    public final int f21591a;

    /* renamed from: g */
    public final Bundle f21592g;

    /* renamed from: h */
    public final C1140ko f21593h;

    /* renamed from: i */
    public C1089is f21594i;

    /* renamed from: j */
    private C0013ak f21595j;

    /* renamed from: k */
    private C1140ko f21596k;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1140ko mo13289a(C0013ak akVar, C1085ip ipVar) {
        C1089is isVar = new C1089is(this.f21593h, ipVar);
        mo2445a(akVar, isVar);
        C1089is isVar2 = this.f21594i;
        if (isVar2 != null) {
            mo2449b((C0038ax) isVar2);
        }
        this.f21595j = akVar;
        this.f21594i = isVar;
        return this.f21593h;
    }

    /* renamed from: b */
    public final void mo2449b(C0038ax axVar) {
        super.mo2449b(axVar);
        this.f21595j = null;
        this.f21594i = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo2451c() {
        if (C1092iv.m16194c(2)) {
            "  Stopping: " + this;
        }
        this.f21593h.stopLoading();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo13291e() {
        C0013ak akVar = this.f21595j;
        C1089is isVar = this.f21594i;
        if (akVar != null && isVar != null) {
            super.mo2449b((C0038ax) isVar);
            mo2445a(akVar, isVar);
        }
    }

    public final void onLoadComplete(C1140ko koVar, Object obj) {
        if (C1092iv.m16194c(2)) {
            "onLoadComplete: " + this;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            mo2450b(obj);
            return;
        }
        if (C1092iv.m16194c(4)) {
            Log.i("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
        }
        mo2453l(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.f21591a);
        sb.append(" : ");
        sb.append(this.f21593h.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.f21593h)));
        sb.append("}}");
        return sb.toString();
    }

    public C1088ir(int i, Bundle bundle, C1140ko koVar, C1140ko koVar2) {
        this.f21591a = i;
        this.f21592g = bundle;
        this.f21593h = koVar;
        this.f21596k = koVar2;
        koVar.registerListener(i, this);
    }

    /* renamed from: b */
    public final void mo2450b(Object obj) {
        super.mo2450b(obj);
        C1140ko koVar = this.f21596k;
        if (koVar != null) {
            koVar.reset();
            this.f21596k = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1140ko mo13290a(boolean z) {
        if (C1092iv.m16194c(3)) {
            "  Destroying: " + this;
        }
        this.f21593h.cancelLoad();
        this.f21593h.abandon();
        C1089is isVar = this.f21594i;
        if (isVar != null) {
            mo2449b((C0038ax) isVar);
            if (z && isVar.f21607c) {
                if (C1092iv.m16194c(2)) {
                    "  Resetting: " + isVar.f21605a;
                }
                isVar.f21606b.mo8607a(isVar.f21605a);
            }
        }
        this.f21593h.unregisterListener(this);
        if ((isVar == null || isVar.f21607c) && !z) {
            return this.f21593h;
        }
        this.f21593h.reset();
        return this.f21596k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo2443a() {
        if (C1092iv.m16194c(2)) {
            "  Starting: " + this;
        }
        this.f21593h.startLoading();
    }
}
