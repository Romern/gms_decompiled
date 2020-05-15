package p000;

import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

/* renamed from: ptw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ptw {

    /* renamed from: a */
    public static final Charset f40213a;

    /* renamed from: b */
    public static final String f40214b = ptk.m31239c("com.google.cast.multizone");

    /* renamed from: c */
    public static final rje f40215c = new rje();

    /* renamed from: d */
    public static final rje f40216d = new rje();

    /* renamed from: e */
    public static final rje f40217e = new rje();

    static {
        Charset charset = null;
        try {
            charset = Charset.forName("UTF-8");
        } catch (IllegalCharsetNameException | UnsupportedCharsetException e) {
        }
        f40213a = charset;
    }
}
