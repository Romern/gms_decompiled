package p000;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* renamed from: caty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class caty implements catz {
    /* renamed from: a */
    public final List mo57846a(String str) {
        if (str != null) {
            return Arrays.asList(InetAddress.getAllByName(str));
        }
        throw new UnknownHostException("hostname == null");
    }
}
