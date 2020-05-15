package p000;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import com.android.volley.toolbox.ImageLoader;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* renamed from: bjgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bjgt implements View.OnFocusChangeListener, bjgx, bjkj {

    /* renamed from: DA */
    private final C1246ol f122675DA = new C1246ol();

    /* renamed from: a */
    protected final bjgv f122676a;

    /* renamed from: b */
    public bwxl f122677b;

    /* renamed from: c */
    public int f122678c = 0;

    /* renamed from: d */
    public final bjha f122679d;

    /* renamed from: e */
    public bjgx f122680e;

    /* renamed from: f */
    public final ArrayList f122681f = new ArrayList();

    /* renamed from: g */
    public View f122682g;

    /* renamed from: h */
    public boolean f122683h = true;

    /* renamed from: i */
    public ayws f122684i;

    /* renamed from: j */
    public final bjky f122685j = new bjky();

    /* renamed from: k */
    public final bjkk f122686k;

    /* renamed from: l */
    C1246ol f122687l;

    /* renamed from: n */
    private boolean f122688n = false;

    /* renamed from: o */
    private ayxa f122689o;

    /* renamed from: p */
    private View.OnClickListener f122690p;

    /* renamed from: q */
    private View.OnClickListener f122691q;

    protected bjgt(bjgv bjgv) {
        this.f122676a = bjgv;
        this.f122679d = mo65190u();
        this.f122686k = new bjkk(bjgv.f122692a.f122732i, bjgv.f122697f, this);
        bjgp bjgp = new bjgp(bjgv);
        this.f122675DA.mo15637a(bjgp.mo65222a(), bjgp);
    }

    /* renamed from: cD */
    private final void m103404cD() {
        mo65170b(false);
    }

    /* renamed from: cE */
    private final ayxa m103405cE() {
        if (this.f122689o == null) {
            this.f122689o = bjie.f122757a.mo65277a();
        }
        return this.f122689o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public int mo65154A() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo65155B() {
        View view = this.f122682g;
        if (view != null) {
            C1280ps.m19906b(view, mo65196z());
        }
        int i = Build.VERSION.SDK_INT;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo65156C() {
        int i;
        View view = this.f122682g;
        if (view != null) {
            view.setEnabled(mo65195y());
        }
        bjkk bjkk = this.f122686k;
        bwxu bwxu = bwxu.NODE_STATE_DISABLED;
        boolean z = !mo65195y();
        bjjz bjjz = bjkk.f122859d;
        if (!(bjjz == null || !bjjz.mo65319a(bwxu) || bjjo.m103696a(bjkk.f122860e, bwxu) == z)) {
            if (!z) {
                i = (bwxu.f161420g ^ -1) & bjkk.f122860e;
            } else {
                i = bwxu.f161420g | bjkk.f122860e;
            }
            bjkk.f122860e = i;
            bjkk.f122858c.mo65193x();
        }
        ArrayList arrayList = this.f122681f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((bjgt) arrayList.get(i2)).mo65156C();
        }
    }

    /* renamed from: D */
    public boolean mo65157D() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bjgt mo65158a(bwxl bwxl) {
        bjgv bjgv = this.f122676a;
        bjgt a = bjgv.f122694c.mo65206a(bjgv, bwxl);
        mo65160a(a);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65159a(Bitmap bitmap) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo65166b(View view) {
        bjkp.m103790a(this.f122686k, view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo65171b(int i) {
        return i != 3;
    }

    /* renamed from: f */
    public final boolean mo65172f() {
        return this.f122678c != 0;
    }

    /* renamed from: g */
    public final boolean mo65173g() {
        int i = this.f122678c;
        return i == 1 || i == 2;
    }

    /* renamed from: h */
    public final boolean mo65174h() {
        return this.f122678c == 2;
    }

    /* renamed from: i */
    public final boolean mo65175i() {
        return this.f122678c == 4;
    }

    /* renamed from: j */
    public final void mo65176j() {
        if (!mo65173g()) {
            mo65169b("Trying to present when not UP_TO_DATE.");
        }
        mo65184p();
        this.f122678c = 2;
    }

    /* renamed from: k */
    public final void mo65178k() {
        if (mo65174h()) {
            mo65179l();
        }
        bnre i = bngx.m109368a((Collection) this.f122681f).listIterator();
        while (i.hasNext()) {
            bjgt bjgt = (bjgt) i.next();
            bjgt.mo65178k();
            mo65167b(bjgt);
        }
        if (mo65172f()) {
            mo65186r();
        }
        this.f122678c = 4;
    }

    /* renamed from: l */
    public final void mo65179l() {
        if (mo65174h()) {
            mo65185q();
            this.f122678c = 1;
        }
    }

    /* renamed from: m */
    public final void mo65180m() {
        if (mo65174h()) {
            mo65179l();
        }
        if (mo65172f() && !mo65175i()) {
            mo65186r();
        }
        mo65187s();
        this.f122678c = 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public boolean mo65181n() {
        View view = this.f122682g;
        return view != null && view.isFocusable() && this.f122683h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo65182o() {
        View view = this.f122682g;
        if (view != null) {
            return view.requestFocus();
        }
        return false;
    }

    public final void onFocusChange(View view, boolean z) {
        mo65168b(bwxo.f161396c, !z ? 3 : 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo65184p() {
        ArrayList arrayList = this.f122681f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bjgt) arrayList.get(i)).mo65176j();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo65185q() {
        ArrayList arrayList = this.f122681f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bjgt) arrayList.get(i)).mo65179l();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo65186r() {
        C1246ol olVar = this.f122687l;
        if (olVar != null) {
            int c = olVar.mo15640c();
            for (int i = 0; i < c; i++) {
                ((ImageLoader.ImageContainer) this.f122687l.mo15641c(i)).cancelRequest();
            }
            this.f122687l.mo15644d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo65187s() {
        mo65191v();
        bjky bjky = this.f122685j;
        bjky.mo65351a();
        bjky.f122912c.clear();
        bjkk bjkk = this.f122686k;
        bjjz bjjz = bjkk.f122859d;
        if (bjjz != null) {
            bjkk.f122856a.mo65334a(bjjz);
        }
        this.f122676a.f122694c.mo65207a(this);
    }

    /* renamed from: t */
    public final long mo65188t() {
        bwxl bwxl = this.f122677b;
        if (bwxl != null) {
            return bwxl.f161386b;
        }
        return -1;
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        boolean z = this.f122683h;
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 16);
        sb.append("[ C: ");
        sb.append(simpleName);
        sb.append(" V: ");
        sb.append(z);
        sb.append(" ]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public bjha mo65190u() {
        return new bjha(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo65191v() {
        ArrayList arrayList = this.f122681f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bjgt bjgt = (bjgt) arrayList.get(i);
            bjgt.mo65180m();
            this.f122679d.mo65217a(bjgt.f122679d);
        }
        this.f122681f.clear();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [ayxi, android.view.View$OnAttachStateChangeListener], assign insn: 0x0025: IGET  (r2v4 ? I:ayxi) = (r0v10 aywp) aywp.b ayxi */
    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo65192w() {
        if (this.f122682g != null) {
            if ((this.f122677b.f161385a & 32) != 0) {
                this.f122685j.mo65357b(this.f122691q);
                this.f122691q = null;
                m103405cE();
                View view = this.f122682g;
                beel.m91855b();
                aywp a = ayww.m85000a(view);
                bmxy.m108581a(a);
                ? r2 = a.f98637b;
                ayww ayww = (ayww) r2;
                if (ayww.f98661c.mo54512a()) {
                    ayww.f98659a.removeOnAttachStateChangeListener(r2);
                    if (C1280ps.m19871F(ayww.f98659a)) {
                        ayww.onViewDetachedFromWindow(ayww.f98659a);
                    }
                }
                aywp aywp = ayww.f98662d;
                if (aywp != null) {
                    aywp.f98637b.mo54490a(ayww.f98660b);
                }
                List list = ayww.f98663e;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        aywp aywp2 = (aywp) list.get(i);
                        if (ayww.f98664f) {
                            aywp2.f98637b.mo54495e();
                        }
                        aywp2.f98637b.mo54492b();
                    }
                    ayww.f98663e.clear();
                    ayww.f98663e = null;
                }
                ayww.f98667i = null;
                ayww.f98659a.setTag(C0126R.C0129id.ve_tag, null);
                bmxy.m108600b(!((ayww) a.f98637b).f98665g);
                a.f98637b = null;
            }
            this.f122685j.mo65358b(this.f122682g);
            bjha bjha = this.f122679d;
            View view2 = this.f122682g;
            if (bjha.f122713b.isEmpty() || bjha.mo65218a()) {
                bjha.f122712a.mo65216a(view2);
                bjha.mo65213a(-1);
                this.f122682g = null;
                return;
            }
            throw new IllegalStateException("Views can only be removed from leaf or subRoot PresenterNodeHelpers");
        }
        throw new IllegalStateException("No view to remove");
    }

    /* renamed from: x */
    public void mo65193x() {
        View view = this.f122682g;
        if (view != null) {
            mo65166b(view);
        }
        this.f122686k.mo65340c();
    }

    /* renamed from: y */
    public boolean mo65195y() {
        bjgx bjgx = this.f122680e;
        return bjgx == null || bjgx.mo65195y();
    }

    /* renamed from: z */
    public final int mo65196z() {
        int i;
        int A = mo65154A();
        bwxl bwxl = this.f122677b;
        if (bwxl == null) {
            i = 1;
        } else if ((bwxl.f161385a & 64) != 0) {
            bwwr bwwr = bwxl.f161392h;
            if (bwwr == null) {
                bwwr = bwwr.f161286b;
            }
            i = bwwt.m122380a(bwwr.f161288a);
            if (i == 0) {
                i = 1;
            }
        } else {
            i = 1;
        }
        int i2 = i - 1;
        int i3 = Build.VERSION.SDK_INT;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            return 2;
        } else {
            if (i2 != 2) {
                return A;
            }
            return 4;
        }
    }

    /* renamed from: b */
    public final void mo65167b(bjgt bjgt) {
        this.f122681f.remove(bjgt);
        bjgt.mo65161a((bjgx) null);
        this.f122679d.mo65217a(bjgt.f122679d);
    }

    /* renamed from: a */
    public final void mo65160a(bjgt bjgt) {
        int size = this.f122681f.size();
        this.f122681f.add(size, bjgt);
        bjgt.mo65161a((bjgx) this);
        this.f122679d.mo65215a(size, bjgt.f122679d);
        if (mo65174h()) {
            bjgt.mo65176j();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo65177j(View view) {
        int i;
        if (this.f122682g == null) {
            this.f122686k.mo65337a();
            this.f122682g = view;
            bjha bjha = this.f122679d;
            if (!bjha.f122713b.isEmpty() && !bjha.mo65218a()) {
                throw new IllegalStateException("Views can only be added to leaf or subRoot PresenterNodeHelpers");
            }
            bjha.f122712a.mo65214a(bjha.f122715d, this, view);
            bjha.mo65213a(1);
            mo65166b(view);
            this.f122686k.mo65339b();
            if (!this.f122683h) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
            mo65156C();
            mo65155B();
            this.f122685j.mo65355a(view);
            bwxl bwxl = this.f122677b;
            if ((bwxl.f161385a & 32) != 0) {
                bxbb bxbb = bwxl.f161391g;
                if (bxbb == null) {
                    bxbb = bxbb.f161772d;
                }
                bxvd da = bpss.f139006d.mo74144da();
                bxvd da2 = bpsq.f138998c.mo74144da();
                long t = mo65188t();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpsq bpsq = (bpsq) da2.f164949b;
                bpsq.f139000a |= 1;
                bpsq.f139001b = t;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpss bpss = (bpss) da.f164949b;
                bpsq bpsq2 = (bpsq) da2.mo74062i();
                bpsq2.getClass();
                bpss.f139011c = bpsq2;
                bpss.f139009a |= 2;
                aywj a = m103405cE().mo54505a(view, bxbb.f161774a);
                a.mo54480a(aywm.m84989a(bpst.f139012a, (bpss) da.mo74062i()));
                a.mo54478a();
                if (new bxvv(bxbb.f161775b, bxbb.f161771c).contains(bqbo.TAP)) {
                    bjgr bjgr = new bjgr(this, view);
                    this.f122691q = bjgr;
                    this.f122685j.mo65353a(bjgr, true);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Node view has already been set");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo65194x(String str) {
        if (this.f122687l == null) {
            this.f122687l = new C1246ol(1);
        }
        if (this.f122687l.mo15645e(-1)) {
            ((ImageLoader.ImageContainer) this.f122687l.mo15646f(-1)).cancelRequest();
            this.f122687l.mo15636a(-1);
        }
        this.f122687l.mo15637a(-1, this.f122676a.f122692a.f122728e.get(str, new bjgs(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo65168b(bxuq bxuq, int i) {
        bjhg bjhg = (bjhg) this.f122675DA.mo15646f(bxuq.mo73900a());
        if (bjhg != null) {
            bjhg.mo65224b(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65161a(bjgx bjgx) {
        this.f122680e = bjgx;
        if (bjgx != null) {
            m103404cD();
            mo65156C();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65162a(bwxl bwxl, bwxl bwxl2) {
        bjkk bjkk = this.f122686k;
        bwxs bwxs = bwxl2.f161387c;
        if (bwxs == null) {
            bwxs = bwxs.f161407d;
        }
        bjjz bjjz = bjkk.f122859d;
        if (bjjz != null) {
            bjkk.f122856a.mo65334a(bjjz);
        }
        bjkb bjkb = bjkk.f122856a;
        bjjz a = bjkb.mo65333a(bwxs);
        bjkb.f122851c.add(a);
        bjkk.f122859d = a;
        if (bwxl != null) {
            bjhg.m103485a(this.f122675DA);
            this.f122685j.mo65351a();
        }
        bjhg.m103486a(this.f122675DA, bwxl2.f161389e);
        if (mo65165a(bwxo.f161396c, 1)) {
            bjgq bjgq = new bjgq(this);
            this.f122690p = bjgq;
            this.f122685j.mo65352a(bjgq);
        } else {
            this.f122685j.mo65357b(this.f122690p);
            this.f122690p = null;
        }
        if (mo65165a(bwxo.f161396c, 2) || mo65165a(bwxo.f161396c, 3)) {
            this.f122685j.mo65354a(this);
            return;
        }
        bjkw bjkw = this.f122685j.f122910a;
        if (bjkw != null) {
            bjkw.mo65349a(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo65169b(String str) {
        throw new IllegalStateException(String.format(Locale.US, "reference: %d, err: %s", Long.valueOf(mo65188t()), str));
    }

    /* renamed from: b */
    public final void mo65170b(boolean z) {
        View view;
        int i;
        boolean z2 = this.f122688n;
        boolean z3 = !z2;
        if (z3 != this.f122683h || z) {
            this.f122683h = z3;
            if (mo65173g() && (view = this.f122682g) != null) {
                if (!z2) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo65163a(boolean z) {
        if (this.f122688n != z) {
            this.f122688n = z;
            m103404cD();
        }
    }

    /* renamed from: a */
    public final boolean mo65164a(int i) {
        ArrayList arrayList = this.f122681f;
        int size = arrayList.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            int i3 = i2 + 1;
            if (((bjgt) arrayList.get(i2)).mo65164a(i)) {
                z = true;
                break;
            }
            i2 = i3;
        }
        return (z || !mo65181n() || !mo65171b(i)) ? z : mo65182o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo65165a(bxuq bxuq, int i) {
        return this.f122675DA.mo15645e(bxuq.mo73900a()) && ((bjhg) this.f122675DA.mo15646f(bxuq.mo73900a())).mo65223a(i);
    }
}
