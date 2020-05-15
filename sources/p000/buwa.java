package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothServerSocket;
import android.content.Context;
import android.os.Build;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: buwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class buwa implements bvdc {

    /* renamed from: a */
    public final BluetoothAdapter f155112a;

    /* renamed from: b */
    public final buxb f155113b;

    /* renamed from: c */
    public final buwe f155114c;

    /* renamed from: d */
    public final Set f155115d;

    /* renamed from: e */
    public final AtomicBoolean f155116e = new AtomicBoolean(false);

    /* renamed from: f */
    BluetoothServerSocket f155117f;

    /* renamed from: g */
    public bvat f155118g;

    public buwa(Context context) {
        this.f155113b = (buxb) ahgz.m55754a(context, buxb.class);
        this.f155114c = (buwe) ahgz.m55754a(context, buwe.class);
        this.f155115d = new HashSet();
        this.f155112a = BluetoothAdapter.getDefaultAdapter();
    }

    /* renamed from: a */
    public static void m120558a(Context context) {
        int i = Build.VERSION.SDK_INT;
        buxb buxb = (buxb) ahgz.m55755b(context, buxb.class);
        if (buxb == null || !buxb.mo73224a()) {
            throw new bvdl(buxb.class, buwa.class);
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bxxc mo73125c() {
        return buyn.f155316e;
    }

    /* renamed from: a */
    public final bvbr mo73118a(bvat bvat) {
        this.f155118g = bvat;
        return new buvz(this);
    }

    /* renamed from: a */
    public final void mo73122a(bvda bvda) {
        synchronized (this.f155115d) {
            for (buwd buwd : this.f155115d) {
                this.f155114c.mo73280b(buwd);
            }
        }
        this.f155113b.mo73225b(bvda);
    }

    /* renamed from: a */
    public final void mo73163a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                bnsl bnsl = (bnsl) bvcm.f155598a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("buwa", "a", 149, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("BluetoothRfcommAccept: Error closing connection");
            }
        }
    }
}
