package p000;

import java.io.IOException;

/* renamed from: aivh */
final /* synthetic */ class aivh implements Runnable {

    /* renamed from: a */
    private final aivn f69871a;

    /* renamed from: b */
    private final aivw f69872b;

    /* renamed from: c */
    private final byte[] f69873c;

    public aivh(aivn aivn, aivw aivw, byte[] bArr) {
        this.f69871a = aivn;
        this.f69872b = aivw;
        this.f69873c = bArr;
    }

    public final void run() {
        try {
            this.f69871a.mo38127b(this.f69872b, this.f69873c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
