package p000;

import java.io.PrintWriter;
import java.util.List;

/* renamed from: bfwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfwx extends bfwz {

    /* renamed from: c */
    private final List f115561c;

    /* renamed from: d */
    private final String f115562d;

    /* renamed from: e */
    private final String f115563e;

    /* renamed from: f */
    private final boolean f115564f;

    public bfwx(int i, String str, List list, String str2, boolean z) {
        super(i);
        this.f115561c = list;
        this.f115563e = str2;
        this.f115562d = str;
        this.f115564f = z;
    }

    /* renamed from: a */
    public final void mo62393a(PrintWriter printWriter) {
        printWriter.printf("%s GeofencesChanged(%08x): packageName=%s, message=%s, needFullUpdate=%s, geofences=%s%n", mo62409a(), Integer.valueOf(this.f115567a), this.f115562d, this.f115563e, Boolean.valueOf(this.f115564f), this.f115561c);
    }
}
