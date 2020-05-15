package p000;

import java.io.File;
import java.util.Comparator;

/* renamed from: wvk */
final /* synthetic */ class wvk implements Comparator {

    /* renamed from: a */
    static final Comparator f51415a = new wvk();

    private wvk() {
    }

    public final int compare(Object obj, Object obj2) {
        return (((File) obj).lastModified() > ((File) obj2).lastModified() ? 1 : (((File) obj).lastModified() == ((File) obj2).lastModified() ? 0 : -1));
    }
}
