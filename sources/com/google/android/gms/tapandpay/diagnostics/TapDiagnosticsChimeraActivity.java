package com.google.android.gms.tapandpay.diagnostics;

import android.content.Context;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class TapDiagnosticsChimeraActivity extends atex {
    /* renamed from: a */
    public final void mo59208a(boolean z) {
        int i;
        TextView textView = (TextView) findViewById(C0126R.C0129id.TapDiagnosticsTitle);
        if (!z) {
            i = C0126R.string.tp_tap_diagnostics_title_not_setup;
        } else {
            i = C0126R.string.tp_tap_diagnostics_title_setup;
        }
        textView.setText(i);
        TextView textView2 = (TextView) findViewById(C0126R.C0129id.TapDiagnosticsSubtitle);
        if (z) {
            textView2.setVisibility(4);
            return;
        }
        textView2.setVisibility(0);
        textView2.setText((int) C0126R.string.tp_tap_diagnostics_subtitle_not_setup);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AccountInfo accountInfo = (AccountInfo) getIntent().getParcelableExtra("extra_account_info");
        if (accountInfo == null) {
            finish();
            return;
        }
        setTheme(C0126R.style.TpActivityTheme);
        setTitle("");
        C1341rz aW = mo8628aW();
        if (aW != null) {
            aW.mo15853b(true);
            aW.mo15863e((int) C0126R.C0127drawable.quantum_gm_ic_close_vd_theme_24);
            aW.mo15865f((int) C0126R.string.close_button_label);
        }
        setContentView((int) C0126R.C0128layout.tp_activity_tap_diagnostics);
        ViewSwitcher viewSwitcher = (ViewSwitcher) findViewById(C0126R.C0129id.TapDiagnosticsSwitcher);
        TextView textView = (TextView) findViewById(C0126R.C0129id.TapDiagnosticsTitle);
        TextView textView2 = (TextView) findViewById(C0126R.C0129id.TapDiagnosticsSubtitle);
        RecyclerView recyclerView = (RecyclerView) findViewById(C0126R.C0129id.TapDiagnosticsRecyclerView);
        aslk aslk = new aslk(this, this.f13656a);
        aslk.f89171b = accountInfo;
        boolean a = asjw.m74256a(this);
        aslk.f89172c = Boolean.valueOf(a);
        if (a) {
            textView.setText((int) C0126R.string.tp_tap_diagnostics_title_loading);
            textView2.setText((int) C0126R.string.tp_tap_diagnostics_subtitle_loading);
            C0015am amVar = this.f13656a;
            asld asld = new asld(bnhe.m109412a(asly.NFC_STATUS, new asls(amVar, this, atyb.m76543a(this)), asly.DEFAULT_PAYMENT_SERVICE, new C0034at(amVar, atyb.m76543a(this)), asly.DEVICE_LOCK, new C0034at(amVar, this), asly.TOKENIZED_FOP, new aslv(amVar, rjx.m33696b((Context) this)), asly.ATTESTATION_RESULT, new aslo(amVar, rjx.m33696b((Context) this))));
            recyclerView.setLayoutManager(new aah());
            recyclerView.setAdapter(new asli(asld, this, this, new asku(this, atyb.m76543a(this), accountInfo, aslk)));
            asld.f89154a.mo2445a(this, new askv(this, aslk, asld, viewSwitcher, recyclerView));
            asld.f89155b.mo2445a(this, new askw(this, asld));
            asld.f89156c.mo2445a(this, new askx(aslk, asld));
            return;
        }
        viewSwitcher.setVisibility(4);
        textView.setText((int) C0126R.string.tp_tap_diagnostics_title_unrecoverable_error);
        textView2.setText((int) C0126R.string.tp_tap_diagnostics_subtitle_unrecoverable_error);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
