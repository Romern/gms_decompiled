package p000;

import android.media.MediaDrm;
import android.media.MediaDrmException;
import android.util.Base64;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: vwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vwv {

    /* renamed from: a */
    private final vws f50165a;

    public vwv(vws vws) {
        this.f50165a = vws;
    }

    /* renamed from: a */
    private static String m41503a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo28918a(String str) {
        MediaDrm mediaDrm;
        byte[] openSession;
        try {
            mediaDrm = new MediaDrm(UUID.fromString(this.f50165a.mo28917a(new int[]{68, 220, 223, 20, 228, 227, 68, 27, 216, 98, 137, 197, 218, 223, 219, 222, 207, 227, 198, 201, 228, 19, 207, 7, 198, 211, 202, 212, 20, 156, 214, 226, 204, 19, 225, 89, 197, 212, 121, 68, 19, 197, 105, 121, 98, 201, 19, 228, 201, 212, 224, 216, 199, 227, 210, 7, 205, 206, 20, 121, 20, 228, 207, 228, 115, 53, 20, 199, 53, 68, 20})));
            openSession = mediaDrm.openSession();
            mediaDrm.getCryptoSession(openSession, this.f50165a.mo28917a(new int[]{219, 197, 68, 127, 221, 102, 121, 223, 137, 121, 102, 194, 224, 208, 209, 204, 190, 71, 191, 226, 192, 192, 222, 224, 209, 195, 149, 210, 182}), this.f50165a.mo28917a(new int[]{4, 38, 200, 222, 216, 191, 188, 127, 205, 213, 222, 4, 197, 199, 213, 211, 205, 115, 156}));
            HashMap hashMap = new HashMap();
            String a = this.f50165a.mo28917a(new int[]{212, 38});
            MessageDigest b = spn.m35868b(this.f50165a.mo28917a(new int[]{127, 211, 206, 208, 4, 209, 222, 216, 229, 213, 197, 19, 207, 210, 206, 223, 53}));
            if (b != null) {
                b.update(str.getBytes());
                hashMap.put(a, m41503a(b.digest()));
                String a2 = m41503a(mediaDrm.getKeyRequest(openSession, this.f50165a.mo28917a(new int[]{131}).getBytes(), this.f50165a.mo28917a(new int[]{218, 191, 220, 145, 229, 203, 203, 145, 117, 195, 218, 188, 217, 191, 186, 195, 215, 221, 190, 226, 149, 206, 201, 203, 102, 220, 190, 188, 208, 186, 183, 186, 19, 214, 196, 222, 186, 154, 224, 210, 183, 191, 38}), 1, hashMap).getData());
                synchronized (vzg.f50281a) {
                    try {
                        mediaDrm.closeSession(openSession);
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                return a2;
            }
            throw new vww(5);
        } catch (MediaDrmException e) {
            throw new vww(1, e);
        } catch (RuntimeException e2) {
            throw new vww(2, e2);
        } catch (Throwable th2) {
            while (true) {
                th = th2;
            }
            throw th;
        }
    }
}
