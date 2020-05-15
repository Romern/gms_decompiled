package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.auth.authzen.cryptauth.SyncAlarmIntentOperation;

/* renamed from: ihe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ihe {

    /* renamed from: c */
    public static final sek f21007c = new sek("SyncManager");

    /* renamed from: d */
    private static final bngx f21008d = bngx.m109358a(0, 100, Integer.valueOf((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR));

    /* renamed from: e */
    private static ihe f21009e;

    /* renamed from: a */
    public final Object f21010a = new Object();

    /* renamed from: b */
    public final igd f21011b;

    /* renamed from: f */
    private final Context f21012f;

    /* renamed from: g */
    private final ihd f21013g;

    /* renamed from: h */
    private final ijj f21014h;

    /* renamed from: i */
    private final iha f21015i;

    /* renamed from: j */
    private final SharedPreferences f21016j;

    /* renamed from: k */
    private final iiz f21017k;

    private ihe(Context context) {
        igd igd = new igd(context);
        ihd ihd = new ihd(context, new skc(context));
        ijj a = ijj.m15530a();
        iha a2 = iha.m15433a(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.auth.authzen.cryptauth.SyncManager.proximity_features", 0);
        iiz a3 = iix.m15497a(context);
        this.f21012f = context;
        sdo.m34959a(igd);
        this.f21011b = igd;
        sdo.m34959a(ihd);
        this.f21013g = ihd;
        sdo.m34959a(a2);
        this.f21015i = a2;
        sdo.m34959a(a);
        this.f21014h = a;
        sdo.m34959a(sharedPreferences);
        this.f21016j = sharedPreferences;
        this.f21017k = a3;
    }

    /* renamed from: a */
    public static synchronized ihe m15438a(Context context) {
        ihe ihe;
        synchronized (ihe.class) {
            if (f21009e == null) {
                f21009e = new ihe(context.getApplicationContext());
            }
            ihe = f21009e;
        }
        return ihe;
    }

    /* renamed from: b */
    private final long m15442b(int i, String str) {
        return this.f21016j.getLong(m15439a(i, str), 0);
    }

    /* renamed from: a */
    static String m15439a(int i, String str) {
        return String.format("lastSyncedTime:%d:%s", Integer.valueOf(i), str);
    }

    /* renamed from: a */
    private final void m15440a(int i, String str, long j, int i2, int i3) {
        Intent a = SyncAlarmIntentOperation.m6437a(this.f21012f);
        a.setData(new Uri.Builder().scheme("content").authority("com.google.android.gms.auth.be.cryptauth.sync").appendQueryParameter("eventType", Integer.toString(i)).appendQueryParameter("accountName", str).appendQueryParameter("syncComponent", Integer.toString(2)).build());
        a.putExtra("invocationReason", i2);
        a.putExtra("retryCount", i3);
        ihd ihd = this.f21013g;
        if (PendingIntent.getService(ihd.f21005a, 0, a, 536870912) == null) {
            f21007c.mo25414c("Setting up sync %dms later.", Long.valueOf(j));
            ihd.f21006b.mo25675a("CryptAuthSync SyncManager", 3, SystemClock.elapsedRealtime() + j, PendingIntent.getService(ihd.f21005a, 0, a, 134217728), ihd.f21005a.getPackageName());
            return;
        }
        f21007c.mo25414c("Sync not scheduled because there's an existing PendingIntent.", new Object[0]);
    }

    /* renamed from: a */
    private final boolean m15441a(String str) {
        return !this.f21017k.mo13053a(str) && ((Boolean) igt.f20956f.mo58455c()).booleanValue() && (spn.m35890g() || ((Boolean) igt.f20952b.mo58455c()).booleanValue());
    }

    /* renamed from: a */
    public final void mo13007a(int i, int i2) {
        synchronized (this.f21010a) {
            for (Account account : this.f21011b.mo12988a()) {
                mo13008a(i, account.name, i2);
            }
        }
    }

    /* renamed from: a */
    public final void mo13008a(int i, String str, int i2) {
        synchronized (this.f21010a) {
            mo13009a(i, str, 3, i2, 0);
        }
    }

    /* renamed from: a */
    public final void mo13009a(int i, String str, int i2, int i3, int i4) {
        boolean z;
        long j;
        boolean z2;
        long j2;
        long j3;
        int i5 = i;
        String str2 = str;
        int i6 = i3;
        int i7 = i4;
        f21007c.mo25414c("Sync requested for event %d, account %s, and components %x, with reason %d", Integer.valueOf(i), sek.m35081a(str), Integer.valueOf(i2), Integer.valueOf(i3));
        if ((i2 & 1) != 0) {
            mo13010a(i5, str2, i6, i7);
        }
        if ((i2 & 2) == 0) {
            return;
        }
        if (i5 == 300) {
            f21007c.mo25416d("update_registration is not applicable to proximity features.", new Object[0]);
        } else if (i5 == 100 || m15441a(str2) || this.f21017k.mo13053a(str2)) {
            if (i5 != 300) {
                z = true;
            } else {
                z = false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            sdo.m34974b(z);
            if (i5 == 100) {
                j = 0;
            } else {
                if (i5 == 0) {
                    bnre i8 = f21008d.listIterator();
                    j2 = Long.MIN_VALUE;
                    while (i8.hasNext()) {
                        j2 = Math.max(j2, m15442b(((Integer) i8.next()).intValue(), str2));
                    }
                } else {
                    j2 = m15442b(i, str);
                }
                if (i5 != 0) {
                    j3 = i5 != 100 ? i5 != 200 ? ((Long) igt.f20970t.mo58455c()).longValue() : ((Long) igt.f20969s.mo58455c()).longValue() : 0;
                } else {
                    j3 = ((Long) igt.f20968r.mo58455c()).longValue();
                }
                j = j3 - (currentTimeMillis - j2);
            }
            if (j <= 0) {
                this.f21016j.edit().putLong(m15439a(i, str), currentTimeMillis).commit();
                iha iha = this.f21015i;
                if (i5 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!iha.mo13004a(str2, z2, i3, i7)) {
                    f21007c.mo25414c("sync failed for %d", Integer.valueOf(i));
                    if (i5 != 0) {
                        long longValue = ((Long) igt.f20967q.mo58455c()).longValue();
                        long j4 = longValue / 2;
                        double random = Math.random();
                        double d = (double) longValue;
                        Double.isNaN(d);
                        m15440a(i, str, ((long) (random * d)) + j4, i3, i7 + 1);
                        return;
                    }
                    return;
                }
                return;
            }
            f21007c.mo25414c("avoiding sync because the last sync was too recent", new Object[0]);
            if (i5 != 0) {
                f21007c.mo25414c("scheduling sync for %d at %d", Integer.valueOf(i), Long.valueOf(j));
                m15440a(i, str, j, i3, i4);
            }
        } else {
            f21007c.mo25414c("Ignoring proximity features sync because it's not enabled, and force sync is not requested", new Object[0]);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046 A[SYNTHETIC] */
    /* renamed from: a */
    public final boolean mo13010a(int i, String str, int i2, int i3) {
        int i4;
        boolean a;
        int i5 = 2;
        if (i != 0) {
            if (i == 100) {
                f21007c.mo25414c("Triggering AuthZen registration...", new Object[0]);
                i4 = 2;
            } else if (i != 200) {
                if (i != 300) {
                    f21007c.mo25418e("Unknown event type: %d.", Integer.valueOf(i));
                    return false;
                }
                i4 = 3;
            }
            if (i4 != 1 || !m15441a(str)) {
                i5 = i4;
            }
            synchronized (this.f21010a) {
                a = this.f21014h.mo13062a(i5, str, i2, i3);
            }
            return a;
        }
        f21007c.mo25414c("Triggering AuthZen registration check...", new Object[0]);
        i4 = 1;
        i5 = i4;
        synchronized (this.f21010a) {
        }
    }
}
