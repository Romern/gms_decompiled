package p000;

import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: cirs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cirs implements cisy {

    /* renamed from: a */
    final /* synthetic */ boolean f191291a;

    /* renamed from: b */
    final /* synthetic */ cirw f191292b;

    public cirs(cirw cirw, boolean z) {
        this.f191292b = cirw;
        this.f191291a = z;
    }

    /* renamed from: a */
    public final void mo86442a() {
        this.f191292b.f191299c.flip();
        cirw cirw = this.f191292b;
        long j = cirw.f191300d;
        if (j == -1 || j - cirw.f191301e >= ((long) cirw.f191299c.remaining())) {
            cirw cirw2 = this.f191292b;
            ByteBuffer byteBuffer = cirw2.f191299c;
            int i = 0;
            while (byteBuffer.hasRemaining()) {
                i += cirw2.f191303g.write(byteBuffer);
            }
            cirw2.f191304h.flush();
            cirw2.f191301e += (long) i;
            cirw cirw3 = this.f191292b;
            long j2 = cirw3.f191301e;
            long j3 = cirw3.f191300d;
            if (j2 < j3 || (j3 == -1 && !this.f191291a)) {
                cirw3.f191299c.clear();
                this.f191292b.f191297a.set(0);
                this.f191292b.mo86444a(new cirr(this));
            } else if (j3 == -1) {
                cirw3.mo86448c();
            } else if (j3 != j2) {
                cirw3.mo86445a(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(this.f191292b.f191301e), Long.valueOf(this.f191292b.f191300d))));
            } else {
                cirw3.mo86448c();
            }
        } else {
            cirw cirw4 = this.f191292b;
            Locale locale = Locale.getDefault();
            cirw cirw5 = this.f191292b;
            cirw4.mo86445a(new IllegalArgumentException(String.format(locale, "Read upload data length %d exceeds expected length %d", Long.valueOf(cirw5.f191301e + ((long) cirw5.f191299c.remaining())), Long.valueOf(this.f191292b.f191300d))));
        }
    }
}
