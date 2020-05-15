package p000;

import com.google.android.gms.cast.CastDevice;
import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.Set;

/* renamed from: pou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pou extends poq {

    /* renamed from: c */
    private final CastDevice f39943c;

    /* renamed from: d */
    private final String f39944d;

    /* renamed from: e */
    private final Set f39945e = new HashSet();

    /* renamed from: f */
    private final Set f39946f = new HashSet();

    /* renamed from: g */
    private final long f39947g;

    /* renamed from: h */
    private final String f39948h;

    /* renamed from: i */
    private final bsib f39949i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pou(pnl pnl, plx plx, CastDevice castDevice, String str, Set set, Set set2, String str2, long j, bsib bsib) {
        super(pnl, plx, true, false, "TcpProbingResult");
        this.f39943c = castDevice;
        if (!set.isEmpty()) {
            this.f39945e.addAll(set);
        }
        if (!set2.isEmpty()) {
            this.f39946f.addAll(set2);
        }
        this.f39944d = str2;
        this.f39947g = j;
        this.f39948h = str;
        this.f39949i = bsib;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23518a(pnl pnl) {
        pnm b = pnl.mo23487b(this.f39943c.mo17494a());
        if (b == null) {
            b = pnl.mo23482a(this.f39943c);
        }
        CastDevice castDevice = this.f39943c;
        InetSocketAddress inetSocketAddress = new InetSocketAddress(castDevice.f29715c, castDevice.f29719g);
        pns a = pnl.mo23483a(inetSocketAddress);
        if (a == null) {
            a = pnl.mo23488b(inetSocketAddress);
        }
        pno a2 = a.mo23508a(this.f39948h);
        if (a2 == null) {
            a2 = new pno(this.f39948h);
            a.mo23509a(a2);
        }
        a2.f39859c = this.f39947g;
        a2.f39858b = true;
        a2.mo23503a();
        poe a3 = pnl.mo23484a(this.f39948h);
        if (a3 == null) {
            a3 = pnl.mo23485a(this.f39948h, this.f39947g);
        }
        a3.mo23517a(b);
        b.f39844a = this.f39943c;
        b.f39853j = this.f39944d;
        b.mo23498a(this.f39945e, this.f39946f);
        b.f39849f = this.f39947g;
        bsib bsib = this.f39949i;
        if (bsib != null) {
            b.f39855l = bsib;
        }
    }
}
