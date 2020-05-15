package com.google.android.gms.pay.deeplink;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DeepLinkChimeraActivity extends deu {

    /* renamed from: d */
    private static final srn f81664d = srn.m36127a(sgj.PAY);

    /* renamed from: b */
    alhw f81665b;

    /* renamed from: c */
    aljq f81666c;

    /* renamed from: e */
    private ImageView f81667e;

    /* renamed from: f */
    private TextView f81668f;

    /* renamed from: g */
    private TextView f81669g;

    /* renamed from: h */
    private TextView f81670h;

    /* renamed from: b */
    private final void m67774b(Intent intent) {
        if (!isFinishing()) {
            startActivity(intent.addFlags(268435456));
            finish();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: je.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      je.a(int, java.lang.CharSequence, android.app.PendingIntent):void
      je.a(int, int, boolean):void */
    /* renamed from: g */
    private final void m67775g() {
        if (cfuc.f185713a.mo6606a().mo82726b()) {
            sex a = sex.m35104a(this);
            if (a == null) {
                bnsl bnsl = (bnsl) f81664d.mo68388c();
                bnsl.mo68432a("com.google.android.gms.pay.deeplink.DeepLinkChimeraActivity", "g", (int) BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("NotificationManager missing");
                return;
            }
            C1102je jeVar = new C1102je(this, "tapandpay.alerts");
            Bundle bundle = new Bundle();
            bundle.putString("android.substName", getString(C0126R.string.pay_stub_application_name));
            jeVar.mo13630b(qkj.m32287a(this, C0126R.C0127drawable.quantum_ic_google_white_24));
            jeVar.f22271w = C1133kh.m17843b(this, C0126R.color.google_blue600);
            jeVar.mo13640e(getString(C0126R.string.pay_stub_deeplink_success_title));
            jeVar.mo13623a(bundle);
            jeVar.mo13633b(true);
            jeVar.f22245C = 900000;
            jeVar.mo13617a(100, 0, true);
            a.mo25441a(770495801, jeVar.mo13629b());
            this.f81666c.mo40451b(5);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: je.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      je.a(int, java.lang.CharSequence, android.app.PendingIntent):void
      je.a(int, int, boolean):void */
    /* renamed from: e */
    public final void mo46248e() {
        if (this.f81665b.mo40356a(8)) {
            this.f81666c.mo40451b(3);
            Intent intent = getIntent();
            SharedPreferences.Editor edit = getSharedPreferences("pay_module_cached_intent", 0).edit();
            edit.putString("download_intent_action", intent.getAction());
            edit.putString("download_intent_data", intent.getData().toString());
            edit.apply();
            this.f81667e.setImageResource(C0126R.C0127drawable.product_logo_google_pay_round_color_144);
            this.f81668f.setText(getString(C0126R.string.pay_stub_deeplink_success_title));
            this.f81669g.setText(getString(C0126R.string.pay_stub_deeplink_success_message));
            this.f81670h.setText(getString(C0126R.string.common_got_it));
            this.f81670h.setOnClickListener(new alho(this));
            if (cfuc.f185713a.mo6606a().mo82726b()) {
                sex a = sex.m35104a(this);
                if (a == null) {
                    bnsl bnsl = (bnsl) f81664d.mo68388c();
                    bnsl.mo68432a("com.google.android.gms.pay.deeplink.DeepLinkChimeraActivity", "g", (int) BaseMfiEventCallback.TYPE_OPSRV_RESULT_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("NotificationManager missing");
                    return;
                }
                C1102je jeVar = new C1102je(this, "tapandpay.alerts");
                Bundle bundle = new Bundle();
                bundle.putString("android.substName", getString(C0126R.string.pay_stub_application_name));
                jeVar.mo13630b(qkj.m32287a(this, C0126R.C0127drawable.quantum_ic_google_white_24));
                jeVar.f22271w = C1133kh.m17843b(this, C0126R.color.google_blue600);
                jeVar.mo13640e(getString(C0126R.string.pay_stub_deeplink_success_title));
                jeVar.mo13623a(bundle);
                jeVar.mo13633b(true);
                jeVar.f22245C = 900000;
                jeVar.mo13617a(100, 0, true);
                a.mo25441a(770495801, jeVar.mo13629b());
                this.f81666c.mo40451b(5);
                return;
            }
            return;
        }
        this.f81666c.mo40451b(4);
        this.f81667e.setImageResource(C0126R.C0127drawable.quantum_gm_ic_security_update_warning_gm_blue_24);
        this.f81668f.setText(getString(C0126R.string.common_something_went_wrong));
        this.f81669g.setText(getString(C0126R.string.pay_stub_deeplink_try_again_message));
        this.f81670h.setText(getString(C0126R.string.common_try_again));
        this.f81670h.setOnClickListener(new alhq(this));
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setTheme(2132018625);
        setContentView((int) C0126R.C0128layout.pay_stub_deep_link_activity);
        this.f81667e = (ImageView) findViewById(C0126R.C0129id.StubDeepLinkImage);
        this.f81668f = (TextView) findViewById(C0126R.C0129id.StubDeepLinkTitle);
        this.f81669g = (TextView) findViewById(C0126R.C0129id.StubDeepLinkMessage);
        this.f81670h = (TextView) findViewById(C0126R.C0129id.StubDeepLinkButton);
        findViewById(C0126R.C0129id.StubDeepLinkClose).setOnClickListener(new alhn(this));
        Intent intent = getIntent();
        if (intent.getData() == null) {
            bnsl bnsl = (bnsl) f81664d.mo68388c();
            bnsl.mo68432a("com.google.android.gms.pay.deeplink.DeepLinkChimeraActivity", "onCreate", 75, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Stub deeplink activity created without data");
            finish();
            return;
        }
        intent.getData();
        if (this.f81665b == null) {
            this.f81665b = new alhw(this);
        }
        if (!this.f81665b.mo40358a(true)) {
            Uri data = getIntent().getData();
            List<String> pathSegments = data.getPathSegments();
            if (!"savetransit".equals(pathSegments.get(2)) || pathSegments.size() != 4) {
                this.f81667e.setImageResource(C0126R.C0127drawable.quantum_gm_ic_mobile_off_gm_blue_24);
                this.f81668f.setText(getString(C0126R.string.pay_stub_deeplink_not_available_title));
                this.f81669g.setText(getString(C0126R.string.pay_stub_deeplink_not_available_message));
                this.f81670h.setText(getString(C0126R.string.common_got_it));
                this.f81670h.setOnClickListener(new alhp(this));
                return;
            }
            List<String> pathSegments2 = data.getPathSegments();
            if (pathSegments2.size() >= 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("https://www.android.com/payapp");
                for (int i = 2; i < pathSegments2.size(); i++) {
                    sb.append('/');
                    sb.append(pathSegments2.get(i));
                }
                if (data.getQuery() != null && !data.getQuery().isEmpty()) {
                    sb.append('?');
                    sb.append(data.getQuery());
                }
                Uri parse = Uri.parse(sb.toString());
                Intent intent2 = new Intent("android.intent.action.VIEW", parse).setPackage("com.google.android.apps.walletnfcrel");
                ActivityInfo resolveActivityInfo = intent2.resolveActivityInfo(getPackageManager(), 0);
                if (resolveActivityInfo != null && resolveActivityInfo.exported && rfz.m33557a(this).mo24610b(resolveActivityInfo.applicationInfo.packageName)) {
                    str = resolveActivityInfo.applicationInfo.packageName;
                } else {
                    str = "";
                }
                if (TextUtils.isEmpty(str)) {
                    m67774b(new Intent("android.intent.action.VIEW", parse));
                } else {
                    m67774b(intent2);
                }
            }
        } else {
            if (this.f81666c == null) {
                this.f81666c = new aljq(getApplicationContext());
            }
            mo46248e();
        }
    }
}
