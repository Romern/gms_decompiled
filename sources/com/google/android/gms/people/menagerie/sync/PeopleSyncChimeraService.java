package com.google.android.gms.people.menagerie.sync;

import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PeopleSyncChimeraService extends Service {

    /* renamed from: a */
    private static final Object f81933a = new Object();

    /* renamed from: b */
    private static amdz f81934b = null;

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        rpr.m34216b();
        int i = Build.VERSION.SDK_INT;
        printWriter.write("See the provider log\n");
    }

    public final IBinder onBind(Intent intent) {
        return f81934b.getSyncAdapterBinder();
    }

    public final void onCreate() {
        synchronized (f81933a) {
            if (f81934b == null) {
                f81934b = new amdz(getApplicationContext());
            }
        }
    }
}
