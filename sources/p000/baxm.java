package p000;

import java.io.File;

/* renamed from: baxm */
final /* synthetic */ class baxm implements Runnable {

    /* renamed from: a */
    private final baxn f102042a;

    /* renamed from: b */
    private final File f102043b;

    /* renamed from: c */
    private final String f102044c;

    public baxm(baxn baxn, File file, String str) {
        this.f102042a = baxn;
        this.f102043b = file;
        this.f102044c = str;
    }

    public final void run() {
        baxn baxn = this.f102042a;
        baxn.f102045a.mo57870a(this.f102043b, this.f102044c);
    }
}
