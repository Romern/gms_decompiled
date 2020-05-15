package p000;

import com.google.android.gms.car.CarSensorEvent;

/* renamed from: nmj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nmj implements ocv {

    /* renamed from: a */
    private static final bnsn f36039a = odk.m28481a("CAR.ANALYTICS");

    /* renamed from: b */
    private final nlm f36040b;

    public nmj(nlm nlm) {
        bmxy.m108581a(nlm);
        this.f36040b = nlm;
    }

    /* renamed from: a */
    public final ocm mo21152a() {
        bpde bpde;
        boolean z;
        nmv f = this.f36040b.mo21046f();
        ocl e = ocm.m28386e();
        if (f != null) {
            try {
                CarSensorEvent c = f.mo21181c(2);
                if (c != null) {
                    e.f37177a = bmxv.m108566b(Integer.valueOf((int) (c.f29366d[0] * 1000.0f)));
                }
                CarSensorEvent c2 = f.mo21181c(9);
                if (c2 != null) {
                    if (c2.f29367e[0] != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    e.f37178b = bmxv.m108566b(Boolean.valueOf(z));
                }
                CarSensorEvent c3 = f.mo21181c(11);
                if (c3 != null) {
                    e.f37179c = bmxv.m108566b(Integer.valueOf(c3.f29367e[0]));
                }
                CarSensorEvent c4 = f.mo21181c(7);
                if (c4 != null) {
                    byte b = c4.f29367e[0];
                    switch (b) {
                        case 0:
                            bpde = bpde.GEAR_NEUTRAL;
                            break;
                        case 1:
                            bpde = bpde.GEAR_1;
                            break;
                        case 2:
                            bpde = bpde.GEAR_2;
                            break;
                        case 3:
                            bpde = bpde.GEAR_3;
                            break;
                        case 4:
                            bpde = bpde.GEAR_4;
                            break;
                        case 5:
                            bpde = bpde.GEAR_5;
                            break;
                        case 6:
                            bpde = bpde.GEAR_6;
                            break;
                        default:
                            switch (b) {
                                case 100:
                                    bpde = bpde.GEAR_DRIVE;
                                    break;
                                case 101:
                                    bpde = bpde.GEAR_PARK;
                                    break;
                                case 102:
                                    bpde = bpde.GEAR_REVERSE;
                                    break;
                                default:
                                    bpde = bpde.UNKNOWN_GEAR;
                                    break;
                            }
                    }
                } else {
                    bpde = bpde.UNKNOWN_GEAR;
                }
                e.f37180d = bmxv.m108566b(bpde);
            } catch (IllegalStateException e2) {
                bnsi c5 = f36039a.mo68388c();
                c5.mo68437a(e2);
                c5.mo68432a("nmj", "a", 51, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c5.mo68405a("Failure reading sensor info");
            }
        }
        return e.mo21972a();
    }
}
