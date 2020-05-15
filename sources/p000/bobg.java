package p000;

import java.io.File;

/* renamed from: bobg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bobg extends boao {

    /* renamed from: a */
    public final File f132495a;

    /* renamed from: b */
    public final bnic f132496b;

    public bobg(File file, bobe... bobeArr) {
        bmxy.m108581a(file);
        this.f132495a = file;
        this.f132496b = bnic.m109496a((Object[]) bobeArr);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f132495a);
        String valueOf2 = String.valueOf(this.f132496b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20 + String.valueOf(valueOf2).length());
        sb.append("Files.asByteSink(");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
