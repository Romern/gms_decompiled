package p000;

import android.util.Log;
import java.util.List;

/* renamed from: rwb */
final /* synthetic */ class rwb implements aubg {

    /* renamed from: a */
    private final bput f43786a;

    public rwb(bput bput) {
        this.f43786a = bput;
    }

    /* renamed from: a */
    public final Object mo7031a(aucb aucb) {
        bput bput = this.f43786a;
        if (!aucb.mo50384b()) {
            Log.w("ClearcutFixerLogger", "Failed to determine opt-in status. Dropping log.");
            return null;
        }
        List<qws> list = (List) aucb.mo50386d();
        if (list.isEmpty()) {
            return null;
        }
        cagz cagz = cagz.DEFAULT;
        bxvd da = bpvf.f139321t.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpvf bpvf = (bpvf) da.f164949b;
        bput.getClass();
        bpvf.f139334l = bput;
        bpvf.f139323a |= 128;
        bpvf bpvf2 = (bpvf) da.mo74062i();
        for (qws qws : list) {
            qwo a = qws.mo24333a(bpvf2);
            a.f42322f = cagz;
            a.mo24328b(14);
            a.mo24327b();
        }
        return null;
    }
}
