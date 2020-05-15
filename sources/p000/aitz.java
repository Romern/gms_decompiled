package p000;

import java.io.IOException;

/* renamed from: aitz */
final /* synthetic */ class aitz implements Runnable {

    /* renamed from: a */
    private final aiug f69751a;

    /* renamed from: b */
    private final aivg f69752b;

    /* renamed from: c */
    private final ahfi f69753c;

    /* renamed from: d */
    private final short f69754d;

    public aitz(aiug aiug, aivg aivg, ahfi ahfi, short s) {
        this.f69751a = aiug;
        this.f69752b = aivg;
        this.f69753c = ahfi;
        this.f69754d = s;
    }

    public final void run() {
        aiug aiug = this.f69751a;
        aivg aivg = this.f69752b;
        ahfi ahfi = this.f69753c;
        short s = this.f69754d;
        while (!aivg.f69866b) {
            try {
                aiug.mo38048a(aivg.f69867c, 5);
                srn srn = ailf.f69111a;
                ahfi.mo36396b();
                aivg.close();
                aiug.f69778a.mo38099b(aivg.f69865a);
                aiug.f69783f.mo38044c(s);
            } catch (IOException e) {
            }
        }
    }
}
