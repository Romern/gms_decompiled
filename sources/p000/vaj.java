package p000;

import android.content.SyncResult;
import java.util.Date;
import java.util.Locale;

/* renamed from: vaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vaj implements vcn {

    /* renamed from: a */
    private final uih f48838a;

    /* renamed from: b */
    private final vbh f48839b;

    /* renamed from: c */
    private final int f48840c;

    /* renamed from: d */
    private vbn f48841d = null;

    /* renamed from: e */
    private vci f48842e = null;

    /* renamed from: f */
    private final uli f48843f;

    public vaj(uih uih, vbh vbh, uli uli, int i) {
        sdo.m34959a(vbh);
        sdo.m34959a(uli);
        sdo.m34974b(i >= 0);
        this.f48838a = uih;
        this.f48839b = vbh;
        this.f48840c = i;
        this.f48843f = uli;
    }

    /* renamed from: a */
    public final void mo28162a(SyncResult syncResult) {
        vbn vbn = this.f48841d;
        Long l = null;
        if (vbn != null) {
            String a = vbn.mo28199a();
            Date a2 = this.f48842e.mo28225a();
            if (a2 != null) {
                l = Long.valueOf(a2.getTime());
            }
            this.f48843f.mo27689a(a, l);
            this.f48843f.mo27725t();
            return;
        }
        this.f48839b.mo28194a(0);
        this.f48839b.mo28195a((String) null);
    }

    /* renamed from: a */
    public final boolean mo28164a() {
        return false;
    }

    /* renamed from: b */
    public final String mo28165b() {
        return String.format(Locale.US, "SyncMoreAlgorithm[%s]", this.f48843f.toString());
    }

    public final String toString() {
        return String.format(Locale.US, "SyncMoreAlgorithm[delegate=%s]", this.f48839b);
    }

    /* renamed from: a */
    public final void mo28163a(vbi vbi, vks vks, SyncResult syncResult) {
        if (!this.f48843f.mo27691c()) {
            this.f48842e = new vci(this.f48839b, this.f48843f.f48119b.longValue());
            this.f48841d = new vbn(this.f48842e);
            uli uli = this.f48843f;
            vbi.mo28197a(uli.f48118a, Long.valueOf(uli.f48366m), this.f48838a, this.f48840c, this.f48841d, vks);
        }
    }
}
