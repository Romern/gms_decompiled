package p000;

import android.content.Context;
import android.os.RemoteException;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.audiomodem.DecodedToken;
import com.google.android.gms.audiomodem.DecodedTokensProtoHelper;
import com.google.android.gms.audiomodem.DsssEncoding;
import com.google.android.gms.audiomodem.DtmfEncoding;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.NativeDecoder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: gej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gej implements gcd {

    /* renamed from: a */
    public final ggg f18030a = new ggg(gcw.class);

    /* renamed from: b */
    public final ggg f18031b = new ggg(gcx.class);

    /* renamed from: c */
    private volatile int f18032c = 0;

    /* renamed from: d */
    private long f18033d;

    /* renamed from: e */
    private long f18034e;

    /* renamed from: f */
    private int f18035f = 0;

    /* renamed from: g */
    private int f18036g;

    /* renamed from: h */
    private int f18037h;

    /* renamed from: i */
    private int f18038i;

    /* renamed from: j */
    private final Encoding f18039j;

    /* renamed from: k */
    private final int f18040k;

    /* renamed from: l */
    private final int f18041l;

    /* renamed from: m */
    private final int f18042m;

    /* renamed from: n */
    private final long f18043n;

    /* renamed from: o */
    private final geu f18044o;

    /* renamed from: p */
    private final boolean f18045p;

    public gej(Context context, Encoding encoding, int i, int i2, int i3, boolean z) {
        this.f18039j = encoding;
        this.f18040k = i;
        this.f18041l = i2;
        this.f18042m = i3;
        this.f18043n = (long) m13016a((long) ((int) cfnp.f184595a.mo6606a().mo81690d()));
        this.f18044o = (geu) ahgz.m55754a(context, geu.class);
        this.f18045p = z;
        if (!m13017d()) {
            this.f18044o.mo11750a(14, encoding);
        }
    }

    /* renamed from: a */
    private final int m13016a(long j) {
        double d = (double) j;
        Double.isNaN(d);
        double d2 = (double) this.f18041l;
        Double.isNaN(d2);
        double d3 = (d / 1000.0d) * d2;
        double d4 = (double) this.f18042m;
        Double.isNaN(d4);
        double d5 = d3 * d4;
        return (int) (d5 + d5);
    }

    /* renamed from: d */
    private final boolean m13017d() {
        if (this.f18035f == 2) {
            bnsl bnsl = (bnsl) gdv.f17985a.mo68390d();
            bnsl.mo68432a("gej", "d", 79, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("tryInitialize failed because TokenDecoder has been released");
            return false;
        } else if (!gdy.m13001a()) {
            return false;
        } else {
            if (this.f18035f != 0) {
                return true;
            }
            Encoding encoding = this.f18039j;
            int i = encoding.f9882a;
            if (i == 0) {
                DsssEncoding dsssEncoding = encoding.f9883b;
                srn srn = gdv.f17985a;
                cfnp.m140681d();
                if (NativeDecoder.nativeInitializeDsss(this.f18040k, dsssEncoding.mo7321a(), dsssEncoding.f9860b, dsssEncoding.f9861c, dsssEncoding.f9862d, dsssEncoding.f9863e, dsssEncoding.f9864f, dsssEncoding.f9865g, dsssEncoding.f9866h, dsssEncoding.f9867i, dsssEncoding.f9868j, dsssEncoding.f9869k, cfnp.m140681d(), ((float) cfnp.m140679b()) / 1000.0f, (float) cfnp.f184595a.mo6606a().mo81691e(), (int) cfnp.f184595a.mo6606a().mo81696j(), (float) this.f18041l, this.f18042m, (float) cfnp.f184595a.mo6606a().mo81692f(), this.f18045p)) {
                    this.f18037h = dsssEncoding.f9859a;
                    this.f18038i = dsssEncoding.f9870l;
                } else {
                    bnsl bnsl2 = (bnsl) gdv.f17985a.mo68387b();
                    bnsl2.mo68432a("gej", "d", 117, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Native initialization of DSSS decoder failed");
                    return false;
                }
            } else if (i != 1) {
                bnsl bnsl3 = (bnsl) gdv.f17985a.mo68388c();
                bnsl3.mo68432a("gej", "d", (int) MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Received an Encoding with unknown type");
                return false;
            } else {
                DtmfEncoding dtmfEncoding = encoding.f9884c;
                if (NativeDecoder.nativeInitializeDtmf(this.f18040k, dtmfEncoding.mo7327c(), dtmfEncoding.f9874d, dtmfEncoding.f9875e, dtmfEncoding.f9876f, ((float) dtmfEncoding.f9877g) / 1000.0f, dtmfEncoding.f9878h, ((float) cfnp.m140679b()) / 1000.0f, (int) cfnp.f184595a.mo6606a().mo81697k(), (float) this.f18041l, this.f18042m, ((float) dtmfEncoding.mo7325a().f9843a) / 1000.0f, ((float) dtmfEncoding.mo7325a().f9844b) / 1000.0f, ((float) dtmfEncoding.mo7325a().f9845c) / 1000.0f, ((float) dtmfEncoding.mo7325a().f9846d) / 1000.0f, dtmfEncoding.mo7325a().f9847e, (float) cfnp.f184595a.mo6606a().mo81693g(), dtmfEncoding.mo7326b())) {
                    this.f18037h = dtmfEncoding.f9873c;
                    this.f18038i = dtmfEncoding.f9879i;
                } else {
                    bnsl bnsl4 = (bnsl) gdv.f17985a.mo68387b();
                    bnsl4.mo68432a("gej", "d", 147, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68405a("Native initialization of DTMF decoder failed");
                    return false;
                }
            }
            this.f18035f = 1;
            this.f18036g = NativeDecoder.nativeGetMaxSafeInputSize(this.f18040k);
            return true;
        }
    }

    /* renamed from: b */
    public final void mo11640b() {
        for (gcw gcw : (gcw[]) this.f18030a.f18130a) {
            gcw.mo11655a(2);
        }
    }

    /* renamed from: c */
    public final synchronized void mo11731c() {
        if (this.f18035f == 1) {
            srn srn = gdv.f17985a;
            NativeDecoder.nativeWipeInternalData(this.f18040k);
            NativeDecoder.nativeRelease(this.f18040k);
        }
        this.f18035f = 2;
    }

    /* renamed from: a */
    public final synchronized void mo11638a() {
        if (this.f18035f == 1) {
            srn srn = gdv.f17985a;
            NativeDecoder.nativeWipeInternalData(this.f18040k);
        }
        this.f18032c = 0;
        this.f18034e = 0;
    }

    /* renamed from: a */
    public final synchronized void mo11639a(ByteBuffer byteBuffer) {
        int i;
        if (!m13017d()) {
            this.f18044o.mo11750a(14, this.f18039j);
            return;
        }
        int remaining = byteBuffer.remaining();
        if (remaining > this.f18036g) {
            this.f18044o.mo11750a(15, this.f18039j);
            bnsl bnsl = (bnsl) gdv.f17985a.mo68388c();
            bnsl.mo68432a("gej", "a", 195, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68411a("Sample size %s exceeds maximum %s", remaining, this.f18036g);
        }
        if (this.f18045p) {
            NativeDecoder.nativeProcessSamplesWithHotsound(this.f18040k, byteBuffer, byteBuffer.position(), remaining);
        } else {
            NativeDecoder.nativeProcessSamples(this.f18040k, byteBuffer, byteBuffer.position(), remaining);
        }
        int i2 = 0;
        if (!NativeDecoder.nativeDetectBroadcaster(this.f18040k)) {
            this.f18034e += (long) remaining;
            if (this.f18032c == 1) {
                this.f18032c = 2;
            }
            gcx[] gcxArr = (gcx[]) this.f18031b.f18130a;
            for (gcx gcx : gcxArr) {
                if (gcx.f17894b && this.f18034e > ((long) m13016a(gcx.f17895c))) {
                    this.f18031b.mo11791b(gcx);
                    try {
                        ((gff) gcx.f17980d).mo11763c();
                    } catch (RemoteException e) {
                    }
                }
            }
        } else {
            if (this.f18032c != 1) {
                this.f18032c = 1;
                this.f18034e = 0;
            }
            gcx[] gcxArr2 = (gcx[]) this.f18031b.f18130a;
            for (gcx gcx2 : gcxArr2) {
                if (gcx2.f17893a) {
                    this.f18031b.mo11791b(gcx2);
                    try {
                        ((gff) gcx2.f17980d).mo11762a();
                    } catch (RemoteException e2) {
                    }
                }
            }
        }
        long j = this.f18033d + ((long) remaining);
        this.f18033d = j;
        if (j >= this.f18043n) {
            if (!m13017d()) {
                this.f18044o.mo11750a(14, this.f18039j);
            } else {
                DecodedTokensProtoHelper decodedTokensProtoHelper = new DecodedTokensProtoHelper();
                NativeDecoder.nativeGetTokens(this.f18040k, decodedTokensProtoHelper, this.f18037h, this.f18038i);
                bxwc bxwc = decodedTokensProtoHelper.build().f171664a;
                HashSet hashSet = new HashSet();
                gcw[] gcwArr = (gcw[]) this.f18030a.f18130a;
                for (gcw gcw : gcwArr) {
                    hashSet.add(gcw.f17981e);
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < bxwc.size(); i3++) {
                        arrayList.add(new DecodedToken(((bzwo) bxwc.get(i3)).f171661b.mo73780k(), i3));
                    }
                    try {
                        ((gfm) gcw.f17980d).mo11767a(arrayList);
                    } catch (RemoteException e3) {
                    }
                }
                int size = bxwc.size();
                while (i2 < size) {
                    bzwo bzwo = (bzwo) bxwc.get(i2);
                    Iterator it = hashSet.iterator();
                    while (true) {
                        i = i2 + 1;
                        if (!it.hasNext()) {
                            break;
                        }
                        this.f18044o.mo11751a((String) it.next(), 7, this.f18039j, bzwo.f171661b.mo73780k());
                    }
                    i2 = i;
                }
            }
            this.f18033d = 0;
        }
    }
}
