package p000;

import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: ahni */
final /* synthetic */ class ahni implements Runnable {

    /* renamed from: a */
    private final ahnp f67608a;

    /* renamed from: b */
    private final ahkv f67609b;

    /* renamed from: c */
    private final String f67610c;

    /* renamed from: d */
    private final ahna f67611d;

    /* renamed from: e */
    private final List f67612e;

    /* renamed from: f */
    private final byte[] f67613f;

    /* renamed from: g */
    private final byte[] f67614g;

    /* renamed from: h */
    private final String f67615h;

    /* renamed from: i */
    private final byte[] f67616i;

    /* renamed from: j */
    private final boolean f67617j;

    /* renamed from: k */
    private final boolean f67618k;

    /* renamed from: l */
    private final aify f67619l;

    /* renamed from: m */
    private final boolean f67620m;

    /* renamed from: n */
    private final CountDownLatch f67621n;

    public ahni(ahnp ahnp, ahkv ahkv, String str, ahna ahna, List list, byte[] bArr, byte[] bArr2, String str2, byte[] bArr3, boolean z, boolean z2, aify aify, boolean z3, CountDownLatch countDownLatch) {
        this.f67608a = ahnp;
        this.f67609b = ahkv;
        this.f67610c = str;
        this.f67611d = ahna;
        this.f67612e = list;
        this.f67613f = bArr;
        this.f67614g = bArr2;
        this.f67615h = str2;
        this.f67616i = bArr3;
        this.f67617j = z;
        this.f67618k = z2;
        this.f67619l = aify;
        this.f67620m = z3;
        this.f67621n = countDownLatch;
    }

    public final void run() {
        ahnp ahnp = this.f67608a;
        ahkv ahkv = this.f67609b;
        String str = this.f67610c;
        ahna ahna = this.f67611d;
        List list = this.f67612e;
        byte[] bArr = this.f67613f;
        byte[] bArr2 = this.f67614g;
        String str2 = this.f67615h;
        byte[] bArr3 = this.f67616i;
        boolean z = this.f67617j;
        boolean z2 = this.f67618k;
        aify aify = this.f67619l;
        boolean z3 = this.f67620m;
        CountDownLatch countDownLatch = this.f67621n;
        ahnp.f67634a.mo36878a(ahkv, str, ahna);
        ahnp.f67637d.execute(new ahno(ahnp, ahkv, str));
        srn srn = ahkm.f67363a;
        ahnp.f67638e.execute(new ahnn(ahnp, ahkv, str));
        ahkv.mo36704a(str, bArr, bArr2, str2, bArr3, z, z2, list, aify, z3);
        countDownLatch.countDown();
    }
}
