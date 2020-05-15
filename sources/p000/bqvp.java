package p000;

import java.security.Provider;
import javax.crypto.Cipher;

/* renamed from: bqvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqvp implements bqvw {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo69342a(String str, Provider provider) {
        if (provider != null) {
            return Cipher.getInstance(str, provider);
        }
        return Cipher.getInstance(str);
    }
}
