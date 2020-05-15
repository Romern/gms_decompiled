package p000;

import android.os.DeadObjectException;
import android.os.RemoteException;

/* renamed from: ahkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahkm {

    /* renamed from: a */
    public static final srn f67363a = ahfr.m55664a("NearbyConnections");

    /* renamed from: a */
    public static String m55981a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("[ ");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format("0x%02x ", Byte.valueOf(bArr[i])));
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m55982a(RemoteException remoteException, String str, Object... objArr) {
        if (remoteException instanceof DeadObjectException) {
            bnsl bnsl = (bnsl) f67363a.mo68390d();
            bnsl.mo68432a("ahkm", "a", 37, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("%s: DeadObjectException thrown. Client process has died.", String.format(str, objArr));
            return;
        }
        bnsl bnsl2 = (bnsl) f67363a.mo68388c();
        bnsl2.mo68437a(remoteException);
        bnsl2.mo68432a("ahkm", "a", 41, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68436a(str, objArr);
    }
}
