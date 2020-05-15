package p000;

import java.io.OutputStream;
import java.util.List;

/* renamed from: beew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beew extends behe {

    /* renamed from: a */
    private final List f111459a;

    public beew(OutputStream outputStream, List list) {
        super(outputStream);
        boolean z;
        this.f111459a = list;
        if (outputStream != null) {
            z = true;
        } else {
            z = false;
        }
        behg.m95044a(z, "Output was null", new Object[0]);
    }

    public final void close() {
        List list = this.f111459a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ((behl) list.get(i)).close();
            } catch (Throwable th) {
            }
        }
        super.close();
    }

    public final void write(int i) {
        this.out.write(i);
        List list = this.f111459a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((behl) list.get(i2)).mo60709a(1);
        }
    }

    public final void write(byte[] bArr) {
        this.out.write(bArr);
        List list = this.f111459a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((behl) list.get(i)).mo60709a(bArr.length);
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        List list = this.f111459a;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((behl) list.get(i3)).mo60709a(i2);
        }
    }
}
