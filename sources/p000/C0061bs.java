package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: bs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0061bs {

    /* renamed from: a */
    public final HashMap f5523a = new HashMap();

    /* renamed from: a */
    public final void mo3468a() {
        for (C0053bl blVar : this.f5523a.values()) {
            blVar.f5076c = true;
            synchronized (blVar.f5075b) {
                for (Object obj : blVar.f5075b.values()) {
                    if (obj instanceof Closeable) {
                        try {
                            ((Closeable) obj).close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
            blVar.mo3218f();
        }
        this.f5523a.clear();
    }
}
