package p000;

import java.nio.ByteBuffer;

/* renamed from: blvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blvx extends blul implements blux {

    /* renamed from: f */
    public int f127901f = 0;

    /* renamed from: g */
    public int f127902g;

    /* renamed from: h */
    private final bluo f127903h = new blvw(this);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(int, int):int}
     arg types: [int, char]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo66700a(bluq bluq) {
        if (bluq.mo66717b() == 2) {
            mo66705b();
        } else if (this.f127901f != 0) {
            bluw bluw = this.f127819b;
            String valueOf = String.valueOf(bluq);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("unexpected control packet ");
            sb.append(valueOf);
            bluw.mo13815a(new blut(sb.toString()));
        } else {
            try {
                if (bluq.mo66717b() == 0) {
                    char c = (char) bluq.f127828b.getShort();
                    char c2 = (char) bluq.f127828b.getShort();
                    if (c > 1 || c2 <= 0) {
                        StringBuilder sb2 = new StringBuilder(56);
                        sb2.append("unsupported protocol versions ");
                        sb2.append((int) c);
                        sb2.append(" to ");
                        sb2.append((int) c2);
                        throw new blut(sb2.toString());
                    }
                    char c3 = (char) bluq.f127828b.getShort();
                    if (c3 != 0) {
                        this.f127902g = Math.min(this.f127818a.mo66711a(), (int) c3);
                    } else {
                        this.f127902g = this.f127818a.mo66711a();
                    }
                    if (bluq.f127828b.hasRemaining()) {
                        byte[] bArr = new byte[bluq.f127828b.remaining()];
                        bluq.f127828b.get(bArr);
                        this.f127819b.mo13818a(bArr);
                    }
                    this.f127901f = 1;
                    int i = this.f127902g;
                    ByteBuffer a = blup.m107607a();
                    if (a.remaining() <= 15) {
                        bluq a2 = bluq.m107608a(1, a.remaining() + 4);
                        a2.f127828b.putShort(1);
                        a2.f127828b.putShort((short) i);
                        a2.f127828b.put(a);
                        a2.f127828b.rewind();
                        mo66707c(a2).mo66727a(this.f127903h);
                        return;
                    }
                    throw new IllegalArgumentException("Connection confirm control packet may contain at most 15 bytes of extra data.");
                }
                String valueOf2 = String.valueOf(bluq);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 48);
                sb3.append("expected connection request packet but recevied ");
                sb3.append(valueOf2);
                throw new blut(sb3.toString());
            } catch (blut e) {
                mo66702a(e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final synchronized void mo66705b() {
        this.f127901f = 0;
        super.mo66705b();
    }

    /* renamed from: f */
    public final synchronized void mo66733f() {
        throw new UnsupportedOperationException();
    }

    public blvx(blun blun, bluw bluw) {
        super(blun, bluw);
    }
}
