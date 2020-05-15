package p000;

import android.content.Intent;
import android.os.Bundle;
import android.support.p002v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.activity.GenericDelegatorChimeraActivity;
import com.google.android.gms.wallet.p088ui.component.filter.FilterCategoryNameView;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.util.List;
import java.util.Locale;

/* renamed from: axar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axar extends awcc implements View.OnClickListener, bjwm, bkea {

    /* renamed from: c */
    Toolbar f95550c;

    /* renamed from: d */
    axaq f95551d;

    /* renamed from: e */
    private bjwk f95552e;

    public axar(GenericDelegatorChimeraActivity genericDelegatorChimeraActivity) {
        super(genericDelegatorChimeraActivity);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void
     arg types: [com.google.android.gms.wallet.activity.GenericDelegatorChimeraActivity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, int]
     candidates:
      awia.a(bwiv, android.content.Intent, android.content.Context, com.google.android.gms.wallet.shared.BuyFlowConfig):android.content.Intent
      awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void */
    /* renamed from: a */
    public final void mo51845a(Bundle bundle) {
        super.mo51845a(bundle);
        GenericDelegatorChimeraActivity genericDelegatorChimeraActivity = this.f94160a;
        awia.m79981a((Activity) genericDelegatorChimeraActivity, (BuyFlowConfig) genericDelegatorChimeraActivity.getIntent().getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig"), awia.f94388j, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: b */
    public final void mo51849b(Bundle bundle) {
        super.mo51849b(bundle);
        this.f94160a.setContentView((int) C0126R.C0128layout.wallet_activity_filter);
        this.f95550c = (Toolbar) this.f94160a.findViewById(C0126R.C0129id.toolbar);
        this.f94160a.mo8626a(this.f95550c);
        this.f94160a.mo8628aW().mo15853b(true);
        ViewGroup viewGroup = (ViewGroup) this.f94160a.findViewById(C0126R.C0129id.container);
        Intent intent = this.f94160a.getIntent();
        Bundle extras = intent.getExtras();
        bwhv bwhv = (bwhv) bjvp.m104730a(extras, "filter", (bxxk) bwhv.f159578e.mo74142c(7));
        this.f94160a.setTitle(bwhv.f159583d);
        bxwc bxwc = bwhv.f159581b;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bwhw bwhw = (bwhw) bxwc.get(i);
            FilterCategoryNameView filterCategoryNameView = (FilterCategoryNameView) this.f94160a.getLayoutInflater().inflate((int) C0126R.C0128layout.wallet_view_filter_category_name, viewGroup, false);
            filterCategoryNameView.f110520a = bwhw;
            filterCategoryNameView.setText(bwhw.f159591d);
            filterCategoryNameView.setOnClickListener(this);
            viewGroup.addView(filterCategoryNameView);
        }
        bjwk bjwk = new bjwk((bmlz) bjvp.m104730a(extras, "dependencyGraph", (bxxk) bmlz.f129993c.mo74142c(7)), chgl.m148679c());
        this.f95552e = bjwk;
        bjwl.m104784a(this, 1, bjwk);
        bjwl.m104784a(this, 2, this.f95552e);
        bkgd bkgd = new bkgd(this.f94160a.getSupportFragmentManager(), this.f94161b, this.f94160a, intent.getStringExtra("analyticsSessionId"));
        bkgd.f124186a = this.f95552e;
        axaq axaq = new axaq(bkgd);
        this.f95551d = axaq;
        axaq.mo52951a();
    }

    /* renamed from: bT */
    public final boolean mo52807bT() {
        return this.f95551d.mo52807bT();
    }

    public void onClick(View view) {
        if (view instanceof FilterCategoryNameView) {
            this.f95551d.mo52952a(((FilterCategoryNameView) view).f110520a);
        }
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        bmmp bmmp;
        bxvw bxvw;
        bmmp bmmp2;
        int a = bmmb.m108166a(bmmv.f130058d);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 3) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int a2 = bmmb.m108166a(bmmv.f130058d);
            if (a2 != 0) {
                i = a2;
            }
            objArr[0] = Integer.valueOf(i - 1);
            throw new IllegalArgumentException(String.format(locale, "Unsupported resulting action type: %s", objArr));
        }
        if (bmmv.f130056b == 4) {
            bmmp = (bmmp) bmmv.f130057c;
        } else {
            bmmp = bmmp.f130032e;
        }
        if (!bmmp.f130035b) {
            bxvw = bmmp.f130034a;
        } else {
            bxvw = null;
        }
        if (mo52804a(bxvw)) {
            Intent intent = new Intent();
            bjvp.m104735a(intent, "filterValue", this.f95551d.mo52953c());
            if (bmmv.f130056b == 4) {
                bmmp2 = (bmmp) bmmv.f130057c;
            } else {
                bmmp2 = bmmp.f130032e;
            }
            intent.putExtra("dependencyGraphActionToken", bmmp2.f130037d.getKey());
            this.f94160a.setResult(-1, intent);
            this.f94160a.finish();
        }
    }

    /* renamed from: b */
    public final boolean mo52806b(List list) {
        return this.f95551d.mo52806b(list);
    }

    /* renamed from: a */
    public final boolean mo52804a(List list) {
        return this.f95551d.mo52804a(list);
    }
}
