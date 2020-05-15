package p000;

import android.content.Context;
import android.os.Binder;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
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
import com.google.android.gms.fitness.service.recording.FitRecordingChimeraBroker;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: zoh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zoh extends zmd {

    /* renamed from: d */
    public static final srn f55595d = zvt.m46581a();

    /* renamed from: e */
    public final zrk f55596e;

    /* renamed from: f */
    public final zeb f55597f;

    /* renamed from: g */
    public final zqx f55598g;

    /* renamed from: h */
    public final ysl f55599h;

    /* renamed from: i */
    public final zds f55600i;

    /* renamed from: j */
    public final zdq f55601j;

    /* renamed from: k */
    public final ytp f55602k;

    /* renamed from: l */
    private final zmr f55603l;

    public zoh(FitRecordingChimeraBroker fitRecordingChimeraBroker, String str, yzs yzs) {
        super(fitRecordingChimeraBroker, str, yzs);
        this.f55596e = yzs.mo30880e(str);
        this.f55597f = yzs.mo30881f(str);
        this.f55598g = yzs.mo30890j(str);
        this.f55599h = yzs.mo30874b().mo30741b(this.f55429b);
        this.f55603l = new zmr(this.f55428a, str, yzs.mo30877c(str), this.f55596e, this.f55597f, yzs.mo30894l(str), yzs.mo30869a());
        this.f55601j = new zdq(this.f55428a, str, yzs.mo30874b());
        this.f55600i = new zds(str, this.f55596e, this.f55597f, this.f55598g, this.f55601j);
        this.f55602k = yzs.mo30887i();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.c(java.lang.Iterable, bmxz):boolean
     arg types: [bnic, zod]
     candidates:
      bnjd.c(java.lang.Iterable, int):java.lang.Iterable
      bnjd.c(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.c(java.lang.Iterable, bmxz):boolean */
    /* renamed from: b */
    private final Status m45865b(SubscribeRequest subscribeRequest, ytt ytt) {
        int i;
        Status status;
        int i2;
        Subscription subscription = subscribeRequest.f32317a;
        int i3 = 0;
        if (subscription == null) {
            return new Status(0);
        }
        cadr a = ywg.m44943a(subscription);
        String str = ytt.f54617a;
        if (this.f55599h.mo30721a(str, yyo.m45042a(a))) {
            return Status.f30107a;
        }
        Status a2 = this.f55601j.mo30959a(str, a);
        if (!a2.mo17710c()) {
            return a2;
        }
        if ((a.f172719a & 1) != 0) {
            zqx zqx = this.f55598g;
            caae caae = a.f172720b;
            if (caae == null) {
                caae = caae.f172323i;
            }
            caae a3 = zqx.mo30458a(caae, str);
            bxvd bxvd = (bxvd) a.mo74142c(5);
            bxvd.mo73625a((bxvk) a);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            cadr cadr = (cadr) bxvd.f164949b;
            cadr cadr2 = cadr.f172717f;
            a3.getClass();
            cadr.f172720b = a3;
            cadr.f172719a |= 1;
            a = (cadr) bxvd.mo74062i();
        }
        yqe yqe = new yqe(str, a, !subscribeRequest.f32318b ? 1 : 2);
        if (!this.f55601j.mo30961c(str) || subscribeRequest.f32318b) {
            i = mo31288a(yqe);
        } else {
            bnic<yqe> a4 = this.f55598g.mo31337a(yqe);
            if (cdyu.m135385c() || !bnjd.m109592c((Iterable) a4, (bmxz) new zod(this, ytt))) {
                i = mo31288a(yqe);
                ClientIdentity clientIdentity = new ClientIdentity(ytt.f54618b, ytt.f54617a);
                if (a4.isEmpty()) {
                    status = new Status(-5000);
                } else {
                    for (yqe yqe2 : a4) {
                        if (yqe2.f54384e == 1) {
                            bqgg a5 = this.f55597f.mo30969a(yqe2, clientIdentity);
                            try {
                                if (!a5.isDone() || ((Boolean) bqga.m112780a((Future) a5)).booleanValue()) {
                                    i3++;
                                }
                            } catch (ExecutionException e) {
                            }
                        }
                    }
                    if (cdyu.m135393k()) {
                        status = i3 == a4.size() ? Status.f30107a : new Status(8);
                    } else {
                        status = i3 == 0 ? new Status(-5000) : Status.f30107a;
                    }
                }
                if (status.mo17710c()) {
                    if (status.f30115i == -5000) {
                        bnsl bnsl = (bnsl) f55595d.mo68388c();
                        bnsl.mo68432a("zoh", "b", 283, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68420a("No data sources found for %s. Subscription is added; recording will start once sources become available.", yyo.m45045c(a));
                    }
                }
                return status;
            }
            if (!cdyu.f181962a.mo6606a().mo78515s()) {
                i2 = 5005;
            } else {
                i2 = 5025;
            }
            return new Status(i2);
        }
        zvm.m46571a(this.f55428a, this.f55429b);
        return i == 1 ? new Status(-5001) : Status.f30107a;
    }

    /* renamed from: e */
    private final int m45867e(String str) {
        try {
            return this.f55596e.mo31399b(str).size();
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f55595d.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zoh", "e", (int) MfiClientException.TYPE_NO_ACCOUNT_INFO, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error reading subscriptions.");
            return -1;
        }
    }

    /* renamed from: a */
    public final int mo31288a(yqe yqe) {
        int i;
        bnrd a = this.f55596e.mo31399b(yqe.f54380a).iterator();
        while (true) {
            if (!a.hasNext()) {
                i = 2;
                break;
            }
            yqe yqe2 = (yqe) a.next();
            cadr cadr = yqe2.f54381b;
            if (cadr.equals(yqe.f54381b)) {
                int i2 = yqe2.f54384e;
                int i3 = yqe.f54384e;
                if (i2 != 0) {
                    if (i2 == i3) {
                        i = 1;
                        break;
                    }
                } else {
                    throw null;
                }
            }
            if (yyo.m45043a(cadr, yqe.f54381b)) {
                if (yqe2.f54384e == 1) {
                    bnrd a2 = this.f55598g.mo31337a(yqe).iterator();
                    while (a2.hasNext()) {
                        this.f55597f.mo30973a((yqe) a2.next());
                    }
                }
                this.f55596e.mo31401b(yqe2);
                i = 3;
            }
        }
        if (i != 1) {
            this.f55596e.mo31398a(yqe);
        }
        return i;
    }

    /* renamed from: c */
    public final void mo31244c() {
        this.f55600i.mo30962a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo31293d(String str) {
        try {
            bnrd a = this.f55596e.mo31396a().iterator();
            while (a.hasNext()) {
                yqe yqe = (yqe) a.next();
                String str2 = yqe.f54380a;
                bmxv a2 = this.f55601j.mo30958a(str2);
                if (!a2.mo66813a()) {
                    this.f55596e.mo31397a(str2);
                } else if (this.f55601j.mo30960b(str2)) {
                    if (yqe.f54384e == 1) {
                        bnrd a3 = this.f55598g.mo31337a(yqe).iterator();
                        while (a3.hasNext()) {
                            yqe yqe2 = (yqe) a3.next();
                            caae caae = yqe2.f54381b.f172720b;
                            if (caae == null) {
                                caae = caae.f172323i;
                            }
                            if ((caae.f172325a & 32) != 0) {
                                caaq caaq = caae.f172331g;
                                if (caaq == null) {
                                    caaq = caaq.f172356h;
                                }
                                if (caaq.f172359b.equals(str)) {
                                    this.f55597f.mo30969a(yqe2, (ClientIdentity) a2.mo66814b());
                                    mo31246e();
                                }
                            }
                        }
                    }
                } else if (!cdyu.m135392j()) {
                    this.f55596e.mo31397a(str2);
                }
            }
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f55595d.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zoh", "d", 621, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Failed to recreate device registrations for %s", str);
        }
    }

    /* renamed from: g */
    public final void mo31248g() {
        bnsl bnsl = (bnsl) f55595d.mo68390d();
        bnsl.mo68432a("zoh", "g", 547, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Account removed.  Unregistering all recording listeners");
        zeb zeb = this.f55597f;
        for (List<zkh> list : zeb.f54999b.values()) {
            for (zkh zkh : list) {
                if (!zeb.f55000c.mo19160a(zkh.f55298a)) {
                    ((bnsl) zeb.f54998a.mo68388c()).mo68420a("Failed to remove listener for registration %s", zkh);
                }
            }
        }
        zeb.f54999b.clear();
        zeb.mo30970a(410, 2).mo30754a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo31292c(String str) {
        int i;
        if (cdyu.m135392j() && yub.m44843a(this.f55428a, str)) {
            bnsl bnsl = (bnsl) f55595d.mo68390d();
            bnsl.mo68432a("zoh", "c", 564, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Package %s enabled.  Potentially restarting recording", str);
            zds zds = this.f55600i;
            if (!zds.f54973b.mo31400b()) {
                ((bnsl) zds.f54972a.mo68388c()).mo68420a("Skipping FitRecordingApi init of %s since Fit DB doesn't exist", str);
                i = MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE;
            } else {
                try {
                    bnic b = zds.f54973b.mo31399b(str);
                    if (!b.isEmpty()) {
                        bngx a = zds.mo30963a(str, b);
                        int size = a.size();
                        bnre i2 = a.listIterator();
                        int i3 = 0;
                        while (i2.hasNext()) {
                            if (zds.mo30964a(str, (yqe) i2.next())) {
                                i3++;
                            }
                        }
                        ((bnsl) zds.f54972a.mo68390d()).mo68425a("FitRecording initialized for %s.  Recreated %d subscriptions out of %d.", str, Integer.valueOf(i3), Integer.valueOf(size));
                        i = zds.m45343a(i3, size);
                    } else {
                        i = MfiClientException.TYPE_MFICLIENT_CURRENTLY_ONLINE;
                    }
                } catch (IOException e) {
                    bnsl bnsl2 = (bnsl) zds.f54972a.mo68387b();
                    bnsl2.mo68437a(e);
                    bnsl2.mo68424a("Error recreating subscriptions for %s %s", zds.f54974c, str);
                    i = 10;
                }
            }
            if (mo31245d()) {
                mo31246e();
            }
            if (i != 159) {
                ytq a2 = this.f55602k.mo30767a(this.f55428a);
                a2.mo30762a(this.f55429b);
                a2.mo30755a(1048);
                a2.mo30765d(i);
                a2.mo30754a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Binder mo31233a(ytu ytu) {
        return new zof(this, ytu);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ytv mo31234a() {
        return new zog(this);
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
    /* renamed from: a */
    public final void mo31289a(ListSubscriptionsRequest listSubscriptionsRequest, String str) {
        ytp ytp;
        Context context;
        String str2;
        int i;
        int i2;
        boolean z;
        DataSource dataSource;
        ListSubscriptionsRequest listSubscriptionsRequest2 = listSubscriptionsRequest;
        String str3 = str;
        zce zce = listSubscriptionsRequest2.f32266b;
        bxvd da = bpgr.f137526x.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpgr bpgr = (bpgr) da.f164949b;
        str.getClass();
        int i3 = 1;
        bpgr.f137528a |= 1;
        bpgr.f137529b = str3;
        bxvd da2 = bpgi.f137493c.mo74144da();
        DataType dataType = listSubscriptionsRequest2.f32265a;
        if (dataType != null) {
            bzzv a = bzzk.m126356a(dataType.f32064a);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpgi bpgi = (bpgi) da2.f164949b;
            bpgi.f137496b = a.f172235aH;
            bpgi.f137495a |= 1;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpgr bpgr2 = (bpgr) da.f164949b;
        bpgi bpgi2 = (bpgi) da2.mo74062i();
        bpgi2.getClass();
        bpgr2.f137543p = bpgi2;
        bpgr2.f137528a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT;
        try {
            ArrayList arrayList = new ArrayList();
            bnrd a2 = this.f55596e.mo31399b(str3).iterator();
            while (a2.hasNext()) {
                yqe yqe = (yqe) a2.next();
                cadr cadr = yqe.f54381b;
                if (yqe.f54384e == 2) {
                    i = 2;
                } else {
                    i = 1;
                }
                yxr yxr = new yxr();
                if ((cadr.f172719a & i3) != 0) {
                    caae caae = cadr.f172720b;
                    if (caae == null) {
                        caae = caae.f172323i;
                    }
                    yxr.f54783a = yvx.m44926a(caae);
                }
                if ((cadr.f172719a & 2) != 0) {
                    caah caah = cadr.f172721c;
                    if (caah == null) {
                        caah = caah.f172333d;
                    }
                    yxr.f54784b = ywb.m44931a(caah);
                }
                int i4 = i;
                yxr.f54785c = TimeUnit.MICROSECONDS.toMicros(cadr.f172722d);
                int i5 = cadr.f172723e;
                if (i5 == i3 || i5 == 3) {
                    i2 = i5;
                } else {
                    i2 = 2;
                }
                yxr.f54786d = i2;
                yxr.f54787e = i4;
                if (yxr.f54783a == null && yxr.f54784b == null) {
                    z = false;
                } else {
                    z = true;
                }
                sdo.m34971a(z, (Object) "Must call setDataSource() or setDataType()");
                DataType dataType2 = yxr.f54784b;
                sdo.m34971a(dataType2 == null || (dataSource = yxr.f54783a) == null || dataType2.equals(dataSource.f32005a), (Object) "Specified data type is incompatible with specified data source");
                Subscription subscription = new Subscription(yxr.f54783a, yxr.f54784b, yxr.f54785c, yxr.f54786d, yxr.f54787e);
                DataType dataType3 = listSubscriptionsRequest2.f32265a;
                if (dataType3 != null) {
                    if (!dataType3.equals(subscription.mo18981a())) {
                        i3 = 1;
                    }
                }
                arrayList.add(subscription);
                i3 = 1;
            }
            zce.mo30929a(new ListSubscriptionsResult(arrayList, Status.f30107a));
            ytp = this.f55602k;
            context = this.f55428a;
            str2 = this.f55429b;
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f55595d.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zoh", "a", (int) ErrorInfo.TYPE_FELICA_EXCEPTION_OTHER, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error listing subscriptions.");
            zce.mo30929a(new ListSubscriptionsResult(Collections.emptyList(), new Status(5008)));
            ytp = this.f55602k;
            context = this.f55428a;
            str2 = this.f55429b;
        } catch (Throwable th) {
            this.f55602k.mo30769a(this.f55428a, this.f55429b, (bpgr) da.mo74062i());
            throw th;
        }
        ytp.mo30769a(context, str2, (bpgr) da.mo74062i());
    }

    /* renamed from: d */
    public final boolean mo31245d() {
        return !this.f55597f.f54999b.isEmpty();
    }

    /* renamed from: b */
    private final Status m45866b(UnsubscribeRequest unsubscribeRequest, String str) {
        caah a = ywb.m44930a(unsubscribeRequest.f32322a);
        caae a2 = yvx.m44925a(unsubscribeRequest.f32323b);
        if (a2 != null) {
            a2 = this.f55598g.mo30458a(a2, str);
        }
        bnrd a3 = this.f55596e.mo31399b(str).iterator();
        while (a3.hasNext()) {
            yqe yqe = (yqe) a3.next();
            cadr cadr = yqe.f54381b;
            if (a2 != null) {
                caae caae = cadr.f172720b;
                if (caae == null) {
                    caae = caae.f172323i;
                }
                if (!a2.equals(caae)) {
                }
            }
            if (a == null || bzzn.m126363a(a, yyo.m45042a(cadr))) {
                bnrd a4 = this.f55598g.mo31337a(yqe).iterator();
                while (a4.hasNext()) {
                    yqe yqe2 = (yqe) a4.next();
                    if (yqe2.f54384e == 1 && !this.f55597f.mo30973a(yqe2)) {
                        bnsl bnsl = (bnsl) f55595d.mo68387b();
                        bnsl.mo68432a("zoh", "b", 465, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68420a("Failed to unregister recording listener for %s. Will proceed to remove subscription anyway.", yqe);
                    }
                }
                if (!this.f55596e.mo31401b(yqe)) {
                    bnsl bnsl2 = (bnsl) f55595d.mo68387b();
                    bnsl2.mo68432a("zoh", "b", 474, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68420a("Failed to remove subscription. Not found?: %s", yqe);
                }
            }
        }
        return Status.f30107a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.c(java.lang.Iterable, bmxz):boolean
     arg types: [bnic, zod]
     candidates:
      bnjd.c(java.lang.Iterable, int):java.lang.Iterable
      bnjd.c(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.c(java.lang.Iterable, bmxz):boolean */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02bc A[Catch:{ all -> 0x02d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02bd A[Catch:{ all -> 0x02d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02e2  */
    /* renamed from: a */
    public final void mo31290a(SubscribeRequest subscribeRequest, ytt ytt) {
        Status status;
        int i;
        Status status2;
        int i2;
        int i3;
        Status status3;
        int i4;
        DataType dataType;
        String str;
        SubscribeRequest subscribeRequest2 = subscribeRequest;
        ytt ytt2 = ytt;
        zcl zcl = subscribeRequest2.f32319c;
        bxvd da = bpgr.f137526x.mo74144da();
        String str2 = ytt2.f54617a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpgr bpgr = (bpgr) da.f164949b;
        str2.getClass();
        bpgr.f137528a |= 1;
        bpgr.f137529b = str2;
        Subscription subscription = subscribeRequest2.f32317a;
        bzzv bzzv = bzzv.UNKNOWN_DATA_TYPE;
        if (subscription != null) {
            DataSource dataSource = subscription.f32176a;
            if (dataSource == null) {
                dataType = subscription.f32177b;
            } else {
                dataType = dataSource.f32005a;
            }
            bxvd da2 = bpgj.f137497e.mo74144da();
            boolean z = subscribeRequest2.f32318b;
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpgj bpgj = (bpgj) da2.f164949b;
            bpgj.f137499a |= 4;
            bpgj.f137502d = z;
            if (dataType != null) {
                bzzv = bzzk.m126356a(dataType.f32064a);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpgj bpgj2 = (bpgj) da2.f164949b;
                bpgj2.f137500b = bzzv.f172235aH;
                bpgj2.f137499a |= 1;
            }
            DataSource dataSource2 = subscription.f32176a;
            if (!(dataSource2 == null || (str = dataSource2.f32009e) == null)) {
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
        ytq a = this.f55602k.mo30767a(this.f55428a);
        a.mo30762a(this.f55429b);
        a.mo30755a(404);
        a.mo30763b(bzzv.f172235aH);
        try {
            Subscription subscription2 = subscribeRequest2.f32317a;
            if (subscription2 != null) {
                cadr a2 = ywg.m44943a(subscription2);
                String str3 = ytt2.f54617a;
                if (!this.f55599h.mo30721a(str3, yyo.m45042a(a2))) {
                    Status a3 = this.f55601j.mo30959a(str3, a2);
                    if (a3.mo17710c()) {
                        if ((a2.f172719a & 1) != 0) {
                            zqx zqx = this.f55598g;
                            caae caae = a2.f172720b;
                            if (caae == null) {
                                caae = caae.f172323i;
                            }
                            caae a4 = zqx.mo30458a(caae, str3);
                            bxvd bxvd = (bxvd) a2.mo74142c(5);
                            bxvd.mo73625a((bxvk) a2);
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            cadr cadr = (cadr) bxvd.f164949b;
                            cadr cadr2 = cadr.f172717f;
                            a4.getClass();
                            cadr.f172720b = a4;
                            cadr.f172719a |= 1;
                            a2 = (cadr) bxvd.mo74062i();
                        }
                        if (!subscribeRequest2.f32318b) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                        yqe yqe = new yqe(str3, a2, i3);
                        if (!this.f55601j.mo30961c(str3) || subscribeRequest2.f32318b) {
                            i4 = mo31288a(yqe);
                        } else {
                            bnic<yqe> a5 = this.f55598g.mo31337a(yqe);
                            if (cdyu.m135385c() || !bnjd.m109592c((Iterable) a5, (bmxz) new zod(this, ytt2))) {
                                i4 = mo31288a(yqe);
                                ClientIdentity clientIdentity = new ClientIdentity(ytt2.f54618b, ytt2.f54617a);
                                if (a5.isEmpty()) {
                                    status3 = new Status(-5000);
                                } else {
                                    int i5 = 0;
                                    for (yqe yqe2 : a5) {
                                        if (yqe2.f54384e == 1) {
                                            bqgg a6 = this.f55597f.mo30969a(yqe2, clientIdentity);
                                            try {
                                                if (!a6.isDone() || ((Boolean) bqga.m112780a((Future) a6)).booleanValue()) {
                                                    i5++;
                                                }
                                            } catch (ExecutionException e) {
                                            }
                                        }
                                    }
                                    if (cdyu.m135393k()) {
                                        status3 = i5 != a5.size() ? new Status(8) : Status.f30107a;
                                    } else if (i5 == 0) {
                                        status3 = new Status(-5000);
                                    } else {
                                        status3 = Status.f30107a;
                                    }
                                }
                                if (status3.mo17710c()) {
                                    if (status3.f30115i == -5000) {
                                        bnsl bnsl = (bnsl) f55595d.mo68388c();
                                        bnsl.mo68432a("zoh", "b", 283, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl.mo68420a("No data sources found for %s. Subscription is added; recording will start once sources become available.", yyo.m45045c(a2));
                                    }
                                }
                                status = status3;
                            } else {
                                status = new Status(!cdyu.f181962a.mo6606a().mo78515s() ? 5005 : 5025);
                            }
                        }
                        zvm.m46571a(this.f55428a, this.f55429b);
                        if (i4 == 1) {
                            status3 = new Status(-5001);
                            status = status3;
                        } else {
                            status = Status.f30107a;
                        }
                    } else {
                        status = a3;
                    }
                } else {
                    status = Status.f30107a;
                }
            } else {
                status = new Status(0);
            }
            try {
                int i6 = status.f30115i;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpgr bpgr3 = (bpgr) da.f164949b;
                bpgr3.f137528a |= 2;
                bpgr3.f137530c = i6;
                if (status.mo17710c() && mo31245d()) {
                    mo31246e();
                    znq.m45815a(this.f55428a, this.f55429b);
                }
                zcl.mo30933a(status);
                if (status != null) {
                    i2 = ytp.m44794a(status);
                } else {
                    i2 = 15;
                }
                a.mo30765d(i2);
            } catch (IOException e2) {
                e = e2;
                try {
                    bnsl bnsl2 = (bnsl) f55595d.mo68387b();
                    bnsl2.mo68437a(e);
                    bnsl2.mo68432a("zoh", "a", (int) BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Error subscribing.");
                    status2 = new Status(5008);
                    try {
                        zcl.mo30933a(status2);
                        if (!da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpgr bpgr4 = (bpgr) da.f164949b;
                        bpgr4.f137528a |= 2;
                        bpgr4.f137530c = 5008;
                        a.mo30765d(ytp.m44794a(status2));
                        a.mo30754a();
                        this.f55602k.mo30769a(this.f55428a, this.f55429b, (bpgr) da.mo74062i());
                    } catch (Throwable th) {
                        th = th;
                        status = status2;
                        if (status != null) {
                            i = ytp.m44794a(status);
                        } else {
                            i = 15;
                        }
                        a.mo30765d(i);
                        a.mo30754a();
                        this.f55602k.mo30769a(this.f55428a, this.f55429b, (bpgr) da.mo74062i());
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (status != null) {
                    }
                    a.mo30765d(i);
                    a.mo30754a();
                    this.f55602k.mo30769a(this.f55428a, this.f55429b, (bpgr) da.mo74062i());
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            status = null;
            bnsl bnsl22 = (bnsl) f55595d.mo68387b();
            bnsl22.mo68437a(e);
            bnsl22.mo68432a("zoh", "a", (int) BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl22.mo68405a("Error subscribing.");
            status2 = new Status(5008);
            zcl.mo30933a(status2);
            if (!da.f164950c) {
            }
            bpgr bpgr42 = (bpgr) da.f164949b;
            bpgr42.f137528a |= 2;
            bpgr42.f137530c = 5008;
            a.mo30765d(ytp.m44794a(status2));
            a.mo30754a();
            this.f55602k.mo30769a(this.f55428a, this.f55429b, (bpgr) da.mo74062i());
        } catch (Throwable th3) {
            th = th3;
            status = null;
            if (status != null) {
            }
            a.mo30765d(i);
            a.mo30754a();
            this.f55602k.mo30769a(this.f55428a, this.f55429b, (bpgr) da.mo74062i());
            throw th;
        }
        a.mo30754a();
        this.f55602k.mo30769a(this.f55428a, this.f55429b, (bpgr) da.mo74062i());
    }

    /* renamed from: b */
    public final void mo31242b(String str) {
        bnsl bnsl = (bnsl) f55595d.mo68390d();
        bnsl.mo68432a("zoh", "b", 535, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Package %s removed.  Unregistering all recording listeners", str);
        this.f55597f.mo30972a(str);
    }

    /* renamed from: b */
    public final boolean mo31243b() {
        int i;
        int a = this.f55600i.mo30962a();
        boolean z = true;
        if (!(a == 2 || a == 160)) {
            z = false;
        }
        if (z) {
            znq.m45815a(this.f55428a, this.f55429b);
        }
        try {
            i = this.f55596e.mo31399b("com.google.android.apps.fitness").size();
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f55595d.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("zoh", "e", (int) MfiClientException.TYPE_NO_ACCOUNT_INFO, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Error reading subscriptions.");
            i = -1;
        }
        int size = this.f55597f.mo30974b("com.google.android.apps.fitness").size();
        ytq a2 = this.f55602k.mo30767a(this.f55428a);
        a2.mo30762a(this.f55429b);
        a2.mo30755a(406);
        a2.mo30765d(a);
        a2.mo30763b(i);
        a2.mo30764c(size);
        a2.mo30754a();
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01e3 A[Catch:{ all -> 0x01fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01e4 A[Catch:{ all -> 0x01fe }] */
    /* renamed from: a */
    public final void mo31291a(UnsubscribeRequest unsubscribeRequest, String str) {
        Status status;
        int i;
        Status status2;
        int i2;
        String str2;
        UnsubscribeRequest unsubscribeRequest2 = unsubscribeRequest;
        String str3 = str;
        zcl zcl = unsubscribeRequest2.f32324c;
        if (unsubscribeRequest2.f32322a == null && unsubscribeRequest2.f32323b == null) {
            zcl.mo30933a(Status.f30107a);
            return;
        }
        bxvd da = bpgr.f137526x.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpgr bpgr = (bpgr) da.f164949b;
        str.getClass();
        bpgr.f137528a |= 1;
        bpgr.f137529b = str3;
        bzzv bzzv = bzzv.UNKNOWN_DATA_TYPE;
        DataSource dataSource = unsubscribeRequest2.f32323b;
        DataType dataType = dataSource == null ? unsubscribeRequest2.f32322a : dataSource.f32005a;
        bxvd da2 = bpgk.f137503d.mo74144da();
        if (dataType != null) {
            bzzv = bzzk.m126356a(dataType.f32064a);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpgk bpgk = (bpgk) da2.f164949b;
            bpgk.f137506b = bzzv.f172235aH;
            bpgk.f137505a |= 1;
        }
        DataSource dataSource2 = unsubscribeRequest2.f32323b;
        if (!(dataSource2 == null || (str2 = dataSource2.f32009e) == null)) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpgk bpgk2 = (bpgk) da2.f164949b;
            str2.getClass();
            bpgk2.f137505a |= 2;
            bpgk2.f137507c = str2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpgr bpgr2 = (bpgr) da.f164949b;
        bpgk bpgk3 = (bpgk) da2.mo74062i();
        bpgk3.getClass();
        bpgr2.f137545r = bpgk3;
        bpgr2.f137528a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
        ytq a = this.f55602k.mo30767a(this.f55428a);
        a.mo30762a(this.f55429b);
        a.mo30755a(405);
        a.mo30763b(bzzv.f172235aH);
        try {
            caah a2 = ywb.m44930a(unsubscribeRequest2.f32322a);
            caae a3 = yvx.m44925a(unsubscribeRequest2.f32323b);
            if (a3 != null) {
                a3 = this.f55598g.mo30458a(a3, str3);
            }
            bnrd a4 = this.f55596e.mo31399b(str3).iterator();
            while (a4.hasNext()) {
                yqe yqe = (yqe) a4.next();
                cadr cadr = yqe.f54381b;
                if (a3 != null) {
                    caae caae = cadr.f172720b;
                    if (caae == null) {
                        caae = caae.f172323i;
                    }
                    if (!a3.equals(caae)) {
                    }
                }
                if (a2 != null) {
                    if (!bzzn.m126363a(a2, yyo.m45042a(cadr))) {
                    }
                }
                bnrd a5 = this.f55598g.mo31337a(yqe).iterator();
                while (a5.hasNext()) {
                    yqe yqe2 = (yqe) a5.next();
                    if (yqe2.f54384e == 1) {
                        if (!this.f55597f.mo30973a(yqe2)) {
                            bnsl bnsl = (bnsl) f55595d.mo68387b();
                            bnsl.mo68432a("zoh", "b", 465, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl.mo68420a("Failed to unregister recording listener for %s. Will proceed to remove subscription anyway.", yqe);
                        }
                    }
                }
                if (!this.f55596e.mo31401b(yqe)) {
                    bnsl bnsl2 = (bnsl) f55595d.mo68387b();
                    bnsl2.mo68432a("zoh", "b", 474, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68420a("Failed to remove subscription. Not found?: %s", yqe);
                }
            }
            status = Status.f30107a;
            try {
                int i3 = status.f30115i;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpgr bpgr3 = (bpgr) da.f164949b;
                bpgr3.f137528a |= 2;
                bpgr3.f137530c = i3;
                zcl.mo30933a(status);
                if (status.mo17710c() && !mo31245d()) {
                    mo31247f();
                }
                if (status != null) {
                    i2 = ytp.m44794a(status);
                } else {
                    i2 = 15;
                }
                a.mo30765d(i2);
            } catch (IOException e) {
                e = e;
                try {
                    bnsl bnsl3 = (bnsl) f55595d.mo68387b();
                    bnsl3.mo68437a(e);
                    bnsl3.mo68432a("zoh", "a", 427, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Error unsubscribing.");
                    status2 = new Status(5008);
                    try {
                        zcl.mo30933a(status2);
                        if (!da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bpgr bpgr4 = (bpgr) da.f164949b;
                        bpgr4.f137528a |= 2;
                        bpgr4.f137530c = 5008;
                        a.mo30765d(ytp.m44794a(status2));
                        a.mo30754a();
                        this.f55602k.mo30769a(this.f55428a, this.f55429b, (bpgr) da.mo74062i());
                    } catch (Throwable th) {
                        th = th;
                        status = status2;
                        if (status != null) {
                        }
                        a.mo30765d(i);
                        a.mo30754a();
                        this.f55602k.mo30769a(this.f55428a, this.f55429b, (bpgr) da.mo74062i());
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (status != null) {
                        i = ytp.m44794a(status);
                    } else {
                        i = 15;
                    }
                    a.mo30765d(i);
                    a.mo30754a();
                    this.f55602k.mo30769a(this.f55428a, this.f55429b, (bpgr) da.mo74062i());
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            status = null;
            bnsl bnsl32 = (bnsl) f55595d.mo68387b();
            bnsl32.mo68437a(e);
            bnsl32.mo68432a("zoh", "a", 427, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl32.mo68405a("Error unsubscribing.");
            status2 = new Status(5008);
            zcl.mo30933a(status2);
            if (!da.f164950c) {
            }
            bpgr bpgr42 = (bpgr) da.f164949b;
            bpgr42.f137528a |= 2;
            bpgr42.f137530c = 5008;
            a.mo30765d(ytp.m44794a(status2));
            a.mo30754a();
            this.f55602k.mo30769a(this.f55428a, this.f55429b, (bpgr) da.mo74062i());
        } catch (Throwable th3) {
            th = th3;
            status = null;
            if (status != null) {
            }
            a.mo30765d(i);
            a.mo30754a();
            this.f55602k.mo30769a(this.f55428a, this.f55429b, (bpgr) da.mo74062i());
            throw th;
        }
        a.mo30754a();
        this.f55602k.mo30769a(this.f55428a, this.f55429b, (bpgr) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo31235a(PrintWriter printWriter) {
        if (!cdyu.m135384b()) {
            this.f55603l.mo31261a(printWriter);
        }
    }

    /* renamed from: a */
    public final void mo31236a(String str) {
        bnsl bnsl = (bnsl) f55595d.mo68390d();
        bnsl.mo68432a("zoh", "a", 541, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Package %s disconnected.  Unregistering recording listeners", str);
        this.f55597f.mo30972a(str);
    }
}
