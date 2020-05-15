package p000;

import java.io.InputStream;
import java.util.List;

/* renamed from: beev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beev extends behd implements begw {

    /* renamed from: a */
    private final List f111458a;

    public beev(InputStream inputStream, List list) {
        super(inputStream);
        boolean z;
        this.f111458a = list;
        if (inputStream != null) {
            z = true;
        } else {
            z = false;
        }
        behg.m95044a(z, "Input was null", new Object[0]);
    }

    /* renamed from: a */
    public final Long mo36254a() {
        if (this.in instanceof begw) {
            return ((begw) this.in).mo36254a();
        }
        return null;
    }

    public final void close() {
        List list = this.f111458a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((beia) list.get(i)).close();
            } catch (Throwable th) {
            }
        }
        super.close();
    }

    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            List list = this.f111458a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((beia) list.get(i)).mo60714a();
            }
        }
        return read;
    }

    public final int read(byte[] bArr) {
        int read = this.in.read(bArr);
        if (read != -1) {
            List list = this.f111458a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((beia) list.get(i)).mo60714a();
            }
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            List list = this.f111458a;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((beia) list.get(i3)).mo60714a();
            }
        }
        return read;
    }
}
