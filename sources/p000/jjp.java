package p000;

import com.google.android.gms.auth.proximity.RemoteDevice;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* renamed from: jjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jjp implements Runnable {

    /* renamed from: a */
    public volatile boolean f22628a = false;

    /* renamed from: b */
    private final RemoteDevice f22629b;

    /* renamed from: c */
    private final WeakReference f22630c;

    public jjp(RemoteDevice remoteDevice, jju jju) {
        this.f22629b = remoteDevice;
        this.f22630c = new WeakReference(jju);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jjp) {
            jjp jjp = (jjp) obj;
            if (!this.f22629b.equals(jjp.f22629b) || !((jju) this.f22630c.get()).equals(jjp.f22630c.get())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f22629b, this.f22630c);
    }

    public final void run() {
        jju jju;
        if (!this.f22628a && (jju = (jju) this.f22630c.get()) != null) {
            jju.mo13797a(this.f22629b);
        }
    }
}
