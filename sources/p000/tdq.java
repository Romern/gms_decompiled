package p000;

import android.os.Handler;

/* renamed from: tdq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class tdq extends soa {

    /* renamed from: a */
    private final Handler f45702a;

    public tdq(Handler handler) {
        super(9);
        bmxy.m108581a(handler);
        this.f45702a = handler;
    }

    /* renamed from: a */
    public void mo26345a() {
        throw null;
    }

    /* renamed from: b */
    public void mo26346b() {
        throw null;
    }

    public final void run() {
        mo26345a();
        this.f45702a.post(new tdp(this));
    }
}
