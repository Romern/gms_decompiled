package p000;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: bquj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bquj extends ThreadLocal {
    /* renamed from: a */
    protected static final Cipher m113427a() {
        try {
            return (Cipher) bqvo.f141689a.mo69341a("AES/GCM/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m113427a();
    }
}
