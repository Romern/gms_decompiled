package p000;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: mjz */
final /* synthetic */ class mjz implements Runnable {

    /* renamed from: a */
    private final mka f33861a;

    /* renamed from: b */
    private final mps f33862b;

    /* renamed from: c */
    private final ByteBuffer f33863c;

    public mjz(mka mka, mps mps, ByteBuffer byteBuffer) {
        this.f33861a = mka;
        this.f33862b = mps;
        this.f33863c = byteBuffer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bd, code lost:
        if (r6 == 3) goto L_0x00bf;
     */
    public final void run() {
        mka mka = this.f33861a;
        mps mps = this.f33862b;
        ByteBuffer byteBuffer = this.f33863c;
        try {
            mkb mkb = mka.f33865b;
            int i = 1;
            sdo.m34970a(true);
            if (mkb.f33869d.get()) {
                int a = mpu.m25496a(mps.f34218b);
                if (a != 0) {
                    if (a == 4) {
                        mkb.f33866a.mo25418e("Stream error. Abandoning item and moving to next one, hopefully.", new Object[0]);
                        if (mkb.f33871f == null) {
                            mkb.mo20116a();
                        }
                        mkb.mo20117a(3);
                        return;
                    }
                }
                if (mkb.f33871f == null) {
                    int a2 = mpu.m25496a(mps.f34218b);
                    if (a2 != 0) {
                        if (a2 == 2) {
                            mkt mkt = mkb.f33867b;
                            if (byteBuffer.position() == 0 && byteBuffer.limit() == byteBuffer.array().length) {
                                byte[] array = byteBuffer.array();
                                bxus c = bxus.m123744c();
                                mkt.f33841a.mo20043b((mpm) GeneratedMessageLite.m124016a(mpm.f34178i, array, c));
                                return;
                            }
                            throw new RuntimeException("We don't yet support slices of byte buffers.");
                        }
                    }
                    int a3 = mpu.m25496a(mps.f34218b);
                    if (a3 != 0) {
                        if (a3 == 3) {
                            mkb.mo20116a();
                        }
                    }
                    mkb.f33866a.mo25418e("Invalid payload type", new Object[0]);
                    lys lys = mkb.f33870e;
                    int a4 = mpu.m25496a(mps.f34218b);
                    if (a4 != 0) {
                        i = a4;
                    }
                    lys.mo19754a(4, (long) (i - 1));
                    throw new mjr("Unknown/invalid payload type.");
                }
                int a5 = mpu.m25496a(mps.f34218b);
                if (a5 == 0) {
                }
                lys lys2 = mkb.f33870e;
                int a6 = mpu.m25496a(mps.f34218b);
                if (a6 != 0) {
                    i = a6;
                }
                lys2.mo19754a(3, (long) (i - 1));
                throw new mjr("Unexpected payload type while streaming.");
                int a7 = mpu.m25496a(mps.f34218b);
                if (a7 == 0 || a7 != 3) {
                    throw new RuntimeException("payloadType is not STREAM");
                }
                mkb.f33871f.mo20025a().write(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
                if (mps.f34220d) {
                    mkb.f33871f.mo20024a(1);
                    mkb.f33871f = null;
                }
            }
        } catch (IOException e) {
            mkb.f33866a.mo25417e("Exception while writing to stream.", e, new Object[0]);
            throw new RuntimeException(e);
        } catch (bxwf e2) {
            throw new RuntimeException("Invalid packet received", e2);
        } catch (mjr e3) {
            mkb.f33866a.mo25417e("Unexpected exception while processing usb data:", e3, new Object[0]);
            mka.f33865b.f33869d.set(false);
            mka.f33865b.f33867b.mo20095a();
        }
    }
}
