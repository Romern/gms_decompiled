package p000;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bevf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bevf {

    /* renamed from: a */
    public static final beur[] f112634a = {beur.UNKNOWN, beur.OFF_BODY};

    /* renamed from: b */
    private final beuy f112635b;

    public bevf(ByteBuffer byteBuffer, long j) {
        this.f112635b = new beuy(f112634a, byteBuffer, j);
    }

    /* renamed from: a */
    public final List mo61178a(bevi bevi) {
        int i = 0;
        for (int i2 = 0; i2 < this.f112635b.mo61171a(); i2++) {
            i += this.f112635b.mo61172a(i2, new float[]{bevi.f112647a, bevi.f112648b, bevi.f112649c, bevi.f112650d, bevi.f112651e, bevi.f112652f, bevi.f112653g, bevi.f112654h, bevi.f112655i, bevi.f112656j, bevi.f112657k, bevi.f112658l, bevi.f112659m, bevi.f112660n, bevi.f112661o, bevi.f112662p, bevi.f112663q, bevi.f112664r, bevi.f112665s, bevi.f112666t, bevi.f112667u, bevi.f112668v, bevi.f112669w, bevi.f112670x, bevi.f112671y, bevi.f112672z, bevi.f112638A, bevi.f112639B, bevi.f112640C, bevi.f112641D, bevi.f112642E, bevi.f112643F, bevi.f112644G, bevi.f112645H, bevi.f112646I}).mo61165a();
        }
        int round = Math.round(((float) i) / ((float) this.f112635b.mo61171a()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new beus(beur.OFF_BODY, round));
        return arrayList;
    }
}
