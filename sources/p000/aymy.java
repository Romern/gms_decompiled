package p000;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: aymy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aymy {

    /* renamed from: a */
    public final bxxc[] f97998a;

    public aymy(bxxc[] bxxcArr) {
        this.f97998a = bxxcArr;
    }

    /* renamed from: a */
    public static void m84288a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }
}
