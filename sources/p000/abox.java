package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: abox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abox {

    /* renamed from: c */
    private static final ComponentName f57816c = new ComponentName("com.google.android.gms", "com.google.android.gms.gcm.http.GoogleHttpService");

    /* renamed from: a */
    public volatile abpb f57817a;

    /* renamed from: b */
    public final CountDownLatch f57818b = new CountDownLatch(1);

    /* renamed from: d */
    private final sbq f57819d = sbq.m34856a(this.f57822g);

    /* renamed from: e */
    private final ServiceConnection f57820e = new abow(this);

    /* renamed from: f */
    private int f57821f = 0;

    /* renamed from: g */
    private final Context f57822g;

    /* renamed from: h */
    private boolean f57823h = false;

    public abox(Context context) {
        this.f57822g = context;
    }

    /* renamed from: a */
    private final synchronized boolean m48021a() {
        int i = this.f57821f;
        this.f57821f = i + 1;
        if (i == 0) {
            this.f57823h = this.f57819d.mo25355a(f57816c, this.f57820e, "GoogleHttpServiceClient");
        }
        return this.f57823h;
    }

    /* renamed from: b */
    private final synchronized void m48022b() {
        int i = this.f57821f - 1;
        this.f57821f = i;
        if (i == 0) {
            this.f57819d.mo25351a(f57816c, this.f57820e);
        }
    }

    /* renamed from: a */
    public final Bundle mo32269a(String str) {
        Bundle bundle = null;
        if (m48021a()) {
            try {
                if (this.f57817a == null && Looper.getMainLooper().getThread() != Thread.currentThread() && !this.f57818b.await(500, TimeUnit.MILLISECONDS)) {
                    Log.w("GoogleHttpServiceClient", "Timeout on service connection", new Throwable());
                    this.f57818b.countDown();
                }
                if (this.f57817a != null) {
                    bundle = this.f57817a.mo32274a(str);
                }
            } catch (RemoteException e) {
                Log.w("GoogleHttpServiceClient", "Exception in Google Http Service: ", e);
            } catch (InterruptedException e2) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                sb.append("Interrupted waiting for binder: ");
                sb.append(valueOf);
                Log.w("GoogleHttpServiceClient", sb.toString());
            } catch (Throwable th) {
                m48022b();
                throw th;
            }
            m48022b();
            return bundle;
        }
        m48022b();
        return null;
    }

    /* renamed from: a */
    public final void mo32270a(String str, int i) {
        if (m48021a()) {
            try {
                if (this.f57817a != null) {
                    if (i > 0) {
                        this.f57817a.mo32275a(str, i);
                    }
                }
            } catch (RemoteException e) {
                Log.w("GoogleHttpServiceClient", "Exception in Google Http Service: ", e);
            } catch (Throwable th) {
                m48022b();
                throw th;
            }
            m48022b();
            return;
        }
        m48022b();
    }
}
