package com.google.android.gms.gcm;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.p002v7.widget.SearchView;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimera.ContextThemeWrapper;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GcmChimeraDiagnostics extends deu implements View.OnClickListener {

    /* renamed from: d */
    public static final Handler f32775d = new adzt();

    /* renamed from: b */
    boolean f32776b = false;

    /* renamed from: c */
    boolean f32777c;

    /* renamed from: e */
    private TextView f32778e;

    /* renamed from: f */
    private Button f32779f;

    /* renamed from: g */
    private MenuItem f32780g;

    /* renamed from: h */
    private TextView f32781h;

    /* renamed from: i */
    private SearchView f32782i;

    /* renamed from: j */
    private aakx f32783j;

    /* renamed from: k */
    private String f32784k;

    /* renamed from: l */
    private List f32785l;

    /* renamed from: m */
    private final bqgj f32786m = snp.m35704b(10);

    /* renamed from: n */
    private final Runnable f32787n = new aakg(this);

    /* renamed from: k */
    private final void m24297k() {
        String str;
        int i;
        Button button = this.f32779f;
        if (!this.f32776b) {
            str = "Events";
        } else {
            str = "Status";
        }
        button.setText(str);
        TextView textView = this.f32778e;
        int i2 = 0;
        if (!this.f32776b) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        TextView textView2 = this.f32781h;
        if (!this.f32776b) {
            i2 = 8;
        }
        textView2.setVisibility(i2);
        supportInvalidateOptionsMenu();
    }

    /* renamed from: e */
    public final void mo19553e() {
        if (!this.f32776b) {
            this.f32786m.execute(new aakd(this));
        }
    }

    /* renamed from: g */
    public final synchronized void mo19554g() {
        String str;
        if (this.f32777c) {
            str = this.f32783j.mo16958c();
        } else {
            str = this.f32783j.mo16957b();
        }
        this.f32784k = str;
        runOnUiThread(new aake(this));
    }

    /* renamed from: h */
    public final synchronized void mo19555h() {
        this.f32778e.setText(this.f32784k);
    }

    /* renamed from: i */
    public final synchronized void mo19556i() {
        this.f32785l = this.f32783j.mo16956a();
        runOnUiThread(new aakf(this));
    }

    /* renamed from: j */
    public final synchronized void mo19557j() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f32785l != null) {
            if (!TextUtils.isEmpty(this.f32782i.mo1625d())) {
                str = bmwb.m108442a(this.f32782i.mo1625d().toString());
            } else {
                str = null;
            }
            for (String str2 : this.f32785l) {
                if (str == null || bmwb.m108442a(str2).contains(str)) {
                    sb.append(str2);
                    sb.append("\n");
                }
            }
        }
        this.f32781h.setText(sb.toString());
    }

    public void onClick(View view) {
        if (!this.f32776b) {
            this.f32786m.execute(new aakc(this));
        }
        this.f32776b = !this.f32776b;
        m24297k();
        mo19553e();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aajg.m21335a(getApplicationContext());
        if (aajg.m21344d() == 0) {
            if (this.f32783j == null) {
                aakx aakx = new aakx(this);
                this.f32783j = aakx;
                Intent intent = new Intent("com.google.android.gms.gcm.GCM_SERVICE_DIAGNOSTICS");
                intent.setPackage("com.google.android.gms");
                Bundle bundle2 = new Bundle();
                C1004fv.m12455a(bundle2, "callback", new aale(aakx));
                intent.putExtras(bundle2);
                aakx.f28393a.sendBroadcast(intent);
            }
            setTheme(2132018554);
            mo8628aW().mo15846a(false);
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            mo8628aW().mo15845a("FCM Diagnostics");
            LinearLayout linearLayout2 = new LinearLayout(this);
            Button button = new Button(this);
            button.setText("Events");
            linearLayout2.addView(button);
            button.setOnClickListener(this);
            this.f32779f = button;
            linearLayout.addView(linearLayout2);
            TextView textView = new TextView(this);
            this.f32778e = textView;
            textView.setMinLines(20);
            this.f32778e.setMovementMethod(new ScrollingMovementMethod());
            linearLayout.addView(this.f32778e);
            SearchView searchView = new SearchView(new ContextThemeWrapper(this, 2132018760));
            this.f32782i = searchView;
            searchView.f1260m = new aakh(this);
            TextView textView2 = new TextView(this);
            this.f32781h = textView2;
            textView2.setMinLines(20);
            this.f32781h.setMovementMethod(new ScrollingMovementMethod());
            linearLayout.addView(this.f32781h);
            m24297k();
            this.f32777c = true;
            setContentView(linearLayout);
            return;
        }
        finish();
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem add = menu.add("Advanced view");
        this.f32780g = add;
        add.setCheckable(true);
        if (this.f32776b) {
            MenuItem add2 = menu.add(17039372);
            add2.setIcon(17301583);
            add2.setActionView(this.f32782i);
            add2.setShowAsActionFlags(9);
        }
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == this.f32780g) {
            this.f32777c = !this.f32777c;
            mo19553e();
        }
        return true;
    }

    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItem = this.f32780g;
        if (menuItem != null) {
            menuItem.setChecked(!this.f32777c);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public final void onStart() {
        super.onStart();
        this.f32787n.run();
    }

    public final void onStop() {
        super.onStop();
        f32775d.removeCallbacks(this.f32787n);
    }
}
