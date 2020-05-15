package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: avqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class avqd {

    /* renamed from: a */
    public static final sek f93765a = avpq.m79020g("NetworkRequester");

    /* renamed from: b */
    protected final Context f93766b;

    /* renamed from: c */
    public final Object f93767c = new Object();

    /* renamed from: d */
    public avqc f93768d;

    /* renamed from: e */
    public bmxv f93769e = bmvz.f131120a;

    /* renamed from: f */
    private final ConnectivityManager f93770f;

    /* renamed from: g */
    private bmxv f93771g = bmvz.f131120a;

    protected avqd(Context context) {
        this.f93766b = context;
        this.f93770f = (ConnectivityManager) context.getSystemService("connectivity");
    }

    /* renamed from: a */
    public final bmxv mo51494a() {
        bmxv bmxv;
        synchronized (this.f93767c) {
            bmxv = this.f93769e;
        }
        return bmxv;
    }

    /* renamed from: b */
    public final void mo51497b() {
        avqc avqc;
        synchronized (this.f93767c) {
            if (this.f93771g.mo66813a()) {
                this.f93770f.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.f93771g.mo66814b());
                this.f93771g = bmvz.f131120a;
            }
            if (this.f93769e.mo66813a()) {
                this.f93769e = bmvz.f131120a;
                avqc = this.f93768d;
            } else {
                avqc = null;
            }
        }
        if (avqc != null) {
            avoo avoo = (avoo) avqc;
            if (!avoo.f93639f.get()) {
                avoo.mo51458e();
            }
        }
    }

    /* renamed from: c */
    public abstract void mo51499c();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51495a(long j) {
        avqa.m79038c(this.f93766b);
        mo51496a(bngx.m109356a((Object) 12), j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51496a(List list, long j) {
        avqb avqb;
        f93765a.mo25414c("Requesting network with capabilities %s...", list);
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        builder.removeCapability(15);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            builder.addCapability(((Integer) it.next()).intValue());
        }
        synchronized (this.f93767c) {
            if (this.f93771g.mo66813a()) {
                this.f93770f.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.f93771g.mo66814b());
            }
            avqb = new avqb(this);
        }
        try {
            this.f93770f.requestNetwork(builder.build(), avqb);
            synchronized (this.f93767c) {
                this.f93771g = bmxv.m108566b(avqb);
            }
            if (avqb.f93762a.await(j, TimeUnit.MILLISECONDS)) {
                bmxv a = mo51494a();
                if (a.mo66813a()) {
                    avqa avqa = (avqa) a.mo66814b();
                    return;
                }
                throw new IOException("Failed to acquire the network.");
            }
            mo51497b();
            throw new IOException(String.format(Locale.US, "Timeout [%d] when acquiring the network.", Long.valueOf(j)));
        } catch (InterruptedException | RuntimeException e) {
            throw new IOException("Failed to acquireNetwork the network.", e);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bngx.a(java.lang.Object, java.lang.Object):bngx
     arg types: [int, int]
     candidates:
      bngx.a(java.util.Comparator, java.lang.Iterable):bngx
      bngx.a(java.lang.Object[], int):int
      bngx.a(int, int):bngx
      bngm.a(java.lang.Object[], int):int
      bngx.a(java.lang.Object, java.lang.Object):bngx */
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo51498b(long j) {
        avqa.m79038c(this.f93766b);
        mo51496a(bngx.m109357a((Object) 11, (Object) 12), j);
    }
}
