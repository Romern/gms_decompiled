package p000;

import com.felicanetworks.mfc.FSCEventListener;

/* renamed from: brfw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brfw implements FSCEventListener {

    /* renamed from: a */
    final /* synthetic */ brfx f142786a;

    public brfw(brfx brfx) {
        this.f142786a = brfx;
    }

    public final void errorOccurred(int i, String str) {
        brhb e = this.f142786a.f142788b.f142790b.f142794d.mo69513e();
        e.f142844b = this.f142786a.f142788b.f142790b.f142793c;
        e.f142846d = Integer.valueOf(i);
        e.f142847e = str;
        this.f142786a.f142788b.f142790b.f142794d.f142818f.mo69531a(7, e);
        brfy brfy = this.f142786a.f142788b;
        brfy.f142790b.f142794d.mo69506a(brfy.f142789a);
        brfz brfz = this.f142786a.f142788b.f142790b;
        brfz.f142794d.f142819g.execute(new brfv(brfz.f142791a, i, str));
        this.f142786a.f142788b.f142790b.f142794d.mo69514e(8);
        this.f142786a.f142788b.f142790b.f142794d.mo69509c();
    }

    public final void finished(int i) {
        brhb e = this.f142786a.f142788b.f142790b.f142794d.mo69513e();
        e.f142844b = this.f142786a.f142788b.f142790b.f142793c;
        e.f142845c = Integer.valueOf(i);
        this.f142786a.f142788b.f142790b.f142794d.f142818f.mo69531a(5, e);
        brfy brfy = this.f142786a.f142788b;
        brfy.f142790b.f142794d.mo69506a(brfy.f142789a);
        brfz brfz = this.f142786a.f142788b.f142790b;
        brfz.f142794d.f142819g.execute(new brfu(brfz.f142791a, i));
        this.f142786a.f142788b.f142790b.f142794d.mo69515f(2);
        this.f142786a.f142788b.f142790b.f142794d.mo69509c();
    }

    public final byte[] operationRequested(int i, String str, byte[] bArr) {
        return new byte[]{0};
    }
}
