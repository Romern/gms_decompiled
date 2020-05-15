package p000;

import java.io.PrintWriter;
import java.nio.ByteBuffer;

/* renamed from: obe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class obe {
    /* renamed from: a */
    static final void m28338a(String str, long j, String str2, boolean z, String str3, ByteBuffer byteBuffer, PrintWriter printWriter) {
        char c;
        Object[] objArr = new Object[6];
        objArr[0] = str;
        objArr[1] = Long.valueOf(j);
        objArr[2] = str2;
        if (!z) {
            c = 'R';
        } else {
            c = 'T';
        }
        objArr[3] = Character.valueOf(c);
        objArr[4] = str3;
        objArr[5] = Integer.valueOf(byteBuffer.remaining());
        printWriter.printf("%s  %d:%s:%c:%s:%d", objArr);
    }

    /* renamed from: a */
    public abstract void mo21936a(String str, long j, boolean z, ByteBuffer byteBuffer, PrintWriter printWriter);
}
