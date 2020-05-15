package p000;

import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: ahmc */
final /* synthetic */ class ahmc implements Callable {

    /* renamed from: a */
    private final ahmn f67512a;

    /* renamed from: b */
    private final ahkv f67513b;

    /* renamed from: c */
    private final String f67514c;

    /* renamed from: d */
    private final byte[] f67515d;

    /* renamed from: e */
    private final aigo f67516e;

    public ahmc(ahmn ahmn, ahkv ahkv, String str, byte[] bArr, aigo aigo) {
        this.f67512a = ahmn;
        this.f67513b = ahkv;
        this.f67514c = str;
        this.f67515d = bArr;
        this.f67516e = aigo;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahmn.a(ahkv, java.lang.String, byte[], boolean):void
     arg types: [ahkv, java.lang.String, ?[OBJECT, ARRAY], int]
     candidates:
      ahmn.a(ahkv, java.lang.String, com.google.android.gms.nearby.connection.DiscoveryOptions, aigh):int
      ahmn.a(ahkv, java.lang.String, byte[], aigo):int
      ahmn.a(ahkv, java.lang.String, ahna, bvif):void
      ahmn.a(ahkv, java.lang.String, bvif, int):void
      ahmn.a(buuj, java.lang.String, ahkv, bvif):void
      ahmn.a(java.lang.String, byse, java.lang.String, byte[]):void
      ahqi.a(ahkv, java.lang.String, com.google.android.gms.nearby.connection.DiscoveryOptions, aigh):int
      ahqi.a(ahkv, java.lang.String, byte[], aigo):int
      ahnm.a(buuj, java.lang.String, ahkv, bvif):void
      ahmy.a(java.lang.String, byse, java.lang.String, byte[]):void
      ahmn.a(ahkv, java.lang.String, byte[], boolean):void */
    public final Object call() {
        ahmn ahmn = this.f67512a;
        ahkv ahkv = this.f67513b;
        String str = this.f67514c;
        byte[] bArr = this.f67515d;
        aigo aigo = this.f67516e;
        ((bnsl) ahkm.f67363a.mo68390d()).mo68418a("Client %d has accepted the connection with endpoint %s", ahkv.mo36706b(), str);
        ahmj ahmj = (ahmj) ahmn.f67551h.get(str);
        if (ahmj == null) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68418a("Client %d invoked acceptConnection() to endpointId %s with whom we don't have a pending connection.", ahkv.mo36706b(), str);
            return 8011;
        }
        try {
            ahmj.f67530c.mo36799a(ahoy.m56309a(0, bArr));
            ((bnsl) ahkm.f67363a.mo68390d()).mo68418a("In acceptConnection(), client %d sent CONNECTION_RESPONSE OfflineFrame to endpoint %s", ahkv.mo36706b(), str);
            ahmj.f67539l.mo74495b();
            ahmj.f67528a.mo36692a(str, aigo);
            ahmn.mo36846a(ahkv, str, (byte[]) null, false);
            return 0;
        } catch (IOException e) {
            ((bnsl) ahkm.f67363a.mo68387b()).mo68418a("Client %d failed to write connection request acceptance to endpoint %s", ahkv.mo36706b(), str);
            ahmn.mo36852b(ahkv, str);
            return 8012;
        }
    }
}
