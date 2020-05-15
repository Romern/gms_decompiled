package p000;

import java.util.Collections;

/* renamed from: epp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class epp {

    /* renamed from: a */
    private static final sek f15490a = ffw.m11631a("RepositoryConverters");

    /* renamed from: a */
    public static bsxn m10912a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return (bsxn) bxvk.m124016a(bsxn.f147586d, bArr, bxus.m123744c());
        } catch (bxwf e) {
            f15490a.mo25417e("Failed to convert ByteArray to ResourceKey.", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public static bsxk m10915b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return (bsxk) bxvk.m124016a(bsxk.f147578f, bArr, bxus.m123744c());
        } catch (bxwf e) {
            f15490a.mo25417e("Failed to convert ByteArray to Resource.", e, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m10913a(bsxk bsxk) {
        if (bsxk != null) {
            return bsxk.mo73642k();
        }
        return null;
    }

    /* renamed from: a */
    public static byte[] m10914a(bsxn bsxn) {
        if (bsxn == null) {
            return null;
        }
        bsxl bsxl = (bsxl) bsxn.f147586d.mo74144da();
        int i = bsxn.f147589b;
        if (bsxl.f164950c) {
            bsxl.mo74035c();
            bsxl.f164950c = false;
        }
        bsxn bsxn2 = (bsxn) bsxl.f164949b;
        bsxn2.f147588a |= 1;
        bsxn2.f147589b = i;
        bsxl.mo70720a(bnim.m109536b(Collections.unmodifiableMap(bsxn.f147590c)));
        return ((bsxn) bsxl.mo74062i()).mo73642k();
    }
}
