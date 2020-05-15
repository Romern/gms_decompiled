package p000;

import java.io.OutputStream;
import java.io.Writer;

/* renamed from: bfoi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfoi extends OutputStream {

    /* renamed from: a */
    private final Writer f114548a;

    public bfoi(Writer writer) {
        this.f114548a = writer;
    }

    public final void close() {
        this.f114548a.close();
    }

    public final void flush() {
        this.f114548a.flush();
    }

    public final void write(int i) {
        if ((i & -128) == 0) {
            this.f114548a.write(i);
            return;
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Not an ASCII character ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
