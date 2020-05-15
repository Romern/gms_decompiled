package com.google.android.gms.appinvite;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.chimera.IntentOperation;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class AppInviteIntentOperation extends IntentOperation {

    /* renamed from: a */
    public static final Queue f9746a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    public static final fuq f9747b = new fuq();

    /* renamed from: c */
    private static long f9748c = 0;

    /* renamed from: a */
    public static synchronized long m6188a() {
        long j;
        synchronized (AppInviteIntentOperation.class) {
            j = f9748c + 1;
            f9748c = j;
        }
        return j;
    }

    public final void onHandleIntent(Intent intent) {
        for (fus fus = (fus) f9746a.poll(); fus != null; fus = (fus) f9746a.poll()) {
            try {
                fus.mo11356a(getApplicationContext());
            } catch (RemoteException | sju e) {
                bqye.m113758a(e);
            }
        }
    }

    /* renamed from: a */
    public static void m6189a(long j, Intent intent) {
        fuq fuq = f9747b;
        Long valueOf = Long.valueOf(j);
        if (!fuq.f17281a.containsKey(valueOf)) {
            while (fuq.f17282b.size() >= 2000) {
                fuq.f17281a.remove(fuq.f17282b.get(0));
                fuq.f17282b.remove(0);
            }
        } else {
            fuq.f17282b.remove(valueOf);
        }
        fuq.f17282b.add(valueOf);
        fuq.f17281a.put(valueOf, intent);
    }
}
