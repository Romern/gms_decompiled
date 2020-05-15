package p000;

import java.io.OutputStream;

/* renamed from: ciqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciqe implements ciqq {

    /* renamed from: a */
    final /* synthetic */ ciqt f191234a;

    /* renamed from: b */
    final /* synthetic */ OutputStream f191235b;

    public ciqe(ciqt ciqt, OutputStream outputStream) {
        this.f191234a = ciqt;
        this.f191235b = outputStream;
    }

    /* renamed from: a */
    public final void mo74930a(cipu cipu, long j) {
        ciqu.m150905a(cipu.f191213b, 0, j);
        while (j > 0) {
            this.f191234a.mo86356e();
            ciqn ciqn = cipu.f191212a;
            int min = (int) Math.min(j, (long) (ciqn.f191252c - ciqn.f191251b));
            this.f191235b.write(ciqn.f191250a, ciqn.f191251b, min);
            int i = ciqn.f191251b + min;
            ciqn.f191251b = i;
            long j2 = (long) min;
            j -= j2;
            cipu.f191213b -= j2;
            if (i == ciqn.f191252c) {
                cipu.f191212a = ciqn.mo86386b();
                ciqo.m150875a(ciqn);
            }
        }
    }

    public final void close() {
        this.f191235b.close();
    }

    /* renamed from: df */
    public final ciqt mo74932df() {
        return this.f191234a;
    }

    public final void flush() {
        this.f191235b.flush();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f191235b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 6);
        sb.append("sink(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
