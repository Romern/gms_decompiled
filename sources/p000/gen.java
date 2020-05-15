package p000;

import android.media.AudioTrack;
import com.google.android.gms.audiomodem.DsssEncoding;
import com.google.android.gms.audiomodem.DtmfEncoding;
import com.google.android.gms.audiomodem.Encoding;
import com.google.android.gms.audiomodem.NativeEncoder;

/* renamed from: gen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class gen {

    /* renamed from: a */
    public boolean f18054a;

    /* renamed from: b */
    public final Encoding f18055b;

    /* renamed from: c */
    public byte[] f18056c;

    /* renamed from: d */
    public bzwr f18057d;

    /* renamed from: e */
    public int f18058e;

    public gen(Encoding encoding) {
        this.f18055b = encoding;
    }

    /* renamed from: a */
    public final boolean mo11739a() {
        if (!gdy.m13001a()) {
            return false;
        }
        if (this.f18054a) {
            return true;
        }
        Encoding encoding = this.f18055b;
        int i = encoding.f9882a;
        if (i == 0) {
            DsssEncoding dsssEncoding = encoding.f9883b;
            srn srn = gdv.f17985a;
            cfnp.m140681d();
            String str = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
            String str2 = "a";
            if (NativeEncoder.nativeInitializeDsss(dsssEncoding.mo7321a(), dsssEncoding.f9860b, dsssEncoding.f9861c, dsssEncoding.f9862d, dsssEncoding.f9863e, dsssEncoding.f9864f, dsssEncoding.f9865g, dsssEncoding.f9866h, dsssEncoding.f9867i, dsssEncoding.f9868j, dsssEncoding.f9869k, cfnp.m140681d(), AudioTrack.getNativeOutputSampleRate(3), ((float) cfnp.f184595a.mo6606a().mo81707u()) / 1000.0f)) {
                this.f18058e = dsssEncoding.f9870l;
            } else {
                bnsl bnsl = (bnsl) gdv.f17985a.mo68387b();
                bnsl.mo68432a("gen", str2, 73, str);
                bnsl.mo68405a("Native initialization of DSSS encoder failed");
                return false;
            }
        } else if (i != 1) {
            bnsl bnsl2 = (bnsl) gdv.f17985a.mo68388c();
            bnsl2.mo68432a("gen", "a", 101, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Received an Encoder with unknown type");
            return false;
        } else {
            DtmfEncoding dtmfEncoding = encoding.f9884c;
            if (NativeEncoder.nativeInitializeDtmf(dtmfEncoding.mo7327c(), dtmfEncoding.f9874d, dtmfEncoding.f9875e, dtmfEncoding.f9876f, ((float) dtmfEncoding.f9877g) / 1000.0f, dtmfEncoding.f9878h, ((float) dtmfEncoding.mo7325a().f9843a) / 1000.0f, ((float) dtmfEncoding.mo7325a().f9844b) / 1000.0f, ((float) dtmfEncoding.mo7325a().f9845c) / 1000.0f, ((float) dtmfEncoding.mo7325a().f9846d) / 1000.0f, dtmfEncoding.mo7325a().f9847e, dtmfEncoding.mo7326b())) {
                this.f18058e = dtmfEncoding.f9879i;
            } else {
                bnsl bnsl3 = (bnsl) gdv.f17985a.mo68387b();
                bnsl3.mo68432a("gen", "a", 95, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Native initialization of DTMF encoder failed");
                return false;
            }
        }
        this.f18054a = true;
        return true;
    }
}
