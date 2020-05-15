package p000;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.wallet.p097ui.common.FormEditText;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: bkip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkip implements TextView.OnEditorActionListener, Runnable, bkdb, bker {

    /* renamed from: A */
    private boolean f124290A = false;

    /* renamed from: B */
    private bkio f124291B;

    /* renamed from: a */
    public boolean f124292a;

    /* renamed from: b */
    final ArrayList f124293b = new ArrayList();

    /* renamed from: c */
    public boolean f124294c = false;

    /* renamed from: d */
    boolean f124295d;

    /* renamed from: e */
    boolean f124296e;

    /* renamed from: f */
    public boolean f124297f;

    /* renamed from: g */
    public boolean f124298g = true;

    /* renamed from: h */
    public boolean f124299h = true;

    /* renamed from: i */
    public boolean f124300i;

    /* renamed from: j */
    Runnable f124301j;

    /* renamed from: k */
    Activity f124302k;

    /* renamed from: l */
    bkip f124303l;

    /* renamed from: m */
    public boolean f124304m = false;

    /* renamed from: n */
    public bkii f124305n;

    /* renamed from: o */
    public final HashSet f124306o = new HashSet();

    /* renamed from: p */
    public final List f124307p = new ArrayList();

    /* renamed from: q */
    int f124308q = 0;

    /* renamed from: r */
    public bkip f124309r = this;

    /* renamed from: s */
    public FormEditText f124310s;

    /* renamed from: t */
    public bkin f124311t;

    /* renamed from: u */
    private bkip f124312u;

    /* renamed from: v */
    private atj f124313v;

    /* renamed from: w */
    private int f124314w = 0;

    /* renamed from: x */
    private atn f124315x;

    /* renamed from: y */
    private asw f124316y;

    /* renamed from: z */
    private bjtd f124317z;

    /* renamed from: A */
    private final bkip m105796A() {
        bkip bkip = this.f124303l;
        return bkip != null ? bkip.m105796A() : this;
    }

    /* renamed from: B */
    private final void m105797B() {
        if (!((Boolean) bjwe.f123466A.mo54082a()).booleanValue()) {
            m105799D();
            return;
        }
        bkip A = m105796A();
        if (this.f124309r.f124300i) {
            A.getClass();
            this.f124301j = new bkik(A);
            return;
        }
        A.mo66053l();
    }

    /* renamed from: C */
    private final void m105798C() {
        if (!((Boolean) bjwe.f123466A.mo54082a()).booleanValue()) {
            m105800E();
            return;
        }
        bkip A = m105796A();
        if (this.f124309r.f124300i) {
            A.getClass();
            this.f124301j = new bkil(A);
            return;
        }
        A.mo66054m();
    }

    /* renamed from: D */
    private final boolean m105799D() {
        boolean z = true;
        if (!this.f124309r.f124299h) {
            return true;
        }
        bkip bkip = this.f124303l;
        if (bkip != null) {
            return bkip.m105799D();
        }
        int size = this.f124293b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            }
            bkip bkip2 = (bkip) this.f124293b.get(i);
            if (bkip2.f124294c && bkip2.m105799D()) {
                break;
            }
            i++;
        }
        return m105813k(z);
    }

    /* renamed from: E */
    private final void m105800E() {
        if (this.f124309r.f124299h) {
            bkip bkip = this.f124303l;
            if (bkip == null) {
                bkde.m105350c(this.f124307p);
            } else {
                bkip.m105800E();
            }
        }
    }

    /* renamed from: F */
    private final bkip m105801F() {
        if (bkde.m105360m(this.f124307p)) {
            return this;
        }
        ArrayList arrayList = this.f124293b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            bkip F = ((bkip) arrayList.get(i)).m105801F();
            i++;
            if (F != null) {
                return F;
            }
        }
        return null;
    }

    /* renamed from: G */
    private final bkip m105802G() {
        return m105808b(this.f124293b.indexOf(this.f124303l) + 1);
    }

    /* renamed from: H */
    private final bkip m105803H() {
        return (!bkde.m105348a(this.f124307p, null, false) || bkde.m105360m(this.f124307p)) ? this : m105808b(0);
    }

    /* renamed from: I */
    private final boolean m105804I() {
        return m105803H() != null;
    }

    /* renamed from: J */
    private final boolean m105805J() {
        int size = this.f124293b.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            z = ((bkip) this.f124293b.get(i)).m105805J() || z;
        }
        if (!bkde.m105360m(this.f124307p) && !z) {
            return false;
        }
        mo66044f(true);
        m105819u();
        return true;
    }

    /* renamed from: K */
    private final void m105806K() {
        bkip H = m105803H();
        if (H != null) {
            mo66044f(true);
            if (H != this) {
                this.f124303l = H;
                H.m105806K();
                return;
            }
            m105819u();
        }
    }

    /* renamed from: L */
    private final void m105807L() {
        for (bkip bkip = this; bkip != null; bkip = bkip.f124312u) {
            bkip.mo66044f(true);
        }
        this.f124309r.mo66051j();
    }

    /* renamed from: b */
    private final bkip m105808b(int i) {
        for (int i2 = i; i2 < this.f124293b.size(); i2++) {
            if (((bkip) this.f124293b.get(i2)).m105804I()) {
                return (bkip) this.f124293b.get(i2);
            }
        }
        if (this.f124312u != null) {
            return null;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (((bkip) this.f124293b.get(i3)).m105804I()) {
                return (bkip) this.f124293b.get(i3);
            }
        }
        return null;
    }

    /* renamed from: c */
    private static void m105810c(bkip bkip) {
        bkip.f124308q = 0;
        int size = bkip.f124293b.size();
        for (int i = 0; i < size; i++) {
            m105810c((bkip) bkip.f124293b.get(i));
        }
    }

    /* renamed from: i */
    private final void m105811i(boolean z) {
        bjtd bjtd;
        switch (this.f124314w) {
            case 0:
                break;
            case 1:
            case 7:
                m105820v();
                break;
            case 2:
                m105812j(false);
                break;
            case 3:
                bkip bkip = this.f124303l;
                if (bkip != null) {
                    bkip.m105812j(false);
                }
                if (!bjvn.m104723d(this.f124302k)) {
                    bkip G = m105802G();
                    if (G != null) {
                        mo66044f(true);
                        G.m105806K();
                    }
                    if (((Boolean) bjwe.f123471F.mo54082a()).booleanValue()) {
                        this.f124303l = G;
                    } else if (G != null) {
                        this.f124303l = G;
                    }
                    if (G == null && !((Boolean) bjwe.f123471F.mo54082a()).booleanValue()) {
                        m105821w();
                        break;
                    }
                }
                break;
            case 4:
            case 5:
            case 6:
                m105818t();
                if (!bjvn.m104723d(this.f124302k)) {
                    m105820v();
                    break;
                }
                break;
            default:
                m105806K();
                break;
        }
        if (!z || ((bjtd = this.f124317z) != null && bjtd.mo65521a(bmap.DISABLE_ANIMATIONS))) {
            run();
            mo66052k();
            mo66048h(false);
        } else if (!this.f124309r.f124296e) {
            mo66052k();
            mo66048h(true);
        } else {
            this.f124313v.mo2488a(this.f124316y);
        }
    }

    /* renamed from: j */
    private final boolean m105812j(boolean z) {
        boolean z2;
        int size = this.f124293b.size();
        boolean z3 = true;
        for (int i = 0; i < size; i++) {
            z3 &= ((bkip) this.f124293b.get(i)).m105812j(z);
        }
        if (!this.f124294c) {
            z2 = false;
        } else {
            z2 = z3 && !this.f124297f;
        }
        if (this.f124292a ? !z : z2) {
            if (!mo66056o()) {
                m105819u();
            } else {
                mo66044f(false);
            }
        }
        return !this.f124294c;
    }

    /* renamed from: k */
    private final boolean m105813k(boolean z) {
        if (!z) {
            if (((Boolean) bjwe.f123471F.mo54082a()).booleanValue()) {
                if (bkde.m105347a(this.f124307p)) {
                    bkde.m105358k(this.f124307p);
                    return true;
                }
            } else if (bkde.m105350c(this.f124307p) || bkde.m105347a(this.f124307p)) {
                bkde.m105358k(this.f124307p);
                return true;
            }
        }
        return z;
    }

    /* renamed from: p */
    private final boolean m105814p() {
        boolean z = this.f124297f;
        int size = this.f124293b.size();
        for (int i = 0; i < size; i++) {
            if (z) {
                return true;
            }
            z = ((bkip) this.f124293b.get(i)).m105814p();
        }
        return z;
    }

    /* renamed from: q */
    private final void m105815q() {
        bkip bkip = this.f124312u;
        if (bkip != null) {
            this.f124309r = bkip.f124309r;
        } else {
            this.f124309r = this;
        }
        int size = this.f124293b.size();
        for (int i = 0; i < size; i++) {
            ((bkip) this.f124293b.get(i)).m105815q();
        }
    }

    /* renamed from: r */
    private final void m105816r() {
        this.f124296e = true;
        bkip bkip = this.f124312u;
        while (bkip != null && !bkip.f124296e) {
            bkip.f124296e = true;
            bkip = bkip.f124312u;
        }
    }

    /* renamed from: s */
    private final boolean m105817s() {
        bkip bkip = this.f124303l;
        if (bkip != null && bkip.m105817s()) {
            return true;
        }
        bkii bkii = this.f124305n;
        if (bkii == null) {
            int size = this.f124293b.size();
            for (int i = 0; i < size; i++) {
                if (((bkip) this.f124293b.get(i)).m105817s()) {
                    return true;
                }
            }
            return false;
        }
        bkii.mo59888c();
        return true;
    }

    /* renamed from: t */
    private final void m105818t() {
        bkip bkip = this.f124303l;
        if (bkip != null) {
            bkip.m105818t();
            int size = this.f124293b.size();
            for (int i = 0; i < size; i++) {
                bkip bkip2 = (bkip) this.f124293b.get(i);
                if (bkip2 != this.f124303l) {
                    bkip2.m105812j(true);
                }
            }
        }
    }

    /* renamed from: u */
    private final void m105819u() {
        bkip b = m105808b(0);
        this.f124303l = b;
        if (b != null) {
            b.m105820v();
        }
    }

    /* renamed from: v */
    private final void m105820v() {
        bkip bkip = this.f124303l;
        if (bkip != null) {
            bkip.m105820v();
        } else {
            m105819u();
        }
        mo66044f(true);
    }

    /* renamed from: w */
    private final void m105821w() {
        bkio bkio = this.f124291B;
        if (bkio != null) {
            bkio.mo51927n();
        }
    }

    /* renamed from: x */
    private final void m105822x() {
        Iterator it = this.f124306o.iterator();
        while (it.hasNext()) {
            ((bkih) it.next()).mo52076w();
        }
        int size = this.f124293b.size();
        for (int i = 0; i < size; i++) {
            ((bkip) this.f124293b.get(i)).m105822x();
        }
    }

    /* renamed from: y */
    private final void m105823y() {
        Iterator it = this.f124306o.iterator();
        while (it.hasNext()) {
            ((bkih) it.next()).mo52078y();
        }
        int size = this.f124293b.size();
        for (int i = 0; i < size; i++) {
            ((bkip) this.f124293b.get(i)).m105823y();
        }
    }

    /* renamed from: z */
    private final void m105824z() {
        this.f124303l = null;
        Iterator it = this.f124306o.iterator();
        while (it.hasNext()) {
            ((bkih) it.next()).mo52077x();
        }
        int size = this.f124293b.size();
        for (int i = 0; i < size; i++) {
            ((bkip) this.f124293b.get(i)).m105824z();
        }
    }

    /* renamed from: a */
    public final Parcelable mo66024a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("keyIsExpanded", this.f124294c);
        bundle.putBoolean("keyIsAlwaysExpanded", this.f124297f);
        return bundle;
    }

    /* renamed from: a */
    public final void mo66025a(int i) {
        if (i == 1) {
            this.f124308q = 4;
        } else if (i != 2) {
            this.f124308q = i != 3 ? i != 4 ? 5 : 6 : 8;
        } else if (this.f124312u == null) {
            this.f124308q = 2;
        } else {
            this.f124308q = 3;
        }
    }

    /* renamed from: b */
    public final void mo66037b(boolean z) {
        this.f124309r.f124290A = z;
    }

    /* renamed from: d */
    public final void mo66040d() {
        int size = this.f124293b.size();
        for (int i = 0; i < size; i++) {
            ((bkip) this.f124293b.get(i)).m105809b((bkip) null);
        }
        this.f124293b.clear();
    }

    /* renamed from: e */
    public final void mo66042e() {
        bkip bkip = this.f124309r;
        if (bkip == this) {
            this.f124300i = false;
            Runnable runnable = this.f124301j;
            if (runnable != null) {
                runnable.run();
                this.f124301j = null;
                return;
            }
            return;
        }
        bkip.mo66042e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo66044f(boolean z) {
        if (this.f124294c != z) {
            this.f124294c = z;
            if (this.f124305n != null && !this.f124295d) {
                this.f124295d = true;
                m105816r();
            }
        }
    }

    /* renamed from: g */
    public final void mo66046g() {
        bkii bkii = this.f124305n;
        if (bkii != null) {
            bkii.mo59887b();
        }
        int size = this.f124293b.size();
        for (int i = 0; i < size; i++) {
            ((bkip) this.f124293b.get(i)).mo66046g();
        }
        this.f124295d = false;
        this.f124296e = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo66048h(boolean z) {
        m105823y();
        if (this.f124314w != 0) {
            m105811i(z);
        } else if (!this.f124309r.mo66047g(z)) {
            this.f124309r.mo66043e(false);
            m105824z();
        }
    }

    /* renamed from: l */
    public final boolean mo66053l() {
        int size = this.f124293b.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            bkip bkip = (bkip) this.f124293b.get(i);
            if (bkip.f124294c && bkip.mo66053l()) {
                z = true;
                break;
            }
            i++;
        }
        return m105813k(z);
    }

    /* renamed from: m */
    public final void mo66054m() {
        bkde.m105350c(this.f124307p);
    }

    /* renamed from: n */
    public final void mo66055n() {
        if (!this.f124304m) {
            bkip F = m105801F();
            if (F != null) {
                F.mo66031a(null, true, 6);
                return;
            }
            return;
        }
        mo66025a(4);
    }

    /* renamed from: o */
    public final boolean mo66056o() {
        if (!this.f124294c || this.f124292a) {
            return true;
        }
        boolean a = bkde.m105348a(this.f124307p, null, true);
        int size = this.f124293b.size();
        for (int i = 0; i < size; i++) {
            a = ((bkip) this.f124293b.get(i)).mo66056o() && a;
        }
        return a;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6 && i != 5) {
            return false;
        }
        mo66041d(true);
        return true;
    }

    public final void run() {
        boolean z = this.f124296e;
        this.f124309r.mo66051j();
        if (this.f124298g && z) {
            m105817s();
        }
    }

    /* renamed from: b */
    private final void m105809b(bkip bkip) {
        this.f124312u = bkip;
        m105815q();
    }

    /* renamed from: a */
    public final void mo51905a(int i, Bundle bundle) {
        if ((i == 4 || i == 12) && bkde.m105359l(this.f124307p)) {
            mo66050i();
        }
    }

    /* renamed from: c */
    public final void mo66038c() {
        int size = this.f124307p.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((bkde) this.f124307p.get(i)).f124039e;
            if (obj instanceof bkdx) {
                ((bkdx) obj).f124070x.add(this);
            } else if (obj instanceof bkev) {
                ((bkev) obj).f124110h.add(this);
            }
        }
        if (bkde.m105359l(this.f124307p)) {
            mo66050i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo66043e(boolean z) {
        int size = this.f124293b.size();
        for (int i = 0; i < size; i++) {
            ((bkip) this.f124293b.get(i)).mo66043e(z);
        }
        this.f124304m = z;
    }

    /* renamed from: f */
    public final boolean mo66045f() {
        return this.f124309r.f124290A;
    }

    /* renamed from: a */
    public final void mo66026a(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            mo66044f(bundle.getBoolean("keyIsExpanded", false));
            mo66034a(bundle.getBoolean("keyIsAlwaysExpanded", false));
        }
    }

    /* renamed from: b */
    public final void mo66035b() {
        this.f124307p.clear();
    }

    /* renamed from: d */
    public final void mo66041d(boolean z) {
        if (this.f124304m) {
            mo66025a(2);
        } else if (mo66045f()) {
            bkip bkip = this.f124312u;
            if (bkip == null || this.f124292a) {
                mo66031a(null, z, 2);
            } else {
                bkip.mo66031a(this, z, 3);
            }
        } else {
            if (!this.f124297f) {
                this.f124294c = false;
            }
            int size = this.f124293b.size();
            for (int i = 0; i < size; i++) {
                ((bkip) this.f124293b.get(i)).mo66041d(false);
            }
        }
    }

    /* renamed from: g */
    public final boolean mo66047g(boolean z) {
        int size = this.f124293b.size();
        for (int i = 0; i < size; i++) {
            if (((bkip) this.f124293b.get(i)).mo66047g(z)) {
                return true;
            }
        }
        int i2 = this.f124308q;
        if (i2 == 0) {
            return false;
        }
        m105810c(this.f124309r);
        if (z) {
            this.f124302k.getWindow().getDecorView().postDelayed(new bkij(this, i2), 50);
        } else {
            mo66031a(null, false, i2);
        }
        return true;
    }

    /* renamed from: b */
    public final void mo66036b(bkiq bkiq) {
        bkip bU = bkiq.mo52776bU();
        this.f124293b.remove(bU);
        bU.m105809b((bkip) null);
    }

    /* renamed from: h */
    public final boolean mo66049h() {
        bkip b = m105808b(0);
        if (b != null && b.f124294c && b.mo66049h()) {
            return true;
        }
        return bkde.m105350c(this.f124307p);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo66051j() {
        bkii bkii;
        if (this.f124295d && (bkii = this.f124305n) != null) {
            bkii.mo59887b();
        }
        this.f124295d = false;
        int size = this.f124293b.size();
        for (int i = 0; i < size; i++) {
            bkip bkip = (bkip) this.f124293b.get(i);
            if (bkip.f124296e) {
                bkip.mo66051j();
            }
        }
        this.f124296e = false;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: k */
    public final void mo66052k() {
        int i = 0;
        switch (this.f124314w) {
            case 0:
            case 2:
            case 5:
                break;
            case 1:
                m105797B();
                break;
            case 3:
                if (bjvn.m104723d(this.f124302k)) {
                    bkip G = m105802G();
                    this.f124303l = G;
                    if (G == null) {
                        m105821w();
                    } else {
                        i = 8;
                    }
                } else if (!((Boolean) bjwe.f123471F.mo54082a()).booleanValue()) {
                    if (this.f124303l == null) {
                        m105821w();
                    }
                    m105798C();
                } else if (this.f124303l == null) {
                    m105821w();
                } else {
                    m105797B();
                }
                this.f124314w = i;
                return;
            case 4:
                if (bjvn.m104723d(this.f124302k) || !this.f124294c) {
                    i = 1;
                } else {
                    m105797B();
                }
                this.f124314w = i;
                return;
            case 6:
                if (!bjvn.m104723d(this.f124302k)) {
                    m105805J();
                    this.f124309r.mo66051j();
                    m105798C();
                } else {
                    i = 7;
                }
                this.f124314w = i;
                return;
            case 7:
                m105805J();
                this.f124309r.mo66051j();
                m105798C();
                this.f124314w = 0;
                return;
            default:
                m105798C();
                this.f124314w = 0;
                return;
        }
        this.f124314w = 0;
    }

    /* renamed from: a */
    public final void mo65764a(View view) {
        mo66041d(true);
    }

    /* renamed from: a */
    public final void mo66027a(bkde bkde) {
        this.f124307p.add(bkde);
    }

    /* renamed from: a */
    public final void mo66028a(bkih bkih) {
        this.f124306o.add(bkih);
    }

    /* renamed from: a */
    public final void mo66029a(bkio bkio) {
        if (this == this.f124309r || this.f124292a) {
            this.f124291B = bkio;
        } else {
            Log.e("ExpandableNode", "Setting OnLastInvalidLeafCollapsedListener on a node different than root.");
        }
    }

    /* renamed from: c */
    public final void mo66039c(boolean z) {
        if (this.f124304m) {
            mo66025a(1);
        } else if (mo66045f()) {
            mo66031a(null, z, 4);
        } else {
            this.f124294c = true;
        }
    }

    /* renamed from: a */
    public final void mo66030a(bkip bkip) {
        this.f124293b.add(bkip);
        bkip.m105809b(this);
        bkip.mo66033a(this.f124302k, this.f124317z);
        if (bkip.m105814p()) {
            m105807L();
        }
        if (bkip.f124296e) {
            m105816r();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (m105804I() == false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        if (m105804I() == false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (m105802G() == null) goto L_0x0026;
     */
    /* renamed from: a */
    public final void mo66031a(bkip bkip, boolean z, int i) {
        this.f124303l = bkip;
        if (this.f124312u != null) {
            switch (i) {
                case 1:
                case 4:
                case 5:
                case 6:
                case 7:
                    this.f124312u.mo66031a(this, z, i);
                    return;
                case 2:
                    if (!this.f124292a) {
                        break;
                    }
                    break;
                case 3:
                    if (!this.f124292a) {
                        break;
                    }
                    break;
            }
        }
        this.f124309r.mo66043e(true);
        this.f124314w = i;
        m105822x();
        m105811i(z);
    }

    /* renamed from: i */
    public final void mo66050i() {
        bkin bkin = this.f124311t;
        if (bkin != null) {
            bkin.mo66023h();
        }
        FormEditText j = bkde.m105357j(this.f124307p);
        FormEditText formEditText = this.f124310s;
        if (formEditText != null) {
            formEditText.setOnEditorActionListener(null);
            this.f124310s.mo65786b(this);
        }
        if (this.f124293b.isEmpty()) {
            this.f124310s = j;
            if (j != null) {
                j.setOnEditorActionListener(this);
                bkgh bkgh = j.f151981A;
                if (bkgh != null) {
                    bkgh.mo65986a(this, true);
                    return;
                }
                return;
            }
            return;
        }
        this.f124310s = null;
    }

    /* renamed from: a */
    public final void mo66032a(bkiq bkiq) {
        mo66030a(bkiq.mo52776bU());
    }

    /* renamed from: a */
    public final void mo66033a(Activity activity, bjtd bjtd) {
        this.f124302k = activity;
        this.f124317z = bjtd;
        if (activity != null) {
            this.f124313v = new atj();
            View findViewById = this.f124302k.findViewById(16908290);
            if (findViewById instanceof ViewGroup) {
                asw asw = new asw((ViewGroup) findViewById);
                this.f124316y = asw;
                asw.f2143b = this;
            }
            atn a = bkfr.m105551a();
            this.f124315x = a;
            a.mo2496c(new bkim(this));
            asw asw2 = this.f124316y;
            if (asw2 != null) {
                this.f124313v.mo2489a(asw2, this.f124315x);
            }
        }
        int size = this.f124293b.size();
        for (int i = 0; i < size; i++) {
            ((bkip) this.f124293b.get(i)).mo66033a(activity, bjtd);
        }
    }

    /* renamed from: a */
    public final void mo66034a(boolean z) {
        if (this.f124297f != z) {
            this.f124297f = z;
            if (z) {
                m105807L();
            }
        }
    }
}
