package p000;

import com.google.android.gms.auth.proximity.RemoteDevice;

/* renamed from: jjn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jjn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ RemoteDevice f22624a;

    /* renamed from: b */
    final /* synthetic */ jju f22625b;

    public jjn(jju jju, RemoteDevice remoteDevice) {
        this.f22625b = jju;
        this.f22624a = remoteDevice;
    }

    public final void run() {
        if (!this.f22625b.f22646i.contains(this.f22624a.f11138b)) {
            this.f22625b.f22641d.add(this.f22624a.f11138b);
            this.f22625b.mo13802c();
        }
    }
}
