package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.BitSet;

/* renamed from: bank */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bank {

    /* renamed from: a */
    private final BitSet f101355a = new BitSet(PSKKeyManager.MAX_KEY_LENGTH_BYTES);

    /* renamed from: a */
    public final banl mo55803a() {
        return new banl(this.f101355a);
    }

    /* renamed from: a */
    public final void mo55804a(byte b) {
        this.f101355a.set(b);
    }
}
