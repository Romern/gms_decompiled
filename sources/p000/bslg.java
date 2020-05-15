package p000;

import java.util.Collection;
import java.util.HashMap;

/* renamed from: bslg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bslg extends bslb {

    /* renamed from: c */
    private final HashMap f144915c = new HashMap();

    public bslg(bsla bsla) {
        super(bsla);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo70681a(Object obj) {
        bskf bskf = (bskf) obj;
        this.f144905a.mo68887a(bskf, bskf);
        bskq bskq = new bskq(bskf.mo70662h(), bskf.mo70660f(), bskf.mo70661g().mo26743g(), bskf.mo70659e());
        if (this.f144915c.containsKey(bskq)) {
            bskf bskf2 = (bskf) this.f144915c.get(bskq);
            if (bskf == bskf2) {
                return;
            }
            if (bskf.equals(bskf2)) {
                mo70682a(bskf, bskf2);
            } else {
                this.f144905a.mo68887a(bskf, bskf2);
            }
        } else {
            this.f144915c.put(bskq, bskf);
        }
    }

    /* renamed from: b */
    public final void mo70686b(Collection collection) {
        super.mo70683a(collection);
    }
}
