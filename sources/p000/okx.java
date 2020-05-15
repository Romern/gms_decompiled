package p000;

import android.os.ParcelFileDescriptor;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: okx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class okx implements oko {

    /* renamed from: a */
    public static final bnsn f37875a = odk.m28481a("CAR.XFER");

    /* renamed from: b */
    static final okm f37876b = new oks();

    /* renamed from: c */
    public final ojm f37877c;

    /* renamed from: d */
    public final Executor f37878d;

    /* renamed from: e */
    public final Map f37879e;

    /* renamed from: f */
    public final Object f37880f = new Object();

    /* renamed from: g */
    public int f37881g;

    /* renamed from: h */
    public final int f37882h;

    /* renamed from: i */
    private final Executor f37883i;

    /* renamed from: j */
    private okv f37884j;

    /* renamed from: k */
    private okw f37885k;

    /* renamed from: a */
    public final void mo22253a() {
        if (this.f37882h != 0) {
            synchronized (this.f37880f) {
                okv okv = this.f37884j;
                okw okw = this.f37885k;
                this.f37884j = null;
                this.f37885k = null;
                this.f37881g = 0;
                if (okv != null) {
                    Executor executor = this.f37878d;
                    okv.getClass();
                    executor.execute(new okq(okv));
                }
                if (okw != null) {
                    Executor executor2 = this.f37883i;
                    okw.getClass();
                    executor2.execute(new okr(okw));
                }
            }
            return;
        }
        throw null;
    }

    public okx(int i, ojm ojm, bmzi bmzi, Map map) {
        this.f37882h = i;
        this.f37877c = ojm;
        this.f37878d = (Executor) bmzi.mo6606a();
        this.f37883i = (Executor) bmzi.mo6606a();
        this.f37879e = map;
    }

    /* renamed from: a */
    public final void mo22254a(int i) {
        synchronized (this.f37880f) {
            if (this.f37882h != 0) {
                Integer valueOf = Integer.valueOf(i);
                this.f37879e.remove(valueOf);
                this.f37879e.put(valueOf, f37876b);
            } else {
                throw null;
            }
        }
    }

    /* renamed from: a */
    public final void mo22255a(int i, okm okm) {
        synchronized (this.f37880f) {
            if (this.f37882h != 0) {
                this.f37879e.put(Integer.valueOf(i), okm);
            } else {
                throw null;
            }
        }
    }

    /* renamed from: a */
    public final void mo22256a(ParcelFileDescriptor parcelFileDescriptor) {
        if (this.f37882h != 0) {
            synchronized (this.f37880f) {
                okv okv = this.f37884j;
                if (okv != null) {
                    okv.mo22266c();
                }
                okw okw = this.f37885k;
                if (okw != null) {
                    okw.mo22267a();
                }
                this.f37884j = new okv(this, parcelFileDescriptor);
                this.f37885k = new okw(this, parcelFileDescriptor);
                okv okv2 = this.f37884j;
                bnsi d = f37875a.mo68390d();
                d.mo68432a("okv", "b", 446, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                int i = okv2.f37868a.f37882h;
                String a = ofp.m28659a(i);
                if (i != 0) {
                    d.mo68420a("%s Start executor and read messages", a);
                    okv2.f37868a.f37878d.execute(new oku(okv2));
                } else {
                    throw null;
                }
            }
            return;
        }
        throw null;
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
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo22269a(okw okw, nqi nqi, ByteBuffer byteBuffer) {
        try {
            okw.mo22268a(nqi, byteBuffer);
        } catch (IOException e) {
            bnsi d = f37875a.mo68390d();
            d.mo68432a("okx", "a", (int) BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            int i = this.f37882h;
            String a = ofp.m28659a(i);
            if (i != 0) {
                d.mo68422a("%s Could not write message %d", (Object) a, nqi.f36415e);
                if (ccpv.m131197f()) {
                    this.f37877c.mo21328b(bpdn.CAR_SERVICE_CONNECTION_ERROR, bpdo.WRITER_IO_ERROR, "Failed to write message");
                }
            } else {
                throw null;
            }
        }
        synchronized (this.f37880f) {
            this.f37881g--;
        }
    }

    /* renamed from: a */
    public final boolean mo22257a(int i, ogv ogv, int i2, ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        bxvd da = nqi.f36409i.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        nqi nqi = (nqi) da.f164949b;
        int i3 = nqi.f36411a | 8;
        nqi.f36411a = i3;
        nqi.f36415e = i;
        boolean z = ogv.f37604a;
        int i4 = i3 | 4;
        nqi.f36411a = i4;
        nqi.f36414d = z;
        boolean z2 = ogv.f37605b;
        nqi.f36411a = i4 | 32;
        nqi.f36417g = z2;
        int remaining = duplicate.remaining();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        nqi nqi2 = (nqi) da.f164949b;
        int i5 = nqi2.f36411a | 1;
        nqi2.f36411a = i5;
        nqi2.f36412b = remaining;
        int i6 = i5 | 2;
        nqi2.f36411a = i6;
        nqi2.f36413c = i2;
        int i7 = ogv.f37606c;
        nqi2.f36411a = i6 | 64;
        nqi2.f36418h = i7;
        nqi nqi3 = (nqi) da.mo74062i();
        synchronized (this.f37880f) {
            okw okw = this.f37885k;
            if (okw == null) {
                return false;
            }
            int i8 = this.f37881g;
            if (i8 < 1024) {
                this.f37881g = i8 + 1;
                this.f37883i.execute(new okp(this, okw, nqi3, duplicate));
                return true;
            }
            throw new okn();
        }
    }
}
