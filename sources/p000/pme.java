package p000;

import android.content.SharedPreferences;

/* renamed from: pme */
final /* synthetic */ class pme implements Runnable {

    /* renamed from: a */
    private final pmh f39667a;

    public pme(pmh pmh) {
        this.f39667a = pmh;
    }

    public final void run() {
        pmh pmh = this.f39667a;
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        SharedPreferences b = qay.m31785b(pmh.f39677e);
        if (valueOf.longValue() - Long.valueOf(b.getLong("com.google.android.gms.cast_PREF_DATABASE_PURGED_TIME", 0)).longValue() > pmh.f39673c) {
            pmh.f39681i.mo23496f();
            b.edit().putLong("com.google.android.gms.cast_PREF_DATABASE_PURGED_TIME", System.currentTimeMillis()).apply();
            pmh.f39681i.mo23489b();
        }
    }
}
