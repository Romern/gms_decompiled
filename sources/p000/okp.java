package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: okp */
final /* synthetic */ class okp implements Runnable {

    /* renamed from: a */
    private final okx f37860a;

    /* renamed from: b */
    private final okw f37861b;

    /* renamed from: c */
    private final nqi f37862c;

    /* renamed from: d */
    private final ByteBuffer f37863d;

    public okp(okx okx, okw okw, nqi nqi, ByteBuffer byteBuffer) {
        this.f37860a = okx;
        this.f37861b = okw;
        this.f37862c = nqi;
        this.f37863d = byteBuffer;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, java.lang.String, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    public final void run() {
        okx okx = this.f37860a;
        okw okw = this.f37861b;
        nqi nqi = this.f37862c;
        try {
            okw.mo22268a(nqi, this.f37863d);
        } catch (IOException e) {
            bnsi d = okx.f37875a.mo68390d();
            d.mo68432a("okx", "a", (int) BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            int i = okx.f37882h;
            String a = ofp.m28659a(i);
            if (i != 0) {
                d.mo68422a("%s Could not write message %d", (Object) a, nqi.f36415e);
                if (ccpv.m131197f()) {
                    okx.f37877c.mo21328b(bpdn.CAR_SERVICE_CONNECTION_ERROR, bpdo.WRITER_IO_ERROR, "Failed to write message");
                }
            } else {
                throw null;
            }
        }
        synchronized (okx.f37880f) {
            okx.f37881g--;
        }
    }
}
