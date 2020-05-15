package p000;

import java.net.URI;

/* renamed from: cisj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cisj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f191327a;

    /* renamed from: b */
    final /* synthetic */ cisx f191328b;

    public cisj(cisx cisx, String str) {
        this.f191328b = cisx;
        this.f191327a = str;
    }

    public final void run() {
        cisx cisx = this.f191328b;
        cisx.f191374p = URI.create(cisx.f191371m).resolve(this.f191327a).toString();
        cisx cisx2 = this.f191328b;
        cisx2.f191364f.add(cisx2.f191374p);
        this.f191328b.mo86475a(2, 3, new cisi(this));
    }
}
