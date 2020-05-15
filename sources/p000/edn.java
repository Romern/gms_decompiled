package p000;

import android.accounts.Account;
import android.location.Location;
import android.os.Build;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
import com.google.android.gms.awareness.snapshot.internal.HeadphoneStateImpl;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.awareness.snapshot.internal.SnapshotRequest;
import com.google.android.gms.awareness.snapshot.internal.TimeIntervalsImpl;
import com.google.android.gms.awareness.snapshot.internal.WeatherImpl;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.ArrayList;

/* renamed from: edn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class edn extends drx {

    /* renamed from: c */
    public final ContextManagerClientInfo f14734c;

    /* renamed from: d */
    public final SnapshotRequest f14735d;

    /* renamed from: e */
    public final lri f14736e;

    /* renamed from: f */
    public tjc f14737f;

    /* renamed from: g */
    public Runnable f14738g;

    /* renamed from: h */
    public String f14739h;

    /* renamed from: i */
    public bxco f14740i = bxco.UNKNOWN_CONTEXT_NAME;

    /* renamed from: j */
    private final tmo f14741j;

    /* renamed from: k */
    private boolean f14742k = false;

    public edn(tmo tmo, ContextManagerClientInfo contextManagerClientInfo, SnapshotRequest snapshotRequest) {
        super("SnapshotOperation");
        Account account;
        this.f14741j = tmo;
        this.f14734c = contextManagerClientInfo;
        this.f14735d = snapshotRequest;
        String str = contextManagerClientInfo.f30678b;
        String str2 = contextManagerClientInfo.f30680d;
        int i = contextManagerClientInfo.f30679c;
        if (contextManagerClientInfo.mo18066a() == null || contextManagerClientInfo.mo18066a().mo9338b()) {
            account = null;
        } else {
            account = contextManagerClientInfo.mo18066a().mo9337a();
        }
        sdo.m34977c("SnapshotOperation");
        this.f14736e = new lri("SnapshotOperation", 0, str, str2, i, account);
    }

    /* renamed from: a */
    public final void mo9410a() {
        bxco bxco;
        ArrayList arrayList;
        if (this.f14734c.mo18067b()) {
            SnapshotRequest snapshotRequest = this.f14735d;
            int i = snapshotRequest.f11732c;
            if (i == 0) {
                bxco = tiq.m37051b(dqz.m9125a(snapshotRequest.f11730a));
            } else {
                bxco = tiq.m37051b(i);
            }
            this.f14740i = bxco;
            if (!egp.m10365a(bxco.f162973bD)) {
                mo10003a(7512, (Snapshot) null);
            } else if (!dql.m9090a(this.f14740i.f162973bD)) {
                mo10003a(7503, (Snapshot) null);
            } else {
                dom x = dwq.m9680x();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(this.f14740i.f162973bD));
                if (x.mo9353a(arrayList2, this.f14734c)) {
                    if (cdgp.f180782a.mo6606a().mo77552aQ()) {
                        new Object[1][0] = Integer.toString(this.f14740i.f162973bD);
                        eel p = dwq.m9672p();
                        tit tit = new tit();
                        tit.mo26579a(this.f14740i.f162973bD);
                        eej a = p.mo10038a((ContextDataFilterImpl) tit.mo26578a(), this.f14734c, dsw.m9261a(this.f14740i));
                        new Object[1][0] = Integer.toString(a.f14775a);
                        if (rjs.m33679e(a.f14775a) && (arrayList = a.f14776b) != null && !arrayList.isEmpty()) {
                            new Object[1][0] = Integer.valueOf(a.f14776b.size());
                            ArrayList arrayList3 = a.f14776b;
                            int size = arrayList3.size();
                            int i2 = 0;
                            while (i2 < size) {
                                int i3 = i2 + 1;
                                if (!mo10004a((ContextData) arrayList3.get(i2))) {
                                    i2 = i3;
                                } else {
                                    new Object[1][0] = Integer.toString(this.f14740i.f162973bD);
                                    return;
                                }
                            }
                        }
                        new Object[1][0] = Integer.toString(this.f14740i.f162973bD);
                    }
                    dwq.m9667k().mo9435a(new edd(this), dqy.m9123a("SnapshotOperation_connected"));
                    return;
                }
                mo10003a(7503, (Snapshot) null);
            }
        } else {
            mo10003a(7504, (Snapshot) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    public final void mo10005b(int i, Snapshot snapshot) {
        int i2;
        bxvd a;
        bxge bxge;
        bxvd da;
        DataHolder dataHolder;
        bxco bxco;
        dwq.m9667k().mo9511a();
        if (!this.f14742k) {
            this.f14742k = true;
            drn.m9164a(this.f14741j, i, snapshot);
            dpf G = dwq.m9650G();
            ContextManagerClientInfo contextManagerClientInfo = this.f14734c;
            SnapshotRequest snapshotRequest = this.f14735d;
            if (snapshot != null) {
                BeaconStateImpl beaconStateImpl = snapshot.f11720b;
                if (beaconStateImpl != null) {
                    ArrayList arrayList = beaconStateImpl.f11707a;
                    if (arrayList != null) {
                        i2 = arrayList.size();
                    }
                } else {
                    i2 = 1;
                }
                a = dpf.m9018a(contextManagerClientInfo, 5, i);
                if (snapshotRequest == null) {
                    int i3 = snapshotRequest.f11732c;
                    if (i3 == 0) {
                        bxco = tiq.m37051b(dqz.m9125a(snapshotRequest.f11730a));
                    } else {
                        bxco = tiq.m37051b(i3);
                    }
                    bxgd bxgd = (bxgd) bxge.f163238b.mo74144da();
                    bxgd.mo73574a(bxco);
                    bxge = (bxge) bxgd.mo74062i();
                } else {
                    bxge = null;
                }
                da = bxgj.f163259d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxgj bxgj = (bxgj) da.f164949b;
                int i4 = bxgj.f163261a | 2;
                bxgj.f163261a = i4;
                bxgj.f163263c = i2;
                if (bxge != null) {
                    bxge.getClass();
                    bxgj.f163262b = bxge;
                    bxgj.f163261a = i4 | 1;
                }
                if (a.f164950c) {
                    a.mo74035c();
                    a.f164950c = false;
                }
                bxgc bxgc = (bxgc) a.f164949b;
                bxgj bxgj2 = (bxgj) da.mo74062i();
                bxgc bxgc2 = bxgc.f163222o;
                bxgj2.getClass();
                bxgc.f163231h = bxgj2;
                bxgc.f163224a |= 64;
                G.mo9374a((bxgc) a.mo74062i());
                if (!(snapshot == null || (dataHolder = snapshot.f11724f) == null)) {
                    dataHolder.close();
                }
                if (this.f14738g != null) {
                    dwq.m9667k().mo9433a(this.f14738g);
                    this.f14738g = null;
                }
                if (this.f14739h != null) {
                    lrh.m19581e(dwq.m9662f(), this.f14736e).mo24743e(this.f14739h).mo50371a(new dqi("[SnapshotOperation] remove interest, key=%s", this.f14739h));
                    this.f14739h = null;
                }
                if (this.f14737f == null) {
                    lrh.m19579c(dwq.m9662f(), this.f14736e).mo24704a(this.f14737f).mo50371a(new dqi("[SnapshotOperation] unregister context listener", new Object[0]));
                    this.f14737f = null;
                    return;
                }
                return;
            }
            i2 = 0;
            a = dpf.m9018a(contextManagerClientInfo, 5, i);
            if (snapshotRequest == null) {
            }
            da = bxgj.f163259d.mo74144da();
            if (da.f164950c) {
            }
            bxgj bxgj3 = (bxgj) da.f164949b;
            int i42 = bxgj3.f163261a | 2;
            bxgj3.f163261a = i42;
            bxgj3.f163263c = i2;
            if (bxge != null) {
            }
            if (a.f164950c) {
            }
            bxgc bxgc3 = (bxgc) a.f164949b;
            bxgj bxgj22 = (bxgj) da.mo74062i();
            bxgc bxgc22 = bxgc.f163222o;
            bxgj22.getClass();
            bxgc3.f163231h = bxgj22;
            bxgc3.f163224a |= 64;
            G.mo9374a((bxgc) a.mo74062i());
            dataHolder.close();
            if (this.f14738g != null) {
            }
            if (this.f14739h != null) {
            }
            if (this.f14737f == null) {
            }
        }
    }

    /* renamed from: a */
    public final void mo10003a(int i, Snapshot snapshot) {
        if (!dwq.m9667k().mo9512b()) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("edn", "a", 275, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[SnapshotOperation] deliverSnapshotResult is not running on the EventHandler thread.");
            dwq.m9667k().mo9435a(new edg(this, i, snapshot), dqy.m9123a("SnapshotResultDelivery"));
            return;
        }
        mo10005b(i, snapshot);
    }

    /* renamed from: a */
    public final boolean mo10004a(ContextData contextData) {
        Snapshot snapshot;
        int a;
        int[] iArr;
        int[] iArr2;
        if (contextData.mo18019h() != this.f14740i) {
            return false;
        }
        if (this.f14735d.f11733d <= 0 || dwq.m9665i().mo20505a() - this.f14735d.f11733d <= contextData.mo18022j().mo18096c() + cdgp.f180782a.mo6606a().mo77534Z()) {
            bxco bxco = this.f14740i;
            lrx lrx = new lrx();
            lrx.mo15414a(contextData);
            bxco bxco2 = bxco.UNKNOWN_CONTEXT_NAME;
            int ordinal = bxco.ordinal();
            Location location = null;
            TimeIntervalsImpl timeIntervalsImpl = null;
            r7 = null;
            WeatherImpl weatherImpl = null;
            HeadphoneStateImpl headphoneStateImpl = null;
            r7 = null;
            ActivityRecognitionResult activityRecognitionResult = null;
            if (ordinal == 1) {
                bxnm bxnm = (bxnm) contextData.mo18009a(bxnm.f164051j);
                if (bxnm == null) {
                    bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                    bnsl.mo68432a("edc", "c", (int) BaseMfiEventCallback.TYPE_OPSRV_ACCOUNT_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("[ContextDataParser] Unable to get UserLocation proto.");
                } else {
                    tka j = contextData.mo18022j();
                    location = new Location("Snapshot");
                    location.setAccuracy(bxnm.f164059g);
                    location.setAltitude(bxnm.f164058f);
                    location.setLatitude(ayuo.m84847b(bxnm.f164054b));
                    location.setLongitude(ayuo.m84847b(bxnm.f164055c));
                    location.setSpeed(bxnm.f164056d);
                    if (j != null) {
                        location.setTime(j.mo18096c());
                        int i = Build.VERSION.SDK_INT;
                        sqv i2 = dwq.m9665i();
                        location.setElapsedRealtimeNanos((i2.mo20506b() + (j.mo18096c() - i2.mo20505a())) * 1000000);
                    }
                }
                if (!lrx.mo15415a(location)) {
                    lrx.f26660e = location;
                }
                snapshot = lrx.mo15413a();
            } else if (ordinal == 6) {
                bxkl bxkl = (bxkl) contextData.mo18009a(bxkl.f163760c);
                if (bxkl == null) {
                    bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                    bnsl2.mo68432a("edc", "a", 186, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("[ContextDataParser] Unable to get DetectedActivity proto.");
                } else if (bxkl.f163762a.size() > 0) {
                    sqv i3 = dwq.m9665i();
                    bxkj[] bxkjArr = (bxkj[]) bxkl.f163762a.toArray(new bxkj[0]);
                    ArrayList arrayList = new ArrayList();
                    for (bxkj bxkj : bxkjArr) {
                        bxki a2 = bxki.m122801a(bxkj.f163757b);
                        if (a2 == null) {
                            a2 = bxki.IN_VEHICLE;
                        }
                        arrayList.add(new DetectedActivity(a2.f163753x, bxkj.f163758c));
                    }
                    activityRecognitionResult = new ActivityRecognitionResult(arrayList, i3.mo20505a(), i3.mo20506b());
                }
                if (!lrx.mo15415a(activityRecognitionResult)) {
                    lrx.f26656a = activityRecognitionResult;
                }
                snapshot = lrx.mo15413a();
            } else if (ordinal == 24) {
                bxft bxft = (bxft) contextData.mo18009a(bxft.f163185i);
                if (bxft == null || (a = bxfm.m122661a(bxft.f163188b)) == 0 || a == 1) {
                    bnsl bnsl3 = (bnsl) dss.f13961a.mo68387b();
                    bnsl3.mo68432a("edc", "b", (int) BaseMfiEventCallback.TYPE_SERVER_GENERAL_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68420a("[ContextDataParser] Audio Proto: %s", bxft);
                } else {
                    int a3 = bxfm.m122661a(bxft.f163188b);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    headphoneStateImpl = new HeadphoneStateImpl(a3 - 1);
                }
                if (!lrx.mo15415a(headphoneStateImpl)) {
                    lrx.f26659d = headphoneStateImpl;
                }
                snapshot = lrx.mo15413a();
            } else if (ordinal == 31) {
                bxnp bxnp = (bxnp) contextData.mo18009a(bxnp.f164074d);
                if (bxnp == null || (bxnp.f164076a & 1) == 0) {
                    bnsl bnsl4 = (bnsl) dss.f13961a.mo68387b();
                    bnsl4.mo68432a("edc", "d", 226, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68405a("[ContextDataParser] Weather proto or current conditions is null");
                } else {
                    bxno bxno = bxnp.f164077b;
                    if (bxno == null) {
                        bxno = bxno.f164069c;
                    }
                    bxnt bxnt = bxno.f164072b;
                    if (bxnt == null) {
                        bxnt = bxnt.f164083f;
                    }
                    bxno bxno2 = bxnp.f164077b;
                    if (bxno2 == null) {
                        bxno2 = bxno.f164069c;
                    }
                    if ((bxno2.f164071a & 1) == 0) {
                        bnsl bnsl5 = (bnsl) dss.f13961a.mo68387b();
                        bnsl5.mo68432a("edc", "d", 231, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl5.mo68405a("[ContextDataParser] current state is null");
                    } else {
                        if (bxnt.f164089e.size() != 0) {
                            int size = bxnt.f164089e.size();
                            int[] iArr3 = new int[size];
                            for (int i4 = 0; i4 < size; i4++) {
                                int a4 = bxnr.m122904a(((bxns) bxnt.f164089e.get(i4)).f164081a);
                                if (a4 == 0) {
                                    a4 = 1;
                                }
                                iArr3[i4] = a4 - 1;
                            }
                            iArr = iArr3;
                        } else {
                            iArr = new int[]{0};
                        }
                        weatherImpl = new WeatherImpl(bxnt.f164085a, bxnt.f164086b, bxnt.f164087c, bxnt.f164088d, iArr);
                    }
                }
                if (!lrx.mo15415a(weatherImpl)) {
                    lrx.f26661f = weatherImpl;
                }
                snapshot = lrx.mo15413a();
            } else if (ordinal != 35) {
                new Object[1][0] = Integer.valueOf(bxco.f162973bD);
                snapshot = lrx.mo15413a();
            } else {
                bxkg bxkg = (bxkg) contextData.mo18009a(bxkg.f163725d);
                if (bxkg == null) {
                    bnsl bnsl6 = (bnsl) dss.f13961a.mo68387b();
                    bnsl6.mo68432a("edc", "e", 255, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl6.mo68405a("[ContextDataParser] TimeIntervals proto is null");
                } else {
                    if (bxkg.f163727a.size() != 0) {
                        int size2 = bxkg.f163727a.size();
                        iArr2 = new int[size2];
                        for (int i5 = 0; i5 < size2; i5++) {
                            iArr2[i5] = ((bxkf) bxkg.f163723b.mo14948a(Integer.valueOf(bxkg.f163727a.mo74151b(i5)))).f163722i;
                        }
                    } else {
                        iArr2 = new int[0];
                    }
                    timeIntervalsImpl = new TimeIntervalsImpl(iArr2);
                }
                if (!lrx.mo15415a(timeIntervalsImpl)) {
                    lrx.f26662g = timeIntervalsImpl;
                }
                snapshot = lrx.mo15413a();
            }
            mo10003a(0, snapshot);
            return true;
        }
        new Object[1][0] = contextData;
        return false;
    }
}
