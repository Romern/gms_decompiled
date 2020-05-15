package p000;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: buhg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buhg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ buhj f153841a;

    /* renamed from: b */
    private final int f153842b;

    /* renamed from: c */
    private final int f153843c;

    /* renamed from: d */
    private final byte[] f153844d;

    public buhg(buhj buhj, int i, int i2, byte[] bArr) {
        this.f153841a = buhj;
        this.f153842b = i;
        this.f153843c = i2;
        this.f153844d = (byte[]) bArr.clone();
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [bugn, buhi], assign insn: 0x0027: IGET  (r3v4 ? I:buhi) = (r3v3 buhj) buhj.i buhi */
    public final void run() {
        buhs a = buhs.m119543a(this.f153844d);
        if (a == null) {
            new Object[1][0] = Arrays.toString(this.f153844d);
            return;
        }
        buhv a2 = this.f153841a.f153854f.mo72695a(a);
        if (a2 != null && a2.f153901a) {
            buhd buhd = a2.f153902b;
            ? r3 = this.f153841a.f153857i;
            int i = this.f153842b;
            int i2 = this.f153843c;
            buhb buhb = (buhb) r3;
            if (buhb.mo72660c(i)) {
                bugr a3 = buhb.mo72656a(i2);
                if (a3 == null) {
                    Locale locale = Locale.US;
                    new Object[1][0] = Integer.valueOf(i2);
                    return;
                }
                bgbq bgbq = buhb.f153817o;
                if (!(bgbq == null || buhd == null)) {
                    bgbq.mo62620a(a3, buhd.f153831a);
                }
                ((buha) r3).mo72649a(a3.mo72644b(), r3, a3, buhd);
            }
        }
    }
}
