package p000;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;

/* renamed from: bfdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfdd {

    /* renamed from: a */
    protected buan f113465a;

    /* renamed from: b */
    protected int[] f113466b;

    /* renamed from: c */
    public long[] f113467c;

    /* renamed from: d */
    public long[] f113468d;

    /* renamed from: e */
    public final bfcz f113469e;

    public bfdd() {
        this.f113469e = new bfcz();
    }

    /* renamed from: a */
    public final int mo61454a() {
        return (this.f113466b.length * 4) + ((this.f113467c.length + this.f113468d.length) * 8);
    }

    /* renamed from: b */
    public final int mo61457b() {
        return this.f113465a.size();
    }

    /* renamed from: c */
    public final bfdc mo61459c() {
        return new bfdc(this);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buad.a(java.lang.Object, boolean):java.lang.Object
     arg types: [java.lang.String, int]
     candidates:
      buad.a(java.lang.Object, java.lang.Object):int
      buad.a(java.lang.Object, boolean):java.lang.Object */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: btzw.a(java.lang.Object, boolean):int
     arg types: [java.lang.String, int]
     candidates:
      buaq.a(buaq, java.nio.ByteBuffer):void
      btzw.a(java.lang.Object, boolean):int */
    /* renamed from: a */
    public final bfni mo61455a(String str, long j) {
        bfni bfni = (bfni) ((buad) this.f113465a).mo72511a((Object) str, false);
        if (bfni == null) {
            return null;
        }
        this.f113468d[((btzw) ((buad) this.f113465a).f153157d).mo72523a((Object) str, true)] = j;
        bfcz bfcz = this.f113469e;
        bfcz.f113453a++;
        bfcz.f113454b++;
        return bfni;
    }

    /* renamed from: b */
    public final void mo61458b(ByteBuffer byteBuffer) {
        try {
            this.f113465a.mo72534c(byteBuffer);
            int a = mo61454a();
            if (byteBuffer.position() + a + 12 <= byteBuffer.limit()) {
                byteBuffer.putInt(a);
                byteBuffer.position(byteBuffer.position() + 8);
                IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
                asIntBuffer.put(this.f113466b);
                byteBuffer.position(byteBuffer.position() + (asIntBuffer.position() * 4));
                LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
                asLongBuffer.put(this.f113467c);
                asLongBuffer.put(this.f113468d);
                byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
                buar.m119184a(byteBuffer, (byte) 1, a);
                return;
            }
            throw new BufferOverflowException();
        } catch (IllegalArgumentException | BufferOverflowException e) {
            throw new IOException(e);
        }
    }

    public bfdd(byte[] bArr) {
        this();
        buad buad = new buad(new bfdb(this));
        btzx btzx = new btzx(buad, new btzt(new btzw(buad.f153156c)));
        ((btzw) ((btzt) btzx.f153148b).f153158a).f153135a = bubb.f153203a;
        ((buad) btzx.f153147a).f153143a = bfni.f114479e;
        this.f113465a = btzx.mo72528a();
    }

    /* renamed from: a */
    public final void mo61456a(ByteBuffer byteBuffer) {
        try {
            bfdd bfdd = new bfdd();
            bubb bubb = bubb.f153203a;
            buaz buaz = bfni.f114479e;
            bfdd.getClass();
            buad buad = new buad(new bfdb(bfdd));
            buad.f153143a = buaz;
            btzw btzw = new btzw(buad.f153156c);
            btzw.f153135a = bubb;
            buaq.m119173a(btzw, byteBuffer);
            buan.m119156a(buad, btzw, byteBuffer);
            bfdd.f113465a = buad;
            if (buar.m119185a(byteBuffer, (byte) 1)) {
                IntBuffer asIntBuffer = byteBuffer.asIntBuffer();
                asIntBuffer.get(bfdd.f113466b);
                byteBuffer.position(byteBuffer.position() + (asIntBuffer.position() * 4));
                LongBuffer asLongBuffer = byteBuffer.asLongBuffer();
                asLongBuffer.get(bfdd.f113467c);
                asLongBuffer.get(bfdd.f113468d);
                byteBuffer.position(byteBuffer.position() + (asLongBuffer.position() * 8));
                bfdc c = bfdd.mo61459c();
                while (c.hasNext()) {
                    c.mo61448b();
                    try {
                        int a = ((buad) this.f113465a).mo72531a(c.mo61450d(), (bfni) c.f113463a.mo72502a());
                        if (a < 0) {
                            a ^= -1;
                        }
                        this.f113466b[a] = c.mo61447a();
                        this.f113467c[a] = c.f113464b.f113467c[c.f113463a.mo72557g()];
                        this.f113468d[a] = c.f113464b.f113468d[c.f113463a.mo72557g()];
                    } catch (NullPointerException e) {
                        throw new IOException(e);
                    }
                }
                return;
            }
            throw new IllegalArgumentException("The read checksum is not equal to the calculated checksum.");
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | BufferUnderflowException e2) {
            throw new IOException(e2);
        }
    }
}
