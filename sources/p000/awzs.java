package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysRequest;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.CheckboxView;
import com.google.android.wallet.p097ui.common.MaterialFieldLayout;
import com.google.android.wallet.p097ui.expander.SummaryExpanderWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: awzs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awzs extends bkjj implements awyo, awyp {

    /* renamed from: M */
    private final bkip f95436M = new bkip();

    /* renamed from: N */
    private boolean f95437N;

    /* renamed from: O */
    private boolean f95438O;

    /* renamed from: P */
    private boolean f95439P;

    /* renamed from: Q */
    private String f95440Q;

    /* renamed from: a */
    public awyo f95441a;

    /* renamed from: b */
    public awyp f95442b;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzs.a(bmeb, int, boolean, java.lang.String, boolean, com.google.android.wallet.clientlog.LogContext, com.google.android.gms.wallet.shared.BuyFlowConfig):awzs
     arg types: [bmeb, int, int, java.lang.String, int, com.google.android.wallet.clientlog.LogContext, ?[OBJECT, ARRAY]]
     candidates:
      bkjj.a(android.view.ViewGroup, com.google.android.wallet.ui.expander.SummaryExpanderWrapper, bmdx, java.lang.String, int, int, boolean):void
      awzs.a(bmeb, int, boolean, java.lang.String, boolean, com.google.android.wallet.clientlog.LogContext, com.google.android.gms.wallet.shared.BuyFlowConfig):awzs */
    /* renamed from: a */
    public static awzs m81798a(bmeb bmeb, int i, String str, LogContext logContext) {
        return m81800a(bmeb, i, false, str, false, logContext, (BuyFlowConfig) null);
    }

    /* renamed from: D */
    public final void mo52032D() {
        awyo awyo = this.f95441a;
        if (awyo != null) {
            awyo.mo52032D();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo52918b(bkdx bkdx) {
        if (bkdx instanceof axau) {
            axau axau = (axau) bkdx;
            axau.f95562i = this.f124389J;
            axau.f95563j = this.f124390K;
        }
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f95436M;
    }

    /* renamed from: c */
    public final List mo52920c() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f124409k.size(); i++) {
            arrayList.add((awyq) this.f124409k.get(i));
        }
        return arrayList;
    }

    /* renamed from: l */
    public final void mo52921l() {
        LinearLayout linearLayout = this.f124404f;
        if (linearLayout != null) {
            this.f95439P = false;
            View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
            if ((childAt instanceof MaterialFieldLayout) && (bkft.m105641b(childAt) instanceof CheckboxView)) {
                MaterialFieldLayout materialFieldLayout = (MaterialFieldLayout) childAt;
                C1280ps.m19885a(materialFieldLayout, C1280ps.m19925i(materialFieldLayout), materialFieldLayout.getPaddingTop(), C1280ps.m19927j(materialFieldLayout), 0);
                materialFieldLayout.f152146a = 0;
                return;
            }
            return;
        }
        this.f95439P = true;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        Bundle arguments = getArguments();
        this.f95440Q = arguments.getString("analyticsId");
        this.f95438O = arguments.getBoolean("isFragmentInsideFieldGroup");
        this.f124401c = arguments.getBoolean("fadeInImages");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzs.a(bmeb, int, boolean, java.lang.String, boolean, com.google.android.wallet.clientlog.LogContext, com.google.android.gms.wallet.shared.BuyFlowConfig):awzs
     arg types: [bmeb, int, int, java.lang.String, boolean, com.google.android.wallet.clientlog.LogContext, ?[OBJECT, ARRAY]]
     candidates:
      bkjj.a(android.view.ViewGroup, com.google.android.wallet.ui.expander.SummaryExpanderWrapper, bmdx, java.lang.String, int, int, boolean):void
      awzs.a(bmeb, int, boolean, java.lang.String, boolean, com.google.android.wallet.clientlog.LogContext, com.google.android.gms.wallet.shared.BuyFlowConfig):awzs */
    /* renamed from: a */
    public static awzs m81799a(bmeb bmeb, int i, String str, boolean z, LogContext logContext) {
        return m81800a(bmeb, i, false, str, z, logContext, (BuyFlowConfig) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo52919b(bmqf bmqf) {
        if (bmqf.f130373b != 7) {
            return false;
        }
        int a = bmpj.m108255a(((bmpl) bmqf.f130374c).f130320e);
        if (a == 0) {
            a = 1;
        }
        if (axau.m81988a(a)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static awzs m81800a(bmeb bmeb, int i, boolean z, String str, boolean z2, LogContext logContext, BuyFlowConfig buyFlowConfig) {
        awzs awzs = new awzs();
        Bundle a = bkdx.m105383a(i, bmeb, logContext);
        a.putString("analyticsId", str);
        a.putBoolean("isFragmentInsideFieldGroup", z2);
        a.putBoolean("fadeInImages", z);
        a.putParcelable("buyFlowConfig", buyFlowConfig);
        awzs.setArguments(a);
        return awzs;
    }

    /* renamed from: a */
    public static boolean m81801a(bmeb bmeb) {
        bmee bmee;
        bxwc bxwc = bmeb.f128906c;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bmea bmea = (bmea) bxwc.get(i);
            int i2 = bmea.f128899a;
            if (i2 != 2) {
                if (i2 == 1) {
                    bmee = (bmee) bmea.f128900b;
                } else {
                    bmee = bmee.f128922e;
                }
                bxwc bxwc2 = bmee.f128926c;
                int size2 = bxwc2.size();
                int i3 = 0;
                while (i3 < size2) {
                    int i4 = i3 + 1;
                    if (((bmdx) bxwc2.get(i3)).f128888a == 2) {
                        return true;
                    }
                    i3 = i4;
                }
                continue;
            } else if (((bmdx) bmea.f128900b).f128888a == 2) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = this.f123962aG.obtainStyledAttributes(new int[]{C0126R.attr.internalUicUseGoogleMaterial2Theme});
        this.f95437N = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        View a = super.mo51901a(layoutInflater, viewGroup, bundle);
        if (this.f95439P) {
            mo52921l();
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo52908a(View view, bmqf bmqf, ViewGroup viewGroup, boolean z) {
        CheckboxView checkboxView;
        bmqf bmqf2;
        bmow bmow;
        View b = bkft.m105641b(view);
        if (!this.f95438O && (b instanceof CheckboxView) && (bmqf2 = (checkboxView = (CheckboxView) b).f151922i) != null) {
            if (bmqf2.f130373b == 10) {
                bmow = (bmow) bmqf2.f130374c;
            } else {
                bmow = bmow.f130264f;
            }
            int a = bmov.m108241a(bmow.f130270e);
            if (a != 0 && a == 2) {
                checkboxView.mo65790a(getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_page_left_column_width));
            }
        }
        return super.mo52908a(view, bmqf, viewGroup, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bkag mo52909a(bmbr bmbr, boolean z) {
        boolean z2;
        int a = bmbk.m107867a(bmbr.f128599p);
        if (a != 0 && a == 3) {
            return awzy.m81847a(bmbr, this.f123961aF, this.f95440Q, mo65980at());
        }
        if (awia.m79985a(this.f123962aG)) {
            return super.mo52909a(bmbr, z);
        }
        int i = this.f123961aF;
        if (this.f95438O) {
            z2 = true;
        } else {
            z2 = z;
        }
        return bjzo.m105003a(bmbr, i, true, false, z2, mo65980at());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkfr.a(android.content.Context, android.widget.Button):void
     arg types: [android.view.ContextThemeWrapper, android.widget.Button]
     candidates:
      bkfr.a(android.content.Context, int):int
      bkfr.a(android.view.View, android.view.View):int
      bkfr.a(android.content.Context, java.lang.String):android.content.Intent
      bkfr.a(android.content.res.Resources, java.util.List):java.lang.String
      bkfr.a(java.lang.String, java.lang.String):java.lang.String
      bkfr.a(android.content.Context, android.view.View):void
      bkfr.a(android.view.View, int):void
      bkfr.a(android.view.View, android.util.TypedValue):void
      bkfr.a(android.view.View, java.lang.CharSequence):void
      bkfr.a(android.view.View, boolean):void
      bkfr.a(android.view.ViewGroup, int):void
      bkfr.a(android.view.ViewGroup, boolean):void
      bkfr.a(android.widget.ImageView, android.content.res.ColorStateList):void
      bkfr.a(android.widget.TextView, java.lang.String):void
      bkfr.a(android.widget.TextView, boolean):void
      bkfr.a(boolean, java.lang.Object):void
      bkfr.a(android.content.Context, bmap):boolean
      bkfr.a(android.content.Context, int[]):boolean
      bkfr.a(com.google.android.chimera.Activity, android.widget.TextView):boolean
      bkfr.a(android.content.Context, android.widget.Button):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bkbn mo52910a(ViewGroup viewGroup, int i) {
        int i2;
        int i3 = i - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                if (!this.f95437N) {
                    i2 = C0126R.C0128layout.view_submit_button;
                } else {
                    i2 = C0126R.C0128layout.view_submit_material_button;
                }
                bkbn bkbn = (bkbn) this.f123963aH.inflate(i2, viewGroup, false);
                bkfr.m105560a((Context) this.f123962aG, bkbn.mo52703a());
                bkbn.mo52710b().setVisibility(0);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) bkbn.mo52710b().getLayoutParams();
                int dimension = (int) getResources().getDimension(C0126R.dimen.wallet_uic_spacing_button_top_bottom);
                layoutParams.topMargin = dimension;
                layoutParams.bottomMargin = dimension;
                return bkbn;
            } else if (i3 != 12) {
                if (i3 == 6) {
                    bkby bkby = new bkby(this.f123962aG);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, (int) getResources().getDimension(C0126R.dimen.wallet_uic_chip_button_height));
                    layoutParams2.gravity = 8388611;
                    int dimension2 = (int) getResources().getDimension(C0126R.dimen.wallet_uic_spacing_button_top_bottom);
                    layoutParams2.topMargin = dimension2;
                    layoutParams2.bottomMargin = dimension2;
                    bkby.setLayoutParams(layoutParams2);
                    return bkby;
                } else if (i3 == 7) {
                    bkbn bkbn2 = (bkbn) this.f123963aH.inflate((int) C0126R.C0128layout.view_link_button, viewGroup, false);
                    bkbn2.mo52703a().setTextColor(bkfr.m105600c(this.f123962aG));
                    if (awia.m79985a(this.f123962aG)) {
                        return bkbn2;
                    }
                    ((LinearLayout.LayoutParams) bkbn2.mo52710b().getLayoutParams()).gravity = 17;
                    return bkbn2;
                } else {
                    throw new IllegalStateException(mo65883d(String.format(Locale.US, "Button of type %s not supported inside simple form", Integer.valueOf(i3))));
                }
            }
        }
        bkbn bkbn3 = (bkbn) this.f123963aH.inflate(!this.f95437N ? C0126R.C0128layout.view_standard_button : C0126R.C0128layout.view_standard_material_button, viewGroup, false);
        bkbn3.mo52703a().setTextColor(bkfr.m105600c(this.f123962aG));
        return bkbn3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bkdx mo52911a(bmcb bmcb) {
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) getArguments().get("buyFlowConfig");
        if (buyFlowConfig == null) {
            buyFlowConfig = BuyFlowConfig.m94175a().mo52748a();
        }
        return awyq.m81545a(bmcb, this.f123961aF, mo65980at(), buyFlowConfig);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bkdx mo52912a(bmqf bmqf) {
        bmpl bmpl;
        if (bmqf.f130373b == 7) {
            int a = bmpj.m108255a(((bmpl) bmqf.f130374c).f130320e);
            boolean z = true;
            if (a == 0) {
                a = 1;
            }
            if (axau.m81988a(a)) {
                int i = this.f123961aF;
                LogContext at = mo65980at();
                if (bmqf.f130373b == 7) {
                    int a2 = bmpj.m108255a(((bmpl) bmqf.f130374c).f130320e);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    if (axau.m81988a(a2)) {
                        if (bmqf.f130373b == 7) {
                            bmpl = (bmpl) bmqf.f130374c;
                        } else {
                            bmpl = bmpl.f130314g;
                        }
                        if (bmpl.f130317b.size() <= 0) {
                            z = false;
                        }
                        sdo.m34975b(z, "Invalid ui field for SelectFieldSelectorFragment");
                        axau axau = new axau();
                        axau.setArguments(bkdx.m105383a(i, bmqf, at));
                        return axau;
                    }
                }
                z = false;
                sdo.m34975b(z, "Invalid ui field for SelectFieldSelectorFragment");
                axau axau2 = new axau();
                axau2.setArguments(bkdx.m105383a(i, bmqf, at));
                return axau2;
            }
        }
        throw new IllegalStateException(mo65883d("Can't create fragment for uiField"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bkiv mo52913a(bmji bmji) {
        int i = this.f123961aF;
        LogContext at = mo65980at();
        axbw axbw = new axbw();
        axbw.setArguments(bkdx.m105383a(i, bmji, at));
        return axbw;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bmcc mo52914a(int i) {
        return ((awyq) mo52920c().get(i)).mo52783m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final SummaryExpanderWrapper mo52915a(bmlv bmlv, ViewGroup viewGroup) {
        return awgp.m79906a(bmlv, viewGroup, this, this, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52916a(bkag bkag) {
        if (bkag instanceof awzy) {
            ((awzy) bkag).f95469i = this.f124389J;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo52917a(bkdx bkdx) {
        awyq awyq = (awyq) bkdx;
        awyq.f95316n = this;
        awyq.f95317o = this;
    }

    /* renamed from: a */
    public final void mo52053a(SetUpBiometricAuthenticationKeysRequest setUpBiometricAuthenticationKeysRequest) {
        awyp awyp = this.f95442b;
        if (awyp != null) {
            awyp.mo52053a(setUpBiometricAuthenticationKeysRequest);
        }
    }
}
