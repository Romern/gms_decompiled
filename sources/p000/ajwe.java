package p000;

import android.os.ParcelUuid;
import java.util.Arrays;

/* renamed from: ajwe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajwe {

    /* renamed from: a */
    public static final ParcelUuid f71402a = ahhc.m55765a("FE2C");

    /* renamed from: b */
    public static final byte[] f71403b;

    /* renamed from: f */
    private static final int f71404f;

    /* renamed from: c */
    public final int f71405c;

    /* renamed from: d */
    public final int f71406d;

    /* renamed from: e */
    public final int f71407e;

    static {
        byte[] a = srv.m36161a("FC128E");
        f71403b = a;
        f71404f = a.length + 2;
    }

    private ajwe(int i, int i2, int i3) {
        this.f71405c = i;
        this.f71406d = i2;
        this.f71407e = i3;
    }

    /* renamed from: a */
    public static ajwe m59128a(int i) {
        return new ajwe(0, i, -((byte) ((int) cfov.f185185a.mo6606a().mo82380d())));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ajwe) {
            ajwe ajwe = (ajwe) obj;
            return sdg.m34949a(Integer.valueOf(this.f71405c), Integer.valueOf(ajwe.f71405c)) && sdg.m34949a(Integer.valueOf(this.f71406d), Integer.valueOf(ajwe.f71406d)) && sdg.m34949a(Integer.valueOf(this.f71407e), Integer.valueOf(ajwe.f71407e));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f71405c), Integer.valueOf(this.f71406d), Integer.valueOf(this.f71407e)});
    }

    /* renamed from: a */
    public static ajwe m59129a(byte[] bArr) {
        if (bArr == null) {
            srn srn = ajvp.f71371a;
            return null;
        } else if (bArr.length < f71404f) {
            srn srn2 = ajvp.f71371a;
            return null;
        } else if (!Arrays.equals(akid.m59790a(bArr, 0, f71403b.length), f71403b)) {
            srn srn3 = ajvp.f71371a;
            return null;
        } else {
            byte[] a = akid.m59790a(bArr, 0, f71404f);
            return new ajwe((akid.m59790a(a, f71403b.length, f71404f)[0] >> 5) & 7, (akid.m59790a(a, f71403b.length, f71404f)[0] >> 2) & 7, -akid.m59790a(a, f71403b.length, f71404f)[1]);
        }
    }
}
