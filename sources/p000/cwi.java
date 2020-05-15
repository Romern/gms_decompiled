package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: cwi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cwi {

    /* renamed from: a */
    public final List f12239a;

    public cwi(byte[] bArr) {
        boolean z;
        if (bArr == null) {
            z = true;
        } else {
            z = false;
        }
        cvx.m7698b(z, "AFL cannot be constructed from null array");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ArrayList arrayList = new ArrayList(bArr.length >> 2);
            while (byteArrayInputStream.available() >= 4) {
                byte[] bArr2 = new byte[4];
                byteArrayInputStream.read(bArr2);
                arrayList.add(new cwh(bArr2));
            }
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            try {
                byteArrayInputStream.close();
                this.f12239a = unmodifiableList;
            } catch (IOException e) {
                throw new IllegalArgumentException("stream not closable");
            }
        } catch (IOException e2) {
            throw new IllegalArgumentException("provided byte array not readable as AFL");
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (IOException e3) {
                throw new IllegalArgumentException("stream not closable");
            }
        }
    }

    /* renamed from: a */
    public static byte m7762a(byte b) {
        return (byte) ((b >>> 3) & 31);
    }

    /* renamed from: a */
    public final boolean mo8358a(byte b, byte b2) {
        for (cwh cwh : this.f12239a) {
            if (cwh.f12236a == b && b2 >= cwh.f12237b && b2 <= cwh.f12238c) {
                return true;
            }
        }
        return false;
    }
}
