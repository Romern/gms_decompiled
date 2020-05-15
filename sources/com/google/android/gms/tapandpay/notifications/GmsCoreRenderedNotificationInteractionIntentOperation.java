package com.google.android.gms.tapandpay.notifications;

import android.content.Intent;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GmsCoreRenderedNotificationInteractionIntentOperation extends asjx {
    static {
        sgj sgj = sgj.UNKNOWN;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a1  */
    /* renamed from: a */
    public final void mo49205a(Intent intent) {
        char c;
        AccountInfo accountInfo = (AccountInfo) intent.getParcelableExtra("extra_account_info");
        if (accountInfo != null && intent.getAction() != null) {
            bxvd da = bpbx.f135635S.mo74144da();
            bxvd da2 = bozl.f135386f.mo74144da();
            String b = bmxx.m108578b(intent.getStringExtra("campaign_id"));
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bozl bozl = (bozl) da2.f164949b;
            b.getClass();
            int i = 4;
            bozl.f135388a |= 4;
            bozl.f135391d = b;
            String action = intent.getAction();
            int hashCode = action.hashCode();
            if (hashCode != -1498810605) {
                if (hashCode != -155218375) {
                    if (hashCode == 768585744 && action.equals("com.google.android.gms.tapandpay.notifications.GMS_CORE_ON_DELETE_ACTION")) {
                        c = 2;
                        if (c != 0) {
                            Intent intent2 = (Intent) intent.getParcelableExtra("extra_next_intent");
                            if (intent2 != null) {
                                startActivity(intent2.setFlags(268435456));
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bpbx bpbx = (bpbx) da.f164949b;
                            bpbx.f135657c = 61;
                            bpbx.f135655a |= 1;
                            int a = bmtu.m108377a(intent.getIntExtra("target_type_for_logging", 0));
                            if (a != 0) {
                                int i2 = a - 1;
                                if (i2 == 1) {
                                    i = 2;
                                } else if (i2 != 3) {
                                    i = 1;
                                }
                            } else {
                                i = 1;
                            }
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bozl bozl2 = (bozl) da2.f164949b;
                            bozl2.f135390c = i - 1;
                            bozl2.f135388a |= 2;
                        } else if (c == 1) {
                            new atkm(this).mo50013a(true);
                            bxvd da3 = bssm.f146877d.mo74144da();
                            bsmx bsmx = bsmx.GOOGLE_PAY_GMSCORE_TAPANDPAY_PROMOTION_NOTIFICATION;
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bssm bssm = (bssm) da3.f164949b;
                            bssm.f146880b = bsmx.f145962iC;
                            bssm.f146879a |= 1;
                            bxvd da4 = bssi.f146862i.mo74144da();
                            bsqp bsqp = (bsqp) bsqq.f146675b.mo74144da();
                            bsqp.mo70703a((int) C0126R.string.tp_turn_off_gms_core_rendered_notifications);
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            bssi bssi = (bssi) da4.f164949b;
                            bsqq bsqq = (bsqq) bsqp.mo74062i();
                            bsqq.getClass();
                            bssi.f146868e = bsqq;
                            bssi.f146864a |= 128;
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bssm bssm2 = (bssm) da3.f164949b;
                            bssi bssi2 = (bssi) da4.mo74062i();
                            bssi2.getClass();
                            bssm2.f146881c = bssi2;
                            bssm2.f146879a |= 8;
                            new asjn(this).mo49200b(false, accountInfo.f108325a, accountInfo.f108326b, (bssm) da3.mo74062i());
                            atbg.m75370a(this, "GmsCoreRenderedNotification");
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bpbx bpbx2 = (bpbx) da.f164949b;
                            bpbx2.f135657c = 63;
                            bpbx2.f135655a |= 1;
                        } else if (c != 2) {
                            intent.getAction();
                            return;
                        } else {
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bpbx bpbx3 = (bpbx) da.f164949b;
                            bpbx3.f135657c = 62;
                            bpbx3.f135655a |= 1;
                        }
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpbx bpbx4 = (bpbx) da.f164949b;
                        bozl bozl3 = (bozl) da2.mo74062i();
                        bozl3.getClass();
                        bpbx4.f135677w = bozl3;
                        bpbx4.f135655a |= 8388608;
                        new atam(new askf(accountInfo, askc.m74272b(), this)).mo49741a((bpbx) da.mo74062i());
                    }
                } else if (action.equals("com.google.android.gms.tapandpay.notifications.GMS_CORE_OPT_OUT_ACTION")) {
                    c = 1;
                    if (c != 0) {
                    }
                    if (da.f164950c) {
                    }
                    bpbx bpbx42 = (bpbx) da.f164949b;
                    bozl bozl32 = (bozl) da2.mo74062i();
                    bozl32.getClass();
                    bpbx42.f135677w = bozl32;
                    bpbx42.f135655a |= 8388608;
                    new atam(new askf(accountInfo, askc.m74272b(), this)).mo49741a((bpbx) da.mo74062i());
                }
            } else if (action.equals("com.google.android.gms.tapandpay.notifications.GMS_CORE_CLICK_ACTION")) {
                c = 0;
                if (c != 0) {
                }
                if (da.f164950c) {
                }
                bpbx bpbx422 = (bpbx) da.f164949b;
                bozl bozl322 = (bozl) da2.mo74062i();
                bozl322.getClass();
                bpbx422.f135677w = bozl322;
                bpbx422.f135655a |= 8388608;
                new atam(new askf(accountInfo, askc.m74272b(), this)).mo49741a((bpbx) da.mo74062i());
            }
            c = 65535;
            if (c != 0) {
            }
            if (da.f164950c) {
            }
            bpbx bpbx4222 = (bpbx) da.f164949b;
            bozl bozl3222 = (bozl) da2.mo74062i();
            bozl3222.getClass();
            bpbx4222.f135677w = bozl3222;
            bpbx4222.f135655a |= 8388608;
            new atam(new askf(accountInfo, askc.m74272b(), this)).mo49741a((bpbx) da.mo74062i());
        }
    }
}
