package p000;

import java.util.Collection;
import java.util.HashMap;

/* renamed from: bsld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsld extends bslb {

    /* renamed from: c */
    private final HashMap f144909c = new HashMap();

    /* renamed from: d */
    private final bngf f144910d = bngf.m109302f();

    public bsld(bsla bsla) {
        super(bsla);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo70681a(Object obj) {
        byty byty = (byty) obj;
        this.f144905a.mo68887a(byty, byty);
        bxwc bxwc = byty.f167734b;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bytw bytw = (bytw) bxwc.get(i);
            if ((bytw.f167727a & 4) != 0) {
                String str = bytw.f167730d;
                if (this.f144909c.containsKey(str)) {
                    this.f144905a.mo68887a(byty, (byty) this.f144909c.get(str));
                    this.f144910d.add(str);
                } else {
                    this.f144909c.put(str, byty);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo70684b(Collection collection) {
        super.mo70683a(collection);
    }
}
