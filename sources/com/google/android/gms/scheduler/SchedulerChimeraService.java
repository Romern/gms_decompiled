package com.google.android.gms.scheduler;

import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.Service;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SchedulerChimeraService extends Service {

    /* renamed from: a */
    final bqgj f107334a = snp.m35704b(10);

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        apht.m70315a();
    }

    public final void onDestroy() {
        super.onDestroy();
        apht.m70315a().f84404d.mo16947b();
        this.f107334a.shutdownNow();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            intent.getAction();
        }
        if (!aajg.m21343c()) {
            Log.e("GCM", "Unexpected SchedulerService started as secondary user !");
            stopSelf(i2);
            return 2;
        }
        this.f107334a.execute(new aphq(intent));
        return 1;
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        aphm aphm = apht.m70315a().f84401a;
        if (aphm != null) {
            String valueOf = String.valueOf(cdnv.m134330b());
            printWriter.println(valueOf.length() == 0 ? new String("NTS task filter is ") : "NTS task filter is ".concat(valueOf));
            aphm.f84390a.mo47232a(printWriter, strArr);
            return;
        }
        printWriter.println("GmsTaskScheduler unavailable.");
    }
}
