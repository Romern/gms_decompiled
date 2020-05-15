package p000;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.DailyTotalRequest;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.ReadRawRequest;
import com.google.android.gms.fitness.request.ReadStatsRequest;
import com.google.android.gms.fitness.result.DailyTotalResult;
import com.google.android.gms.fitness.result.DataReadResult;
import com.google.android.gms.fitness.result.DataStatsResult;
import com.google.android.gms.fitness.result.ReadRawResult;
import com.google.android.gms.fitness.service.history.FitHistoryChimeraBroker;
import com.google.android.gms.fitness.store.listener.DataUpdateListener;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: zne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zne extends zmd {

    /* renamed from: d */
    public static final srn f55533d = zvt.m46581a();

    /* renamed from: k */
    private static final Random f55534k = new Random();

    /* renamed from: e */
    public final zqx f55535e;

    /* renamed from: f */
    public final yec f55536f = new yec();

    /* renamed from: g */
    public final znj f55537g;

    /* renamed from: h */
    public final zsm f55538h;

    /* renamed from: i */
    public final zmw f55539i;

    /* renamed from: j */
    public final ytp f55540j;

    /* renamed from: l */
    private final ysl f55541l;

    /* renamed from: m */
    private final zrn f55542m;

    /* renamed from: n */
    private final sqv f55543n;

    /* renamed from: o */
    private final ExecutorService f55544o;

    /* renamed from: p */
    private final zgf f55545p;

    public zne(FitHistoryChimeraBroker fitHistoryChimeraBroker, String str, ExecutorService executorService, zsm zsm, yzs yzs, Set set) {
        super(fitHistoryChimeraBroker, str, yzs);
        this.f55541l = yzs.mo30874b().mo30741b(this.f55429b);
        zre c = yzs.mo30877c(this.f55429b);
        this.f55535e = yzs.mo30890j(this.f55429b);
        this.f55542m = yzs.mo30872a(this.f55429b);
        this.f55544o = executorService;
        this.f55543n = yzs.mo30869a();
        this.f55538h = zsm;
        this.f55537g = new znj(this.f55541l, c, this.f55535e, this.f55536f, set);
        this.f55545p = yzs.mo30888i(str);
        this.f55540j = yzs.mo30887i();
        this.f55539i = new zmw(this.f55428a, str, this.f55540j, this.f55543n);
    }

    /* renamed from: a */
    public static void m45784a(zaw zaw, DailyTotalResult dailyTotalResult) {
        try {
            zaw.mo30898a(dailyTotalResult);
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f55533d.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Error while delivering result to client");
        }
    }

    /* renamed from: h */
    private final bqgg m45788h() {
        this.f55542m.mo31406b();
        if (!cdzd.m135486o()) {
            return bqga.m112775a(Status.f30107a);
        }
        return this.f55545p.mo19154a();
    }

    /* renamed from: a */
    public final void mo31236a(String str) {
    }

    /* renamed from: b */
    public final void mo31242b(String str) {
        zsm zsm = this.f55538h;
        List a = zsm.mo31438a(this.f55429b, str, null);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            zsm.f55816m.mo30752b((DataUpdateListener) a.get(i));
        }
        if (!mo31245d()) {
            mo31247f();
        }
    }

    /* renamed from: d */
    public final boolean mo31245d() {
        return !this.f55538h.mo31438a(this.f55429b, null, null).isEmpty();
    }

    /* renamed from: g */
    public final void mo31248g() {
        zsm zsm = this.f55538h;
        List a = zsm.mo31438a(this.f55429b, null, null);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            zsm.f55816m.mo30752b((DataUpdateListener) a.get(i));
        }
        mo31247f();
    }

    /* renamed from: a */
    public static void m45785a(zax zax, DataReadResult dataReadResult) {
        List<DataReadResult> list;
        int i = 0;
        if (dataReadResult.f32330b.mo17710c()) {
            zlx zlx = new zlx(dataReadResult.f32329a, dataReadResult.f32331c);
            zlx.mo31229a(zlx.f55418a, zlx.f55421d);
            for (Bucket bucket : zlx.f55419b) {
                if (zlx.f55424g + bucket.mo18889c() > 100000) {
                    zlx.mo31228a();
                }
                zlx.f55422e = bucket;
                zlx.mo31229a(bucket.f31989e, zlx.f55423f);
                zlx.mo31230b();
            }
            zlx.mo31228a();
            List list2 = zlx.f55420c;
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((DataReadResult) list2.get(i2)).f32332d = zlx.f55420c.size();
            }
            zlx.f55420c.size();
            list = zlx.f55420c;
        } else {
            list = bngx.m109356a(dataReadResult);
        }
        for (DataReadResult dataReadResult2 : list) {
            int E = (int) cdzd.f182003a.mo6606a().mo78538E();
            if (E < 2) {
                try {
                    zax.mo30899a(dataReadResult2);
                } catch (RemoteException e) {
                    bnsl bnsl = (bnsl) f55533d.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68405a("Failed to deliver batch result to client");
                }
            } else {
                int i3 = 1;
                while (i3 <= E) {
                    try {
                        zax.mo30899a(dataReadResult2);
                    } catch (RemoteException e2) {
                        if (e2 instanceof TransactionTooLargeException) {
                            try {
                                Thread.sleep((long) ((i3 * 50) + f55534k.nextInt(100)));
                            } catch (InterruptedException e3) {
                                Thread.currentThread().interrupt();
                                bnsl bnsl2 = (bnsl) f55533d.mo68388c();
                                bnsl2.mo68437a(e2);
                                bnsl2.mo68405a("Interrupted while waiting to retry.");
                            }
                        }
                        bnsl bnsl3 = (bnsl) f55533d.mo68388c();
                        bnsl3.mo68437a(e2);
                        bnsl3.mo68411a("Error delivering batch %s. Attempt #%s", i, i3);
                        i3++;
                    }
                }
                ((bnsl) f55533d.mo68388c()).mo68405a("Failed to deliver all batches to client, giving up");
                return;
            }
            i++;
        }
    }

    /* renamed from: b */
    public final boolean mo31243b() {
        return mo31245d();
    }

    /* renamed from: a */
    public static void m45786a(zcf zcf, ReadRawResult readRawResult) {
        try {
            Parcel bj = zcf.mo8529bj();
            dcl.m8165a(bj, readRawResult);
            zcf.mo8530c(1, bj);
            if (m45787a(zcf.f12819a)) {
                return;
            }
        } catch (RemoteException e) {
            bnsl bnsl = (bnsl) f55533d.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Error while delivering result to client");
            if (m45787a(zcf.f12819a)) {
                return;
            }
        } catch (Throwable th) {
            if (!m45787a(zcf.f12819a)) {
                readRawResult.f32358a.close();
            }
            throw th;
        }
        readRawResult.f32358a.close();
    }

    /* renamed from: a */
    public static boolean m45787a(IBinder iBinder) {
        try {
            return iBinder.queryLocalInterface(iBinder.getInterfaceDescriptor()) != null;
        } catch (RemoteException e) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Binder mo31233a(ytu ytu) {
        return new zbp(this, ytu);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ytv mo31234a() {
        return new znd(this);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, long, long):void
     arg types: [java.lang.String, long, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, long, long):void */
    /* renamed from: a */
    public final void mo31266a(DailyTotalRequest dailyTotalRequest, String str, zaw zaw) {
        DailyTotalRequest dailyTotalRequest2 = dailyTotalRequest;
        zaw zaw2 = zaw;
        DataType dataType = dailyTotalRequest2.f32199a;
        if (dataType != null) {
            caah a = ywb.m44930a(dataType);
            Status b = this.f55541l.mo30725b(str, bnic.m109489a(a), 1);
            ygb a2 = ygc.m44027a(str);
            if (!b.mo17710c()) {
                if (bzzn.f172102ao.equals(a)) {
                    a2.f53749c = zly.m45722a(bngx.m109356a(zvn.m46574a(this.f55428a)), yxy.f54800b.f172301b);
                } else {
                    m45784a(zaw2, DailyTotalResult.m23712a(b, dailyTotalRequest2.f32199a));
                    return;
                }
            }
            bngx a3 = bngx.m109356a(bzzn.f172102ao.equals(a) ? yyg.f54821a : this.f55535e.mo30459a(a));
            if (znm.m45808a(a3) || bzzn.f172116j.equals(a)) {
                long a4 = this.f55543n.mo20505a();
                if (a4 < 946684800000L) {
                    ((bnsl) f55533d.mo68388c()).mo68417a("Bad end time: %d. Min end time: %d. System clock may be wrong.", a4, 946684800000L);
                    m45784a(zaw2, DailyTotalResult.m23712a(new Status(5022), dailyTotalRequest2.f32199a));
                    return;
                }
                try {
                    m45788h().mo741a(new zmy(this, a4, dailyTotalRequest, a2, a, a3, zaw, str), this.f55544o);
                } catch (RejectedExecutionException e) {
                    bnsl bnsl = (bnsl) f55533d.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68420a("request rejected %s", dailyTotalRequest2);
                    m45784a(zaw2, DailyTotalResult.m23712a(new Status(5008), dailyTotalRequest2.f32199a));
                }
            } else {
                m45784a(zaw2, DailyTotalResult.m23712a(new Status(5012), dailyTotalRequest2.f32199a));
            }
        } else {
            m45784a(zaw2, new DailyTotalResult((DataSet) null, Status.f30107a));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [java.util.Set, znf]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [bnic, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.HashSet, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zrc.a(long, long, caae, boolean):void
     arg types: [long, long, caae, int]
     candidates:
      zrc.a(caae, long, long, int):cadp
      zrc.a(caae, long, long, cadp):void
      zrc.a(java.util.Set, long, long, boolean):void
      zrc.a(long, long, caae, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zpc.a(zrc, cadz):void
     arg types: [zre, cadz]
     candidates:
      zpc.a(cadz, caaq):cadp
      zpc.a(cadz, cadz):cadz
      zpc.a(zre, cadz):void
      zpc.a(zrc, cadz):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnkn.a(java.util.List, bmxj):java.util.List
     arg types: [bngx, bmxj]
     candidates:
      bnkn.a(java.util.List, int):java.util.List
      bnkn.a(java.util.List, java.lang.Object):boolean
      bnkn.a(java.util.List, bmxj):java.util.List */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zrc.a(java.util.Set, long, long, boolean):void
     arg types: [bnic, long, long, int]
     candidates:
      zrc.a(caae, long, long, int):cadp
      zrc.a(long, long, caae, boolean):void
      zrc.a(caae, long, long, cadp):void
      zrc.a(java.util.Set, long, long, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d5, code lost:
        if (r2.f32206e.isEmpty() == false) goto L_0x00d7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03fd  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x044e  */
    /* JADX WARNING: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo31267a(DataDeleteRequest dataDeleteRequest, String str) {
        String str2;
        Context context;
        Status status;
        ytp ytp;
        zcl zcl;
        int i;
        boolean z;
        DataDeleteRequest dataDeleteRequest2 = dataDeleteRequest;
        String str3 = str;
        bxvd da = bpgr.f137526x.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpgr bpgr = (bpgr) da.f164949b;
        str.getClass();
        bpgr.f137528a |= 1;
        bpgr.f137529b = str3;
        HashSet<bzzv> hashSet = new HashSet();
        for (DataType dataType : dataDeleteRequest2.f32205d) {
            hashSet.add(bzzk.m126356a(dataType.f32064a));
        }
        for (DataSource dataSource : dataDeleteRequest2.f32204c) {
            hashSet.add(bzzk.m126356a(dataSource.f32005a.f32064a));
        }
        bxvd da2 = bpgc.f137471b.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpgc bpgc = (bpgc) da2.f164949b;
        if (!bpgc.f137473a.mo73666a()) {
            bpgc.f137473a = GeneratedMessageLite.m124019a(bpgc.f137473a);
        }
        for (bzzv bzzv : hashSet) {
            bpgc.f137473a.mo74153d(bzzv.f172235aH);
        }
        bpgc bpgc2 = (bpgc) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpgr bpgr2 = (bpgr) da.f164949b;
        bpgc2.getClass();
        bpgr2.f137539l = bpgc2;
        bpgr2.f137528a |= 1024;
        try {
            znj znj = this.f55537g;
            if (cdyr.m135341c()) {
                if (dataDeleteRequest2.f32208g) {
                }
                status = znj.f55553c.mo30730c(str3, stc.m36282a("https://www.googleapis.com/auth/fitness.activity.write"));
                if (!status.mo17710c()) {
                    ytp = this.f55540j;
                    context = this.f55428a;
                    str2 = this.f55429b;
                    if (status != null) {
                        i = status.f30115i;
                    } else {
                        i = 13;
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpgr bpgr3 = (bpgr) da.f164949b;
                    bpgr3.f137528a |= 2;
                    bpgr3.f137530c = i;
                    ytp.mo30769a(context, str2, (bpgr) da.mo74062i());
                    zcl = dataDeleteRequest2.f32209h;
                    if (zcl != null) {
                        zcl.mo30933a(status);
                        return;
                    }
                    return;
                }
            }
            long convert = TimeUnit.MILLISECONDS.convert(dataDeleteRequest2.f32202a, TimeUnit.MILLISECONDS);
            long convert2 = TimeUnit.MILLISECONDS.convert(dataDeleteRequest2.f32203b, TimeUnit.MILLISECONDS);
            if (dataDeleteRequest2.f32207f || !dataDeleteRequest2.f32205d.isEmpty() || !dataDeleteRequest2.f32204c.isEmpty()) {
                bnic a = bnic.m109495a((Collection) ywb.m44928a(dataDeleteRequest2.f32205d));
                HashSet hashSet2 = new HashSet(yvx.m44924a(dataDeleteRequest2.f32204c));
                if (dataDeleteRequest2.f32210i) {
                    if (znj.f55553c.mo30720a(str3)) {
                        bngx<caae> a2 = bngx.m109368a((Collection) hashSet2);
                        long nanos = TimeUnit.MILLISECONDS.toNanos(convert);
                        long nanos2 = TimeUnit.MILLISECONDS.toNanos(convert2);
                        for (caae caae : a2) {
                            znj.f55554d.mo31375c(caae, nanos, nanos2);
                        }
                    }
                }
                bngx<caae> a3 = bngx.m109355a(bnjd.m109586b((Iterable) znj.f55554d.mo31388h(), (bmxz) new znf(znj, str3)));
                bnic a4 = bnic.m109488a(bnjd.m109575a((Iterable) a, zng.f55548a));
                bnic a5 = bnic.m109488a(bnjd.m109575a((Iterable) hashSet2, znh.f55549a));
                if (!a.isEmpty() || !hashSet2.isEmpty()) {
                    bngs j = bngx.m109377j();
                    bnre i2 = a3.listIterator();
                    while (i2.hasNext()) {
                        caae caae2 = (caae) i2.next();
                        caah caah = caae2.f172330f;
                        if (caah == null) {
                            caah = caah.f172333d;
                        }
                        if (a4.contains(caah.f172336b)) {
                            j.mo67668c(caae2);
                        } else if (a5.contains(caae2.f172326b)) {
                            j.mo67668c(caae2);
                        }
                    }
                    a3 = j.mo67664a();
                }
                if (cdyr.f181940a.mo6606a().mo78491q()) {
                    status = znj.f55553c.mo30717a(str3, a3, 2);
                    if (!status.mo17710c()) {
                        ytp = this.f55540j;
                        context = this.f55428a;
                        str2 = this.f55429b;
                        if (status != null) {
                        }
                        if (da.f164950c) {
                        }
                        bpgr bpgr32 = (bpgr) da.f164949b;
                        bpgr32.f137528a |= 2;
                        bpgr32.f137530c = i;
                        ytp.mo30769a(context, str2, (bpgr) da.mo74062i());
                        zcl = dataDeleteRequest2.f32209h;
                        if (zcl != null) {
                        }
                    }
                }
                long nanos3 = TimeUnit.MILLISECONDS.toNanos(convert);
                long nanos4 = TimeUnit.MILLISECONDS.toNanos(convert2);
                for (caae caae3 : a3) {
                    znj.f55554d.mo31367a(nanos3, nanos4, caae3, true);
                }
            }
            if (dataDeleteRequest2.f32208g || !dataDeleteRequest2.f32206e.isEmpty()) {
                List<Session> list = dataDeleteRequest2.f32206e;
                bngs b = bngx.m109371b(list.size());
                for (Session session : list) {
                    b.mo67668c(ywf.m44941a(session));
                }
                bngx<cadz> a6 = b.mo67664a();
                if (dataDeleteRequest2.f32211j || !yxy.m44965a(str)) {
                    z = true;
                } else {
                    z = false;
                }
                ArrayList<cadz> arrayList = new ArrayList();
                if (a6.isEmpty()) {
                    bnre i3 = znj.f55554d.mo31392a(str, null, null, convert, convert2).listIterator();
                    while (i3.hasNext()) {
                        cadz cadz = (cadz) i3.next();
                        if (!yym.m45037b(cadz)) {
                            arrayList.add(cadz);
                        }
                    }
                } else {
                    bzzy bzzy = (bzzy) bzzz.f172298f.mo74144da();
                    if (bzzy.f164950c) {
                        bzzy.mo74035c();
                        bzzy.f164950c = false;
                    }
                    bzzz bzzz = (bzzz) bzzy.f164949b;
                    str.getClass();
                    bzzz.f172300a |= 1;
                    bzzz.f172301b = str3;
                    bzzz bzzz2 = (bzzz) bzzy.mo74062i();
                    for (cadz cadz2 : a6) {
                        arrayList.add(yym.m45034a(cadz2, bzzz2));
                    }
                }
                ArrayList<yhg> arrayList2 = new ArrayList();
                for (cadz cadz3 : arrayList) {
                    if (!znj.f55554d.mo31393a(cadz3, 17)) {
                        ((bnsl) znj.f55551a.mo68388c()).mo68420a("Failed to delete app session: %s", yym.m45040d(cadz3));
                    } else {
                        zpc.m45937a((zrc) znj.f55554d, cadz3);
                        if (cdzp.f182096a.mo6606a().mo78624b() && z) {
                            arrayList2.add(yfv.m44005a(TimeUnit.MILLISECONDS.toNanos(cadz3.f172779e), TimeUnit.MILLISECONDS.toNanos(cadz3.f172780f)));
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    bnrc c = bnrc.m110157c();
                    for (yhg yhg : arrayList2) {
                        c.mo67354a(yhh.m44104a(yhg));
                    }
                    bnre i4 = yhh.m44103a(c.mo68181a()).listIterator();
                    while (i4.hasNext()) {
                        yhg yhg2 = (yhg) i4.next();
                        yfv a7 = yfv.m44005a(yhg2.mo30385a() - TimeUnit.HOURS.toNanos(24), yhg2.mo30387b() + TimeUnit.HOURS.toNanos(24));
                        List<yhg> a8 = bnkn.m109668a((List) znj.f55555e.mo30456a(yhf.m44094b(a7), yhf.m44096c(a7)), zni.f55550a);
                        bnrc c2 = bnrc.m110157c();
                        c2.mo67354a(yhh.m44104a(yhg2));
                        for (yhg yhg3 : a8) {
                            c2.mo67355b(yhh.m44104a(yhg3));
                        }
                        arrayList3.addAll(yhh.m44103a(c2.mo68181a()));
                    }
                    if (!arrayList3.isEmpty()) {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            yhg yhg4 = (yhg) it.next();
                            znj.f55554d.mo31370a((Set) bnic.m109489a("com.google.location.sample"), yhg4.mo30385a(), yhg4.mo30387b(), true);
                        }
                    }
                }
            }
            status = znj.f55552b;
            ytp = this.f55540j;
            context = this.f55428a;
            str2 = this.f55429b;
            if (status != null) {
            }
            if (da.f164950c) {
            }
            bpgr bpgr322 = (bpgr) da.f164949b;
            bpgr322.f137528a |= 2;
            bpgr322.f137530c = i;
        } catch (IOException e) {
            status = new Status(5008);
            ytp = this.f55540j;
            context = this.f55428a;
            str2 = this.f55429b;
            int i5 = status.f30115i;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpgr bpgr4 = (bpgr) da.f164949b;
            bpgr4.f137528a |= 2;
            bpgr4.f137530c = i5;
        } catch (Throwable th) {
            ytp ytp2 = this.f55540j;
            Context context2 = this.f55428a;
            String str4 = this.f55429b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpgr bpgr5 = (bpgr) da.f164949b;
            bpgr5.f137528a |= 2;
            bpgr5.f137530c = 13;
            ytp2.mo30769a(context2, str4, (bpgr) da.mo74062i());
            throw th;
        }
        ytp.mo30769a(context, str2, (bpgr) da.mo74062i());
        zcl = dataDeleteRequest2.f32209h;
        if (zcl != null) {
        }
    }

    /* renamed from: a */
    public final void mo31268a(DataReadRequest dataReadRequest, String str) {
        DataReadRequest dataReadRequest2 = dataReadRequest;
        zax zax = dataReadRequest2.f32229o;
        bxvd da = bpgr.f137526x.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpgr bpgr = (bpgr) da.f164949b;
        str.getClass();
        bpgr.f137528a |= 1;
        bpgr.f137529b = str;
        bxvd da2 = bpgf.f137483c.mo74144da();
        HashSet<bzzv> hashSet = new HashSet();
        List list = dataReadRequest2.f32215a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(bzzk.m126356a(((DataType) list.get(i)).f32064a));
        }
        List list2 = dataReadRequest2.f32216b;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            hashSet.add(bzzk.m126356a(((DataSource) list2.get(i2)).f32005a.f32064a));
        }
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bpgf bpgf = (bpgf) da2.f164949b;
        if (!bpgf.f137485a.mo73666a()) {
            bpgf.f137485a = GeneratedMessageLite.m124019a(bpgf.f137485a);
        }
        for (bzzv bzzv : hashSet) {
            bpgf.f137485a.mo74153d(bzzv.f172235aH);
        }
        try {
            m45788h().mo741a(new znb(this, dataReadRequest, str, da, da2, zax), this.f55544o);
            ytp ytp = this.f55540j;
            Context context = this.f55428a;
            String str2 = this.f55429b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpgr bpgr2 = (bpgr) da.f164949b;
            bpgf bpgf2 = (bpgf) da2.mo74062i();
            bpgf2.getClass();
            bpgr2.f137537j = bpgf2;
            bpgr2.f137528a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            ytp.mo30769a(context, str2, (bpgr) da.mo74062i());
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f55533d.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Read data failed.");
            m45785a(zax, DataReadResult.m23714a(new Status(5008), dataReadRequest2.f32215a, dataReadRequest2.f32216b));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpgr bpgr3 = (bpgr) da.f164949b;
            bpgr3.f137528a |= 2;
            bpgr3.f137530c = 5008;
            ytp ytp2 = this.f55540j;
            Context context2 = this.f55428a;
            String str3 = this.f55429b;
            bpgf bpgf3 = (bpgf) da2.mo74062i();
            bpgf3.getClass();
            bpgr3.f137537j = bpgf3;
            bpgr3.f137528a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            ytp2.mo30769a(context2, str3, (bpgr) da.mo74062i());
        } catch (RejectedExecutionException e2) {
            bnsl bnsl2 = (bnsl) f55533d.mo68387b();
            bnsl2.mo68437a(e2);
            bnsl2.mo68420a("request rejected %s", dataReadRequest2);
            m45785a(zax, DataReadResult.m23714a(new Status(5008), dataReadRequest2.f32215a, dataReadRequest2.f32216b));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpgr bpgr4 = (bpgr) da.f164949b;
            bpgr4.f137528a |= 2;
            bpgr4.f137530c = 5008;
            ytp ytp3 = this.f55540j;
            Context context3 = this.f55428a;
            String str4 = this.f55429b;
            bpgf bpgf4 = (bpgf) da2.mo74062i();
            bpgf4.getClass();
            bpgr4.f137537j = bpgf4;
            bpgr4.f137528a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            ytp3.mo30769a(context3, str4, (bpgr) da.mo74062i());
        } catch (Throwable th) {
            ytp ytp4 = this.f55540j;
            Context context4 = this.f55428a;
            String str5 = this.f55429b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpgr bpgr5 = (bpgr) da.f164949b;
            bpgf bpgf5 = (bpgf) da2.mo74062i();
            bpgf5.getClass();
            bpgr5.f137537j = bpgf5;
            bpgr5.f137528a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            ytp4.mo30769a(context4, str5, (bpgr) da.mo74062i());
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo31269a(ReadRawRequest readRawRequest) {
        zcf zcf = readRawRequest.f32270b;
        try {
            m45788h().mo741a(new znc(this, readRawRequest, zcf), this.f55544o);
        } catch (IOException e) {
            bnsl bnsl = (bnsl) f55533d.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68405a("Error flushing sensors.");
            m45786a(zcf, new ReadRawResult(DataHolder.m22539b(5008)));
        } catch (RejectedExecutionException e2) {
            bnsl bnsl2 = (bnsl) f55533d.mo68387b();
            bnsl2.mo68437a(e2);
            bnsl2.mo68420a("request rejected %s", readRawRequest);
            m45786a(zcf, new ReadRawResult(DataHolder.m22539b(5008)));
        }
    }

    /* renamed from: a */
    public final void mo31270a(ReadStatsRequest readStatsRequest) {
        bqgg bqgg;
        zcg zcg = readStatsRequest.f32273c;
        try {
            bqgg = m45788h();
        } catch (IOException e) {
            ((bnsl) f55533d.mo68387b()).mo68405a("Failed to flush sensor events, stats may be stale");
            bqgg = bqga.m112775a(Status.f30107a);
        }
        try {
            bqgg.mo741a(new zmx(this, readStatsRequest, zcg), this.f55544o);
        } catch (RejectedExecutionException e2) {
            bnsl bnsl = (bnsl) f55533d.mo68387b();
            bnsl.mo68437a(e2);
            bnsl.mo68405a("Failed to handle read stats");
            zcg.mo30930a(DataStatsResult.m23718a(new Status(5008)));
        }
    }

    /* renamed from: a */
    public final void mo31235a(PrintWriter printWriter) {
        this.f55542m.mo31404a(printWriter);
    }
}
