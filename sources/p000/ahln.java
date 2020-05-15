package p000;

import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: ahln */
final /* synthetic */ class ahln implements Callable {

    /* renamed from: a */
    private final ahmn f67460a;

    /* renamed from: b */
    private final ahkv f67461b;

    /* renamed from: c */
    private final String f67462c;

    public ahln(ahmn ahmn, ahkv ahkv, String str) {
        this.f67460a = ahmn;
        this.f67461b = ahkv;
        this.f67462c = str;
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
        ahmn ahmn = this.f67460a;
        ahkv ahkv = this.f67461b;
        String str = this.f67462c;
        ((bnsl) ahkm.f67363a.mo68390d()).mo68418a("Client %d has rejected the connection with endpoint %s", ahkv.mo36706b(), str);
        ahmj ahmj = (ahmj) ahmn.f67551h.get(str);
        if (ahmj == null) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68418a("Client %d invoked rejectConnection() to endpointId %s with whome we don't have a pending connection.", ahkv.mo36706b(), str);
            return 8011;
        }
        try {
            ahmj.f67530c.mo36799a(ahoy.m56309a(8004, (byte[]) null));
            ((bnsl) ahkm.f67363a.mo68390d()).mo68418a("In rejectConnection(), client %d sent CONNECTION_RESPONSE OfflineFrame to endpoint %s", ahkv.mo36706b(), str);
            ahmj.f67528a.mo36724i(str);
            ahmn.mo36846a(ahkv, str, (byte[]) null, false);
            return 0;
        } catch (IOException e) {
            ((bnsl) ahkm.f67363a.mo68387b()).mo68418a("Client %d failed to write connection request rejection to endpoint %s", ahkv.mo36706b(), str);
            ahmn.mo36852b(ahkv, str);
            return 8012;
        }
    }
}
