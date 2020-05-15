package p000;

import java.util.List;

/* renamed from: asso */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asso {
    /* renamed from: a */
    public static List m74698a(byte[] bArr) {
        boolean z;
        try {
            assu a = assu.m74713a(bArr);
            if (a.f89619b == 111) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108588a(z);
            return a.mo49448c().mo49438a(165, 48908).mo49448c().mo49440b();
        } catch (assv e) {
            throw new IllegalArgumentException("Not valid FCI template", e);
        }
    }
}
