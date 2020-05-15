package p000;

import android.bluetooth.le.AdvertiseCallback;
import com.google.android.gms.auth.proximity.RemoteDevice;
import java.util.Objects;

/* renamed from: jjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jjq {

    /* renamed from: a */
    public final RemoteDevice f22631a;

    /* renamed from: b */
    public final AdvertiseCallback f22632b;

    /* renamed from: c */
    public final long f22633c;

    public jjq(RemoteDevice remoteDevice, AdvertiseCallback advertiseCallback, long j) {
        this.f22631a = remoteDevice;
        this.f22632b = advertiseCallback;
        this.f22633c = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jjq) {
            jjq jjq = (jjq) obj;
            if (!this.f22631a.equals(jjq.f22631a) || !this.f22632b.equals(jjq.f22632b) || this.f22633c != jjq.f22633c) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f22631a, this.f22632b, Long.valueOf(this.f22633c));
    }
}
