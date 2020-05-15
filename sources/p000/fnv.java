package p000;

import java.io.ByteArrayOutputStream;

/* renamed from: fnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fnv {

    /* renamed from: a */
    public int f16980a;

    /* renamed from: b */
    public final ByteArrayOutputStream f16981b = new ByteArrayOutputStream();

    /* renamed from: c */
    final /* synthetic */ fnw f16982c;

    public fnv(fnw fnw) {
        this.f16982c = fnw;
    }

    /* renamed from: a */
    public final byte[] mo11037a() {
        return this.f16981b.toByteArray();
    }
}
