package p000;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: altn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class altn {

    /* renamed from: a */
    public final altq f74225a;

    /* renamed from: b */
    public final ConcurrentHashMap f74226b = new ConcurrentHashMap();

    /* renamed from: c */
    public final ConcurrentHashMap f74227c = new ConcurrentHashMap();

    /* renamed from: d */
    private final ssm f74228d = new ssm();

    /* renamed from: e */
    private final ConcurrentHashMap f74229e = new ConcurrentHashMap();

    public altn(altq altq) {
        this.f74225a = altq;
    }

    /* renamed from: a */
    private final altm m61773a(String str, String str2, boolean z) {
        altm altm;
        Object obj;
        if (!z) {
            ssm ssm = this.f74228d;
            synchronized (ssm.f45088a) {
                int size = ssm.f45088a.size();
                if (size > 0) {
                    obj = ssm.f45088a.remove(size - 1);
                } else {
                    obj = new altm();
                }
            }
            altm = (altm) obj;
        } else {
            altm = new altm();
        }
        altm.f74223a = str;
        altm.f74224b = str2;
        return altm;
    }

    /* renamed from: b */
    public final String mo40739b(String str, String str2) {
        long a = mo40738a(str, str2);
        if (a == -1) {
            return "";
        }
        ConcurrentHashMap concurrentHashMap = this.f74229e;
        Long valueOf = Long.valueOf(a);
        String str3 = (String) concurrentHashMap.get(valueOf);
        if (str3 != null) {
            return str3;
        }
        String valueOf2 = String.valueOf(a);
        this.f74229e.put(valueOf, valueOf2);
        return valueOf2;
    }

    /* renamed from: a */
    public static final altn m61774a(Context context) {
        return altq.m61806a(context).f74250f;
    }

    /* renamed from: a */
    public final long mo40738a(String str, String str2) {
        long j;
        Cursor cursor;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        altm a = m61773a(str, str2, false);
        try {
            Long l = (Long) this.f74226b.get(a);
            if (l == null) {
                alto b = this.f74225a.mo40763b();
                if (b != null) {
                    if (!TextUtils.isEmpty(str2)) {
                        cursor = b.mo40744a("SELECT _id FROM owners WHERE (account_name = ?1) AND (page_gaia_id = ?2)", new String[]{str, str2});
                    } else {
                        cursor = b.mo40744a("SELECT _id FROM owners WHERE (account_name = ?1) AND (page_gaia_id IS NULL)", new String[]{str});
                    }
                    if (cursor.moveToFirst()) {
                        j = cursor.getLong(0);
                        cursor.close();
                    } else {
                        cursor.close();
                        j = -1;
                    }
                } else {
                    j = -1;
                }
                if (j != -1) {
                    this.f74226b.put(m61773a(str, str2, true), Long.valueOf(j));
                }
            } else {
                j = l.longValue();
            }
            this.f74228d.mo26046a(a);
            return j;
        } catch (Throwable th) {
            this.f74228d.mo26046a(a);
            throw th;
        }
    }
}
