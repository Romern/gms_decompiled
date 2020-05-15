package p000;

import android.os.Build;
import java.nio.ByteBuffer;

/* renamed from: cirv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cirv implements cisy {

    /* renamed from: a */
    final /* synthetic */ boolean f191295a;

    /* renamed from: b */
    final /* synthetic */ cirw f191296b;

    public cirv(cirw cirw, boolean z) {
        this.f191296b = cirw;
        this.f191295a = z;
    }

    /* renamed from: a */
    public final void mo86442a() {
        cirw cirw = this.f191296b;
        cirw.f191300d = cirw.f191298b.getLength();
        cirw cirw2 = this.f191296b;
        long j = cirw2.f191300d;
        if (j != 0) {
            if (j <= 0 || j >= 8192) {
                cirw2.f191299c = ByteBuffer.allocateDirect(8192);
            } else {
                cirw2.f191299c = ByteBuffer.allocateDirect(((int) j) + 1);
            }
            cirw cirw3 = this.f191296b;
            long j2 = cirw3.f191300d;
            if (j2 > 0 && j2 <= 2147483647L) {
                cirw3.f191302f.setFixedLengthStreamingMode((int) j2);
            } else if (j2 > 2147483647L) {
                int i = Build.VERSION.SDK_INT;
                cirw3.f191302f.setFixedLengthStreamingMode(j2);
            } else {
                cirw3.f191302f.setChunkedStreamingMode(8192);
            }
            if (!this.f191295a) {
                this.f191296b.f191297a.set(1);
                cirw cirw4 = this.f191296b;
                cirw4.f191298b.rewind(cirw4);
                return;
            }
            this.f191296b.mo86443a();
            return;
        }
        cirw2.mo86448c();
    }
}
