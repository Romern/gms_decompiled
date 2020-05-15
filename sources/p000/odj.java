package p000;

import java.util.UUID;

/* renamed from: odj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class odj {
    /* renamed from: a */
    public static bpds m28480a(UUID uuid) {
        bxvd da = bpds.f136375d.mo74144da();
        long mostSignificantBits = uuid.getMostSignificantBits();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpds bpds = (bpds) da.f164949b;
        bpds.f136377a |= 1;
        bpds.f136378b = mostSignificantBits;
        long leastSignificantBits = uuid.getLeastSignificantBits();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpds bpds2 = (bpds) da.f164949b;
        bpds2.f136377a |= 2;
        bpds2.f136379c = leastSignificantBits;
        return (bpds) da.mo74062i();
    }
}
