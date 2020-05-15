package p000;

import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.autofill.fill.FillForm;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: lpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class lpq extends lim {

    /* renamed from: g */
    public static final AtomicInteger f26549g = new AtomicInteger(-1);

    /* renamed from: d */
    private final bqgj f26550d;

    /* renamed from: h */
    public final InputMethodManager f26551h;

    /* renamed from: i */
    public final RelativeLayout f26552i;

    /* renamed from: j */
    public final View f26553j;

    /* renamed from: k */
    protected final FillForm f26554k;

    /* renamed from: l */
    protected final kuw f26555l;

    /* renamed from: m */
    protected final bhfq f26556m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lpq(lir lir, Bundle bundle, bngx bngx) {
        super(lir, bundle, bngx);
        InputMethodManager inputMethodManager = (InputMethodManager) lir.getSystemService("input_method");
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f26159a.setTheme(C0126R.style.AutofillTransparentActivityTheme);
        FillForm fillForm = (FillForm) lqx.m19548a((Bundle) bundle.getParcelable("com.google.android.gms.autofill.extra.AUTOFILL_ID_FILL"));
        if (fillForm != null) {
            this.f26554k = fillForm;
            this.f26551h = inputMethodManager;
            this.f26550d = bqgs.m112811a(newCachedThreadPool);
            this.f26552i = new RelativeLayout(lir);
            this.f26556m = new bhfq(lir);
            this.f26553j = this.f26159a.getLayoutInflater().inflate((int) C0126R.C0128layout.autofill_keyboard_dataset_picker, (ViewGroup) null);
            this.f26555l = krc.m18382a(lir).mo14825a(lir);
            return;
        }
        throw new lik("FillForm must be present in provided state bundle.");
    }

    /* renamed from: a */
    public final void mo15164a() {
        this.f26159a.setFinishOnTouchOutside(false);
        this.f26159a.setContentView(this.f26552i);
        ((TextView) this.f26553j.findViewById(16908308)).setText(mo15345h());
        RecyclerView recyclerView = (RecyclerView) this.f26553j.findViewById(16908298);
        mo15341a(recyclerView);
        abh adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.mo166a(new lpn(this));
        }
        mo15344b((RecyclerView) this.f26553j.findViewById(C0126R.C0129id.footer));
        this.f26556m.setOnDismissListener(new lpl(this));
        this.f26556m.mo63666a().mo71034b(new lpp(this, recyclerView));
        this.f26556m.setContentView(this.f26553j);
        if (f26549g.get() != -1) {
            mo15349b(f26549g.get());
            return;
        }
        this.f26159a.getWindow().getDecorView().getRootView().getViewTreeObserver().addOnGlobalLayoutListener(new lpm(this));
        this.f26159a.getContainerActivity().getWindow().setSoftInputMode(21);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo15341a(RecyclerView recyclerView);

    /* renamed from: b */
    public final void mo15349b(int i) {
        mo15350c(i);
        this.f26556m.mo63666a().mo71025a(i);
        this.f26556m.show();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo15344b(RecyclerView recyclerView);

    /* renamed from: c */
    public final void mo15350c(int i) {
        ViewGroup.LayoutParams layoutParams = this.f26553j.getLayoutParams();
        layoutParams.height = i;
        this.f26553j.setLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public final void mo15173d() {
        this.f26159a.overridePendingTransition(0, 0);
    }

    /* renamed from: f */
    public final void mo15175f() {
        this.f26551h.toggleSoftInput(1, 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract CharSequence mo15345h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final kel mo15351i() {
        FillForm fillForm = this.f26554k;
        kck kck = (kck) fillForm.f11644d.mo66812a((kck) fillForm.f11643c);
        bnia c = bnic.m109499c(1);
        kcv kcv = this.f26554k.f11643c;
        if (kcv instanceof kdl) {
            c.mo67629b(kcv);
        }
        return new kel(this.f26550d, kck, c.mo67751a(), bmvz.f131120a);
    }
}
