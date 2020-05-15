package p000;

import android.content.Context;
import android.os.Build;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: buvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buvh implements bvdc {

    /* renamed from: a */
    public final Context f155034a;

    /* renamed from: b */
    public blvr f155035b;

    /* renamed from: c */
    public final Set f155036c;

    /* renamed from: d */
    public final buvp f155037d;

    /* renamed from: e */
    public bvat f155038e;

    /* renamed from: f */
    public final AtomicBoolean f155039f;

    /* renamed from: g */
    public final BlockingQueue f155040g = new LinkedBlockingQueue();

    /* renamed from: h */
    final CountDownLatch f155041h = new CountDownLatch(1);

    public buvh(Context context) {
        this.f155034a = context;
        this.f155037d = (buvp) ahgz.m55754a(context, buvp.class);
        this.f155036c = new HashSet();
        this.f155039f = new AtomicBoolean(false);
    }

    /* renamed from: a */
    public static void m120501a(Context context) {
        int i = Build.VERSION.SDK_INT;
        buxb buxb = (buxb) ahgz.m55755b(context, buxb.class);
        if (buxb == null || !buxb.mo73227b()) {
            throw new bvdl(buxb.class, buvh.class);
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bxxc mo73125c() {
        return buyn.f155316e;
    }

    /* renamed from: a */
    public final bvbr mo73118a(bvat bvat) {
        this.f155038e = bvat;
        return new buvf(this);
    }

    /* renamed from: a */
    public final void mo73132a() {
        blvr blvr = this.f155035b;
        if (blvr != null) {
            blvr.mo66757a();
            this.f155035b = null;
        }
        mo73133a(new IOException("Gatt server closed"));
        this.f155039f.set(true);
    }

    /* renamed from: a */
    public final void mo73122a(bvda bvda) {
        srn srn = bvcm.f155598a;
        mo73132a();
        synchronized (this.f155036c) {
            for (buvo buvo : this.f155036c) {
                this.f155037d.mo73280b(buvo);
            }
        }
        bvda.mo73126a();
    }

    /* renamed from: a */
    public final void mo73133a(IOException iOException) {
        try {
            this.f155040g.put(new buvg(iOException));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            srn srn = bvcm.f155598a;
        }
    }
}
