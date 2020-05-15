package p000;

import android.os.Handler;
import com.google.android.gms.smartdevice.d2d.D2DDevice;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: aqxw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqxw implements ardt {

    /* renamed from: a */
    public final Handler f87051a;

    /* renamed from: b */
    public D2DDevice f87052b;

    /* renamed from: c */
    public final arym f87053c;

    /* renamed from: d */
    private final ScheduledExecutorService f87054d;

    /* renamed from: e */
    private final long f87055e;

    /* renamed from: f */
    private final ardt f87056f;

    /* renamed from: g */
    private Future f87057g;

    /* renamed from: h */
    private boolean f87058h = true;

    public aqxw(Handler handler, long j, ardt ardt, arym arym) {
        snf a = snp.m35703a(1, 10);
        this.f87051a = handler;
        this.f87054d = a;
        this.f87055e = j;
        this.f87056f = ardt;
        this.f87053c = arym;
    }

    /* renamed from: a */
    public final void mo48217a() {
    }

    /* renamed from: b */
    public final void mo48220b(D2DDevice d2DDevice) {
    }

    /* renamed from: a */
    public final void mo48218a(int i) {
        this.f87052b = null;
        Future future = this.f87057g;
        if (future != null) {
            future.cancel(true);
            this.f87057g = null;
        }
    }

    /* renamed from: a */
    public final void mo48219a(D2DDevice d2DDevice) {
        if (!d2DDevice.equals(this.f87052b)) {
            D2DDevice d2DDevice2 = this.f87052b;
            if (d2DDevice2 != null || !this.f87058h) {
                if (d2DDevice2 != null) {
                    this.f87056f.mo48219a(d2DDevice2);
                    this.f87052b = null;
                }
                Future future = this.f87057g;
                if (future != null) {
                    future.cancel(true);
                    this.f87057g = null;
                }
                this.f87056f.mo48219a(d2DDevice);
                this.f87058h = false;
                return;
            }
            this.f87052b = d2DDevice;
            this.f87057g = ((sny) this.f87054d).schedule(new aqxv(this), this.f87055e, TimeUnit.MILLISECONDS);
        }
    }
}
