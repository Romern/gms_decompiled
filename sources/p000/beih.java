package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: beih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beih implements beid {
    /* renamed from: d */
    public static MessageDigest m95129d() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public final OutputStream mo60718a(OutputStream outputStream) {
        return beic.m95112a(this, outputStream);
    }

    /* renamed from: a */
    public final String mo60719a() {
        return "integrity";
    }

    /* renamed from: b */
    public final void mo60720b() {
    }

    /* renamed from: c */
    public final void mo60721c() {
    }

    /* renamed from: a */
    public static String m95128a(Uri uri) {
        begk a = begm.m95020a(uri, "integrity");
        if (a == null) {
            return null;
        }
        String a2 = a.mo60692a("sha256");
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        return null;
    }

    /* renamed from: a */
    public final InputStream mo60716a(Uri uri, InputStream inputStream) {
        return new beig(inputStream, begm.m95020a(uri, "integrity"));
    }

    /* renamed from: a */
    public final OutputStream mo60717a(Uri uri, OutputStream outputStream) {
        return new beif(outputStream, begm.m95020a(uri, "integrity"));
    }
}
