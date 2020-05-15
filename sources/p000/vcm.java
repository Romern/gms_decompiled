package p000;

import android.content.Context;
import android.content.SyncResult;
import com.felicanetworks.mfc.C0126R;
import java.util.Locale;

/* renamed from: vcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vcm implements vcn {

    /* renamed from: a */
    private final Context f49038a;

    /* renamed from: b */
    private final uhn f49039b;

    /* renamed from: c */
    private final int f49040c;

    /* renamed from: d */
    private final int f49041d;

    /* renamed from: e */
    private final boolean f49042e;

    /* renamed from: f */
    private final int f49043f;

    /* renamed from: g */
    private final uih f49044g;

    /* renamed from: h */
    private final long f49045h;

    /* renamed from: i */
    private final int f49046i;

    /* renamed from: j */
    private uli f49047j;

    /* renamed from: k */
    private uli f49048k;

    /* renamed from: l */
    private uli f49049l;

    /* renamed from: m */
    private int f49050m = 0;

    public vcm(vpu vpu, uih uih, int i, int i2, int i3, boolean z, int i4, long j) {
        sdo.m34959a(uih);
        this.f49044g = uih;
        this.f49038a = vpu.f49755b;
        uhn uhn = vpu.f49757d;
        this.f49039b = uhn;
        this.f49040c = i;
        this.f49041d = i2;
        this.f49046i = i3;
        this.f49042e = z;
        this.f49043f = i4;
        this.f49045h = j;
        m39987b(uhn, this.f49044g);
    }

    /* renamed from: a */
    public static vcl m39984a(uhn uhn, uih uih) {
        uli uli = null;
        uli uli2 = null;
        for (uli uli3 : uhn.mo27391a(uih, uzz.DRIVE)) {
            if (((uzw) uli3.mo27690b()).f48786a) {
                uli2 = uli3;
            } else {
                uli = uli3;
            }
        }
        return new vcl(uli, uli2);
    }

    /* renamed from: b */
    private final void m39986b(SyncResult syncResult) {
        SyncResult syncResult2 = syncResult;
        this.f49039b.mo27435d();
        try {
            uij b = this.f49039b.mo27418b(this.f49044g.f47682a);
            uhn uhn = this.f49039b;
            uih uih = this.f49044g;
            long j = b.f47686a;
            sdo.m34974b(j >= 0);
            sdo.m34959a(uih);
            String a = ujs.f47815a.f48341a.mo27700a();
            String a2 = ujn.APPDATA_ROOT_ENTRY_ID.f47806h.mo27700a();
            String b2 = ujo.f47807a.mo27735b();
            String a3 = ujn.APPDATA_ROOT_ENTRY_ID.f47806h.mo27700a();
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 42 + String.valueOf(a2).length() + String.valueOf(b2).length() + String.valueOf(a3).length());
            sb.append(a);
            sb.append(" NOT IN (SELECT ");
            sb.append(a2);
            sb.append(" FROM ");
            sb.append(b2);
            sb.append(" WHERE ");
            sb.append(a3);
            sb.append(" IS NOT NULL)");
            uog a4 = uoh.m39066a(voz.m40974b(uih.f47683b), ukm.PINNED.f48022aB.mo27717e(uml.UNPINNED.f48221d), voz.m40959a(), uoh.m39060a(sb.toString()), ukm.LAST_SYNC_SEQUENCE_NUMBER.f48022aB.mo27703a(j));
            int a5 = ((ugx) uhn).f47578a.mo27465a(ukn.f48023a, uoh.m39064a(String.format(Locale.US, "%s IN (SELECT %s FROM %s WHERE %s)", ukm.ENTRY_ID.f48022aB.mo27700a(), ukm.ENTRY_ID.f48022aB.mo27700a(), "EntryView", a4.f48389a), a4.f48390b));
            if (a5 > 0) {
                ujx d = this.f49039b.mo27433d(this.f49044g, this.f49038a.getString(C0126R.string.drive_view_my_drive));
                d.mo27606f();
                b.mo27512b(d.mo27642y());
                b.mo27725t();
            }
            if (syncResult2 != null) {
                syncResult2.stats.numDeletes += (long) a5;
            }
            this.f49039b.mo27442f();
        } finally {
            this.f49039b.mo27439e();
        }
    }

    /* renamed from: a */
    public final boolean mo28164a() {
        return true;
    }

    /* renamed from: a */
    private final void m39985a(vbi vbi, uli uli, SyncResult syncResult, int i, vks vks) {
        long j;
        vbh a = vbj.m39934a(syncResult);
        Long l = uli.f48119b;
        if (l != null) {
            j = l.longValue();
        } else {
            j = Long.MAX_VALUE;
        }
        vbs vbs = new vbs(uli, vbj.m39935a(a, j));
        int d = (int) (((long) i) - uli.mo27692d());
        if (d > 0 && !uli.mo27691c()) {
            vbi.mo28197a(uli.f48118a, Long.valueOf(uli.f48366m), this.f49044g, d, vbs, vks);
            this.f49050m++;
        }
    }

    /* renamed from: a */
    public final void mo28162a(SyncResult syncResult) {
        m39986b(syncResult);
    }

    /* renamed from: a */
    public final void mo28163a(vbi vbi, vks vks, SyncResult syncResult) {
        if (this.f49042e) {
            uhn uhn = this.f49039b;
            long j = this.f49044g.f47683b;
            sdo.m34974b(j >= 0);
            ((ugx) uhn).f47578a.mo27465a(ull.f48129a, ulk.ACCOUNT_ID.f48128g.mo27717e(j));
            m39987b(this.f49039b, this.f49044g);
        }
        m39985a(vbi, this.f49047j, syncResult, this.f49040c, vks);
        m39985a(vbi, this.f49048k, syncResult, this.f49041d, vks);
        if (((Boolean) twy.f46864av.mo58455c()).booleanValue()) {
            m39985a(vbi, this.f49049l, syncResult, this.f49046i, vks);
        }
        if ((this.f49047j.mo27692d() == 0 && this.f49048k.mo27692d() == 0) || this.f49042e) {
            this.f49039b.mo27435d();
            try {
                uij b = this.f49039b.mo27418b(this.f49044g.f47682a);
                b.mo27510a(((ugx) this.f49039b).mo27383c());
                b.f47692g = false;
                b.f47689d = this.f49045h;
                b.f47690e = (long) this.f49043f;
                b.mo27725t();
                this.f49039b.mo27442f();
            } finally {
                this.f49039b.mo27439e();
            }
        }
        if (this.f49050m == 0) {
            m39986b(null);
        }
    }

    /* renamed from: b */
    private final void m39987b(uhn uhn, uih uih) {
        vcl a = m39984a(uhn, uih);
        this.f49047j = a.f49036a;
        this.f49048k = a.f49037b;
        this.f49049l = uhn.mo27421b(uih);
        if (this.f49047j == null) {
            this.f49047j = uhn.mo27405a(uih, new uzw(false), Long.MAX_VALUE);
        }
        if (this.f49048k == null) {
            this.f49048k = uhn.mo27405a(uih, new uzw(true), Long.MAX_VALUE);
        }
        if (this.f49049l == null) {
            this.f49049l = this.f49039b.mo27405a(uih, new vaa(), Long.MAX_VALUE);
        }
    }

    /* renamed from: b */
    public final String mo28165b() {
        return String.format(Locale.US, "FullFeedSyncAlgorithm[%s,%d]", Integer.valueOf(this.f49043f), Long.valueOf(this.f49045h));
    }
}
