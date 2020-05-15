package p000;

import com.google.android.gms.leveldb.LevelDb;
import java.io.Closeable;

/* renamed from: adgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adgz implements Closeable {

    /* renamed from: a */
    public final LevelDb.Snapshot f61614a;

    /* renamed from: b */
    private boolean f61615b = false;

    public adgz(LevelDb.Snapshot snapshot) {
        this.f61614a = snapshot;
    }

    public final synchronized void close() {
        if (!this.f61615b) {
            this.f61615b = true;
            this.f61614a.close();
        }
    }
}
