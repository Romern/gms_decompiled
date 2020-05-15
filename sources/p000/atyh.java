package p000;

/* renamed from: atyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atyh {
    /* renamed from: a */
    public static bxyk m76556a(long j) {
        bxvd da = bxyk.f165095c.mo74144da();
        long j2 = j / 1000;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxyk bxyk = (bxyk) da.f164949b;
        bxyk.f165097a = j2;
        bxyk.f165098b = ((int) (j % 1000)) * 1000000;
        return (bxyk) da.mo74062i();
    }
}
