package p000;

import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Arrays;

/* renamed from: ayam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayam {

    /* renamed from: a */
    public final ayal f96936a = new ayal();

    /* renamed from: a */
    public static final int m83699a(ayfa ayfa, byte[] bArr) {
        boolean z = (ayfa.f97429a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        int hashCode = Arrays.hashCode(new Object[]{ayfa.f97431c, ayfa.f97432d, ayfa.f97436h, ayfa.f97433e, Integer.valueOf(ayfa.f97438j), Integer.valueOf(ayfa.f97430b), Boolean.valueOf(z), !z ? ayfa.f97434f : ""});
        for (byte b : bArr) {
            hashCode = (hashCode * 31) + b;
        }
        return hashCode;
    }

    /* renamed from: a */
    public static byte[] m83700a(ayfa ayfa) {
        if ((ayfa.f97429a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            return ayfa.f97435g.mo73780k();
        }
        ayen ayen = ayfa.f97437i;
        if (ayen == null) {
            ayen = ayen.f97331g;
        }
        return ayen.mo73642k();
    }
}
