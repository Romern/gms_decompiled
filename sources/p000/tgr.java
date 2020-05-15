package p000;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.contactsheet.card.common.CardButton;
import com.google.android.gms.contactsheet.card.common.ExpandableLinearLayout;
import java.util.Iterator;

/* renamed from: tgr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tgr implements C0038ax {

    /* renamed from: a */
    public final tim f45955a;

    /* renamed from: b */
    public final View f45956b;

    /* renamed from: c */
    public final ExpandableLinearLayout f45957c;

    /* renamed from: d */
    public final int f45958d;

    /* renamed from: e */
    public final int f45959e;

    /* renamed from: f */
    public int f45960f = this.f45958d;

    /* renamed from: g */
    public final aqpr f45961g;

    /* renamed from: h */
    private final tie f45962h;

    /* renamed from: i */
    private final TextView f45963i;

    /* renamed from: j */
    private final View f45964j;

    /* renamed from: k */
    private final TextView f45965k;

    /* renamed from: l */
    private final TextView f45966l;

    /* renamed from: m */
    private final CardButton f45967m;

    /* renamed from: n */
    private final int f45968n;

    /* renamed from: o */
    private int f45969o;

    /* renamed from: p */
    private int f45970p;

    /* renamed from: q */
    private boolean f45971q;

    /* renamed from: r */
    private final LinearLayout.LayoutParams f45972r;

    public tgr(View view, tim tim, tie tie, aqpr aqpr) {
        this.f45956b = view;
        this.f45955a = tim;
        this.f45962h = tie;
        this.f45961g = aqpr;
        this.f45958d = view.getResources().getInteger(C0126R.integer.reporting_chain_report_rows_when_collapsed);
        this.f45959e = view.getResources().getInteger(C0126R.integer.reporting_chain_max_num_rows_to_expand_at_once);
        this.f45968n = view.getResources().getInteger(C0126R.integer.reporting_chain_entries_per_row);
        this.f45963i = (TextView) view.findViewById(C0126R.C0129id.manager_title);
        this.f45964j = view.findViewById(C0126R.C0129id.manager_entry);
        this.f45965k = (TextView) view.findViewById(C0126R.C0129id.reports_title);
        this.f45957c = (ExpandableLinearLayout) view.findViewById(C0126R.C0129id.report_list);
        this.f45967m = (CardButton) view.findViewById(C0126R.C0129id.card_button);
        this.f45966l = (TextView) view.findViewById(C0126R.C0129id.warning_message);
        if (cgmy.m146224c()) {
            C1334rs.m20107b(this.f45966l, C1391tv.m20459b(view.getContext(), C0126R.C0127drawable.quantum_ic_error_vd_theme_24), null, null, null);
        }
        this.f45972r = new LinearLayout.LayoutParams(0, -2, 1.0f);
        view.setVisibility(8);
    }

    /* renamed from: a */
    private final thb m36944a(bzjn bzjn) {
        thb a = thb.m36953a();
        a.mo26507b();
        a.f46006i = new tgp(this, bzjn);
        int i = bzjn.f170313a;
        if ((i & 1) != 0) {
            a.f45998a = bzjn.f170314b;
        }
        if ((i & 8) != 0) {
            a.f45999b = bzjn.f170317e;
        }
        return a;
    }

    /* renamed from: a */
    private final void m36945a(String str, View view) {
        String str2;
        tie tie = this.f45962h;
        if (!TextUtils.isEmpty(str)) {
            str2 = tey.m36894b(str);
        } else {
            str2 = cgnq.m146307b();
        }
        String a = rzi.m34705a(str2, this.f45956b.getResources().getDimensionPixelSize(C0126R.dimen.gm_card_avatar_diameter));
        int i = this.f45969o;
        this.f45969o = i + 1;
        tie.mo26557a(a, i, new tgq(this, view));
    }

    /* renamed from: a */
    public final void mo26497a() {
        this.f45957c.mo18006a(this.f45960f);
        if (cgnz.m146325b() && cgmy.f187331a.mo6606a().mo84136g()) {
            this.f45966l.setVisibility(8);
        }
        if (this.f45957c.getChildCount() <= this.f45958d) {
            this.f45967m.setVisibility(8);
        } else if (this.f45957c.getChildCount() == this.f45960f) {
            this.f45967m.mo18001b();
            this.f45967m.setOnClickListener(new tgm(this));
            if (this.f45971q) {
                this.f45966l.setVisibility(0);
            }
        } else if (this.f45957c.getChildCount() - this.f45960f <= this.f45959e) {
            this.f45967m.mo17998a();
            this.f45967m.mo18000a(this.f45956b.getContext().getString(C0126R.string.reporting_chain_all_reports, Integer.valueOf(this.f45970p)));
            this.f45967m.setOnClickListener(new tgn(this));
        } else {
            this.f45967m.mo17998a();
            this.f45967m.mo18000a(this.f45956b.getContext().getString(C0126R.string.reporting_chain_more_reports, Integer.valueOf(this.f45959e * this.f45968n)));
            this.f45967m.setOnClickListener(new tgo(this));
        }
    }

    /* renamed from: a */
    public final void mo2511a(bmxv bmxv) {
        boolean z;
        if (!bmxv.mo66813a() || ((((bzjo) bmxv.mo66814b()).f170320a & 1) == 0 && ((bzjo) bmxv.mo66814b()).f170322c.size() <= 0)) {
            this.f45956b.setVisibility(8);
            return;
        }
        this.f45969o = 400;
        this.f45956b.setVisibility(0);
        bzjo bzjo = (bzjo) bmxv.mo66814b();
        if ((bzjo.f170320a & 1) != 0) {
            this.f45963i.setVisibility(0);
            this.f45964j.setVisibility(0);
            bzjn bzjn = bzjo.f170321b;
            if (bzjn == null) {
                bzjn = bzjn.f170311f;
            }
            m36944a(bzjn).mo26506a(this.f45964j);
            bzjn bzjn2 = bzjo.f170321b;
            if (bzjn2 == null) {
                bzjn2 = bzjn.f170311f;
            }
            m36945a(bzjn2.f170316d, this.f45964j);
        } else {
            this.f45964j.setOnClickListener(null);
            this.f45964j.setVisibility(8);
            this.f45963i.setVisibility(8);
        }
        this.f45957c.removeAllViews();
        this.f45966l.setVisibility(8);
        if (bzjo.f170323d > bzjo.f170322c.size()) {
            z = true;
        } else {
            z = false;
        }
        this.f45971q = z;
        if (bzjo.f170322c.size() > 0) {
            this.f45970p = bzjo.f170322c.size();
            this.f45965k.setText(this.f45956b.getContext().getString(C0126R.string.reporting_chain_reports, Integer.valueOf(bzjo.f170323d)));
            this.f45965k.setVisibility(0);
            this.f45957c.setVisibility(0);
            Iterator it = bzjo.f170322c.iterator();
            while (it.hasNext()) {
                LinearLayout linearLayout = new LinearLayout(this.f45956b.getContext());
                linearLayout.setOrientation(0);
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                this.f45957c.addView(linearLayout);
                for (int i = 0; i < this.f45968n; i++) {
                    if (it.hasNext()) {
                        bzjn bzjn3 = (bzjn) it.next();
                        View a = m36944a(bzjn3).mo26505a(linearLayout.getContext(), linearLayout);
                        m36945a(bzjn3.f170316d, a);
                        a.setLayoutParams(this.f45972r);
                        linearLayout.addView(a);
                    } else {
                        View view = new View(this.f45956b.getContext());
                        view.setVisibility(4);
                        view.setLayoutParams(this.f45972r);
                        linearLayout.addView(view);
                    }
                }
            }
        } else {
            this.f45965k.setVisibility(8);
            this.f45957c.setVisibility(8);
        }
        mo26497a();
    }
}
