package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;

/* renamed from: cghq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cghq implements cghl {

    /* renamed from: a */
    public static final bdyx f186949a;

    /* renamed from: b */
    public static final bdyx f186950b;

    /* renamed from: c */
    public static final bdyx f186951c;

    /* renamed from: d */
    public static final bdyx f186952d;

    /* renamed from: e */
    public static final bdyx f186953e;

    /* renamed from: f */
    public static final bdyx f186954f;

    /* renamed from: g */
    public static final bdyx f186955g;

    /* renamed from: h */
    public static final bdyx f186956h;

    /* renamed from: i */
    public static final bdyx f186957i;

    /* renamed from: j */
    public static final bdyx f186958j;

    /* renamed from: k */
    public static final bdyx f186959k;

    /* renamed from: l */
    public static final bdyx f186960l;

    /* renamed from: m */
    public static final bdyx f186961m;

    /* JADX WARN: Type inference failed for: r3v10, types: [byte[]], assign insn: 0x0279: NEW_ARRAY  (r3v10 ? I:byte[]) = (514 int) type: byte[] */
    /* JADX WARN: Type inference failed for: r3v20, types: [byte[]], assign insn: 0x0d3c: NEW_ARRAY  (r3v20 ? I:byte[]) = (780 int) type: byte[] */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bdyw.a(java.lang.String, boolean):bdyx
     arg types: [java.lang.String, int]
     candidates:
      bdyw.a(java.lang.String, long):bdyx
      bdyw.a(java.lang.String, java.lang.String):bdyx
      bdyw.a(java.lang.String, boolean):bdyx */
    /* JADX WARNING: Unknown variable types count: 2 */
    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.platformconfigurator"));
        try {
            f186949a = bdyw.mo58447a("ModuleConfig__boot_commit_packages", bydj.m124680a(new byte[]{10, 28, 97, 99, 116, 105, 118, 105, 116, 121, 95, 109, 97, 110, 97, 103, 101, 114, 95, 110, 97, 116, 105, 118, 101, 95, 98, 111, 111, 116, 10, 17, 105, 110, 112, 117, 116, 95, 110, 97, 116, 105, 118, 101, 95, 98, 111, 111, 116, 10, 13, 114, 111, 108, 108, 98, 97, 99, 107, 95, 98, 111, 111, 116, 10, 19, 114, 117, 110, 116, 105, 109, 101, 95, 110, 97, 116, 105, 118, 101, 95, 98, 111, 111, 116, 10, 19, 115, 116, 111, 114, 97, 103, 101, 95, 110, 97, 116, 105, 118, 101, 95, 98, 111, 111, 116, 10, 26, 119, 105, 110, 100, 111, 119, 95, 109, 97, 110, 97, 103, 101, 114, 95, 110, 97, 116, 105, 118, 101, 95, 98, 111, 111, 116}), cghm.f186945a);
            f186950b = bdyw.mo58449a("ModuleConfig__enable_device_config", true);
            f186951c = bdyw.mo58449a("ModuleConfig__enable_platform_boot", true);
            f186952d = bdyw.mo58449a("ModuleConfig__enable_rescue_party", false);
            f186953e = bdyw.mo58449a("ModuleConfig__enable_tagged_puts", false);
            f186954f = bdyw.mo58449a("ModuleConfig__enable_versioned_namespaces", false);
            f186955g = bdyw.mo58449a("ModuleConfig__ignore_integrity_check_for_atomic_writes", true);
            try {
                f186956h = bdyw.mo58447a("ModuleConfig__immediate_commit_packages", bydj.m124680a((byte[]) new byte[]{10, 16, 97, 99, 116, 105, 118, 105, 116, 121, 95, 109, 97, 110, 97, 103, 101, 114, 10, 24, 97, 105, 97, 105, 95, 99, 111, 110, 116, 114, 111, 108, 108, 101, 100, 95, 114, 101, 108, 101, 97, 115, 101, 115, 10, 10, 97, 112, 112, 95, 99, 111, 109, 112, 97, 116, 10, 25, 97, 116, 116, 101, 110, 116, 105, 111, 110, 95, 109, 97, 110, 97, 103, 101, 114, 95, 115, 101, 114, 118, 105, 99, 101, 10, 8, 97, 117, 116, 111, 102, 105, 108, 108, 10, 14, 98, 97, 99, 107, 117, 112, 95, 115, 101, 114, 118, 105, 99, 101, 10, 3, 99, 97, 114, 10, 13, 99, 111, 110, 102, 105, 103, 117, 114, 97, 116, 105, 111, 110, 10, 12, 99, 111, 110, 110, 101, 99, 116, 105, 118, 105, 116, 121, 10, 34, 99, 111, 110, 110, 101, 99, 116, 105, 118, 105, 116, 121, 95, 116, 104, 101, 114, 109, 97, 108, 95, 112, 111, 119, 101, 114, 95, 109, 97, 110, 97, 103, 101, 114, 10, 15, 99, 111, 110, 116, 101, 110, 116, 95, 99, 97, 112, 116, 117, 114, 101, 10, 31, 100, 101, 118, 105, 99, 101, 95, 112, 101, 114, 115, 111, 110, 97, 108, 105, 122, 97, 116, 105, 111, 110, 95, 115, 101, 114, 118, 105, 99, 101, 115, 10, 15, 100, 105, 115, 112, 108, 97, 121, 95, 109, 97, 110, 97, 103, 101, 114, 10, 8, 102, 108, 105, 112, 101, 110, 100, 111, 10, 11, 103, 97, 109, 101, 95, 100, 114, 105, 118, 101, 114, 10, 20, 105, 110, 116, 101, 108, 108, 105, 103, 101, 110, 99, 101, 95, 98, 117, 98, 98, 108, 101, 115, 10, 8, 108, 97, 117, 110, 99, 104, 101, 114, 10, 11, 110, 101, 116, 100, 95, 110, 97, 116, 105, 118, 101, 10, 22, 110, 111, 116, 105, 102, 105, 99, 97, 116, 105, 111, 110, 95, 97, 115, 115, 105, 115, 116, 97, 110, 116, 10, 4, 111, 115, 108, 111, 10, 23, 112, 97, 99, 107, 97, 103, 101, 95, 109, 97, 110, 97, 103, 101, 114, 95, 115, 101, 114, 118, 105, 99, 101, 10, 7, 112, 114, 105, 118, 97, 99, 121, 10, 8, 114, 111, 108, 108, 98, 97, 99, 107, 10, 7, 114, 117, 110, 116, 105, 109, 101, 10, 14, 114, 117, 110, 116, 105, 109, 101, 95, 110, 97, 116, 105, 118, 101, 10, 14, 115, 101, 116, 116, 105, 110, 103, 115, 95, 115, 116, 97, 116, 115, 10, 16, 115, 121, 115, 116, 101, 109, 95, 115, 99, 104, 101, 100, 117, 108, 101, 114, 10, 8, 115, 121, 115, 116, 101, 109, 117, 105, 10, 9, 116, 101, 108, 101, 112, 104, 111, 110, 121, 10, 14, 116, 101, 120, 116, 99, 108, 97, 115, 115, 105, 102, 105, 101, 114, 10, 6, 119, 105, 100, 103, 101, 116, 10, 4, 119, 105, 102, 105, 10, 14, 119, 105, 110, 100, 111, 119, 95, 109, 97, 110, 97, 103, 101, 114}), cghn.f186946a);
                f186957i = bdyw.mo58449a("ModuleConfig__match_apex_flag_enabled", true);
                bdyw.mo58448a("platform_settings_to_log", "");
                f186958j = bdyw.mo58449a("ModuleConfig__propagate_updated_package_only", true);
                f186959k = bdyw.mo58449a("ModuleConfig__use_atomic_writes_on_r", true);
                try {
                    byte[] bArr = new byte[MfiClientException.TYPE_MFICLIENT_NOT_FOUND];
                    bArr[0] = 10;
                    bArr[1] = 29;
                    bArr[2] = 97;
                    bArr[3] = 99;
                    bArr[4] = 116;
                    bArr[5] = 105;
                    bArr[6] = 118;
                    bArr[7] = 105;
                    bArr[8] = 116;
                    bArr[9] = 121;
                    bArr[10] = 95;
                    bArr[11] = 109;
                    bArr[12] = 97;
                    bArr[13] = 110;
                    bArr[14] = 97;
                    bArr[15] = 103;
                    bArr[16] = 101;
                    bArr[17] = 114;
                    bArr[18] = 95;
                    bArr[19] = 110;
                    bArr[20] = 97;
                    bArr[21] = 116;
                    bArr[22] = 105;
                    bArr[23] = 118;
                    bArr[24] = 101;
                    bArr[25] = 95;
                    bArr[26] = 98;
                    bArr[27] = 111;
                    bArr[28] = 111;
                    bArr[29] = 116;
                    bArr[30] = 58;
                    bArr[31] = 10;
                    bArr[32] = 9;
                    bArr[33] = 100;
                    bArr[34] = 101;
                    bArr[35] = 120;
                    bArr[36] = 95;
                    bArr[37] = 98;
                    bArr[38] = 111;
                    bArr[39] = 111;
                    bArr[40] = 116;
                    bArr[41] = 58;
                    bArr[42] = 10;
                    bArr[43] = 18;
                    bArr[44] = 105;
                    bArr[45] = 110;
                    bArr[46] = 112;
                    bArr[47] = 117;
                    bArr[48] = 116;
                    bArr[49] = 95;
                    bArr[50] = 110;
                    bArr[51] = 97;
                    bArr[52] = 116;
                    bArr[53] = 105;
                    bArr[54] = 118;
                    bArr[55] = 101;
                    bArr[56] = 95;
                    bArr[57] = 98;
                    bArr[58] = 111;
                    bArr[59] = 111;
                    bArr[60] = 116;
                    bArr[61] = 58;
                    bArr[62] = 10;
                    bArr[63] = 14;
                    bArr[64] = 114;
                    bArr[65] = 111;
                    bArr[66] = 108;
                    bArr[67] = 108;
                    bArr[68] = 98;
                    bArr[69] = 97;
                    bArr[70] = 99;
                    bArr[71] = 107;
                    bArr[72] = 95;
                    bArr[73] = 98;
                    bArr[74] = 111;
                    bArr[75] = 111;
                    bArr[76] = 116;
                    bArr[77] = 58;
                    bArr[78] = 10;
                    bArr[79] = 20;
                    bArr[80] = 114;
                    bArr[81] = 117;
                    bArr[82] = 110;
                    bArr[83] = 116;
                    bArr[84] = 105;
                    bArr[85] = 109;
                    bArr[86] = 101;
                    bArr[87] = 95;
                    bArr[88] = 110;
                    bArr[89] = 97;
                    bArr[90] = 116;
                    bArr[91] = 105;
                    bArr[92] = 118;
                    bArr[93] = 101;
                    bArr[94] = 95;
                    bArr[95] = 98;
                    bArr[96] = 111;
                    bArr[97] = 111;
                    bArr[98] = 116;
                    bArr[99] = 58;
                    bArr[100] = 10;
                    bArr[101] = 20;
                    bArr[102] = 115;
                    bArr[103] = 116;
                    bArr[104] = 111;
                    bArr[105] = 114;
                    bArr[106] = 97;
                    bArr[107] = 103;
                    bArr[108] = 101;
                    bArr[109] = 95;
                    bArr[110] = 110;
                    bArr[111] = 97;
                    bArr[112] = 116;
                    bArr[113] = 105;
                    bArr[114] = 118;
                    bArr[115] = 101;
                    bArr[116] = 95;
                    bArr[117] = 98;
                    bArr[118] = 111;
                    bArr[119] = 111;
                    bArr[120] = 116;
                    bArr[121] = 58;
                    bArr[122] = 10;
                    bArr[123] = 27;
                    bArr[124] = 119;
                    bArr[125] = 105;
                    bArr[126] = 110;
                    bArr[127] = 100;
                    bArr[128] = 111;
                    bArr[129] = 119;
                    bArr[130] = 95;
                    bArr[131] = 109;
                    bArr[132] = 97;
                    bArr[133] = 110;
                    bArr[134] = 97;
                    bArr[135] = 103;
                    bArr[136] = 101;
                    bArr[137] = 114;
                    bArr[138] = 95;
                    bArr[139] = 110;
                    bArr[140] = 97;
                    bArr[141] = 116;
                    bArr[142] = 105;
                    bArr[143] = 118;
                    bArr[144] = 101;
                    bArr[145] = 95;
                    bArr[146] = 98;
                    bArr[147] = 111;
                    bArr[148] = 111;
                    bArr[149] = 116;
                    bArr[150] = 58;
                    f186960l = bdyw.mo58447a("ModuleConfig__versioned_boot_commit_packages", bydj.m124680a(bArr), cgho.f186947a);
                    try {
                        f186961m = bdyw.mo58447a("ModuleConfig__versioned_immediate_commit_packages", bydj.m124680a((byte[]) new byte[]{10, 17, 97, 99, 116, 105, 118, 105, 116, 121, 95, 109, 97, 110, 97, 103, 101, 114, 58, 10, 25, 97, 105, 97, 105, 95, 99, 111, 110, 116, 114, 111, 108, 108, 101, 100, 95, 114, 101, 108, 101, 97, 115, 101, 115, 58, 10, 11, 97, 112, 112, 95, 99, 111, 109, 112, 97, 116, 58, 10, 26, 97, 116, 116, 101, 110, 116, 105, 111, 110, 95, 109, 97, 110, 97, 103, 101, 114, 95, 115, 101, 114, 118, 105, 99, 101, 58, 10, 9, 97, 117, 116, 111, 102, 105, 108, 108, 58, 10, 15, 98, 97, 99, 107, 117, 112, 95, 115, 101, 114, 118, 105, 99, 101, 58, 10, 4, 99, 97, 114, 58, 10, 14, 99, 111, 110, 102, 105, 103, 117, 114, 97, 116, 105, 111, 110, 58, 10, 38, 99, 111, 110, 110, 101, 99, 116, 105, 118, 105, 116, 121, 58, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 114, 101, 115, 111, 108, 118, 10, 35, 99, 111, 110, 110, 101, 99, 116, 105, 118, 105, 116, 121, 95, 116, 104, 101, 114, 109, 97, 108, 95, 112, 111, 119, 101, 114, 95, 109, 97, 110, 97, 103, 101, 114, 58, 10, 16, 99, 111, 110, 116, 101, 110, 116, 95, 99, 97, 112, 116, 117, 114, 101, 58, 10, 53, 100, 101, 118, 105, 99, 101, 95, 112, 101, 114, 115, 111, 110, 97, 108, 105, 122, 97, 116, 105, 111, 110, 95, 115, 101, 114, 118, 105, 99, 101, 115, 58, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 115, 10, 46, 100, 105, 115, 112, 108, 97, 121, 95, 109, 97, 110, 97, 103, 101, 114, 58, 99, 111, 109, 46, 97, 110, 100, 114, 111, 105, 100, 46, 114, 101, 102, 114, 101, 115, 104, 114, 97, 116, 101, 99, 111, 110, 116, 114, 111, 108, 10, 9, 102, 108, 105, 112, 101, 110, 100, 111, 58, 10, 12, 103, 97, 109, 101, 95, 100, 114, 105, 118, 101, 114, 58, 10, 42, 105, 110, 116, 101, 108, 108, 105, 103, 101, 110, 99, 101, 95, 98, 117, 98, 98, 108, 101, 115, 58, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 115, 10, 46, 108, 97, 117, 110, 99, 104, 101, 114, 58, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 110, 101, 120, 117, 115, 108, 97, 117, 110, 99, 104, 101, 114, 10, 37, 110, 101, 116, 100, 95, 110, 97, 116, 105, 118, 101, 58, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 114, 101, 115, 111, 108, 118, 10, 43, 110, 111, 116, 105, 102, 105, 99, 97, 116, 105, 111, 110, 95, 97, 115, 115, 105, 115, 116, 97, 110, 116, 58, 97, 110, 100, 114, 111, 105, 100, 46, 101, 120, 116, 46, 115, 101, 114, 118, 105, 99, 101, 115, 10, 20, 111, 115, 108, 111, 58, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 111, 115, 108, 111, 10, 24, 112, 97, 99, 107, 97, 103, 101, 95, 109, 97, 110, 97, 103, 101, 114, 95, 115, 101, 114, 118, 105, 99, 101, 58, 10, 47, 112, 114, 105, 118, 97, 99, 121, 58, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 112, 101, 114, 109, 105, 115, 115, 105, 111, 110, 99, 111, 110, 116, 114, 111, 108, 108, 101, 114, 10, 9, 114, 111, 108, 108, 98, 97, 99, 107, 58, 10, 8, 114, 117, 110, 116, 105, 109, 101, 58, 10, 15, 114, 117, 110, 116, 105, 109, 101, 95, 110, 97, 116, 105, 118, 101, 58, 10, 15, 115, 101, 116, 116, 105, 110, 103, 115, 95, 115, 116, 97, 116, 115, 58, 10, 17, 115, 121, 115, 116, 101, 109, 95, 115, 99, 104, 101, 100, 117, 108, 101, 114, 58, 10, 9, 115, 121, 115, 116, 101, 109, 117, 105, 58, 10, 10, 116, 101, 108, 101, 112, 104, 111, 110, 121, 58, 10, 15, 116, 101, 120, 116, 99, 108, 97, 115, 115, 105, 102, 105, 101, 114, 58, 10, 7, 119, 105, 100, 103, 101, 116, 58, 10, 5, 119, 105, 102, 105, 58, 10, 15, 119, 105, 110, 100, 111, 119, 95, 109, 97, 110, 97, 103, 101, 114, 58}), cghp.f186948a);
                    } catch (bxwf e) {
                        throw new AssertionError("Could not parse proto flag \"ModuleConfig__versioned_immediate_commit_packages\"");
                    }
                } catch (bxwf e2) {
                    throw new AssertionError("Could not parse proto flag \"ModuleConfig__versioned_boot_commit_packages\"");
                }
            } catch (bxwf e3) {
                throw new AssertionError("Could not parse proto flag \"ModuleConfig__immediate_commit_packages\"");
            }
        } catch (bxwf e4) {
            throw new AssertionError("Could not parse proto flag \"ModuleConfig__boot_commit_packages\"");
        }
    }

    /* renamed from: a */
    public final bydj mo83796a() {
        return (bydj) f186949a.mo58455c();
    }

    /* renamed from: b */
    public final boolean mo83797b() {
        return ((Boolean) f186950b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo83798c() {
        return ((Boolean) f186951c.mo58455c()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo83799d() {
        return ((Boolean) f186952d.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo83800e() {
        return ((Boolean) f186953e.mo58455c()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo83801f() {
        return ((Boolean) f186954f.mo58455c()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo83802g() {
        return ((Boolean) f186955g.mo58455c()).booleanValue();
    }

    /* renamed from: h */
    public final bydj mo83803h() {
        return (bydj) f186956h.mo58455c();
    }

    /* renamed from: i */
    public final boolean mo83804i() {
        return ((Boolean) f186957i.mo58455c()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo83805j() {
        return ((Boolean) f186958j.mo58455c()).booleanValue();
    }

    /* renamed from: k */
    public final boolean mo83806k() {
        return ((Boolean) f186959k.mo58455c()).booleanValue();
    }

    /* renamed from: l */
    public final bydj mo83807l() {
        return (bydj) f186960l.mo58455c();
    }

    /* renamed from: m */
    public final bydj mo83808m() {
        return (bydj) f186961m.mo58455c();
    }
}
