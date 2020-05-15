package p000;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.net.NetworkScoreManager;
import android.net.ScoredNetwork;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/* renamed from: akmd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akmd {

    /* renamed from: a */
    public static final akmc f72242a = new akmc("com.google.android.gms.netrec.ssidTries");

    /* renamed from: d */
    private static final akmr f72243d = new akmr((int) cfpd.f185332a.mo6606a().mo82460y());

    /* renamed from: b */
    public final Context f72244b;

    /* renamed from: c */
    private final akmy f72245c;

    public akmd(Context context, akmy akmy) {
        this.f72244b = context;
        this.f72245c = akmy;
    }

    /* renamed from: a */
    public static long m59994a(long j, String str) {
        int i;
        long j2;
        long millis = TimeUnit.SECONDS.toMillis(j);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        akmr akmr = f72243d;
        Integer num = (Integer) f72242a.f72241b.mo10354a().getAll().get(akmk.m60015a(str));
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        if (i < akmr.f72272a) {
            j2 = BigDecimal.valueOf(millis).multiply(BigDecimal.valueOf(Math.pow(2.0d, (double) i))).toBigInteger().longValue();
        } else {
            j2 = -1;
        }
        long seconds = timeUnit.toSeconds(j2);
        if (seconds == -1) {
            return -1;
        }
        return seconds;
    }

    /* renamed from: a */
    public static akmd m59995a(Context context) {
        return new akmd(context, akmy.m60045a(context));
    }

    /* renamed from: a */
    public final boolean mo39552a(String str, String[] strArr, boolean z) {
        boolean z2;
        if (TextUtils.isEmpty(str) || !akmi.m60010b(this.f72244b)) {
            return false;
        }
        try {
            ScoredNetwork[] a = this.f72245c.mo39577a(str, strArr, z);
            if (a.length <= 0) {
                return false;
            }
            try {
                ((NetworkScoreManager) this.f72244b.getSystemService("network_score")).updateScores(a);
                z2 = true;
            } catch (SecurityException e) {
                int i = eoa.f15378a;
                z2 = false;
            }
            if (z2) {
                return z2;
            }
            new Object[1][0] = eoa.m10821a(aknk.m60088b(str), cfpd.m142365e());
            return false;
        } catch (IllegalArgumentException e2) {
            eoa.m10828c("NetRec", "Invalid SSID, failed to null out ratings for %s", eoa.m10821a(str, cfpd.m142365e()));
            return false;
        } catch (SQLiteException e3) {
            eoa.m10825a("NetRec", e3, "Unable to open the DB, failed to null out ratings for %s", eoa.m10821a(str, cfpd.m142365e()));
            return false;
        }
    }
}
