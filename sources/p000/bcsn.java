package p000;

import java.util.Arrays;

/* renamed from: bcsn */
final /* synthetic */ class bcsn implements bmxz {

    /* renamed from: a */
    private final bcsp f104809a;

    /* renamed from: b */
    private final bcsp f104810b;

    public bcsn(bcsp bcsp, bcsp bcsp2) {
        this.f104809a = bcsp;
        this.f104810b = bcsp2;
    }

    /* renamed from: a */
    public final boolean mo6527a(Object obj) {
        String str = (String) obj;
        return Arrays.equals((byte[]) this.f104809a.mo57325i().get(str), (byte[]) this.f104810b.mo57325i().get(str));
    }
}
