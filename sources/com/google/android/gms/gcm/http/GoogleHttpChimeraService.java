package com.google.android.gms.gcm.http;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GoogleHttpChimeraService extends Service {

    /* renamed from: a */
    private abpa f32833a;

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.println("\nGoogleHttpService stats:");
        aaol a = aaol.m21762a();
        printWriter.println("BackoffStatuses:");
        synchronized (a.f28700b) {
            for (Map.Entry entry : a.f28700b.entrySet()) {
                printWriter.print((String) entry.getKey());
                printWriter.print("[");
                printWriter.print("failureCount: ");
                printWriter.print(((aaok) entry.getValue()).f28693a);
                printWriter.print(", currentBackoff: ");
                printWriter.print(((aaok) entry.getValue()).f28694b);
                printWriter.println("]");
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        return this.f32833a;
    }

    public final void onCreate() {
        super.onCreate();
        this.f32833a = new abpa(this);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
