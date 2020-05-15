package p000;

import java.util.UUID;

/* renamed from: ggj */
public final /* synthetic */ class ggj {
    /* renamed from: a */
    public static byte[] m13107a() {
        bxvd da = bsna.f146214c.mo74144da();
        UUID randomUUID = UUID.randomUUID();
        bxvd da2 = bsnb.f146218d.mo74144da();
        long mostSignificantBits = randomUUID.getMostSignificantBits();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bsnb bsnb = (bsnb) da2.f164949b;
        bsnb.f146220a |= 1;
        bsnb.f146221b = mostSignificantBits;
        long leastSignificantBits = randomUUID.getLeastSignificantBits();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bsnb bsnb2 = (bsnb) da2.f164949b;
        bsnb2.f146220a |= 2;
        bsnb2.f146222c = leastSignificantBits;
        bsnb bsnb3 = (bsnb) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsna bsna = (bsna) da.f164949b;
        bsnb3.getClass();
        bsna.f146217b = bsnb3;
        bsna.f146216a |= 1;
        return ((bsna) da.mo74062i()).serializeToBytes();
    }
}
