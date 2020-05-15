package com.google.android.location.reporting.service;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.ContentObserver;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DispatchingChimeraService extends Service implements bgxu {

    /* renamed from: a */
    public static boolean f150875a = false;

    /* renamed from: b */
    public bgxx f150876b;

    /* renamed from: c */
    private bqgj f150877c;

    /* renamed from: a */
    public final void mo63332a(int i) {
        stopSelf(i);
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (this.f150876b != null) {
            printWriter.println("DispatchingService ULR dump....");
            bgxx bgxx = this.f150876b;
            printWriter.println(bgxx.f117955e);
            printWriter.println("No policy computer running\n");
            bgzo.m100463a(printWriter, bgxx.f117952b, bgxx.f117953c, bgxx.f117954d);
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        bgzo.m100459a(this);
        f150875a = true;
        this.f150877c = snp.m35704b(10);
        if (chcs.m148242n()) {
            this.f150877c.execute(new bgxa(this));
        } else {
            this.f150876b = bgxx.m100273a(this, this);
        }
    }

    public final void onDestroy() {
        f150875a = false;
        this.f150877c.shutdownNow();
        this.f150877c = null;
        bgxx bgxx = this.f150876b;
        if (bgxx != null) {
            String valueOf = String.valueOf(bgxx.f117967q);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("Unregister broadcast receiver:");
            sb.append(valueOf);
            sb.toString();
            BroadcastReceiver broadcastReceiver = bgxx.f117967q;
            if (broadcastReceiver != null) {
                bgxx.f117952b.unregisterReceiver(broadcastReceiver);
            } else {
                bgur.m100025c("GCoreUlr", "mConnectivityBroadcastReceiver is null in onDestroy");
            }
            ContentResolver contentResolver = bgxx.f117952b.getContentResolver();
            ContentObserver contentObserver = bgxx.f117968r;
            if (contentObserver != null) {
                contentResolver.unregisterContentObserver(contentObserver);
            }
            ContentObserver contentObserver2 = bgxx.f117969s;
            if (contentObserver2 != null) {
                contentResolver.unregisterContentObserver(contentObserver2);
            }
            ContentObserver contentObserver3 = bgxx.f117970t;
            if (contentObserver3 != null) {
                contentResolver.unregisterContentObserver(contentObserver3);
            }
            ContentObserver contentObserver4 = bgxx.f117971u;
            if (contentObserver4 != null) {
                contentResolver.unregisterContentObserver(contentObserver4);
            }
            bgxx.mo63335b();
            bgwp bgwp = bgxx.f117958h;
            if (bgwp != null) {
                bgwp.mo63291a();
            }
            bgxg bgxg = bgxx.f117959i;
            if (bgxg != null) {
                bgxg.mo63316b();
            }
            aesh aesh = bgxx.f117956f;
            if (aesh != null) {
                aesh.mo34507b();
            }
            bgxt bgxt = bgxx.f117961k;
            if (bgxt != null) {
                bgxt.mo25780c();
            }
            synchronized (bgxx) {
                bgxw bgxw = bgxx.f117962l;
                if (bgxw != null) {
                    bgxw.mo25780c();
                }
            }
            bgug bgug = bgxx.f117965o;
            if (bgug != null) {
                bgug.close();
            }
            bgue bgue = bgxx.f117964n;
            if (bgue != null) {
                bgue.close();
            }
        }
        super.onDestroy();
    }

    public final void onStart(Intent intent, int i) {
        bgur.m100024c("GCoreUlr", 40, "We don't support Froyo, this shouldn't be called");
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            if (chcs.m148242n()) {
                this.f150877c.execute(new bgxb(this, i2, intent));
            } else {
                bgxx bgxx = this.f150876b;
                if (bgxx != null) {
                    bgxx.mo63334a(intent, i2);
                } else {
                    stopSelf(i2);
                }
            }
            return 2;
        }
        return 2;
    }
}
