package p000;

import android.util.Log;

/* renamed from: bfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfd extends bew {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgr.a(java.lang.String, boolean):java.lang.Object
     arg types: [java.lang.String, int]
     candidates:
      bgr.a(java.lang.String, java.lang.Object):void
      bgr.a(java.lang.String, boolean):java.lang.Object */
    /* renamed from: a */
    public final void mo3074a() {
        bfq bfq;
        String str = "TOKEN_NUMBER";
        bgr bgr = bgs.f3191a;
        try {
            if (bgd.m2920a((byte) 3, (byte) 16) != 30003) {
                if (((Byte) bes.m2844a("TR_MOB_CVM_STATUS")).byteValue() != 117) {
                    if (bgd.m2926c() != 4) {
                        String str2 = (String) bes.m2844a("UNPREDICTABLE_NUMBER");
                        String str3 = (String) bes.m2844a("TRANSACTION_CONTEXT");
                        String valueOf = String.valueOf(str2);
                        if (valueOf.length() == 0) {
                            try {
                                new String("::TokenInAppDelegate::doOperation::unpredictableNumber::");
                            } catch (bfq e) {
                                bfq = e;
                                str = "core-hceclient";
                            }
                        } else {
                            "::TokenInAppDelegate::doOperation::unpredictableNumber::".concat(valueOf);
                        }
                        String valueOf2 = String.valueOf(str3);
                        if (valueOf2.length() == 0) {
                            new String("::TokenInAppDelegate::doOperation::transactionContext::");
                        } else {
                            "::TokenInAppDelegate::doOperation::transactionContext::".concat(valueOf2);
                        }
                        String a = beu.m2848a("RUNNING_ATC");
                        String valueOf3 = String.valueOf(a);
                        if (valueOf3.length() == 0) {
                            new String("::TokenInAppDelegate::doOperation::currentATC::");
                        } else {
                            "::TokenInAppDelegate::doOperation::currentATC::".concat(valueOf3);
                        }
                        bes.m2845a("TR_CVR", new byte[]{3, Byte.MIN_VALUE, 0, 0});
                        bgd.m2924b();
                        byte[] bArr = (byte[]) bes.m2844a("TR_CVR");
                        String valueOf4 = String.valueOf(bgx.m3012b(bArr));
                        if (valueOf4.length() == 0) {
                            new String("::TokenInAppDelegate::doOperation::cvrBytes::");
                        } else {
                            "::TokenInAppDelegate::doOperation::cvrBytes::".concat(valueOf4);
                        }
                        String b = bgx.m3012b(bArr);
                        String valueOf5 = String.valueOf(b);
                        if (valueOf5.length() == 0) {
                            new String("::TokenInAppDelegate::doOperation::cvr::");
                        } else {
                            "::TokenInAppDelegate::doOperation::cvr::".concat(valueOf5);
                        }
                        String valueOf6 = String.valueOf(str2);
                        String str4 = valueOf6.length() == 0 ? new String("00000000000000000000000000008000000000000014010100") : "00000000000000000000000000008000000000000014010100".concat(valueOf6);
                        String str5 = "core-hceclient";
                        try {
                            String valueOf7 = String.valueOf(str4);
                            if (valueOf7.length() == 0) {
                                try {
                                    new String("::TokenInAppDelegate::computeCryptoInputData::terminalData::");
                                } catch (bfq e2) {
                                    bfq = e2;
                                    str = str5;
                                }
                            } else {
                                "::TokenInAppDelegate::computeCryptoInputData::terminalData::".concat(valueOf7);
                            }
                            String a2 = bhp.m3055a(str4.length() / 2);
                            bgr bgr2 = bgr;
                            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 4 + String.valueOf(str4).length() + String.valueOf(a).length() + String.valueOf(b).length());
                            sb.append(a2);
                            sb.append(str4);
                            sb.append("0000");
                            sb.append(a);
                            sb.append(b);
                            String sb2 = sb.toString();
                            String valueOf8 = String.valueOf(sb2);
                            if (valueOf8.length() == 0) {
                                new String("::TokenInAppDelegate::doOperation::cryptogramInData::");
                            } else {
                                "::TokenInAppDelegate::doOperation::cryptogramInData::".concat(valueOf8);
                            }
                            bgr bgr3 = bgs.f3191a;
                            byte[] bArr2 = new byte[8];
                            int c = new bgl().mo3109c(bgx.m3011a(sb2), bArr2);
                            bew.m2863a(c);
                            String valueOf9 = String.valueOf(bgx.m3012b(bArr2));
                            String str6 = "TOKEN_EXPIRY";
                            if (valueOf9.length() == 0) {
                                new String("::TokenInAppDelegate::doOperation::cryptogram::");
                            } else {
                                "::TokenInAppDelegate::doOperation::cryptogram::".concat(valueOf9);
                            }
                            if (c < 0) {
                                throw new bfq((short) 27013);
                            } else if (c != 65535) {
                                String str7 = str;
                                bes.m2845a("APPLICATION_CYPTOGRAM", bgx.m3004a(bArr2));
                                bgr3.mo3121a("INAPP_USED_ATC", Integer.valueOf(c));
                                bgr bgr4 = bgs.f3191a;
                                byte[] bArr3 = new byte[20];
                                bArr3[0] = 38;
                                String str8 = str3;
                                System.arraycopy(bArr2, 0, bArr3, 1, 8);
                                String valueOf10 = String.valueOf(bgx.m3004a(bArr2));
                                if (valueOf10.length() == 0) {
                                    new String("::TokenInAppDelegate::doOperation::cryptogram::");
                                } else {
                                    "::TokenInAppDelegate::doOperation::cryptogram::".concat(valueOf10);
                                }
                                byte[] a3 = bgx.m3011a(str2);
                                int length = a3.length;
                                System.arraycopy(a3, 0, bArr3, 9, length);
                                int i = length + 9;
                                String valueOf11 = String.valueOf(bgx.m3004a(a3));
                                if (valueOf11.length() == 0) {
                                    new String("::TokenInAppDelegate::doOperation::unpredictableNumber::");
                                } else {
                                    "::TokenInAppDelegate::doOperation::unpredictableNumber::".concat(valueOf11);
                                }
                                byte[] a4 = bgx.m3011a(a);
                                int length2 = a4.length;
                                System.arraycopy(a4, 0, bArr3, i, length2);
                                int i2 = i + length2;
                                String valueOf12 = String.valueOf(bgx.m3004a(a4));
                                if (valueOf12.length() == 0) {
                                    new String("::TokenInAppDelegate::doOperation::atc::");
                                } else {
                                    "::TokenInAppDelegate::doOperation::atc::".concat(valueOf12);
                                }
                                byte[] a5 = bgx.m3011a(b);
                                int length3 = a5.length;
                                System.arraycopy(a5, 1, bArr3, i2, length3 - 1);
                                int i3 = (i2 + length3) - 1;
                                String valueOf13 = String.valueOf(bgx.m3004a(a5));
                                if (valueOf13.length() == 0) {
                                    new String("::TokenInAppDelegate::doOperation::cvr::");
                                } else {
                                    "::TokenInAppDelegate::doOperation::cvr::".concat(valueOf13);
                                }
                                String b2 = beu.m2852b(String.format("%04x", (Integer) bgr4.mo3119a("INAPP_USED_ATC", true)));
                                if (b2 != null) {
                                    bArr3[i3] = bgx.m3011a(b2)[0];
                                    int i4 = i3 + 1;
                                    if (b2.length() == 0) {
                                        new String("::TokenInAppDelegate::doOperation::dki::");
                                    } else {
                                        "::TokenInAppDelegate::doOperation::dki::".concat(b2);
                                    }
                                    bia a6 = bev.m2854a(bev.m2856a(), bgt.m2993a("CARD_RISK_MANAGEMENT_EMV_DGI"), bgt.m2993a("PAN_SEQUENCE_NUMBER"), true);
                                    if (a6 == null) {
                                        a6 = bev.m2854a(bev.m2856a(), bgt.m2993a("CARD_RISK_MANAGEMENT_MS_DGI"), bgt.m2993a("PAN_SEQUENCE_NUMBER"), true);
                                    }
                                    byte b3 = bgx.m3011a(a6.f3270h)[0];
                                    bArr3[i4] = b3;
                                    StringBuilder sb3 = new StringBuilder(58);
                                    sb3.append("::TokenInAppDelegate::doOperation::panSequenceNumber::");
                                    sb3.append((int) b3);
                                    sb3.toString();
                                    String valueOf14 = String.valueOf(bgx.m3004a(bArr3));
                                    if (valueOf14.length() == 0) {
                                        new String("::TokenInAppDelegate::doOperation::tokenDataBlockA::");
                                    } else {
                                        "::TokenInAppDelegate::doOperation::tokenDataBlockA::".concat(valueOf14);
                                    }
                                    bgd.m2921a();
                                    bgl bgl = new bgl();
                                    byte[] a7 = bgx.m3011a(str8);
                                    byte[] bArr4 = new byte[65];
                                    byte[] bArr5 = new byte[20];
                                    bia a8 = bev.m2854a(bev.m2856a(), bgt.m2993a("CARD_RISK_MANAGEMENT_EMV_DGI"), bgt.m2993a(str7), true);
                                    if (a8 == null) {
                                        a8 = bev.m2854a(bev.m2856a(), bgt.m2993a("CARD_RISK_MANAGEMENT_MS_DGI"), bgt.m2993a(str7), true);
                                    }
                                    String str9 = a8.f3270h;
                                    String substring = str9.substring(0, str9.length() - 1);
                                    String valueOf15 = String.valueOf(substring);
                                    if (valueOf15.length() == 0) {
                                        new String("::TokenInAppDelegate::doOperation::tokenNumber::");
                                    } else {
                                        "::TokenInAppDelegate::doOperation::tokenNumber::".concat(valueOf15);
                                    }
                                    bia a9 = bev.m2854a(bev.m2856a(), bgt.m2993a("CARD_RISK_MANAGEMENT_EMV_DGI"), bgt.m2993a(str6), true);
                                    if (a9 == null) {
                                        a9 = bev.m2854a(bev.m2856a(), bgt.m2993a("CARD_RISK_MANAGEMENT_MS_DGI"), bgt.m2993a(str6), true);
                                    }
                                    String str10 = a9.f3270h;
                                    String valueOf16 = String.valueOf(str10);
                                    if (valueOf16.length() == 0) {
                                        new String("::TokenInAppDelegate::doOperation::tokenExpiry::");
                                    } else {
                                        "::TokenInAppDelegate::doOperation::tokenExpiry::".concat(valueOf16);
                                    }
                                    String valueOf17 = String.valueOf(substring);
                                    String valueOf18 = String.valueOf(str10);
                                    byte[] bytes = (valueOf18.length() == 0 ? new String(valueOf17) : valueOf17.concat(valueOf18)).getBytes();
                                    String valueOf19 = String.valueOf(bgx.m3004a(bytes));
                                    if (valueOf19.length() == 0) {
                                        new String("::TokenInAppDelegate::doOperation::tokenInfo::");
                                    } else {
                                        "::TokenInAppDelegate::doOperation::tokenInfo::".concat(valueOf19);
                                    }
                                    int length4 = bytes.length;
                                    System.arraycopy(bytes, 0, bArr4, 0, length4);
                                    System.arraycopy(bArr3, 0, bArr4, length4, 20);
                                    System.arraycopy(bArr5, 0, bArr4, length4 + 20, 20);
                                    String valueOf20 = String.valueOf(bgx.m3004a(bArr4));
                                    if (valueOf20.length() == 0) {
                                        new String("::TokenInAppDelegate::doOperation::inappPayload::");
                                    } else {
                                        "::TokenInAppDelegate::doOperation::inappPayload::".concat(valueOf20);
                                    }
                                    bew.m2863a(bgl.mo3111d(a7, bArr4));
                                    String valueOf21 = String.valueOf(bgx.m3004a(bArr4));
                                    if (valueOf21.length() == 0) {
                                        new String("::TokenInAppDelegate::doOperation::inappPayload::");
                                    } else {
                                        "::TokenInAppDelegate::doOperation::inappPayload::".concat(valueOf21);
                                    }
                                    bgr2.mo3121a("INAPP_PAYLOAD", bgx.m3004a(bArr4));
                                    bes.m2845a("TID", bhc.m3024a((byte) 83));
                                    return;
                                }
                                throw new bfq((short) 27013);
                            } else {
                                bgd.m2922a(5);
                                str = str5;
                                try {
                                    Log.e(str, "::TokenInAppDelegate::HIGHEST ATC REACHED - APPLICATION TERMINATED!!");
                                    throw new bfq((short) 27013);
                                } catch (bfq e3) {
                                    e = e3;
                                    bfq = e;
                                    try {
                                        Log.e(str, "::TokenInAppDelegate::catch::", bfq);
                                        throw bfq;
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        } catch (bfq e4) {
                            e = e4;
                            str = str5;
                            bfq = e;
                            Log.e(str, "::TokenInAppDelegate::catch::", bfq);
                            throw bfq;
                        }
                    } else {
                        throw new bfq(bha.OPERATION_NOT_SUPPORTED);
                    }
                }
            }
            throw new bfq(bha.OPERATION_NOT_SUPPORTED);
        } catch (bfq e5) {
            e = e5;
            str = "core-hceclient";
            bfq = e;
            Log.e(str, "::TokenInAppDelegate::catch::", bfq);
            throw bfq;
        }
    }
}
