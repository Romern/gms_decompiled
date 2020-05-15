package p000;

import com.google.android.gms.auth.proximity.RemoteDevice;
import org.json.JSONException;

/* renamed from: iuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class iuu implements bqfp {

    /* renamed from: a */
    final /* synthetic */ RemoteDevice f21822a;

    /* renamed from: b */
    final /* synthetic */ iuv f21823b;

    public iuu(iuv iuv, RemoteDevice remoteDevice) {
        this.f21823b = iuv;
        this.f21822a = remoteDevice;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        byte[] bArr = (byte[]) obj;
        try {
            iuv.f21824j.mo25414c("Successfully decrypted challenge (%d bytes), sending response...", Integer.valueOf(bArr.length));
            this.f21823b.f21825a.mo13350a(this.f21822a.f11138b, new ivd(bArr).mo13362a());
        } catch (JSONException e) {
            iuv.f21824j.mo25417e("Error when serializing decrypted message.", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        iuv.f21824j.mo25417e("Error when decrypting message message.", th, new Object[0]);
        try {
            this.f21823b.f21825a.mo13350a(this.f21822a.f11138b, new ivd(new byte[0]).mo13362a());
        } catch (JSONException e) {
            iuv.f21824j.mo25417e("Error when serializing failed decrypt.", e, new Object[0]);
        }
    }
}
