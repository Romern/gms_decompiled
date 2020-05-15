package p000;

import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;

/* renamed from: ciqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciqz implements circ {

    /* renamed from: a */
    final /* synthetic */ File f191268a;

    public ciqz(File file) {
        this.f191268a = file;
    }

    /* renamed from: a */
    public final FileChannel mo86389a() {
        return new FileInputStream(this.f191268a).getChannel();
    }
}
