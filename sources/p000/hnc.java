package p000;

/* renamed from: hnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hnc {

    /* renamed from: a */
    public final hns f20056a = ((hns) hns.f20086a.mo33309a());

    private hnc() {
    }

    /* renamed from: a */
    public static hnc m14626a() {
        int i = spn.f44932a;
        return new hnc();
    }

    /* renamed from: a */
    public final void mo12623a(String str, boolean z) {
        hns hns = this.f20056a;
        hnl hnl = hns.f20088e;
        Boolean valueOf = Boolean.valueOf(z);
        sdo.m34959a(hnl);
        sdo.m34977c(str);
        synchronized (hns.f20090c) {
            hns.f20089b.mo12632a(new hnp(hnl, str, valueOf));
        }
    }
}
