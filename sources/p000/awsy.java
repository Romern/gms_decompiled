package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import java.security.SecureRandom;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: awsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awsy implements awpl {

    /* renamed from: a */
    public static final List f95069a = sqw.m36034a((Object[]) new String[]{"INSTANTBUY_SYNC_GCM_TASK_STEP_1", "INSTANTBUY_SYNC_GCM_TASK_STEP_2", "INSTANTBUY_SYNC_GCM_TASK_STEP_3"});

    /* renamed from: b */
    private final Context f95070b;

    /* renamed from: c */
    private final awua f95071c;

    /* renamed from: d */
    private final SecureRandom f95072d = awvz.m81273a();

    /* renamed from: e */
    private final awwo f95073e;

    public awsy(Context context) {
        this.f95070b = context;
        this.f95071c = new awvy(context, new awgj(rpr.m34216b().getRequestQueue()));
        this.f95073e = new awwo(context);
    }

    /* renamed from: a */
    static final long m80985a(byah byah) {
        long[] jArr = new long[3];
        jArr[0] = (System.currentTimeMillis() - SystemClock.elapsedRealtime()) - TimeUnit.DAYS.toMillis(1);
        byag byag = byah.f165261d;
        if (byag == null) {
            byag = byag.f165248g;
        }
        jArr[1] = byag.f165251b;
        byag byag2 = byah.f165261d;
        if (byag2 == null) {
            byag2 = byag.f165248g;
        }
        jArr[2] = byag2.f165252c;
        long a = bqcr.m112595a(jArr);
        byag byag3 = byah.f165261d;
        if (byag3 == null) {
            byag3 = byag.f165248g;
        }
        long j = a / byag3.f165254e;
        byag byag4 = byah.f165261d;
        if (byag4 == null) {
            byag4 = byag.f165248g;
        }
        long j2 = j * byag4.f165254e;
        byag byag5 = byah.f165261d;
        if (byag5 == null) {
            byag5 = byag.f165248g;
        }
        long j3 = j2 + byag5.f165255f;
        if (j3 > a) {
            return j3;
        }
        byag byag6 = byah.f165261d;
        if (byag6 == null) {
            byag6 = byag.f165248g;
        }
        return j3 + byag6.f165254e;
    }

    /* renamed from: a */
    private final byah m80986a(Account account) {
        byae byae;
        byah a = this.f95073e.mo52680a(1, account);
        if (a == null) {
            byae = (byae) byah.f165256g.mo74144da();
        } else {
            bxvd bxvd = (bxvd) a.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) a);
            byae = (byae) bxvd;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int intValue = ((Integer) awjf.f94531b.mo58455c()).intValue();
        long millis = TimeUnit.HOURS.toMillis((long) intValue);
        byah byah = (byah) byae.f164949b;
        if ((byah.f165258a & 8) != 0) {
            byag byag = byah.f165261d;
            if (byag == null) {
                byag = byag.f165248g;
            }
            if (byag.f165251b != 0) {
                byag byag2 = ((byah) byae.f164949b).f165261d;
                if (byag2 == null) {
                    byag2 = byag.f165248g;
                }
                if (currentTimeMillis >= byag2.f165251b) {
                    byag byag3 = ((byah) byae.f164949b).f165261d;
                    if (byag3 == null) {
                        byag3 = byag.f165248g;
                    }
                    if (currentTimeMillis >= byag3.f165252c) {
                        byag byag4 = ((byah) byae.f164949b).f165261d;
                        if (byag4 == null) {
                            byag4 = byag.f165248g;
                        }
                        if (byag4.f165254e == millis) {
                            return a;
                        }
                    }
                }
            }
        }
        bxvd da = byag.f165248g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byag byag5 = (byag) da.f164949b;
        int i = byag5.f165250a | 1;
        byag5.f165250a = i;
        byag5.f165251b = currentTimeMillis;
        byag5.f165250a = i | 8;
        byag5.f165254e = millis;
        long a2 = awrt.m80807a(this.f95072d, intValue, TimeUnit.HOURS);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byag byag6 = (byag) da.f164949b;
        byag6.f165250a |= 16;
        byag6.f165255f = a2;
        byag byag7 = (byag) da.mo74062i();
        if (byae.f164950c) {
            byae.mo74035c();
            byae.f164950c = false;
        }
        byah byah2 = (byah) byae.f164949b;
        byag7.getClass();
        byah2.f165261d = byag7;
        byah2.f165258a |= 8;
        byah byah3 = (byah) byae.mo74062i();
        this.f95073e.mo52681a(1, account, byah3);
        return byah3;
    }

    /* renamed from: a */
    private final void m80987a() {
        aeat a = aeat.m51532a(this.f95070b);
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.wallet.service.WalletGcmTaskService";
        aebi.mo34023a(0);
        aebi.mo34024a(1, 1);
        aebi.f63099k = "INSTANTBUY_SYNC_GCM_TASK_STEP_2";
        aebi.mo34004a(0, TimeUnit.MINUTES.toSeconds(1));
        a.mo33984a(aebi.mo33974b());
    }

    /* renamed from: a */
    public static void m80988a(Context context) {
        awwo awwo = new awwo(context);
        aeat a = aeat.m51532a(context);
        if (((Boolean) awjf.f94530a.mo58455c()).booleanValue()) {
            aebl aebl = new aebl();
            aebl.f63097i = "com.google.android.gms.wallet.service.WalletGcmTaskService";
            aebl.mo34023a(0);
            aebl.mo34024a(1, 1);
            aebl.f63099k = "INSTANTBUY_SYNC_GCM_TASK_STEP_1";
            aebl.f63070a = TimeUnit.HOURS.toSeconds(24);
            aebl.f63071b = TimeUnit.HOURS.toSeconds(1);
            aebl.mo34027b(0);
            if (cdny.m134354s()) {
                aebl.mo34009a(aebh.EVERY_DAY);
            } else {
                aebl.f63070a = TimeUnit.HOURS.toSeconds(24);
                aebl.f63071b = TimeUnit.HOURS.toSeconds(1);
            }
            a.mo33984a(aebl.mo33974b());
            return;
        }
        for (String str : f95069a) {
            a.mo33986a(str, "com.google.android.gms.wallet.service.WalletGcmTaskService");
        }
        Account[] a2 = adyd.m51363a(context).mo33916a("com.google");
        for (Account account : a2) {
            byah a3 = awwo.mo52680a(1, account);
            if (a3 != null) {
                bxvd bxvd = (bxvd) a3.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) a3);
                byae byae = (byae) bxvd;
                if (byae.f164950c) {
                    byae.mo74035c();
                    byae.f164950c = false;
                }
                byah byah = (byah) byae.f164949b;
                byah.f165261d = null;
                byah.f165258a &= -9;
                awwo.mo52681a(1, account, (byah) byae.mo74062i());
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final int mo52449a(aecc aecc) {
        char c;
        int intExtra;
        NetworkInfo activeNetworkInfo;
        if (((Boolean) awjf.f94530a.mo58455c()).booleanValue()) {
            String str = aecc.f63128a;
            int i = 1;
            switch (str.hashCode()) {
                case -1511728000:
                    if (str.equals("INSTANTBUY_SYNC_GCM_TASK_STEP_1")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1511727999:
                    if (str.equals("INSTANTBUY_SYNC_GCM_TASK_STEP_2")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1511727998:
                    if (str.equals("INSTANTBUY_SYNC_GCM_TASK_STEP_3")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                Account[] a = adyd.m51363a(this.f95070b).mo33916a("com.google");
                long currentTimeMillis = System.currentTimeMillis();
                int length = a.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (currentTimeMillis < m80985a(m80986a(a[i2]))) {
                            i2++;
                        } else {
                            m80987a();
                        }
                    }
                }
                return 0;
            } else if (c == 1) {
                Account[] a2 = adyd.m51363a(this.f95070b).mo33916a("com.google");
                long currentTimeMillis2 = System.currentTimeMillis();
                int length2 = a2.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length2) {
                        if (currentTimeMillis2 >= m80985a(m80986a(a2[i3]))) {
                            long seconds = TimeUnit.MILLISECONDS.toSeconds(awrt.m80807a(this.f95072d, ((Integer) awjf.f94532c.mo58455c()).intValue(), TimeUnit.MINUTES));
                            aeat a3 = aeat.m51532a(this.f95070b);
                            aebi aebi = new aebi();
                            aebi.f63097i = "com.google.android.gms.wallet.service.WalletGcmTaskService";
                            aebi.f63099k = "INSTANTBUY_SYNC_GCM_TASK_STEP_3";
                            aebi.mo34024a(0, 0);
                            aebi.mo34023a(2);
                            aebi.mo34004a(seconds, TimeUnit.MINUTES.toSeconds(1) + seconds);
                            a3.mo33984a(aebi.mo33974b());
                        } else {
                            i3++;
                        }
                    }
                }
                return 0;
            } else if (c == 2) {
                Intent registerReceiver = this.f95070b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver == null || (!((intExtra = registerReceiver.getIntExtra("status", -1)) == 2 || intExtra == 5) || (activeNetworkInfo = ((ConnectivityManager) this.f95070b.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected())) {
                    m80987a();
                    return 0;
                }
                Account[] a4 = adyd.m51363a(this.f95070b).mo33916a("com.google");
                long currentTimeMillis3 = System.currentTimeMillis();
                int length3 = a4.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length3) {
                    Account account = a4[i4];
                    byah a5 = m80986a(account);
                    bxvd bxvd = (bxvd) a5.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) a5);
                    byae byae = (byae) bxvd;
                    if (currentTimeMillis3 >= m80985a((byah) byae.mo74062i())) {
                        int a6 = new awsu(this.f95070b, this.f95071c, this.f95073e).mo52542a(account, i, byae, 3);
                        if (a6 != 0) {
                            i5 = 2;
                        }
                        byag byag = ((byah) byae.f164949b).f165261d;
                        if (byag == null) {
                            byag = byag.f165248g;
                        }
                        bxvd bxvd2 = (bxvd) byag.mo74142c(5);
                        bxvd2.mo73625a((GeneratedMessageLite) byag);
                        byag byag2 = ((byah) byae.f164949b).f165261d;
                        if (byag2 == null) {
                            byag2 = byag.f165248g;
                        }
                        int i6 = byag2.f165253d + i;
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        byag byag3 = (byag) bxvd2.f164949b;
                        byag3.f165250a |= 4;
                        byag3.f165253d = i6;
                        byag byag4 = (byag) bxvd2.mo74062i();
                        if (a6 == 0 || byag4.f165253d > ((Integer) awjf.f94533d.mo58455c()).intValue()) {
                            bxvd bxvd3 = (bxvd) byag4.mo74142c(5);
                            bxvd3.mo73625a((GeneratedMessageLite) byag4);
                            if (bxvd3.f164950c) {
                                bxvd3.mo74035c();
                                bxvd3.f164950c = false;
                            }
                            byag byag5 = (byag) bxvd3.f164949b;
                            int i7 = byag5.f165250a | 4;
                            byag5.f165250a = i7;
                            byag5.f165253d = 0;
                            byag5.f165250a = i7 | 2;
                            byag5.f165252c = currentTimeMillis3;
                            byag4 = (byag) bxvd3.mo74062i();
                        }
                        if (byae.f164950c) {
                            byae.mo74035c();
                            byae.f164950c = false;
                        }
                        byah byah = (byah) byae.f164949b;
                        byah byah2 = byah.f165256g;
                        byag4.getClass();
                        byah.f165261d = byag4;
                        byah.f165258a |= 8;
                        this.f95073e.mo52681a(1, account, (byah) byae.mo74062i());
                    }
                    i4++;
                    i = 1;
                }
                return i5;
            }
        }
        return 0;
    }
}
