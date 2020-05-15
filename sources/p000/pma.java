package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: pma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pma {

    /* renamed from: a */
    public final qav f39647a = new qav("DiscoveryContext");

    /* renamed from: b */
    public final pnl f39648b;

    /* renamed from: c */
    public final Map f39649c;

    /* renamed from: d */
    public final plx f39650d;

    /* renamed from: e */
    public final pnh f39651e;

    /* renamed from: f */
    public Set f39652f;

    /* renamed from: g */
    public boolean f39653g;

    /* renamed from: h */
    public boolean f39654h;

    /* renamed from: i */
    final List f39655i = new ArrayList();

    /* renamed from: j */
    private final qat f39656j;

    /* renamed from: k */
    private final pmx f39657k;

    /* renamed from: l */
    private final Context f39658l;

    /* renamed from: m */
    private final phy f39659m;

    /* renamed from: n */
    private final poj f39660n;

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: a */
    public final void mo23397a(boolean z) {
        this.f39647a.mo23856a("screen state changed to %b", Boolean.valueOf(z));
        if (z) {
            mo23400c();
            mo23399b();
        } else {
            mo23400c();
        }
        mo23403f();
    }

    /* renamed from: a */
    public final boolean mo23398a() {
        return this.f39652f != null && this.f39653g && this.f39654h;
    }

    /* renamed from: b */
    public final void mo23399b() {
        List list = this.f39655i;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((plz) list.get(i)).mo23373a();
        }
    }

    /* renamed from: c */
    public final void mo23400c() {
        List list = this.f39655i;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((plz) list.get(i)).mo23374b();
        }
    }

    /* renamed from: d */
    public final void mo23401d() {
        List list = this.f39655i;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((plz) list.get(i)).mo23395e();
        }
    }

    /* renamed from: e */
    public final void mo23402e() {
        List list = this.f39655i;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((plz) list.get(i)).mo23396f();
        }
    }

    /* renamed from: f */
    public final void mo23403f() {
        List list = this.f39655i;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((plz) list.get(i)).mo23392c();
        }
    }

    public pma(Context context, pnl pnl, poj poj, pmx pmx, qat qat, phy phy) {
        this.f39658l = context;
        this.f39648b = pnl;
        this.f39660n = poj;
        this.f39657k = pmx;
        this.f39656j = qat;
        this.f39659m = phy;
        this.f39649c = new HashMap();
        this.f39651e = new pnh(this, this.f39658l, new pkj(), this.f39659m, this.f39660n, this.f39656j, this.f39648b, this.f39657k);
        this.f39650d = new plx(this, this.f39657k, this.f39656j);
        if (plj.f39590b) {
            new plj(this, this.f39656j);
        }
        if (ccxg.f180154a.mo6606a().mo76977e()) {
            new plu(this, this.f39657k);
        }
        if (pmj.f39696a) {
            new pmj(this, this.f39656j);
        }
    }
}
