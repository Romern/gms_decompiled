package p000;

import android.location.Location;
import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;

/* renamed from: eap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eap extends dqi {

    /* renamed from: a */
    final /* synthetic */ ear f14563a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eap(ear ear, String str, Object... objArr) {
        super(str, objArr);
        this.f14563a = ear;
    }

    /* renamed from: a */
    public final void mo9444a(Exception exc) {
        this.f14563a.mo9915j();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9366a(Object obj) {
        boolean z;
        lry lry = (lry) ((rkj) obj).f43190a;
        Location location = lry.f26665a.mo15420b() != null ? lry.f26665a.mo15420b().f11722d : null;
        new Object[1][0] = location;
        if (location != null) {
            ear ear = this.f14563a;
            ear.f14572p = 120000;
            long a = dwq.m9665i().mo20505a();
            caod caod = new caod(location.getLongitude(), location.getLatitude());
            int i = -1;
            int i2 = 0;
            while (i <= 1) {
                caod.mo74716a((((long) i) * 86400000) + a);
                ear.f14570n[i2] = caod.mo74715a(true);
                ear.f14571o[i2] = caod.mo74715a(false);
                i++;
                i2++;
            }
            bxvd da = bxnj.f164037e.mo74144da();
            List asList = Arrays.asList(ear.m10000a(2, ear.f14570n), ear.m10000a(3, ear.f14571o));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxnj bxnj = (bxnj) da.f164949b;
            if (!bxnj.f164041b.mo73666a()) {
                bxnj.f164041b = bxvk.m124021a(bxnj.f164041b);
            }
            bxsy.m123078a(asList, bxnj.f164041b);
            int b = ayuo.m84849b(location.getLatitude());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxnj bxnj2 = (bxnj) da.f164949b;
            bxnj2.f164040a |= 1;
            bxnj2.f164042c = b;
            int b2 = ayuo.m84849b(location.getLongitude());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxnj bxnj3 = (bxnj) da.f164949b;
            bxnj3.f164040a |= 2;
            bxnj3.f164043d = b2;
            bxnj bxnj4 = (bxnj) da.mo74062i();
            new Object[1][0] = bxnj4;
            tip tip = new tip(10, 43, 2);
            tip.mo26574a(tka.m37119b(a));
            tip.mo26572a(bxnj.f164038f, bxnj4);
            ContextData a2 = tip.mo26570a();
            ear.mo9846a(-1 + a);
            ear.mo9857d(a2);
            long j = Long.MAX_VALUE;
            for (int i3 = 0; i3 < 3; i3++) {
                long j2 = ear.f14570n[i3];
                if (a < j2 && j2 < j) {
                    j = j2;
                }
                long j3 = ear.f14571o[i3];
                if (a < j3 && j3 < j) {
                    j = j3;
                }
            }
            AwarenessFence[] awarenessFenceArr = new AwarenessFence[2];
            AwarenessFence a3 = lrl.m19591a(location.getLatitude(), location.getLongitude(), 20000.0d, 0);
            sdo.m34959a(a3);
            sdo.m34959a(a3);
            bxcj bxcj = (bxcj) bxcm.f162813z.mo74144da();
            bxcl bxcl = bxcl.NOT;
            if (bxcj.f164950c) {
                bxcj.mo74035c();
                bxcj.f164950c = false;
            }
            bxcm bxcm = (bxcm) bxcj.f164949b;
            bxcm.f162815b = bxcl.f162810z;
            bxcm.f162814a |= 1;
            bxcj.mo73562a(((ContextFenceStub) a3).mo18035c());
            awarenessFenceArr[0] = new ContextFenceStub((bxcm) bxcj.mo74062i());
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            TimeZone timeZone = tli.f46239a;
            sdo.m34974b(z);
            sdo.m34974b(true);
            sdo.m34974b(true);
            awarenessFenceArr[1] = ContextFenceStub.m22863a(new tli(tli.m37157a(bxew.ABSOLUTE_INTERVAL, timeZone, j, Long.MAX_VALUE)));
            sdo.m34974b(true);
            ArrayList arrayList = new ArrayList(2);
            for (int i4 = 0; i4 < 2; i4++) {
                arrayList.add((ContextFenceStub) awarenessFenceArr[i4]);
            }
            sdo.m34959a(arrayList);
            sdo.m34974b(!arrayList.isEmpty());
            bxcj bxcj2 = (bxcj) bxcm.f162813z.mo74144da();
            bxcl bxcl2 = bxcl.OR;
            if (bxcj2.f164950c) {
                bxcj2.mo74035c();
                bxcj2.f164950c = false;
            }
            bxcm bxcm2 = (bxcm) bxcj2.f164949b;
            bxcm2.f162815b = bxcl2.f162810z;
            bxcm2.f162814a |= 1;
            bxcj2.mo73563a(ContextFenceStub.m22864a(arrayList));
            ear.f14568l = new ContextFenceStub((bxcm) bxcj2.mo74062i());
            new Object[1][0] = ear.f14568l;
            lrk lrk = new lrk();
            lrk.mo15393a(ear.f14569m, ear.f14568l, ear);
            lrh.m19577a(ear.f14388d, ear.f14391g).mo24681a(lrk.mo15389a()).mo50371a(new dqi("[SunStateProducer] register fence", new Object[0]));
            return;
        }
        this.f14563a.mo9915j();
    }
}
