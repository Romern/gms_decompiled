package p000;

import java.io.PrintWriter;
import java.nio.ByteBuffer;

/* renamed from: obd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class obd extends obe {

    /* renamed from: a */
    public static obe f37120a;

    /* renamed from: b */
    private final oer f37121b;

    public obd(oer oer) {
        this.f37121b = oer;
    }

    /* renamed from: a */
    public final void mo21936a(String str, long j, boolean z, ByteBuffer byteBuffer, PrintWriter printWriter) {
        m28338a(str, j, this.f37121b.name(), z, String.valueOf((int) ((char) byteBuffer.getShort())), byteBuffer, printWriter);
        printWriter.println();
    }
}
