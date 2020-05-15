package p000;

import android.content.Context;
import android.support.p002v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;

/* renamed from: svi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class svi extends abh implements sug, suf {

    /* renamed from: a */
    public final svf f45221a;

    /* renamed from: d */
    private final Context f45222d;

    /* renamed from: e */
    private final ArrayList f45223e;

    /* renamed from: f */
    private final SparseArray f45224f;

    /* renamed from: g */
    private final svo f45225g;

    public svi(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final int mo161a() {
        if (this.f45223e.isEmpty()) {
            return this.f45221a.mo26154g().size();
        }
        ArrayList arrayList = this.f45223e;
        svg svg = (svg) arrayList.get(arrayList.size() - 1);
        return svg.f45216a + svg.mo26155a();
    }

    /* renamed from: b */
    public final void mo26091b(int i) {
        mo26156a((sue) this.f45221a.mo26154g().get(i));
        mo26158c();
        mo159N(i);
        if (i > 0) {
            mo158M(i - 1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo26158c() {
        int size = this.f45221a.mo26154g().size();
        int size2 = this.f45223e.size();
        for (int i = 0; i < size2; i++) {
            svg svg = (svg) this.f45223e.get(i);
            svg.f45216a = size;
            size += svg.mo26155a();
        }
    }

    /* renamed from: d */
    public final void mo26093d(int i) {
        if (i > 0) {
            mo180h(i - 1, 2);
        } else {
            mo158M(0);
        }
    }

    /* renamed from: e */
    public final svf mo26098e(int i) {
        return mo26094a(this.f45222d.getText(i), i);
    }

    /* renamed from: f */
    public final svf mo26099f(int i) {
        int size = this.f45223e.size();
        for (int i2 = 0; i2 < size; i2++) {
            svf svf = ((svg) this.f45223e.get(i2)).f45218c;
            if (svf.f45210e == i) {
                return svf;
            }
        }
        svf svf2 = this.f45221a;
        if (svf2.f45210e != i) {
            return null;
        }
        return svf2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final svc mo26159g(int i) {
        svh svh;
        if (i >= this.f45221a.mo26154g().size()) {
            int size = this.f45223e.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    svh = null;
                    break;
                }
                svg svg = (svg) this.f45223e.get(i2);
                if (i >= svg.f45216a + svg.mo26155a()) {
                    i2++;
                } else {
                    int i3 = svg.f45216a;
                    svh = i == i3 ? new svh(i2, -1) : new svh(i2, i - (i3 + 1));
                }
            }
        } else {
            svh = new svh(-1, i);
        }
        if (svh == null) {
            return null;
        }
        int i4 = svh.f45219a;
        if (i4 < 0) {
            return (svk) this.f45221a.mo26154g().get(svh.f45220b);
        }
        svf svf = ((svg) this.f45223e.get(i4)).f45218c;
        return svh.f45220b >= 0 ? (svk) svf.mo26154g().get(svh.f45220b) : svf;
    }

    public svi(Context context, byte[] bArr) {
        this.f45222d = context;
        this.f45221a = new svf(null);
        this.f45223e = new ArrayList();
        this.f45221a.f45215b = this;
        this.f45224f = new SparseArray();
        this.f45225g = new svo(context);
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        return mo26159g(i).mo23821a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        svb svb = (svb) this.f45224f.get(i);
        if (svb != null) {
            return svb.mo23820a(viewGroup, i);
        }
        StringBuilder sb = new StringBuilder(35);
        sb.append("No factory for viewType ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    public final void mo26092c(int i) {
        mo26158c();
        mo160O(i);
        if (i > 0) {
            mo158M(i - 1);
        }
    }

    /* renamed from: a */
    public final svf mo26094a(CharSequence charSequence, int i) {
        int i2;
        svf svf = new svf(charSequence);
        svf.f45210e = i;
        if (this.f45223e.isEmpty()) {
            i2 = this.f45221a.mo26154g().size();
        } else {
            ArrayList arrayList = this.f45223e;
            svg svg = (svg) arrayList.get(arrayList.size() - 1);
            i2 = svg.mo26155a() + svg.f45216a;
        }
        this.f45223e.add(new svg(this, svf, i2));
        mo26157a((svc) svf);
        return svf;
    }

    /* renamed from: a */
    public final void mo26090a(int i, int i2) {
        mo173b(i, i2);
        if (i >= i2) {
            mo158M(i);
            if (i2 > 0) {
                mo158M(i2 - 1);
                return;
            }
            return;
        }
        if (i > 0) {
            mo158M(i - 1);
        }
        mo158M(i2 - 1);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo168a(acm acm, int i) {
        sva sva = (sva) acm;
        svc g = mo26159g(i);
        sva.mo23819a(g);
        boolean z = true;
        svc g2 = mo26159g(i + 1);
        if (g == null) {
            z = false;
        } else if (g2 == null || !g.mo26146f() || !g2.mo26146f()) {
            z = false;
        }
        sva.f45208s = z;
    }

    /* renamed from: a */
    public final void mo26095a(RecyclerView recyclerView) {
        recyclerView.getContext();
        recyclerView.setLayoutManager(new aah());
        recyclerView.addItemDecoration(this.f45225g);
        recyclerView.setAdapter(this);
    }

    /* renamed from: a */
    public final void mo26096a(Window window) {
        mo26095a((RecyclerView) window.findViewById(16908298));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo26156a(sue sue) {
        mo26157a((svc) sue);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo26157a(svc svc) {
        int a = svc.mo23821a();
        if (this.f45224f.indexOfKey(a) < 0) {
            this.f45224f.put(a, svc.mo23822b());
        }
    }

    /* renamed from: a */
    public final void mo26097a(svf svf) {
        ArrayList arrayList = this.f45223e;
        int size = arrayList.size();
        svg svg = null;
        for (int i = 0; i < size; i++) {
            svg svg2 = (svg) arrayList.get(i);
            if (svg2.f45218c.equals(svf)) {
                svg = svg2;
            } else if (svg != null) {
                svg2.f45216a -= svg.mo26155a();
            }
        }
        if (svg != null) {
            this.f45223e.remove(svg);
            mo178d(svg.f45216a, svg.mo26155a());
        }
    }
}
