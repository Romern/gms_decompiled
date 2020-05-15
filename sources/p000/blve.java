package p000;

import java.util.Arrays;

/* renamed from: blve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class blve implements Runnable {

    /* renamed from: a */
    final /* synthetic */ byte[] f127846a;

    /* renamed from: b */
    final /* synthetic */ blvg f127847b;

    public blve(blvg blvg, byte[] bArr) {
        this.f127847b = blvg;
        this.f127846a = bArr;
    }

    public final void run() {
        int i = blvt.f127895c;
        new Object[1][0] = Arrays.toString(this.f127846a);
        blum blum = this.f127847b.f127851c;
        if (blum != null) {
            blum.mo66703a(this.f127846a);
        }
    }
}
