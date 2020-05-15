package p000;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;

/* renamed from: juu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class juu {

    /* renamed from: c */
    private static final Logger f23269c = ght.m13171a("DeviceSignalsService", "LockScreenSignalsProvider");

    /* renamed from: d */
    private static juu f23270d;

    /* renamed from: a */
    public final SharedPreferences f23271a;

    /* renamed from: b */
    public final Object f23272b = new Object();

    /* renamed from: e */
    private final KeyguardManager f23273e;

    public juu(SharedPreferences sharedPreferences, KeyguardManager keyguardManager) {
        this.f23271a = sharedPreferences;
        this.f23273e = keyguardManager;
    }

    /* renamed from: a */
    private static long m17356a(long j, long j2) {
        if (j2 < Long.MAX_VALUE - j) {
            return j + j2;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: c */
    private final long m17358c() {
        long j;
        synchronized (this.f23272b) {
            j = this.f23271a.getLong("lockScreenSecureDuration", -1);
        }
        return j;
    }

    /* renamed from: d */
    private final long m17359d() {
        long j;
        synchronized (this.f23272b) {
            j = this.f23271a.getLong("lastLockScreenCheckTime", -1);
        }
        return j;
    }

    /* renamed from: b */
    public final boolean mo14120b() {
        return mo14119a(false);
    }

    /* renamed from: a */
    public static synchronized juu m17357a(Context context) {
        juu juu;
        synchronized (juu.class) {
            if (f23270d == null) {
                int i = spn.f44932a;
                Context applicationContext = context.getApplicationContext();
                f23270d = new juu(applicationContext.getSharedPreferences("com.google.android.gms.auth.devicesignals.DeviceSignalsStore", 0), (KeyguardManager) applicationContext.getSystemService("keyguard"));
            }
            juu = f23270d;
        }
        return juu;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        return;
     */
    /* renamed from: a */
    public final void mo14118a() {
        long j;
        synchronized (this.f23272b) {
            if (this.f23273e.isKeyguardSecure()) {
                synchronized (this.f23272b) {
                    j = this.f23271a.getLong("lastSecureUnlockTime", -1);
                }
                if (j != -1) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    synchronized (this.f23272b) {
                        this.f23271a.edit().putLong("lastSecureUnlockTime", -1).putLong("lockScreenSecureDuration", m17356a(m17358c(), elapsedRealtime)).putLong("lastLockScreenCheckTime", elapsedRealtime).apply();
                    }
                }
            } else {
                f23269c.mo25412b("Device does not have a secure lock screen.", new Object[0]);
                this.f23271a.edit().clear().apply();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo14119a(boolean z) {
        synchronized (this.f23272b) {
            if (!this.f23273e.isKeyguardSecure()) {
                f23269c.mo25412b("Device does not have a secure lock screen.", new Object[0]);
                this.f23271a.edit().clear().apply();
                return false;
            }
            f23269c.mo25412b("Device has a secure lock screen.", new Object[0]);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime < m17359d()) {
                f23269c.mo25416d("Missed a boot event?", new Object[0]);
                mo14118a();
            }
            long c = m17358c();
            long d = m17359d();
            SharedPreferences.Editor edit = this.f23271a.edit();
            edit.putLong("lastLockScreenCheckTime", elapsedRealtime);
            if (z) {
                edit.putLong("lastSecureUnlockTime", elapsedRealtime);
            }
            if (c != -1) {
                edit.putLong("lockScreenSecureDuration", m17356a(c, elapsedRealtime - d));
            } else {
                edit.putLong("lockScreenSecureDuration", 0);
            }
            edit.apply();
            return true;
        }
    }
}
