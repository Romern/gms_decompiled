package p000;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: blvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class blvb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ byte[] f127841a;

    /* renamed from: b */
    final /* synthetic */ blvg f127842b;

    public blvb(blvg blvg, byte[] bArr) {
        this.f127842b = blvg;
        this.f127841a = bArr;
    }

    public final void run() {
        blum blum;
        int i = blvt.f127895c;
        new Object[1][0] = Arrays.toString(this.f127841a);
        this.f127842b.f127850b.setValue(this.f127841a);
        blvg blvg = this.f127842b;
        if (!blvg.f127849a.mo54365b(blvg.f127850b) && (blum = this.f127842b.f127851c) != null) {
            blum.mo66701a(bluu.m107620a(new IOException("intenal error writing characteristic")));
        }
    }
}
