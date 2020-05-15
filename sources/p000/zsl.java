package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.DataUpdateNotification;
import com.google.android.gms.fitness.store.listener.DataUpdateListener;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: zsl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zsl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zsm f55798a;

    /* renamed from: b */
    private final DataUpdateListener f55799b;

    /* renamed from: c */
    private final ConcurrentLinkedQueue f55800c;

    /* renamed from: d */
    private final String f55801d;

    /* renamed from: e */
    private DataUpdateNotification f55802e;

    /* renamed from: f */
    private int f55803f = 0;

    public zsl(zsm zsm, DataUpdateListener dataUpdateListener, ConcurrentLinkedQueue concurrentLinkedQueue, String str) {
        this.f55798a = zsm;
        this.f55799b = dataUpdateListener;
        this.f55800c = concurrentLinkedQueue;
        this.f55801d = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00aa  */
    public final void run() {
        long j;
        long j2;
        long j3;
        if (!this.f55800c.isEmpty()) {
            DataUpdateNotification dataUpdateNotification = this.f55802e;
            if (dataUpdateNotification != null) {
                j2 = dataUpdateNotification.f32068a;
            } else {
                j2 = Long.MAX_VALUE;
            }
            if (dataUpdateNotification != null) {
                j3 = dataUpdateNotification.f32069b;
            } else {
                j3 = Long.MIN_VALUE;
            }
            DataUpdateNotification dataUpdateNotification2 = dataUpdateNotification;
            DataUpdateNotification dataUpdateNotification3 = (DataUpdateNotification) this.f55800c.poll();
            long j4 = j3;
            long j5 = j2;
            while (dataUpdateNotification3 != null) {
                j5 = Math.min(j5, dataUpdateNotification3.f32068a);
                j4 = Math.max(j4, dataUpdateNotification3.f32069b);
                dataUpdateNotification2 = dataUpdateNotification3;
                dataUpdateNotification3 = (DataUpdateNotification) this.f55800c.poll();
            }
            if (dataUpdateNotification2 != null) {
                this.f55802e = new DataUpdateNotification(j5, j4, dataUpdateNotification2.f32070c, dataUpdateNotification2.f32071d, dataUpdateNotification2.f32072e);
            }
        }
        if (this.f55802e != null) {
            zsm zsm = this.f55798a;
            yuc yuc = zsm.f55808e;
            long b = zsm.f55809f.mo20506b();
            long j6 = yuc.f54634c.get();
            if (yuc.f54635d.get() != 0) {
                long j7 = b - j6;
                if (j7 < yuc.f54633b) {
                    j = yuc.f54635d.incrementAndGet() > yuc.f54632a ? yuc.f54633b - j7 : 0;
                    if (j == 0) {
                        int i = this.f55803f;
                        zsm zsm2 = this.f55798a;
                        if (i < zsm2.f55810g) {
                            this.f55803f = i + 1;
                            zsm2.f55806c.postDelayed(this, j);
                            return;
                        }
                        return;
                    }
                    try {
                        DataUpdateListener dataUpdateListener = this.f55799b;
                        Context context = this.f55798a.f55807d;
                        DataUpdateNotification dataUpdateNotification4 = this.f55802e;
                        Intent intent = new Intent();
                        intent.setAction("com.google.android.gms.fitness.DATA_UPDATE_NOTIFICATION");
                        DataSource dataSource = dataUpdateNotification4.f32071d;
                        intent.setType(DataType.m23682a(dataSource != null ? dataSource.f32005a : dataUpdateNotification4.f32072e));
                        sef.m35071a(dataUpdateNotification4, intent, "vnd.google.fitness.data_udpate_notification");
                        dataUpdateListener.f32453e.send(context, 0, intent);
                    } catch (PendingIntent.CanceledException e) {
                        ((bnsl) zsm.f55804a.mo68388c()).mo68420a("Found dead intent listener %s, removing.", this.f55799b.f32453e);
                        this.f55798a.mo31439b(this.f55801d, null, this.f55799b.f32453e);
                    } catch (Throwable th) {
                        this.f55798a.f55813j.decrementAndGet();
                        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f55798a.f55815l.get(this.f55799b);
                        if (atomicBoolean != null) {
                            atomicBoolean.set(false);
                        }
                        throw th;
                    }
                    this.f55798a.f55813j.decrementAndGet();
                    AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f55798a.f55815l.get(this.f55799b);
                    if (atomicBoolean2 != null) {
                        atomicBoolean2.set(false);
                        return;
                    }
                    return;
                }
            }
            yuc.f54634c.set(b);
            yuc.f54635d.set(1);
            j = 0;
            if (j == 0) {
            }
        }
    }
}
