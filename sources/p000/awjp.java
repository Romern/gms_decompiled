package p000;

/* renamed from: awjp */
final /* synthetic */ class awjp implements Runnable {

    /* renamed from: a */
    private final awjt f94553a;

    public awjp(awjt awjt) {
        this.f94553a = awjt;
    }

    public final void run() {
        awjt awjt = this.f94553a;
        int childCount = awjt.f94559b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            awia.m79974a(awjt.f123962aG, awjt.f94559b.getChildAt(i));
        }
        awjt.f95357A.setVisibility(0);
    }
}
