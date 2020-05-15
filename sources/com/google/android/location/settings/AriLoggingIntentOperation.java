package com.google.android.location.settings;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AriLoggingIntentOperation extends IntentOperation {
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.location.settings.LOG_NLP_CONSENT".equals(intent.getAction())) {
            int a = bsqm.m116095a(intent.getIntExtra("source", 0));
            boolean booleanExtra = intent.getBooleanExtra("consent", false);
            int[] intArrayExtra = intent.getIntArrayExtra("textResources");
            bxvd da = bssi.f146862i.mo74144da();
            int i = 3;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                if (length < 4) {
                    bsqp bsqp = (bsqp) bsqq.f146675b.mo74144da();
                    bsqp.mo70704a(bqcn.m112586b(intArrayExtra));
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bssi bssi = (bssi) da.f164949b;
                    bsqq bsqq = (bsqq) bsqp.mo74062i();
                    bsqq.getClass();
                    bssi.f146868e = bsqq;
                    bssi.f146864a |= 128;
                } else {
                    bxvd da2 = bsqh.f146634g.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bsqh bsqh = (bsqh) da2.f164949b;
                    bsqh.f146636a |= 1;
                    bsqh.f146637b = true;
                    bsqp bsqp2 = (bsqp) bsqq.f146675b.mo74144da();
                    bsqp2.mo70703a(intArrayExtra[0]);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bsqh bsqh2 = (bsqh) da2.f164949b;
                    bsqq bsqq2 = (bsqq) bsqp2.mo74062i();
                    bsqq2.getClass();
                    bsqh2.f146638c = bsqq2;
                    bsqh2.f146636a |= 2;
                    bsqp bsqp3 = (bsqp) bsqq.f146675b.mo74144da();
                    bsqp3.mo70703a(intArrayExtra[1]);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bsqh bsqh3 = (bsqh) da2.f164949b;
                    bsqq bsqq3 = (bsqq) bsqp3.mo74062i();
                    bsqq3.getClass();
                    bsqh3.f146640e = bsqq3;
                    bsqh3.f146636a |= 8;
                    bsqp bsqp4 = (bsqp) bsqq.f146675b.mo74144da();
                    bsqp4.mo70703a(intArrayExtra[2]);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bsqh bsqh4 = (bsqh) da2.f164949b;
                    bsqq bsqq4 = (bsqq) bsqp4.mo74062i();
                    bsqq4.getClass();
                    bsqh4.f146641f = bsqq4;
                    bsqh4.f146636a |= 16;
                    bsqp bsqp5 = (bsqp) bsqq.f146675b.mo74144da();
                    bsqp5.mo70704a(bqcn.m112586b(Arrays.copyOfRange(intArrayExtra, 3, length)));
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bsqh bsqh5 = (bsqh) da2.f164949b;
                    bsqq bsqq5 = (bsqq) bsqp5.mo74062i();
                    bsqq5.getClass();
                    bsqh5.f146639d = bsqq5;
                    bsqh5.f146636a |= 4;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bssi bssi2 = (bssi) da.f164949b;
                    bsqh bsqh6 = (bsqh) da2.mo74062i();
                    bsqh6.getClass();
                    bssi2.f146865b = bsqh6;
                    bssi2.f146864a |= 1;
                }
            }
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
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bsrc bsrc = (bsrc) da3.f164949b;
            bsra bsra2 = (bsra) da4.mo74062i();
            bsra2.getClass();
            bsrc.f146737c = bsra2;
            bsrc.f146735a |= 2;
            bsrc bsrc2 = (bsrc) da3.mo74062i();
            bsqv bsqv = (bsqv) bsqw.f146695g.mo74144da();
            bxvd da5 = bsre.f146739d.mo74144da();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bsre bsre = (bsre) da5.f164949b;
            bsre.f146742b = 1;
            int i2 = bsre.f146741a | 1;
            bsre.f146741a = i2;
            bsrc2.getClass();
            bsre.f146743c = bsrc2;
            bsre.f146741a = i2 | 2;
            bsqv.mo70707a(da5);
            bxvd da6 = bsre.f146739d.mo74144da();
            if (da6.f164950c) {
                da6.mo74035c();
                da6.f164950c = false;
            }
            bsre bsre2 = (bsre) da6.f164949b;
            bsre2.f146742b = 2;
            int i3 = bsre2.f146741a | 1;
            bsre2.f146741a = i3;
            bsrc2.getClass();
            bsre2.f146743c = bsrc2;
            bsre2.f146741a = i3 | 2;
            bsqv.mo70707a(da6);
            bxvd da7 = bsrf.f146744d.mo74144da();
            bsmz bsmz = bsmz.GOOGLE_LOCATION_SERVICES_STATE_CHANGE;
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            bsrf bsrf = (bsrf) da7.f164949b;
            bsrf.f146747b = bsmz.f146213dO;
            bsrf.f146746a |= 1;
            bxvd da8 = bsrg.f146749m.mo74144da();
            bxvd da9 = bsqn.f146664d.mo74144da();
            bxvd da10 = bssl.f146873c.mo74144da();
            if (booleanExtra) {
                i = 2;
            }
            if (da10.f164950c) {
                da10.mo74035c();
                da10.f164950c = false;
            }
            bssl bssl = (bssl) da10.f164949b;
            bssl.f146876b = i - 1;
            bssl.f146875a |= 1;
            if (da9.f164950c) {
                da9.mo74035c();
                da9.f164950c = false;
            }
            bsqn bsqn = (bsqn) da9.f164949b;
            bssl bssl2 = (bssl) da10.mo74062i();
            bssl2.getClass();
            bsqn.f146667b = bssl2;
            bsqn.f146666a |= 1;
            if (da9.f164950c) {
                da9.mo74035c();
                da9.f164950c = false;
            }
            bsqn bsqn2 = (bsqn) da9.f164949b;
            int i4 = a - 1;
            if (a != 0) {
                bsqn2.f146668c = i4;
                bsqn2.f146666a |= 2;
                if (da8.f164950c) {
                    da8.mo74035c();
                    da8.f164950c = false;
                }
                bsrg bsrg = (bsrg) da8.f164949b;
                bsqn bsqn3 = (bsqn) da9.mo74062i();
                bsqn3.getClass();
                bsrg.f146755e = bsqn3;
                bsrg.f146751a |= 4;
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bsrf bsrf2 = (bsrf) da7.f164949b;
                bsrg bsrg2 = (bsrg) da8.mo74062i();
                bsrg2.getClass();
                bsrf2.f146748c = bsrg2;
                bsrf2.f146746a |= 2;
                if (bsqv.f164950c) {
                    bsqv.mo74035c();
                    bsqv.f164950c = false;
                }
                bsqw bsqw = (bsqw) bsqv.f164949b;
                bsrf bsrf3 = (bsrf) da7.mo74062i();
                bsrf3.getClass();
                bsqw.f146701e = bsrf3;
                bsqw.f146697a |= 4;
                bxvd da11 = bssm.f146877d.mo74144da();
                bsmx bsmx = bsmx.ANDROID_LOCATION_SERVICES_CONSENT_UI;
                if (da11.f164950c) {
                    da11.mo74035c();
                    da11.f164950c = false;
                }
                bssm bssm = (bssm) da11.f164949b;
                bssm.f146880b = bsmx.f145962iC;
                bssm.f146879a |= 1;
                bssi bssi3 = (bssi) da.mo74062i();
                bssi3.getClass();
                bssm.f146881c = bssi3;
                bssm.f146879a |= 8;
                if (bsqv.f164950c) {
                    bsqv.mo74035c();
                    bsqv.f164950c = false;
                }
                bsqw bsqw2 = (bsqw) bsqv.f164949b;
                bssm bssm2 = (bssm) da11.mo74062i();
                bssm2.getClass();
                bsqw2.f146702f = bssm2;
                bsqw2.f146697a |= 8;
                ggk a2 = ggh.m13102a(this);
                ggp ggp = new ggp();
                ggp.f18143b = 41;
                ggp.f18142a = 2;
                ggp.mo11800a(((bsqw) bsqv.mo74062i()).mo73642k());
                a2.mo11796a(ggp.mo11799a()).mo50372a(bhab.f118182a);
                return;
            }
            throw null;
        }
    }
}
