package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.SelectorView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: awzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awzu extends bkdx implements bkfe {

    /* renamed from: a */
    SelectorView f95443a;

    /* renamed from: b */
    TextView f95444b;

    /* renamed from: c */
    ImageWithCaptionView f95445c;

    /* renamed from: d */
    bmaw f95446d;

    /* renamed from: e */
    public awzt f95447e;

    /* renamed from: f */
    private final bkip f95448f = new bkip();

    /* renamed from: g */
    private String f95449g;

    /* renamed from: h */
    private final bjes f95450h = new bjes(9);

    /* renamed from: a */
    public static awzu m81821a(bmbd bmbd, Account account, int i, String str, LogContext logContext) {
        awzu awzu = new awzu();
        Bundle a = bkdx.m105383a(i, bmbd, logContext);
        a.putParcelable("currentAccount", account);
        a.putString("analyticsSessionId", str);
        awzu.setArguments(a);
        return awzu;
    }

    /* renamed from: B */
    public final boolean mo52723B() {
        int childCount = this.f95443a.getChildCount();
        bkfr.m105567a(this.f95443a, getResources().getQuantityString(C0126R.plurals.wallet_expanding_account_selector, childCount, Integer.valueOf(childCount)));
        return true;
    }

    /* renamed from: C */
    public final void mo52724C() {
        TextView textView = this.f95444b;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: D */
    public final void mo52725D() {
        TextView textView = this.f95444b;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        return false;
    }

    /* renamed from: b */
    public final String mo52922b(String str) {
        return this.f95446d.f128514d;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        return true;
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f95448f;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return new ArrayList(0);
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return new ArrayList();
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f95450h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        SelectorView selectorView = this.f95443a;
        if (selectorView != null) {
            selectorView.setEnabled(this.f124195aJ);
        }
        ImageWithCaptionView imageWithCaptionView = this.f95445c;
        if (imageWithCaptionView != null) {
            imageWithCaptionView.setEnabled(this.f124195aJ);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f95449g = getArguments().getString("analyticsSessionId");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bjvp.m104736a(bundle, "selectedAccount", this.f95446d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmbd.f128525j.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmbd) this.f124069w).f128528b;
        return bmdn == null ? bmdn.f128831k : bmdn;
    }

    /* renamed from: z */
    public final void mo52731z() {
    }

    /* renamed from: a */
    private final void m81822a(Context context, bmaw bmaw) {
        bmno bmno;
        bmno bmno2;
        bmbd bmbd = (bmbd) this.f124069w;
        if ((bmbd.f128527a & 2) != 0) {
            bmno = bmbd.f128529c;
            if (bmno == null) {
                bmno = bmno.f130138m;
            }
        } else {
            bmno = null;
        }
        bxvv<bmbc> bxvv = new bxvv(((bmbd) this.f124069w).f128534h, bmbd.f128524i);
        awzv awzv = new awzv(context);
        for (bmbc bmbc : bxvv) {
            bmbc bmbc2 = bmbc.UNKNOWN;
            int ordinal = bmbc.ordinal();
            if (ordinal == 1) {
                awzv.f95451a = true;
            } else if (ordinal == 2) {
                awzv.f95452b = true;
            } else if (ordinal == 3) {
                awzv.f95453c = true;
            }
        }
        awzv.f95454d = bmno;
        awzv.f124136q = bmaw;
        int[] iArr = {C0126R.attr.accountOptionTextPrimary, C0126R.attr.accountOptionTextPrimaryGoogleSans, C0126R.attr.accountOptionTextSecondaryGoogleSans};
        Arrays.sort(iArr);
        TypedArray obtainStyledAttributes = awzv.getContext().obtainStyledAttributes((AttributeSet) null, iArr);
        int resourceId = obtainStyledAttributes.getResourceId(Arrays.binarySearch(iArr, (int) C0126R.attr.accountOptionTextPrimary), 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(Arrays.binarySearch(iArr, (int) C0126R.attr.accountOptionTextPrimaryGoogleSans), 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(Arrays.binarySearch(iArr, (int) C0126R.attr.accountOptionTextSecondaryGoogleSans), 0);
        obtainStyledAttributes.recycle();
        if (!awzv.f95451a || bmaw.f128513c.isEmpty()) {
            awzv.f95456f.setVisibility(8);
            TextView textView = awzv.f95457g;
            Context context2 = awzv.getContext();
            if (bkfr.m105618g(awzv.getContext())) {
                resourceId = resourceId2;
            }
            textView.setTextAppearance(context2, resourceId);
        } else {
            awzv.f95456f.setText(bmaw.f128513c);
            if (bkfr.m105618g(awzv.getContext())) {
                awzv.f95456f.setTextAppearance(awzv.getContext(), resourceId2);
                awzv.f95457g.setTextAppearance(awzv.getContext(), resourceId3);
            }
        }
        awzv.f95457g.setText(bmaw.f128514d);
        if (awzv.f95452b) {
            ImageWithCaptionView imageWithCaptionView = awzv.f95455e;
            bmaw bmaw2 = (bmaw) awzv.f124136q;
            if ((bmaw2.f128511a & 8) == 0) {
                bmno2 = awzv.f95454d;
            } else {
                bmno2 = bmaw2.f128515e;
                if (bmno2 == null) {
                    bmno2 = bmno.f130138m;
                }
            }
            imageWithCaptionView.mo71992a(bmno2, awia.m79973a(), ((Boolean) bjwd.f123461a.mo54082a()).booleanValue());
            awzv.f95455e.setVisibility(0);
        }
        if (awzv.f95453c) {
            awzv.f124130k.setVisibility(0);
        }
        if (!awzv.f95452b && !awzv.f95453c) {
            awzv.findViewById(C0126R.C0129id.image_and_radio_button_container).setVisibility(8);
        }
        awzv.mo65945a(bmaw.f128512b);
        if ((((bmbd) this.f124069w).f128527a & 4) == 0) {
            awzv.findViewById(C0126R.C0129id.brand_image_spacer).setVisibility(8);
        }
        this.f95443a.addView(awzv);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awzu.a(android.content.Context, bmaw):void
     arg types: [com.google.android.chimera.Activity, bmaw]
     candidates:
      awzu.a(java.lang.Object, java.lang.Object):void
      bkdx.a(android.os.Bundle, android.view.View):android.view.View
      bkdx.a(int, android.os.Bundle):void
      bkdx.a(bmmv, java.util.List):void
      bkdx.a(java.util.List, boolean):boolean
      bkge.a(android.os.Bundle, android.view.View):android.view.View
      bkge.a(int, android.os.Bundle):void
      bkge.a(android.view.View, java.lang.String):void
      bkbr.a(int, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      bkbr.a(android.os.Bundle, android.view.View):android.view.View
      bjxu.a(android.view.View, java.lang.String):void
      bkdb.a(int, android.os.Bundle):void
      bjwm.a(bmmv, java.util.List):void
      bkfe.a(java.lang.Object, java.lang.Object):void
      awzu.a(android.content.Context, bmaw):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bmno bmno = null;
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_account_selector, (ViewGroup) null, false);
        SelectorView selectorView = (SelectorView) inflate.findViewById(C0126R.C0129id.account_selector_view);
        this.f95443a = selectorView;
        this.f95448f.mo66032a((bkiq) selectorView);
        SelectorView selectorView2 = this.f95443a;
        selectorView2.f152209e = this;
        selectorView2.f152210f = this;
        selectorView2.f152212h = mo65980at();
        this.f95443a.f152211g = mo52837W();
        bmdn r = mo52789r();
        if (r != null && !r.f128837e.isEmpty()) {
            TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.account_selector_header);
            this.f95444b = textView;
            textView.setText(r.f128837e);
            this.f95444b.setTag(C0126R.C0129id.summary_expander_transition_name, "expandedField");
        }
        if ((((bmbd) this.f124069w).f128527a & 4) != 0) {
            ImageWithCaptionView imageWithCaptionView = (ImageWithCaptionView) inflate.findViewById(C0126R.C0129id.brand_icon);
            this.f95445c = imageWithCaptionView;
            bmbd bmbd = (bmbd) this.f124069w;
            if ((bmbd.f128527a & 4) != 0 && (bmno = bmbd.f128530d) == null) {
                bmno = bmno.f130138m;
            }
            imageWithCaptionView.mo71992a(bmno, awia.m79973a(), ((Boolean) awir.f94488a.mo58455c()).booleanValue());
            this.f95445c.setVisibility(0);
        }
        if (!this.f124071y) {
            inflate.findViewById(C0126R.C0129id.bottom_separator).setVisibility(8);
        }
        if (bundle == null) {
            Account account = (Account) getArguments().getParcelable("currentAccount");
            bxwc bxwc = ((bmbd) this.f124069w).f128531e;
            int size = bxwc.size();
            int i = 0;
            while (i < size) {
                bmaw bmaw = (bmaw) bxwc.get(i);
                if (!account.name.equals(bmaw.f128514d) || !account.type.equals("com.google")) {
                    i++;
                } else {
                    this.f95446d = bmaw;
                }
            }
            String valueOf = String.valueOf(account);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("Invalid account");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        this.f95446d = (bmaw) bjvp.m104730a(bundle, "selectedAccount", (bxxk) bmaw.f128509f.mo74142c(7));
        bmaw bmaw2 = this.f95446d;
        this.f95443a.removeAllViews();
        Activity activity = getActivity();
        int size2 = ((bmbd) this.f124069w).f128531e.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                i2 = -1;
                break;
            }
            bmaw bmaw3 = (bmaw) ((bmbd) this.f124069w).f128531e.get(i2);
            if (bmaw3.f128514d.equals(bmaw2.f128514d)) {
                m81822a((Context) activity, bmaw3);
                break;
            }
            i2++;
        }
        for (int i3 = 0; i3 < size2; i3++) {
            if (i3 != i2) {
                m81822a((Context) activity, (bmaw) ((bmbd) this.f124069w).f128531e.get(i3));
            }
        }
        this.f95443a.mo72096a(bmaw2.f128512b);
        return inflate;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo52728a(Object obj, Object obj2) {
        bmaw bmaw = (bmaw) obj;
        bmaw bmaw2 = (bmaw) obj2;
        if (bmaw2 == null || bmaw.f128512b != bmaw2.f128512b) {
            if (bmaw2 != null) {
                OrchestrationViewEvent.m93827b(getActivity(), this.f95449g, this.f95450h);
            }
            this.f95446d = bmaw;
            awzt awzt = this.f95447e;
            if (awzt != null) {
                awzt.mo52046a(new Account(this.f95446d.f128514d, "com.google"));
            }
        }
    }
}
