package p000;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: ahqm */
final /* synthetic */ class ahqm implements Runnable {

    /* renamed from: a */
    private final ahra f67800a;

    /* renamed from: b */
    private final String f67801b;

    /* renamed from: c */
    private final ahkv f67802c;

    /* renamed from: d */
    private final CountDownLatch f67803d;

    public ahqm(ahra ahra, String str, ahkv ahkv, CountDownLatch countDownLatch) {
        this.f67800a = ahra;
        this.f67801b = str;
        this.f67802c = ahkv;
        this.f67803d = countDownLatch;
    }

    public final void run() {
        ahra ahra = this.f67800a;
        String str = this.f67801b;
        ahkv ahkv = this.f67802c;
        CountDownLatch countDownLatch = this.f67803d;
        List singletonList = Collections.singletonList(str);
        List a = ahra.f67855d.mo36988a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            ahqy ahqy = (ahqy) a.get(i);
            ahqx a2 = ahqy.mo36979a(str);
            if (a2 != null) {
                ahqy.mo36982a(singletonList);
                if (ahqy.mo36984c().isEmpty()) {
                    ahra.f67855d.mo36990b(ahqy.mo36978a());
                    ahqy.mo36985d();
                }
                ahis ahis = new ahis();
                ahis.mo36542b(ahqy.mo36978a());
                ahis.mo36540a(2);
                ahis.mo36543c(ahqy.f67847a.mo36900b());
                ahis.mo36541a(a2.f67846c);
                ahkv.mo36696a(str, ahis.f67256a);
                if (ahqy.f67848b) {
                    ahkv.f67390f.mo36668b(str, ahqy.mo36978a(), bvih.ENDPOINT_IO_ERROR);
                } else {
                    ahkv.f67390f.mo36658a(str, ahqy.mo36978a(), bvih.ENDPOINT_IO_ERROR);
                }
            }
        }
        countDownLatch.countDown();
    }
}
