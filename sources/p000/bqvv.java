package p000;

import java.security.Provider;
import java.security.Signature;

/* renamed from: bqvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqvv implements bqvw {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo69342a(String str, Provider provider) {
        if (provider != null) {
            return Signature.getInstance(str, provider);
        }
        return Signature.getInstance(str);
    }
}
