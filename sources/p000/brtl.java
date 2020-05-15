package p000;

import java.nio.ByteBuffer;
import java.util.Comparator;

/* renamed from: brtl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brtl implements Comparator {

    /* renamed from: a */
    final /* synthetic */ ByteBuffer f143327a;

    /* renamed from: b */
    final /* synthetic */ brtm f143328b;

    public brtl(brtm brtm, ByteBuffer byteBuffer) {
        this.f143328b = brtm;
        this.f143327a = byteBuffer;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return this.f143328b.keysCompare((Integer) obj, (Integer) obj2, this.f143327a);
    }
}
