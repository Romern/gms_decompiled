package p000;

import java.nio.ByteBuffer;

/* renamed from: blvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blvv extends blul implements blux {

    /* renamed from: f */
    public int f127898f = 0;

    /* renamed from: g */
    private final bluo f127899g = new blvu(this);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0078, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo66700a(bluq bluq) {
        if (bluq.mo66717b() != 2) {
            int i = this.f127898f;
            if (i != 2) {
                if (i != 1) {
                    bluw bluw = this.f127819b;
                    String valueOf = String.valueOf(bluq);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
                    sb.append("unexpected control packet ");
                    sb.append(valueOf);
                    bluw.mo13815a(new blut(sb.toString()));
                }
            }
            try {
                if (bluq.mo66717b() == 1) {
                    char c = (char) bluq.f127828b.getShort();
                    if (c == 1) {
                        char c2 = (char) bluq.f127828b.getShort();
                        if (c2 <= this.f127818a.mo66711a()) {
                            this.f127898f = 3;
                            mo66699a(c2);
                            if (bluq.f127828b.hasRemaining()) {
                                byte[] bArr = new byte[bluq.f127828b.remaining()];
                                bluq.f127828b.get(bArr);
                                this.f127819b.mo13818a(bArr);
                            }
                        } else {
                            throw new blut(String.format("server confirmed max packet size %s higher than connection's max packet size %s", Integer.valueOf(c2), Integer.valueOf(this.f127818a.mo66711a())));
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder(40);
                        sb2.append("unsupported protocol version ");
                        sb2.append((int) c);
                        throw new blut(sb2.toString());
                    }
                } else {
                    String valueOf2 = String.valueOf(bluq);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 48);
                    sb3.append("expected connection confirm packet but recevied ");
                    sb3.append(valueOf2);
                    throw new blut(sb3.toString());
                }
            } catch (blut e) {
                mo66702a(e);
            }
        } else {
            mo66705b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized void mo66705b() {
        super.mo66705b();
        this.f127898f = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo66709d() {
        return this.f127898f != 0;
    }

    /* renamed from: f */
    public final synchronized void mo66733f() {
        if (this.f127898f == 0) {
            this.f127898f = 1;
            int a = this.f127818a.mo66711a();
            ByteBuffer a2 = blup.m107607a();
            if (a2.remaining() <= 13) {
                bluq a3 = bluq.m107608a(0, a2.remaining() + 6);
                a3.f127828b.putShort(1);
                a3.f127828b.putShort(1);
                a3.f127828b.putShort((short) a);
                a3.f127828b.put(a2);
                a3.f127828b.rewind();
                mo66707c(a3).mo66727a(this.f127899g);
            } else {
                throw new IllegalArgumentException("Connection request control packet may contain at most 13 bytes of extra data.");
            }
        }
    }

    public blvv(blun blun, bluw bluw) {
        super(blun, bluw);
    }
}
