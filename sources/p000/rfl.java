package p000;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: rfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class rfl extends scg {

    /* renamed from: a */
    private final int f42876a;

    protected rfl(byte[] bArr) {
        sdo.m34974b(bArr.length == 25);
        this.f42876a = Arrays.hashCode(bArr);
    }

    /* renamed from: a */
    protected static byte[] m33513a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public abstract byte[] mo24594a();

    /* renamed from: b */
    public final vzr mo24595b() {
        return vzs.m41642a(mo24594a());
    }

    /* renamed from: c */
    public final int mo24596c() {
        return this.f42876a;
    }

    public final boolean equals(Object obj) {
        vzr b;
        if (obj == null || !(obj instanceof sch)) {
            return false;
        }
        try {
            sch sch = (sch) obj;
            if (sch.mo24596c() != this.f42876a || (b = sch.mo24595b()) == null) {
                return false;
            }
            return Arrays.equals(mo24594a(), (byte[]) vzs.m41641a(b));
        } catch (RemoteException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    public final int hashCode() {
        return this.f42876a;
    }
}
