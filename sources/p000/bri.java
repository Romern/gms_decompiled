package p000;

import java.io.ByteArrayOutputStream;

/* renamed from: bri */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bri {
    VERSION_05;
    

    /* renamed from: b */
    private final byte f5453b = 5;

    static {
        bxg bxg = bxg.PPMC4;
    }

    private bri(String str) {
    }

    /* renamed from: a */
    public final void mo3447a(ByteArrayOutputStream byteArrayOutputStream) {
        if (this != VERSION_05) {
            while (byteArrayOutputStream.size() % 8 != 0) {
                byteArrayOutputStream.write(0);
            }
            return;
        }
        byteArrayOutputStream.write(128);
        while (byteArrayOutputStream.size() % 8 != 0) {
            byteArrayOutputStream.write(0);
        }
    }

    public final String toString() {
        return cbm.m3892a(this.f5453b);
    }
}
