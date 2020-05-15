package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.ads.identifier.internal.C0275b;
import com.google.android.gms.ads.identifier.internal.C0277d;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.ads.identifier.d */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0272d {

    /* renamed from: a */
    public rex f7987a;

    /* renamed from: b */
    public C0277d f7988b;

    /* renamed from: c */
    public boolean f7989c;

    /* renamed from: d */
    public final Object f7990d;

    /* renamed from: e */
    public C0270b f7991e;

    /* renamed from: f */
    final long f7992f;

    /* renamed from: g */
    private final Context f7993g;

    public C0272d(Context context) {
        this(context, 30000, false);
    }

    /* renamed from: a */
    public static C0271c m5150a(Context context) {
        C0272d dVar = new C0272d(context, -1, true);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            dVar.mo6488a(false);
            C0271c c = dVar.mo6490c();
            m5151a(c, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            dVar.mo6491d();
            return c;
        } catch (Throwable th) {
            dVar.mo6491d();
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo6489b() {
        synchronized (this.f7990d) {
            C0270b bVar = this.f7991e;
            if (bVar != null) {
                bVar.f7981a.countDown();
                try {
                    this.f7991e.join();
                } catch (InterruptedException e) {
                }
            }
            long j = this.f7992f;
            if (j > 0) {
                this.f7991e = new C0270b(this, j);
            }
        }
    }

    /* renamed from: c */
    public final C0271c mo6490c() {
        C0271c cVar;
        sdo.m34973b("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f7989c) {
                synchronized (this.f7990d) {
                    C0270b bVar = this.f7991e;
                    if (bVar == null || !bVar.f7982b) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    mo6488a(false);
                    if (!this.f7989c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                }
            }
            sdo.m34959a(this.f7987a);
            sdo.m34959a(this.f7988b);
            cVar = new C0271c(this.f7988b.mo6493a(), this.f7988b.mo6498d());
        }
        mo6489b();
        return cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return;
     */
    /* renamed from: d */
    public final void mo6491d() {
        sdo.m34973b("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f7993g != null && this.f7987a != null) {
                try {
                    if (this.f7989c) {
                        skh.m35531a().mo25689a(this.f7993g, this.f7987a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f7989c = false;
                this.f7988b = null;
                this.f7987a = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        mo6491d();
        super.finalize();
    }

    public C0272d(Context context, long j, boolean z) {
        Context applicationContext;
        this.f7990d = new Object();
        sdo.m34959a(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f7993g = context;
        this.f7989c = false;
        this.f7992f = j;
    }

    /* renamed from: a */
    static final void m5151a(C0271c cVar, long j, String str, Throwable th) {
        String str2;
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str3 = "1";
            hashMap.put("app_context", str3);
            if (cVar != null) {
                if (!cVar.f7986b) {
                    str3 = "0";
                }
                hashMap.put("limit_ad_tracking", str3);
            }
            if (!(cVar == null || (str2 = cVar.f7985a) == null)) {
                hashMap.put("ad_id_size", Integer.toString(str2.length()));
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            if (!str.isEmpty()) {
                hashMap.put("experiment_id", str);
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j));
            new C0269a(hashMap).start();
        }
    }

    /* renamed from: a */
    public final void mo6487a() {
        mo6488a(true);
    }

    /* renamed from: a */
    public final void mo6488a(boolean z) {
        C0277d dVar;
        sdo.m34973b("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f7989c) {
                mo6491d();
            }
            Context context = this.f7993g;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int b = rfj.f42872d.mo24590b(context);
                if (b != 0) {
                    if (b != 2) {
                        throw new IOException("Google Play services not available");
                    }
                }
                rex rex = new rex();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (skh.m35531a().mo25690a(context, intent, rex, 1)) {
                    this.f7987a = rex;
                    IBinder a = rex.mo24568a(10000, TimeUnit.MILLISECONDS);
                    IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    if (!(queryLocalInterface instanceof C0277d)) {
                        dVar = new C0275b(a);
                    } else {
                        dVar = (C0277d) queryLocalInterface;
                    }
                    this.f7988b = dVar;
                    this.f7989c = true;
                    if (z) {
                        mo6489b();
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException e) {
                throw new rfv(9);
            } catch (InterruptedException e2) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw new IOException(th);
            }
        }
    }
}
