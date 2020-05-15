package com.google.android.gms.wallet.common.p079ui;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.p002v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.shared.common.ClickSpan;
import java.util.Locale;

/* renamed from: com.google.android.gms.wallet.common.ui.UpdateCallingAppChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class UpdateCallingAppChimeraActivity extends deu implements View.OnClickListener, bjxu {

    /* renamed from: b */
    Button f110128b;

    /* renamed from: c */
    TextView f110129c;

    /* renamed from: d */
    bkgg f110130d;

    /* renamed from: e */
    private final void m93923e() {
        setResult(1);
        finish();
    }

    /* renamed from: a */
    public final void mo52355a(View view, String str) {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    public void onClick(View view) {
        m93923e();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void
     arg types: [com.google.android.gms.wallet.common.ui.UpdateCallingAppChimeraActivity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, int]
     candidates:
      awia.a(bwiv, android.content.Intent, android.content.Context, com.google.android.gms.wallet.shared.BuyFlowConfig):android.content.Intent
      awia.a(com.google.android.chimera.Activity, com.google.android.gms.wallet.shared.BuyFlowConfig, awhz, boolean):void */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        awia.m79981a((Activity) this, (BuyFlowConfig) getIntent().getParcelableExtra("com.google.android.gms.wallet.buyFlowConfig"), awia.f94383e, true);
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.wallet_activity_update_calling_app);
        mo8626a((Toolbar) findViewById(C0126R.C0129id.toolbar));
        TextView textView = (TextView) findViewById(16908308);
        this.f110129c = textView;
        textView.setOnClickListener(this);
        TextView textView2 = this.f110129c;
        String a = spn.m35852a((Activity) this);
        try {
            CharSequence b = svr.m36484b(this).mo26177b(a);
            ClickSpan.m118372a(textView2, getString(C0126R.string.wallet_update_calling_app, new Object[]{String.format(Locale.US, "<a href=\"market://details?id=%s\">%s</a>", a, b)}), this, ((Boolean) bjwe.f123474I.mo54082a()).booleanValue());
            bkgg bkgg = new bkgg(this.f110129c);
            this.f110130d = bkgg;
            C1280ps.m19894a(this.f110129c, bkgg);
            Button button = (Button) findViewById(C0126R.C0129id.flat_button);
            this.f110128b = button;
            button.setOnClickListener(this);
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Couldn't find app name for app to update");
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        m93923e();
        return true;
    }
}
