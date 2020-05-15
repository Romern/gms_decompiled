package p000;

import java.nio.ByteBuffer;

/* renamed from: dli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dli implements Comparable {

    /* renamed from: a */
    private final int f13439a;

    /* renamed from: b */
    private final ByteBuffer f13440b;

    public dli(int i, ByteBuffer byteBuffer) {
        this.f13439a = i;
        this.f13440b = byteBuffer;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        dli dli = (dli) obj;
        return bneu.f131545b.mo67471a(this.f13439a, dli.f13439a).mo67473a(this.f13440b, dli.f13440b).mo67470a();
    }
}
