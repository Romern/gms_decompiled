package p000;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.projection.common.BufferPool;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.TimeUnit;

/* renamed from: ohn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ohn implements WritableByteChannel {

    /* renamed from: a */
    public final ByteBuffer[] f37652a;

    /* renamed from: b */
    public final ByteBuffer f37653b;

    /* renamed from: c */
    public final ByteBuffer f37654c;

    /* renamed from: d */
    public int f37655d;

    /* renamed from: e */
    public int f37656e;

    /* renamed from: f */
    public int f37657f;

    /* renamed from: g */
    public byte f37658g;

    /* renamed from: h */
    public int f37659h;

    /* renamed from: i */
    public boolean f37660i;

    /* renamed from: j */
    final /* synthetic */ ohp f37661j;

    /* renamed from: k */
    private boolean f37662k;

    /* renamed from: l */
    private boolean f37663l;

    /* renamed from: m */
    private final ogp f37664m;

    public ohn(ohp ohp, Bundle bundle, ogp ogp) {
        this.f37661j = ohp;
        this.f37664m = ogp;
        ByteBuffer[][] byteBufferArr = (ByteBuffer[][]) ojq.m28925a(ByteBuffer[][].class, bundle.getBinder("receiver_buffers"));
        boolean z = false;
        this.f37652a = byteBufferArr[0];
        this.f37653b = byteBufferArr[1][0];
        this.f37654c = byteBufferArr[2][0];
        int[] intArray = bundle.getIntArray("receiver_state");
        this.f37655d = intArray[0];
        this.f37656e = intArray[1];
        this.f37657f = intArray[2];
        byte b = (byte) intArray[3];
        this.f37658g = b;
        this.f37662k = m28756a(b, 8);
        this.f37663l = m28756a(this.f37658g, 2);
        this.f37659h = intArray[4];
        this.f37660i = intArray[5] == 1 ? true : z;
    }

    /* renamed from: a */
    private final void m28755a(byte[] bArr, int i) {
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i3 += i4;
            if (i3 < i) {
                int i5 = i - i3;
                int i6 = this.f37655d;
                boolean z = true;
                if (i6 == 0) {
                    i4 = Math.min(4 - this.f37653b.position(), i5);
                    this.f37653b.put(bArr, i3, i4);
                    if (this.f37653b.position() == 4) {
                        this.f37653b.rewind();
                        this.f37656e = this.f37653b.get() & 255;
                        byte b = this.f37653b.get();
                        this.f37658g = b;
                        this.f37662k = m28756a(b, 8);
                        this.f37663l = m28756a(this.f37658g, 2);
                        char c = (char) this.f37653b.getShort();
                        this.f37657f = c;
                        this.f37659h = c;
                        ohp ohp = this.f37661j;
                        bnsn bnsn = ohp.f37670a;
                        ofo ofo = ohp.f37675f;
                        if (ofo != null) {
                            ofo.mo22105b(this.f37656e, this.f37658g, c);
                        }
                        if (!m28756a(this.f37658g, 1)) {
                            this.f37655d = 2;
                            this.f37653b.clear();
                        } else {
                            this.f37655d = 1;
                        }
                    }
                } else if (i6 == 1) {
                    if (!m28756a(this.f37658g, 2)) {
                        i4 = Math.min(this.f37653b.remaining(), i5);
                        this.f37653b.put(bArr, i3, i4);
                        if (this.f37653b.position() == 8) {
                            this.f37653b.position(4);
                            i2 = this.f37653b.getInt();
                        } else {
                            continue;
                        }
                    } else {
                        i2 = this.f37657f;
                        i4 = 0;
                    }
                    if (i2 < 0) {
                        StringBuilder sb = new StringBuilder(23);
                        sb.append("Wrong size: ");
                        sb.append(i2);
                        throw new ohg(sb.toString());
                    } else if (this.f37652a[this.f37656e] == null) {
                        this.f37653b.clear();
                        this.f37652a[this.f37656e] = BufferPool.getBuffer(i2);
                        this.f37652a[this.f37656e].limit(i2);
                        this.f37655d = 2;
                    } else {
                        throw new ohg("Received duplicate first fragment");
                    }
                } else if (i6 == 2) {
                    ByteBuffer byteBuffer = this.f37652a[this.f37656e];
                    if (byteBuffer != null) {
                        if (!this.f37662k) {
                            i4 = Math.min(this.f37659h, i5);
                            byteBuffer.put(bArr, i3, i4);
                            int i7 = this.f37659h - i4;
                            this.f37659h = i7;
                            if (i7 != 0) {
                                continue;
                            }
                        } else {
                            ohp ohp2 = this.f37661j;
                            bnsn bnsn2 = ohp.f37670a;
                            if (ohp2.f37674e == null && !this.f37660i) {
                                bnsi d = ohp.f37670a.mo68390d();
                                d.mo68432a("ohn", "a", 888, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                d.mo68410a("Received an encrypted frame on channel %d with flags %d with no ssl context, waiting.", this.f37656e, this.f37658g);
                                try {
                                    this.f37661j.f37673d.tryAcquire(250, TimeUnit.MILLISECONDS);
                                } catch (InterruptedException e) {
                                }
                                if (this.f37661j.f37674e != null) {
                                    z = false;
                                }
                                this.f37660i = z;
                            }
                            if (!this.f37660i) {
                                i4 = Math.min(this.f37657f - this.f37654c.position(), i5);
                                this.f37654c.put(bArr, i3, i4);
                                if (this.f37654c.position() == this.f37657f) {
                                    this.f37654c.flip();
                                    this.f37661j.f37674e.mo22241a(this.f37654c, byteBuffer);
                                    if (this.f37663l) {
                                        byteBuffer.limit(byteBuffer.position());
                                    }
                                    this.f37654c.clear();
                                } else {
                                    continue;
                                }
                            } else {
                                i4 = Math.min(this.f37659h, i5);
                                int i8 = this.f37659h - i4;
                                this.f37659h = i8;
                                if (i8 == 0) {
                                    bnsi d2 = ohp.f37670a.mo68390d();
                                    d2.mo68432a("ohn", "a", 904, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    d2.mo68425a("Ignoring encrypted frame with no ssl: %d %d 0x%X", Integer.valueOf(this.f37657f), Integer.valueOf(this.f37656e), Byte.valueOf(this.f37658g));
                                } else {
                                    continue;
                                }
                            }
                        }
                        if (this.f37663l) {
                            ohp ohp3 = this.f37661j;
                            bnsn bnsn3 = ohp.f37670a;
                            if (ohp3.f37672c.get()) {
                                int position = byteBuffer.position();
                                int limit = byteBuffer.limit();
                                byteBuffer.rewind();
                                if (this.f37660i && this.f37662k) {
                                    bnsi d3 = ohp.f37670a.mo68390d();
                                    d3.mo68432a("ohn", "a", 943, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    d3.mo68405a("Encrypted frame with no ssl, skipping message");
                                    this.f37660i = false;
                                } else if (position == limit) {
                                    this.f37664m.mo22123a(this.f37656e, byteBuffer, m28756a(this.f37658g, 4));
                                } else {
                                    throw new ohg("Fragment underflow");
                                }
                                this.f37652a[this.f37656e] = null;
                            } else {
                                throw new IOException("should stop");
                            }
                        } else if (byteBuffer.position() >= byteBuffer.limit()) {
                            throw new ohg("Fragment overflow");
                        }
                        this.f37655d = 0;
                    } else {
                        throw new ohg("Unexpected continuation fragment");
                    }
                } else {
                    i4 = 0;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static final boolean m28756a(int i, int i2) {
        return (i & i2) != 0;
    }

    public final void close() {
        ohp ohp = this.f37661j;
        bnsn bnsn = ohp.f37670a;
        if (ohp.f37672c.getAndSet(false)) {
            this.f37661j.f37679j.mo22122a(bpdo.READER_CLOSE);
        }
    }

    public final boolean isOpen() {
        throw new UnsupportedOperationException();
    }

    public final int write(ByteBuffer byteBuffer) {
        int i;
        int min;
        boolean z;
        int i2;
        if (this.f37655d == 3) {
            return -1;
        }
        int i3 = 2;
        int i4 = 1;
        try {
            if (byteBuffer.limit() > 0) {
                ohp ohp = this.f37661j;
                bnsn bnsn = ohp.f37670a;
                ogo ogo = ohp.f37679j;
                SystemClock.elapsedRealtime();
                ogs ogs = ogo.f37575a;
                bnsn bnsn2 = ogs.f37577a;
                ogs.f37592p.mo21319ay();
            }
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = i6 + i5;
                if (i7 >= limit) {
                    break;
                }
                int i8 = limit - i7;
                int i9 = this.f37655d;
                if (i9 == 0) {
                    i = Math.min(4 - this.f37653b.position(), i8);
                    this.f37653b.put(array, i7, i);
                    if (this.f37653b.position() == 4) {
                        this.f37653b.rewind();
                        this.f37656e = this.f37653b.get() & 255;
                        byte b = this.f37653b.get();
                        this.f37658g = b;
                        this.f37662k = m28756a(b, 8);
                        this.f37663l = m28756a(this.f37658g, i3);
                        char c = (char) this.f37653b.getShort();
                        this.f37657f = c;
                        this.f37659h = c;
                        ohp ohp2 = this.f37661j;
                        bnsn bnsn3 = ohp.f37670a;
                        ofo ofo = ohp2.f37675f;
                        if (ofo != null) {
                            ofo.mo22105b(this.f37656e, this.f37658g, c);
                        }
                        if (!m28756a(this.f37658g, i4)) {
                            this.f37655d = i3;
                            this.f37653b.clear();
                        } else {
                            this.f37655d = i4;
                        }
                    }
                } else if (i9 == i4) {
                    if (!m28756a(this.f37658g, i3)) {
                        i = Math.min(this.f37653b.remaining(), i8);
                        this.f37653b.put(array, i7, i);
                        if (this.f37653b.position() == 8) {
                            this.f37653b.position(4);
                            i2 = this.f37653b.getInt();
                        } else {
                            i6 = i;
                            i5 = i7;
                        }
                    } else {
                        i2 = this.f37657f;
                        i = 0;
                    }
                    if (i2 < 0) {
                        StringBuilder sb = new StringBuilder(23);
                        sb.append("Wrong size: ");
                        sb.append(i2);
                        throw new ohg(sb.toString());
                    } else if (this.f37652a[this.f37656e] == null) {
                        this.f37653b.clear();
                        this.f37652a[this.f37656e] = BufferPool.getBuffer(i2);
                        this.f37652a[this.f37656e].limit(i2);
                        this.f37655d = i3;
                    } else {
                        throw new ohg("Received duplicate first fragment");
                    }
                } else if (i9 == i3) {
                    ByteBuffer byteBuffer2 = this.f37652a[this.f37656e];
                    if (byteBuffer2 != null) {
                        if (!this.f37662k) {
                            min = Math.min(this.f37659h, i8);
                            byteBuffer2.put(array, i7, min);
                            int i10 = this.f37659h - min;
                            this.f37659h = i10;
                            if (i10 != 0) {
                                i6 = min;
                                i5 = i7;
                            }
                        } else {
                            ohp ohp3 = this.f37661j;
                            bnsn bnsn4 = ohp.f37670a;
                            if (ohp3.f37674e == null && !this.f37660i) {
                                bnsi d = ohp.f37670a.mo68390d();
                                d.mo68432a("ohn", "a", 888, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                d.mo68410a("Received an encrypted frame on channel %d with flags %d with no ssl context, waiting.", this.f37656e, this.f37658g);
                                try {
                                    this.f37661j.f37673d.tryAcquire(250, TimeUnit.MILLISECONDS);
                                } catch (InterruptedException e) {
                                }
                                if (this.f37661j.f37674e == null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                this.f37660i = z;
                            }
                            if (!this.f37660i) {
                                min = Math.min(this.f37657f - this.f37654c.position(), i8);
                                this.f37654c.put(array, i7, min);
                                if (this.f37654c.position() == this.f37657f) {
                                    this.f37654c.flip();
                                    this.f37661j.f37674e.mo22241a(this.f37654c, byteBuffer2);
                                    if (this.f37663l) {
                                        byteBuffer2.limit(byteBuffer2.position());
                                    }
                                    this.f37654c.clear();
                                } else {
                                    i3 = 2;
                                    i4 = 1;
                                    i6 = min;
                                    i5 = i7;
                                }
                            } else {
                                min = Math.min(this.f37659h, i8);
                                int i11 = this.f37659h - min;
                                this.f37659h = i11;
                                if (i11 == 0) {
                                    bnsi d2 = ohp.f37670a.mo68390d();
                                    d2.mo68432a("ohn", "a", 904, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    d2.mo68425a("Ignoring encrypted frame with no ssl: %d %d 0x%X", Integer.valueOf(this.f37657f), Integer.valueOf(this.f37656e), Byte.valueOf(this.f37658g));
                                } else {
                                    i3 = 2;
                                    i4 = 1;
                                    i6 = min;
                                    i5 = i7;
                                }
                            }
                        }
                        if (this.f37663l) {
                            ohp ohp4 = this.f37661j;
                            bnsn bnsn5 = ohp.f37670a;
                            if (ohp4.f37672c.get()) {
                                int position = byteBuffer2.position();
                                int limit2 = byteBuffer2.limit();
                                byteBuffer2.rewind();
                                if (this.f37660i && this.f37662k) {
                                    bnsi d3 = ohp.f37670a.mo68390d();
                                    d3.mo68432a("ohn", "a", 943, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    d3.mo68405a("Encrypted frame with no ssl, skipping message");
                                    this.f37660i = false;
                                } else if (position == limit2) {
                                    this.f37664m.mo22123a(this.f37656e, byteBuffer2, m28756a(this.f37658g, 4));
                                } else {
                                    throw new ohg("Fragment underflow");
                                }
                                this.f37652a[this.f37656e] = null;
                            } else {
                                throw new IOException("should stop");
                            }
                        } else if (byteBuffer2.position() >= byteBuffer2.limit()) {
                            throw new ohg("Fragment overflow");
                        }
                        this.f37655d = 0;
                    } else {
                        throw new ohg("Unexpected continuation fragment");
                    }
                } else {
                    i = 0;
                }
                i3 = 2;
                i4 = 1;
                i6 = i;
                i5 = i7;
            }
        } catch (IOException | ohg e2) {
            bnsi d4 = ohp.f37670a.mo68390d();
            d4.mo68437a(e2);
            d4.mo68432a("ohn", "write", 800, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d4.mo68405a("Receiver:");
            this.f37655d = 3;
            this.f37661j.f37672c.set(false);
            if (e2 instanceof ohg) {
                ogo ogo2 = this.f37661j.f37679j;
                bnsi c2 = ogs.f37577a.mo68388c();
                c2.mo68432a("ogo", "a", 123, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c2.mo68405a("Framing Error encountered.");
                ogo2.f37575a.mo22128a(0, ogs.m28686a(), false, false, new ogv(false, false, 0));
                ogo2.f37575a.mo22130a(true);
            } else {
                this.f37661j.f37679j.mo22122a(bpdo.READER_IO_ERROR);
            }
        }
        int i12 = this.f37655d;
        if (i12 == 0) {
            return 4 - this.f37653b.position();
        }
        if (i12 == 1) {
            return 8 - this.f37653b.position();
        }
        if (i12 == 2) {
            return this.f37659h;
        }
        return -1;
    }

    public ohn(ohp ohp, ogp ogp) {
        this.f37661j = ohp;
        this.f37664m = ogp;
        this.f37652a = new ByteBuffer[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        this.f37653b = ByteBuffer.allocate(8);
        this.f37654c = ByteBuffer.allocate(AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
    }
}
