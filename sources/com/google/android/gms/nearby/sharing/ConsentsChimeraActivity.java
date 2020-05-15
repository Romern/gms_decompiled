package com.google.android.gms.nearby.sharing;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConsentsChimeraActivity extends ajhe {

    /* renamed from: i */
    public ProgressBar f80833i;

    /* renamed from: j */
    public View f80834j;

    /* renamed from: k */
    public ImageView f80835k;

    /* renamed from: l */
    public TextView f80836l;

    /* renamed from: m */
    public TextView f80837m;

    /* renamed from: n */
    public TextView f80838n;

    /* renamed from: o */
    public TextView f80839o;

    /* renamed from: p */
    public TextView f80840p;

    /* renamed from: q */
    public Button f80841q;

    /* renamed from: r */
    public Button f80842r;

    /* renamed from: s */
    public Button f80843s;

    /* renamed from: a */
    public static Intent m67439a(Context context) {
        return new Intent().addFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE).setClassName(context, "com.google.android.gms.nearby.sharing.ConsentsActivity");
    }

    /* renamed from: h */
    public final void mo44389h() {
        Toast.makeText(this, getResources().getString(C0126R.string.sharing_consents_toast_no_network_error), 0).show();
    }

    /* renamed from: i */
    public final void mo44390i() {
        Toast.makeText(this, getResources().getString(C0126R.string.sharing_consents_toast_no_account_error), 0).show();
    }

    /* renamed from: j */
    public final void mo44391j() {
        setResult(0);
        finishAfterTransition();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!cfov.m142066s()) {
            finish();
            return;
        }
        setContentView((int) C0126R.C0128layout.sharing_activity_consents);
        this.f80833i = (ProgressBar) findViewById(C0126R.C0129id.consents_text_loading_progress_bar);
        this.f80834j = findViewById(C0126R.C0129id.account_info);
        this.f80835k = (ImageView) findViewById(C0126R.C0129id.account_icon);
        this.f80836l = (TextView) findViewById(C0126R.C0129id.account_email);
        this.f80837m = (TextView) findViewById(C0126R.C0129id.account_full_name);
        this.f80838n = (TextView) findViewById(C0126R.C0129id.device_contacts_title);
        this.f80839o = (TextView) findViewById(C0126R.C0129id.device_contacts_description);
        this.f80840p = (TextView) findViewById(C0126R.C0129id.device_contacts_footer);
        this.f80841q = (Button) findViewById(C0126R.C0129id.skip_button);
        this.f80842r = (Button) findViewById(C0126R.C0129id.negative_button);
        this.f80843s = (Button) findViewById(C0126R.C0129id.positive_button);
        this.f80841q.setOnClickListener(new ajhn(this));
        this.f80842r.setOnClickListener(new ajht(this));
        this.f80843s.setOnClickListener(new ajhu(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo38633e() {
        aucb G = mo38634g().mo38893G();
        G.mo50373a(new ajhv(this));
        G.mo50372a(new ajhw(this));
    }
}
