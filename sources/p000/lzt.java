package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: lzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lzt extends aeaa {

    /* renamed from: a */
    public static final Intent f33291a = new Intent().setPackage("com.android.vending").setAction("com.android.vending.setup.IPlaySetupServiceV2.BIND");

    /* renamed from: b */
    public final lvn f33292b = new lvn("PlaySetupServiceV2Proxy");

    /* renamed from: c */
    public final Context f33293c;

    /* renamed from: d */
    public final bqgk f33294d;

    /* renamed from: e */
    public final CopyOnWriteArraySet f33295e = new CopyOnWriteArraySet();

    /* renamed from: f */
    public final CopyOnWriteArraySet f33296f = new CopyOnWriteArraySet();

    /* renamed from: g */
    private final Object f33297g = new Object();

    /* renamed from: h */
    private bqgy f33298h = bqgy.m112818c();

    public lzt(Context context, ScheduledExecutorService scheduledExecutorService) {
        super("backup");
        bmxy.m108581a(context);
        this.f33293c = context;
        bmxy.m108581a(scheduledExecutorService);
        this.f33294d = bqgs.m112812a(scheduledExecutorService);
    }

    /* renamed from: a */
    public final bqgg mo19787a() {
        synchronized (this.f33297g) {
            bqgy bqgy = this.f33298h;
            if (bqgy != null) {
                if (bqgy.isDone()) {
                    bqgy bqgy2 = this.f33298h;
                    if (bqgy2.isDone() && !bqgy2.isCancelled()) {
                        try {
                            bqgy2.get();
                        } catch (InterruptedException | ExecutionException e) {
                        }
                    }
                    bqgy bqgy3 = this.f33298h;
                    return bqgy3;
                }
            }
            this.f33292b.mo25412b("Binding to the service", new Object[0]);
            this.f33298h = bqgy.m112818c();
            mo19789b();
            bqgy bqgy4 = this.f33298h;
            return bqgy4;
        }
    }

    /* renamed from: b */
    public final void mo19789b() {
        synchronized (this.f33297g) {
            if (!skh.m35531a().mo25690a(this.f33293c, f33291a, this, 1)) {
                this.f33292b.mo25418e("Couldn't bind to the service", new Object[0]);
                try {
                    skh.m35531a().mo25689a(this.f33293c, this);
                } catch (IllegalArgumentException | IllegalStateException e) {
                    this.f33292b.mo25410a(e);
                }
                this.f33298h.mo69136a((Throwable) new IllegalStateException("Service is not ready"));
            }
        }
    }

    public final void onBindingDied(ComponentName componentName) {
        this.f33292b.mo25412b("Service binding died", new Object[0]);
        try {
            skh.m35531a().mo25689a(this.f33293c, this);
        } catch (IllegalArgumentException | IllegalStateException e) {
            this.f33292b.mo25410a(e);
        }
        bqga.m112781a(this.f33294d.mo25814a(new lzm(this), cckw.f179263a.mo6606a().mo76224N(), TimeUnit.MILLISECONDS), new lzp(this), this.f33294d);
    }

    /* renamed from: a */
    public final void mo6500a(ComponentName componentName) {
        this.f33292b.mo25412b("Service disconnected", new Object[0]);
        synchronized (this.f33297g) {
            this.f33298h = bqgy.m112818c();
        }
        ArrayList arrayList = new ArrayList(this.f33295e);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bqgy) arrayList.get(i)).mo69136a((Throwable) new lzs());
        }
        Iterator it = this.f33296f.iterator();
        while (it.hasNext()) {
            ((lzr) it.next()).mo19785e();
        }
    }

    /* renamed from: a */
    public final void mo6501a(ComponentName componentName, IBinder iBinder) {
        bnl bnl;
        this.f33292b.mo25412b("Service connected", new Object[0]);
        synchronized (this.f33297g) {
            bqgy bqgy = this.f33298h;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.setup.IPlaySetupServiceV2");
                bnl = !(queryLocalInterface instanceof bnl) ? new bnl(iBinder) : (bnl) queryLocalInterface;
            } else {
                bnl = null;
            }
            bqgy.mo69138b(bnl);
        }
        Iterator it = this.f33296f.iterator();
        while (it.hasNext()) {
            ((lzr) it.next()).mo19784d();
        }
    }

    /* renamed from: a */
    public final void mo19788a(bqgy bqgy) {
        this.f33295e.add(bqgy);
        bqga.m112781a(bqgy, new lzq(this, bqgy), this.f33294d);
    }
}
