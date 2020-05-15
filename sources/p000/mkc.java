package p000;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: mkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mkc extends soa {

    /* renamed from: a */
    private static final lvn f33873a = new lvn("UsbReceiverThread");

    /* renamed from: b */
    private final mkt f33874b;

    /* renamed from: c */
    private final mkb f33875c;

    public mkc(mkt mkt, mkb mkb) {
        super(9);
        this.f33874b = mkt;
        this.f33875c = mkb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a0, code lost:
        throw new p000.mjr(java.lang.String.format(java.util.Locale.US, "Size of the fragment payload exceeds expectations (%d actual vs %d expected).", java.lang.Integer.valueOf(r2.f34219c), 10485760));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b8, code lost:
        throw new p000.mjr("Such byte buffers are not yet supported.");
     */
    public final void run() {
        mkt mkt;
        int i;
        try {
            mkb mkb = this.f33875c;
            while (true) {
                try {
                    i = mkb.f33868c.mo20131a(4).getInt();
                    if (i < 0 || i > 1024) {
                        mkb.f33870e.mo19754a(1, (long) i);
                    } else {
                        ByteBuffer a = mkb.f33868c.mo20131a(i);
                        if (a.position() == 0 && a.limit() == a.capacity()) {
                            mps mps = (mps) GeneratedMessageLite.m124016a(mps.f34215e, a.array(), bxus.m123744c());
                            mkb.f33866a.mo25412b("Received: %d bytes.", Integer.valueOf(mps.f34219c));
                            int i2 = mps.f34219c;
                            if (i2 < 0 || i2 > 10485760) {
                                mkb.f33870e.mo19754a(2, (long) i2);
                            } else {
                                ByteBuffer a2 = mkb.f33868c.mo20131a(i2);
                                if (a2.limit() - a2.position() == mps.f34219c) {
                                    mka mka = mkb.f33872g;
                                    mka.f33864a.execute(new mjz(mka, mps, a2));
                                } else {
                                    throw new RuntimeException("Remaining payload does not match payloadSize");
                                }
                            }
                        }
                    }
                } catch (bxwf e) {
                    mkb.f33866a.mo25418e("Could not parse header!", new Object[0]);
                    throw new mjr(e);
                } catch (Throwable th) {
                    mkb.f33869d.set(false);
                    mka mka2 = mkb.f33872g;
                    mka2.f33864a.execute(new mjy(mkb));
                    throw th;
                }
            }
            mkb.f33870e.mo19754a(1, (long) i);
            throw new mjr(String.format(Locale.US, "Size of the fragment header exceeds expectations (%d actual vs %d expected).", Integer.valueOf(i), 1024));
        } catch (mjp e2) {
            f33873a.mo25411b("Usb connection shutting down (maybe expected).", e2, new Object[0]);
            mkt = this.f33874b;
            mkt.mo20137f();
        } catch (IOException | mjr e3) {
            try {
                f33873a.mo25417e("Unhandled exception; shutting down.", e3, new Object[0]);
                mkt = this.f33874b;
                mkt.mo20137f();
            } catch (Throwable th2) {
                this.f33874b.mo20137f();
                throw th2;
            }
        }
    }
}
