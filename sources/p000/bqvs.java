package p000;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* renamed from: bqvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqvs implements bqvw {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo69342a(String str, Provider provider) {
        if (provider != null) {
            return KeyPairGenerator.getInstance(str, provider);
        }
        return KeyPairGenerator.getInstance(str);
    }
}
