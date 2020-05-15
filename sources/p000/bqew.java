package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: bqew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqew extends bqeb {

    /* renamed from: c */
    private List f140568c;

    /* renamed from: a */
    public final void mo69154a(int i, Object obj) {
        List list = this.f140568c;
        if (list != null) {
            list.set(i, new bqev(obj));
        }
    }

    /* renamed from: g */
    public final void mo69160g() {
        List<bqev> list = this.f140568c;
        if (list != null) {
            ArrayList a = bnkn.m109662a(list.size());
            for (bqev bqev : list) {
                a.add(bqev != null ? bqev.f140567a : null);
            }
            mo69138b(Collections.unmodifiableList(a));
        }
    }

    public bqew(bngm bngm, boolean z) {
        super(bngm, z, true);
        List e = bngm.isEmpty() ? bngx.m109376e() : bnkn.m109662a(bngm.size());
        for (int i = 0; i < bngm.size(); i++) {
            e.add(null);
        }
        this.f140568c = e;
        mo69159c();
    }

    /* renamed from: a */
    public final void mo69157a(bqea bqea) {
        super.mo69157a(bqea);
        this.f140568c = null;
    }
}
