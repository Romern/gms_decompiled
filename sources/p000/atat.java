package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.IssuerInfo;
import com.google.android.gms.tapandpay.firstparty.TokenReference;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.android.gms.tapandpay.notifications.NHoursAfterGmsCoreRenderedNotificationTaskOperation;
import java.util.Iterator;

/* renamed from: atat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atat {

    /* renamed from: a */
    private static final srn f89972a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    public atat() {
        int i = athh.f90367a;
    }

    /* renamed from: a */
    private static PendingIntent m75339a(Context context, Intent intent) {
        return PendingIntent.getService(context, 0, intent, 134217728);
    }

    /* renamed from: a */
    static final atam m75340a(askf askf) {
        return new atam(askf);
    }

    /* renamed from: a */
    private static final bxvd m75341a(String str, Context context) {
        bxvd da = bpbx.f135635S.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpbx bpbx = (bpbx) da.f164949b;
        bpbx.f135657c = 58;
        bpbx.f135655a |= 1;
        bxvd da2 = bozl.f135386f.mo74144da();
        if (str != null) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bozl bozl = (bozl) da2.f164949b;
            str.getClass();
            bozl.f135388a |= 4;
            bozl.f135391d = str;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpbx bpbx2 = (bpbx) da.f164949b;
        bozl bozl2 = (bozl) da2.mo74062i();
        bozl2.getClass();
        bpbx2.f135677w = bozl2;
        bpbx2.f135655a |= 8388608;
        bxvd da3 = bozb.f135362e.mo74144da();
        int i = !sey.m35126a(context).mo25460a() ? 3 : 2;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bozb bozb = (bozb) da3.f164949b;
        bozb.f135365b = i - 1;
        bozb.f135364a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpbx bpbx3 = (bpbx) da.f164949b;
        bozb bozb2 = (bozb) da3.mo74062i();
        bozb2.getClass();
        bpbx3.f135678x = bozb2;
        bpbx3.f135655a |= 16777216;
        return da;
    }

    /* renamed from: a */
    private static final void m75342a(bmun bmun, askf askf, int i) {
        m75343a(bmun != null ? bmun.f130956g : null, askf, i);
    }

    /* renamed from: a */
    private static final void m75343a(String str, askf askf, int i) {
        bxvd a = m75341a(str, askf.f89126d);
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        bpbx bpbx = (bpbx) a.f164949b;
        bpbx bpbx2 = bpbx.f135635S;
        bpbx.f135657c = 60;
        bpbx.f135655a |= 1;
        bozl bozl = bpbx.f135677w;
        if (bozl == null) {
            bozl = bozl.f135386f;
        }
        bxvd bxvd = (bxvd) bozl.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bozl);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bozl bozl2 = (bozl) bxvd.f164949b;
        bozl2.f135389b = i - 1;
        bozl2.f135388a |= 1;
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        bpbx bpbx3 = (bpbx) a.f164949b;
        bozl bozl3 = (bozl) bxvd.mo74062i();
        bozl3.getClass();
        bpbx3.f135677w = bozl3;
        bpbx3.f135655a |= 8388608;
        m75340a(askf).mo49741a((bpbx) a.mo74062i());
    }

    /* renamed from: a */
    private final boolean m75344a(atkm atkm, bmun bmun) {
        int a = bmug.m108389a(bmun.f130958i);
        if (a != 0 && a == 2) {
            return false;
        }
        long j = atkm.f90420c.getLong("gms_core_rendered_notification_last_activated", 0);
        if (j == 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < j) {
            bnsl bnsl = (bnsl) f89972a.mo68387b();
            bnsl.mo68432a("atat", "a", 287, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68417a("lastActivated in the future, lastActivated = %d, now = %d", j, currentTimeMillis);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0158, code lost:
        r15 = 26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x01c8, code lost:
        r15 = 23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0225, code lost:
        r15 = 24;
     */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x050d  */
    /* renamed from: a */
    public final void mo49770a(bmux bmux, askf askf) {
        bmun bmun;
        int i;
        int i2;
        int i3;
        bmum bmum;
        Intent intent;
        IssuerInfo issuerInfo;
        IssuerInfo issuerInfo2;
        TokenStatus tokenStatus;
        TokenReference tokenReference;
        bmux bmux2 = bmux;
        askf askf2 = askf;
        Context context = askf2.f89126d;
        atkm atkm = new atkm(context);
        if ((bmux2.f130992a & 1048576) != 0) {
            bmun bmun2 = bmux2.f130998g;
            if (bmun2 == null) {
                bmun = bmun.f130948p;
            } else {
                bmun = bmun2;
            }
            int i4 = 2;
            if (atkm.mo50022h()) {
                m75342a(bmun, askf2, 2);
            } else if (bmun.f130951b.isEmpty() || bmun.f130952c.isEmpty()) {
                m75342a(bmun, askf2, 5);
            } else {
                int a = bmug.m108389a(bmun.f130958i);
                if (a == 0 || a != 2) {
                    long j = atkm.f90420c.getLong("gms_core_rendered_notification_last_activated", 0);
                    if (j != 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis < j) {
                            bnsl bnsl = (bnsl) f89972a.mo68387b();
                            bnsl.mo68432a("atat", "a", 287, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68417a("lastActivated in the future, lastActivated = %d, now = %d", j, currentTimeMillis);
                        }
                        m75342a(bmun, askf2, 3);
                        return;
                    }
                }
                try {
                    new atas();
                    bxwc bxwc = bmun.f130955f;
                    int i5 = 6;
                    if (!bxwc.isEmpty()) {
                        CardInfo b = atds.m75666a(askf).mo49852b();
                        Iterator it = bxwc.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                bmuc bmuc = (bmuc) it.next();
                                int a2 = bmtx.m108380a(bmuc.f130923a);
                                if (a2 == 0) {
                                    a2 = 1;
                                }
                                switch (a2 - 1) {
                                    case 0:
                                        bnsl bnsl2 = (bnsl) atas.f89971a.mo68390d();
                                        bnsl2.mo68432a("atas", "a", (int) BaseMfiEventCallback.TYPE_EXPIRED_MFI, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl2.mo68405a("Unknown filter type, ignoring notification");
                                        i5 = 5;
                                        break;
                                    case 1:
                                        if (asjw.m74255a()) {
                                            break;
                                        } else {
                                            i5 = 7;
                                            break;
                                        }
                                    case 2:
                                        sre.m36089i(askf2.f89126d);
                                        break;
                                    case 3:
                                        long j2 = bmuc.f130924b;
                                        if (j2 != 0) {
                                            if (j2 <= 201515033) {
                                                break;
                                            } else {
                                                i5 = 9;
                                                break;
                                            }
                                        } else {
                                            i5 = 5;
                                            break;
                                        }
                                    case 4:
                                        long j3 = bmuc.f130924b;
                                        if (j3 != 0) {
                                            if (j3 >= 201515033) {
                                                break;
                                            } else {
                                                i5 = 10;
                                                break;
                                            }
                                        } else {
                                            i5 = 5;
                                            break;
                                        }
                                    case 5:
                                        if (askf2.f89126d.getPackageManager().resolveActivity(new Intent("com.google.commerce.tapandpay.android.cardlist.START_ANDROID_PAY"), 0) == null) {
                                            break;
                                        } else {
                                            i5 = 11;
                                            break;
                                        }
                                    case 6:
                                        try {
                                            askf2.f89126d.getPackageManager().getPackageInfo(bmuc.f130925c, 0);
                                            break;
                                        } catch (PackageManager.NameNotFoundException e) {
                                            i5 = 12;
                                            break;
                                        }
                                    case 9:
                                        if (!asjw.m74255a()) {
                                            break;
                                        } else {
                                            i5 = 15;
                                            break;
                                        }
                                    case 10:
                                        if (atxx.m76528a(askf2.f89126d)) {
                                            break;
                                        } else {
                                            i5 = 16;
                                            break;
                                        }
                                    case 11:
                                        if (!atxx.m76528a(askf2.f89126d)) {
                                            break;
                                        } else {
                                            i5 = 17;
                                            break;
                                        }
                                    case 12:
                                        if (atas.m75335a(askf2.f89126d)) {
                                            break;
                                        } else {
                                            i5 = 18;
                                            break;
                                        }
                                    case 13:
                                        if (!atas.m75335a(askf2.f89126d)) {
                                            break;
                                        } else {
                                            i5 = 19;
                                            break;
                                        }
                                    case 14:
                                        if (atas.m75336a(askf)) {
                                            if (cgxf.m147444b()) {
                                                break;
                                            } else {
                                                i5 = 22;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    case 15:
                                        if (System.currentTimeMillis() < bmuc.f130926d) {
                                            i5 = 20;
                                            break;
                                        }
                                        break;
                                    case 16:
                                        if (System.currentTimeMillis() > bmuc.f130926d) {
                                            i5 = 21;
                                            break;
                                        }
                                        break;
                                    case 17:
                                        if (atas.m75336a(askf)) {
                                            if (!bmuc.f130929g.isEmpty()) {
                                                if (!(b == null || (issuerInfo = b.f108350k) == null)) {
                                                    if (atas.m75337a(bmuc.f130929g, issuerInfo.f108388a)) {
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                i5 = 5;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    case 18:
                                        if (atas.m75336a(askf)) {
                                            if (!bmuc.f130929g.isEmpty()) {
                                                if (!(b == null || (issuerInfo2 = b.f108350k) == null)) {
                                                    if (atas.m75337a(bmuc.f130929g, issuerInfo2.f108396i)) {
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                i5 = 5;
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    case 19:
                                        if (!atas.m75336a(askf)) {
                                            break;
                                        } else {
                                            int a3 = bmtz.m108382a(bmuc.f130927e);
                                            if (a3 == 0) {
                                                a3 = 1;
                                            }
                                            if (b == null) {
                                                break;
                                            } else {
                                                int i6 = b.f108344e;
                                                if (a3 == 5) {
                                                    if (i6 != 4) {
                                                    }
                                                    break;
                                                }
                                                if (!((a3 == 3 && i6 == 2) || ((a3 == 4 && i6 == 3) || ((a3 == 2 && i6 == 1) || ((a3 == 9 && i6 == 8) || ((a3 == 6 && i6 == 5) || ((a3 == 8 && i6 == 7) || ((a3 == 12 && i6 == 11) || (a3 == 10 && i6 == 10))))))))) {
                                                    if (a3 == 11) {
                                                        if (i6 != 9) {
                                                        }
                                                    }
                                                    if (a3 == 13) {
                                                        if (i6 != 12) {
                                                        }
                                                    }
                                                    if (a3 == 7) {
                                                        if (i6 != 6) {
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    case 20:
                                        if (!atas.m75336a(askf)) {
                                            break;
                                        } else {
                                            int a4 = bmub.m108384a(bmuc.f130928f);
                                            if (a4 == 0) {
                                                a4 = 1;
                                            }
                                            if (!(b == null || (tokenStatus = b.f108345f) == null || (tokenReference = tokenStatus.f108458a) == null)) {
                                                int i7 = tokenReference.f108457b;
                                                if (a4 == 2) {
                                                    if (i7 != 2) {
                                                    }
                                                    break;
                                                }
                                                if (!((a4 == 5 && i7 == 5) || ((a4 == 6 && i7 == 6) || ((a4 == 7 && i7 == 7) || ((a4 == 3 && i7 == 3) || ((a4 == 8 && i7 == 8) || ((a4 == 15 && i7 == 14) || ((a4 == 9 && i7 == 9) || (a4 == 16 && i7 == 13))))))))) {
                                                    if (a4 == 17) {
                                                        if (i7 != 15) {
                                                        }
                                                    }
                                                    if (a4 == 4) {
                                                        if (i7 != 4) {
                                                            break;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    case 21:
                                        if (!sre.m36081a(askf2.f89126d.getResources())) {
                                            break;
                                        } else {
                                            i5 = 27;
                                            break;
                                        }
                                    case 22:
                                        if (((long) Build.VERSION.SDK_INT) < bmuc.f130924b) {
                                            i5 = 28;
                                            break;
                                        }
                                        break;
                                    case 23:
                                        if (((long) Build.VERSION.SDK_INT) > bmuc.f130924b) {
                                            i5 = 29;
                                            break;
                                        }
                                        break;
                                    case 24:
                                        if (atas.m75337a(bmuc.f130929g, Build.MODEL)) {
                                            break;
                                        } else {
                                            i5 = 30;
                                            break;
                                        }
                                }
                            }
                        }
                        i5 = 25;
                        if (i5 != 0) {
                            C1102je a5 = atbg.m75368a(context, atbf.PROMOTIONS);
                            a5.mo13640e(bmun.f130951b);
                            a5.mo13632b(bmun.f130952c);
                            C1101jd jdVar = new C1101jd();
                            jdVar.mo13593a(bmun.f130952c);
                            a5.mo13626a(jdVar);
                            a5.mo13627a(true);
                            a5.mo13616a(bmun.f130961l ? 1 : 0);
                            int i8 = Build.VERSION.SDK_INT;
                            atbg.m75378d(a5, bmun.f130962m);
                            atbg.m75379e(a5, bmun.f130963n);
                            int a6 = bmue.m108387a(bmun.f130959j);
                            if (a6 == 0) {
                                a6 = 1;
                            }
                            int i9 = a6 - 1;
                            if (i9 == 1) {
                                i3 = C0126R.C0127drawable.quantum_ic_google_white_24;
                                i2 = C0126R.color.quantum_googblue;
                                i = C0126R.string.common_google;
                            } else if (i9 == 2) {
                                i3 = C0126R.C0127drawable.quantum_ic_android_white_24;
                                i2 = C0126R.color.quantum_googgreen;
                                i = C0126R.string.tp_android;
                            } else if (i9 == 3 || i9 == 4) {
                                i3 = C0126R.C0127drawable.quantum_ic_google_white_24;
                                i2 = C0126R.color.quantum_googblue;
                                i = C0126R.string.tp_google_pay;
                            } else {
                                m75342a(bmun, askf2, 5);
                                return;
                            }
                            a5.mo13630b(qkj.m32287a(context, i3));
                            if (!bmun.f130953d.isEmpty()) {
                                atbg.m75373a(context, a5, bmun.f130953d);
                            }
                            a5.f22271w = context.getResources().getColor(i2);
                            int i10 = Build.VERSION.SDK_INT;
                            Bundle bundle = new Bundle();
                            bundle.putString("android.substName", context.getString(i));
                            a5.mo13623a(bundle);
                            bmtv bmtv = bmun.f130954e;
                            if (bmtv == null) {
                                bmtv = bmtv.f130913c;
                            }
                            String str = bmun.f130956g;
                            if ((bmun.f130950a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                bmum = bmun.f130960k;
                                if (bmum == null) {
                                    bmum = bmum.f130943d;
                                }
                            } else {
                                bmum = null;
                            }
                            atax a7 = atay.m75352a(askf).mo49774a(bmtv, bmum);
                            int i11 = a7.f89982c;
                            if (i11 != 1) {
                                m75343a(str, askf2, i11);
                                intent = null;
                            } else {
                                intent = atbe.m75363a(askf2.f89126d, askf.mo49209a(), str, a7.f89981b, a7.f89980a);
                            }
                            if (intent != null) {
                                a5.f22254f = m75339a(context, intent);
                                String str2 = bmun.f130964o;
                                if (TextUtils.isEmpty(str2)) {
                                    str2 = context.getResources().getString(C0126R.string.tp_turn_off_gms_core_rendered_notifications);
                                }
                                a5.mo13618a(qkj.m32287a(context, C0126R.C0127drawable.quantum_ic_notifications_off_grey600_24), str2, m75339a(context, IntentOperation.getStartIntent(context, "com.google.android.gms.tapandpay.notifications.GmsCoreRenderedNotificationInteractionIntentOperation", "com.google.android.gms.tapandpay.notifications.GMS_CORE_OPT_OUT_ACTION").putExtra("extra_account_info", askf.mo49209a()).putExtra("campaign_id", bmun.f130956g)));
                                a5.mo13631b(m75339a(context, atbe.m75362a(context, askf.mo49209a(), bmun.f130956g)));
                                bxvd a8 = m75341a(bmun != null ? bmun.f130956g : null, context);
                                int a9 = bmui.m108391a(bmun.f130957h);
                                if (a9 == 0) {
                                    a9 = 1;
                                }
                                int i12 = a9 - 1;
                                if (i12 == 1) {
                                    atbg.m75371a(context, "GmsCoreRenderedNotification", a5);
                                    long currentTimeMillis2 = System.currentTimeMillis();
                                    atkm.f90420c.edit().putLong("gms_core_rendered_notification_last_shown", currentTimeMillis2).apply();
                                    atkm.mo50015b(currentTimeMillis2);
                                    if (a8.f164950c) {
                                        a8.mo74035c();
                                        a8.f164950c = false;
                                    }
                                    bpbx bpbx = (bpbx) a8.f164949b;
                                    bpbx bpbx2 = bpbx.f135635S;
                                    bpbx.f135657c = 58;
                                    bpbx.f135655a |= 1;
                                } else if (i12 != 2) {
                                    m75342a(bmun, askf2, 5);
                                    return;
                                } else {
                                    atkm.mo50015b(System.currentTimeMillis());
                                    if (a8.f164950c) {
                                        a8.mo74035c();
                                        a8.f164950c = false;
                                    }
                                    bpbx bpbx3 = (bpbx) a8.f164949b;
                                    bpbx bpbx4 = bpbx.f135635S;
                                    bpbx3.f135657c = 59;
                                    bpbx3.f135655a |= 1;
                                    i4 = 3;
                                }
                                m75340a(askf).mo49741a((bpbx) a8.mo74062i());
                                NHoursAfterGmsCoreRenderedNotificationTaskOperation.m93071a(bmun.f130956g, i4, askf2);
                                return;
                            }
                            return;
                        }
                        m75342a(bmun, askf2, i5);
                        return;
                    }
                    i5 = 0;
                    if (i5 != 0) {
                    }
                } catch (asks e2) {
                    bnsl bnsl3 = (bnsl) f89972a.mo68387b();
                    bnsl3.mo68437a(e2);
                    bnsl3.mo68432a("atat", "a", 108, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Failed to check filters");
                }
            }
        } else {
            m75343a((String) null, askf2, 5);
        }
    }
}
