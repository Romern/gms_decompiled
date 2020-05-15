package p000;

import java.net.SocketAddress;
import java.util.List;

/* renamed from: cibc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cibc {

    /* renamed from: a */
    public List f189699a;

    /* renamed from: b */
    public int f189700b;

    /* renamed from: c */
    public int f189701c;

    public cibc(List list) {
        this.f189699a = list;
    }

    /* renamed from: a */
    public final void mo85886a() {
        this.f189700b = 0;
        this.f189701c = 0;
    }

    /* renamed from: b */
    public final SocketAddress mo85887b() {
        return (SocketAddress) ((chrq) this.f189699a.get(this.f189700b)).f189052b.get(this.f189701c);
    }
}
