package p000;

import java.security.SecureRandom;

/* renamed from: bqwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bqwe extends ThreadLocal {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
