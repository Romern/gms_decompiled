package p000;

import java.io.IOException;

/* renamed from: aity */
final /* synthetic */ class aity implements Runnable {

    /* renamed from: a */
    private final aiug f69748a;

    /* renamed from: b */
    private final aivg f69749b;

    /* renamed from: c */
    private final byte[] f69750c;

    public aity(aiug aiug, aivg aivg, byte[] bArr) {
        this.f69748a = aiug;
        this.f69749b = aivg;
        this.f69750c = bArr;
    }

    public final void run() {
        aiug aiug = this.f69748a;
        aivg aivg = this.f69749b;
        byte[] bArr = this.f69750c;
        srn srn = ailf.f69111a;
        cfnv.m140758T();
        try {
            aiug.m57962a(aivg, aiug.mo38049a(bArr));
        } catch (IOException e) {
        }
        aivg.close();
        aiug.f69778a.mo38099b(aivg.f69865a);
    }
}
