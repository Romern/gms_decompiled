package com.google.android.gms.audiomodem.service;

import android.content.Intent;
import android.os.IBinder;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AudioModemChimeraService extends ggf implements ahha {

    /* renamed from: e */
    private gfo f9896e;

    /* renamed from: f */
    private ahgz f9897f;

    /* renamed from: a */
    private final boolean m6250a(String str) {
        return getPackageManager().checkPermission(str, "com.google.android.gms") == 0;
    }

    /* renamed from: a */
    public final ahgz mo7339a() {
        return this.f9897f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final gge mo7340b() {
        return new gfx(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo7341c() {
        startService(spn.m35889g("com.google.android.gms.audiomodem.service.AudioModemService.START"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo7342d() {
        return m6250a("android.permission.READ_PHONE_STATE") && m6250a("android.permission.RECORD_AUDIO");
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        gfx e = mo7343e();
        if (e != null) {
            e.dump(fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: e */
    public final gfx mo7343e() {
        return (gfx) this.f18126a;
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (!"com.google.android.gms.audiomodem.service.AudioModemService.START".equals(intent.getAction())) {
            return null;
        }
        if (this.f18126a == null) {
            if (mo7342d()) {
                this.f18126a = mo7340b();
            }
        }
        this.f18129d.post(new gga(this));
        return this.f9896e;
    }

    public final void onCreate() {
        super.onCreate();
        this.f9896e = new gfo(this, this);
        ahgz ahgz = new ahgz(this);
        this.f9897f = ahgz;
        ahgz.mo36476a(geu.class, new geu(this));
    }
}
