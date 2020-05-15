package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import android.util.Base64;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: ebk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ebk extends dyg {

    /* renamed from: l */
    public static final dxr f14596l = new dxr(new ebj(), "XGeoHeaderProducer", new int[]{52}, null);

    /* renamed from: b */
    protected byew f14597b;

    /* renamed from: k */
    protected byew f14598k;

    /* renamed from: m */
    protected bxvd f14599m;

    /* renamed from: n */
    private final dvx f14600n = dwq.m9674r();

    /* renamed from: o */
    private TelephonyManager f14601o;

    /* renamed from: p */
    private bnot f14602p;

    /* renamed from: q */
    private long f14603q;

    /* renamed from: r */
    private long f14604r;

    public ebk(Context context, doh doh, String str, dqb dqb) {
        super(context, doh, f14596l, str, dqb);
    }

    /* renamed from: a */
    protected static final int m10050a(CellInfo cellInfo) {
        if (cellInfo instanceof CellInfoCdma) {
            return ((CellInfoCdma) cellInfo).getCellSignalStrength().getDbm();
        }
        if (cellInfo instanceof CellInfoGsm) {
            return ((CellInfoGsm) cellInfo).getCellSignalStrength().getDbm();
        }
        if (cellInfo instanceof CellInfoLte) {
            return ((CellInfoLte) cellInfo).getCellSignalStrength().getDbm();
        }
        int i = Build.VERSION.SDK_INT;
        if (cellInfo instanceof CellInfoWcdma) {
            return ((CellInfoWcdma) cellInfo).getCellSignalStrength().getDbm();
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: k */
    protected static final byex m10058k() {
        byew byew = (byew) byex.f165964y.mo74144da();
        if (byew.f164950c) {
            byew.mo74035c();
            byew.f164950c = false;
        }
        byex byex = (byex) byew.f164949b;
        byex.f165967b = 1;
        int i = 1 | byex.f165966a;
        byex.f165966a = i;
        byex.f165968c = 12;
        byex.f165966a = i | 2;
        return (byex) byew.mo74062i();
    }

    /* renamed from: l */
    private final List m10059l() {
        TelephonyManager telephonyManager = this.f14601o;
        if (telephonyManager == null) {
            return null;
        }
        try {
            return telephonyManager.getAllCellInfo();
        } catch (SecurityException e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("ebk", "l", 605, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[XGeoHeaderProducer] ACCESS_COARSE_LOCATION not granted, can't read cellInfo from TelephonyManager");
            return null;
        }
    }

    /* renamed from: m */
    private static final byfk m10060m() {
        bxvd da = byfk.f166027j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byfk byfk = (byfk) da.f164949b;
        byfk.f166030b = 0;
        byfk.f166029a |= 1;
        return (byfk) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo9920b(int i) {
        return (this.f14603q & ((long) i)) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final IntentFilter mo9849c() {
        if (!mo9920b(80)) {
            return null;
        }
        if (this.f14601o == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("ebk", "c", 205, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[XGeoHeaderProducer] TelephonyManager not supported!");
            return null;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        return intentFilter;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo9921c(int i) {
        return (this.f14604r & ((long) i)) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo9862h() {
        tit tit = new tit();
        if (mo9920b(1)) {
            tit.mo26579a(1);
        }
        if (mo9920b(8)) {
            tit.mo26579a(48);
        }
        if (mo9920b(2)) {
            tit.mo26579a(18);
        }
        if (mo9920b(4)) {
            tit.mo26579a(6);
        }
        if (mo9920b(160)) {
            tit.mo26579a(17);
        }
        lrh.m19579c(this.f14388d, this.f14391g).mo24703a(tit.mo26578a(), this).mo50371a(new dqi("[%s] registerContextListener, account=%s", this.f14387c, this.f14389e));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo9863i() {
        lrh.m19579c(this.f14388d, this.f14391g).mo24704a((tjc) this).mo50371a(new dqi("[%s] unregisterContextListener, account=%s", this.f14387c, this.f14389e));
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo9922j() {
        if (this.f14597b == null || dwq.m9665i().mo20505a() - TimeUnit.MICROSECONDS.toMillis(((byex) this.f14597b.f164949b).f165969d) >= 300000) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final void m10057b(long j) {
        bxny bxny;
        bxvd da = bxny.f164115k.mo74144da();
        bngs j2 = bngx.m109377j();
        bxny bxny2 = (bxny) this.f14599m.f164949b;
        if (bxny2.f164120c || bxny2.f164121d || bxny2.f164122e || bxny2.f164127j) {
            String valueOf = String.valueOf(Base64.encodeToString(((byex) this.f14597b.mo74062i()).mo73642k(), 10));
            String str = valueOf.length() == 0 ? new String("w ") : "w ".concat(valueOf);
            if (str != null) {
                j2.mo67668c(str);
                boolean z = ((bxny) this.f14599m.f164949b).f164120c;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxny bxny3 = (bxny) da.f164949b;
                int i = bxny3.f164118a | 2;
                bxny3.f164118a = i;
                bxny3.f164120c = z;
                bxny bxny4 = (bxny) this.f14599m.f164949b;
                boolean z2 = bxny4.f164121d;
                int i2 = i | 4;
                bxny3.f164118a = i2;
                bxny3.f164121d = z2;
                boolean z3 = bxny4.f164122e;
                int i3 = i2 | 8;
                bxny3.f164118a = i3;
                bxny3.f164122e = z3;
                boolean z4 = bxny4.f164127j;
                bxny3.f164118a = i3 | 512;
                bxny3.f164127j = z4;
            }
        }
        if (!mo9922j() && dql.m9091a(this.f14388d)) {
            bxny bxny5 = (bxny) this.f14599m.f164949b;
            if (bxny5.f164123f || bxny5.f164125h || bxny5.f164124g || bxny5.f164126i) {
                String valueOf2 = String.valueOf(Base64.encodeToString(((byex) this.f14598k.mo74062i()).mo73642k(), 10));
                String str2 = valueOf2.length() == 0 ? new String("w ") : "w ".concat(valueOf2);
                if (str2 != null) {
                    j2.mo67668c(str2);
                    boolean z5 = ((bxny) this.f14599m.f164949b).f164123f;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bxny bxny6 = (bxny) da.f164949b;
                    int i4 = bxny6.f164118a | 32;
                    bxny6.f164118a = i4;
                    bxny6.f164123f = z5;
                    bxny bxny7 = (bxny) this.f14599m.f164949b;
                    boolean z6 = bxny7.f164125h;
                    int i5 = i4 | 128;
                    bxny6.f164118a = i5;
                    bxny6.f164125h = z6;
                    boolean z7 = bxny7.f164124g;
                    int i6 = i5 | 64;
                    bxny6.f164118a = i6;
                    bxny6.f164124g = z7;
                    boolean z8 = bxny7.f164126i;
                    bxny6.f164118a = i6 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    bxny6.f164126i = z8;
                }
            }
        }
        bngx a = j2.mo67664a();
        if (!a.isEmpty()) {
            String a2 = bmxr.m108544a(" ").mo66874a((Iterable) a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxny bxny8 = (bxny) da.f164949b;
            a2.getClass();
            bxny8.f164118a |= 1;
            bxny8.f164119b = a2;
            bxny = (bxny) da.mo74062i();
        } else {
            bxny = null;
        }
        if (bxny != null) {
            tip tip = new tip(3, 52, 2);
            tip.mo26574a(tka.m37117a(j));
            tip.mo26572a(bxny.f164116l, bxny);
            mo9856c(tip.mo26570a());
        }
    }

    /* renamed from: a */
    private final byfi m10051a(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            try {
                byfi byfi = (byfi) bxvk.m124016a(byfi.f166018g, Base64.decode(str, 11), bxus.m123744c());
                if (!(byfi == null || (byfi.f166020a & 1) == 0)) {
                    byel byel = byfi.f166021b;
                    if (byel == null) {
                        byel = byel.f165914c;
                    }
                    if (byel.f165916a != 0) {
                        byel byel2 = byfi.f166021b;
                        if (byel2 == null) {
                            byel2 = byel.f165914c;
                        }
                        if (byel2.f165917b != 0) {
                            bxvd da = byfi.f166018g.mo74144da();
                            byel byel3 = byfi.f166021b;
                            if (byel3 == null) {
                                byel3 = byel.f165914c;
                            }
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byfi byfi2 = (byfi) da.f164949b;
                            byel3.getClass();
                            byfi2.f166021b = byel3;
                            byfi2.f166020a |= 1;
                            byfi byfi3 = (byfi) da.mo74062i();
                            if (!str.equals(Base64.encodeToString(byfi3.mo73642k(), 11))) {
                                return null;
                            }
                            return byfi3;
                        }
                    }
                }
                return null;
            } catch (bxwf e) {
                return null;
            }
        } catch (IllegalArgumentException e2) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("ebk", "a", 484, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[XGeoHeaderProducer] Error decoding place.");
            return null;
        }
    }

    /* renamed from: a */
    protected static final byfm m10052a(CellInfo cellInfo, boolean z) {
        byfk byfk;
        int i = Build.VERSION.SDK_INT;
        if (cellInfo == null) {
            byfk = m10060m();
        } else {
            bxvd da = byfk.f166027j.mo74144da();
            if (cellInfo instanceof CellInfoCdma) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byfk byfk2 = (byfk) da.f164949b;
                byfk2.f166030b = 3;
                byfk2.f166029a |= 1;
                CellIdentityCdma cellIdentity = ((CellInfoCdma) cellInfo).getCellIdentity();
                int basestationId = cellIdentity.getBasestationId();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byfk byfk3 = (byfk) da.f164949b;
                byfk3.f166029a |= 2;
                byfk3.f166031c = basestationId;
                int networkId = cellIdentity.getNetworkId();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byfk byfk4 = (byfk) da.f164949b;
                byfk4.f166029a |= 4;
                byfk4.f166032d = networkId;
                int systemId = cellIdentity.getSystemId();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byfk byfk5 = (byfk) da.f164949b;
                byfk5.f166029a |= 16;
                byfk5.f166034f = systemId;
            } else if (cellInfo instanceof CellInfoGsm) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byfk byfk6 = (byfk) da.f164949b;
                byfk6.f166030b = 1;
                byfk6.f166029a |= 1;
                CellIdentityGsm cellIdentity2 = ((CellInfoGsm) cellInfo).getCellIdentity();
                int cid = cellIdentity2.getCid();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byfk byfk7 = (byfk) da.f164949b;
                byfk7.f166029a |= 2;
                byfk7.f166031c = cid;
                int lac = cellIdentity2.getLac();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byfk byfk8 = (byfk) da.f164949b;
                byfk8.f166029a |= 4;
                byfk8.f166032d = lac;
                int mcc = cellIdentity2.getMcc();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byfk byfk9 = (byfk) da.f164949b;
                byfk9.f166029a |= 8;
                byfk9.f166033e = mcc;
                int mnc = cellIdentity2.getMnc();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byfk byfk10 = (byfk) da.f164949b;
                byfk10.f166029a |= 16;
                byfk10.f166034f = mnc;
            } else if (cellInfo instanceof CellInfoLte) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byfk byfk11 = (byfk) da.f164949b;
                byfk11.f166030b = 2;
                byfk11.f166029a |= 1;
                CellIdentityLte cellIdentity3 = ((CellInfoLte) cellInfo).getCellIdentity();
                int ci = cellIdentity3.getCi();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byfk byfk12 = (byfk) da.f164949b;
                byfk12.f166029a |= 2;
                byfk12.f166031c = ci;
                int mcc2 = cellIdentity3.getMcc();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byfk byfk13 = (byfk) da.f164949b;
                byfk13.f166029a |= 8;
                byfk13.f166033e = mcc2;
                int mnc2 = cellIdentity3.getMnc();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byfk byfk14 = (byfk) da.f164949b;
                byfk14.f166029a |= 16;
                byfk14.f166034f = mnc2;
                int pci = cellIdentity3.getPci();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byfk byfk15 = (byfk) da.f164949b;
                byfk15.f166029a |= 64;
                byfk15.f166036h = pci;
                int tac = cellIdentity3.getTac();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byfk byfk16 = (byfk) da.f164949b;
                byfk16.f166029a |= 128;
                byfk16.f166037i = tac;
            } else {
                int i2 = Build.VERSION.SDK_INT;
                if (cellInfo instanceof CellInfoWcdma) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byfk byfk17 = (byfk) da.f164949b;
                    byfk17.f166030b = 4;
                    byfk17.f166029a |= 1;
                    CellIdentityWcdma cellIdentity4 = ((CellInfoWcdma) cellInfo).getCellIdentity();
                    int cid2 = cellIdentity4.getCid();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byfk byfk18 = (byfk) da.f164949b;
                    byfk18.f166029a |= 2;
                    byfk18.f166031c = cid2;
                    int lac2 = cellIdentity4.getLac();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byfk byfk19 = (byfk) da.f164949b;
                    byfk19.f166029a |= 4;
                    byfk19.f166032d = lac2;
                    int mcc3 = cellIdentity4.getMcc();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byfk byfk20 = (byfk) da.f164949b;
                    byfk20.f166029a |= 8;
                    byfk20.f166033e = mcc3;
                    int mnc3 = cellIdentity4.getMnc();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byfk byfk21 = (byfk) da.f164949b;
                    byfk21.f166029a |= 16;
                    byfk21.f166034f = mnc3;
                    int psc = cellIdentity4.getPsc();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byfk byfk22 = (byfk) da.f164949b;
                    byfk22.f166029a |= 32;
                    byfk22.f166035g = psc;
                } else {
                    byfk = m10060m();
                }
            }
            byfk = (byfk) da.mo74062i();
        }
        bxvd da2 = byfm.f166043f.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byfm byfm = (byfm) da2.f164949b;
        byfk.getClass();
        byfm.f166047c = byfk;
        byfm.f166046b = 2;
        if (z) {
            byfm.f166045a |= 4;
            byfm.f166048d = true;
        }
        return (byfm) da2.mo74062i();
    }

    /* renamed from: b */
    public final void mo9848b() {
        bnot bnot = this.f14602p;
        if (bnot != null && !bnot.mo67314m()) {
            this.f14600n.mo9733b(this.f14602p.mo67317p());
            this.f14602p.mo67270d();
        }
        this.f14602p = null;
        this.f14601o = null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ebk.a(boolean, bxnw):boolean
     arg types: [int, bxnw]
     candidates:
      ebk.a(android.telephony.CellInfo, boolean):byfm
      ebk.a(bxnx, boolean):byfm
      ebk.a(dwa, bxco):dwa
      ebk.a(android.content.Context, android.content.Intent):void
      ebk.a(dwa, dwa):void
      dyg.a(android.content.Context, android.content.Intent):void
      dyd.a(com.google.android.gms.contextmanager.internal.WriteBatchImpl, lri):void
      dyd.a(dwa, dwa):void
      ebk.a(boolean, bxnw):boolean */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0140 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x012e  */
    /* renamed from: b */
    public final void mo9500b(ContextData contextData) {
        String str;
        int g;
        boolean z;
        bxmo bxmo;
        byfi byfi;
        bxvd bxvd;
        ContextData contextData2 = contextData;
        if (contextData2 != null && (((g = contextData.mo18018g()) == 1 && mo9920b(1)) || ((g == 48 && mo9920b(8)) || ((g == 18 && mo9920b(2)) || ((g == 6 && mo9920b(4)) || (g == 17 && mo9920b(160))))))) {
            int g2 = contextData.mo18018g();
            if (g2 == 1) {
                bxnm bxnm = (bxnm) contextData2.mo18009a(bxnm.f164051j);
                long c = contextData.mo18022j().mo18096c();
                if (bxnm != null) {
                    if (c != 0) {
                        byew byew = this.f14597b;
                        long micros = TimeUnit.MILLISECONDS.toMicros(c);
                        if (byew.f164950c) {
                            byew.mo74035c();
                            byew.f164950c = false;
                        }
                        byex byex = (byex) byew.f164949b;
                        byex byex2 = byex.f165964y;
                        byex.f165966a |= 4;
                        byex.f165969d = micros;
                    }
                    bxvd da = byen.f165925d.mo74144da();
                    int i = bxnm.f164054b;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byen byen = (byen) da.f164949b;
                    int i2 = byen.f165927a | 1;
                    byen.f165927a = i2;
                    byen.f165928b = i;
                    int i3 = bxnm.f164055c;
                    byen.f165927a = i2 | 2;
                    byen.f165929c = i3;
                    byen byen2 = (byen) da.mo74062i();
                    byew byew2 = this.f14597b;
                    if (byew2.f164950c) {
                        byew2.mo74035c();
                        byew2.f164950c = false;
                    }
                    byex byex3 = (byex) byew2.f164949b;
                    byex byex4 = byex.f165964y;
                    byen2.getClass();
                    byex3.f165971f = byen2;
                    byex3.f165966a |= 16;
                    float f = bxnm.f164059g;
                    if (f != 0.0f) {
                        byew byew3 = this.f14597b;
                        float f2 = f * 1000.0f;
                        if (byew3.f164950c) {
                            byew3.mo74035c();
                            byew3.f164950c = false;
                        }
                        byex byex5 = (byex) byew3.f164949b;
                        byex5.f165966a |= 128;
                        byex5.f165974i = f2;
                    }
                    float f3 = bxnm.f164057e;
                    if ((f3 > 0.0f && f3 < 360.0f) || bxnm.f164056d != 0.0f) {
                        byev byev = ((byex) this.f14597b.f164949b).f165984s;
                        if (byev == null) {
                            byev = byev.f165940w;
                        }
                        bxvd bxvd2 = (bxvd) byev.mo74142c(5);
                        bxvd2.mo73625a((bxvk) byev);
                        byep byep = (byep) bxvd2;
                        int round = Math.round(bxnm.f164057e);
                        if (byep.f164950c) {
                            byep.mo74035c();
                            byep.f164950c = false;
                        }
                        byev byev2 = (byev) byep.f164949b;
                        byev2.f165942a |= 2;
                        byev2.f165944c = round;
                        int round2 = Math.round(bxnm.f164056d * 3.6f);
                        if (byep.f164950c) {
                            byep.mo74035c();
                            byep.f164950c = false;
                        }
                        byev byev3 = (byev) byep.f164949b;
                        byev3.f165942a |= 8;
                        byev3.f165946e = round2;
                        byev byev4 = (byev) byep.mo74062i();
                        byew byew4 = this.f14597b;
                        if (byew4.f164950c) {
                            byew4.mo74035c();
                            byew4.f164950c = false;
                        }
                        byex byex6 = (byex) byew4.f164949b;
                        byev4.getClass();
                        byex6.f165984s = byev4;
                        byex6.f165966a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                    }
                    bxvd bxvd3 = this.f14599m;
                    if (bxvd3.f164950c) {
                        bxvd3.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    bxny bxny = (bxny) bxvd3.f164949b;
                    bxny bxny2 = bxny.f164115k;
                    bxny.f164118a |= 2;
                    bxny.f164120c = true;
                } else {
                    return;
                }
            } else if (g2 == 6) {
                bxkl bxkl = (bxkl) contextData2.mo18009a(bxkl.f163760c);
                if (bxkl != null && bxkl.f163762a.size() != 0) {
                    bxwc bxwc = bxkl.f163762a;
                    int size = bxwc.size();
                    int i4 = 1001;
                    int i5 = 0;
                    for (int i6 = 0; i6 < size; i6++) {
                        bxkj bxkj = (bxkj) bxwc.get(i6);
                        if (bxkj.f163758c > i5) {
                            bxki a = bxki.m122801a(bxkj.f163757b);
                            if (a == null) {
                                a = bxki.IN_VEHICLE;
                            }
                            i4 = byej.m124707a(a.f163753x);
                            if (i4 != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            Object[] objArr = new Object[1];
                            bxki a2 = bxki.m122801a(bxkj.f163757b);
                            if (a2 == null) {
                                a2 = bxki.IN_VEHICLE;
                            }
                            objArr[0] = a2;
                            sdo.m34972a(z, "no matching location.unified.ActivityRecord.Type for personalization.context.detected_activity.ActivityRecord.Type: %s", objArr);
                            i5 = bxkj.f163758c;
                        }
                    }
                    bxvd da2 = byek.f165909d.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    byek byek = (byek) da2.f164949b;
                    int i7 = i4 - 1001;
                    if (i4 != 0) {
                        byek.f165912b = i7;
                        int i8 = byek.f165911a | 1;
                        byek.f165911a = i8;
                        byek.f165911a = i8 | 2;
                        byek.f165913c = i5;
                        byek byek2 = (byek) da2.mo74062i();
                        byev byev5 = ((byex) this.f14597b.f164949b).f165984s;
                        if (byev5 == null) {
                            byev5 = byev.f165940w;
                        }
                        bxvd bxvd4 = (bxvd) byev5.mo74142c(5);
                        bxvd4.mo73625a((bxvk) byev5);
                        byep byep2 = (byep) bxvd4;
                        if (byep2.f164950c) {
                            byep2.mo74035c();
                            byep2.f164950c = false;
                        }
                        ((byev) byep2.f164949b).f165953l = bxvk.m124030de();
                        byep2.mo74348a(byek2);
                        byev byev6 = (byev) byep2.mo74062i();
                        byew byew5 = this.f14597b;
                        if (byew5.f164950c) {
                            byew5.mo74035c();
                            byew5.f164950c = false;
                        }
                        byex byex7 = (byex) byew5.f164949b;
                        byex byex8 = byex.f165964y;
                        byev6.getClass();
                        byex7.f165984s = byev6;
                        byex7.f165966a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                        bxvd bxvd5 = this.f14599m;
                        if (bxvd5.f164950c) {
                            bxvd5.mo74035c();
                            bxvd5.f164950c = false;
                        }
                        bxny bxny3 = (bxny) bxvd5.f164949b;
                        bxny bxny4 = bxny.f164115k;
                        bxny3.f164118a |= 8;
                        bxny3.f164122e = true;
                    } else {
                        throw null;
                    }
                } else {
                    return;
                }
            } else if (g2 == 48) {
                bxnn bxnn = (bxnn) contextData2.mo18009a(bxnn.f164062g);
                if (bxnn != null) {
                    byev byev7 = ((byex) this.f14597b.f164949b).f165984s;
                    if (byev7 == null) {
                        byev7 = byev.f165940w;
                    }
                    bxvd bxvd6 = (bxvd) byev7.mo74142c(5);
                    bxvd6.mo73625a((bxvk) byev7);
                    byep byep3 = (byep) bxvd6;
                    int degrees = (int) Math.toDegrees(bxnn.f164066c);
                    if (byep3.f164950c) {
                        byep3.mo74035c();
                        byep3.f164950c = false;
                    }
                    byev byev8 = (byev) byep3.f164949b;
                    byev8.f165942a |= 2;
                    byev8.f165944c = degrees;
                    int round3 = (int) Math.round(bxnn.f164065b * 3.5999999046325684d);
                    if (byep3.f164950c) {
                        byep3.mo74035c();
                        byep3.f164950c = false;
                    }
                    byev byev9 = (byev) byep3.f164949b;
                    byev9.f165942a |= 8;
                    byev9.f165946e = round3;
                    if ((bxnn.f164064a & 4) != 0) {
                        int round4 = (int) Math.round(bxnn.f164067d * 3.5999999046325684d);
                        if (byep3.f164950c) {
                            byep3.mo74035c();
                            byep3.f164950c = false;
                        }
                        byev byev10 = (byev) byep3.f164949b;
                        byev10.f165942a |= 16;
                        byev10.f165947f = round4;
                    }
                    if ((bxnn.f164064a & 8) != 0) {
                        int degrees2 = (int) Math.toDegrees(bxnn.f164068e);
                        if (byep3.f164950c) {
                            byep3.mo74035c();
                            byep3.f164950c = false;
                        }
                        byev byev11 = (byev) byep3.f164949b;
                        byev11.f165942a |= 4;
                        byev11.f165945d = degrees2;
                    }
                    byew byew6 = this.f14597b;
                    if (byew6.f164950c) {
                        byew6.mo74035c();
                        byew6.f164950c = false;
                    }
                    byex byex9 = (byex) byew6.f164949b;
                    byev byev12 = (byev) byep3.mo74062i();
                    byex byex10 = byex.f165964y;
                    byev12.getClass();
                    byex9.f165984s = byev12;
                    byex9.f165966a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                    bxvd bxvd7 = this.f14599m;
                    if (bxvd7.f164950c) {
                        bxvd7.mo74035c();
                        bxvd7.f164950c = false;
                    }
                    bxny bxny5 = (bxny) bxvd7.f164949b;
                    bxny bxny6 = bxny.f164115k;
                    bxny5.f164118a |= 512;
                    bxny5.f164127j = true;
                } else {
                    return;
                }
            } else if (g2 != 17) {
                if (g2 == 18 && (bxmo = (bxmo) contextData2.mo18009a(bxmo.f163966c)) != null && bxmo.f163968a.size() != 0) {
                    bxwc bxwc2 = bxmo.f163968a;
                    int size2 = bxwc2.size();
                    double d = 0.0d;
                    bxvd bxvd8 = null;
                    for (int i9 = 0; i9 < size2; i9++) {
                        bxmm bxmm = (bxmm) bxwc2.get(i9);
                        String str2 = bxmm.f163951d;
                        if (str2 != null && !str2.isEmpty()) {
                            try {
                                try {
                                    byfi byfi2 = (byfi) bxvk.m124016a(byfi.f166018g, Base64.decode(str2, 11), bxus.m123744c());
                                    if (!(byfi2 == null || (byfi2.f166020a & 1) == 0)) {
                                        byel byel = byfi2.f166021b;
                                        if (byel == null) {
                                            byel = byel.f165914c;
                                        }
                                        if (byel.f165916a != 0) {
                                            byel byel2 = byfi2.f166021b;
                                            if (byel2 == null) {
                                                byel2 = byel.f165914c;
                                            }
                                            if (byel2.f165917b != 0) {
                                                bxvd da3 = byfi.f166018g.mo74144da();
                                                byel byel3 = byfi2.f166021b;
                                                if (byel3 == null) {
                                                    byel3 = byel.f165914c;
                                                }
                                                if (da3.f164950c) {
                                                    da3.mo74035c();
                                                    da3.f164950c = false;
                                                }
                                                byfi byfi3 = (byfi) da3.f164949b;
                                                byel3.getClass();
                                                byfi3.f166021b = byel3;
                                                byfi3.f166020a |= 1;
                                                byfi = (byfi) da3.mo74062i();
                                                if (!str2.equals(Base64.encodeToString(byfi.mo73642k(), 11))) {
                                                    byfi = null;
                                                }
                                                bxvd = (bxvd) byfi.mo74142c(5);
                                                bxvd.mo73625a((bxvk) byfi);
                                                if (bxvd != null) {
                                                    double d2 = bxmm.f163949b;
                                                    double d3 = d2 > d ? d2 : d;
                                                    if (d2 > d) {
                                                        bxvd8 = bxvd;
                                                    }
                                                    d = d3;
                                                }
                                            }
                                        }
                                        byfi = null;
                                        bxvd = (bxvd) byfi.mo74142c(5);
                                        bxvd.mo73625a((bxvk) byfi);
                                        if (bxvd != null) {
                                        }
                                    }
                                } catch (bxwf e) {
                                    byfi = null;
                                }
                            } catch (IllegalArgumentException e2) {
                                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                                bnsl.mo68432a("ebk", "a", 484, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl.mo68405a("[XGeoHeaderProducer] Error decoding place.");
                                byfi = null;
                            }
                        }
                        byfi = null;
                        bxvd = (bxvd) byfi.mo74142c(5);
                        bxvd.mo73625a((bxvk) byfi);
                        if (bxvd != null) {
                        }
                    }
                    if (bxvd8 != null) {
                        float f4 = (float) d;
                        if (bxvd8.f164950c) {
                            bxvd8.mo74035c();
                            bxvd8.f164950c = false;
                        }
                        byfi byfi4 = (byfi) bxvd8.f164949b;
                        byfi byfi5 = byfi.f166018g;
                        byfi4.f166020a |= 2;
                        byfi4.f166023d = f4;
                        byew byew7 = this.f14597b;
                        if (byew7.f164950c) {
                            byew7.mo74035c();
                            byew7.f164950c = false;
                        }
                        byex byex11 = byex.f165964y;
                        ((byex) byew7.f164949b).f165987v = bxvk.m124030de();
                        if (byew7.f164950c) {
                            byew7.mo74035c();
                            byew7.f164950c = false;
                        }
                        byex byex12 = (byex) byew7.f164949b;
                        byfi byfi6 = (byfi) bxvd8.mo74062i();
                        byfi6.getClass();
                        byex12.mo74371c();
                        byex12.f165987v.add(byfi6);
                        bxvd bxvd9 = this.f14599m;
                        if (bxvd9.f164950c) {
                            bxvd9.mo74035c();
                            bxvd9.f164950c = false;
                        }
                        bxny bxny7 = (bxny) bxvd9.f164949b;
                        bxny bxny8 = bxny.f164115k;
                        bxny7.f164118a |= 4;
                        bxny7.f164121d = true;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (!m10056a(true, (bxnw) contextData2.mo18009a(bxnw.f164102c))) {
                return;
            }
            if (aeri.m52438c(this.f14388d) != 0) {
                m10057b(contextData.mo18022j().mo18096c());
                return;
            }
            return;
        }
        bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
        bnsl2.mo68432a("ebk", "b", 314, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        if (contextData2 != null) {
            str = Integer.toString(contextData.mo18018g());
        } else {
            str = "null";
        }
        bnsl2.mo68420a("[XGeoHeaderProducer] Received unexpected context %s", str);
    }

    /* renamed from: a */
    private static final byfm m10053a(bxnx bxnx, boolean z) {
        bxvd da = byfl.f166038d.mo74144da();
        if ((bxnx.f164107a & 1) != 0) {
            String str = bxnx.f164108b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byfl byfl = (byfl) da.f164949b;
            str.getClass();
            byfl.f166040a |= 1;
            byfl.f166041b = str;
        }
        int i = bxnx.f164112f;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byfl byfl2 = (byfl) da.f164949b;
        byfl2.f166040a |= 2;
        byfl2.f166042c = i;
        bxvd da2 = byfm.f166043f.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        byfm byfm = (byfm) da2.f164949b;
        byfl byfl3 = (byfl) da.mo74062i();
        byfl3.getClass();
        byfm.f166047c = byfl3;
        byfm.f166046b = 1;
        if (z) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            byfm byfm2 = (byfm) da2.f164949b;
            byfm2.f166045a |= 4;
            byfm2.f166048d = true;
        }
        return (byfm) da2.mo74062i();
    }

    /* renamed from: a */
    private static final dwa m10054a(dwa dwa, bxco bxco) {
        dvz dvz = dwa.f14242b;
        String str = dvz.f14240c.f13690b;
        String a = dvz.mo9738a();
        dvz dvz2 = dwa.f14242b;
        ContextManagerClientInfo contextManagerClientInfo = new ContextManagerClientInfo(str, a, dvz2.f14239b, dvz2.mo9739b(), 0, -1, -1);
        String c = dwa.f14242b.mo9740c();
        int i = bxco.f162973bD;
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 36);
        sb.append(c);
        sb.append("_XGeoHeader_Interest_Key_");
        sb.append(i);
        dvy dvy = new dvy(sb.toString(), bxco, dwa.mo9750e(), contextManagerClientInfo);
        dwk g = dwa.mo9753g();
        if (g != null) {
            if (bxco == bxco.DETECTED_ACTIVITY) {
                dvy.mo9737a(dwk.m9635a(g.mo9781b()));
            } else {
                dvy.mo9737a(g);
            }
        }
        return dvy.mo9734a();
    }

    /* renamed from: a */
    private final void m10055a(dvz dvz) {
        this.f14600n.mo9733b(this.f14602p.mo67361a(dvz));
        this.f14602p.mo67362b(dvz);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ebk.a(bxnx, boolean):byfm
     arg types: [bxnx, int]
     candidates:
      ebk.a(android.telephony.CellInfo, boolean):byfm
      ebk.a(dwa, bxco):dwa
      ebk.a(boolean, bxnw):boolean
      ebk.a(android.content.Context, android.content.Intent):void
      ebk.a(dwa, dwa):void
      dyg.a(android.content.Context, android.content.Intent):void
      dyd.a(com.google.android.gms.contextmanager.internal.WriteBatchImpl, lri):void
      dyd.a(dwa, dwa):void
      ebk.a(bxnx, boolean):byfm */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ebk.a(android.telephony.CellInfo, boolean):byfm
     arg types: [android.telephony.CellInfo, int]
     candidates:
      ebk.a(bxnx, boolean):byfm
      ebk.a(dwa, bxco):dwa
      ebk.a(boolean, bxnw):boolean
      ebk.a(android.content.Context, android.content.Intent):void
      ebk.a(dwa, dwa):void
      dyg.a(android.content.Context, android.content.Intent):void
      dyd.a(com.google.android.gms.contextmanager.internal.WriteBatchImpl, lri):void
      dyd.a(dwa, dwa):void
      ebk.a(android.telephony.CellInfo, boolean):byfm */
    /* renamed from: a */
    private final boolean m10056a(boolean z, bxnw bxnw) {
        List<CellInfo> list;
        ArrayList arrayList;
        boolean z2;
        boolean z3;
        int a;
        boolean z4;
        boolean z5;
        bxnw bxnw2 = bxnw;
        if (z && bxnw2 == null) {
            return false;
        }
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            if (bxnw2.f164104a.size() != 0) {
                arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                boolean b = mo9920b(128);
                bxwc bxwc = bxnw2.f164104a;
                int size = bxwc.size();
                bxnx bxnx = null;
                for (int i = 0; i < size; i++) {
                    bxnx bxnx2 = (bxnx) bxwc.get(i);
                    if ((bxnx2.f164107a & 1) != 0) {
                        if (bxnx2.f164114h) {
                            arrayList3.add(bxnx2);
                        } else if (b && (bxnx == null || bxnx.f164112f < bxnx2.f164112f)) {
                            bxnx = bxnx2;
                        }
                    }
                }
                bxvd bxvd = this.f14599m;
                if (!mo9920b(32) || arrayList3.size() != 1) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bxny bxny = (bxny) bxvd.f164949b;
                bxny bxny2 = bxny.f164115k;
                bxny.f164118a |= 64;
                bxny.f164124g = z4;
                if (((bxny) this.f14599m.f164949b).f164124g) {
                    arrayList2.add(m10053a((bxnx) arrayList3.remove(0), true));
                }
                if (b) {
                    int size2 = arrayList3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        bxnx bxnx3 = (bxnx) arrayList3.get(i2);
                        if (bxnx == null || bxnx.f164112f < bxnx3.f164112f) {
                            bxnx = bxnx3;
                        }
                    }
                }
                bxvd bxvd2 = this.f14599m;
                if (bxnx != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bxny bxny3 = (bxny) bxvd2.f164949b;
                bxny3.f164118a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                bxny3.f164126i = z5;
                if (((bxny) this.f14599m.f164949b).f164126i) {
                    arrayList2.add(m10053a(bxnx, false));
                }
                if (arrayList2.isEmpty()) {
                    arrayList2 = null;
                }
            } else {
                arrayList2 = null;
            }
            if (arrayList2 == null) {
                return false;
            }
        } else {
            for (byfm byfm : Collections.unmodifiableList(((byex) this.f14598k.f164949b).f165988w)) {
                if (byfm.f166046b == 1) {
                    arrayList2.add(byfm);
                }
            }
        }
        TelephonyManager telephonyManager = this.f14601o;
        if (telephonyManager != null) {
            try {
                list = telephonyManager.getAllCellInfo();
            } catch (SecurityException e) {
                bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                bnsl.mo68432a("ebk", "l", 605, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("[XGeoHeaderProducer] ACCESS_COARSE_LOCATION not granted, can't read cellInfo from TelephonyManager");
                list = null;
            }
            if (!sqw.m36041a((Collection) list)) {
                arrayList = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                boolean b2 = mo9920b(64);
                int i3 = Integer.MIN_VALUE;
                CellInfo cellInfo = null;
                for (CellInfo cellInfo2 : list) {
                    if (!(cellInfo2 instanceof CellInfoCdma) && !(cellInfo2 instanceof CellInfoGsm) && !(cellInfo2 instanceof CellInfoLte)) {
                        int i4 = Build.VERSION.SDK_INT;
                        if (!(cellInfo2 instanceof CellInfoWcdma)) {
                        }
                    }
                    if (cellInfo2.isRegistered()) {
                        arrayList4.add(cellInfo2);
                    } else if (b2 && (a = m10050a(cellInfo2)) > i3) {
                        cellInfo = cellInfo2;
                        i3 = a;
                    }
                }
                bxvd bxvd3 = this.f14599m;
                if (!mo9920b(16) || arrayList4.isEmpty()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                bxny bxny4 = (bxny) bxvd3.f164949b;
                bxny bxny5 = bxny.f164115k;
                bxny4.f164118a = 32 | bxny4.f164118a;
                bxny4.f164123f = z2;
                if (((bxny) this.f14599m.f164949b).f164123f) {
                    arrayList.add(m10052a((CellInfo) arrayList4.remove(0), true));
                }
                if (b2) {
                    int size3 = arrayList4.size();
                    int i5 = 0;
                    while (i5 < size3) {
                        CellInfo cellInfo3 = (CellInfo) arrayList4.get(i5);
                        int a2 = m10050a(cellInfo3);
                        int i6 = a2 > i3 ? a2 : i3;
                        if (a2 > i3) {
                            cellInfo = cellInfo3;
                        }
                        i5++;
                        i3 = i6;
                    }
                }
                bxvd bxvd4 = this.f14599m;
                if (cellInfo != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bxvd4.f164950c) {
                    bxvd4.mo74035c();
                    bxvd4.f164950c = false;
                }
                bxny bxny6 = (bxny) bxvd4.f164949b;
                bxny6.f164118a |= 128;
                bxny6.f164125h = z3;
                if (((bxny) this.f14599m.f164949b).f164125h) {
                    arrayList.add(m10052a(cellInfo, false));
                }
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
            } else if (!z) {
                return false;
            }
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        byew byew = this.f14598k;
        if (byew.f164950c) {
            byew.mo74035c();
            byew.f164950c = false;
        }
        byex byex = byex.f165964y;
        ((byex) byew.f164949b).f165988w = bxvk.m124030de();
        if (byew.f164950c) {
            byew.mo74035c();
            byew.f164950c = false;
        }
        byex byex2 = (byex) byew.f164949b;
        byex2.mo74372e();
        bxsy.m123078a(arrayList2, byex2.f165988w);
        if (!dql.m9091a(this.f14388d) || mo9922j()) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ebk.a(boolean, bxnw):boolean
     arg types: [int, ?[OBJECT, ARRAY]]
     candidates:
      ebk.a(android.telephony.CellInfo, boolean):byfm
      ebk.a(bxnx, boolean):byfm
      ebk.a(dwa, bxco):dwa
      ebk.a(android.content.Context, android.content.Intent):void
      ebk.a(dwa, dwa):void
      dyg.a(android.content.Context, android.content.Intent):void
      dyd.a(com.google.android.gms.contextmanager.internal.WriteBatchImpl, lri):void
      dyd.a(dwa, dwa):void
      ebk.a(boolean, bxnw):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ebk.a(boolean, bxnw):boolean
     arg types: [int, bxnw]
     candidates:
      ebk.a(android.telephony.CellInfo, boolean):byfm
      ebk.a(bxnx, boolean):byfm
      ebk.a(dwa, bxco):dwa
      ebk.a(android.content.Context, android.content.Intent):void
      ebk.a(dwa, dwa):void
      dyg.a(android.content.Context, android.content.Intent):void
      dyd.a(com.google.android.gms.contextmanager.internal.WriteBatchImpl, lri):void
      dyd.a(dwa, dwa):void
      ebk.a(boolean, bxnw):boolean */
    /* renamed from: a */
    public final void mo9845a() {
        this.f14603q = cdip.f180954a.mo6606a().mo77652a();
        int i = Build.VERSION.SDK_INT;
        this.f14604r = this.f14603q & cdip.f180954a.mo6606a().mo77653b();
        this.f14599m = bxny.f164115k.mo74144da();
        if (mo9920b(15)) {
            byex k = m10058k();
            bxvd bxvd = (bxvd) k.mo74142c(5);
            bxvd.mo73625a((bxvk) k);
            this.f14597b = (byew) bxvd;
        }
        if (mo9921c(15)) {
            this.f14602p = bnge.m109299s();
        }
        if (mo9920b(240)) {
            byex k2 = m10058k();
            bxvd bxvd2 = (bxvd) k2.mo74142c(5);
            bxvd2.mo73625a((bxvk) k2);
            this.f14598k = (byew) bxvd2;
            if (mo9920b(80)) {
                this.f14601o = (TelephonyManager) this.f14388d.getSystemService("phone");
                m10056a(false, (bxnw) null);
            }
            if (mo9920b(160)) {
                tit tit = new tit();
                tit.mo26579a(17);
                tit.mo26582b(1);
                eej a = dwq.m9672p().mo10038a((ContextDataFilterImpl) tit.mo26578a(), dwq.m9652a(this.f14389e, "XGeoHeaderProducer"), Long.MAX_VALUE);
                if (rjs.m33679e(a.f14775a)) {
                    ArrayList arrayList = a.f14776b;
                    if (!sqw.m36041a((Collection) arrayList)) {
                        m10056a(true, (bxnw) ((ContextData) arrayList.get(0)).mo18009a(bxnw.f164102c));
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ebk.a(boolean, bxnw):boolean
     arg types: [int, ?[OBJECT, ARRAY]]
     candidates:
      ebk.a(android.telephony.CellInfo, boolean):byfm
      ebk.a(bxnx, boolean):byfm
      ebk.a(dwa, bxco):dwa
      ebk.a(android.content.Context, android.content.Intent):void
      ebk.a(dwa, dwa):void
      dyg.a(android.content.Context, android.content.Intent):void
      dyd.a(com.google.android.gms.contextmanager.internal.WriteBatchImpl, lri):void
      dyd.a(dwa, dwa):void
      ebk.a(boolean, bxnw):boolean */
    /* renamed from: a */
    public final void mo9847a(Context context, Intent intent) {
        String action = intent.getAction();
        String valueOf = String.valueOf(action);
        if (valueOf.length() == 0) {
            new String("Received intent: ");
        } else {
            "Received intent: ".concat(valueOf);
        }
        if (action.equals("android.net.conn.CONNECTIVITY_CHANGE") && m10056a(false, (bxnw) null)) {
            m10057b(dwq.m9665i().mo20505a());
        }
    }

    /* renamed from: a */
    public final void mo9854a(dwa dwa) {
        if (this.f14602p != null) {
            m10055a(dwa.f14242b);
        }
    }

    /* renamed from: a */
    public final void mo9855a(dwa dwa, dwa dwa2) {
        if (this.f14602p != null) {
            if (dwa2 != null) {
                m10055a(dwa2.f14242b);
            }
            if (dwa.mo9753g() != null && dwa.mo9753g().mo9780a() == 3) {
                if (mo9921c(1)) {
                    dwa a = m10054a(dwa, bxco.USER_LOCATION);
                    this.f14602p.mo67268a(dwa.f14242b, a);
                    this.f14600n.mo9724a(a);
                }
                if (mo9921c(2)) {
                    dwa a2 = m10054a(dwa, bxco.PLACES);
                    this.f14602p.mo67268a(dwa.f14242b, a2);
                    this.f14600n.mo9724a(a2);
                }
                if (mo9921c(4)) {
                    dwa a3 = m10054a(dwa, bxco.DETECTED_ACTIVITY);
                    this.f14602p.mo67268a(dwa.f14242b, a3);
                    this.f14600n.mo9724a(a3);
                }
            }
        }
    }
}
