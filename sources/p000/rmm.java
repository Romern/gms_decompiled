package p000;

import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: rmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rmm extends rmr {

    /* renamed from: a */
    final /* synthetic */ rms f43287a;

    /* renamed from: c */
    private final Map f43288c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rmm(rms rms, Map map) {
        super(rms);
        this.f43287a = rms;
        this.f43288c = map;
    }

    /* renamed from: a */
    public final void mo24902a() {
        aqkr aqkr;
        sby sby = new sby(this.f43287a.f43299d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (rjm rjm : this.f43288c.keySet()) {
            if (!rjm.mo24650r() || ((rmj) this.f43288c.get(rjm)).f43281a) {
                arrayList2.add(rjm);
            } else {
                arrayList.add(rjm);
            }
        }
        int i = -1;
        int i2 = 0;
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            while (i2 < size) {
                i = sby.mo25381a(this.f43287a.f43298c, (rjm) arrayList2.get(i2));
                i2++;
                if (i == 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList.size();
            while (i2 < size2) {
                i = sby.mo25381a(this.f43287a.f43298c, (rjm) arrayList.get(i2));
                i2++;
                if (i != 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            ConnectionResult connectionResult = new ConnectionResult(i, null);
            rms rms = this.f43287a;
            rms.f43296a.mo24920a(new rmk(this, rms, connectionResult));
            return;
        }
        rms rms2 = this.f43287a;
        if (rms2.f43301f && (aqkr = rms2.f43300e) != null) {
            aqkr.mo47940e();
        }
        for (rjm rjm2 : this.f43288c.keySet()) {
            sag sag = (sag) this.f43288c.get(rjm2);
            if (!rjm2.mo24650r() || sby.mo25381a(this.f43287a.f43298c, rjm2) == 0) {
                rjm2.mo24646a(sag);
            } else {
                rms rms3 = this.f43287a;
                rms3.f43296a.mo24920a(new rml(rms3, sag));
            }
        }
    }
}
