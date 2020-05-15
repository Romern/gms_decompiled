package p000;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.audience.widgets.AudienceView;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.audience.AclSelectionChimeraActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: anob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anob extends anpm implements CompoundButton.OnCheckedChangeListener, View.OnClickListener, anqf, rqp {

    /* renamed from: a */
    public int f77264a;

    /* renamed from: b */
    public AudienceView f77265b;

    /* renamed from: c */
    public boolean f77266c;

    /* renamed from: d */
    public boolean f77267d;

    /* renamed from: o */
    private LinearLayout f77268o;

    /* renamed from: p */
    private TextView f77269p;

    /* renamed from: q */
    private CompoundButton f77270q;

    /* renamed from: r */
    private View f77271r;

    /* renamed from: s */
    private String f77272s;

    /* renamed from: t */
    private int f77273t;

    /* renamed from: a */
    public static anob m64855a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Integer num, String str3, String str4, String str5, int i, boolean z5, int i2, int i3, int i4, List list) {
        anob anob = new anob();
        Bundle a = anpm.m64955a(str, str2, z, z2, z3, z4, num, false, str3, str4, str5, true, z5, i2, i3, i4, list);
        a.putInt("domainRestricted", i);
        anob anob2 = anob;
        anob2.setArguments(a);
        return anob2;
    }

    /* renamed from: i */
    private final void m64857i() {
        if (this.f77269p.getVisibility() != 8) {
            ArrayList arrayList = new ArrayList();
            for (AudienceMember audienceMember : mo42093g().f77451a.f30287b) {
                arrayList.add(audienceMember.f30296f);
            }
            TextView textView = this.f77269p;
            String str = this.f77403f;
            String join = TextUtils.join(", ", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(join).length());
            sb.append(str);
            sb.append(" ");
            sb.append(join);
            textView.setContentDescription(sb.toString());
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        FavaDiagnosticsEntity favaDiagnosticsEntity;
        if (compoundButton == this.f77270q) {
            int i = 2;
            this.f77264a = !z ? 2 : 1;
            if (z) {
                favaDiagnosticsEntity = riv.f43097A;
            } else {
                favaDiagnosticsEntity = riv.f43098B;
            }
            shz.m35339a(getActivity(), this.f77411j, this.f77412k, favaDiagnosticsEntity, riw.f43133a, this.f77414m);
            sfd sfd = new sfd(mo42093g().f77451a);
            if (z) {
                i = 1;
            }
            sfd.mo25466a(i);
            mo42093g().mo42124a(sfd.mo25465a(), this);
        }
    }

    public void onClick(View view) {
        if (view.getId() == C0126R.C0129id.search_icon) {
            ((AclSelectionChimeraActivity) mo42090b()).onSearchRequested();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f77264a = bundle.getInt("domainRestricted");
            this.f77272s = bundle.getString("domain");
            this.f77273t = bundle.getInt("domainRestrictedVisibility", 4);
            this.f77267d = bundle.getBoolean("hideSearchIcon");
            this.f77266c = bundle.getBoolean("underage");
        } else {
            this.f77264a = getArguments().getInt("domainRestricted");
            this.f77272s = "";
            this.f77273t = 4;
        }
        if (bundle == null && this.f77264a != 0) {
            shz.m35339a(getActivity(), this.f77411j, this.f77412k, riv.f43132z, riw.f43133a, this.f77414m);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("domainRestricted", this.f77264a);
        bundle.putString("domain", this.f77272s);
        View view = this.f77271r;
        if (view != null) {
            bundle.putInt("domainRestrictedVisibility", view.getVisibility());
        }
        bundle.putBoolean("hideSearchIcon", this.f77267d);
        bundle.putBoolean("underage", this.f77266c);
    }

    public final void onStart() {
        super.onStart();
        mo42093g().mo42123a(this);
    }

    public final void onStop() {
        mo42093g().mo42125b(this);
        super.onStop();
    }

    /* renamed from: a */
    private final void m64856a(String str, int i) {
        ((TextView) this.f77271r.findViewById(C0126R.C0129id.plus_domain_title)).setText(getResources().getString(C0126R.string.plus_domain_restricted_choice_title, str));
        ((TextView) this.f77271r.findViewById(C0126R.C0129id.plus_domain_body)).setText(getResources().getString(C0126R.string.plus_domain_restricted_choice_body, str));
        this.f77271r.setVisibility(i);
    }

    /* renamed from: a */
    public final View mo42029a() {
        LayoutInflater from = LayoutInflater.from(getActivity());
        AudienceView audienceView = new AudienceView(getActivity());
        this.f77265b = audienceView;
        sdo.m34959a(this);
        audienceView.mo17751a(2, null, this);
        boolean z = false;
        this.f77265b.mo17755b(false);
        this.f77265b.mo17752a(mo42093g().f77451a);
        this.f77265b.mo17754a(this.f77266c);
        LinearLayout linearLayout = (LinearLayout) from.inflate((int) C0126R.C0128layout.plus_audience_selection_pacl_header, (ViewGroup) null);
        this.f77268o = linearLayout;
        linearLayout.addView(this.f77265b);
        this.f77268o.findViewById(C0126R.C0129id.search_icon).setOnClickListener(this);
        this.f77269p = (TextView) this.f77268o.findViewById(C0126R.C0129id.description);
        if (TextUtils.isEmpty(this.f77403f)) {
            this.f77269p.setVisibility(8);
        } else {
            this.f77269p.setText(this.f77403f);
            m64857i();
        }
        int i = this.f77264a;
        if (i != 0) {
            if (i == 1) {
                z = true;
            }
            View inflate = from.inflate((int) C0126R.C0128layout.plus_audience_selection_acl_domain_restricted_header, (ViewGroup) null);
            this.f77271r = inflate;
            this.f77270q = (CompoundButton) inflate.findViewById(C0126R.C0129id.plus_switch);
            m64856a(this.f77272s, this.f77273t);
            this.f77270q.setOnCheckedChangeListener(this);
            this.f77270q.setChecked(z);
            this.f77268o.addView(this.f77271r);
        }
        if (this.f77267d) {
            this.f77268o.findViewById(C0126R.C0129id.search_icon).setVisibility(8);
        }
        return this.f77268o;
    }

    /* renamed from: a */
    public final void mo42030a(alzr alzr) {
        String d = alzr.mo25151d("dasher_domain");
        this.f77272s = d;
        if (TextUtils.isEmpty(d)) {
            this.f77272s = getResources().getString(C0126R.string.plus_domain_default);
        }
        if (this.f77264a != 0) {
            m64856a(this.f77272s, 0);
        }
    }

    /* renamed from: a */
    public final void mo42031a(Object obj) {
        this.f77265b.mo17752a(mo42093g().f77451a);
        m64857i();
    }
}
