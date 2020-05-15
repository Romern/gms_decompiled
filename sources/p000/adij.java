package p000;

import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: adij */
final /* synthetic */ class adij implements Callable {

    /* renamed from: a */
    private final adik f61804a;

    /* renamed from: b */
    private final String f61805b;

    public adij(adik adik, String str) {
        this.f61804a = adik;
        this.f61805b = str;
    }

    public final Object call() {
        adik adik = this.f61804a;
        String str = this.f61805b;
        adfb a = adik.f61807b.mo33411a();
        adik.mo33545m(str);
        a.mo33409a("MetadataDatastore.downloadIconToFile");
        File file = new File(adik.f61809d, str);
        synchronized (adik.f61810e) {
            adik.f61810e.remove(str);
            if (!file.isFile()) {
                file = null;
            }
        }
        return file;
    }
}
