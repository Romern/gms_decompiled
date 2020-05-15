package p000;

/* renamed from: aayw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aayw implements Runnable {

    /* renamed from: a */
    final /* synthetic */ aayy f56852a;

    public aayw(aayy aayy) {
        this.f56852a = aayy;
    }

    public final void run() {
        aayy aayy = this.f56852a;
        aayy.f56859f = false;
        if (aayy.getView() != null) {
            aayy aayy2 = this.f56852a;
            if (!aayy2.f56860g) {
                aayy2.f56857d = System.currentTimeMillis();
                this.f56852a.f56856c.setVisibility(8);
                this.f56852a.f56855b.setVisibility(0);
                this.f56852a.f56854a.setVisibility(0);
            }
        }
    }
}
