package p000;

import android.content.SharedPreferences;

/* renamed from: alrd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alrd implements Runnable {

    /* renamed from: a */
    private final alqx f74152a;

    /* renamed from: b */
    private final SharedPreferences f74153b;

    /* renamed from: c */
    private final alqq f74154c;

    public alrd(SharedPreferences sharedPreferences, alqx alqx, alrc alrc) {
        this.f74152a = alqx;
        this.f74153b = sharedPreferences;
        this.f74154c = alrc;
    }

    public final void run() {
        try {
            alqq alqq = this.f74154c;
            alqx alqx = this.f74152a;
            bzdb bzdb = (bzdb) bzdh.f169466A.mo74144da();
            if (bzdb.f164950c) {
                bzdb.mo74035c();
                bzdb.f164950c = false;
            }
            bzdh bzdh = (bzdh) bzdb.f164949b;
            bzdh.f169469a |= 4096;
            bzdh.f169480l = true;
            if (alqq.m61526a(((bzdh) bzdb.mo74062i()).serializeToBytes(), alqx.f74141a, ((alrc) alqq).f74151f)) {
                this.f74153b.edit().putLong("contacts-logger-full-upload-timestamp", 0).apply();
            }
        } catch (Exception e) {
            almk.m61263a().mo40522a("DeviceLoggerTask.logData_failure");
        }
    }
}
