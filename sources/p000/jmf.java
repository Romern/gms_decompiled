package p000;

import java.util.List;

/* renamed from: jmf */
final /* synthetic */ class jmf implements Runnable {

    /* renamed from: a */
    private final jmg f22815a;

    /* renamed from: b */
    private final boolean f22816b;

    /* renamed from: c */
    private final byte[] f22817c;

    /* renamed from: d */
    private final List f22818d;

    public jmf(jmg jmg, boolean z, byte[] bArr, List list) {
        this.f22815a = jmg;
        this.f22816b = z;
        this.f22817c = bArr;
        this.f22818d = list;
    }

    public final void run() {
        jmg jmg = this.f22815a;
        boolean z = this.f22816b;
        byte[] bArr = this.f22817c;
        List list = this.f22818d;
        if (z) {
            jmg.mo13766a(bArr, list);
        } else {
            jmg.mo13765a();
        }
    }
}
