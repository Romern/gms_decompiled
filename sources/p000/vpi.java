package p000;

import java.util.Locale;

/* renamed from: vpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vpi implements vpo {

    /* renamed from: a */
    private final voq f49712a;

    /* renamed from: b */
    private final vff f49713b;

    /* renamed from: c */
    private final String f49714c;

    public vpi(sqv sqv, vff vff, String str, bdyx bdyx, bdyx bdyx2) {
        long j;
        int i;
        sdo.m34959a((Object) str);
        this.f49714c = str;
        this.f49713b = vff;
        sdo.m34959a((Object) str);
        String valueOf = String.valueOf(str);
        vfg vfg = (vfg) vff;
        long j2 = vfg.mo28388d().getLong(valueOf.length() == 0 ? new String("bucket_rate_limiter_last_token_time.") : "bucket_rate_limiter_last_token_time.".concat(valueOf), -1);
        sdo.m34959a((Object) str);
        String valueOf2 = String.valueOf(str);
        int i2 = vfg.mo28388d().getInt(valueOf2.length() == 0 ? new String("bucket_rate_limiter_num_tokens.") : "bucket_rate_limiter_num_tokens.".concat(valueOf2), -1);
        if (j2 >= 0 && i2 >= 0) {
            i = i2;
            j = j2;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            i = ((Integer) bdyx.mo58455c()).intValue();
            j = currentTimeMillis;
        }
        this.f49712a = new voq(sqv, bdyx, bdyx2, i, j);
    }

    /* renamed from: a */
    private final synchronized void m41015a() {
        int b = this.f49712a.mo28701b();
        long a = this.f49712a.mo28700a();
        vff vff = this.f49713b;
        String str = this.f49714c;
        sdo.m34959a((Object) str);
        ((vfg) vff).mo28388d().edit().putInt(str.length() == 0 ? new String("bucket_rate_limiter_num_tokens.") : "bucket_rate_limiter_num_tokens.".concat(str), b).putLong(str.length() == 0 ? new String("bucket_rate_limiter_last_token_time.") : "bucket_rate_limiter_last_token_time.".concat(str), a).apply();
    }

    /* renamed from: c */
    public final synchronized boolean mo28702c() {
        return this.f49712a.mo28702c();
    }

    /* renamed from: d */
    public final synchronized boolean mo28703d() {
        boolean d;
        d = this.f49712a.mo28703d();
        m41015a();
        return d;
    }

    /* renamed from: f */
    public final synchronized void mo28705f() {
        throw null;
    }

    /* renamed from: g */
    public final synchronized void mo28706g() {
        m41015a();
    }

    public final String toString() {
        return String.format(Locale.US, "%s[%s]", "PersistentBucketRateLimiter", this.f49712a);
    }
}
