package p000;

import com.google.android.location.reporting.server.RemoteDevice;
import java.text.Collator;
import java.util.Comparator;

/* renamed from: bgzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgzn implements Comparator {

    /* renamed from: a */
    final /* synthetic */ Collator f118163a;

    public bgzn(Collator collator) {
        this.f118163a = collator;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        boolean z;
        RemoteDevice remoteDevice = (RemoteDevice) obj;
        RemoteDevice remoteDevice2 = (RemoteDevice) obj2;
        boolean z2 = remoteDevice.f150871c;
        if (z2 != remoteDevice2.f150871c) {
            return !z2 ? -1 : 1;
        }
        Long l = remoteDevice.f150873e;
        boolean z3 = false;
        if (l != null) {
            z = false;
        } else {
            z = true;
        }
        if (remoteDevice2.f150873e == null) {
            z3 = true;
        }
        if (z != z3) {
            return l != null ? -1 : 1;
        }
        int compare = this.f118163a.compare(remoteDevice.f150870b, remoteDevice2.f150870b);
        if (compare != 0) {
            return compare;
        }
        Long l2 = remoteDevice.f150873e;
        if (l2 != null && !l2.equals(remoteDevice2.f150873e)) {
            return bgzo.m100454a(remoteDevice.f150873e.longValue(), remoteDevice2.f150873e.longValue());
        }
        return bgzo.m100454a((long) remoteDevice.f150869a, (long) remoteDevice2.f150869a);
    }
}
