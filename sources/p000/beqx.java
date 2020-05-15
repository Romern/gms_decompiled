package p000;

/* renamed from: beqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beqx extends beqv {

    /* renamed from: b */
    final /* synthetic */ beqy f112094b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected beqx(beqy beqy) {
        super(beqy);
        this.f112094b = beqy;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60953a(long j, long j2, bfku bfku, bfku bfku2, bfku bfku3) {
        beqt beqt;
        beqt beqt2;
        bfku a = beqy.m95469a(bfku, this.f112094b.f112079c);
        this.f112094b.mo60959b(a);
        beqw.m95470a(bfku, a);
        this.f112094b.f112093q.mo62049a(bfos.ACCEL_SAMPLE_RATE, (int) Math.round(beqw.m95467a(bfku)));
        this.f112094b.f112081e.mo60944a(j, j2, bfgt.f113814d, bfku);
        this.f112094b.f112081e.mo60944a(j, j2, bfgt.f113819i, bfku2);
        this.f112094b.f112081e.mo60944a(j, j2, bfgt.f113821k, bfku3);
        beqy beqy = this.f112094b;
        if (beqy.f112095r != null && beqy.f112087k) {
            bfku a2 = beqy.m95469a(bfku3, beqy.f112079c);
            beqy beqy2 = this.f112094b;
            beqy2.f112095r.mo61129a(beqy2.f112088l, j, j2, a, a2);
        }
        int i = a.f114316b;
        if (i < 4) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Not enough accel samples for activity detection: ");
            sb.append(i);
            sb.toString();
            berf.m95533a(this.f112094b.f112093q, a.f114316b);
            beqt = beqt.m95451b((long) a.f114316b);
        } else {
            if (this.f112094b.f112083g != null) {
                mo60957c(j, j2, a);
            }
            beqt beqt3 = beqt.f112072c;
            if (this.f112094b.f112084h == null) {
                beqt2 = beqt3;
            } else {
                beqt2 = mo60956b(j, j2, a);
            }
            beqt beqt4 = beqt.f112072c;
            beqp beqp = this.f112094b.f112080d;
            if (beqp != null && beqp.f112061c) {
                beqt4 = mo60952a(j, j2, a);
            }
            beqt = beqw.m95468a(beqt2, beqt4);
        }
        this.f112094b.f112081e.mo60945a(beqt);
    }
}
