package com.google.android.location.reporting.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class InternalPreferenceChimeraServiceDoNotUse extends BoundService {

    /* renamed from: a */
    public bgye f150878a;

    /* renamed from: b */
    public bgwx f150879b;

    /* renamed from: c */
    private final bgxd f150880c = new bgxd(this);

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.println("PreferenceService ULR dump....");
        if (DispatchingChimeraService.f150875a) {
            printWriter.println("PreferenceService deferring to DispatchingService for dump");
            return;
        }
        bgzo.m100463a(printWriter, this, this.f150878a, bgyg.m100351a(this));
    }

    public final IBinder onBind(Intent intent) {
        return this.f150880c;
    }

    public final void onCreate() {
        bgzo.m100459a(this);
        this.f150878a = bgye.m100307a(this);
        this.f150879b = bgwx.m100189a(this);
    }
}
