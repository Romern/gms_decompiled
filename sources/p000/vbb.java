package p000;

import android.content.SyncResult;
import java.util.Locale;

/* renamed from: vbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vbb {

    /* renamed from: a */
    public static final sbw f48903a = new sbw("PreparedSearch", "");

    /* renamed from: b */
    public final vpu f48904b;

    /* renamed from: c */
    public final uih f48905c;

    /* renamed from: d */
    public final vay f48906d;

    /* renamed from: e */
    public final vac f48907e;

    /* renamed from: f */
    public final SyncResult f48908f;

    public vbb(vpu vpu, uih uih, vay vay, vbh vbh, SyncResult syncResult) {
        this.f48904b = vpu;
        this.f48905c = uih;
        this.f48906d = vay;
        this.f48907e = new vac(vbh);
        this.f48908f = syncResult;
    }

    /* renamed from: a */
    public final vba mo28186a(boolean z) {
        return new vba(z, this.f48907e.mo28157a());
    }

    public final String toString() {
        return String.format(Locale.US, "PreparedSearch[%s]", this.f48905c.f47682a);
    }

    /* renamed from: a */
    public final synchronized void mo28187a(ubx ubx, int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        sdo.m34959a(ubx);
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4);
        sb.append("FTS ");
        sb.append(valueOf);
        new vaz(this, sb.toString(), i, ubx).start();
    }
}
