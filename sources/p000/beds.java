package p000;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* renamed from: beds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beds {

    /* renamed from: a */
    public static final byte[] f106982a = {0, 0, 0, 0};

    /* renamed from: b */
    public static final byte[] f106983b = {0, 0, 0};

    /* renamed from: c */
    public final bedk f106984c;

    /* renamed from: d */
    public final bedn f106985d;

    /* renamed from: e */
    public final long f106986e;

    public beds(bedk bedk, bedn bedn, long j) {
        bmxy.m108581a(bedk);
        this.f106984c = bedk;
        bmxy.m108581a(bedn);
        this.f106985d = bedn;
        this.f106986e = j;
    }

    /* renamed from: a */
    public final byte[] mo58588a() {
        char c;
        ByteBuffer put = ByteBuffer.allocate(16).put(f106982a);
        ByteBuffer put2 = ByteBuffer.allocate(12).putInt((int) this.f106985d.f106978a).putInt((int) TimeUnit.MILLISECONDS.toSeconds(this.f106986e)).put(f106983b);
        bedn bedn = this.f106985d;
        boolean z = bedn.f106979b;
        if (!bedn.f106980c) {
            c = 0;
        } else {
            c = 2;
        }
        return put.put(put2.put(c | z ? (byte) 1 : 0).array()).array();
    }

    public final String toString() {
        return String.format("{device: %s, state: %s, at time: %s}", this.f106984c, this.f106985d, Long.valueOf(this.f106986e));
    }
}
