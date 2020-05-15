package p000;

/* renamed from: apla */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apla extends aakq {

    /* renamed from: a */
    final /* synthetic */ aplb f84652a;

    public apla(aplb aplb) {
        this.f84652a = aplb;
    }

    /* renamed from: a */
    public final void mo16939a(int i) {
        this.f84652a.mo47235b(aeco.m51639a(i));
    }

    /* renamed from: b */
    public final void mo16941b(int i) {
        switch (i) {
            case 1:
                bljb a = blkh.m107281a("trigger_EVENT_CODE_DEVICE_CHARGING");
                try {
                    aplb aplb = this.f84652a;
                    if (!aplb.f84661g) {
                        aplb.mo47234b(aapx.DEVICE_CHARGING);
                    } else {
                        aplb.f84661g = false;
                        aplb.mo47228a(aapx.DEVICE_CHARGING);
                    }
                    if (a != null) {
                        a.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                    break;
                }
                break;
            case 2:
                blji b = this.f84652a.f84660f.mo16696b("trigger_EVENT_CODE_NETWORK_CONNECTED");
                try {
                    this.f84652a.mo47228a(aapx.NETWORK_CONNECTED);
                    if (b != null) {
                        b.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    bqye.m113761a(th, th2);
                    break;
                }
                break;
            case 3:
                this.f84652a.f84658d.mo47403d();
                return;
            case 4:
                blji b2 = this.f84652a.f84660f.mo16696b("trigger_EVENT_CODE_DOZE_MODE_CHANGED");
                try {
                    if (!this.f84652a.f84666l.mo47221a()) {
                        this.f84652a.mo47228a(aapx.DOZE_MAINTENANCE_WINDOW);
                        if (b2 != null) {
                            b2.close();
                            return;
                        }
                        return;
                    } else if (b2 != null) {
                        b2.close();
                        return;
                    } else {
                        return;
                    }
                } catch (Throwable th3) {
                    bqye.m113761a(th, th3);
                    break;
                }
                break;
            case 5:
                blji b3 = this.f84652a.f84660f.mo16696b("trigger_EVENT_CODE_DOZE_LIGHT_MODE_CHANGED");
                try {
                    if (!aajg.m21346e()) {
                        this.f84652a.mo47228a(aapx.DOZE_LIGHT_MAINTENANCE_WINDOW);
                        if (b3 != null) {
                            b3.close();
                            return;
                        }
                        return;
                    } else if (b3 != null) {
                        b3.close();
                        return;
                    } else {
                        return;
                    }
                } catch (Throwable th4) {
                    bqye.m113761a(th, th4);
                    break;
                }
                break;
            case 6:
                this.f84652a.mo47228a(aapx.REACHABILITY_CHANGED);
                return;
            default:
                blji b4 = this.f84652a.f84660f.mo16696b("trigger_EVENT_CODE_DEVICE_IDLE");
                try {
                    this.f84652a.mo47234b(aapx.DEVICE_IDLE);
                    if (b4 != null) {
                        b4.close();
                        return;
                    }
                    return;
                } catch (Throwable th5) {
                    bqye.m113761a(th, th5);
                    break;
                }
                break;
        }
        throw th;
        throw th;
        throw th;
        throw th;
        throw th;
    }

    /* renamed from: a */
    public final void mo16940a(aamh aamh) {
        aplb aplb = this.f84652a;
        aplb.f84657c.mo47237a(aplb, aamh);
    }

    /* renamed from: b */
    public final void mo16942b(aamh aamh) {
        this.f84652a.mo47235b(aamh.mo17015a());
    }
}
