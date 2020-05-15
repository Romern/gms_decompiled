package p000;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.os.Vibrator;
import android.text.TextUtils;
import com.felicanetworks.mfc.FelicaException;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: asus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asus extends asum {

    /* renamed from: a */
    public static final long[] f89768a = {0, 150, 135, 150, 135, 150};

    /* renamed from: b */
    public static volatile ScheduledExecutorService f89769b;

    /* renamed from: c */
    public Future f89770c;

    /* renamed from: d */
    private long f89771d = Long.MIN_VALUE;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    /* renamed from: a */
    private static boolean m74869a(asqw asqw) {
        return asqw.f89452p != -1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: b */
    private final void m74870b(Context context, asqw asqw, int i) {
        byte[] bArr;
        int i2 = asqw.f89454r;
        if (i2 != -1) {
            long j = asqw.f89425B;
            long[] jArr = f89768a;
            long max = Math.max(0L, 535 - (SystemClock.elapsedRealtime() - j));
            asus asus = new asuq(this).f89765a;
            boolean z = true;
            snf a = snp.m35703a(1, 9);
            asus.f89770c = ((sny) a).schedule(new asur((Vibrator) context.getSystemService("vibrator"), jArr), max, TimeUnit.MILLISECONDS);
            a.shutdown();
            if ((i2 == 19 || i2 == 21) && cgwn.m147265o()) {
                astb.m74745f(SystemClock.elapsedRealtime());
            }
            if (i2 == -1) {
                z = false;
            }
            sdo.m34974b(z);
            context.startService(atmz.m76201a(context, 7).putExtra("failedReason", i2));
        } else if (i == 0) {
            asrb asrb = asqw.f89428E;
            String str = null;
            if (asrb != null) {
                bArr = asrb.mo49400a(40782);
            } else {
                bArr = null;
            }
            if (bArr != null) {
                str = new String(bArr, StandardCharsets.US_ASCII).trim();
            }
            CardInfo cardInfo = asqw.f89457u;
            Intent a2 = atmz.m76201a(context, 6);
            if (cardInfo != null) {
                a2.putExtra("paymentCardInfo", cardInfo);
            }
            if (!TextUtils.isEmpty(str)) {
                a2.putExtra("merchantName", str);
            }
            context.startService(a2);
        }
    }

    /* renamed from: a */
    public final void mo49486a(Context context, asqw asqw, int i) {
        if (m74871b(asqw)) {
            return;
        }
        if (m74869a(asqw) || asqw.f89454r == 27) {
            if (!m74869a(asqw)) {
                asqw.f89452p = SystemClock.elapsedRealtime() - asqw.f89450n;
                context.startService(atmz.m76203a(context, asqw.f89457u));
            }
            m74870b(context, asqw, i);
            asqw.f89453q = SystemClock.elapsedRealtime() - asqw.f89450n;
        }
    }

    /* renamed from: a */
    public final void mo49510a(Context context, asqw asqw, asqt asqt) {
        sre.m36089i(context);
        if (!m74869a(asqw)) {
            int i = asqw.f89454r;
            switch (i) {
                case 2:
                case 3:
                case 6:
                case 8:
                case 20:
                default:
                    StringBuilder sb = new StringBuilder(28);
                    sb.append("Illegal failure: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                case -1:
                case 0:
                case 1:
                case 4:
                case 5:
                case 7:
                case 9:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 19:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                case FelicaException.TYPE_PUSH_FAILED:
                    Future future = this.f89770c;
                    if (future != null) {
                        future.cancel(true);
                        this.f89770c = null;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = this.f89771d;
                    if (elapsedRealtime > j + 400) {
                        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
                        vibrator.cancel();
                        vibrator.vibrate(400);
                        j = SystemClock.elapsedRealtime();
                        this.f89771d = j;
                    }
                    asqw.f89425B = j;
                    context.startService(atmz.m76203a(context, asqw.f89457u));
                    asqw.f89452p = SystemClock.elapsedRealtime() - asqw.f89450n;
                    break;
                case 10:
                case 17:
                case 18:
                case FelicaException.TYPE_NOT_CLOSED:
                case FelicaException.TYPE_USED_BY_OTHER_APP:
                    break;
            }
        }
        if (m74869a(asqw) && !m74871b(asqw)) {
            int i2 = asqw.f89454r;
            switch (i2) {
                case -1:
                case 1:
                case 4:
                case 5:
                case 7:
                case 9:
                case 10:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case FelicaException.TYPE_NOT_CLOSED:
                case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                case FelicaException.TYPE_PUSH_FAILED:
                    m74870b(context, asqw, 0);
                    asqw.f89453q = SystemClock.elapsedRealtime() - asqw.f89450n;
                    return;
                case 0:
                case 11:
                case 12:
                case FelicaException.TYPE_USED_BY_OTHER_APP:
                    return;
                case 2:
                case 3:
                case 6:
                case 8:
                case 20:
                default:
                    StringBuilder sb2 = new StringBuilder(28);
                    sb2.append("Illegal failure: ");
                    sb2.append(i2);
                    throw new IllegalArgumentException(sb2.toString());
            }
        }
    }

    /* renamed from: b */
    private static final boolean m74871b(asqw asqw) {
        return asqw.f89453q != -1;
    }
}
