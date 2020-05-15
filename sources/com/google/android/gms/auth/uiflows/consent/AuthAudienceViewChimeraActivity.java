package com.google.android.gms.auth.uiflows.consent;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.FragmentActivity;
import com.google.android.gms.auth.firstparty.shared.ScopeData;
import com.google.android.gms.common.audience.widgets.AudienceView;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AuthAudienceViewChimeraActivity extends FragmentActivity implements View.OnClickListener, rqn {

    /* renamed from: a */
    private String f11477a;

    /* renamed from: b */
    private String f11478b;

    /* renamed from: c */
    private ScopeData f11479c;

    /* renamed from: d */
    private Audience f11480d;

    /* renamed from: e */
    private Audience f11481e;

    /* renamed from: f */
    private AudienceView f11482f;

    /* renamed from: g */
    private RadioButton f11483g;

    /* renamed from: h */
    private RadioButton f11484h;

    /* renamed from: i */
    private LinearLayout f11485i;

    /* renamed from: j */
    private TextView f11486j;

    /* renamed from: a */
    private final void m7042a(boolean z) {
        this.f11483g.setChecked(z);
        this.f11484h.setChecked(!z);
    }

    /* renamed from: b */
    private final void m7043b() {
        AudienceView audienceView = this.f11482f;
        if (!(audienceView == null || this.f11483g == null)) {
            audienceView.setEnabled(false);
            this.f11483g.setEnabled(false);
        }
        m7042a(true);
        rqa a = rpz.m34221a();
        a.mo25007a(this.f11478b);
        a.mo25013b(this.f11480d.f30287b);
        a.f43513a.putParcelableArrayListExtra("INITIAL_ACL", rqa.m34224a(this.f11480d.f30287b));
        a.mo25019d("80");
        a.mo25011b(getString(C0126R.string.auth_plus_audience_selection_description_acl));
        startActivityForResult(a.f43513a, 1);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            AudienceView audienceView = this.f11482f;
            if (!(audienceView == null || this.f11483g == null)) {
                audienceView.setEnabled(true);
                this.f11483g.setEnabled(true);
            }
            if (i2 == -1) {
                rqa rqa = new rqa(intent);
                sfd sfd = new sfd();
                sfd.mo25467a(rqa.mo25016c());
                Audience a = sfd.mo25465a();
                this.f11480d = a;
                AudienceView audienceView2 = this.f11482f;
                if (audienceView2 != null) {
                    audienceView2.mo17752a(a);
                    m7042a(true ^ sfi.m35164a(this.f11480d));
                }
            } else if (sfi.m35164a(this.f11480d)) {
                m7042a(false);
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onBackPressed() {
        this.f11482f.mo17752a(this.f11481e);
        Intent intent = new Intent();
        intent.putExtra("pacl_audience", this.f11481e);
        setResult(0, intent);
        finish();
    }

    public void onClick(View view) {
        Audience audience;
        if (view == this.f11483g || view == this.f11482f) {
            m7043b();
        } else if (view == this.f11484h || view == this.f11485i) {
            m7042a(false);
        } else if (view == findViewById(C0126R.C0129id.f7440ok)) {
            Intent intent = new Intent();
            if (!this.f11483g.isChecked()) {
                audience = new sfd().mo25465a();
            } else {
                audience = this.f11480d;
            }
            intent.putExtra("pacl_audience", audience);
            setResult(-1, intent);
            finish();
        }
    }

    public final void onCreate(Bundle bundle) {
        float f;
        Audience audience;
        requestWindowFeature(1);
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f11481e = (Audience) intent.getParcelableExtra("pacl_audience");
        this.f11477a = intent.getStringExtra("scope_description");
        this.f11478b = intent.getStringExtra("account_name");
        this.f11479c = (ScopeData) intent.getParcelableExtra("scope_data");
        intent.getStringExtra("calling_package");
        if (this.f11481e == null) {
            String str = this.f11479c.f10885f;
            if (str != null) {
                try {
                    List a = anxi.m65493a(sqd.m35971c(str));
                    sfd sfd = new sfd();
                    sfd.mo25467a(a);
                    audience = sfd.mo25465a();
                } catch (Exception e) {
                    Log.e("AuthAudienceViewActivity", str.length() == 0 ? new String("Failed to parse audience from roster: ") : "Failed to parse audience from roster: ".concat(str), e);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(AudienceMember.m22642c("myCircles", getResources().getString(C0126R.string.common_chips_label_your_circles)));
                    sfd sfd2 = new sfd();
                    sfd2.mo25467a(arrayList);
                    audience = sfd2.mo25465a();
                }
            } else {
                audience = null;
            }
            this.f11481e = audience;
        }
        if (bundle != null) {
            this.f11480d = (Audience) bundle.getParcelable("STATE_SELECTED_AUDIENCE");
        } else {
            this.f11480d = this.f11481e;
        }
        setContentView((int) C0126R.C0128layout.auth_consent_audience_view_activity);
        AudienceView audienceView = (AudienceView) findViewById(C0126R.C0129id.audience_view);
        this.f11482f = audienceView;
        audienceView.mo17753a((rqn) this);
        this.f11482f.mo17755b(true);
        this.f11483g = (RadioButton) findViewById(C0126R.C0129id.acl_radio_button);
        this.f11484h = (RadioButton) findViewById(C0126R.C0129id.private_pacl_radio_button);
        this.f11485i = (LinearLayout) findViewById(C0126R.C0129id.private_pacl_layout);
        this.f11482f.mo17752a(this.f11480d);
        this.f11483g.setOnClickListener(this);
        this.f11484h.setOnClickListener(this);
        this.f11485i.setOnClickListener(this);
        this.f11482f.setOnClickListener(this);
        m7042a(!sfi.m35164a(this.f11480d));
        ((Button) findViewById(C0126R.C0129id.f7440ok)).setOnClickListener(this);
        Spanned fromHtml = Html.fromHtml(this.f11477a);
        TextView textView = (TextView) findViewById(C0126R.C0129id.pacl_description);
        this.f11486j = textView;
        textView.setText(fromHtml);
        this.f11486j.setMovementMethod(LinkMovementMethod.getInstance());
        this.f11486j.setClickable(true);
        Resources resources = getResources();
        if (sre.m36081a(resources)) {
            f = resources.getDimension(C0126R.dimen.plus_auth_dialog_tablet_resize_factor);
        } else {
            f = resources.getDimension(C0126R.dimen.plus_auth_dialog_resize_factor);
        }
        spa.m35815a(getContainerActivity(), (double) f);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("STATE_SELECTED_AUDIENCE", this.f11480d);
    }

    /* renamed from: a */
    public final void mo7892a() {
        m7043b();
    }
}
