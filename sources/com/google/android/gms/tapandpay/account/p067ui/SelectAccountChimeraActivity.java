package com.google.android.gms.tapandpay.account.p067ui;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.tapandpay.account.ui.SelectAccountChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SelectAccountChimeraActivity extends atex {

    /* renamed from: b */
    atzw f108310b;

    /* renamed from: c */
    RecyclerView f108311c;

    /* renamed from: d */
    public TextView f108312d;

    /* renamed from: e */
    public String f108313e;

    /* renamed from: f */
    public rjx f108314f;

    /* renamed from: g */
    private boolean f108315g;

    /* renamed from: a */
    public final void mo59206a(String str) {
        this.f108312d.setText((int) C0126R.string.tp_wear_account_register);
        this.f108314f.mo24751i(str).mo9458a(new asjd(this));
    }

    /* renamed from: e */
    public final void mo59207e() {
        setResult(8);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 2100) {
            if (i != 1991) {
                return;
            }
            if (i2 == -1) {
                findViewById(C0126R.C0129id.tp_account_list).setVisibility(0);
                findViewById(C0126R.C0129id.tp_progress_container).setVisibility(8);
                String[] a = soz.m35792a(soz.m35801d(this, getPackageName()));
                int length = a.length;
                if (length != 0) {
                    if (length == 1) {
                        mo59206a(a[0]);
                    }
                    atzw atzw = this.f108310b;
                    atzw.f91303d = bngx.m109370a((Object[]) a);
                    atzw.mo171aJ();
                } else if (!this.f108315g) {
                    startActivityForResult(asjg.m74217c(this), 1991);
                    this.f108315g = true;
                } else {
                    setResult(0);
                    finish();
                }
            } else {
                mo59207e();
            }
        } else if (i2 == -1 && intent != null) {
            mo59206a(intent.getStringExtra("authAccount"));
        } else {
            mo59207e();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        asjb asjb = new asjb();
        asiz asiz = new asiz(this);
        cazf.m127594a(asiz);
        asjb.f89060a = asiz;
        cazf.m127595a(asjb.f89060a, asiz.class);
        this.f108310b = new atzw(asja.m74205a(new asjc(asjb.f89060a).f89061a));
        if (this.f108314f == null) {
            this.f108314f = rjx.m33697b((Activity) this);
        }
        sre.m36089i(this);
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.tp_select_account_activity);
        setFinishOnTouchOutside(false);
        RecyclerView recyclerView = (RecyclerView) findViewById(C0126R.C0129id.tp_account_list);
        this.f108311c = recyclerView;
        recyclerView.setAdapter(this.f108310b);
        this.f108311c.setLayoutManager(new aah(1));
        findViewById(C0126R.C0129id.tp_progress_container);
        this.f108312d = (TextView) findViewById(C0126R.C0129id.tp_message);
        this.f108313e = stm.m36299a(getIntent().getStringExtra("extra_calling_package"));
        if (bundle != null) {
            this.f108315g = bundle.getBoolean("key_tried_first_account_add");
        }
        List d = soz.m35801d(this, getPackageName());
        if (d.size() == 1) {
            mo59206a(((Account) d.get(0)).name);
            return;
        }
        Intent a = rew.m33486a(null, new ArrayList(d), new String[]{"com.google"}, true, getResources().getString(C0126R.string.tp_account_picker_description_override), false, 1, 2, null, true);
        if (!a.hasExtra("realClientPackage")) {
            a.putExtra("realClientPackage", "com.google.android.gms");
        }
        Bundle bundle2 = new Bundle();
        bundle2.putInt("theme", 1000);
        bundle2.putString("title", getResources().getString(C0126R.string.tp_select_account_title));
        a.putExtra("first_party_options_bundle", bundle2);
        startActivityForResult(a, 2100);
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("key_tried_first_account_add", this.f108315g);
    }
}
