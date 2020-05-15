package p000;

import java.util.Arrays;

/* renamed from: blvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class blvn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ byte[] f127874a;

    /* renamed from: b */
    final /* synthetic */ blvp f127875b;

    public blvn(blvp blvp, byte[] bArr) {
        this.f127875b = blvp;
        this.f127874a = bArr;
    }

    public final void run() {
        int i = blvt.f127895c;
        new Object[1][0] = Arrays.toString(this.f127874a);
        blum blum = this.f127875b.f127880d;
        if (blum != null) {
            blum.mo66703a(this.f127874a);
        }
    }
}
