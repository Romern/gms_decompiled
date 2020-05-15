package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.fitness.request.ListSubscriptionsRequest;
import com.google.android.gms.fitness.request.SubscribeRequest;
import com.google.android.gms.fitness.request.UnsubscribeRequest;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: zog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zog implements ytv {

    /* renamed from: a */
    final /* synthetic */ zoh f55594a;

    public zog(zoh zoh) {
        this.f55594a = zoh;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.c(java.lang.Iterable, bmxz):boolean
     arg types: [bnic, zod]
     candidates:
      bnjd.c(java.lang.Iterable, int):java.lang.Iterable
      bnjd.c(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.c(java.lang.Iterable, bmxz):boolean */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0395 A[Catch:{ all -> 0x03c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0396 A[Catch:{ all -> 0x03c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0699 A[Catch:{ all -> 0x06c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x069a A[Catch:{ all -> 0x06c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x06d0  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x06d5  */
    /* renamed from: a */
    public final boolean mo30773a(int i, Object obj, ytt ytt) {
        Status status;
        int i2;
        int i3;
        Status status2;
        Status status3;
        int i4;
        Status status4;
        int i5;
        int i6;
        int i7;
        DataType dataType;
        String str;
        Status status5;
        int i8;
        int i9;
        Status status6;
        String str2;
        String str3;
        ytp ytp;
        Context context;
        String str4;
        int i10;
        boolean z;
        DataSource dataSource;
        int i11 = i;
        ytt ytt2 = ytt;
        String str5 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
        int i12 = 2;
        int i13 = 1;
        if (i11 == 0) {
            zoh zoh = this.f55594a;
            SubscribeRequest subscribeRequest = (SubscribeRequest) obj;
            zcl zcl = subscribeRequest.f32319c;
            bxvd da = bpgr.f137526x.mo74144da();
            String str6 = ytt2.f54617a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpgr bpgr = (bpgr) da.f164949b;
            str6.getClass();
            bpgr.f137528a |= 1;
            bpgr.f137529b = str6;
            Subscription subscription = subscribeRequest.f32317a;
            bzzv bzzv = bzzv.UNKNOWN_DATA_TYPE;
            if (subscription != null) {
                DataSource dataSource2 = subscription.f32176a;
                if (dataSource2 == null) {
                    dataType = subscription.f32177b;
                } else {
                    dataType = dataSource2.f32005a;
                }
                bxvd da2 = bpgj.f137497e.mo74144da();
                boolean z2 = subscribeRequest.f32318b;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpgj bpgj = (bpgj) da2.f164949b;
                bpgj.f137499a |= 4;
                bpgj.f137502d = z2;
                if (dataType != null) {
                    bzzv a = bzzk.m126356a(dataType.f32064a);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bpgj bpgj2 = (bpgj) da2.f164949b;
                    bpgj2.f137500b = a.f172235aH;
                    bpgj2.f137499a |= 1;
                    bzzv = a;
                }
                DataSource dataSource3 = subscription.f32176a;
                if (!(dataSource3 == null || (str = dataSource3.f32009e) == null)) {
                    bpgj bpgj3 = (bpgj) da2.f164949b;
                    str.getClass();
                    bpgj3.f137499a |= 2;
                    bpgj3.f137501c = str;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpgr bpgr2 = (bpgr) da.f164949b;
                bpgj bpgj4 = (bpgj) da2.mo74062i();
                bpgj4.getClass();
                bpgr2.f137544q = bpgj4;
                bpgr2.f137528a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
            }
            ytq a2 = zoh.f55602k.mo30767a(zoh.f55428a);
            a2.mo30762a(zoh.f55429b);
            a2.mo30755a(404);
            a2.mo30763b(bzzv.f172235aH);
            try {
                Subscription subscription2 = subscribeRequest.f32317a;
                if (subscription2 != null) {
                    cadr a3 = ywg.m44943a(subscription2);
                    String str7 = ytt2.f54617a;
                    if (!zoh.f55599h.mo30721a(str7, yyo.m45042a(a3))) {
                        status2 = zoh.f55601j.mo30959a(str7, a3);
                        if (status2.mo17710c()) {
                            if ((a3.f172719a & 1) != 0) {
                                zqx zqx = zoh.f55598g;
                                caae caae = a3.f172720b;
                                if (caae == null) {
                                    caae = caae.f172323i;
                                }
                                caae a4 = zqx.mo30458a(caae, str7);
                                bxvd bxvd = (bxvd) a3.mo74142c(5);
                                bxvd.mo73625a((GeneratedMessageLite) a3);
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                cadr cadr = (cadr) bxvd.f164949b;
                                cadr cadr2 = cadr.f172717f;
                                a4.getClass();
                                cadr.f172720b = a4;
                                cadr.f172719a |= 1;
                                a3 = (cadr) bxvd.mo74062i();
                            }
                            if (!subscribeRequest.f32318b) {
                                i4 = 1;
                            } else {
                                i4 = 2;
                            }
                            yqe yqe = new yqe(str7, a3, i4);
                            if (!zoh.f55601j.mo30961c(str7) || subscribeRequest.f32318b) {
                                i5 = zoh.mo31288a(yqe);
                            } else {
                                bnic<yqe> a5 = zoh.f55598g.mo31337a(yqe);
                                if (cdyu.m135385c() || !bnjd.m109592c((Iterable) a5, (bmxz) new zod(zoh, ytt2))) {
                                    int a6 = zoh.mo31288a(yqe);
                                    ClientIdentity clientIdentity = new ClientIdentity(ytt2.f54618b, ytt2.f54617a);
                                    if (a5.isEmpty()) {
                                        status4 = new Status(-5000);
                                        i6 = a6;
                                    } else {
                                        int i14 = 0;
                                        for (yqe yqe2 : a5) {
                                            int i15 = a6;
                                            if (yqe2.f54384e == 1) {
                                                bqgg a7 = zoh.f55597f.mo30969a(yqe2, clientIdentity);
                                                try {
                                                    if (!a7.isDone() || ((Boolean) bqga.m112780a((Future) a7)).booleanValue()) {
                                                        i14++;
                                                        a6 = i15;
                                                    }
                                                } catch (ExecutionException e) {
                                                }
                                            }
                                            a6 = i15;
                                        }
                                        i6 = a6;
                                        if (cdyu.m135393k()) {
                                            status4 = i14 != a5.size() ? new Status(8) : Status.f30107a;
                                        } else if (i14 == 0) {
                                            status4 = new Status(-5000);
                                        } else {
                                            status4 = Status.f30107a;
                                        }
                                    }
                                    if (status4.mo17710c()) {
                                        if (status4.f30115i == -5000) {
                                            bnsl bnsl = (bnsl) zoh.f55595d.mo68388c();
                                            bnsl.mo68432a("zoh", "b", 283, str5);
                                            bnsl.mo68420a("No data sources found for %s. Subscription is added; recording will start once sources become available.", yyo.m45045c(a3));
                                        } else {
                                            i5 = i6;
                                        }
                                    }
                                    status2 = status4;
                                } else {
                                    if (!cdyu.f181962a.mo6606a().mo78515s()) {
                                        i7 = 5005;
                                    } else {
                                        i7 = 5025;
                                    }
                                    status2 = new Status(i7);
                                }
                            }
                            zvm.m46571a(zoh.f55428a, zoh.f55429b);
                            if (i5 == 1) {
                                status4 = new Status(-5001);
                                status2 = status4;
                            } else {
                                status2 = Status.f30107a;
                            }
                        }
                    } else {
                        status2 = Status.f30107a;
                    }
                } else {
                    status2 = new Status(0);
                }
                try {
                    int i16 = status2.f30115i;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpgr bpgr3 = (bpgr) da.f164949b;
                    bpgr3.f137528a |= 2;
                    bpgr3.f137530c = i16;
                    if (status2.mo17710c() && zoh.mo31245d()) {
                        zoh.mo31246e();
                        znq.m45815a(zoh.f55428a, zoh.f55429b);
                    }
                    zcl.mo30933a(status2);
                    i3 = status2 != null ? ytp.m44794a(status2) : 15;
                } catch (IOException e2) {
                    e = e2;
                    try {
                        bnsl bnsl2 = (bnsl) zoh.f55595d.mo68387b();
                        bnsl2.mo68437a(e);
                        bnsl2.mo68432a("zoh", "a", (int) BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, str5);
                        bnsl2.mo68405a("Error subscribing.");
                        status3 = new Status(5008);
                    } catch (Throwable th) {
                        th = th;
                        status = status2;
                        if (status == null) {
                        }
                        a2.mo30765d(i2);
                        a2.mo30754a();
                        zoh.f55602k.mo30769a(zoh.f55428a, zoh.f55429b, (bpgr) da.mo74062i());
                        throw th;
                    }
                    try {
                        zcl.mo30933a(status3);
                        if (!da.f164950c) {
                        }
                        bpgr bpgr4 = (bpgr) da.f164949b;
                        bpgr4.f137528a |= 2;
                        bpgr4.f137530c = 5008;
                        i3 = ytp.m44794a(status3);
                        a2.mo30765d(i3);
                        a2.mo30754a();
                        zoh.f55602k.mo30769a(zoh.f55428a, zoh.f55429b, (bpgr) da.mo74062i());
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                        status = status3;
                        if (status == null) {
                            i2 = ytp.m44794a(status);
                        } else {
                            i2 = 15;
                        }
                        a2.mo30765d(i2);
                        a2.mo30754a();
                        zoh.f55602k.mo30769a(zoh.f55428a, zoh.f55429b, (bpgr) da.mo74062i());
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    status = status2;
                    if (status == null) {
                    }
                    a2.mo30765d(i2);
                    a2.mo30754a();
                    zoh.f55602k.mo30769a(zoh.f55428a, zoh.f55429b, (bpgr) da.mo74062i());
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                status2 = null;
                bnsl bnsl22 = (bnsl) zoh.f55595d.mo68387b();
                bnsl22.mo68437a(e);
                bnsl22.mo68432a("zoh", "a", (int) BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, str5);
                bnsl22.mo68405a("Error subscribing.");
                status3 = new Status(5008);
                zcl.mo30933a(status3);
                if (!da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpgr bpgr42 = (bpgr) da.f164949b;
                bpgr42.f137528a |= 2;
                bpgr42.f137530c = 5008;
                i3 = ytp.m44794a(status3);
                a2.mo30765d(i3);
                a2.mo30754a();
                zoh.f55602k.mo30769a(zoh.f55428a, zoh.f55429b, (bpgr) da.mo74062i());
                return true;
            } catch (Throwable th4) {
                th = th4;
                status = null;
                if (status == null) {
                }
                a2.mo30765d(i2);
                a2.mo30754a();
                zoh.f55602k.mo30769a(zoh.f55428a, zoh.f55429b, (bpgr) da.mo74062i());
                throw th;
            }
            a2.mo30765d(i3);
            a2.mo30754a();
            zoh.f55602k.mo30769a(zoh.f55428a, zoh.f55429b, (bpgr) da.mo74062i());
            return true;
        } else if (i11 == 1) {
            zoh zoh2 = this.f55594a;
            UnsubscribeRequest unsubscribeRequest = (UnsubscribeRequest) obj;
            String str8 = ytt2.f54617a;
            zcl zcl2 = unsubscribeRequest.f32324c;
            if (unsubscribeRequest.f32322a == null && unsubscribeRequest.f32323b == null) {
                zcl2.mo30933a(Status.f30107a);
                return true;
            }
            bxvd da3 = bpgr.f137526x.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bpgr bpgr5 = (bpgr) da3.f164949b;
            str8.getClass();
            bpgr5.f137528a |= 1;
            bpgr5.f137529b = str8;
            bzzv bzzv2 = bzzv.UNKNOWN_DATA_TYPE;
            DataSource dataSource4 = unsubscribeRequest.f32323b;
            DataType dataType2 = dataSource4 == null ? unsubscribeRequest.f32322a : dataSource4.f32005a;
            bxvd da4 = bpgk.f137503d.mo74144da();
            if (dataType2 != null) {
                bzzv2 = bzzk.m126356a(dataType2.f32064a);
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bpgk bpgk = (bpgk) da4.f164949b;
                bpgk.f137506b = bzzv2.f172235aH;
                bpgk.f137505a |= 1;
            }
            DataSource dataSource5 = unsubscribeRequest.f32323b;
            if (!(dataSource5 == null || (str2 = dataSource5.f32009e) == null)) {
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = false;
                }
                bpgk bpgk2 = (bpgk) da4.f164949b;
                str2.getClass();
                bpgk2.f137505a |= 2;
                bpgk2.f137507c = str2;
            }
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bpgr bpgr6 = (bpgr) da3.f164949b;
            bpgk bpgk3 = (bpgk) da4.mo74062i();
            bpgk3.getClass();
            bpgr6.f137545r = bpgk3;
            bpgr6.f137528a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
            ytq a8 = zoh2.f55602k.mo30767a(zoh2.f55428a);
            a8.mo30762a(zoh2.f55429b);
            a8.mo30755a(405);
            a8.mo30763b(bzzv2.f172235aH);
            try {
                caah a9 = ywb.m44930a(unsubscribeRequest.f32322a);
                caae a10 = yvx.m44925a(unsubscribeRequest.f32323b);
                if (a10 != null) {
                    a10 = zoh2.f55598g.mo30458a(a10, str8);
                }
                bnrd a11 = zoh2.f55596e.mo31399b(str8).iterator();
                while (a11.hasNext()) {
                    yqe yqe3 = (yqe) a11.next();
                    cadr cadr3 = yqe3.f54381b;
                    if (a10 != null) {
                        caae caae2 = cadr3.f172720b;
                        if (caae2 == null) {
                            caae2 = caae.f172323i;
                        }
                        if (!a10.equals(caae2)) {
                        }
                    }
                    if (a9 != null) {
                        if (!bzzn.m126363a(a9, yyo.m45042a(cadr3))) {
                        }
                    }
                    bnrd a12 = zoh2.f55598g.mo31337a(yqe3).iterator();
                    while (a12.hasNext()) {
                        yqe yqe4 = (yqe) a12.next();
                        bnrd bnrd = a11;
                        if (yqe4.f54384e != 1) {
                            a11 = bnrd;
                        } else if (!zoh2.f55597f.mo30973a(yqe4)) {
                            bnsl bnsl3 = (bnsl) zoh.f55595d.mo68387b();
                            bnsl3.mo68432a("zoh", "b", 465, str5);
                            bnsl3.mo68420a("Failed to unregister recording listener for %s. Will proceed to remove subscription anyway.", yqe3);
                            a11 = bnrd;
                        } else {
                            a11 = bnrd;
                        }
                    }
                    bnrd bnrd2 = a11;
                    if (!zoh2.f55596e.mo31401b(yqe3)) {
                        bnsl bnsl4 = (bnsl) zoh.f55595d.mo68387b();
                        bnsl4.mo68432a("zoh", "b", 474, str5);
                        bnsl4.mo68420a("Failed to remove subscription. Not found?: %s", yqe3);
                        a11 = bnrd2;
                    } else {
                        a11 = bnrd2;
                    }
                }
                status5 = Status.f30107a;
                try {
                    int i17 = status5.f30115i;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bpgr bpgr7 = (bpgr) da3.f164949b;
                    bpgr7.f137528a |= 2;
                    bpgr7.f137530c = i17;
                    zcl2.mo30933a(status5);
                    if (status5.mo17710c() && !zoh2.mo31245d()) {
                        zoh2.mo31247f();
                    }
                    i9 = status5 != null ? ytp.m44794a(status5) : 15;
                } catch (IOException e4) {
                    e = e4;
                    try {
                        bnsl bnsl5 = (bnsl) zoh.f55595d.mo68387b();
                        bnsl5.mo68437a(e);
                        bnsl5.mo68432a("zoh", "a", 427, str5);
                        bnsl5.mo68405a("Error unsubscribing.");
                        status6 = new Status(5008);
                        try {
                            zcl2.mo30933a(status6);
                            if (!da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            bpgr bpgr8 = (bpgr) da3.f164949b;
                            bpgr8.f137528a |= 2;
                            bpgr8.f137530c = 5008;
                            i9 = ytp.m44794a(status6);
                            a8.mo30765d(i9);
                            a8.mo30754a();
                            zoh2.f55602k.mo30769a(zoh2.f55428a, zoh2.f55429b, (bpgr) da3.mo74062i());
                            return true;
                        } catch (Throwable th5) {
                            th = th5;
                            status5 = status6;
                            if (status5 == null) {
                                i8 = ytp.m44794a(status5);
                            } else {
                                i8 = 15;
                            }
                            a8.mo30765d(i8);
                            a8.mo30754a();
                            zoh2.f55602k.mo30769a(zoh2.f55428a, zoh2.f55429b, (bpgr) da3.mo74062i());
                            throw th;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        if (status5 == null) {
                        }
                        a8.mo30765d(i8);
                        a8.mo30754a();
                        zoh2.f55602k.mo30769a(zoh2.f55428a, zoh2.f55429b, (bpgr) da3.mo74062i());
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    if (status5 == null) {
                    }
                    a8.mo30765d(i8);
                    a8.mo30754a();
                    zoh2.f55602k.mo30769a(zoh2.f55428a, zoh2.f55429b, (bpgr) da3.mo74062i());
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
                status5 = null;
                bnsl bnsl52 = (bnsl) zoh.f55595d.mo68387b();
                bnsl52.mo68437a(e);
                bnsl52.mo68432a("zoh", "a", 427, str5);
                bnsl52.mo68405a("Error unsubscribing.");
                status6 = new Status(5008);
                zcl2.mo30933a(status6);
                if (!da3.f164950c) {
                }
                bpgr bpgr82 = (bpgr) da3.f164949b;
                bpgr82.f137528a |= 2;
                bpgr82.f137530c = 5008;
                i9 = ytp.m44794a(status6);
                a8.mo30765d(i9);
                a8.mo30754a();
                zoh2.f55602k.mo30769a(zoh2.f55428a, zoh2.f55429b, (bpgr) da3.mo74062i());
                return true;
            } catch (Throwable th8) {
                th = th8;
                status5 = null;
                if (status5 == null) {
                }
                a8.mo30765d(i8);
                a8.mo30754a();
                zoh2.f55602k.mo30769a(zoh2.f55428a, zoh2.f55429b, (bpgr) da3.mo74062i());
                throw th;
            }
            a8.mo30765d(i9);
            a8.mo30754a();
            zoh2.f55602k.mo30769a(zoh2.f55428a, zoh2.f55429b, (bpgr) da3.mo74062i());
            return true;
        } else if (i11 != 2) {
            return false;
        } else {
            zoh zoh3 = this.f55594a;
            ListSubscriptionsRequest listSubscriptionsRequest = (ListSubscriptionsRequest) obj;
            String str9 = ytt2.f54617a;
            zce zce = listSubscriptionsRequest.f32266b;
            bxvd da5 = bpgr.f137526x.mo74144da();
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bpgr bpgr9 = (bpgr) da5.f164949b;
            str9.getClass();
            bpgr9.f137528a |= 1;
            bpgr9.f137529b = str9;
            bxvd da6 = bpgi.f137493c.mo74144da();
            DataType dataType3 = listSubscriptionsRequest.f32265a;
            if (dataType3 != null) {
                bzzv a13 = bzzk.m126356a(dataType3.f32064a);
                if (da6.f164950c) {
                    da6.mo74035c();
                    da6.f164950c = false;
                }
                bpgi bpgi = (bpgi) da6.f164949b;
                bpgi.f137496b = a13.f172235aH;
                bpgi.f137495a |= 1;
            }
            if (da5.f164950c) {
                da5.mo74035c();
                da5.f164950c = false;
            }
            bpgr bpgr10 = (bpgr) da5.f164949b;
            bpgi bpgi2 = (bpgi) da6.mo74062i();
            bpgi2.getClass();
            bpgr10.f137543p = bpgi2;
            bpgr10.f137528a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
            try {
                ArrayList arrayList = new ArrayList();
                bnrd a14 = zoh3.f55596e.mo31399b(str9).iterator();
                while (a14.hasNext()) {
                    yqe yqe5 = (yqe) a14.next();
                    cadr cadr4 = yqe5.f54381b;
                    if (yqe5.f54384e == i12) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    yxr yxr = new yxr();
                    if ((cadr4.f172719a & i13) != 0) {
                        caae caae3 = cadr4.f172720b;
                        if (caae3 == null) {
                            caae3 = caae.f172323i;
                        }
                        yxr.f54783a = yvx.m44926a(caae3);
                    }
                    if ((cadr4.f172719a & i12) != 0) {
                        caah caah = cadr4.f172721c;
                        if (caah == null) {
                            caah = caah.f172333d;
                        }
                        yxr.f54784b = ywb.m44931a(caah);
                    }
                    ArrayList arrayList2 = arrayList;
                    yxr.f54785c = TimeUnit.MICROSECONDS.toMicros(cadr4.f172722d);
                    int i18 = cadr4.f172723e;
                    if (!(i18 == 1 || i18 == 3)) {
                        i18 = 2;
                    }
                    yxr.f54786d = i18;
                    yxr.f54787e = i10;
                    if (yxr.f54783a == null && yxr.f54784b == null) {
                        z = false;
                    } else {
                        z = true;
                    }
                    sdo.m34971a(z, (Object) "Must call setDataSource() or setDataType()");
                    DataType dataType4 = yxr.f54784b;
                    sdo.m34971a(dataType4 == null || (dataSource = yxr.f54783a) == null || dataType4.equals(dataSource.f32005a), (Object) "Specified data type is incompatible with specified data source");
                    str3 = str5;
                    try {
                        Subscription subscription3 = new Subscription(yxr.f54783a, yxr.f54784b, yxr.f54785c, yxr.f54786d, yxr.f54787e);
                        DataType dataType5 = listSubscriptionsRequest.f32265a;
                        if (dataType5 != null) {
                            if (!dataType5.equals(subscription3.mo18981a())) {
                                arrayList = arrayList2;
                                str5 = str3;
                                i12 = 2;
                                i13 = 1;
                            }
                        }
                        arrayList2.add(subscription3);
                        arrayList = arrayList2;
                        str5 = str3;
                        i12 = 2;
                        i13 = 1;
                    } catch (IOException e6) {
                        e = e6;
                        try {
                            bnsl bnsl6 = (bnsl) zoh.f55595d.mo68387b();
                            bnsl6.mo68437a(e);
                            bnsl6.mo68432a("zoh", "a", (int) ErrorInfo.TYPE_FELICA_EXCEPTION_OTHER, str3);
                            bnsl6.mo68405a("Error listing subscriptions.");
                            zce.mo30929a(new ListSubscriptionsResult(Collections.emptyList(), new Status(5008)));
                            ytp = zoh3.f55602k;
                            context = zoh3.f55428a;
                            str4 = zoh3.f55429b;
                            ytp.mo30769a(context, str4, (bpgr) da5.mo74062i());
                            return true;
                        } catch (Throwable th9) {
                            zoh3.f55602k.mo30769a(zoh3.f55428a, zoh3.f55429b, (bpgr) da5.mo74062i());
                            throw th9;
                        }
                    }
                }
                zce.mo30929a(new ListSubscriptionsResult(arrayList, Status.f30107a));
                ytp = zoh3.f55602k;
                context = zoh3.f55428a;
                str4 = zoh3.f55429b;
            } catch (IOException e7) {
                e = e7;
                str3 = str5;
                bnsl bnsl62 = (bnsl) zoh.f55595d.mo68387b();
                bnsl62.mo68437a(e);
                bnsl62.mo68432a("zoh", "a", (int) ErrorInfo.TYPE_FELICA_EXCEPTION_OTHER, str3);
                bnsl62.mo68405a("Error listing subscriptions.");
                zce.mo30929a(new ListSubscriptionsResult(Collections.emptyList(), new Status(5008)));
                ytp = zoh3.f55602k;
                context = zoh3.f55428a;
                str4 = zoh3.f55429b;
                ytp.mo30769a(context, str4, (bpgr) da5.mo74062i());
                return true;
            }
            ytp.mo30769a(context, str4, (bpgr) da5.mo74062i());
            return true;
        }
    }
}
