package p000;

import java.util.Iterator;
import java.util.List;

/* renamed from: aqrx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqrx {

    /* renamed from: a */
    public final aqwv f86673a;

    public aqrx(aqwv aqwv) {
        this.f86673a = aqwv;
    }

    /* renamed from: a */
    public static bzid m72025a(bziq bziq) {
        bzic bzic = (bzic) bzid.f170156d.mo74144da();
        bxvd da = bzhl.f170076m.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzhl bzhl = (bzhl) da.f164949b;
        bziq.getClass();
        bzhl.f170086i = bziq;
        bzhl.f170078a |= 8192;
        bzic.mo74547a(da);
        return (bzid) bzic.mo74062i();
    }

    /* renamed from: a */
    public static final bzil m72026a(List list) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return null;
        }
        bzil bzil = ((bzhk) it.next()).f170070j;
        return bzil == null ? bzil.f170202f : bzil;
    }
}
