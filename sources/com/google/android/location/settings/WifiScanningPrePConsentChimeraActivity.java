package com.google.android.location.settings;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import android.provider.Settings;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WifiScanningPrePConsentChimeraActivity extends Activity implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private static long f150945a = -1;

    /* renamed from: b */
    private boolean f150946b = false;

    /* renamed from: c */
    private boolean f150947c = false;

    /* renamed from: d */
    private bhas f150948d;

    public final void finish() {
        super.finish();
        if (!this.f150946b) {
            if (!this.f150947c) {
                Settings.Global.putInt(getContentResolver(), "wifi_scan_always_enabled", 0);
            } else if (this.f150948d != null && cfad.m138522c()) {
                bhas bhas = this.f150948d;
                ggp ggp = new ggp();
                ggp.f18143b = 41;
                ggp.f18142a = 2;
                bsqv bsqv = (bsqv) bsqw.f146695g.mo74144da();
                bxvd da = bsre.f146739d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bsre bsre = (bsre) da.f164949b;
                bsre.f146742b = 1;
                bsre.f146741a |= 1;
                bxvd da2 = bsre.f146739d.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bsre bsre2 = (bsre) da2.f164949b;
                bsre2.f146742b = 2;
                bsre2.f146741a |= 1;
                bxvd da3 = bsrc.f146733d.mo74144da();
                bxvd da4 = bsra.f146725c.mo74144da();
                String hexString = Long.toHexString(((Long) spn.f44933b.mo25081c()).longValue());
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bsra bsra = (bsra) da4.f164949b;
                hexString.getClass();
                bsra.f146727a |= 1;
                bsra.f146728b = hexString;
                bsra bsra2 = (bsra) da4.mo74062i();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bsrc bsrc = (bsrc) da3.f164949b;
                bsra2.getClass();
                bsrc.f146737c = bsra2;
                bsrc.f146735a |= 2;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bsre bsre3 = (bsre) da.f164949b;
                bsrc bsrc2 = (bsrc) da3.mo74062i();
                bsrc2.getClass();
                bsre3.f146743c = bsrc2;
                bsre3.f146741a |= 2;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bsre bsre4 = (bsre) da2.f164949b;
                bsrc bsrc3 = (bsrc) da3.mo74062i();
                bsrc3.getClass();
                bsre4.f146743c = bsrc3;
                bsre4.f146741a |= 2;
                List asList = Arrays.asList((bsre) da.mo74062i(), (bsre) da2.mo74062i());
                if (bsqv.f164950c) {
                    bsqv.mo74035c();
                    bsqv.f164950c = false;
                }
                bsqw bsqw = (bsqw) bsqv.f164949b;
                bsqw.mo70708a();
                bxsy.m123078a(asList, bsqw.f146698b);
                bxvd da5 = bsrf.f146744d.mo74144da();
                bsmz bsmz = bsmz.WIFI_SCAN_SETTINGS_UPDATE_PRE_P_CONSENT;
                if (da5.f164950c) {
                    da5.mo74035c();
                    da5.f164950c = false;
                }
                bsrf bsrf = (bsrf) da5.f164949b;
                bsrf.f146747b = bsmz.f146213dO;
                bsrf.f146746a |= 1;
                bsrf bsrf2 = (bsrf) da5.mo74062i();
                if (bsqv.f164950c) {
                    bsqv.mo74035c();
                    bsqv.f164950c = false;
                }
                bsqw bsqw2 = (bsqw) bsqv.f164949b;
                bsrf2.getClass();
                bsqw2.f146701e = bsrf2;
                bsqw2.f146697a |= 4;
                bxvd da6 = bssm.f146877d.mo74144da();
                bsmx bsmx = bsmx.ANDROID_WIFI_SCAN_SETTINGS_UPDATE_PRE_P_CONSENT;
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                bssm bssm = (bssm) da6.f164949b;
                bssm.f146880b = bsmx.f145962iC;
                bssm.f146879a |= 1;
                bxvd da7 = bssi.f146862i.mo74144da();
                bxvd da8 = bsqh.f146634g.mo74144da();
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                bsqh bsqh = (bsqh) da8.f164949b;
                bsqh.f146636a |= 1;
                bsqh.f146637b = true;
                bsqq a = bhas.m100527a(C0126R.string.wifi_scanning_consent_pre_p_message);
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                bsqh bsqh2 = (bsqh) da8.f164949b;
                a.getClass();
                bsqh2.f146639d = a;
                bsqh2.f146636a |= 4;
                bsqq a2 = bhas.m100527a(C0126R.string.common_ok);
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                bsqh bsqh3 = (bsqh) da8.f164949b;
                a2.getClass();
                bsqh3.f146640e = a2;
                bsqh3.f146636a |= 8;
                bsqq a3 = bhas.m100527a(C0126R.string.common_cancel);
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                bsqh bsqh4 = (bsqh) da8.f164949b;
                a3.getClass();
                bsqh4.f146641f = a3;
                bsqh4.f146636a |= 16;
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bssi bssi = (bssi) da7.f164949b;
                bsqh bsqh5 = (bsqh) da8.mo74062i();
                bsqh5.getClass();
                bssi.f146865b = bsqh5;
                bssi.f146864a |= 1;
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                bssm bssm2 = (bssm) da6.f164949b;
                bssi bssi2 = (bssi) da7.mo74062i();
                bssi2.getClass();
                bssm2.f146881c = bssi2;
                bssm2.f146879a |= 8;
                bssm bssm3 = (bssm) da6.mo74062i();
                if (bsqv.f164950c) {
                    bsqv.mo74035c();
                    bsqv.f164950c = false;
                }
                bsqw bsqw3 = (bsqw) bsqv.f164949b;
                bssm3.getClass();
                bsqw3.f146702f = bssm3;
                bsqw3.f146697a |= 8;
                ggp.mo11800a(((bsqw) bsqv.mo74062i()).mo73642k());
                ggh.m13102a(bhas.f118211a).mo11796a(ggp.mo11799a()).mo50371a(bhau.f118213a);
            }
            if (cfad.m138521b() > 0) {
                f150945a = SystemClock.elapsedRealtime();
            }
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            this.f150947c = true;
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (f150945a == -1 || SystemClock.elapsedRealtime() - f150945a > cfad.m138521b()) {
            this.f150946b = false;
            if (cfad.m138522c()) {
                this.f150948d = new bhas(this);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage((int) C0126R.string.wifi_scanning_consent_pre_p_message);
            builder.setPositiveButton((int) C0126R.string.common_ok, this);
            builder.setNegativeButton((int) C0126R.string.common_cancel, this);
            builder.setOnCancelListener(new bhat(this));
            AlertDialog create = builder.create();
            setFinishOnTouchOutside(true);
            create.show();
            return;
        }
        this.f150946b = true;
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        super.onPause();
        if (!isFinishing()) {
            finish();
        }
    }
}
