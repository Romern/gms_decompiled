package p000;

/* renamed from: cfne */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfne implements cfna {

    /* renamed from: a */
    public static final bdyx f184508a;

    /* renamed from: b */
    public static final bdyx f184509b;

    /* renamed from: c */
    public static final bdyx f184510c;

    /* renamed from: d */
    public static final bdyx f184511d;

    /* renamed from: e */
    public static final bdyx f184512e;

    /* renamed from: f */
    public static final bdyx f184513f;

    /* renamed from: g */
    public static final bdyx f184514g;

    /* renamed from: h */
    public static final bdyx f184515h;

    /* renamed from: i */
    public static final bdyx f184516i;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, boolean):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyx.a(bdyw, java.lang.String, long):bdyx
     arg types: [bdyw, java.lang.String, int]
     candidates:
      bdyx.a(bdyw, java.lang.String, double):bdyx
      bdyx.a(bdyw, java.lang.String, int):bdyx
      bdyx.a(bdyw, java.lang.String, java.lang.String):bdyx
      bdyx.a(bdyw, java.lang.String, boolean):bdyx
      bdyx.a(bdyw, java.lang.String, byte[]):bdyx
      bdyx.a(bdyw, java.lang.String, long):bdyx */
    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.mobile_data_plan"));
        f184508a = bdyx.m91610a(bdyw, "MultiSim__data_from_second_testing_sim", false);
        bdyx.m91610a(bdyw, "MultiSim__dynamic_gating", false);
        f184509b = bdyx.m91610a(bdyw, "MultiSim__enable_second_testing_sim", false);
        f184510c = bdyx.m91610a(bdyw, "MultiSim__ignore_unsupported_device_events", false);
        try {
            f184511d = bdyx.m91608a(bdyw, "MultiSim__mcc_mnc_list_launched", (bydj) bxvk.m124014a(bydj.f165795b, new byte[]{10, 5, 53, 50, 48, 48, 49, 10, 5, 53, 50, 48, 48, 51, 10, 5, 53, 48, 50, 49, 54, 10, 5, 53, 50, 48, 48, 53, 10, 5, 53, 49, 53, 48, 50, 10, 5, 53, 49, 48, 48, 49, 10, 5, 53, 49, 48, 50, 49, 10, 5, 52, 50, 55, 48, 49, 10, 5, 52, 53, 54, 48, 53, 10, 5, 52, 53, 54, 48, 54, 10, 5, 52, 49, 52, 48, 54, 10, 5, 52, 49, 48, 48, 54, 10, 5, 55, 48, 52, 48, 50, 10, 5, 51, 52, 53, 48, 48, 10, 5, 57, 56, 55, 57, 57, 10, 5, 57, 56, 55, 54, 53, 10, 5, 52, 50, 48, 48, 52}), cfnb.f184505a);
            try {
                f184512e = bdyx.m91608a(bdyw, "MultiSim__mcc_mnc_list_launching", (bydj) bxvk.m124014a(bydj.f165795b, new byte[]{10, 5, 54, 50, 49, 50, 48, 10, 5, 52, 55, 48, 48, 51, 10, 5, 52, 53, 50, 48, 49, 10, 5, 55, 50, 52, 49, 54, 10, 5, 55, 50, 52, 51, 49, 10, 5, 52, 49, 52, 48, 53, 10, 5, 53, 49, 53, 48, 51, 10, 5, 53, 49, 53, 48, 53, 10, 5, 53, 49, 48, 49, 48, 10, 5, 53, 50, 48, 48, 48, 10, 5, 53, 50, 48, 48, 52, 10, 5, 52, 53, 50, 48, 52}), cfnc.f184506a);
                try {
                    f184513f = bdyx.m91608a(bdyw, "MultiSim__mcc_mnc_list_other_supported", (bydj) bxvk.m124014a(bydj.f165795b, new byte[]{10, 5, 55, 49, 54, 49, 55, 10, 5, 54, 51, 57, 48, 50, 10, 6, 51, 49, 48, 50, 54, 48, 10, 5, 54, 53, 53, 48, 49}), cfnd.f184507a);
                    bdyx.m91607a(bdyw, "MultiSim__second_sim_carrier_id", 0L);
                    f184514g = bdyx.m91609a(bdyw, "MultiSim__second_sim_carrier_name", "MyTelco 2");
                    bdyx.m91609a(bdyw, "MultiSim__second_sim_cpid", "");
                    f184515h = bdyx.m91609a(bdyw, "MultiSim__second_sim_iccid", "");
                    f184516i = bdyx.m91609a(bdyw, "MultiSim__second_sim_mccmnc", "");
                } catch (bxwf e) {
                    throw new AssertionError("Could not parse proto flag \"MultiSim__mcc_mnc_list_other_supported\"");
                }
            } catch (bxwf e2) {
                throw new AssertionError("Could not parse proto flag \"MultiSim__mcc_mnc_list_launching\"");
            }
        } catch (bxwf e3) {
            throw new AssertionError("Could not parse proto flag \"MultiSim__mcc_mnc_list_launched\"");
        }
    }

    /* renamed from: a */
    public final boolean mo81603a() {
        return ((Boolean) f184508a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo81604b() {
        return ((Boolean) f184509b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo81605c() {
        return ((Boolean) f184510c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final bydj mo81606d() {
        return (bydj) f184511d.mo58455c();
    }

    /* renamed from: e */
    public final bydj mo81607e() {
        return (bydj) f184512e.mo58455c();
    }

    /* renamed from: f */
    public final bydj mo81608f() {
        return (bydj) f184513f.mo58455c();
    }

    /* renamed from: g */
    public final String mo81609g() {
        return (String) f184514g.mo58455c();
    }

    /* renamed from: h */
    public final String mo81610h() {
        return (String) f184515h.mo58455c();
    }

    /* renamed from: i */
    public final String mo81611i() {
        return (String) f184516i.mo58455c();
    }
}
