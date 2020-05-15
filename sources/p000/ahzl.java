package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;

/* renamed from: ahzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahzl implements ahzj {

    /* renamed from: a */
    long f68473a;

    /* renamed from: b */
    private final SharedPreferences f68474b;

    public ahzl(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("fast_pair_bloom_filter_pref", 0);
        this.f68474b = sharedPreferences;
        this.f68473a = sharedPreferences.getLong("next_check_millis", SystemClock.elapsedRealtime());
        long a = m56914a();
        if (this.f68473a > a) {
            this.f68473a = a;
            this.f68474b.edit().putLong("next_check_millis", this.f68473a).apply();
        }
    }

    /* renamed from: a */
    private static final long m56914a() {
        return SystemClock.elapsedRealtime() + cfog.m141282j();
    }

    /* renamed from: b */
    public final synchronized void mo37317b(String str) {
        this.f68473a = m56914a();
        this.f68474b.edit().putLong("next_check_millis", this.f68473a).apply();
    }

    /* renamed from: a */
    public final synchronized boolean mo37316a(String str) {
        return SystemClock.elapsedRealtime() > this.f68473a;
    }
}
