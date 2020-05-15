package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.ads.identifier.C0270b;
import com.google.android.gms.ads.identifier.C0272d;
import com.google.android.gms.ads.internal.util.client.C0632g;
import com.google.android.gms.ads.internal.util.client.C0633h;
import java.io.IOException;

/* renamed from: com.google.android.gms.ads.internal.util.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0625c extends C0624b {

    /* renamed from: a */
    private final Context f8948a;

    public C0625c(Context context) {
        this.f8948a = context;
    }

    /* renamed from: a */
    public final void mo6780a() {
        boolean c;
        boolean z = false;
        try {
            C0272d dVar = new C0272d(this.f8948a, -1, false);
            try {
                dVar.mo6488a(false);
                sdo.m34973b("Calling this from your main thread can lead to deadlock");
                synchronized (dVar) {
                    if (!dVar.f7989c) {
                        synchronized (dVar.f7990d) {
                            C0270b bVar = dVar.f7991e;
                            if (bVar == null || !bVar.f7982b) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            dVar.mo6488a(false);
                            if (!dVar.f7989c) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                        } catch (RemoteException e2) {
                            Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                            throw new IOException("Remote exception");
                        }
                    }
                    sdo.m34959a(dVar.f7987a);
                    sdo.m34959a(dVar.f7988b);
                    c = dVar.f7988b.mo6497c();
                }
                dVar.mo6489b();
                z = c;
            } finally {
                dVar.mo6491d();
            }
        } catch (IOException | IllegalStateException | rfv | rfw e3) {
            C0633h.m5669b("Fail to get isAdIdFakeForDebugLogging", e3);
        }
        synchronized (C0632g.f8963a) {
            C0632g.f8964b = true;
            C0632g.f8965c = z;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(z);
        C0633h.m5672d(sb.toString());
    }
}
