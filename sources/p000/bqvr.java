package p000;

import java.security.KeyFactory;
import java.security.Provider;

/* renamed from: bqvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqvr implements bqvw {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo69342a(String str, Provider provider) {
        if (provider != null) {
            return KeyFactory.getInstance(str, provider);
        }
        return KeyFactory.getInstance(str);
    }
}
