package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.smart_profile.card.view.BaseCardView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: aqpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqpw implements aqqr, aqrp, aqsl, aqql {

    /* renamed from: A */
    public tgh f86530A;

    /* renamed from: B */
    public tgl f86531B;

    /* renamed from: C */
    public tgx f86532C;

    /* renamed from: D */
    public tfv f86533D;

    /* renamed from: E */
    public tgr f86534E;

    /* renamed from: F */
    private final aqrq f86535F;

    /* renamed from: G */
    private boolean f86536G;

    /* renamed from: H */
    private boolean f86537H;

    /* renamed from: I */
    private String f86538I;

    /* renamed from: J */
    private aqtg f86539J;

    /* renamed from: K */
    private tfm f86540K;

    /* renamed from: a */
    public final Context f86541a;

    /* renamed from: b */
    public final ClientContext f86542b;

    /* renamed from: c */
    public final ViewGroup f86543c;

    /* renamed from: d */
    public final List f86544d = new ArrayList();

    /* renamed from: e */
    public final List f86545e = new ArrayList();

    /* renamed from: f */
    public final List f86546f = new ArrayList();

    /* renamed from: g */
    public final Set f86547g = new HashSet();

    /* renamed from: h */
    public final tie f86548h;

    /* renamed from: i */
    public final String f86549i;

    /* renamed from: j */
    public final String f86550j;

    /* renamed from: k */
    public final String f86551k;

    /* renamed from: l */
    public final Activity f86552l;

    /* renamed from: m */
    public final tim f86553m;

    /* renamed from: n */
    public ArrayList f86554n = new ArrayList();

    /* renamed from: o */
    public Bundle f86555o;

    /* renamed from: p */
    public boolean f86556p;

    /* renamed from: q */
    public boolean f86557q;

    /* renamed from: r */
    public aqsm f86558r;

    /* renamed from: s */
    public aqpz f86559s;

    /* renamed from: t */
    public aqpz f86560t;

    /* renamed from: u */
    public aqpz f86561u;

    /* renamed from: v */
    public aqpz f86562v;

    /* renamed from: w */
    public aqpz f86563w;

    /* renamed from: x */
    public tfg f86564x;

    /* renamed from: y */
    public tfy f86565y;

    /* renamed from: z */
    public tgd f86566z;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public aqpw(Activity activity, Context context, ClientContext clientContext, aqrq aqrq, ViewGroup viewGroup, tie tie, String str, String str2, String str3, tim tim, Bundle bundle) {
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        View view8;
        View view9;
        View view10;
        View view11;
        Bundle extras;
        int[] intArray;
        Activity activity2 = activity;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        tie tie2 = tie;
        String str4 = str;
        String str5 = str3;
        tim tim2 = tim;
        Bundle bundle2 = bundle;
        this.f86552l = activity2;
        this.f86541a = context2;
        this.f86542b = clientContext;
        this.f86535F = aqrq;
        this.f86543c = viewGroup2;
        this.f86548h = tie2;
        this.f86549i = str4;
        this.f86550j = str2;
        this.f86551k = str5;
        this.f86553m = tim2;
        if (!(!cgoo.m146350b() || activity.getIntent() == null || (extras = activity.getIntent().getExtras()) == null || !extras.containsKey("com.google.android.gms.people.smart_profile.HIDE_THESE_CARDS") || (intArray = extras.getIntArray("com.google.android.gms.people.smart_profile.HIDE_THESE_CARDS")) == null)) {
            for (int i : intArray) {
                this.f86547g.add(Integer.valueOf(i));
            }
        }
        if (bundle2 != null) {
            this.f86555o = bundle2.getBundle("cardsController");
            this.f86554n = bundle2.getParcelableArrayList("genericCardsController");
        }
        if (this.f86555o == null) {
            this.f86555o = new Bundle();
        }
        if (this.f86554n == null) {
            this.f86554n = new ArrayList();
        }
        this.f86559s = new aqpz(context2, viewGroup2, tim2);
        this.f86560t = new aqpz(context2, viewGroup2, tim2);
        this.f86561u = new aqpz(context2, viewGroup2, tim2);
        this.f86562v = new aqpz(context2, viewGroup2, tim2);
        this.f86563w = new aqpz(context2, viewGroup2, tim2);
        if (cgnz.m146325b()) {
            this.f86560t.mo48059a(context2.getString(C0126R.string.gm_contact_info_section_label));
        } else {
            this.f86560t.mo48059a(context2.getString(C0126R.string.contact_info_section_label));
        }
        this.f86563w.mo48059a(context2.getString(C0126R.string.merge_duplicates_section_label));
        viewGroup2.addView(this.f86559s.f86573a, viewGroup.getChildCount() - 1);
        viewGroup2.addView(this.f86560t.f86573a, viewGroup.getChildCount() - 1);
        viewGroup2.addView(this.f86561u.f86573a, viewGroup.getChildCount() - 1);
        viewGroup2.addView(this.f86562v.f86573a, viewGroup.getChildCount() - 1);
        viewGroup2.addView(this.f86563w.f86573a, viewGroup.getChildCount() - 1);
        if (cgnz.m146325b()) {
            viewGroup2.setBackgroundColor(thh.m36964a(context));
            View inflate = LayoutInflater.from(context).inflate((int) C0126R.C0128layout.gm_about_card_view, viewGroup2, false);
            View inflate2 = LayoutInflater.from(context).inflate((int) C0126R.C0128layout.gm_contact_info_card_view, viewGroup2, false);
            View view12 = null;
            if (!cgoi.m146341b()) {
                view = LayoutInflater.from(context).inflate((int) C0126R.C0128layout.gm_photos_card_view, viewGroup2, false);
            } else {
                view = null;
            }
            View inflate3 = LayoutInflater.from(context).inflate((int) C0126R.C0128layout.gm_posts_card_view, viewGroup2, false);
            View inflate4 = LayoutInflater.from(context).inflate((int) C0126R.C0128layout.gm_recent_interactions_card_view, viewGroup2, false);
            view12 = !cgof.m146336b() ? LayoutInflater.from(context).inflate((int) C0126R.C0128layout.gm_related_people_card_view, viewGroup2, false) : view12;
            View inflate5 = LayoutInflater.from(context).inflate((int) C0126R.C0128layout.gm_shared_current_location_card_view, viewGroup2, false);
            View inflate6 = LayoutInflater.from(context).inflate((int) C0126R.C0128layout.gm_organizations_card_view, viewGroup2, false);
            if (cgmy.m146224c()) {
                view2 = inflate6;
                view3 = LayoutInflater.from(context).inflate((int) C0126R.C0128layout.gm_reporting_chain_card_bugfix, viewGroup2, false);
            } else {
                view2 = inflate6;
                view3 = LayoutInflater.from(context).inflate((int) C0126R.C0128layout.gm_reporting_chain_card, viewGroup2, false);
            }
            this.f86564x = new tfg(inflate, tie2, tim2);
            this.f86540K = new tfm(inflate2, str4, tim2);
            if (!cgoi.m146341b()) {
                this.f86565y = new tfy(view, tie2, tim2);
            }
            this.f86566z = new tgd(inflate3, tie2, tim2);
            this.f86530A = new tgh(inflate4, str4, str5, tim2);
            if (!cgof.m146336b()) {
                view5 = view;
                view10 = inflate5;
                view7 = inflate4;
                view9 = view2;
                view6 = inflate3;
                view8 = view12;
                view4 = inflate;
                view11 = view3;
                this.f86531B = new tgl(view12, activity, str3, tie, tim);
            } else {
                view8 = view12;
                view4 = inflate;
                view5 = view;
                view10 = inflate5;
                view11 = view3;
                view7 = inflate4;
                view9 = view2;
                view6 = inflate3;
            }
            this.f86532C = new tgx(view10, tie2, tim2);
            this.f86533D = new tfv(view9, tim2);
            this.f86534E = new tgr(view11, tim2, tie2, new aqpr(activity2, str5));
            this.f86560t.mo48058a(inflate2, tin.m37041a(tio.SMART_PROFILE_CONTACT_DETAILS_CARD));
            this.f86561u.mo48058a(view11, tin.m37041a(tio.REPORTING_CHAIN_CARD));
            this.f86561u.mo48058a(view4, tin.m37041a(tio.SMART_PROFILE_ABOUT_CARD));
            this.f86561u.mo48058a(view9, tin.m37041a(tio.SMART_PROFILE_ORGANIZATIONS_CARD));
            this.f86561u.mo48058a(view6, tin.m37041a(tio.SMART_PROFILE_GOOGLE_PLUS_POSTS_CARD));
            this.f86562v.mo48058a(view7, tin.m37041a(tio.SMART_PROFILE_RECENT_INTERACTIONS_CARD));
            this.f86562v.mo48058a(view10, tin.m37041a(tio.SMART_PROFILE_CURRENT_LOCATION_CARD));
            if (!cgoi.m146341b()) {
                this.f86562v.mo48058a(view5, tin.m37041a(tio.SMART_PROFILE_PHOTOS_CARD));
            }
            if (!cgof.m146336b()) {
                this.f86562v.mo48058a(view8, tin.m37041a(tio.SMART_PROFILE_PEOPLE_IN_COMMON_CARD));
            }
        }
    }

    /* renamed from: g */
    private final void m71939g() {
        if (this.f86538I != null) {
            aqpz[] aqpzArr = {this.f86560t, this.f86561u, this.f86562v, this.f86563w};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 4; i++) {
                aqpz aqpz = aqpzArr[i];
                if (aqpz.mo48063e()) {
                    arrayList.add(aqpz);
                }
            }
            int i2 = 0;
            while (i2 < arrayList.size()) {
                aqpz aqpz2 = (aqpz) arrayList.get(i2);
                i2++;
                int size = arrayList.size();
                TextView textView = (TextView) aqpz2.f86573a.findViewById(C0126R.C0129id.title);
                textView.setContentDescription(aqpz2.f86573a.getContext().getString(C0126R.string.section_label_content_description, Integer.valueOf(i2), Integer.valueOf(size), textView.getText().toString()));
            }
        }
    }

    /* renamed from: a */
    public final void mo48045a() {
        this.f86556p = false;
        this.f86557q = false;
        if (!cgnz.m146325b()) {
            this.f86561u.mo48056a();
            this.f86562v.mo48056a();
        }
        this.f86561u.mo48062d();
        this.f86562v.mo48062d();
        this.f86563w.mo48056a();
        this.f86563w.mo48062d();
    }

    /* renamed from: b */
    public final void mo48050b() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(cgor.f187408a.mo6606a().mo84192a()));
        this.f86543c.findViewById(C0126R.C0129id.blocked_message_container).setVisibility(0);
        if (intent.resolveActivity(this.f86552l.getPackageManager()) != null) {
            this.f86543c.findViewById(C0126R.C0129id.learn_more).setOnClickListener(new aqps(this, intent));
        } else {
            this.f86543c.findViewById(C0126R.C0129id.learn_more).setVisibility(8);
        }
    }

    /* renamed from: c */
    public final void mo48051c() {
        if (this.f86560t.mo48063e()) {
            this.f86560t.mo48061c();
        }
        if (this.f86556p && this.f86557q && this.f86536G) {
            if (this.f86561u.mo48063e()) {
                this.f86561u.mo48061c();
            }
            if (this.f86537H) {
                this.f86562v.mo48062d();
            } else if (this.f86562v.mo48063e()) {
                this.f86562v.mo48061c();
            }
            if (this.f86563w.mo48063e()) {
                this.f86563w.mo48061c();
            }
            List list = this.f86544d;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((aqpv) list.get(i)).mo48044a();
            }
        }
        m71939g();
    }

    /* renamed from: d */
    public final void mo48052d() {
        aqrq aqrq = this.f86535F;
        aqrq.f86664a.clear();
        aqrq.f86665b.clear();
        aqrq.mo48115a();
        this.f86563w.mo48061c();
    }

    /* renamed from: e */
    public final void mo48053e() {
        this.f86563w.mo48062d();
    }

    /* renamed from: f */
    public final void mo48054f() {
        this.f86563w.mo48061c();
    }

    /* renamed from: a */
    public final void mo48046a(aqqs aqqs) {
        if (aqqs.mo48082b()) {
            this.f86538I = aqqs.f86615b;
        } else {
            this.f86538I = aqqs.mo48081a() ? aqqs.f86614a : aqqs.f86616c;
        }
        this.f86561u.mo48059a(this.f86541a.getString(C0126R.string.about_section_label, this.f86538I));
        this.f86562v.mo48059a(this.f86541a.getString(C0126R.string.shared_data_section_label, this.f86538I));
        m71939g();
    }

    /* renamed from: a */
    public final void mo48047a(ArrayList arrayList, ArrayList arrayList2) {
        aqrq aqrq = this.f86535F;
        aqrq.f86664a.clear();
        aqrq.f86664a.addAll(arrayList2);
        aqrq.f86665b.clear();
        aqrq.f86665b.addAll(arrayList);
        aqrq.mo48115a();
        this.f86563w.mo48062d();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final void mo48048a(List list, List list2, List list3) {
        boolean z;
        bmxv bmxv;
        boolean z2 = !list.isEmpty() || !list2.isEmpty() || !list3.isEmpty();
        if (cgoo.m146350b()) {
            z = !this.f86547g.contains(0);
        } else {
            z = true;
        }
        if (cgnz.m146325b()) {
            tfm tfm = this.f86540K;
            if (z) {
                thp thp = new thp(null);
                thp.f46040a = bmxv.m108566b(bngx.m109368a((Collection) list));
                thp.f46041b = bmxv.m108566b(bngx.m109368a((Collection) list2));
                thp.f46042c = bmxv.m108566b(bngx.m109368a((Collection) list3));
                bmxv = bmxv.m108566b(new thk(thp.f46040a, thp.f46041b, thp.f46042c));
            } else {
                bmxv = bmvz.f131120a;
            }
            tfm.mo2511a(bmxv);
        } else if (z2 && z) {
            if (this.f86539J == null) {
                BaseCardView baseCardView = (BaseCardView) LayoutInflater.from(this.f86541a).inflate((int) C0126R.C0128layout.card, this.f86543c, false);
                aqtg aqtg = new aqtg(this.f86541a, baseCardView, this.f86549i, this.f86553m, this.f86555o);
                this.f86539J = aqtg;
                this.f86545e.add(aqtg);
                this.f86560t.mo48058a(baseCardView, tin.m37041a(tio.SMART_PROFILE_CONTACT_DETAILS_CARD));
            }
            this.f86539J.mo48048a(list, list2, list3);
        }
        this.f86536G = true;
        mo48051c();
    }

    /* renamed from: a */
    public final void mo48049a(boolean z) {
        if (z) {
            this.f86537H = true;
            this.f86561u.mo48059a(this.f86541a.getString(C0126R.string.about_section_label, ""));
            this.f86562v.mo48062d();
            m71939g();
        }
    }
}
