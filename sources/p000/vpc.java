package p000;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: vpc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vpc {

    /* renamed from: a */
    private static final sbw f49701a = new sbw("HashUtils", "");

    /* renamed from: b */
    private static final Pattern f49702b = Pattern.compile("[0-9A-F]+");

    /* renamed from: a */
    public static String m40992a(InputStream inputStream) {
        MessageDigest b = spn.m35868b("SHA-256");
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                return srv.m36164d(b.digest());
            }
            b.update(bArr, 0, read);
        }
    }

    /* renamed from: b */
    public static String m40995b(String str) {
        if (str == null) {
            return null;
        }
        try {
            String valueOf = String.valueOf(m40992a(new ByteArrayInputStream(str.getBytes())));
            return valueOf.length() == 0 ? new String("UUID#") : "UUID#".concat(valueOf);
        } catch (IOException e) {
            f49701a.mo25373b("HashUtils", String.format(Locale.US, "Could not compute signature for string %s", str), e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m40993a(String str) {
        return m40994a(str, 64);
    }

    /* renamed from: a */
    public static String m40994a(String str, int i) {
        String upperCase = str.toUpperCase(Locale.US);
        if (!f49702b.matcher(upperCase).matches()) {
            throw new IllegalArgumentException("hash contains invalid characters; only [0-9a-fA-F] are allowed");
        } else if (upperCase.length() == i) {
            return upperCase;
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "hash must be %d characters in length, but was %d", Integer.valueOf(i), Integer.valueOf(upperCase.length())));
        }
    }
}
