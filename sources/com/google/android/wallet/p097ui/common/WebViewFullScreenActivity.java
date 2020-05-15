package com.google.android.wallet.p097ui.common;

import android.content.Intent;
import android.os.Bundle;
import android.support.p002v7.widget.Toolbar;
import android.view.MenuItem;
import com.felicanetworks.mfc.C0126R;

/* renamed from: com.google.android.wallet.ui.common.WebViewFullScreenActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WebViewFullScreenActivity extends deu {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        setTheme(intent.getIntExtra("themeResId", -1));
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.activity_url_link_web_view);
        Toolbar toolbar = (Toolbar) findViewById(C0126R.C0129id.toolbar);
        toolbar.mo1679a("");
        mo8626a(toolbar);
        mo8628aW().mo15853b(true);
        ((WebViewLayout) findViewById(C0126R.C0129id.web_view_layout)).mo72119a(intent.getStringExtra("url"), (String) null);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }
}
