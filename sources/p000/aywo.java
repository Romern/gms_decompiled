package p000;

/* renamed from: aywo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aywo {

    /* renamed from: a */
    public final bxvd f98634a;

    private aywo(bxvd bxvd) {
        boolean z;
        if (((bptu) bxvd.f164949b).f139183c != 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        this.f98634a = bxvd;
    }

    /* renamed from: a */
    public static aywo m84991a(int i) {
        bxvd da = bptu.f139179e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bptu bptu = (bptu) da.f164949b;
        bptu.f139181a |= 8;
        bptu.f139183c = i;
        return new aywo(da);
    }
}
