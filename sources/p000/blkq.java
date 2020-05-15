package p000;

import java.io.IOException;

/* renamed from: blkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blkq extends IOException {
    public blkq(String str) {
        super(str);
    }

    public blkq(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
