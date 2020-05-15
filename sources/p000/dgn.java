package p000;

import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: dgn */
public final /* synthetic */ class dgn implements FilenameFilter {

    /* renamed from: a */
    public static final FilenameFilter f13071a = new dgn();

    private dgn() {
    }

    public final boolean accept(File file, String str) {
        ReadWriteLock readWriteLock = dgv.f13086e;
        return str.endsWith(".apk");
    }
}
