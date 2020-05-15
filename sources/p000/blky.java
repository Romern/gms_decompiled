package p000;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/* renamed from: blky */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blky extends blkw {

    /* renamed from: c */
    public final Queue f126777c = new ArrayDeque();

    /* renamed from: d */
    private final List f126778d = new ArrayList();

    public blky(File file) {
        super(file);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final InputStream mo66625a(long j, long j2) {
        blkz blkz = (blkz) this.f126777c.poll();
        if (blkz == null) {
            blkt blkt = new blkt(this.f126773a);
            this.f126778d.add(blkt);
            blkz = new blkz(blkt);
        }
        ((blkt) blkz.f126779a).mo66613a(j, j2);
        blkx blkx = new blkx(this, blkz);
        blkz.f126781c = true;
        blkz.f126780b = blkx;
        return blkz;
    }

    public final void close() {
        List list = this.f126778d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            blkt blkt = (blkt) list.get(i);
            if (blkt != null) {
                try {
                    blkt.close();
                } catch (Exception e) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        close();
    }
}
