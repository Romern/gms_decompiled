package p000;

import java.io.File;
import java.util.Comparator;

/* renamed from: wvj */
final /* synthetic */ class wvj implements Comparator {

    /* renamed from: a */
    static final Comparator f51414a = new wvj();

    private wvj() {
    }

    public final int compare(Object obj, Object obj2) {
        return -(((File) obj).lastModified() > ((File) obj2).lastModified() ? 1 : (((File) obj).lastModified() == ((File) obj2).lastModified() ? 0 : -1));
    }
}
