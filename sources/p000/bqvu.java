package p000;

import java.security.MessageDigest;
import java.security.Provider;

/* renamed from: bqvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqvu implements bqvw {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo69342a(String str, Provider provider) {
        if (provider != null) {
            return MessageDigest.getInstance(str, provider);
        }
        return MessageDigest.getInstance(str);
    }
}
