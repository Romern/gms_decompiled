package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: ahlo */
final /* synthetic */ class ahlo implements Runnable {

    /* renamed from: a */
    private final ahmn f67463a;

    /* renamed from: b */
    private final String f67464b;

    /* renamed from: c */
    private final buud f67465c;

    /* renamed from: d */
    private final ahkv f67466d;

    /* renamed from: e */
    private final CountDownLatch f67467e;

    public ahlo(ahmn ahmn, String str, buud buud, ahkv ahkv, CountDownLatch countDownLatch) {
        this.f67463a = ahmn;
        this.f67464b = str;
        this.f67465c = buud;
        this.f67466d = ahkv;
        this.f67467e = countDownLatch;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahmn.a(ahkv, java.lang.String, byte[], boolean):void
     arg types: [ahkv, java.lang.String, byte[], int]
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
    public final void run() {
        byte[] bArr;
        ahmn ahmn = this.f67463a;
        String str = this.f67464b;
        buud buud = this.f67465c;
        ahkv ahkv = this.f67466d;
        CountDownLatch countDownLatch = this.f67467e;
        ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("PCPHandler(%s) got CONNECTION_RESPONSE OfflineFrame from endpoint %s (with status %d).", ahmn.mo36958g().mo44188a(), str, Integer.valueOf(buud.f154935b));
        if (!ahkv.mo36722h(str)) {
            if (buud.f154935b == 0) {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("Endpoint %s has accepted the connection", str);
                ahkv.mo36726j(str);
            } else {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("Endpoint %s has rejected the connection", str);
                ahkv.mo36727k(str);
            }
            if ((buud.f154934a & 2) != 0) {
                bArr = buud.f154936c.getKey();
            } else {
                bArr = null;
            }
            ahmn.mo36846a(ahkv, str, bArr, true);
            countDownLatch.countDown();
            return;
        }
        ((bnsl) ahkm.f67363a.mo68388c()).mo68420a("Unexpected connection response from endpoint %s", str);
    }
}
