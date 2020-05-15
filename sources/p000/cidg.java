package p000;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cidg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cidg extends OutputStream {

    /* renamed from: a */
    public final List f189896a = new ArrayList();

    /* renamed from: b */
    final /* synthetic */ cidj f189897b;

    /* renamed from: c */
    private cifi f189898c;

    public cidg(cidj cidj) {
        this.f189897b = cidj;
    }

    public final void write(int i) {
        cifi cifi = this.f189898c;
        if (cifi != null && cifi.mo85751a() > 0) {
            this.f189898c.mo85752a((byte) i);
            return;
        }
        write(new byte[]{(byte) i}, 0, 1);
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (this.f189898c == null) {
            cifi a = this.f189897b.f189901b.mo85755a(i2);
            this.f189898c = a;
            this.f189896a.add(a);
        }
        while (i2 > 0) {
            int min = Math.min(i2, this.f189898c.mo85751a());
            if (min == 0) {
                int b = this.f189898c.mo85754b();
                cifi a2 = this.f189897b.f189901b.mo85755a(Math.max(i2, b + b));
                this.f189898c = a2;
                this.f189896a.add(a2);
            } else {
                this.f189898c.mo85753a(bArr, i, min);
                i += min;
                i2 -= min;
            }
        }
    }
}
