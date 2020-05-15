package com.google.android.gms.chimera.container;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.BoundService;
import com.google.android.chimera.IntentOperation;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FindBinderBufferSizeOperation extends IntentOperation {
    /* renamed from: a */
    static final int m22403a(IBinder iBinder) {
        int d = dfq.m8314a().mo8865d();
        int i = d;
        int i2 = 0;
        while (i2 < 8) {
            int i3 = i * 1024;
            Parcel obtain = Parcel.obtain();
            try {
                dib.m8553a(obtain, i3);
                try {
                    iBinder.transact(1, obtain, Parcel.obtain(), 0);
                    i += i;
                    i2++;
                } catch (RemoteException e) {
                    return i;
                }
            } catch (OutOfMemoryError e2) {
                Log.w("FindBufferSizeOperation", "OOM allocating parcel. NullBinder will use flag-set size.");
                return d;
            }
        }
        Log.w("FindBufferSizeOperation", "Could not trigger a RemoteException. NullBinder will use flag-set size.");
        return d;
    }

    public final void onHandleIntent(Intent intent) {
        FileWriter fileWriter;
        if (dfq.m8314a().mo8866e()) {
            rex rex = new rex();
            Intent startIntent = BoundService.getStartIntent(this, "com.google.android.gms.chimera.container.BIND_FIND_BUFFER_SIZE");
            if (startIntent == null) {
                Log.w("FindBufferSizeOperation", "Failed to get the intent to bind to FindBinderBufferSizeBoundService. NullBinder will use a pre-determined size.");
                return;
            }
            skh.m35531a().mo25690a(this, startIntent, rex, 1);
            try {
                int a = m22403a(rex.mo24568a(5000, TimeUnit.MILLISECONDS));
                skh.m35531a().mo25693b(this, rex);
                try {
                    fileWriter = new FileWriter(new File(getFilesDir(), "binder_buffer_size.txt"));
                    StringBuilder sb = new StringBuilder(11);
                    sb.append(a);
                    fileWriter.write(sb.toString());
                    fileWriter.close();
                    return;
                } catch (IOException e) {
                    Log.w("FindBufferSizeOperation", "Failed to write binder buffer size to file. NullBinder will use flag-set size.");
                    return;
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            } catch (InterruptedException | TimeoutException e2) {
                Log.w("FindBufferSizeOperation", "Binding interrupted or timed out. NullBinder will use a pre-determined size.");
                skh.m35531a().mo25693b(this, rex);
                return;
            } catch (Throwable th2) {
                skh.m35531a().mo25693b(this, rex);
                throw th2;
            }
        } else {
            return;
        }
        throw th;
    }
}
