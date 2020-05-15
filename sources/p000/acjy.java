package p000;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.icing.mdh.service.MobileDataHubChimeraService;
import com.google.android.gms.mdh.FootprintsRecordingSetting;
import com.google.android.gms.mdh.LatestFootprintFilter;
import com.google.android.gms.mdh.MdhBroadcastListenerKey;
import com.google.android.gms.mdh.MdhBroadcastListenerParams;
import com.google.android.gms.mdh.SyncPolicy;
import com.google.android.gms.mdh.SyncStatus;
import com.google.android.gms.mdh.TimeSeriesFootprintsReadFilter;
import com.google.android.gms.mdh.TimeSeriesFootprintsSubscriptionFilter;
import com.google.android.gms.mdh.internal.ByteArraySafeParcelable;
import com.google.android.gms.mdh.internal.MdhFootprintListSafeParcelable;
import java.util.List;
import java.util.Map;

/* renamed from: acjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acjy extends afnh implements aaai {

    /* renamed from: a */
    private final MobileDataHubChimeraService f60018a;

    /* renamed from: b */
    private final String f60019b;

    /* renamed from: c */
    private final aaag f60020c;

    public acjy(MobileDataHubChimeraService mobileDataHubChimeraService, String str, aaag aaag) {
        this.f60018a = mobileDataHubChimeraService;
        this.f60019b = str;
        this.f60020c = aaag;
    }

    /* renamed from: a */
    private final void m49275a(aaab aaab) {
        this.f60020c.mo16658a(aaab);
    }

    /* renamed from: b */
    public final void mo32814b(afmq afmq) {
        afmq.mo34967a(new Status(8, "Trivial Bigtable API is not supported."), (byte[]) null);
    }

    /* renamed from: c */
    public final void mo32816c(rnt rnt) {
        achw B = this.f60018a.f79068a.mo32754B();
        acdx t = this.f60018a.f79068a.mo32774t();
        acdx.m48972a(rnt, 1);
        Map map = (Map) t.f59614a.mo6445a();
        acdx.m48972a(map, 2);
        m49275a(new acji(B, new acdw(rnt, map), "ResetDataOp"));
    }

    /* renamed from: d */
    public final void mo32817d(rnt rnt) {
        rnt.mo11797a(new Status(8, "Trivial Bigtable API is not supported."));
    }

    /* renamed from: e */
    public final void mo32818e(rnt rnt) {
        rnt.mo11797a(new Status(8, "Trivial Bigtable API is not supported."));
    }

    /* renamed from: a */
    public final void mo32794a(afmq afmq) {
        achw B = this.f60018a.f79068a.mo32754B();
        acdr r = this.f60018a.f79068a.mo32772r();
        acdr.m48963a(afmq, 1);
        bqgg bqgg = (bqgg) r.f59604a.mo6445a();
        acdr.m48963a(bqgg, 2);
        m49275a(new acji(B, new acdq(afmq, bqgg), "GetChannelConfigListOp"));
    }

    /* renamed from: b */
    public final void mo32815b(rnt rnt) {
        achw B = this.f60018a.f79068a.mo32754B();
        acdv s = this.f60018a.f79068a.mo32773s();
        acdv.m48969a(rnt, 1);
        Map map = (Map) s.f59611a.mo6445a();
        acdv.m48969a(map, 2);
        m49275a(new acji(B, new acdu(rnt, map), "RefreshChannelConfigOp"));
    }

    /* renamed from: a */
    public final void mo32795a(afmx afmx, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter) {
        MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable;
        afmx afmx2 = afmx;
        try {
            String str = this.f60019b;
            acgw f = this.f60018a.f79068a.mo32760f();
            String str2 = this.f60019b;
            babr babr = (babr) f.f59820a.mo6445a();
            acgw.m49092a(babr, 1);
            baic baic = (baic) f.f59821b.mo6445a();
            acgw.m49092a(baic, 2);
            acgw.m49092a(str2, 3);
            acgw.m49092a(account, 4);
            acgw.m49092a(latestFootprintFilter, 7);
            acgw.m49092a(afmx2, 8);
            m49275a(new acjn(127, "ReadLatestFootprintAsyncOperationDelegate", str, new acgv(babr, baic, str2, account, i, i2, latestFootprintFilter, afmx), this.f60018a.f79068a));
        } catch (RuntimeException e) {
            acbq.m48833a().mo32707a("Unexpected RuntimeException in MDH.", e);
            Status status = new Status(8, "Unexpected RuntimeException in MDH.");
            if (this.f60018a.f79068a.mo32759e().mo32674F()) {
                mdhFootprintListSafeParcelable = new MdhFootprintListSafeParcelable(bngx.m109376e());
            } else {
                mdhFootprintListSafeParcelable = null;
            }
            afmx2.mo34968a(status, mdhFootprintListSafeParcelable);
        }
    }

    /* renamed from: a */
    public final void mo32796a(afmx afmx, Account account, int i, int i2, TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter) {
        afmx afmx2 = afmx;
        MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable = null;
        if (!acaw.m48788e()) {
            Status status = new Status(8, "Time Series Footprints API is disabled.");
            if (this.f60018a.f79068a.mo32759e().mo32674F()) {
                mdhFootprintListSafeParcelable = new MdhFootprintListSafeParcelable(bngx.m109376e());
            }
            afmx2.mo34968a(status, mdhFootprintListSafeParcelable);
            return;
        }
        try {
            String str = this.f60019b;
            achb j = this.f60018a.f79068a.mo32764j();
            String str2 = this.f60019b;
            babr babr = (babr) j.f59829a.mo6445a();
            achb.m49100a(babr, 1);
            cayo cayo = (cayo) j.f59830b.mo6445a();
            achb.m49100a(cayo, 2);
            bafu bafu = (bafu) j.f59831c.mo6445a();
            achb.m49100a(bafu, 3);
            baok baok = (baok) j.f59832d.mo6445a();
            achb.m49100a(baok, 4);
            achb.m49100a(str2, 5);
            achb.m49100a(account, 6);
            achb.m49100a(timeSeriesFootprintsReadFilter, 9);
            achb.m49100a(afmx2, 10);
            m49275a(new acjn(127, "ReadTimeSeriesFootprintsAsyncOperationDelegate", str, new acha(babr, cayo, bafu, baok, str2, account, i, i2, timeSeriesFootprintsReadFilter, afmx), this.f60018a.f79068a));
        } catch (RuntimeException e) {
            acbq.m48833a().mo32707a("Unexpected RuntimeException in MDH.", e);
            Status status2 = new Status(8, "Unexpected RuntimeException in MDH.");
            if (this.f60018a.f79068a.mo32759e().mo32674F()) {
                mdhFootprintListSafeParcelable = new MdhFootprintListSafeParcelable(bngx.m109376e());
            }
            afmx2.mo34968a(status2, mdhFootprintListSafeParcelable);
        }
    }

    /* renamed from: a */
    public final void mo32797a(afna afna, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter) {
        try {
            String str = this.f60019b;
            acgy h = this.f60018a.f79068a.mo32762h();
            String str2 = this.f60019b;
            baif baif = (baif) h.f59824a.mo6445a();
            acgy.m49096a(baif, 1);
            acgy.m49096a(str2, 2);
            acgy.m49096a(account, 3);
            acgy.m49096a(latestFootprintFilter, 6);
            acgy.m49096a(afna, 7);
            m49275a(new acjn(127, "ReadLatestFootprintWithSyncStatusAsyncOperationDelegate", str, new acgx(baif, str2, account, i, i2, latestFootprintFilter, afna), this.f60018a.f79068a));
        } catch (RuntimeException e) {
            acbq.m48833a().mo32707a("Unexpected RuntimeException in MDH.", e);
            afna.mo34969a(new Status(8, "Unexpected RuntimeException in MDH."), null);
        }
    }

    /* renamed from: a */
    public final void mo32798a(afna afna, Account account, int i, int i2, TimeSeriesFootprintsReadFilter timeSeriesFootprintsReadFilter) {
        try {
            String str = this.f60019b;
            achd l = this.f60018a.f79068a.mo32766l();
            String str2 = this.f60019b;
            baii baii = (baii) l.f59835a.mo6445a();
            achd.m49104a(baii, 1);
            achd.m49104a(str2, 2);
            achd.m49104a(account, 3);
            achd.m49104a(timeSeriesFootprintsReadFilter, 6);
            achd.m49104a(afna, 7);
            m49275a(new acjn(127, "ReadTimeSeriesFootprintsWithSyncStatusAsyncOperationDelegate", str, new achc(baii, str2, account, i, i2, timeSeriesFootprintsReadFilter, afna), this.f60018a.f79068a));
        } catch (RuntimeException e) {
            acbq.m48833a().mo32707a("Unexpected RuntimeException in MDH.", e);
            afna.mo34969a(new Status(8, "Unexpected RuntimeException in MDH."), null);
        }
    }

    /* renamed from: a */
    public final void mo32799a(afnb afnb, Account account, int i) {
        try {
            String str = this.f60019b;
            acgt m = this.f60018a.f79068a.mo32767m();
            String str2 = this.f60019b;
            baia baia = (baia) m.f59815a.mo6445a();
            acgt.m49088a(baia, 1);
            acgt.m49088a(str2, 2);
            acgt.m49088a(account, 3);
            acgt.m49088a(afnb, 5);
            m49275a(new acjn(127, "ReadFootprintsRecordingSettingAsyncOperationDelegate", str, new acgs(baia, str2, account, i, afnb), this.f60018a.f79068a));
        } catch (RuntimeException e) {
            acbq.m48833a().mo32707a("Unexpected RuntimeException in MDH.", e);
            afnb.mo34970a(new Status(8, "Unexpected RuntimeException in MDH."), (FootprintsRecordingSetting) null);
        }
    }

    /* renamed from: a */
    public final void mo32800a(afnc afnc, Account account, int i, int i2, ByteArraySafeParcelable byteArraySafeParcelable) {
        afnc afnc2 = afnc;
        if (acaw.m48788e()) {
            try {
                String str = this.f60019b;
                achr k = this.f60018a.f79068a.mo32765k();
                String str2 = this.f60019b;
                byte[] bArr = byteArraySafeParcelable.f80014a;
                cayo cayo = (cayo) k.f59868a.mo6445a();
                achr.m49133a(cayo, 1);
                bafu bafu = (bafu) k.f59869b.mo6445a();
                achr.m49133a(bafu, 2);
                achr.m49133a(str2, 3);
                achr.m49133a(account, 4);
                achr.m49133a(afnc2, 8);
                achr.m49133a((baqv) k.f59870c.mo6445a(), 9);
                m49275a(new acjn(127, "WriteTimeSeriesFootprintAsyncOperationDelegate", str, new achq(cayo, bafu, str2, account, i, i2, (byte[]) achr.m49133a(bArr, 7), afnc), this.f60018a.f79068a));
            } catch (RuntimeException e) {
                acbq.m48833a().mo32707a("Unexpected RuntimeException in MDH.", e);
                afnc2.mo34971a(new Status(8, "Unexpected RuntimeException in MDH."), -1);
            }
        } else {
            afnc2.mo34971a(new Status(8, "Time Series Footprints API is disabled."), -1);
        }
    }

    /* renamed from: a */
    public final void mo32801a(afnk afnk) {
        Status status = new Status(8, "Trivial Bigtable API is not supported.");
        Parcel bj = afnk.mo8529bj();
        dcl.m8165a(bj, status);
        bj.writeTypedList(null);
        afnk.mo8530c(1, bj);
    }

    /* renamed from: a */
    public final void mo32802a(rnt rnt) {
        achw B = this.f60018a.f79068a.mo32754B();
        acdz u = this.f60018a.f79068a.mo32775u();
        acdz.m48975a(rnt, 1);
        baam baam = (baam) u.f59617a.mo6445a();
        acdz.m48975a(baam, 2);
        m49275a(new acji(B, new acdy(rnt, baam), "ResetTestingOp"));
    }

    /* renamed from: a */
    public final void mo32803a(rnt rnt, Account account, int i, int i2, LatestFootprintFilter latestFootprintFilter, SyncStatus syncStatus) {
        achw B = this.f60018a.f79068a.mo32754B();
        acee x = this.f60018a.f79068a.mo32778x();
        acee.m48982a(rnt, 1);
        acee.m48982a(account, 2);
        acee.m48982a(latestFootprintFilter, 5);
        barb barb = (barb) x.f59631a.mo6445a();
        acee.m48982a(barb, 6);
        acee.m48982a(syncStatus, 7);
        bafj bafj = (bafj) x.f59632b.mo6445a();
        acee.m48982a(bafj, 8);
        m49275a(new acji(B, new aced(rnt, account, i, i2, latestFootprintFilter, barb, syncStatus, bafj), "WriteLatestOnlyChannelSyncStatusOperationDelegate"));
    }

    /* renamed from: a */
    public final void mo32804a(rnt rnt, Account account, int i, int i2, SyncPolicy syncPolicy, LatestFootprintFilter latestFootprintFilter) {
        try {
            m49275a(new acjn(127, "SubscribeToFootprintsChannelAsyncOperationDelegate", this.f60019b, this.f60018a.f79068a.mo32761g().mo32829a(this.f60019b, account, i, i2, syncPolicy, latestFootprintFilter, rnt), this.f60018a.f79068a));
        } catch (RuntimeException e) {
            acbq.m48833a().mo32707a("Unexpected RuntimeException in MDH.", e);
            rnt.mo11797a(new Status(8, "Unexpected RuntimeException in MDH."));
        }
    }

    /* renamed from: a */
    public final void mo32805a(rnt rnt, Account account, int i, int i2, SyncPolicy syncPolicy, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter) {
        rnt rnt2 = rnt;
        if (acaw.m48788e()) {
            try {
                String str = this.f60019b;
                ackv g = this.f60018a.f79068a.mo32761g();
                String str2 = this.f60019b;
                baok baok = (baok) g.f60051a.mo6445a();
                ackv.m49350a(baok, 1);
                ackv.m49350a(str2, 2);
                ackv.m49350a(account, 3);
                ackv.m49350a(syncPolicy, 6);
                ackv.m49350a(timeSeriesFootprintsSubscriptionFilter, 7);
                ackv.m49350a(rnt2, 8);
                m49275a(new acjn(127, "SubscribeToFootprintsChannelAsyncOperationDelegate", str, new acku(baok, str2, account, i, i2, syncPolicy, timeSeriesFootprintsSubscriptionFilter, rnt), this.f60018a.f79068a));
            } catch (RuntimeException e) {
                acbq.m48833a().mo32707a("Unexpected RuntimeException in MDH.", e);
                rnt2.mo11797a(new Status(8, "Unexpected RuntimeException in MDH."));
            }
        } else {
            rnt2.mo11797a(new Status(8, "Time Series Footprints API is disabled."));
        }
    }

    /* renamed from: a */
    public final void mo32806a(rnt rnt, Account account, int i, int i2, TimeSeriesFootprintsSubscriptionFilter timeSeriesFootprintsSubscriptionFilter, SyncStatus syncStatus) {
        achw B = this.f60018a.f79068a.mo32754B();
        acei w = this.f60018a.f79068a.mo32777w();
        acei.m48988a(rnt, 1);
        acei.m48988a(account, 2);
        acei.m48988a(timeSeriesFootprintsSubscriptionFilter, 5);
        barb barb = (barb) w.f59648a.mo6445a();
        acei.m48988a(barb, 6);
        acei.m48988a(syncStatus, 7);
        bafu bafu = (bafu) w.f59649b.mo6445a();
        acei.m48988a(bafu, 8);
        m49275a(new acji(B, new aceh(rnt, account, i, i2, timeSeriesFootprintsSubscriptionFilter, barb, syncStatus, bafu), "WriteTimeSeriesChannelSyncStatusOperationDelegate"));
    }

    /* renamed from: a */
    public final void mo32807a(rnt rnt, Account account, int i, int i2, MdhFootprintListSafeParcelable mdhFootprintListSafeParcelable) {
        achw B = this.f60018a.f79068a.mo32754B();
        aceg v = this.f60018a.f79068a.mo32776v();
        List list = mdhFootprintListSafeParcelable.f80015a;
        aceg.m48985a(rnt, 1);
        aceg.m48985a(account, 2);
        aceg.m48985a(list, 5);
        bafu bafu = (bafu) v.f59639a.mo6445a();
        aceg.m48985a(bafu, 6);
        m49275a(new acji(B, new acef(rnt, account, i, i2, list, bafu), "WriteTimeSeriesChannelOperationDelegate"));
    }

    /* renamed from: a */
    public final void mo32808a(rnt rnt, Account account, int i, int i2, byte[] bArr, ByteArraySafeParcelable byteArraySafeParcelable) {
        rnt rnt2 = rnt;
        try {
            String str = this.f60019b;
            achp i3 = this.f60018a.f79068a.mo32763i();
            String str2 = this.f60019b;
            byte[] bArr2 = byteArraySafeParcelable.f80014a;
            cayo cayo = (cayo) i3.f59864a.mo6445a();
            achp.m49129a(cayo, 1);
            bafj bafj = (bafj) i3.f59865b.mo6445a();
            achp.m49129a(bafj, 2);
            achp.m49129a(str2, 3);
            achp.m49129a(account, 4);
            achp.m49129a(rnt2, 9);
            m49275a(new acjn(127, "WriteLatestFootprintAsyncOperationDelegate", str, new acho(cayo, bafj, str2, account, i, i2, bArr, (byte[]) achp.m49129a(bArr2, 8), rnt), this.f60018a.f79068a));
        } catch (RuntimeException e) {
            acbq.m48833a().mo32707a("Unexpected RuntimeException in MDH.", e);
            rnt2.mo11797a(new Status(8, "Unexpected RuntimeException in MDH."));
        }
    }

    /* renamed from: a */
    public final void mo32809a(rnt rnt, Account account, List list, SyncPolicy syncPolicy) {
        afkp a = LatestFootprintFilter.m67177a();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a.mo34926a(String.valueOf(((Integer) list.get(i)).intValue()).getBytes(bmwy.f131158c), 1);
        }
        try {
            m49275a(new acjn(127, "SubscribeToFootprintsChannelAsyncOperationDelegate", this.f60019b, this.f60018a.f79068a.mo32761g().mo32829a(this.f60019b, account, 553, byip.f166588d.mo73900a(), syncPolicy, a.mo34925a(), rnt), this.f60018a.f79068a));
        } catch (RuntimeException e) {
            acbq.m48833a().mo32707a("Unexpected RuntimeException in MDH.", e);
            rnt.mo11797a(new Status(8, "Unexpected RuntimeException in MDH."));
        }
    }

    /* renamed from: a */
    public final void mo32810a(rnt rnt, MdhBroadcastListenerKey mdhBroadcastListenerKey) {
        if (!abzv.m48731a().contains(this.f60019b)) {
            try {
                String str = this.f60019b;
                acct n = this.f60018a.f79068a.mo32768n();
                m49275a(new acjn(127, "UnregisterBroadcastListenerAsyncOperationDelegate", str, new accs(n.f59591a, mdhBroadcastListenerKey, this.f60019b, rnt), this.f60018a.f79068a));
            } catch (azzp | RuntimeException e) {
                rnt.mo11797a(new Status(8, "Unexpected RuntimeException in MDH."));
                acbq.m48833a().mo32707a("Unexpected RuntimeException in MDH.", e);
            }
        } else {
            rnt.mo11797a(new Status(8, "BroadcastListeners API is disabled."));
        }
    }

    /* renamed from: a */
    public final void mo32811a(rnt rnt, MdhBroadcastListenerKey mdhBroadcastListenerKey, MdhBroadcastListenerParams mdhBroadcastListenerParams) {
        if (!abzv.m48731a().contains(this.f60019b)) {
            try {
                String str = this.f60019b;
                accr o = this.f60018a.f79068a.mo32769o();
                m49275a(new acjn(127, "RegisterBroadcastListenerAsyncOperationDelegate", str, new accq(o.f59586a, mdhBroadcastListenerKey, mdhBroadcastListenerParams, this.f60019b, rnt), this.f60018a.f79068a));
            } catch (azzp | RuntimeException e) {
                rnt.mo11797a(new Status(8, "Unexpected RuntimeException in MDH."));
                acbq.m48833a().mo32707a("Unexpected RuntimeException in MDH.", e);
            }
        } else {
            rnt.mo11797a(new Status(8, "BroadcastListeners API is disabled."));
        }
    }

    /* renamed from: a */
    public final void mo32812a(rnt rnt, String str) {
        achw B = this.f60018a.f79068a.mo32754B();
        acec p = this.f60018a.f79068a.mo32770p();
        acec.m48979a(rnt, 1);
        acec.m48979a(str, 2);
        acjf acjf = (acjf) p.f59622a.mo6445a();
        acec.m48979a(acjf, 3);
        m49275a(new acji(B, new aceb(rnt, str, acjf), "StartImmediateTaskOp"));
    }

    /* renamed from: a */
    public final void mo32813a(rnt rnt, byte[] bArr) {
        achw B = this.f60018a.f79068a.mo32754B();
        acdt q = this.f60018a.f79068a.mo32771q();
        acdt.m48966a(rnt, 1);
        baam baam = (baam) q.f59608a.mo6445a();
        acdt.m48966a(baam, 3);
        m49275a(new acji(B, new acds(rnt, (byte[]) acdt.m48966a(bArr, 2), baam), "InjectChannelConfigListOp"));
    }
}
