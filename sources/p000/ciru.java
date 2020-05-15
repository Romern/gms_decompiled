package p000;

import java.nio.channels.Channels;

/* renamed from: ciru */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciru implements cisy {

    /* renamed from: a */
    final /* synthetic */ cirw f191294a;

    public ciru(cirw cirw) {
        this.f191294a = cirw;
    }

    /* renamed from: a */
    public final void mo86442a() {
        cirw cirw = this.f191294a;
        if (cirw.f191303g == null) {
            cisx cisx = cirw.f191305i;
            String str = cisx.f191359a;
            cisx.f191370l = 10;
            cirw.f191302f.setDoOutput(true);
            cirw.f191302f.connect();
            cirw.f191305i.f191370l = 12;
            cirw.f191304h = cirw.f191302f.getOutputStream();
            cirw.f191303g = Channels.newChannel(cirw.f191304h);
        }
        this.f191294a.f191297a.set(0);
        this.f191294a.mo86444a(new cirt(this));
    }
}
