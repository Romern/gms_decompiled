package p000;

import com.google.android.gms.smartdevice.d2d.EsimActivationPayload;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aqzt */
final /* synthetic */ class aqzt implements aubg {

    /* renamed from: a */
    static final aubg f87171a = new aqzt();

    private aqzt() {
    }

    /* renamed from: a */
    public final Object mo7031a(aucb aucb) {
        EsimActivationPayload esimActivationPayload;
        int i = aqzy.f87183b;
        List<aucb> list = (List) aucb.mo50386d();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (aucb aucb2 : list) {
                if (aucb2.mo50384b() && (esimActivationPayload = (EsimActivationPayload) aucb2.mo50386d()) != null) {
                    arrayList.add(esimActivationPayload);
                }
            }
        }
        return arrayList;
    }
}
