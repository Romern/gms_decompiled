package p000;

import android.os.Bundle;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.clientlog.LogContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: bkdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bkdx extends bkge implements bkdm, bjwm, bkco {

    /* renamed from: A */
    boolean f124067A;

    /* renamed from: B */
    bkcn f124068B;

    /* renamed from: w */
    public bxxc f124069w;

    /* renamed from: x */
    public final ArrayList f124070x = new ArrayList();

    /* renamed from: y */
    public boolean f124071y = true;

    /* renamed from: z */
    boolean f124072z;

    /* renamed from: a */
    public static Bundle m105383a(int i, bxxc bxxc, LogContext logContext) {
        Bundle a = bkbr.m105273a(i, logContext);
        if (bxxc != null) {
            bjvp.m104736a(a, "formProtoLite", bxxc);
        }
        return a;
    }

    /* renamed from: b */
    private final void mo52774b(boolean z) {
        boolean z2;
        if (this.f124072z != z) {
            this.f124072z = z;
            z2 = true;
        } else {
            z2 = false;
        }
        m105385cP();
        bkcn bkcn = this.f124068B;
        if (bkcn != null && z2) {
            bkcn.mo65847d();
        }
    }

    /* renamed from: cP */
    private final void m105385cP() {
        if (getView() == null) {
            return;
        }
        if (this.f124067A || this.f124072z) {
            mo52785o();
        } else {
            mo52784n();
        }
    }

    /* renamed from: A */
    public final boolean mo65880A() {
        if (this.f124072z || this.f124067A) {
            return true;
        }
        return (getParentFragment() instanceof bkdx) && ((bkdx) getParentFragment()).mo65880A();
    }

    /* renamed from: G */
    public bmnu mo65881G() {
        return null;
    }

    /* renamed from: P */
    public boolean mo52816P() {
        return !mo65880A() && bkde.m105347a(mo52778bW());
    }

    /* renamed from: Q */
    public final boolean mo52817Q() {
        return !mo65880A() && bkde.m105349b(mo52778bW());
    }

    /* renamed from: R */
    public final boolean mo52818R() {
        return !mo65880A() && bkde.m105350c(mo52778bW());
    }

    /* renamed from: S */
    public final boolean mo52819S() {
        return bkde.m105351d(mo52778bW());
    }

    /* renamed from: T */
    public ArrayList mo52820T() {
        return bkde.m105352e(mo52778bW());
    }

    /* renamed from: U */
    public final bkdw mo52821U() {
        Object ar = mo65819ar();
        if (ar instanceof bkdw) {
            return (bkdw) ar;
        }
        return null;
    }

    /* renamed from: W */
    public long mo52837W() {
        if (mo52789r() != null) {
            return mo52789r().f128835c;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo65848a(bkcn bkcn) {
        this.f124068B = bkcn;
    }

    /* renamed from: bT */
    public final boolean mo52807bT() {
        return !mo65849k() && bkde.m105360m(mo52778bW());
    }

    /* renamed from: bY */
    public void mo52947bY() {
        bjwl.m104790b(this, mo52837W(), this.f124196aK);
    }

    /* renamed from: c */
    public final void mo65882c(boolean z) {
        this.f124067A = z;
        m105385cP();
    }

    /* renamed from: ck */
    public View mo52945ck() {
        return bkde.m105356i(mo52778bW());
    }

    /* renamed from: cl */
    public bwdm mo52930cl() {
        return null;
    }

    /* renamed from: d */
    public final String mo65883d(String str) {
        bmdn r = mo52789r();
        return bkfr.m105591b(r != null ? r.f128834b : "", str);
    }

    /* renamed from: e */
    public void mo52834e(int i) {
        bkde.m105345a(mo52778bW(), i);
    }

    /* renamed from: k */
    public final boolean mo65849k() {
        if (!this.f124072z) {
            return (getParentFragment() instanceof bkdx) && ((bkdx) getParentFragment()).mo65849k();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo52784n() {
        getView().setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo52785o() {
        getView().setVisibility(8);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getView() != null) {
            bkfr.m105561a(this.f123962aG, mo65881G(), getView());
        }
        m105385cP();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo65884y();
        if (bundle != null) {
            this.f124071y = bundle.getBoolean("shouldShowLastSeparator", true);
            this.f124072z = bundle.getBoolean("isHiddenByDependencyGraph", false);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("shouldShowLastSeparator", this.f124071y);
        bundle.putBoolean("isHiddenByDependencyGraph", this.f124072z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public bxxk mo52787p() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract bmdn mo52789r();

    /* renamed from: y */
    public final void mo65884y() {
        if (this.f124069w == null) {
            Bundle arguments = getArguments();
            if (arguments.containsKey("formProtoLite")) {
                this.f124069w = bjvp.m104730a(arguments, "formProtoLite", mo52787p());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo52843a(Bundle bundle, View view) {
        super.mo52843a(bundle, view);
        View a = bkfr.m105550a(mo52789r(), view, this.f123963aH);
        mo51922f();
        mo51905a(1, Bundle.EMPTY);
        return a;
    }

    /* renamed from: b */
    public String mo52922b(String str) {
        if (str == null) {
            str = getResources().getString(C0126R.string.wallet_uic_string_list_append_to_end);
        }
        return bkde.m105344a(mo52778bW(), str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo52828b(Bundle bundle) {
        bjwl.m104784a(this, mo52837W(), this.f124196aK);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkdx.a(java.util.List, boolean):boolean
     arg types: [java.util.List, int]
     candidates:
      bkdx.a(android.os.Bundle, android.view.View):android.view.View
      bkdx.a(int, android.os.Bundle):void
      bkdx.a(bmmv, java.util.List):void
      bkge.a(android.os.Bundle, android.view.View):android.view.View
      bkge.a(int, android.os.Bundle):void
      bkge.a(android.view.View, java.lang.String):void
      bkbr.a(int, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      bkbr.a(android.os.Bundle, android.view.View):android.view.View
      bjxu.a(android.view.View, java.lang.String):void
      bkdb.a(int, android.os.Bundle):void
      bjwm.a(bmmv, java.util.List):void
      bkdx.a(java.util.List, boolean):boolean */
    /* renamed from: b */
    public final boolean mo52806b(List list) {
        return mo52937a(list, false);
    }

    /* renamed from: a */
    public final String mo52823a(String str) {
        return !mo65849k() ? mo52922b(str) : "";
    }

    /* renamed from: a */
    public void mo51905a(int i, Bundle bundle) {
        bkdb bkdb = (bkdb) mo65819ar();
        if (bkdb != null) {
            bkdb.mo51905a(i, bundle);
        }
        int size = this.f124070x.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((bkdb) this.f124070x.get(i2)).mo51905a(i, bundle);
        }
    }

    /* renamed from: a */
    public void mo51910a(bmmv bmmv, List list) {
        int a = bmmb.m108166a(bmmv.f130058d);
        boolean z = true;
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 1) {
            mo52774b(false);
        } else if (i2 == 11) {
            mo52774b(true);
        } else if (i2 != 27) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int a2 = bmmb.m108166a(bmmv.f130058d);
            if (a2 != 0) {
                i = a2;
            }
            objArr[0] = Integer.valueOf(i - 1);
            throw new IllegalArgumentException(String.format(locale, "Unknown ResultingActionReference action type: %s", objArr));
        } else {
            if (getView().getVisibility() != 0) {
                z = false;
            }
            mo52774b(z);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkdx.a(java.util.List, boolean):boolean
     arg types: [java.util.List, int]
     candidates:
      bkdx.a(android.os.Bundle, android.view.View):android.view.View
      bkdx.a(int, android.os.Bundle):void
      bkdx.a(bmmv, java.util.List):void
      bkge.a(android.os.Bundle, android.view.View):android.view.View
      bkge.a(int, android.os.Bundle):void
      bkge.a(android.view.View, java.lang.String):void
      bkbr.a(int, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      bkbr.a(android.os.Bundle, android.view.View):android.view.View
      bjxu.a(android.view.View, java.lang.String):void
      bkdb.a(int, android.os.Bundle):void
      bjwm.a(bmmv, java.util.List):void
      bkdx.a(java.util.List, boolean):boolean */
    /* renamed from: a */
    public boolean mo52804a(List list) {
        return mo52937a(list, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo52937a(List list, boolean z) {
        return mo65849k() || bkde.m105348a(mo52778bW(), list, z);
    }
}
