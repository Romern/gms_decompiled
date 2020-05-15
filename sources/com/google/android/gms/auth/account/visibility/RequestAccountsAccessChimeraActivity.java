package com.google.android.gms.auth.account.visibility;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class RequestAccountsAccessChimeraActivity extends jwz {

    /* renamed from: a */
    public static final sek f10035a = ght.m13171a("RequestAccountsAccess");

    /* renamed from: b */
    public String f10036b;

    /* renamed from: a */
    public static Intent m6313a() {
        return new Intent().setClassName(rpr.m34216b(), "com.google.android.gms.auth.account.visibility.RequestAccountsAccessActivity");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo7384b() {
        return "RequestAccountsAccessActivity";
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        float f;
        super.onCreate(bundle);
        if (!gsg.m13820b()) {
            f10035a.mo25412b("API to request accounts access is disabled", new Object[0]);
            setResult(0);
            finish();
            return;
        }
        setContentView((int) C0126R.C0128layout.auth_request_accounts_access_activity);
        ((TextView) findViewById(C0126R.C0129id.footnote)).setText(getResources().getString(C0126R.string.auth_app_permission_ok_footnote));
        this.f10036b = spn.m35852a((Activity) this);
        CharSequence a = new imx(this).mo13151a(this.f10036b);
        if (a == null) {
            setResult(0);
            finish();
            return;
        }
        String charSequence = a.toString();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.findFragmentByTag("headerFragment") == null) {
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.add(C0126R.C0129id.header_fragment_layout, jxn.m17467a(charSequence), "headerFragment");
            beginTransaction.commit();
        }
        TextView textView = new TextView(this);
        textView.setText(getString(C0126R.string.auth_request_accounts_list));
        ((LinearLayout) findViewById(C0126R.C0129id.scopes_layout)).addView(textView);
        ((Button) findViewById(C0126R.C0129id.cancel_button)).setOnClickListener(new gsi(this));
        ((Button) findViewById(C0126R.C0129id.accept_button)).setOnClickListener(new gsj(this));
        Resources resources = getResources();
        if (sre.m36081a(resources)) {
            f = resources.getDimension(C0126R.dimen.plus_auth_dialog_tablet_resize_factor);
        } else {
            f = resources.getDimension(C0126R.dimen.plus_auth_dialog_resize_factor);
        }
        spa.m35815a(getContainerActivity(), (double) f);
    }
}
