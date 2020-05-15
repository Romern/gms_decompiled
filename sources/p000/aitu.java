package p000;

import java.io.IOException;

/* renamed from: aitu */
final /* synthetic */ class aitu implements Runnable {

    /* renamed from: a */
    private final aiug f69737a;

    /* renamed from: b */
    private final aivg f69738b;

    /* renamed from: c */
    private final byte[] f69739c;

    public aitu(aiug aiug, aivg aivg, byte[] bArr) {
        this.f69737a = aiug;
        this.f69738b = aivg;
        this.f69739c = bArr;
    }

    public final void run() {
        aiug aiug = this.f69737a;
        aivg aivg = this.f69738b;
        byte[] bArr = this.f69739c;
        srn srn = ailf.f69111a;
        cfnv.m140758T();
        try {
            aiug.m57962a(aivg, aiug.mo38049a(bArr));
        } catch (IOException e) {
        }
        aivg.close();
    }
}
