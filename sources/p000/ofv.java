package p000;

import com.google.android.projection.common.BufferPool;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: ofv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ofv implements ofz {

    /* renamed from: a */
    final /* synthetic */ ofx f37526a;

    public ofv(ofx ofx) {
        this.f37526a = ofx;
    }

    /* renamed from: a */
    public final void mo22109a(ByteBuffer byteBuffer) {
        oga oga = this.f37526a.f37529b;
        bnsn bnsn = oga.f37530a;
        if (oga.f37537h != 1) {
            if (!oga.f37538i) {
                bnsi c = oga.f37530a.mo68388c();
                c.mo68432a("ofv", "a", 362, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Received unexpected channel control message");
                oga oga2 = this.f37526a.f37529b;
                ogs ogs = oga2.f37536g;
                int i = oga2.f37531b;
                ByteBuffer buffer = BufferPool.getBuffer(2);
                buffer.putShort(255);
                ogs.mo22128a(i, buffer, false, false, new ogv(false, false, 0));
                return;
            }
            oga.f37538i = false;
        }
        try {
            bxvd da = bipq.f121200c.mo74144da();
            bisf bisf = bisf.STATUS_UNSOLICITED_MESSAGE;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bipq bipq = (bipq) da.f164949b;
            bipq.f121203b = bisf.f121548F;
            bipq.f121202a |= 1;
            da.mo74019a(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.remaining(), bxus.m123744c());
            bipq bipq2 = (bipq) da.mo74062i();
            bisf bisf2 = bisf.STATUS_SUCCESS;
            bisf a = bisf.m102781a(bipq2.f121203b);
            if (a == null) {
                a = bisf.STATUS_UNSOLICITED_MESSAGE;
            }
            if (bisf2.equals(a)) {
                oga oga3 = this.f37526a.f37529b;
                oga3.f37537h = 2;
                oga3.f37533d.mo22088i();
                this.f37526a.f37529b.f37532c.mo22088i();
                return;
            }
            this.f37526a.f37529b.f37532c.mo22084a(1);
            this.f37526a.f37529b.mo22115c();
        } catch (IOException e) {
            bnsi c2 = oga.f37530a.mo68388c();
            c2.mo68432a("ofv", "a", 387, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68405a("Received invalid protocol buffer");
        }
    }
}
