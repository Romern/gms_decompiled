package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: qdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qdq {

    /* renamed from: a */
    public static final Logger f40999a = new Logger("NetworkRequester", new String[0]);

    /* renamed from: b */
    protected final Context f41000b;

    /* renamed from: c */
    public final Object f41001c = new Object();

    /* renamed from: d */
    public bmxv f41002d = bmvz.f131120a;

    /* renamed from: e */
    private final ConnectivityManager f41003e;

    /* renamed from: f */
    private bmxv f41004f = bmvz.f131120a;

    public qdq(Context context) {
        this.f41000b = context;
        this.f41003e = (ConnectivityManager) context.getSystemService("connectivity");
    }

    /* renamed from: a */
    public final bmxv mo23960a() {
        bmxv bmxv;
        synchronized (this.f41001c) {
            bmxv = this.f41002d;
        }
        return bmxv;
    }

    /* renamed from: b */
    public final void mo23962b() {
        synchronized (this.f41001c) {
            if (this.f41004f.mo66813a()) {
                this.f41003e.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.f41004f.mo66814b());
                this.f41004f = bmvz.f131120a;
            }
            if (this.f41002d.mo66813a()) {
                this.f41002d = bmvz.f131120a;
            }
        }
    }

    /* renamed from: a */
    public final bmxv mo23961a(NetworkRequest networkRequest, long j) {
        qdp qdp;
        synchronized (this.f41001c) {
            if (this.f41004f.mo66813a()) {
                this.f41003e.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.f41004f.mo66814b());
            }
            qdp = new qdp(this);
        }
        try {
            this.f41003e.requestNetwork(networkRequest, qdp);
            synchronized (this.f41001c) {
                this.f41004f = bmxv.m108566b(qdp);
            }
            if (qdp.f40996a.await(j, TimeUnit.MILLISECONDS)) {
                return mo23960a();
            }
            mo23962b();
            f40999a.mo25416d(String.format(Locale.US, "Timeout [%d] when acquiring the network.", Long.valueOf(j)), new Object[0]);
            return bmvz.f131120a;
        } catch (InterruptedException | RuntimeException e) {
            f40999a.mo25415d("Failed to acquireNetwork the network.", e, new Object[0]);
            return bmvz.f131120a;
        }
    }
}
