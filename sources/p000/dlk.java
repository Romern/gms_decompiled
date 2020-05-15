package p000;

import java.nio.ByteBuffer;

/* renamed from: dlk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dlk implements Comparable {

    /* renamed from: a */
    private final int f13443a;

    /* renamed from: b */
    private final ByteBuffer f13444b;

    public dlk(int i, ByteBuffer byteBuffer) {
        this.f13443a = i;
        this.f13444b = byteBuffer;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        dlk dlk = (dlk) obj;
        return bneu.f131545b.mo67471a(this.f13443a, dlk.f13443a).mo67473a(this.f13444b, dlk.f13444b).mo67470a();
    }
}
