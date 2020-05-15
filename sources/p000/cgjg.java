package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;

/* renamed from: cgjg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cgjg implements cgjc {

    /* renamed from: a */
    public static final bdyx f187060a;

    /* renamed from: b */
    public static final bdyx f187061b;

    /* renamed from: c */
    public static final bdyx f187062c;

    /* renamed from: d */
    public static final bdyx f187063d;

    /* renamed from: e */
    public static final bdyx f187064e;

    /* renamed from: f */
    public static final bdyx f187065f;

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
        bdyw bdyw = new bdyw(bdyj.m91581a("com.google.android.gms.romanesco"));
        f187060a = bdyx.m91610a(bdyw, "ContactsUploadAppActionFeature__enable_upload_contacts_3p_action", false);
        f187061b = bdyx.m91610a(bdyw, "ContactsUploadAppActionFeature__limit_3p_contacts_uploaded", true);
        f187062c = bdyx.m91607a(bdyw, "ContactsUploadAppActionFeature__max_num_3p_contacts", 200L);
        try {
            f187063d = bdyx.m91608a(bdyw, "ContactsUploadAppActionFeature__mimetype_configs", (bzeo) bxvk.m124014a(bzeo.f169695b, new byte[]{10, 52, 10, 48, 118, 110, 100, 46, 97, 110, 100, 114, 111, 105, 100, 46, 99, 117, 114, 115, 111, 114, 46, 105, 116, 101, 109, 47, 118, 110, 100, 46, 99, 111, 109, 46, 119, 104, 97, 116, 115, 97, 112, 112, 46, 112, 114, 111, 102, 105, 108, 101, 16, 1, 10, 54, 10, 50, 118, 110, 100, 46, 97, 110, 100, 114, 111, 105, 100, 46, 99, 117, 114, 115, 111, 114, 46, 105, 116, 101, 109, 47, 118, 110, 100, 46, 99, 111, 109, 46, 119, 104, 97, 116, 115, 97, 112, 112, 46, 118, 111, 105, 112, 46, 99, 97, 108, 108, 16, 2, 10, 55, 10, 51, 118, 110, 100, 46, 97, 110, 100, 114, 111, 105, 100, 46, 99, 117, 114, 115, 111, 114, 46, 105, 116, 101, 109, 47, 118, 110, 100, 46, 99, 111, 109, 46, 119, 104, 97, 116, 115, 97, 112, 112, 46, 118, 105, 100, 101, 111, 46, 99, 97, 108, 108, 16, 3, 10, 61, 10, 57, 118, 110, 100, 46, 97, 110, 100, 114, 111, 105, 100, 46, 99, 117, 114, 115, 111, 114, 46, 105, 116, 101, 109, 47, 118, 110, 100, 46, 106, 112, 46, 110, 97, 118, 101, 114, 46, 108, 105, 110, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 112, 114, 111, 102, 105, 108, 101, 16, 4}), cgjd.f187057a);
            try {
                f187064e = bdyx.m91608a(bdyw, "ContactsUploadAppActionFeature__whitelist_for_3p_data", (bydj) bxvk.m124014a(bydj.f165795b, new byte[]{10, 5, 100, 97, 116, 97, 49, 10, 5, 100, 97, 116, 97, 50, 10, 5, 100, 97, 116, 97, 51, 10, 5, 100, 97, 116, 97, 52, 10, 5, 100, 97, 116, 97, 53}), cgje.f187058a);
                try {
                    byte[] bArr = new byte[BaseMfiEventCallback.TYPE_CARD_NOT_UNIQUE];
                    bArr[0] = 10;
                    bArr[1] = 48;
                    bArr[2] = 118;
                    bArr[3] = 110;
                    bArr[4] = 100;
                    bArr[5] = 46;
                    bArr[6] = 97;
                    bArr[7] = 110;
                    bArr[8] = 100;
                    bArr[9] = 114;
                    bArr[10] = 111;
                    bArr[11] = 105;
                    bArr[12] = 100;
                    bArr[13] = 46;
                    bArr[14] = 99;
                    bArr[15] = 117;
                    bArr[16] = 114;
                    bArr[17] = 115;
                    bArr[18] = 111;
                    bArr[19] = 114;
                    bArr[20] = 46;
                    bArr[21] = 105;
                    bArr[22] = 116;
                    bArr[23] = 101;
                    bArr[24] = 109;
                    bArr[25] = 47;
                    bArr[26] = 118;
                    bArr[27] = 110;
                    bArr[28] = 100;
                    bArr[29] = 46;
                    bArr[30] = 99;
                    bArr[31] = 111;
                    bArr[32] = 109;
                    bArr[33] = 46;
                    bArr[34] = 119;
                    bArr[35] = 104;
                    bArr[36] = 97;
                    bArr[37] = 116;
                    bArr[38] = 115;
                    bArr[39] = 97;
                    bArr[40] = 112;
                    bArr[41] = 112;
                    bArr[42] = 46;
                    bArr[43] = 112;
                    bArr[44] = 114;
                    bArr[45] = 111;
                    bArr[46] = 102;
                    bArr[47] = 105;
                    bArr[48] = 108;
                    bArr[49] = 101;
                    bArr[50] = 10;
                    bArr[51] = 50;
                    bArr[52] = 118;
                    bArr[53] = 110;
                    bArr[54] = 100;
                    bArr[55] = 46;
                    bArr[56] = 97;
                    bArr[57] = 110;
                    bArr[58] = 100;
                    bArr[59] = 114;
                    bArr[60] = 111;
                    bArr[61] = 105;
                    bArr[62] = 100;
                    bArr[63] = 46;
                    bArr[64] = 99;
                    bArr[65] = 117;
                    bArr[66] = 114;
                    bArr[67] = 115;
                    bArr[68] = 111;
                    bArr[69] = 114;
                    bArr[70] = 46;
                    bArr[71] = 105;
                    bArr[72] = 116;
                    bArr[73] = 101;
                    bArr[74] = 109;
                    bArr[75] = 47;
                    bArr[76] = 118;
                    bArr[77] = 110;
                    bArr[78] = 100;
                    bArr[79] = 46;
                    bArr[80] = 99;
                    bArr[81] = 111;
                    bArr[82] = 109;
                    bArr[83] = 46;
                    bArr[84] = 119;
                    bArr[85] = 104;
                    bArr[86] = 97;
                    bArr[87] = 116;
                    bArr[88] = 115;
                    bArr[89] = 97;
                    bArr[90] = 112;
                    bArr[91] = 112;
                    bArr[92] = 46;
                    bArr[93] = 118;
                    bArr[94] = 111;
                    bArr[95] = 105;
                    bArr[96] = 112;
                    bArr[97] = 46;
                    bArr[98] = 99;
                    bArr[99] = 97;
                    bArr[100] = 108;
                    bArr[101] = 108;
                    bArr[102] = 10;
                    bArr[103] = 51;
                    bArr[104] = 118;
                    bArr[105] = 110;
                    bArr[106] = 100;
                    bArr[107] = 46;
                    bArr[108] = 97;
                    bArr[109] = 110;
                    bArr[110] = 100;
                    bArr[111] = 114;
                    bArr[112] = 111;
                    bArr[113] = 105;
                    bArr[114] = 100;
                    bArr[115] = 46;
                    bArr[116] = 99;
                    bArr[117] = 117;
                    bArr[118] = 114;
                    bArr[119] = 115;
                    bArr[120] = 111;
                    bArr[121] = 114;
                    bArr[122] = 46;
                    bArr[123] = 105;
                    bArr[124] = 116;
                    bArr[125] = 101;
                    bArr[126] = 109;
                    bArr[127] = 47;
                    bArr[128] = 118;
                    bArr[129] = 110;
                    bArr[130] = 100;
                    bArr[131] = 46;
                    bArr[132] = 99;
                    bArr[133] = 111;
                    bArr[134] = 109;
                    bArr[135] = 46;
                    bArr[136] = 119;
                    bArr[137] = 104;
                    bArr[138] = 97;
                    bArr[139] = 116;
                    bArr[140] = 115;
                    bArr[141] = 97;
                    bArr[142] = 112;
                    bArr[143] = 112;
                    bArr[144] = 46;
                    bArr[145] = 118;
                    bArr[146] = 105;
                    bArr[147] = 100;
                    bArr[148] = 101;
                    bArr[149] = 111;
                    bArr[150] = 46;
                    bArr[151] = 99;
                    bArr[152] = 97;
                    bArr[153] = 108;
                    bArr[154] = 108;
                    bArr[155] = 10;
                    bArr[156] = 57;
                    bArr[157] = 118;
                    bArr[158] = 110;
                    bArr[159] = 100;
                    bArr[160] = 46;
                    bArr[161] = 97;
                    bArr[162] = 110;
                    bArr[163] = 100;
                    bArr[164] = 114;
                    bArr[165] = 111;
                    bArr[166] = 105;
                    bArr[167] = 100;
                    bArr[168] = 46;
                    bArr[169] = 99;
                    bArr[170] = 117;
                    bArr[171] = 114;
                    bArr[172] = 115;
                    bArr[173] = 111;
                    bArr[174] = 114;
                    bArr[175] = 46;
                    bArr[176] = 105;
                    bArr[177] = 116;
                    bArr[178] = 101;
                    bArr[179] = 109;
                    bArr[180] = 47;
                    bArr[181] = 118;
                    bArr[182] = 110;
                    bArr[183] = 100;
                    bArr[184] = 46;
                    bArr[185] = 106;
                    bArr[186] = 112;
                    bArr[187] = 46;
                    bArr[188] = 110;
                    bArr[189] = 97;
                    bArr[190] = 118;
                    bArr[191] = 101;
                    bArr[192] = 114;
                    bArr[193] = 46;
                    bArr[194] = 108;
                    bArr[195] = 105;
                    bArr[196] = 110;
                    bArr[197] = 101;
                    bArr[198] = 46;
                    bArr[199] = 97;
                    bArr[200] = 110;
                    bArr[201] = 100;
                    bArr[202] = 114;
                    bArr[203] = 111;
                    bArr[204] = 105;
                    bArr[205] = 100;
                    bArr[206] = 46;
                    bArr[207] = 112;
                    bArr[208] = 114;
                    bArr[209] = 111;
                    bArr[210] = 102;
                    bArr[211] = 105;
                    bArr[212] = 108;
                    bArr[213] = 101;
                    f187065f = bdyx.m91608a(bdyw, "ContactsUploadAppActionFeature__whitelist_for_3p_mimetypes", (bydj) bxvk.m124014a(bydj.f165795b, bArr), cgjf.f187059a);
                } catch (bxwf e) {
                    throw new AssertionError("Could not parse proto flag \"ContactsUploadAppActionFeature__whitelist_for_3p_mimetypes\"");
                }
            } catch (bxwf e2) {
                throw new AssertionError("Could not parse proto flag \"ContactsUploadAppActionFeature__whitelist_for_3p_data\"");
            }
        } catch (bxwf e3) {
            throw new AssertionError("Could not parse proto flag \"ContactsUploadAppActionFeature__mimetype_configs\"");
        }
    }

    /* renamed from: a */
    public final boolean mo83892a() {
        return ((Boolean) f187060a.mo58455c()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo83893b() {
        return ((Boolean) f187061b.mo58455c()).booleanValue();
    }

    /* renamed from: c */
    public final long mo83894c() {
        return ((Long) f187062c.mo58455c()).longValue();
    }

    /* renamed from: d */
    public final bzeo mo83895d() {
        return (bzeo) f187063d.mo58455c();
    }

    /* renamed from: e */
    public final bydj mo83896e() {
        return (bydj) f187064e.mo58455c();
    }

    /* renamed from: f */
    public final bydj mo83897f() {
        return (bydj) f187065f.mo58455c();
    }
}
