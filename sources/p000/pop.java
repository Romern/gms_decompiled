package p000;

import com.google.android.gms.cast.CastDevice;
import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.Set;

/* renamed from: pop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pop extends poq {

    /* renamed from: c */
    private final CastDevice f39929c;

    /* renamed from: d */
    private final String f39930d;

    /* renamed from: e */
    private final Set f39931e = new HashSet();

    /* renamed from: f */
    private final long f39932f;

    public pop(pnl pnl, plx plx, CastDevice castDevice, Set set, String str, long j) {
        super(pnl, plx, true, false, "MdnsDeviceOnline");
        this.f39929c = castDevice;
        if (!set.isEmpty()) {
            this.f39931e.addAll(set);
        }
        this.f39930d = str;
        this.f39932f = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo23518a(pnl pnl) {
        pnm b = pnl.mo23487b(this.f39929c.mo17494a());
        if (b == null) {
            b = pnl.mo23482a(this.f39929c);
        }
        b.f39844a = this.f39929c;
        b.f39853j = this.f39930d;
        pno pno = null;
        b.mo23498a(this.f39931e, (Set) null);
        b.f39849f = this.f39932f;
        pnn pnn = b.f39846c;
        if (pnn == null) {
            pnn = new pnn();
            b.f39846c = pnn;
        }
        pnn.f39856a = true;
        C1240of c = pnl.mo23491c();
        if (c != null) {
            String str = (String) c.f26798a;
            poe poe = (poe) c.f26799b;
            if (poe == null) {
                poe = pnl.mo23485a(str, this.f39932f);
            }
            poe.mo23517a(b);
            CastDevice castDevice = this.f39929c;
            pns a = pnl.mo23483a(new InetSocketAddress(castDevice.f29715c, castDevice.f29719g));
            if (a != null) {
                pno = a.mo23508a(str);
            }
            if (pno != null) {
                pno.mo23503a();
            }
            if (cczq.m132283b()) {
                pnl.mo23490b(this.f39929c);
            }
        }
    }
}
