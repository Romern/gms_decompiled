package p000;

import com.google.android.gms.nearby.bootstrap.Device;

/* renamed from: ahda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahda implements bvat {

    /* renamed from: a */
    final /* synthetic */ ahdb f67039a;

    public ahda(ahdb ahdb) {
        this.f67039a = ahdb;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo36284a(bxxc bxxc) {
        buyn buyn = (buyn) bxxc;
        Device a = this.f67039a.mo36291a(buyn);
        if (a != null) {
            ahdb ahdb = this.f67039a;
            ahdb.f67029k = a;
            ahdb.f67033o.mo36312a();
            ahdb ahdb2 = this.f67039a;
            buzt buzt = buyn.f155320c;
            if (buzt == null) {
                buzt = buzt.f155423f;
            }
            if (ahdb2.f67025g) {
                bnsl bnsl = (bnsl) ahdb.f67040s.mo68388c();
                bnsl.mo68432a("ahdb", "a", 110, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("TargetDevice: target device is receiving");
            } else {
                String str = ahdb2.f67043u;
                bxvd da = buzk.f155391e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                buzk buzk = (buzk) da.f164949b;
                buzt.getClass();
                buzk.f155394b = buzt;
                int i = buzk.f155393a | 1;
                buzk.f155393a = i;
                buzk.f155396d = 3;
                buzk.f155393a = i | 4;
                ByteString a2 = ByteString.m123258a(str);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                buzk buzk2 = (buzk) da.f164949b;
                a2.getClass();
                buzk2.f155393a |= 2;
                buzk2.f155395c = a2;
                ahdb2.mo36323a((buzk) da.mo74062i());
            }
        }
        bvac bvac = bvac.OPERATION_STATUS_UNKNOWN;
        bvaa bvaa = buyn.f155319b;
        if (bvaa == null) {
            bvaa = bvaa.f155448d;
        }
        bvac a3 = bvac.m120825a(bvaa.f155452c);
        if (a3 == null) {
            a3 = bvac.OPERATION_STATUS_UNKNOWN;
        }
        int ordinal = a3.ordinal();
        if (ordinal == 1) {
            this.f67039a.f67042t = true;
        } else if (ordinal == 3 || ordinal == 4) {
            this.f67039a.f67042t = false;
        }
    }
}
