package p000;

import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: pwp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pwp {

    /* renamed from: a */
    public final pwn f40508a;

    /* renamed from: b */
    public final qav f40509b;

    /* renamed from: c */
    public final qat f40510c;

    /* renamed from: d */
    public final AtomicLong f40511d = new AtomicLong(0);

    /* renamed from: e */
    public MulticastSocket f40512e;

    /* renamed from: f */
    public InetAddress f40513f;

    public pwp(pwn pwn, qat qat) {
        this.f40508a = pwn;
        this.f40509b = new qav("MulticastManager");
        this.f40510c = qat;
    }
}
