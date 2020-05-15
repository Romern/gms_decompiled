package p000;

import android.content.SyncResult;
import java.util.Locale;

/* renamed from: vbc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vbc implements vcn {

    /* renamed from: a */
    private final uih f48909a;

    /* renamed from: b */
    private final vbn f48910b;

    /* renamed from: c */
    private final int f48911c;

    /* renamed from: d */
    private final vay f48912d;

    public vbc(uih uih, vbh vbh, vay vay, int i) {
        boolean z;
        sdo.m34959a(vbh);
        sdo.m34959a(vay);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        this.f48909a = uih;
        this.f48910b = new vbn(vbh);
        this.f48911c = i;
        this.f48912d = vay;
    }

    /* renamed from: a */
    public final void mo28162a(SyncResult syncResult) {
        String a = this.f48910b.mo28199a();
        vay vay = this.f48912d;
        uzy a2 = uzy.m39861a(vay.f48897a, a);
        sdo.m34959a(a2);
        vay.f48897a = a2;
    }

    /* renamed from: a */
    public final boolean mo28164a() {
        return true;
    }

    /* renamed from: b */
    public final String mo28165b() {
        return String.format(Locale.US, "SearchAlgorithm[%s]", this.f48912d);
    }

    public final String toString() {
        return String.format(Locale.US, "SearchAlgorithm[delegate=%s]", this.f48910b);
    }

    /* renamed from: a */
    public final void mo28163a(vbi vbi, vks vks, SyncResult syncResult) {
        if (!this.f48912d.f48897a.mo28148c()) {
            vbi.mo28197a(this.f48912d.f48897a, null, this.f48909a, this.f48911c, this.f48910b, vks);
        }
    }
}
