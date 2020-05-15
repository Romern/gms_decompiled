package p000;

/* renamed from: abwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abwm extends acpn {

    /* renamed from: a */
    final /* synthetic */ abwo f58632a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abwm(abwo abwo, bqbd bqbd, int i, String str) {
        super(bqbd, 1, i, str, null);
        this.f58632a = abwo;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        boolean z;
        abwo abwo;
        int i;
        abwk abwk;
        abwn abwn = new abwn(this.f58632a);
        this.f58632a.f58635a.mo32380a(abwn);
        int i2 = abwn.f58634b;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 != 0) {
            if (i3 == 1) {
                abwo abwo2 = this.f58632a;
                abwp abwp = abwo2.f58638d;
                synchronized (abwp) {
                    if (abwp.f58643d == abwo2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sdo.m34970a(z);
                    if (abwp.f58642c.size() > 1) {
                        if (((Boolean) acaw.f59376c.mo58455c()).booleanValue()) {
                            if (abwp.f58644e) {
                                abwo abwo3 = (abwo) abwp.f58642c.remove();
                                boolean a = abwo3.mo32387a();
                                int i4 = abwo3.f58637c;
                                abwe abwe = (abwe) abwo3.f58635a;
                                if (briw.m114086a(abwe)) {
                                    abwk = new abwc(abwe);
                                    i = i4;
                                } else {
                                    abwk = new abwf(abwe);
                                    i = i4;
                                }
                                while (true) {
                                    abwo abwo4 = (abwo) abwp.f58642c.peek();
                                    if (abwo4 == null || abwo4.mo32387a() != a || !abwk.mo32379a(abwo4.f58635a)) {
                                        abwo = new abwo(bqbd.BATCH_TASK, abwk.mo32378a(), a, i, abwp);
                                    } else {
                                        i += abwo4.f58637c;
                                        abwp.f58642c.remove();
                                    }
                                }
                                abwo = new abwo(bqbd.BATCH_TASK, abwk.mo32378a(), a, i, abwp);
                                abwp.f58643d = abwo;
                            }
                        }
                    }
                    abwo = (abwo) abwp.f58642c.poll();
                    abwp.f58643d = abwo;
                }
                if (abwo != null) {
                    abwp.f58641b.mo32995d(abwo.mo32388b());
                }
            } else if (i3 == 2) {
                abwo abwo5 = this.f58632a;
                abwp abwp2 = abwo5.f58638d;
                abwq abwq = abwo5.f58636b;
                int i5 = abwq.f58646a;
                abwq.f58646a = i5 + 1;
                double min = Math.min(Math.pow(1.5d, (double) i5) * 250.0d, 4000.0d);
                double random = Math.random();
                abwp2.mo32390a(abwo5, (long) (min * ((((random + random) - 4.0d) * 0.25d) + 1.0d)));
            }
            return null;
        } else {
            throw new IllegalStateException();
        }
    }
}
