package com.google.android.gms.constellation.p038ui.debug;

import android.graphics.Rect;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.UUID;

/* renamed from: com.google.android.gms.constellation.ui.debug.ConstellationDebugChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ConstellationDebugChimeraActivity extends deu {

    /* renamed from: b */
    public static final sek f30575b = tea.m36798a("debug_activity");

    /* renamed from: A */
    private Button f30576A;

    /* renamed from: B */
    private Button f30577B;

    /* renamed from: C */
    private Button f30578C;

    /* renamed from: D */
    private Button f30579D;

    /* renamed from: E */
    private Button f30580E;

    /* renamed from: c */
    public final Handler f30581c = new adzt();

    /* renamed from: d */
    public tds f30582d;

    /* renamed from: e */
    public String f30583e;

    /* renamed from: f */
    public ArrayList f30584f;

    /* renamed from: g */
    private Button f30585g;

    /* renamed from: h */
    private Button f30586h;

    /* renamed from: i */
    private Button f30587i;

    /* renamed from: j */
    private Button f30588j;

    /* renamed from: k */
    private Button f30589k;

    /* renamed from: l */
    private Button f30590l;

    /* renamed from: m */
    private Button f30591m;

    /* renamed from: n */
    private Button f30592n;

    /* renamed from: o */
    private Button f30593o;

    /* renamed from: p */
    private Button f30594p;

    /* renamed from: q */
    private Button f30595q;

    /* renamed from: r */
    private Button f30596r;

    /* renamed from: s */
    private Button f30597s;

    /* renamed from: t */
    private Button f30598t;

    /* renamed from: u */
    private Button f30599u;

    /* renamed from: v */
    private Button f30600v;

    /* renamed from: w */
    private Button f30601w;

    /* renamed from: x */
    private Button f30602x;

    /* renamed from: y */
    private Button f30603y;

    /* renamed from: z */
    private Button f30604z;

    /* renamed from: b */
    public final void mo17989b(boolean z) {
        Settings.Global.putInt(getContentResolver(), "airplane_mode_on", z ? 1 : 0);
    }

    /* renamed from: c */
    public final void mo17990c(boolean z) {
        ((TelephonyManager) getSystemService("phone")).setDataEnabled(z);
    }

    /* renamed from: d */
    public final void mo17991d(boolean z) {
        ((WifiManager) getApplicationContext().getSystemService("wifi")).setWifiEnabled(z);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            View currentFocus = getCurrentFocus();
            if (currentFocus instanceof TextView) {
                Rect rect = new Rect();
                currentFocus.getGlobalVisibleRect(rect);
                if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    currentFocus.clearFocus();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final sza mo17992e() {
        return new sza(this);
    }

    /* renamed from: g */
    public final /* synthetic */ void mo17993g() {
        mo17988a(true);
    }

    /* renamed from: h */
    public final /* synthetic */ void mo17994h() {
        mo17988a(true);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getString(C0126R.string.c11n_debug_activity_title));
        C1341rz aW = mo8628aW();
        if (aW != null) {
            aW.mo15853b(true);
        }
        setContentView((int) C0126R.C0128layout.debug_activity);
        this.f30585g = (Button) findViewById(C0126R.C0129id.sync_if_mismatch_button);
        this.f30586h = (Button) findViewById(C0126R.C0129id.force_resync_button);
        this.f30587i = (Button) findViewById(C0126R.C0129id.force_reverify_button);
        this.f30588j = (Button) findViewById(C0126R.C0129id.grant_consent_button);
        this.f30589k = (Button) findViewById(C0126R.C0129id.revoke_consent_button);
        this.f30590l = (Button) findViewById(C0126R.C0129id.api_verify_phone_number_button);
        this.f30591m = (Button) findViewById(C0126R.C0129id.one_time_verification_api_button);
        this.f30592n = (Button) findViewById(C0126R.C0129id.btn_refresh);
        this.f30593o = (Button) findViewById(C0126R.C0129id.btn_clear_keys);
        this.f30594p = (Button) findViewById(C0126R.C0129id.btn_change_imsi);
        this.f30595q = (Button) findViewById(C0126R.C0129id.btn_start_networks);
        this.f30596r = (Button) findViewById(C0126R.C0129id.btn_stop_networks);
        this.f30597s = (Button) findViewById(C0126R.C0129id.btn_clear_networks);
        this.f30598t = (Button) findViewById(C0126R.C0129id.btn_read_networks);
        this.f30599u = (Button) findViewById(C0126R.C0129id.btn_start_service);
        this.f30600v = (Button) findViewById(C0126R.C0129id.btn_stop_service);
        this.f30601w = (Button) findViewById(C0126R.C0129id.btn_clear_service);
        this.f30602x = (Button) findViewById(C0126R.C0129id.btn_read_service);
        this.f30603y = (Button) findViewById(C0126R.C0129id.btn_read_call_sms_logs);
        this.f30604z = (Button) findViewById(C0126R.C0129id.btn_airplane_on);
        this.f30576A = (Button) findViewById(C0126R.C0129id.btn_airplane_off);
        this.f30577B = (Button) findViewById(C0126R.C0129id.btn_data_on);
        this.f30578C = (Button) findViewById(C0126R.C0129id.btn_data_off);
        this.f30579D = (Button) findViewById(C0126R.C0129id.btn_wifi_on);
        this.f30580E = (Button) findViewById(C0126R.C0129id.btn_wifi_off);
        mo17988a(false);
        long b = ryv.m34682b(this, "android_id");
        ((TextView) findViewById(C0126R.C0129id.android_id)).setText(getString(C0126R.string.c11n_android_id_text));
        ((TextView) findViewById(C0126R.C0129id.android_id_value)).setText(getString(C0126R.string.c11n_android_id_value, new Object[]{Long.valueOf(b), ryv.m34679a(this)}));
        tcy tcy = new tcy(this);
        sxt.m36563a();
        sxt.m36567a(getApplicationContext(), UUID.randomUUID(), tcy);
        this.f30582d = tds.m36774a(this);
        this.f30585g.setOnClickListener(new tbh(this, tcy));
        this.f30586h.setOnClickListener(new tbs(this, tcy));
        this.f30587i.setOnClickListener(new tcd(this, tcy));
        this.f30593o.setOnClickListener(new tco(this, tcy));
        this.f30588j.setOnClickListener(new tcp(this, tcy));
        this.f30589k.setOnClickListener(new tcq(this, tcy));
        this.f30594p.setOnClickListener(tcr.f45654a);
        sxs a = sxm.m36556a(this);
        this.f30590l.setOnClickListener(new tcs(this, a));
        this.f30591m.setOnClickListener(new tct(this, a));
        this.f30592n.setOnClickListener(new tcu(this));
        this.f30595q.setOnClickListener(tbi.f45610a);
        this.f30596r.setOnClickListener(tbj.f45611a);
        this.f30597s.setOnClickListener(tbk.f45612a);
        this.f30598t.setOnClickListener(tbl.f45613a);
        this.f30599u.setOnClickListener(new tbm(this));
        this.f30600v.setOnClickListener(tbn.f45615a);
        this.f30601w.setOnClickListener(tbo.f45616a);
        this.f30602x.setOnClickListener(tbp.f45617a);
        this.f30603y.setOnClickListener(new tbq(this));
        this.f30604z.setOnClickListener(new tbr(this));
        this.f30576A.setOnClickListener(new tbt(this));
        int i = Build.VERSION.SDK_INT;
        this.f30577B.setOnClickListener(new tbu(this));
        this.f30578C.setOnClickListener(new tbv(this));
        this.f30579D.setOnClickListener(new tbw(this));
        this.f30580E.setOnClickListener(new tbx(this));
        mo17988a(true);
        new tcz(this).execute(new Void[0]);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    /* renamed from: a */
    public final tdx mo17987a(String str) {
        tdx tdx = new tdx(str, new tdj());
        tdx.f45712e = this.f30583e;
        tdx.f45713f = this.f30584f;
        tdx.f45711d = 6;
        return tdx;
    }

    /* renamed from: a */
    public final void mo17988a(boolean z) {
        this.f30590l.setEnabled(z);
        this.f30591m.setEnabled(z);
        this.f30592n.setEnabled(z);
        if (!z || cdfz.f180729a.mo6606a().mo77468e()) {
            this.f30585g.setEnabled(z);
            this.f30593o.setEnabled(z);
            this.f30594p.setEnabled(z);
            this.f30595q.setEnabled(z);
            this.f30596r.setEnabled(z);
            this.f30597s.setEnabled(z);
            this.f30598t.setEnabled(z);
            this.f30599u.setEnabled(z);
            this.f30600v.setEnabled(z);
            this.f30601w.setEnabled(z);
            this.f30602x.setEnabled(z);
            this.f30603y.setEnabled(z);
            this.f30604z.setEnabled(z);
            this.f30576A.setEnabled(z);
            int i = Build.VERSION.SDK_INT;
            this.f30577B.setEnabled(z);
            this.f30578C.setEnabled(z);
            this.f30579D.setEnabled(z);
            this.f30580E.setEnabled(z);
        }
        if (!z || !TextUtils.isEmpty(this.f30583e)) {
            this.f30588j.setEnabled(z);
            this.f30589k.setEnabled(z);
            this.f30586h.setEnabled(z);
            this.f30587i.setEnabled(z);
        }
    }
}
