package p000;

import java.io.IOException;

/* renamed from: aitx */
final /* synthetic */ class aitx implements Runnable {

    /* renamed from: a */
    private final aiug f69745a;

    /* renamed from: b */
    private final aivg f69746b;

    /* renamed from: c */
    private final byte[] f69747c;

    public aitx(aiug aiug, aivg aivg, byte[] bArr) {
        this.f69745a = aiug;
        this.f69746b = aivg;
        this.f69747c = bArr;
    }

    public final void run() {
        aiug aiug = this.f69745a;
        aivg aivg = this.f69746b;
        byte[] bArr = this.f69747c;
        srn srn = ailf.f69111a;
        try {
            aiug.m57962a(aivg, aiug.mo38049a(bArr));
        } catch (IOException e) {
        }
        aivg.close();
    }
}
