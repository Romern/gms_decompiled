package p000;

import com.google.autofill.detection.p098ml.Model;

/* renamed from: kkq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kkq {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: knk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: knr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: knr} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public static kju m18096a(bmxv bmxv, bmxv bmxv2, kpk kpk, kkp kkp) {
        knr knr;
        bmxv bmxv3;
        bnic bnic;
        if (!kkp.mo14573A()) {
            bngs j = bngx.m109377j();
            if (bmxv.mo66813a()) {
                j.mo67668c(new knn(kkp, (kzn) bmxv.mo66814b()));
            }
            if (bmxv2.mo66813a()) {
                bnic = bnic.m109491a(kpb.PERSON_NAME, kpb.PHONE_NUMBER, kpb.POSTAL_ADDRESS);
            } else {
                bnic = bnon.f131923a;
            }
            j.mo67668c(new kmw(kkp, bnic));
            if (kkp.mo14604v()) {
                if (kkp.mo14581b()) {
                    j.mo67668c(new kmx(kkp));
                }
                if (bmxv2.mo66813a()) {
                    j.mo67668c(new knh((Model) bmxv2.mo66814b(), kkp));
                }
            } else {
                if (bmxv2.mo66813a()) {
                    j.mo67668c(new knh((Model) bmxv2.mo66814b(), kkp));
                }
                if (kkp.mo14581b()) {
                    j.mo67668c(new kmx(kkp));
                }
            }
            if (kkp.mo14579G() && !bnic.isEmpty()) {
                j.mo67668c(new kmw(kkp, bnon.f131923a));
            }
            j.mo67668c(m18097a(kkp, bmxv2.mo66813a()));
            knr = new knr(kkp, j.mo67664a());
        } else {
            if (bmxv.mo66813a()) {
                bmxv3 = bmxv.m108566b(new knn(kkp, (kzn) bmxv.mo66814b()));
            } else {
                bmxv3 = bmvz.f131120a;
            }
            bngs j2 = bngx.m109377j();
            j2.mo67668c(new kmw(kkp, bnon.f131923a));
            if (kkp.mo14604v()) {
                if (kkp.mo14581b()) {
                    j2.mo67668c(new kmx(kkp));
                }
                if (bmxv2.mo66813a()) {
                    j2.mo67668c(new knh((Model) bmxv2.mo66814b(), kkp));
                }
            } else {
                if (bmxv2.mo66813a()) {
                    j2.mo67668c(new knh((Model) bmxv2.mo66814b(), kkp));
                }
                if (kkp.mo14581b()) {
                    j2.mo67668c(new kmx(kkp));
                }
            }
            j2.mo67668c(m18097a(kkp, bmxv2.mo66813a()));
            knk knk = new knk(kkp, j2.mo67664a());
            knr = bmxv3.mo66813a() ? new knr(kkp, bngx.m109357a((klx) bmxv3.mo66814b(), knk)) : knk;
        }
        bngx a = bngx.m109356a(new kkf());
        kmr kmr = new kmr(kkp.mo14578F());
        bngs j3 = bngx.m109377j();
        j3.mo67668c(new kml(kkp));
        if (kkp.mo14586f()) {
            j3.mo67668c(new kmm(kkp));
        }
        j3.mo67668c(new kmg(kkp));
        j3.mo67668c(new kmh(kkp));
        if (kkp.mo14583d()) {
            if (kkp.mo14584e()) {
                j3.mo67668c(new kmb(kkp));
            } else {
                j3.mo67668c(new kmb(kkp.m18062I()));
            }
        }
        if (kkp.mo14588h()) {
            j3.mo67668c(new kmi(kkp));
        }
        j3.mo67668c(new kmk(kkp));
        if (kkp.mo14574B()) {
            j3.mo67668c(new kmf());
        }
        if (kkp.mo14597p()) {
            j3.mo67668c(new kmd(kkp));
        }
        return new klf(kkp, a, kpk, kmr, knr, new kmj(j3.mo67664a()));
    }

    /* renamed from: a */
    private static klx m18097a(kkp kkp, boolean z) {
        kpd a = kma.m18150a(kkp, z);
        bngs j = bngx.m109377j();
        bxwc bxwc = a.f24725a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            kpe kpe = (kpe) bxwc.get(i);
            bngs j2 = bngx.m109377j();
            for (int i2 = 0; i2 < kpe.f24730b.size(); i2++) {
                koy koy = (koy) kpe.f24730b.get(i2);
                j2.mo67668c(new knt(koy.f24648a, koy.f24649b));
            }
            for (int i3 = 0; i3 < kpe.f24731c.size(); i3++) {
                koz koz = (koz) kpe.f24731c.get(i3);
                j2.mo67668c(new knu(koz.f24652a, koz.f24653b, kkp.mo14582c()));
            }
            for (int i4 = 0; i4 < kpe.f24732d.size(); i4++) {
                kpa kpa = (kpa) kpe.f24732d.get(i4);
                j2.mo67668c(new knv(kpa.f24657a, kpa.f24658b));
            }
            for (int i5 = 0; i5 < kpe.f24733e.size(); i5++) {
                kpf kpf = (kpf) kpe.f24733e.get(i5);
                j2.mo67668c(new kod(kpf.f24739a, kpf.f24740b));
            }
            for (int i6 = 0; i6 < kpe.f24734f.size(); i6++) {
                kpg kpg = (kpg) kpe.f24734f.get(i6);
                j2.mo67668c(new koe(kpg.f24743a, kpg.f24744b));
            }
            bxwc bxwc2 = kpe.f24735g;
            int size2 = bxwc2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                kox kox = (kox) bxwc2.get(i7);
                j2.mo67668c(new kns(kox.f24644a, kox.f24645b));
            }
            bxwc bxwc3 = kpe.f24736h;
            int size3 = bxwc3.size();
            for (int i8 = 0; i8 < size3; i8++) {
                kpc kpc = (kpc) bxwc3.get(i8);
                j2.mo67668c(new knw(kpc.f24720a, kpc.f24721b, kpc.f24722c));
            }
            kpb a2 = kpb.m18276a(kpe.f24729a);
            if (a2 == null) {
                a2 = kpb.UNRECOGNIZED;
            }
            j.mo67668c(new koc(a2, j2.mo67664a()));
        }
        return new kob(j.mo67664a(), a.f24726b, kkp);
    }
}
