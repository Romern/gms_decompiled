package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: czs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class czs {

    /* renamed from: a */
    public final List f12457a;

    public czs(byte[] bArr) {
        czl.m8004b(false, "AFL cannot be constructed from null array");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ArrayList arrayList = new ArrayList(bArr.length >> 2);
            while (byteArrayInputStream.available() >= 4) {
                byte[] bArr2 = new byte[4];
                byteArrayInputStream.read(bArr2);
                arrayList.add(new czr(bArr2));
            }
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            try {
                byteArrayInputStream.close();
                this.f12457a = unmodifiableList;
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
    public static byte m8046a(byte b) {
        return (byte) ((b >>> 3) & 31);
    }
}
