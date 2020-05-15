package p000;

import android.text.TextUtils;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: dqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dqt {

    /* renamed from: a */
    public static final TimeZone f13835a = TimeZone.getTimeZone("GMT");

    /* renamed from: b */
    public static final TimeZone f13836b = TimeZone.getTimeZone("UTC");

    static {
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    }

    /* renamed from: a */
    public static long m9097a(long j) {
        return TimeUnit.MICROSECONDS.toMillis(j);
    }

    /* renamed from: c */
    public static long m9106c(long j, TimeZone timeZone) {
        if (timeZone == null || timeZone.getRawOffset() == 0) {
            return j;
        }
        Calendar a = m9100a(j, f13836b);
        Calendar a2 = m9101a(timeZone);
        a2.set(1, a.get(1));
        a2.set(2, a.get(2));
        a2.set(5, a.get(5));
        a2.set(11, a.get(11));
        a2.set(12, a.get(12));
        a2.set(13, a.get(13));
        a2.set(14, a.get(14));
        return a2.getTimeInMillis();
    }

    /* renamed from: a */
    public static long m9098a(TimeZone timeZone, TimeZone timeZone2) {
        if (!TextUtils.equals(timeZone.getID(), timeZone2.getID())) {
            return (((long) timeZone.getRawOffset()) - ((long) timeZone2.getRawOffset())) + ((long) (timeZone.getDSTSavings() - timeZone2.getDSTSavings()));
        }
        return 0;
    }

    /* renamed from: b */
    public static long m9103b(long j, TimeZone timeZone) {
        Calendar a = m9100a(j, timeZone);
        a.set(11, 0);
        a.set(12, 0);
        a.set(13, 0);
        a.set(14, 0);
        return j - a.getTimeInMillis();
    }

    /* renamed from: a */
    public static bxkx m9099a(Calendar calendar) {
        bxvd da = bxkx.f163810f.mo74144da();
        int i = calendar.get(5);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxkx bxkx = (bxkx) da.f164949b;
        bxkx.f163812a |= 1;
        bxkx.f163813b = i;
        int i2 = calendar.get(2) + 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxkx bxkx2 = (bxkx) da.f164949b;
        bxkx2.f163812a |= 2;
        bxkx2.f163814c = i2;
        int i3 = calendar.get(1);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxkx bxkx3 = (bxkx) da.f164949b;
        bxkx3.f163812a |= 4;
        bxkx3.f163815d = i3;
        switch (calendar.get(7)) {
            case 1:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxkx bxkx4 = (bxkx) da.f164949b;
                bxkx4.f163816e = 1;
                bxkx4.f163812a |= 8;
                break;
            case 2:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxkx bxkx5 = (bxkx) da.f164949b;
                bxkx5.f163816e = 2;
                bxkx5.f163812a |= 8;
                break;
            case 3:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxkx bxkx6 = (bxkx) da.f164949b;
                bxkx6.f163816e = 3;
                bxkx6.f163812a |= 8;
                break;
            case 4:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxkx bxkx7 = (bxkx) da.f164949b;
                bxkx7.f163816e = 4;
                bxkx7.f163812a |= 8;
                break;
            case 5:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxkx bxkx8 = (bxkx) da.f164949b;
                bxkx8.f163816e = 5;
                bxkx8.f163812a |= 8;
                break;
            case 6:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxkx bxkx9 = (bxkx) da.f164949b;
                bxkx9.f163816e = 6;
                bxkx9.f163812a |= 8;
                break;
            case 7:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxkx bxkx10 = (bxkx) da.f164949b;
                bxkx10.f163816e = 7;
                bxkx10.f163812a |= 8;
                break;
            default:
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxkx bxkx11 = (bxkx) da.f164949b;
                bxkx11.f163816e = 0;
                bxkx11.f163812a |= 8;
                break;
        }
        return (bxkx) da.mo74062i();
    }

    /* renamed from: b */
    private static tka m9104b(tka tka) {
        boolean z;
        long c = tka.mo18096c();
        long d = tka.mo18097d();
        boolean z2 = true;
        if (!m9105b(tka.mo18096c())) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dqt", "b", (int) BaseMfiEventCallback.TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[TimeUtils] Invalid start time received for the context.");
            c = TimeUnit.MICROSECONDS.toMillis(tka.mo18096c());
            z = true;
        } else {
            z = false;
        }
        if (!m9105b(tka.mo18097d())) {
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
            bnsl2.mo68432a("dqt", "b", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("[TimeUtils] Invalid end time received for the context.");
            d = TimeUnit.MICROSECONDS.toMillis(tka.mo18097d());
        } else {
            z2 = z;
        }
        if (z2) {
            return tka.m37118a(c, d);
        }
        return null;
    }

    /* renamed from: b */
    private static boolean m9105b(long j) {
        return dwq.m9665i().mo20505a() + 3153600000000L > j;
    }

    /* renamed from: a */
    public static Calendar m9100a(long j, TimeZone timeZone) {
        Calendar a = m9101a(timeZone);
        a.setTimeInMillis(j);
        return a;
    }

    /* renamed from: a */
    public static Calendar m9101a(TimeZone timeZone) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeZone(timeZone);
        instance.setLenient(true);
        return instance;
    }

    /* renamed from: a */
    public static tka m9102a(tka tka) {
        boolean z;
        int a = tka.mo26615a();
        boolean z2 = true;
        if (a != 1) {
            if (a != 2) {
                if (a != 3) {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                    bnsl.mo68432a("dqt", "a", 191, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68409a("[TimeUtils] Invalid time type %s received. Cannot proceed", tka.mo26615a());
                    return null;
                }
                long c = tka.mo18096c();
                long d = tka.mo18097d();
                if (!m9105b(tka.mo18096c())) {
                    bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                    bnsl2.mo68432a("dqt", "b", (int) BaseMfiEventCallback.TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("[TimeUtils] Invalid start time received for the context.");
                    c = TimeUnit.MICROSECONDS.toMillis(tka.mo18096c());
                    z = true;
                } else {
                    z = false;
                }
                if (!m9105b(tka.mo18097d())) {
                    bnsl bnsl3 = (bnsl) dss.f13961a.mo68387b();
                    bnsl3.mo68432a("dqt", "b", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("[TimeUtils] Invalid end time received for the context.");
                    d = TimeUnit.MICROSECONDS.toMillis(tka.mo18097d());
                } else {
                    z2 = z;
                }
                if (z2) {
                    return tka.m37118a(c, d);
                }
                return null;
            } else if (!m9105b(tka.mo18096c())) {
                return tka.m37119b(TimeUnit.MICROSECONDS.toMillis(tka.mo18096c()));
            } else {
                return null;
            }
        } else if (!m9105b(tka.mo18096c())) {
            return tka.m37117a(TimeUnit.MICROSECONDS.toMillis(tka.mo18096c()));
        } else {
            return null;
        }
    }
}
