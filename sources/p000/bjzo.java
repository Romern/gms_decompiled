package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CompoundButton;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.SummaryTextLayout;
import com.google.android.wallet.p097ui.expander.SummaryExpanderWrapper;
import java.util.List;

/* renamed from: bjzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjzo extends bjzp implements View.OnFocusChangeListener, CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public ViewGroup f123699a;

    /* renamed from: b */
    SummaryExpanderWrapper f123700b;

    /* renamed from: c */
    public SummaryTextLayout f123701c;

    /* renamed from: d */
    final bkip f123702d = new bkip();

    /* renamed from: e */
    bkip f123703e;

    /* renamed from: f */
    boolean f123704f;

    /* renamed from: g */
    public int f123705g = 0;

    /* renamed from: k */
    private boolean f123706k;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bjzo.a(bmbr, int, boolean, com.google.android.wallet.clientlog.LogContext):bjzo
     arg types: [bmbr, int, int, com.google.android.wallet.clientlog.LogContext]
     candidates:
      bjzp.a(int, bmbr, boolean, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      bjzo.a(bmbr, int, boolean, com.google.android.wallet.clientlog.LogContext):bjzo */
    /* renamed from: a */
    public static bjzo m105001a(bmbr bmbr, int i, LogContext logContext) {
        return m105002a(bmbr, i, true, logContext);
    }

    /* renamed from: x */
    private final void m105004x() {
        if (this.f123790j != null) {
            bkaf bkaf = this.f123708h;
            bkaf.f123785v = false;
            bkaf.mo65719m();
            this.f123701c.mo72106a(this.f123790j.f129970f);
            this.f123700b.mo72164a(this.f123790j);
            this.f123699a.findViewById(C0126R.C0129id.address_title).setVisibility(8);
        } else if (this.f123701c == null) {
        } else {
            if (!((bmbr) this.f124069w).f128578E.isEmpty()) {
                this.f123701c.mo72106a(((bmbr) this.f124069w).f128578E);
            } else if (!((bmbr) this.f124069w).f128589f.isEmpty()) {
                this.f123701c.mo72106a(((bmbr) this.f124069w).f128589f);
                this.f123699a.findViewById(C0126R.C0129id.address_title).setVisibility(8);
            }
        }
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f123702d;
    }

    /* renamed from: e */
    public final void mo52834e(int i) {
        this.f123705g = i;
        super.mo52834e(i);
        if (!this.f123702d.f124304m) {
            this.f123699a.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        super.mo51922f();
        SummaryExpanderWrapper summaryExpanderWrapper = this.f123700b;
        if (summaryExpanderWrapper != null) {
            summaryExpanderWrapper.setEnabled(this.f124195aJ);
        }
    }

    /* renamed from: m */
    public final void mo65667m() {
        bkip bkip = this.f123703e;
        boolean z = true;
        if (!this.f123708h.mo65720n() && !this.f123708h.f123785v) {
            z = false;
        }
        bkip.mo66034a(z);
    }

    public final void onActivityCreated(Bundle bundle) {
        int a;
        super.onActivityCreated(bundle);
        ViewParent parent = this.f123699a.getParent();
        while (!(parent instanceof SummaryExpanderWrapper) && parent != null) {
            parent = parent.getParent();
        }
        SummaryExpanderWrapper summaryExpanderWrapper = (SummaryExpanderWrapper) parent;
        if (!(summaryExpanderWrapper == null || (a = bmbp.m107874a(((bmbr) this.f124069w).f128576C)) == 0 || a != 5)) {
            summaryExpanderWrapper.mo72168e(5);
        }
        int a2 = bmbp.m107874a(((bmbr) this.f124069w).f128576C);
        if (a2 != 0 && a2 == 5 && this.f123708h.mo65705a(false)) {
            mo65667m();
        }
        mo65667m();
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        mo65667m();
    }

    public final void onCreate(Bundle bundle) {
        this.f123704f = getArguments().getBoolean("isInsideFieldGroup");
        this.f123706k = getArguments().getBoolean("isInsideTree");
        super.onCreate(bundle);
        this.f123708h.f123741E = this;
        this.f123702d.f124298g = this.f123706k;
    }

    public final void onFocusChange(View view, boolean z) {
        if (view == this.f123701c && z) {
            bkip bkip = this.f123703e;
            if (!bkip.f124294c) {
                bkip.mo66039c(true);
            }
        }
    }

    public final void onResume() {
        super.onResume();
        if (!this.f123706k) {
            this.f123702d.mo66037b(true);
            this.f123702d.mo66046g();
        }
    }

    /* renamed from: t */
    public final void mo65670t() {
        this.f123699a.setVisibility(0);
        super.mo52834e(this.f123705g);
    }

    /* renamed from: u */
    public final void mo65671u() {
        if (!this.f123706k && !mo52807bT() && mo52806b((List) null)) {
            this.f123703e.mo66041d(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo65672v() {
        return !this.f123704f ? C0126R.attr.internalUicAddressRootLayout : C0126R.attr.internalUicAddressRootWithoutFieldGroupRootLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final int mo65673w() {
        return this.f123704f ? C0126R.C0128layout.fragment_address_entry : C0126R.C0128layout.fragment_address_expander;
    }

    /* renamed from: a */
    public static bjzo m105002a(bmbr bmbr, int i, boolean z, LogContext logContext) {
        return m105003a(bmbr, i, z, false, false, logContext);
    }

    /* renamed from: a */
    public static bjzo m105003a(bmbr bmbr, int i, boolean z, boolean z2, boolean z3, LogContext logContext) {
        bjzo bjzo = new bjzo();
        Bundle a = bjzp.m105017a(i, bmbr, z2, logContext);
        a.putBoolean("isInsideTree", z);
        a.putBoolean("isInsideFieldGroup", z3);
        bjzo.setArguments(a);
        return bjzo;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo51901a(layoutInflater, viewGroup, bundle);
        this.f123699a = (ViewGroup) a.findViewById(C0126R.C0129id.address_container);
        if (!this.f123704f) {
            SummaryExpanderWrapper summaryExpanderWrapper = (SummaryExpanderWrapper) a.findViewById(C0126R.C0129id.address_wrapper);
            this.f123700b = summaryExpanderWrapper;
            summaryExpanderWrapper.mo72167d(C0126R.C0129id.address_summary_image);
            this.f123700b.mo72165b(C0126R.C0129id.address_summary_text);
            this.f123700b.mo72166c(C0126R.C0129id.address_summary_title);
            SummaryExpanderWrapper summaryExpanderWrapper2 = this.f123700b;
            summaryExpanderWrapper2.f152311g = this;
            this.f123702d.mo66032a((bkiq) summaryExpanderWrapper2);
            this.f123701c = (SummaryTextLayout) a.findViewById(C0126R.C0129id.address_summary_text);
            m105004x();
            this.f123701c.setOnFocusChangeListener(this);
            this.f123703e = this.f123700b.f152305a;
        } else {
            a.findViewById(C0126R.C0129id.address_title).setVisibility(8);
            this.f123703e = this.f123702d;
        }
        this.f123703e.mo66027a(new bkde(mo52837W(), this, this.f124069w));
        this.f123703e.mo66038c();
        return a;
    }

    /* renamed from: a */
    public final void mo65666a(bmlv bmlv) {
        this.f123790j = bmlv;
        if (this.f123700b != null) {
            m105004x();
        }
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        boolean a = super.mo52281a(bmas);
        if (!a || this.f123706k) {
            return a;
        }
        this.f123702d.mo66039c(false);
        return true;
    }

    /* renamed from: a */
    public final boolean mo52804a(List list) {
        boolean a = super.mo52804a(list);
        if (a || this.f123706k) {
            return a;
        }
        this.f123702d.mo66039c(false);
        return false;
    }
}
