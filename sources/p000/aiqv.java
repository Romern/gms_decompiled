package p000;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: aiqv */
final /* synthetic */ class aiqv implements Runnable {

    /* renamed from: a */
    private final aiqx f69516a;

    /* renamed from: b */
    private final byte[] f69517b;

    public aiqv(aiqx aiqx, byte[] bArr) {
        this.f69516a = aiqx;
        this.f69517b = bArr;
    }

    public final void run() {
        aiqx aiqx = this.f69516a;
        aips a = aips.m57682a(this.f69517b);
        if (a == null) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aiqx", "c", 477, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            aiqy aiqy = aiqx.f69520a;
            byte[] bArr = aiqy.f69521a;
            bnsl.mo68420a("MultiplexBleSocketV1 connected to %s was unable to parse incoming data.", aiqy.f69522b);
        } else if (!Arrays.equals(a.f69459b, aiqy.f69521a)) {
            byte[] bArr2 = a.f69459b;
            byte[] bArr3 = a.f69460c;
            try {
                aiqi aiqi = (aiqi) aiqx.f69520a.f69527g.get(sqd.m35972d(bArr2));
                aiqi.f69491c.write(bArr3);
                if (cfnv.m140741C()) {
                    aiqi.f69491c.flush();
                }
            } catch (IOException e) {
                bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("aiqx", "a", 552, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68424a("MultiplexBleSocketV1 connected to %s encountered an error while receiving incoming data for service ID hash %s.", aiqx.f69520a.f69522b, ails.m57438a(bArr2));
            }
        } else {
            aiqx.mo37869b(a.f69460c);
        }
    }
}
