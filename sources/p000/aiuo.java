package p000;

import android.net.LinkProperties;

/* renamed from: aiuo */
final /* synthetic */ class aiuo implements Runnable {

    /* renamed from: a */
    private final aiup f69804a;

    /* renamed from: b */
    private final LinkProperties f69805b;

    /* renamed from: c */
    private final int f69806c;

    /* renamed from: d */
    private final aiuc f69807d;

    public aiuo(aiup aiup, LinkProperties linkProperties, int i, aiuc aiuc) {
        this.f69804a = aiup;
        this.f69805b = linkProperties;
        this.f69806c = i;
        this.f69807d = aiuc;
    }

    public final void run() {
        aiup aiup = this.f69804a;
        aiup.f69809b.mo38090a(this.f69805b, this.f69806c, this.f69807d);
    }
}
