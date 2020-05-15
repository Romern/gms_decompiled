package p000;

import java.util.concurrent.CountDownLatch;

/* renamed from: ahkz */
final /* synthetic */ class ahkz implements Runnable {

    /* renamed from: a */
    private final ahlh f67413a;

    /* renamed from: b */
    private final String f67414b;

    /* renamed from: c */
    private final CountDownLatch f67415c;

    public ahkz(ahlh ahlh, String str, CountDownLatch countDownLatch) {
        this.f67413a = ahlh;
        this.f67414b = str;
        this.f67415c = countDownLatch;
    }

    public final void run() {
        ahlh ahlh = this.f67413a;
        String str = this.f67414b;
        CountDownLatch countDownLatch = this.f67415c;
        try {
            if (ahlh.f67443i == bvif.UNKNOWN_MEDIUM) {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("BandwidthUpgradeManager has processed endpoint disconnection for %s because there is no current BandwidthUpgradeMedium.", str);
            } else {
                ahna ahna = (ahna) ahlh.f67440f.remove(str);
                if (ahna != null) {
                    ahna.mo36796a(6);
                }
                ahlh.f67441g.remove(str);
                ahlh.mo36787a(str);
                ahlh.f67442h.remove(str);
                if (ahlh.f67436b.mo36880b() <= 1) {
                    ((ahll) ahlh.f67439e.get(ahlh.f67443i)).mo36793a();
                    ahlh.f67443i = bvif.UNKNOWN_MEDIUM;
                }
            }
        } finally {
            countDownLatch.countDown();
        }
    }
}
