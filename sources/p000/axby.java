package p000;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.expander.SummaryExpanderWrapper;
import java.util.ArrayList;

/* renamed from: axby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axby extends bkjt {

    /* renamed from: a */
    SummaryExpanderWrapper f95743a;

    /* renamed from: b */
    public final bkip f95744b = new bkip();

    /* renamed from: p */
    private final ArrayList f95745p = new ArrayList(2);

    /* renamed from: a */
    public static axby m82259a(bmjb bmjb, int i, LogContext logContext) {
        axby axby = new axby();
        axby.setArguments(bkdx.m105383a(i, bmjb, logContext));
        return axby;
    }

    /* renamed from: T */
    public final ArrayList mo52820T() {
        return this.f95745p;
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f95744b;
    }

    /* renamed from: e */
    public final void mo52834e(int i) {
        int size = this.f95745p.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((View) this.f95745p.get(i2)).setVisibility(i);
        }
    }

    /* renamed from: f */
    public final void mo51922f() {
        if (this.f95743a != null) {
            super.mo51922f();
            this.f95743a.setEnabled(this.f124195aJ);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bmlv bmlv;
        View a = super.mo51901a(layoutInflater, viewGroup, bundle);
        if (this.f124457j.getVisibility() != 8) {
            this.f95745p.add(this.f124457j);
        }
        if ((((bmjb) this.f124069w).f129663a & 16) != 0) {
            this.f95745p.add(this.f124452e);
        }
        this.f95745p.add(this.f124453f);
        if (!((bmjb) this.f124069w).f129670h.isEmpty()) {
            this.f95745p.add(this.f124456i);
        }
        if ((((bmjb) this.f124069w).f129663a & 128) != 0) {
            this.f95745p.add(this.f124458k);
        }
        this.f95743a = (SummaryExpanderWrapper) a.findViewById(C0126R.C0129id.username_password_wrapper);
        bmdn bmdn = ((bmjb) this.f124069w).f129664b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        if (bmdn.f128840h.size() <= 1) {
            bmdn bmdn2 = ((bmjb) this.f124069w).f129664b;
            if (bmdn2 == null) {
                bmdn2 = bmdn.f128831k;
            }
            if (bmdn2.f128840h.size() == 1) {
                bmdn bmdn3 = ((bmjb) this.f124069w).f129664b;
                if (bmdn3 == null) {
                    bmdn3 = bmdn.f128831k;
                }
                int a2 = bmlu.m108157a(((bmlv) bmdn3.f128840h.get(0)).f129968d);
                if (a2 == 0 || a2 != 4) {
                    throw new IllegalStateException("Only field group component group is supported");
                }
                bmdn bmdn4 = ((bmjb) this.f124069w).f129664b;
                if (bmdn4 == null) {
                    bmdn4 = bmdn.f128831k;
                }
                bmlv = (bmlv) bmdn4.f128840h.get(0);
            } else {
                bmlv = null;
            }
            if (bmlv != null) {
                awgp.m79907a(this.f95743a, bmlv, this, (int) C0126R.C0129id.username_password_icon, (int) C0126R.C0129id.username_password_summary, -1, -1, this);
                this.f95743a.f152305a.mo66035b();
                this.f95743a.mo72160a(new bkde(this));
                this.f95743a.mo72169i();
                this.f95744b.mo66032a((bkiq) this.f95743a);
            } else {
                this.f95743a.mo72161a(this, C0126R.C0129id.username_password_icon, C0126R.C0129id.username_password_summary);
            }
            return a;
        }
        throw new IllegalStateException("At most one component group supported.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53000a(LayoutInflater layoutInflater, bmqf[] bmqfArr) {
        super.mo53000a(layoutInflater, bmqfArr);
        int childCount = this.f124454g.getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.f95745p.add(bkft.m105641b(this.f124454g.getChildAt(i)));
        }
    }
}
