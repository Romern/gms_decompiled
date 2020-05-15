package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.internal.LoadRealtimeRequest;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: uds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uds extends ucg {

    /* renamed from: f */
    public static final sbw f47310f = new sbw("LoadRealtimeOperation", "");

    /* renamed from: g */
    public final ubn f47311g;

    /* renamed from: h */
    public final LoadRealtimeRequest f47312h;

    /* renamed from: i */
    public final vpu f47313i;

    /* renamed from: j */
    public final vkq f47314j;

    /* renamed from: k */
    private final int f47315k;

    /* renamed from: l */
    private final vhg f47316l;

    public uds(ubk ubk, ubn ubn, LoadRealtimeRequest loadRealtimeRequest, uto uto, int i) {
        super("LoadRealtimeOperation", ubk, uto);
        this.f47311g = ubn;
        this.f47312h = loadRealtimeRequest;
        this.f47315k = i;
        vpu vpu = ubk.f47142c;
        this.f47313i = vpu;
        vkq a = vkq.m40631a(vpu.f49755b, vpu);
        this.f47314j = a;
        this.f47316l = a.f49395c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* renamed from: a */
    private final void m38191a(vhb vhb, bknk bknk, vhe vhe) {
        String str;
        int i;
        vhb vhb2 = vhb;
        vhe vhe2 = vhe;
        bkpw bkpw = null;
        if (this.f47314j.f49397e.mo28439c(vhb2)) {
            vhe2.mo27246a(new Status(10, "This document is already opened. Documents may not be opened more than once.", null));
            return;
        }
        DataHolder dataHolder = this.f47312h.f30866d;
        if (dataHolder != null) {
            vke vke = new vke(dataHolder);
            try {
                if (vke.mo24660a() > 0) {
                    str = (String) vke.mo24661a(0);
                    vhg vhg = this.f47316l;
                    LoadRealtimeRequest loadRealtimeRequest = this.f47312h;
                    boolean z = !loadRealtimeRequest.f30864b || loadRealtimeRequest.f30865c;
                    i = this.f47315k;
                    if (i >= ((Integer) twy.f46859aq.mo58455c()).intValue()) {
                        vhe2.mo27246a(new Status(13, "Client version is no longer supported, update to a more recent version.", null));
                        return;
                    } else if (vhg.f49267g < ((Integer) twy.f46860ar.mo58455c()).intValue()) {
                        vhe2.mo27246a(new Status(13, "The installed version of Google Play Services is out of date and cannotopen this document. Update to a more recent version.", null));
                        return;
                    } else {
                        vhg.f49261a.mo25369a("Loading file %s", vhb2);
                        bkpl bkpl = new bkpl(vhg.f49262b);
                        uey uey = vhb2.f49251c;
                        bknd bknd = new bknd((String) twy.f46862at.mo58455c(), "android", Integer.toString(i), bknk, new vhf(vhe2), new bkpg(new vhh(Integer.MAX_VALUE, uey != null ? Integer.valueOf(uey.mo27262a(vhg.f49264d).f30212b) : null)), bkpl);
                        if (str == null && !z) {
                            vhs a = vhg.f49265e.mo28471a(vhb2, true);
                            if (a.mo28463a()) {
                                vhg.f49261a.mo25371b("Loading document from cache.");
                                try {
                                    bkmc a2 = bkmc.m106124a(bknd, a.mo28464b(), vhg.f49263c);
                                    String str2 = a.f49287a.f48226d;
                                    if (str2 != null) {
                                        vhg.f49261a.mo25368a("RealtimeLoader", "Attached Realtime document to Drive ID: %s", str2);
                                        a2.mo66106a(str2);
                                    }
                                    vhe2.mo27247a(a, a2, vhb2);
                                    return;
                                } catch (Exception e) {
                                    vhg.f49261a.mo25373b("RealtimeLoader", String.format("Unable to load %s from cache; trying network...", vhb2), e);
                                }
                            }
                            if (vhb2.f49249a == null) {
                                vhg.f49261a.mo25371b("Creating new empty offline document.");
                                try {
                                    bkpw = vhg.mo28454a(null);
                                } catch (bkqc e2) {
                                    vhg.f49261a.mo25378c("RealtimeLoader", "JSON error while parsing null json.", e2);
                                }
                                new vhn(a, vhg.f49266f, bkpw).mo6502a(vhg.f49264d);
                                vhe2.mo27247a(a, bkmc.m106124a(bknd, bklw.m106118a(bkpw), vhg.f49263c), vhb2);
                                return;
                            } else if (vhg.f49268h.mo28343a()) {
                                String str3 = vhb2.f49249a.f30728a;
                                bknd.mo66136a(str3, new vhd(vhg, a, bknd, str3, vhe, vhb));
                                return;
                            } else {
                                vhe2.mo27246a(new Status(7, "Realtime document is not available offline.", null));
                                return;
                            }
                        } else {
                            vhg.f49261a.mo25371b("Creating empty in-memory document.");
                            try {
                                vhe2.mo27247a(null, bkmc.m106124a(bknd, bklw.m106118a(vhg.mo28454a(str)), vhg.f49263c), vhb2);
                                return;
                            } catch (bkqc e3) {
                                vhe2.mo27246a(new Status(10, "The provided JSON string is not formatted correctly and cannot be parsed."));
                                return;
                            }
                        }
                    }
                } else {
                    vke.mo12460c();
                }
            } finally {
                vke.mo12460c();
            }
        }
        str = null;
        vhg vhg2 = this.f47316l;
        LoadRealtimeRequest loadRealtimeRequest2 = this.f47312h;
        if (!loadRealtimeRequest2.f30864b) {
        }
        i = this.f47315k;
        if (i >= ((Integer) twy.f46859aq.mo58455c()).intValue()) {
        }
    }

    /* renamed from: b */
    public final void mo27230b(Context context) {
        vhb vhb;
        uey b = mo27233b();
        vgx vgx = new vgx(context, b);
        LoadRealtimeRequest loadRealtimeRequest = this.f47312h;
        DriveId driveId = loadRealtimeRequest.f30863a;
        if (driveId != null) {
            vhb = new vhb(driveId, b);
        } else {
            String str = loadRealtimeRequest.f30867e;
            if (str != null) {
                vhb = new vhb(str, b);
            } else {
                throw new IllegalArgumentException("One of drive ID or local ID is required.");
            }
        }
        udq udq = new udq(this, vhb);
        DriveId driveId2 = this.f47312h.f30863a;
        if (driveId2 != null) {
            if (driveId2.f30728a != null) {
                m38191a(vhb, vgx, udq);
                return;
            } else if (m38192a(vgx, udq)) {
                return;
            }
        }
        LoadRealtimeRequest loadRealtimeRequest2 = this.f47312h;
        if (loadRealtimeRequest2.f30863a == null && loadRealtimeRequest2.f30867e != null) {
            m38191a(vhb, vgx, udq);
        } else if (!this.f47313i.f49748G.mo28343a()) {
            mo6503a(new Status(7, "getRealtimeDocument requires an active network connection.", null));
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            udr udr = new udr(this, countDownLatch);
            this.f47237a.f47151l.mo27809a(this.f47312h.f30863a, 0, udr);
            try {
                countDownLatch.await(10, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
            }
            this.f47237a.f47151l.mo27810a(this.f47312h.f30863a, udr);
            if (!m38192a(vgx, udq)) {
                mo6503a(new Status(7, "getRealtimeDocument requires an active network connection.", null));
            }
        }
    }

    /* renamed from: a */
    private final boolean m38192a(bknk bknk, vhe vhe) {
        DriveId g = this.f47237a.mo27088b(this.f47312h.f30863a).mo27610g();
        if (g.f30728a == null) {
            return false;
        }
        m38191a(new vhb(g, mo27233b()), bknk, vhe);
        return true;
    }

    /* renamed from: a */
    public final Set mo27229a() {
        return EnumSet.of(twt.f46774c, twt.f46772a, twt.f46773b);
    }
}
