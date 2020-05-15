package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;

/* renamed from: cfur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfur implements cfun {

    /* renamed from: a */
    public static final bdyx f185741a;

    /* renamed from: b */
    public static final bdyx f185742b;

    /* renamed from: c */
    public static final bdyx f185743c;

    /* JADX WARN: Type inference failed for: r3v1, types: [byte[]], assign insn: 0x000f: NEW_ARRAY  (r3v1 ? I:byte[]) = (577 int) type: byte[] */
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
    /* JADX WARNING: Unknown variable types count: 1 */
    static {
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.people"));
        try {
            f185741a = bdyx.m91608a(bdyw, "AccountCategoriesFeature__account_categories_config", (allx) bxvk.m124014a(allx.f73647d, (byte[]) new byte[]{10, 14, 8, 2, 34, 10, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 10, -96, 1, 8, 3, 34, 21, 118, 110, 100, 46, 115, 101, 99, 46, 99, 111, 110, 116, 97, 99, 116, 46, 112, 104, 111, 110, 101, 34, 19, 76, 111, 99, 97, 108, 32, 80, 104, 111, 110, 101, 32, 65, 99, 99, 111, 117, 110, 116, 34, 24, 99, 111, 109, 46, 97, 110, 100, 114, 111, 105, 100, 46, 104, 117, 97, 119, 101, 105, 46, 112, 104, 111, 110, 101, 34, 28, 99, 111, 109, 46, 97, 110, 100, 114, 111, 105, 100, 46, 99, 111, 110, 116, 97, 99, 116, 115, 46, 100, 101, 102, 97, 117, 108, 116, 34, 12, 99, 111, 109, 46, 108, 103, 101, 46, 115, 121, 110, 99, 34, 22, 99, 111, 109, 46, 97, 110, 100, 114, 111, 105, 100, 46, 108, 111, 99, 97, 108, 112, 104, 111, 110, 101, 34, 16, 97, 115, 117, 115, 46, 108, 111, 99, 97, 108, 46, 112, 104, 111, 110, 101, 72, 5, 10, -46, 1, 8, 6, 34, 7, 67, 97, 114, 100, 68, 65, 86, 34, 21, 99, 111, 109, 46, 97, 110, 100, 114, 111, 105, 100, 46, 110, 116, 116, 100, 111, 99, 111, 109, 111, 34, 16, 99, 111, 109, 46, 98, 98, 109, 46, 99, 111, 110, 116, 97, 99, 116, 115, 34, 18, 99, 111, 109, 46, 111, 115, 112, 46, 97, 112, 112, 46, 115, 105, 103, 110, 105, 110, 34, 37, 99, 111, 109, 46, 121, 97, 104, 111, 111, 46, 109, 111, 98, 105, 108, 101, 46, 99, 108, 105, 101, 110, 116, 46, 115, 104, 97, 114, 101, 46, 97, 99, 99, 111, 117, 110, 116, 34, 41, 99, 111, 109, 46, 109, 105, 99, 114, 111, 115, 111, 102, 116, 46, 111, 102, 102, 105, 99, 101, 46, 111, 117, 116, 108, 111, 111, 107, 46, 85, 83, 69, 82, 95, 65, 67, 67, 79, 85, 78, 84, 34, 46, 99, 111, 109, 46, 109, 105, 99, 114, 111, 115, 111, 102, 116, 46, 111, 102, 102, 105, 99, 101, 46, 111, 117, 116, 108, 111, 111, 107, 46, 100, 97, 119, 103, 46, 85, 83, 69, 82, 95, 65, 67, 67, 79, 85, 78, 84, 34, 6, 105, 67, 108, 111, 117, 100, 10, 9, 8, 0, 42, 1, 64, 42, 2, 38, 38, 10, 12, 8, 5, 42, 8, 101, 120, 99, 104, 97, 110, 103, 101, 10, -99, 1, 8, 4, 42, 3, 115, 105, 109, 42, 3, 83, 73, 77, 50, 24, 99, 111, 109, 46, 108, 97, 110, 105, 120, 46, 99, 111, 110, 116, 97, 99, 116, 111, 115, 101, 110, 115, 105, 109, 50, 31, 99, 111, 109, 46, 112, 97, 110, 116, 101, 99, 104, 46, 99, 111, 110, 116, 97, 99, 116, 115, 46, 115, 105, 109, 118, 105, 114, 116, 117, 97, 108, 50, 22, 99, 122, 46, 112, 115, 101, 110, 99, 105, 107, 46, 115, 105, 109, 112, 108, 101, 46, 115, 121, 110, 99, 50, 24, 116, 118, 46, 115, 105, 109, 112, 108, 101, 109, 97, 116, 116, 101, 114, 115, 46, 115, 104, 111, 112, 115, 101, 101, 50, 27, 99, 111, 109, 46, 111, 116, 112, 109, 111, 98, 105, 108, 46, 115, 105, 109, 112, 108, 101, 46, 97, 99, 99, 111, 117, 110, 116, 50, 5, 115, 105, 109, 121, 111}), cfuo.f185738a);
            try {
                f185742b = bdyx.m91608a(bdyw, "AccountCategoriesFeature__caller_whitelist", (bydj) bxvk.m124014a(bydj.f165795b, new byte[]{10, 22, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 109, 115, 10, 27, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 99, 111, 110, 116, 97, 99, 116, 115}), cfup.f185739a);
                f185743c = bdyx.m91610a(bdyw, "AccountCategoriesFeature__categories_1p_api", false);
                try {
                    byte[] bArr = new byte[MfiClientException.TYPE_NO_ACCOUNT_INFO];
                    bArr[0] = 10;
                    bArr[1] = 21;
                    bArr[2] = 118;
                    bArr[3] = 110;
                    bArr[4] = 100;
                    bArr[5] = 46;
                    bArr[6] = 115;
                    bArr[7] = 101;
                    bArr[8] = 99;
                    bArr[9] = 46;
                    bArr[10] = 99;
                    bArr[11] = 111;
                    bArr[12] = 110;
                    bArr[13] = 116;
                    bArr[14] = 97;
                    bArr[15] = 99;
                    bArr[16] = 116;
                    bArr[17] = 46;
                    bArr[18] = 112;
                    bArr[19] = 104;
                    bArr[20] = 111;
                    bArr[21] = 110;
                    bArr[22] = 101;
                    bArr[23] = 10;
                    bArr[24] = 19;
                    bArr[25] = 76;
                    bArr[26] = 111;
                    bArr[27] = 99;
                    bArr[28] = 97;
                    bArr[29] = 108;
                    bArr[30] = 32;
                    bArr[31] = 80;
                    bArr[32] = 104;
                    bArr[33] = 111;
                    bArr[34] = 110;
                    bArr[35] = 101;
                    bArr[36] = 32;
                    bArr[37] = 65;
                    bArr[38] = 99;
                    bArr[39] = 99;
                    bArr[40] = 111;
                    bArr[41] = 117;
                    bArr[42] = 110;
                    bArr[43] = 116;
                    bArr[44] = 10;
                    bArr[45] = 24;
                    bArr[46] = 99;
                    bArr[47] = 111;
                    bArr[48] = 109;
                    bArr[49] = 46;
                    bArr[50] = 97;
                    bArr[51] = 110;
                    bArr[52] = 100;
                    bArr[53] = 114;
                    bArr[54] = 111;
                    bArr[55] = 105;
                    bArr[56] = 100;
                    bArr[57] = 46;
                    bArr[58] = 104;
                    bArr[59] = 117;
                    bArr[60] = 97;
                    bArr[61] = 119;
                    bArr[62] = 101;
                    bArr[63] = 105;
                    bArr[64] = 46;
                    bArr[65] = 112;
                    bArr[66] = 104;
                    bArr[67] = 111;
                    bArr[68] = 110;
                    bArr[69] = 101;
                    bArr[70] = 10;
                    bArr[71] = 28;
                    bArr[72] = 99;
                    bArr[73] = 111;
                    bArr[74] = 109;
                    bArr[75] = 46;
                    bArr[76] = 97;
                    bArr[77] = 110;
                    bArr[78] = 100;
                    bArr[79] = 114;
                    bArr[80] = 111;
                    bArr[81] = 105;
                    bArr[82] = 100;
                    bArr[83] = 46;
                    bArr[84] = 99;
                    bArr[85] = 111;
                    bArr[86] = 110;
                    bArr[87] = 116;
                    bArr[88] = 97;
                    bArr[89] = 99;
                    bArr[90] = 116;
                    bArr[91] = 115;
                    bArr[92] = 46;
                    bArr[93] = 100;
                    bArr[94] = 101;
                    bArr[95] = 102;
                    bArr[96] = 97;
                    bArr[97] = 117;
                    bArr[98] = 108;
                    bArr[99] = 116;
                    bArr[100] = 10;
                    bArr[101] = 12;
                    bArr[102] = 99;
                    bArr[103] = 111;
                    bArr[104] = 109;
                    bArr[105] = 46;
                    bArr[106] = 108;
                    bArr[107] = 103;
                    bArr[108] = 101;
                    bArr[109] = 46;
                    bArr[110] = 115;
                    bArr[111] = 121;
                    bArr[112] = 110;
                    bArr[113] = 99;
                    bArr[114] = 10;
                    bArr[115] = 22;
                    bArr[116] = 99;
                    bArr[117] = 111;
                    bArr[118] = 109;
                    bArr[119] = 46;
                    bArr[120] = 97;
                    bArr[121] = 110;
                    bArr[122] = 100;
                    bArr[123] = 114;
                    bArr[124] = 111;
                    bArr[125] = 105;
                    bArr[126] = 100;
                    bArr[127] = 46;
                    bArr[128] = 108;
                    bArr[129] = 111;
                    bArr[130] = 99;
                    bArr[131] = 97;
                    bArr[132] = 108;
                    bArr[133] = 112;
                    bArr[134] = 104;
                    bArr[135] = 111;
                    bArr[136] = 110;
                    bArr[137] = 101;
                    bArr[138] = 10;
                    bArr[139] = 16;
                    bArr[140] = 97;
                    bArr[141] = 115;
                    bArr[142] = 117;
                    bArr[143] = 115;
                    bArr[144] = 46;
                    bArr[145] = 108;
                    bArr[146] = 111;
                    bArr[147] = 99;
                    bArr[148] = 97;
                    bArr[149] = 108;
                    bArr[150] = 46;
                    bArr[151] = 112;
                    bArr[152] = 104;
                    bArr[153] = 111;
                    bArr[154] = 110;
                    bArr[155] = 101;
                    bdyx.m91608a(bdyw, "AccountCategoriesFeature__device_account_types", (bydj) bxvk.m124014a(bydj.f165795b, bArr), cfuq.f185740a);
                    bdyx.m91610a(bdyw, "AccountCategoriesFeature__treat_empty_account_type_as_null_account", false);
                } catch (bxwf e) {
                    throw new AssertionError("Could not parse proto flag \"AccountCategoriesFeature__device_account_types\"");
                }
            } catch (bxwf e2) {
                throw new AssertionError("Could not parse proto flag \"AccountCategoriesFeature__caller_whitelist\"");
            }
        } catch (bxwf e3) {
            throw new AssertionError("Could not parse proto flag \"AccountCategoriesFeature__account_categories_config\"");
        }
    }

    /* renamed from: a */
    public final allx mo82744a() {
        return (allx) f185741a.mo58455c();
    }

    /* renamed from: b */
    public final bydj mo82745b() {
        return (bydj) f185742b.mo58455c();
    }

    /* renamed from: c */
    public final boolean mo82746c() {
        return ((Boolean) f185743c.mo58455c()).booleanValue();
    }
}
