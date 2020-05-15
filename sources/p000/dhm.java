package p000;

import android.content.Context;
import android.content.Intent;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: dhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dhm {

    /* renamed from: a */
    public static final long f13138a = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: b */
    public String f13139b;

    /* renamed from: c */
    public ExecutorService f13140c;

    /* renamed from: d */
    public ThreadPoolExecutor f13141d;

    /* renamed from: e */
    public final dii f13142e;

    /* renamed from: f */
    public final ReentrantLock f13143f;

    /* renamed from: g */
    public final Map f13144g = adyi.m51410a();

    /* renamed from: h */
    public int f13145h;

    /* renamed from: i */
    public final Queue f13146i;

    /* renamed from: j */
    public final Map f13147j;

    /* renamed from: k */
    public final Context f13148k;

    /* renamed from: l */
    public final dhh f13149l;

    /* renamed from: m */
    public final boolean f13150m;

    /* renamed from: n */
    public final Runnable f13151n;

    public dhm(ReentrantLock reentrantLock, dii dii, Context context, dhh dhh) {
        boolean z = false;
        this.f13145h = 0;
        this.f13146i = new ConcurrentLinkedQueue();
        this.f13147j = adyi.m51410a();
        this.f13151n = new dhd(this);
        this.f13143f = reentrantLock;
        this.f13142e = dii;
        this.f13148k = context;
        this.f13149l = dhh;
        if (dfq.m8314a().mo8863b()) {
            dfq.m8314a();
            if (cdjh.f180979a.mo6606a().mo77738c()) {
                z = true;
            }
        }
        this.f13150m = z;
    }

    /* renamed from: a */
    public static String m8501a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    static /* synthetic */ void m8502a(dhm dhm) {
        dhm.f13145h--;
    }

    /* renamed from: a */
    public final dhi mo9017a(Intent intent, int i, int i2, List list) {
        return new dhi(this, intent, i, i2, list);
    }
}
