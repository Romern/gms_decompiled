package p000;

import java.util.concurrent.TimeUnit;

/* renamed from: addq */
final /* synthetic */ class addq implements Runnable {

    /* renamed from: a */
    private final adds f61444a;

    public addq(adds adds) {
        this.f61444a = adds;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r1 = r0.f61449c;
        r3 = r1.f61453a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
        if (r3 != null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0067, code lost:
        r1 = r1.f61454b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        if (r1 == null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        r1.mo43433a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        throw new java.lang.IllegalStateException("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0077, code lost:
        r3.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        r0.mo33362a(2, r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        r3 = r0.f61452f.f61459a;
        r4 = r0.f61448b;
        r5 = android.os.Message.obtain();
        r5.what = 1;
        r5.arg1 = r1.f61455a;
        r5.replyTo = r4;
        r4 = new android.os.Bundle();
        r4.putBoolean("oneWay", false);
        r4.putString("pkg", r3.getPackageName());
        r4.putBundle("data", r1.f61457c);
        r5.setData(r4);
     */
    public final void run() {
        adds adds = this.f61444a;
        while (true) {
            synchronized (adds) {
                if (adds.f61447a != 2) {
                    return;
                }
                if (!adds.f61450d.isEmpty()) {
                    addu addu = (addu) adds.f61450d.poll();
                    adds.f61451e.put(addu.f61455a, addu);
                    adds.f61452f.f61460b.schedule(new addr(adds, addu), 30, TimeUnit.SECONDS);
                } else {
                    adds.mo33364b();
                    return;
                }
            }
        }
    }
}
