package com.google.android.gms.nearby.sharing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.support.p002v7.widget.RecyclerView;
import android.support.p002v7.widget.SearchView;
import android.support.p002v7.widget.SwitchCompat;
import android.support.p002v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.ArraySet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.Feature;
import com.google.android.gms.nearby.sharing.view.ExpandableView;
import com.google.android.gms.nearby.sharing.view.SelectionSlider;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContactSelectChimeraActivity extends deu implements ajum, ajwc {

    /* renamed from: b */
    public final Handler f80858b = new adzt();

    /* renamed from: c */
    public Runnable f80859c;

    /* renamed from: d */
    public SearchView f80860d;

    /* renamed from: e */
    public SelectionSlider f80861e;

    /* renamed from: f */
    public ajuy f80862f;

    /* renamed from: g */
    public View f80863g;

    /* renamed from: h */
    public ajuq f80864h;

    /* renamed from: i */
    public View f80865i;

    /* renamed from: j */
    public ajty f80866j;

    /* renamed from: k */
    private ExpandableView f80867k;

    /* renamed from: l */
    private View f80868l;

    /* renamed from: m */
    private View f80869m;

    /* renamed from: n */
    private RecyclerView f80870n;

    /* renamed from: o */
    private akjb f80871o;

    /* renamed from: p */
    private akjb f80872p;

    /* renamed from: q */
    private View f80873q;

    /* renamed from: r */
    private boolean f80874r = false;

    /* renamed from: s */
    private C0034at f80875s;

    /* renamed from: t */
    private final BroadcastReceiver f80876t = new aacn("nearby") {
        /* class com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.C16101 */

        /* renamed from: a */
        public final void mo6253a(Context context, Intent intent) {
            ContactSelectChimeraActivity.this.mo44410e();
        }
    };

    /* renamed from: a */
    public static Intent m67446a(Context context) {
        return new Intent().addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE).setClassName(context, "com.google.android.gms.nearby.sharing.ContactSelectActivity");
    }

    /* renamed from: b */
    private final void m67450b(int i) {
        String string = getString(C0126R.string.sharing_contact_select_receiver_explain_title);
        String string2 = getString(i);
        String string3 = getString(C0126R.string.sharing_contact_select_sender_explain_title);
        String string4 = getString(C0126R.string.sharing_contact_select_sender_explain);
        int length = String.valueOf(string).length();
        int length2 = String.valueOf(string2).length();
        StringBuilder sb = new StringBuilder(length + 1 + length2 + 2 + String.valueOf(string3).length() + 1 + String.valueOf(string4).length());
        sb.append(string);
        sb.append("\n");
        sb.append(string2);
        sb.append("\n\n");
        sb.append(string3);
        sb.append("\n");
        sb.append(string4);
        String sb2 = sb.toString();
        SpannableString spannableString = new SpannableString(sb2);
        m67447a(spannableString, 0, string.length());
        int indexOf = sb2.indexOf("\n\n") + 2;
        m67447a(spannableString, indexOf, string3.length() + indexOf);
        this.f80867k.f81147a.mo70844a(spannableString);
    }

    /* renamed from: h */
    private final boolean m67451h() {
        if (getCallingActivity() != null) {
            return getCallingActivity().getClassName().equals("com.google.android.gms.nearby.sharing.SetupActivity");
        }
        return false;
    }

    /* renamed from: e */
    public final void mo44410e() {
        int i;
        invalidateOptionsMenu();
        View findViewById = findViewById(C0126R.C0129id.nav_bar);
        if (!m67451h()) {
            i = 8;
        } else {
            i = 0;
        }
        findViewById.setVisibility(i);
        this.f80863g.setVisibility(8);
        this.f80865i.setVisibility(8);
        this.f80873q.setVisibility(0);
        this.f80866j.mo38910d().mo50373a(new ajiu(this));
    }

    /* renamed from: g */
    public final ajty mo44411g() {
        if (this.f80866j == null) {
            this.f80866j = ahcb.m55442c(this);
        }
        return this.f80866j;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1004) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (i2 != -1) {
            this.f80866j.mo38899a(0);
        }
        mo44410e();
    }

    public final void onBackPressed() {
        SearchView searchView = this.f80860d;
        if (!searchView.f1263p) {
            searchView.mo1618a(true);
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!cfov.m142066s()) {
            this.f80874r = true;
            finish();
            return;
        }
        setContentView((int) C0126R.C0128layout.sharing_activity_contact_select);
        this.f80868l = findViewById(C0126R.C0129id.visibility_hidden_description);
        this.f80869m = findViewById(C0126R.C0129id.contactbook_body);
        this.f80863g = findViewById(C0126R.C0129id.contacts_view);
        this.f80870n = (RecyclerView) findViewById(C0126R.C0129id.contactbook_list);
        this.f80873q = findViewById(C0126R.C0129id.loading_spinner);
        this.f80865i = findViewById(C0126R.C0129id.no_contacts_view);
        if (cfov.f185185a.mo6606a().mo82354bb()) {
            View[] viewArr = {this.f80863g, this.f80865i};
            for (int i = 0; i < 2; i++) {
                View view = viewArr[i];
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof TextView) {
                            ((TextView) childAt).setMovementMethod(new ScrollingMovementMethod());
                        }
                    }
                }
            }
        }
        mo8626a((Toolbar) findViewById(C0126R.C0129id.toolbar));
        boolean z = !m67451h();
        mo8628aW().mo15853b(z);
        mo8628aW().mo15846a(z);
        mo8628aW().mo15865f((int) C0126R.string.sharing_settings_home_as_up_description);
        this.f80866j = mo44411g();
        findViewById(C0126R.C0129id.continue_button).setOnClickListener(new ajio(this));
        this.f80870n.setLayoutManager(new aah());
        ajuq ajuq = new ajuq(this, this);
        ajuq.mo170a(true);
        this.f80864h = ajuq;
        this.f80870n.setAdapter(ajuq);
        akjb akjb = new akjb(this, C0126R.string.sharing_contact_select_recommended_contacts_header);
        this.f80871o = akjb;
        akjb.f72071a = -1;
        this.f80870n.addItemDecoration(akjb);
        akjb akjb2 = new akjb(this, C0126R.string.sharing_contact_select_alphabetical_contacts_header);
        this.f80872p = akjb2;
        akjb2.f72071a = 0;
        this.f80870n.addItemDecoration(akjb2);
        this.f80861e = (SelectionSlider) findViewById(C0126R.C0129id.visibility_slider);
        if (cfov.m142051d()) {
            ExpandableView expandableView = (ExpandableView) findViewById(C0126R.C0129id.visibilityDescView);
            this.f80867k = expandableView;
            expandableView.setVisibility(0);
            m67450b((int) C0126R.string.sharing_contact_select_receiver_explain_all_contacts);
        }
        ajuy ajuy = new ajuy(this, new ajiw(this));
        ajuy.mo38929a((Object) 1);
        ajuy.mo38929a((Object) 2);
        ajuy.mo38929a((Object) 0);
        this.f80862f = ajuy;
        SelectionSlider selectionSlider = this.f80861e;
        abh abh = selectionSlider.f81162c;
        if (abh != null) {
            abh.mo174b(selectionSlider.f81163d);
        }
        selectionSlider.f81162c = ajuy;
        ajuy.mo166a(selectionSlider.f81163d);
        selectionSlider.mo44665a(false);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0126R.C0130menu.sharing_menu_contact_select, menu);
        SearchView searchView = new SearchView(mo8628aW().mo15868g());
        this.f80860d = searchView;
        searchView.mo1620b(Integer.MAX_VALUE);
        LinearLayout linearLayout = (LinearLayout) this.f80860d.findViewById(C0126R.C0129id.search_edit_frame);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.setMarginStart(0);
        linearLayout.setLayoutParams(layoutParams);
        ((TextView) this.f80860d.findViewById(C0126R.C0129id.search_src_text)).setPadding(0, 0, 0, 0);
        this.f80860d.f1260m = new ajiy(this);
        this.f80860d.f1269v = new ajis(this);
        menu.findItem(C0126R.C0129id.action_search).setActionView(this.f80860d);
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() != C0126R.C0129id.action_search) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            return true;
        }
    }

    public final void onStart() {
        if (!this.f80874r) {
            super.onStart();
            ahhd.m55767a(this, this.f80876t, new IntentFilter("com.google.android.gms.nearby.sharing.ACTION_CONTACTS_REFRESHED"));
            mo44410e();
            return;
        }
        super.onStart();
    }

    public final void onStop() {
        ahhd.m55766a(this, this.f80876t);
        super.onStop();
    }

    /* renamed from: a */
    private final void m67447a(SpannableString spannableString, int i, int i2) {
        spannableString.setSpan(new RelativeSizeSpan(0.85f), i, i2, 0);
        spannableString.setSpan(new ForegroundColorSpan(akim.m59830b(this, 16842806)), i, i2, 0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(com.google.android.gms.nearby.sharing.Contact, boolean):void
     arg types: [com.google.android.gms.nearby.sharing.Contact, int]
     candidates:
      com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity, java.lang.String):void
      com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(android.view.View, java.lang.Object):void
      com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(java.lang.String, boolean):void
      com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(java.util.List, boolean):void
      ajui.a(android.view.View, java.lang.Object):void
      ajwc.a(java.util.List, boolean):void
      com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(com.google.android.gms.nearby.sharing.Contact, boolean):void */
    /* renamed from: b */
    public final void mo38936b(Contact contact) {
        if (cfov.m142057j()) {
            m67448a(contact, false);
        }
        ajty ajty = this.f80866j;
        roz b = rpa.m34196b();
        b.f43472a = new ajtf(contact);
        b.f43473b = new Feature[]{ahca.f66970a};
        ajty.mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    private final void m67448a(Contact contact, boolean z) {
        Set set;
        acm findViewHolderForAdapterPosition;
        Set set2 = (Set) this.f80864h.f71315f.get(Long.valueOf(contact.f80844a));
        if (contact == null || set2 == null) {
            set = new ArraySet();
        } else {
            set = bnic.m109495a((Collection) set2);
        }
        if (set.size() != 1) {
            Iterator it = set.iterator();
            while (it.hasNext() && (findViewHolderForAdapterPosition = this.f80870n.findViewHolderForAdapterPosition(((Integer) it.next()).intValue())) != null) {
                ((SwitchCompat) findViewHolderForAdapterPosition.f201a.findViewById(C0126R.C0129id.select_switch)).setChecked(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo44408a(int i) {
        ajty ajty = this.f80866j;
        ajik ajik = new ajik();
        ajik.mo38678a(false);
        ajty.mo38896a(ajik.f70715a).mo50373a(new ajiv(this));
        if (cfov.m142051d()) {
            if (i == 0) {
                m67450b((int) C0126R.string.sharing_contact_select_receiver_explain_hidden);
                this.f80869m.setVisibility(8);
            } else if (i == 1) {
                m67450b((int) C0126R.string.sharing_contact_select_receiver_explain_all_contacts);
                this.f80869m.setVisibility(0);
            } else if (i == 2) {
                m67450b((int) C0126R.string.sharing_contact_select_receiver_explain_some_contacts);
                this.f80869m.setVisibility(0);
            }
        } else if (i != 0) {
            this.f80868l.setVisibility(8);
            this.f80869m.setVisibility(0);
        } else {
            this.f80868l.setVisibility(0);
            this.f80869m.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo38686a(View view, Object obj) {
        Contact contact = (Contact) obj;
        view.findViewById(C0126R.C0129id.select_switch).performClick();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(com.google.android.gms.nearby.sharing.Contact, boolean):void
     arg types: [com.google.android.gms.nearby.sharing.Contact, int]
     candidates:
      com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity, java.lang.String):void
      com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(android.view.View, java.lang.Object):void
      com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(java.lang.String, boolean):void
      com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(java.util.List, boolean):void
      ajui.a(android.view.View, java.lang.Object):void
      ajwc.a(java.util.List, boolean):void
      com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(com.google.android.gms.nearby.sharing.Contact, boolean):void */
    /* renamed from: a */
    public final void mo38935a(Contact contact) {
        if (cfov.m142057j()) {
            m67448a(contact, true);
        }
        ajty ajty = this.f80866j;
        roz b = rpa.m34196b();
        b.f43472a = new ajte(contact);
        b.f43473b = new Feature[]{ahca.f66970a};
        ajty.mo24732b(b.mo24977a());
    }

    /* renamed from: a */
    public final void mo44409a(String str, boolean z) {
        if (z) {
            this.f80863g.setVisibility(8);
            this.f80865i.setVisibility(8);
            this.f80873q.setVisibility(0);
        }
        C0034at atVar = this.f80875s;
        if (atVar != null) {
            atVar.mo2444a(this);
        }
        if (TextUtils.isEmpty(str)) {
            ajty ajty = this.f80866j;
            ajik ajik = new ajik();
            ajik.mo38678a(true);
            this.f80875s = new C0079ch(new C0073cc(ajty, ajik.f70715a, this), ajwd.f71398e).mo3893a();
        } else {
            ajty ajty2 = this.f80866j;
            ajik ajik2 = new ajik();
            ajik2.mo38678a(true);
            ContactFilter contactFilter = ajik2.f70715a;
            contactFilter.f80855d = str;
            this.f80875s = new C0079ch(new C0073cc(ajty2, contactFilter, this), ajwd.f71398e).mo3893a();
        }
        C0034at atVar2 = this.f80875s;
        ajuq ajuq = this.f80864h;
        ajuq.getClass();
        atVar2.mo2445a(this, new ajit(ajuq));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077  */
    /* renamed from: a */
    public final void mo38981a(List list, boolean z) {
        Iterator it;
        if (z) {
            if (list.isEmpty()) {
                this.f80871o.f72071a = -1;
                this.f80872p.f72071a = 0;
            } else {
                this.f80871o.f72071a = 0;
                this.f80872p.f72071a = list.size();
            }
        }
        if (list.isEmpty()) {
            C0066bx bxVar = ((C0917cv) this.f80864h).f12178a;
            C0915ct ctVar = bxVar.f5937g;
            if (ctVar == null) {
                ctVar = bxVar.f5936f;
            }
            if (ctVar.isEmpty()) {
                this.f80865i.setVisibility(0);
                this.f80863g.setVisibility(8);
                if (cfov.m142051d()) {
                    this.f80867k.setVisibility(8);
                }
                this.f80873q.setVisibility(8);
                ajuq ajuq = this.f80864h;
                it = list.iterator();
                while (it.hasNext()) {
                    Contact contact = (Contact) it.next();
                    if (contact.f80848e) {
                        ajuq.f71314e.add(Long.valueOf(contact.f80844a));
                    }
                }
            }
        }
        this.f80865i.setVisibility(8);
        this.f80863g.setVisibility(0);
        if (cfov.m142051d()) {
            this.f80867k.setVisibility(0);
        }
        this.f80873q.setVisibility(8);
        ajuq ajuq2 = this.f80864h;
        it = list.iterator();
        while (it.hasNext()) {
        }
    }
}
