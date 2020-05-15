package com.google.android.gms.wallet.p088ui.component.alert;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.google.android.gms.wallet.ui.component.alert.AlertView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AlertView extends CardView implements View.OnClickListener, bjwh {

    /* renamed from: g */
    ViewGroup f110496g;

    /* renamed from: h */
    ViewGroup f110497h;

    /* renamed from: i */
    ViewGroup f110498i;

    /* renamed from: j */
    ArrayList f110499j = new ArrayList();

    /* renamed from: k */
    boolean f110500k;

    /* renamed from: l */
    boolean f110501l;

    /* renamed from: m */
    atj f110502m;

    /* renamed from: n */
    TransitionDrawable f110503n;

    /* renamed from: o */
    bjxv f110504o;

    /* renamed from: p */
    public bjwk f110505p;

    /* renamed from: q */
    private bwhn f110506q;

    /* renamed from: r */
    private boolean f110507r;

    /* renamed from: s */
    private asw f110508s;

    /* renamed from: t */
    private Drawable f110509t;

    /* renamed from: u */
    private Drawable f110510u;

    /* renamed from: v */
    private boolean f110511v = false;

    /* renamed from: w */
    private Activity f110512w;

    /* renamed from: x */
    private bkdb f110513x;

    /* renamed from: y */
    private int f110514y = 1;

    public AlertView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m94221a(boolean z) {
        boolean z2 = true;
        int i = 0;
        if (this.f110514y == 2 || (!this.f110507r && this.f110500k)) {
            z2 = false;
        }
        if (z2 != this.f110511v) {
            if (m94228k()) {
                if (z) {
                    i = 400;
                }
                if (!z2) {
                    m94225h().reverseTransition(i);
                } else {
                    m94225h().startTransition(i);
                }
            } else {
                C1280ps.m19890a(this, !z2 ? m94227j() : m94226i());
            }
            this.f110511v = z2;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.wallet.ui.component.alert.AlertView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.wallet.ui.component.alert.AlertMessageView.a(bwhs, bjxv, bkdb, boolean):void
     arg types: [bwhs, bjxv, bkdb, int]
     candidates:
      com.google.android.gms.wallet.ui.component.alert.AlertMessageView.a(bwhs, int, android.view.LayoutInflater, bjxv):void
      com.google.android.gms.wallet.ui.component.alert.AlertMessageView.a(bwhs, bjxv, bkdb, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.LinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: e */
    private final void m94222e() {
        bmno bmno;
        LayoutInflater from = LayoutInflater.from(getContext());
        setVisibility(0);
        removeAllViews();
        this.f110504o.mo65616b();
        this.f110499j.clear();
        bmnr bmnr = null;
        this.f110496g = null;
        this.f110497h = null;
        this.f110498i = null;
        int size = this.f110506q.f159534b.size();
        int i = 1;
        if (size == 1) {
            this.f110507r = true;
            bwhn bwhn = this.f110506q;
            bkdb bkdb = this.f110513x;
            AlertMessageView alertMessageView = (AlertMessageView) from.inflate((int) C0126R.C0128layout.wallet_view_alert_message, (ViewGroup) this, false);
            alertMessageView.f110492h = this.f110505p;
            alertMessageView.mo60076a((bwhs) bwhn.f159534b.get(0), this.f110504o, bkdb, true);
            alertMessageView.setId(this.f110504o.mo65614a());
            this.f110499j.add(alertMessageView);
            this.f110496g = alertMessageView;
            addView(alertMessageView);
            int a = bwhq.m121971a(((bwhs) this.f110506q.f159534b.get(0)).f159560g);
            if (a != 0) {
                i = a;
            }
            this.f110514y = i;
        } else if (size > 1) {
            bwhn bwhn2 = this.f110506q;
            AlertHeaderView alertHeaderView = (AlertHeaderView) from.inflate((int) C0126R.C0128layout.wallet_view_alert_header, (ViewGroup) this, false);
            bwhr bwhr = bwhn2.f159535c;
            if (bwhr == null) {
                bwhr = bwhr.f159545f;
            }
            bjxv bjxv = this.f110504o;
            ImageWithCaptionView imageWithCaptionView = alertHeaderView.f110481a;
            if ((bwhr.f159547a & 4) != 0) {
                bmno = bwhr.f159550d;
                if (bmno == null) {
                    bmno = bmno.f130138m;
                }
            } else {
                bmno = null;
            }
            imageWithCaptionView.mo71991a(bmno);
            InfoMessageView infoMessageView = alertHeaderView.f110482b;
            if ((bwhr.f159547a & 1) != 0 && (bmnr = bwhr.f159548b) == null) {
                bmnr = bmnr.f130153o;
            }
            infoMessageView.mo72006b(bmnr);
            alertHeaderView.f110482b.setId(bjxv.mo65614a());
            alertHeaderView.f110483c.setVisibility(0);
            alertHeaderView.f110484d.setVisibility(8);
            int a2 = bwhq.m121971a(bwhr.f159551e);
            if (a2 == 0) {
                a2 = 1;
            }
            int i2 = a2 - 1;
            if (i2 == 2 || i2 == 3) {
                ColorStateList d = bkfr.m105605d(alertHeaderView.getContext());
                alertHeaderView.f110481a.f152075m = d;
                alertHeaderView.f110482b.mo72000a(alertHeaderView.getResources().getColor(17170443));
                bkfr.m105572a(alertHeaderView.f110483c, d);
            } else {
                alertHeaderView.f110481a.f152075m = bkfr.m105587b(bkfr.m105542a(alertHeaderView.getContext(), (int) C0126R.attr.colorAccent));
                bkfr.m105572a(alertHeaderView.f110483c, bkfr.m105601c(alertHeaderView.getContext(), 16842808));
            }
            alertHeaderView.setId(this.f110504o.mo65614a());
            alertHeaderView.setOnClickListener(this);
            alertHeaderView.setTag(C0126R.C0129id.summary_expander_transition_name, "summaryField");
            this.f110497h = alertHeaderView;
            bwhn bwhn3 = this.f110506q;
            bkdb bkdb2 = this.f110513x;
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            linearLayout.setId(this.f110504o.mo65614a());
            AlertHeaderView alertHeaderView2 = (AlertHeaderView) from.inflate((int) C0126R.C0128layout.wallet_view_alert_header, (ViewGroup) linearLayout, false);
            bwhr bwhr2 = bwhn3.f159535c;
            if (bwhr2 == null) {
                bwhr2 = bwhr.f159545f;
            }
            bjxv bjxv2 = this.f110504o;
            if ((2 & bwhr2.f159547a) != 0) {
                InfoMessageView infoMessageView2 = alertHeaderView2.f110482b;
                bmnr bmnr2 = bwhr2.f159549c;
                if (bmnr2 == null) {
                    bmnr2 = bmnr.f130153o;
                }
                infoMessageView2.mo72006b(bmnr2);
            } else {
                alertHeaderView2.f110482b.setVisibility(8);
            }
            alertHeaderView2.f110482b.setId(bjxv2.mo65614a());
            alertHeaderView2.f110483c.setVisibility(8);
            alertHeaderView2.f110484d.setVisibility(0);
            alertHeaderView2.setId(this.f110504o.mo65614a());
            alertHeaderView2.setOnClickListener(this);
            alertHeaderView2.setTag(C0126R.C0129id.summary_expander_transition_name, "expandedField");
            linearLayout.addView(alertHeaderView2);
            bxwc bxwc = bwhn3.f159534b;
            int size2 = bxwc.size();
            for (int i3 = 0; i3 < size2; i3++) {
                AlertMessageView alertMessageView2 = (AlertMessageView) from.inflate((int) C0126R.C0128layout.wallet_view_alert_message, (ViewGroup) linearLayout, false);
                alertMessageView2.f110492h = this.f110505p;
                alertMessageView2.mo60076a((bwhs) bxwc.get(i3), this.f110504o, bkdb2, false);
                alertMessageView2.setId(this.f110504o.mo65614a());
                alertMessageView2.setTag(C0126R.C0129id.summary_expander_transition_name, "expandedField");
                this.f110499j.add(alertMessageView2);
                linearLayout.addView(alertMessageView2);
            }
            this.f110498i = linearLayout;
            addView(this.f110497h);
            addView(this.f110498i);
            if (!this.f110501l) {
                this.f110500k = this.f110506q.f159536d;
            }
            m94223f();
            bwhr bwhr3 = this.f110506q.f159535c;
            if (bwhr3 == null) {
                bwhr3 = bwhr.f159545f;
            }
            int a3 = bwhq.m121971a(bwhr3.f159551e);
            if (a3 != 0) {
                i = a3;
            }
            this.f110514y = i;
        } else {
            setVisibility(8);
        }
    }

    /* renamed from: f */
    private final void m94223f() {
        if (this.f110500k) {
            this.f110497h.setVisibility(8);
            this.f110498i.setVisibility(0);
            bkfr.m105569a(this.f110498i, 0);
            return;
        }
        this.f110497h.setVisibility(0);
        this.f110498i.setVisibility(8);
        bkfr.m105569a(this.f110498i, 8);
    }

    /* renamed from: g */
    private final atj m94224g() {
        View findViewById;
        if (this.f110502m == null && (findViewById = this.f110512w.findViewById(16908290)) != null) {
            this.f110502m = new atj();
            asw asw = new asw((ViewGroup) findViewById);
            this.f110508s = asw;
            asw.f2143b = new axaa(this);
            this.f110502m.mo2489a(this.f110508s, bkfr.m105551a());
        }
        return this.f110502m;
    }

    /* renamed from: h */
    private final TransitionDrawable m94225h() {
        if (this.f110503n == null) {
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{m94227j(), m94226i()});
            this.f110503n = transitionDrawable;
            C1280ps.m19890a(this, transitionDrawable);
        }
        return this.f110503n;
    }

    /* renamed from: i */
    private final Drawable m94226i() {
        if (this.f110509t == null) {
            Drawable mutate = new CardView(getContext()).getBackground().mutate();
            int i = Build.VERSION.SDK_INT;
            this.f110509t = mutate;
            C1173lt.m19601a(this.f110509t, bkfr.m105587b(bkfr.m105542a(getContext(), (int) C0126R.attr.walletCardViewPageErrorColor)));
        }
        return this.f110509t;
    }

    /* renamed from: j */
    private final Drawable m94227j() {
        if (this.f110510u == null) {
            Drawable mutate = new CardView(getContext()).getBackground().mutate();
            int i = Build.VERSION.SDK_INT;
            this.f110510u = mutate;
        }
        return this.f110510u;
    }

    /* renamed from: k */
    private final boolean m94228k() {
        return bkfr.m105612e(this.f110512w) && m94224g() != null;
    }

    /* renamed from: bY */
    public final void mo52947bY() {
        int size = this.f110499j.size();
        for (int i = 0; i < size; i++) {
            ((AlertMessageView) this.f110499j.get(i)).mo52947bY();
        }
    }

    /* renamed from: d */
    public final void mo60082d() {
        this.f110500k = !this.f110500k;
        this.f110501l = true;
        m94223f();
    }

    public void onClick(View view) {
        if (m94228k()) {
            m94224g().mo2488a(this.f110508s);
        } else {
            mo60082d();
        }
        m94221a(true);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("parentState"));
            if (!this.f110507r) {
                this.f110500k = bundle.getBoolean("viewIsExpanded");
                this.f110501l = bundle.getBoolean("expandedStateSetByUser");
                this.f110511v = bundle.getBoolean("showingWarningColorBackground");
                if (this.f110500k != this.f110506q.f159536d) {
                    m94223f();
                    m94221a(false);
                    return;
                }
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        bundle.putBoolean("viewIsExpanded", this.f110500k);
        bundle.putBoolean("expandedStateSetByUser", this.f110501l);
        bundle.putBoolean("showingWarningColorBackground", this.f110511v);
        return bundle;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        ViewGroup viewGroup = this.f110496g;
        if (viewGroup != null) {
            viewGroup.setEnabled(z);
        }
        ViewGroup viewGroup2 = this.f110497h;
        if (viewGroup2 != null) {
            viewGroup2.setEnabled(z);
            this.f110498i.setEnabled(z);
            bkfr.m105570a(this.f110498i, z);
        }
    }

    public AlertView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AlertView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo60080a(bwhc bwhc, bwhn bwhn) {
        int a = bwhb.m121956a(bwhc.f159489b);
        int i = 1;
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 1) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            int a2 = bwhb.m121956a(bwhc.f159489b);
            if (a2 != 0) {
                i = a2;
            }
            objArr[0] = Integer.toString(i - 1);
            throw new IllegalArgumentException(String.format(locale, "AlertView does not support partial page update type: %s", objArr));
        }
        mo52947bY();
        this.f110506q = bwhn;
        m94222e();
        m94221a(true);
    }

    /* renamed from: a */
    public final void mo60081a(bwhn bwhn, Activity activity, bjxv bjxv, bkdb bkdb) {
        this.f110506q = bwhn;
        this.f110512w = activity;
        this.f110504o = bjxv;
        this.f110513x = bkdb;
        m94222e();
        m94221a(false);
    }
}
