package p000;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: bzse */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzse {
    /* renamed from: a */
    public static final bzsq m126112a(String str, String str2, bzsa bzsa, bzrx bzrx) {
        try {
            return new bzsd((HttpURLConnection) new URL(str).openConnection(), str2, bzsa, bzrx);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Url is malformed.", e);
        } catch (IOException e2) {
            throw new IllegalStateException("Http connection could not be created.", e2);
        }
    }
}
