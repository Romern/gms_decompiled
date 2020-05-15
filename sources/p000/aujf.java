package p000;

import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tron.CollectionChimeraService;
import com.google.android.gms.udc.UdcCacheRequest;

/* renamed from: aujf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aujf extends snr {

    /* renamed from: a */
    final /* synthetic */ CollectionChimeraService f91936a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aujf(CollectionChimeraService collectionChimeraService, sns sns) {
        super(sns);
        this.f91936a = collectionChimeraService;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00aa, code lost:
        if (r0 == false) goto L_0x00ac;
     */
    public final void handleMessage(Message message) {
        aujh aujh;
        long j;
        if (!(message.obj instanceof aujg)) {
            String valueOf = String.valueOf(message.obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("unexpected message argument: ");
            sb.append(valueOf);
            Log.e("CollectionChimeraSvc", sb.toString());
        }
        this.f91936a.mo59544a();
        CollectionChimeraService collectionChimeraService = this.f91936a;
        UdcCacheRequest udcCacheRequest = CollectionChimeraService.f109089b;
        collectionChimeraService.f109096f = (aujg) message.obj;
        try {
            CollectionChimeraService collectionChimeraService2 = this.f91936a;
            int i = collectionChimeraService2.f109096f.f91943g;
            if (i == 1) {
                cgzf.m147724c();
                if (!Process.myUserHandle().isOwner()) {
                    collectionChimeraService2.f109096f.mo50581a();
                    collectionChimeraService2.mo50586a(Long.MAX_VALUE);
                    collectionChimeraService2.stopSelf(collectionChimeraService2.f109096f.f91938b);
                } else {
                    aujd aujd = collectionChimeraService2.f109095e;
                    rjx rjx = aujd.f91935c;
                    if (rjx == null) {
                        boolean a = aujd.mo50578a();
                        boolean b = collectionChimeraService2.f109095e.mo50579b();
                        int c = aujd.m77149c();
                        if (!cgyt.f188089a.mo6606a().mo84784b() || a) {
                            if (!b) {
                            }
                            if (c == 2) {
                                collectionChimeraService2.f109096f.f91941e.mo50582a(collectionChimeraService2);
                            }
                        }
                        if (c != 1) {
                            if (a) {
                                collectionChimeraService2.f109096f.mo50581a();
                                collectionChimeraService2.mo50586a(Long.MAX_VALUE);
                                collectionChimeraService2.stopSelf(collectionChimeraService2.f109096f.f91938b);
                            }
                        }
                        collectionChimeraService2.f109096f.mo50581a();
                        collectionChimeraService2.mo50586a(86400000);
                        collectionChimeraService2.stopSelf(collectionChimeraService2.f109096f.f91938b);
                    } else if (!CollectionChimeraService.m93377a(rjx)) {
                        collectionChimeraService2.f109096f.mo50581a();
                        collectionChimeraService2.mo50586a(21600000);
                        collectionChimeraService2.stopSelf(collectionChimeraService2.f109096f.f91938b);
                    } else {
                        collectionChimeraService2.f109096f.f91941e.mo50582a(collectionChimeraService2);
                    }
                }
            } else if (i != 2) {
                StringBuilder sb2 = new StringBuilder(36);
                sb2.append("unexpected message type: ");
                sb2.append(i);
                Log.e("CollectionChimeraSvc", sb2.toString());
                aujg aujg = this.f91936a.f109096f;
                if (!aujg.f91942f || (aujh = aujg.f91941e) == null || !aujh.mo50583a()) {
                    CollectionChimeraService collectionChimeraService3 = this.f91936a;
                    collectionChimeraService3.stopSelf(collectionChimeraService3.f109096f.f91938b);
                }
                this.f91936a.f109096f.f91937a.mo49120c();
            }
            CollectionChimeraService collectionChimeraService4 = this.f91936a;
            aujg aujg2 = collectionChimeraService4.f109096f;
            if (aujg2.f91942f) {
                aujg2.f91941e.mo50584b(collectionChimeraService4);
                collectionChimeraService4.mo50589a("tron_collection_cause", collectionChimeraService4.f109096f.f91944h);
                collectionChimeraService4.mo59547a("tron_collections");
                synchronized (collectionChimeraService4.f109092a) {
                    j = collectionChimeraService4.f109094d.getLong("last_collection_time", 0);
                }
                if (j > 0) {
                    long j2 = collectionChimeraService4.f109096f.f91939c;
                    if (j2 > j) {
                        collectionChimeraService4.mo50590a("tron_collection_period_minutes", (j2 - j) / 60000);
                    }
                }
                synchronized (collectionChimeraService4.f109092a) {
                    collectionChimeraService4.f109094d.edit().putLong("last_collection_time", collectionChimeraService4.f109096f.f91939c).commit();
                }
                if (collectionChimeraService4.f109096f.f91940d == null) {
                    collectionChimeraService4.f109093c.mo24388e();
                } else {
                    collectionChimeraService4.f109093c.mo24388e();
                }
            }
            aujg aujg3 = this.f91936a.f109096f;
            CollectionChimeraService collectionChimeraService32 = this.f91936a;
            collectionChimeraService32.stopSelf(collectionChimeraService32.f109096f.f91938b);
            try {
                this.f91936a.f109096f.f91937a.mo49120c();
            } catch (RuntimeException e) {
            }
        } catch (Throwable th) {
            try {
                this.f91936a.f109096f.f91937a.mo49120c();
            } catch (RuntimeException e2) {
            }
            throw th;
        }
    }
}
