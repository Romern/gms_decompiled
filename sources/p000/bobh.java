package p000;

import java.io.File;
import java.io.FileInputStream;

/* renamed from: bobh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bobh extends boaq {

    /* renamed from: a */
    private final File f132497a;

    public bobh(File file) {
        bmxy.m108581a(file);
        this.f132497a = file;
    }

    /* renamed from: a */
    public final byte[] mo68799a() {
        bobb a = bobb.m111033a();
        try {
            FileInputStream b = mo68853b();
            a.mo68842a(b);
            byte[] a2 = boav.m111021a(b, b.getChannel().size());
            a.close();
            return a2;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: b */
    public final FileInputStream mo68853b() {
        return new FileInputStream(this.f132497a);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f132497a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("Files.asByteSource(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
