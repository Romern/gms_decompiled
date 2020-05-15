package p000;

/* renamed from: bgh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgh extends bga {
    /* JADX WARNING: Removed duplicated region for block: B:61:0x015f A[Catch:{ bfq -> 0x01d3 }] */
    /* renamed from: a */
    public final bfr mo3097a(bfz bfz) {
        boolean z;
        String str;
        byte byteValue;
        bfr bfr = new bfr();
        try {
            int i = bfz.f3148d >> 3;
            byte b = bfz.f3147c;
            if (bgd.m2926c() == 4) {
                throw new bfq((short) 27014);
            } else if (bgd.m2926c() != 5) {
                if (!(((Short) bes.m2844a("TR_APP_STATE")).shortValue() == 13141 || ((Short) bes.m2844a("TR_APP_STATE")).shortValue() == 31357)) {
                    if (((Short) bes.m2844a("TR_APP_STATE")).shortValue() != 26772) {
                        throw new bfq((short) 27013);
                    }
                }
                byte b2 = bfz.f3148d;
                if ((b2 & 7) != 4 || bfz.f3147c == 0 || ((b2 & 248) >> 3) > 30) {
                    throw new bfq((short) 27270);
                } else if (bfz.f3151g == 2) {
                    if (i == 1) {
                        if (b == 1) {
                            if (((Byte) bes.m2844a("TR_TERMINAL_MODE")).byteValue() != 83) {
                                str = bgt.m2993a("SFI1_REC1_DGI_MS");
                                z = true;
                            } else {
                                str = bgt.m2993a("SFI1_REC1_DGI_EMV");
                                z = false;
                            }
                            String str2 = (String) this.f3155a.f3119a.get(str);
                            if (z && bgd.m2920a((byte) 4, (byte) 1) == -23238 && ((Byte) bes.m2844a("TR_MOB_CVM_STATUS")).byteValue() == -102) {
                                int parseInt = Integer.parseInt(bev.m2862c("SERVICE_CODE_MS_OFFSET"), 10);
                                byteValue = ((Byte) bes.m2844a("TR_MOB_CVM_TYPE")).byteValue();
                                String str3 = "721";
                                if (byteValue != 35) {
                                    if (byteValue == 70) {
                                        str3 = "728";
                                    } else if (byteValue != 81) {
                                    }
                                    String substring = str2.substring(0, parseInt);
                                    String substring2 = str2.substring(parseInt + 3);
                                    StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + str3.length() + String.valueOf(substring2).length());
                                    sb.append(substring);
                                    sb.append(str3);
                                    sb.append(substring2);
                                    str2 = sb.toString();
                                }
                                str3 = "727";
                                String substring3 = str2.substring(0, parseInt);
                                String substring22 = str2.substring(parseInt + 3);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(substring3).length() + str3.length() + String.valueOf(substring22).length());
                                sb2.append(substring3);
                                sb2.append(str3);
                                sb2.append(substring22);
                                str2 = sb2.toString();
                            }
                            bfr.f3126a = bgx.m3011a(str2);
                            return bfr;
                        }
                    }
                    bfr.f3127b = 27266;
                    byte[] bArr = (byte[]) bes.m2844a("TR_ACTIVE_AFL");
                    if (bArr == null) {
                        if (bgd.m2920a((byte) 2, (byte) 1) == -23238) {
                            bArr = bgx.m3011a(bev.m2854a(this.f3155a.f3120b, bgt.m2993a("MS_AIP_DGI"), bgt.m2993a("EMV_AFL_TAG"), true).f3270h);
                        } else {
                            bArr = bgx.m3011a(bev.m2854a(this.f3155a.f3120b, bgt.m2993a("EMV_AIP_DGI"), bgt.m2993a("EMV_AFL_TAG"), true).f3270h);
                        }
                    }
                    short s = 0;
                    while (s < bArr.length) {
                        short s2 = (short) (s + 1);
                        byte b3 = bArr[s];
                        short s3 = (short) (s2 + 1);
                        byte b4 = bArr[s2];
                        short s4 = (short) (s3 + 1);
                        byte b5 = bArr[s3];
                        if ((b3 >> 3) == i) {
                            bfr.f3127b = 27267;
                            if (b >= b4 && b <= b5) {
                                bfr.f3127b = -28672;
                                String valueOf = String.valueOf(bhp.m3054a((byte) i));
                                String valueOf2 = String.valueOf(bhp.m3054a(b));
                                str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
                                z = false;
                                String str22 = (String) this.f3155a.f3119a.get(str);
                                int parseInt2 = Integer.parseInt(bev.m2862c("SERVICE_CODE_MS_OFFSET"), 10);
                                byteValue = ((Byte) bes.m2844a("TR_MOB_CVM_TYPE")).byteValue();
                                String str32 = "721";
                                if (byteValue != 35) {
                                }
                                str32 = "727";
                                String substring32 = str22.substring(0, parseInt2);
                                String substring222 = str22.substring(parseInt2 + 3);
                                StringBuilder sb22 = new StringBuilder(String.valueOf(substring32).length() + str32.length() + String.valueOf(substring222).length());
                                sb22.append(substring32);
                                sb22.append(str32);
                                sb22.append(substring222);
                                str22 = sb22.toString();
                                bfr.f3126a = bgx.m3011a(str22);
                                return bfr;
                            }
                        }
                        s = (short) (s4 + 1);
                    }
                    throw new bfq(bfr.f3127b);
                } else {
                    throw new bfq((short) 26368);
                }
            } else {
                throw new bfq((short) 27013);
            }
        } catch (bfq e) {
            short s5 = e.f3125b;
            if (s5 == 0) {
                bfr.f3127b = 28416;
            } else {
                bfr.f3127b = s5;
            }
            bes.m2845a("TR_APP_STATE", (short) 14161);
        }
    }
}
