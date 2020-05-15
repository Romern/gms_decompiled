package p000;

import com.google.android.gms.icing.nativeindex.NativeIndex;

/* renamed from: apmi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apmi extends acpn {

    /* renamed from: a */
    final /* synthetic */ apmj f84725a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public apmi(apmj apmj, bqbd bqbd, acry acry) {
        super(bqbd, acry);
        this.f84725a = apmj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        boolean z;
        abzm b = this.f84725a.f84726a.mo32314b();
        synchronized (b.mo32525a()) {
            bnrd a = b.mo32544d().iterator();
            z = true;
            while (a.hasNext()) {
                acak acak = (acak) a.next();
                absr d = b.mo32543d(acak);
                if (d != null) {
                    if (!this.f84725a.f84726a.mo32313a(acak, this.f84725a.f84726a.f58077m.mo32506d(d.f58140e))) {
                        z = false;
                    }
                }
            }
        }
        return Boolean.valueOf(NativeIndex.nativeClearUsageReportData(this.f84725a.f84726a.f58078n.f79071b) & z);
    }
}
