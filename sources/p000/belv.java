package p000;

import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: belv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class belv implements bejw {
    /* renamed from: a */
    public static belv m95279a(bxxc bxxc, bxus bxus) {
        return new belu(bxxc, bxus);
    }

    /* renamed from: a */
    public abstract bxxc mo60786a();

    /* renamed from: b */
    public abstract bxus mo60787b();

    /* renamed from: a */
    public final bxxc mo60791a(InputStream inputStream) {
        return (bxxc) mo60786a().mo74143cZ().mo73665d(inputStream, mo60787b());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo60769a(Object obj, OutputStream outputStream) {
        ((bxxc) obj).mo73638a(outputStream);
    }
}
