package p000;

import java.util.HashMap;

/* renamed from: bslc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bslc extends bslb {

    /* renamed from: c */
    private final HashMap f144908c = new HashMap();

    public bslc(bsla bsla) {
        super(bsla);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo70681a(Object obj) {
        byty byty = (byty) obj;
        this.f144905a.mo68887a(byty, byty);
        bxwc bxwc = byty.f167734b;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            String str = ((bytw) bxwc.get(i)).f167728b;
            byty byty2 = (byty) this.f144908c.get(str);
            if (byty2 == null) {
                this.f144908c.put(str, byty);
            } else if (!byty2.equals(byty)) {
                this.f144905a.mo68887a(byty, byty2);
            }
        }
    }
}
