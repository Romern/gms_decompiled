package p000;

import java.io.IOException;

/* renamed from: bbhw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbhw extends cazu {

    /* renamed from: b */
    private final bbho f102677b;

    /* renamed from: c */
    private final cazn f102678c;

    public bbhw(bbho bbho, cijl cijl, cijl cijl2, cazn cazn) {
        super(cijl2, cbag.m127657a(bbhw.class), cijl);
        this.f102677b = bbho;
        this.f102678c = cbac.m127643a(cazn);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return this.f102678c.mo75201b();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        boolean z = this.f102677b.f102661a.f102667f;
        bbfv b = bbfw.m87969b();
        bxwc bxwc = ((byfu) obj).f166069a;
        int size = bxwc.size();
        int i = 0;
        while (i < size) {
            byfv byfv = (byfv) bxwc.get(i);
            bbfx d = bbfz.m87976d();
            d.mo56123a(byfv.f166075d);
            bynx bynx = byfv.f166073b;
            if (bynx == null) {
                bynx = bynx.f167143b;
            }
            if (bynx.f167145a == 0) {
                if ((byfv.f166072a & 2) != 0) {
                    d.f102572a = 2;
                    d.mo56124a(byfv.f166074c);
                } else {
                    d.f102572a = !z ? 3 : 4;
                }
                b.mo56120a(d.mo56122a());
                i++;
            } else {
                bynx bynx2 = byfv.f166073b;
                if (bynx2 == null) {
                    bynx2 = bynx.f167143b;
                }
                String valueOf = String.valueOf(bynx2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
                sb.append("Server error ");
                sb.append(valueOf);
                throw new IOException(sb.toString());
            }
        }
        return bqga.m112775a(b.mo56119a());
    }
}
