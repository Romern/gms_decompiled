package p000;

/* renamed from: ahoy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahoy {
    /* renamed from: a */
    public static buuj m56304a(buuw buuw, bxxc bxxc) {
        bxvd da = buux.f155003j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buux buux = (buux) da.f164949b;
        buux.f155006b = buuw.f155002i;
        buux.f155005a |= 1;
        buub buub = buub.UNKNOWN_MEDIUM;
        bvif bvif = bvif.UNKNOWN_MEDIUM;
        buuw buuw2 = buuw.UNKNOWN_FRAME_TYPE;
        switch (buuw.ordinal()) {
            case 1:
                buuc buuc = (buuc) bxxc;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                buux buux2 = (buux) da.f164949b;
                buuc.getClass();
                buux2.f155007c = buuc;
                buux2.f155005a |= 2;
                break;
            case 2:
                buud buud = (buud) bxxc;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                buux buux3 = (buux) da.f164949b;
                buud.getClass();
                buux3.f155008d = buud;
                buux3.f155005a |= 4;
                break;
            case 3:
                buuu buuu = (buuu) bxxc;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                buux buux4 = (buux) da.f164949b;
                buuu.getClass();
                buux4.f155009e = buuu;
                buux4.f155005a |= 8;
                break;
            case 4:
                buty buty = (buty) bxxc;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                buux buux5 = (buux) da.f164949b;
                buty.getClass();
                buux5.f155010f = buty;
                buux5.f155005a |= 16;
                break;
            case 5:
                buuf buuf = (buuf) bxxc;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                buux buux6 = (buux) da.f164949b;
                buuf.getClass();
                buux6.f155011g = buuf;
                buux6.f155005a |= 32;
                break;
            case 6:
                buue buue = (buue) bxxc;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                buux buux7 = (buux) da.f164949b;
                buue.getClass();
                buux7.f155012h = buue;
                buux7.f155005a |= 64;
                break;
            case 7:
                buuk buuk = (buuk) bxxc;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                buux buux8 = (buux) da.f164949b;
                buuk.getClass();
                buux8.f155013i = buuk;
                buux8.f155005a |= 128;
                break;
        }
        bxvd da2 = buuj.f154946d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        buuj buuj = (buuj) da2.f164949b;
        buuj.f154949b = 1;
        buuj.f154948a |= 1;
        buux buux9 = (buux) da.mo74062i();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        buuj buuj2 = (buuj) da2.f164949b;
        buux9.getClass();
        buuj2.f154950c = buux9;
        buuj2.f154948a |= 2;
        return (buuj) da2.mo74062i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:195:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x02ef  */
    /* renamed from: a */
    static buuj m56305a(byte[] bArr) {
        boolean z;
        boolean z2;
        buuu buuu;
        boolean z3;
        boolean z4;
        boolean z5;
        buup a;
        int ordinal;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        buty buty;
        boolean z11;
        butx butx;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        buuj buuj = (buuj) bxvk.m124016a(buuj.f154946d, bArr, bxus.m123744c());
        buuw a2 = m56306a(buuj);
        buup buup = buup.UNKNOWN_PACKET_TYPE;
        buuw buuw = buuw.UNKNOWN_FRAME_TYPE;
        int ordinal2 = a2.ordinal();
        buuc buuc = null;
        butn butn = null;
        butu butu = null;
        butt butt = null;
        butw butw = null;
        butv butv = null;
        butq butq = null;
        buun buun = null;
        buuq buuq = null;
        buud buud = null;
        boolean z24 = false;
        boolean z25 = false;
        boolean z26 = false;
        boolean z27 = false;
        boolean z28 = false;
        r3 = false;
        boolean z29 = false;
        boolean z30 = false;
        boolean z31 = false;
        boolean z32 = false;
        boolean z33 = false;
        if (ordinal2 == 1) {
            buux buux = buuj.f154950c;
            if (buux == null) {
                buux = buux.f155003j;
            }
            if ((buux.f155005a & 2) != 0) {
                buux buux2 = buuj.f154950c;
                if (buux2 == null) {
                    buux2 = buux.f155003j;
                }
                buuc = buux2.f155007c;
                if (buuc == null) {
                    buuc = buuc.f154922j;
                }
            }
            if (buuc == null) {
                z = true;
            } else {
                z = false;
            }
            ahoz.m56311a(z, "OfflineFrame CONNECTION_REQUEST missing connectionRequest field.");
            if (((buuc.f154924a & 1) ^ 1) == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            ahoz.m56311a(z2, "OfflineFrame CONNECTION_REQUEST missing endpointId field.");
            if ((buuc.f154924a & 2) != 0) {
                z24 = true;
            }
            ahoz.m56311a(!z24, "OfflineFrame CONNECTION_REQUEST missing endpointName field.");
        } else if (ordinal2 == 2) {
            buux buux3 = buuj.f154950c;
            if (buux3 == null) {
                buux3 = buux.f155003j;
            }
            if ((buux3.f155005a & 4) != 0) {
                buux buux4 = buuj.f154950c;
                if (buux4 == null) {
                    buux4 = buux.f155003j;
                }
                buud = buux4.f155008d;
                if (buud == null) {
                    buud = buud.f154932d;
                }
            }
            if (buud == null) {
                z33 = true;
            }
            ahoz.m56311a(z33, "OfflineFrame CONNECTION_RESPONSE missing connectionResponse field.");
        } else if (ordinal2 == 3) {
            buux buux5 = buuj.f154950c;
            if (buux5 == null) {
                buux5 = buux.f155003j;
            }
            if ((buux5.f155005a & 8) != 0) {
                buux buux6 = buuj.f154950c;
                if (buux6 == null) {
                    buux6 = buux.f155003j;
                }
                buuu = buux6.f155009e;
                if (buuu == null) {
                    buuu = buuu.f154985f;
                }
            } else {
                buuu = null;
            }
            if (buuu == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            ahoz.m56311a(z3, "OfflineFrame PAYLOAD_TRANSFER missing payloadTransfer field.");
            if ((buuu.f154987a & 2) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            ahoz.m56311a(!z4, "OfflineFrame PAYLOAD_TRANSFER missing payloadHeader field.");
            buut buut = buuu.f154989c;
            if (buut == null) {
                buut = buut.f154979e;
            }
            if (buut.f154984d < 0) {
                buut buut2 = buuu.f154989c;
                if (buut2 == null) {
                    buut2 = buut.f154979e;
                }
                if (buut2.f154984d != -1) {
                    z5 = true;
                    ahoz.m56311a(z5, "OfflineFrame PAYLOAD_TRANSFER has a negative totalSize within payloadHeader.");
                    a = buup.m120469a(buuu.f154988b);
                    if (a == null) {
                        a = buup.UNKNOWN_PACKET_TYPE;
                    }
                    ordinal = a.ordinal();
                    if (ordinal != 1) {
                        if ((buuu.f154987a & 4) != 0 && (buuq = buuu.f154990d) == null) {
                            buuq = buuq.f154972e;
                        }
                        buut buut3 = buuu.f154989c;
                        if (buut3 == null) {
                            buut3 = buut.f154979e;
                        }
                        long j = buut3.f154984d;
                        ahoz.m56311a(buuq == null, "OfflineFrame PAYLOAD_TRANSFER(DATA) missing payloadChunk field.");
                        if (((buuq.f154974a & 1) ^ 1) == 0) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        ahoz.m56311a(z6, "OfflineFrame PAYLOAD_TRANSFER(DATA) missing flags field.");
                        int i = buuq.f154975b & 1;
                        if ((4 & buuq.f154974a) != 0) {
                            z7 = false;
                        } else {
                            z7 = i == 0;
                        }
                        ahoz.m56311a(z7, "OfflineFrame PAYLOAD_TRANSFER(DATA) missing body field.");
                        if (buuq.f154976c < 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        ahoz.m56311a(z8, "OfflineFrame PAYLOAD_TRANSFER(DATA) has a negative offset within payloadChunk.");
                        if (j != -1) {
                            if (j < buuq.f154976c) {
                                z32 = true;
                            }
                            ahoz.m56311a(z32, "OfflineFrame PAYLOAD_TRANSFER(DATA) has an offset greater than the totalSize within payloadChunk.");
                        }
                    } else if (ordinal == 2) {
                        if ((buuu.f154987a & 8) != 0 && (buun = buuu.f154991e) == null) {
                            buun = buun.f154961d;
                        }
                        buut buut4 = buuu.f154989c;
                        if (buut4 == null) {
                            buut4 = buut.f154979e;
                        }
                        long j2 = buut4.f154984d;
                        if (buun == null) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        ahoz.m56311a(z9, "OfflineFrame PAYLOAD_TRANSFER(CONTROL) missing controlMessage field.");
                        if (buun.f154965c < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ahoz.m56311a(z10, "OfflineFrame PAYLOAD_TRANSFER(CONTROL) has a negative offset within controlMessage.");
                        if (j2 != -1) {
                            if (j2 < buun.f154965c) {
                                z31 = true;
                            }
                            ahoz.m56311a(z31, "OfflineFrame PAYLOAD_TRANSFER(CONTROL) has an offset greater than the totalSize within payloadChunk.");
                        }
                    }
                }
            }
            z5 = false;
            ahoz.m56311a(z5, "OfflineFrame PAYLOAD_TRANSFER has a negative totalSize within payloadHeader.");
            a = buup.m120469a(buuu.f154988b);
            if (a == null) {
            }
            ordinal = a.ordinal();
            if (ordinal != 1) {
            }
        } else if (ordinal2 == 4) {
            buux buux7 = buuj.f154950c;
            if (buux7 == null) {
                buux7 = buux.f155003j;
            }
            if ((buux7.f155005a & 16) != 0) {
                buux buux8 = buuj.f154950c;
                if (buux8 == null) {
                    buux8 = buux.f155003j;
                }
                buty = buux8.f155010f;
                if (buty == null) {
                    buty = buty.f154902e;
                }
            } else {
                buty = null;
            }
            if (buty == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            ahoz.m56311a(z11, "OfflineFrame BANDWIDTH_UPGRADE_NEGOTIATION missing bandwidthUpgradeNegotiation field.");
            int b = butp.m120439b(buty.f154905b);
            if (b == 0) {
                b = 1;
            }
            int i2 = b - 1;
            if (i2 == 1) {
                if ((buty.f154904a & 2) != 0) {
                    butx = buty.f154906c;
                    if (butx == null) {
                        butx = butx.f154893h;
                    }
                } else {
                    butx = null;
                }
                ahoz.m56311a(butx == null, "OfflineFrame BANDWIDTH_UPGRADE_NEGOTIATION(UPGRADE_PATH_AVAILABLE) missing upgradePathInfo field.");
                int a3 = buts.m120442a(butx.f154896b);
                if (a3 == 0) {
                    a3 = 1;
                }
                int i3 = a3 - 1;
                if (i3 == 2) {
                    if ((butx.f154895a & 8) != 0 && (butq = butx.f154899e) == null) {
                        butq = butq.f154862d;
                    }
                    ahoz.m56311a(butq == null, "OfflineFrame BANDWIDTH_UPGRADE_NEGOTIATION(UPGRADE_PATH_AVAILABLE|BLUETOOTH) missing bluetoothCredentials field.");
                    if (((butq.f154864a & 1) ^ 1) == 0) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    ahoz.m56311a(z12, "OfflineFrame BANDWIDTH_UPGRADE_NEGOTIATION(UPGRADE_PATH_AVAILABLE|BLUETOOTH) missing serviceName.");
                    if ((butq.f154864a & 2) != 0) {
                        z30 = true;
                    }
                    ahoz.m56311a(!z30, "OfflineFrame BANDWIDTH_UPGRADE_NEGOTIATION(UPGRADE_PATH_AVAILABLE|BLUETOOTH) missing macAddress.");
                } else if (i3 == 3) {
                    if ((butx.f154895a & 2) != 0 && (butv = butx.f154897c) == null) {
                        butv = butv.f154881f;
                    }
                    ahoz.m56311a(butv == null, "OfflineFrame BANDWIDTH_UPGRADE_NEGOTIATION(UPGRADE_PATH_AVAILABLE|WIFI_HOTSPOT) missing wifiHotspotCredentials field.");
                    if (((butv.f154883a & 1) ^ 1) == 0) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    ahoz.m56311a(z13, "OfflineFrame BANDWIDTH_UPGRADE_NEGOTIATION(UPGRADE_PATH_AVAILABLE|WIFI_HOTSPOT) missing ssid field.");
                    if ((butv.f154883a & 2) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    ahoz.m56311a(!z14, "OfflineFrame BANDWIDTH_UPGRADE_NEGOTIATION(UPGRADE_PATH_AVAILABLE|WIFI_HOTSPOT) missing password field.");
                    if (butv.f154886d < 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    ahoz.m56311a(z15, "OfflineFrame BANDWIDTH_UPGRADE_NEGOTIATION(UPGRADE_PATH_AVAILABLE|WIFI_HOTSPOT) contains invalid port.");
                    if (!ahoz.f67684a.matcher(butv.f154887e).matches() && !ahoz.f67685b.matcher(butv.f154887e).matches()) {
                        z29 = true;
                    }
                    ahoz.m56311a(z29, "OfflineFrame BANDWIDTH_UPGRADE_NEGOTIATION(UPGRADE_PATH_AVAILABLE|WIFI_HOTSPOT) contains invalid gateway.");
                } else if (i3 == 5) {
                    if ((butx.f154895a & 4) != 0 && (butw = butx.f154898d) == null) {
                        butw = butw.f154888d;
                    }
                    if (butw == null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    ahoz.m56311a(z16, "OfflineFrame BANDWIDTH_UPGRADE_NEGOTIATION(UPGRADE_PATH_AVAILABLE|WIFI_LAN) missing wifiLanSocket field.");
                    if (((butw.f154890a & 1) ^ 1) == 0) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    ahoz.m56311a(z17, "OfflineFrame BANDWIDTH_UPGRADE_NEGOTIATION(UPGRADE_PATH_AVAILABLE|WIFI_LAN) missing ipAddress field.");
                    if (butw.f154892c < 0) {
                        z28 = true;
                    }
                    ahoz.m56311a(z28, "OfflineFrame BANDWIDTH_UPGRADE_NEGOTIATION(UPGRADE_PATH_AVAILABLE|WIFI_LAN) contains invalid port.");
                } else if (i3 == 6) {
                    if ((butx.f154895a & 16) != 0 && (butt = butx.f154900f) == null) {
                        butt = butt.f154868e;
                    }
                    if (butt == null) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    ahoz.m56311a(z18, "OfflineFrame BANDWIDTH_UPGRADE_NEGOTIATION(UPGRADE_PATH_AVAILABLE|WIFI_AWARE) missing wifiAwareCredentials field.");
                    if (((butt.f154870a & 1) ^ 1) == 0) {
                        z19 = false;
                    } else {
                        z19 = true;
                    }
                    ahoz.m56311a(z19, "OfflineFrame BANDWIDTH_UPGRADE_NEGOTIATION(UPGRADE_PATH_AVAILABLE|WIFI_AWARE) missing serviceId.");
                    if ((butt.f154870a & 2) != 0) {
                        z27 = true;
                    }
                    ahoz.m56311a(!z27, "OfflineFrame BANDWIDTH_UPGRADE_NEGOTIATION(UPGRADE_PATH_AVAILABLE|WIFI_AWARE) missing serviceInfo.");
                } else if (i3 == 8) {
                    if ((butx.f154895a & 32) != 0 && (butu = butx.f154901g) == null) {
                        butu = butu.f154874f;
                    }
                    if (butu == null) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    ahoz.m56311a(z20, "OfflineFrame BANDWIDTH_UPGRADE_NEGOTIATION(UPGRADE_PATH_AVAILABLE|WIFI_DIRECT) missing wifiDirectCredentials field.");
                    if ((butu.f154876a & 1) == 0 || butu.f154877b.length() >= 32 || !ahoz.f67686c.matcher(butu.f154877b).matches()) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    ahoz.m56311a(z21, "OfflineFrame BANDWIDTH_UPGRADE_NEGOTIATION(UPGRADE_PATH_AVAILABLE|WIFI_DIRECT) missing ssid or not in correct format.");
                    if ((butu.f154876a & 2) == 0 || butu.f154878c.length() >= 64 || !ahoz.f67687d.matcher(butu.f154878c).matches()) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    ahoz.m56311a(z22, "OfflineFrame BANDWIDTH_UPGRADE_NEGOTIATION(UPGRADE_PATH_AVAILABLE|WIFI_DIRECT) missing password or not in correct format.");
                    if (butu.f154880e < -1) {
                        z26 = true;
                    }
                    ahoz.m56311a(z26, "OfflineFrame BANDWIDTH_UPGRADE_NEGOTIATION(UPGRADE_PATH_AVAILABLE|WIFI_DIRECT) including invalid frequency.");
                }
            } else if (i2 == 4) {
                if ((buty.f154904a & 4) != 0 && (butn = buty.f154907d) == null) {
                    butn = butn.f154857c;
                }
                if (butn == null) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                ahoz.m56311a(z23, "OfflineFrame BANDWIDTH_UPGRADE_NEGOTIATION(CLIENT_INTRODUCTION) missing clientIntroduction field.");
                if (((butn.f154859a & 1) ^ 1) != 0) {
                    z25 = true;
                }
                ahoz.m56311a(z25, "OfflineFrame BANDWIDTH_UPGRADE_NEGOTIATION(CLIENT_INTRODUCTION) missing endpointId field.");
            }
        }
        return buuj;
    }

    /* renamed from: a */
    static buuw m56306a(buuj buuj) {
        int a = buui.m120460a(buuj.f154949b);
        if (a == 0 || a != 2 || (buuj.f154948a & 2) == 0) {
            return buuw.UNKNOWN_FRAME_TYPE;
        }
        buux buux = buuj.f154950c;
        if (buux == null) {
            buux = buux.f155003j;
        }
        buuw a2 = buuw.m120478a(buux.f155006b);
        return a2 == null ? buuw.UNKNOWN_FRAME_TYPE : a2;
    }

    /* renamed from: a */
    static bvif m56307a(int i) {
        buub buub = buub.UNKNOWN_MEDIUM;
        bvif bvif = bvif.UNKNOWN_MEDIUM;
        buuw buuw = buuw.UNKNOWN_FRAME_TYPE;
        switch (i - 1) {
            case 1:
                return bvif.MDNS;
            case 2:
                return bvif.BLUETOOTH;
            case 3:
                return bvif.WIFI_HOTSPOT;
            case 4:
                return bvif.BLE;
            case 5:
                return bvif.WIFI_LAN;
            case 6:
                return bvif.WIFI_AWARE;
            case 7:
                return bvif.NFC;
            case 8:
                return bvif.WIFI_DIRECT;
            case 9:
                return bvif.WEB_RTC;
            default:
                return bvif.UNKNOWN_MEDIUM;
        }
    }

    /* renamed from: a */
    static byte[] m56308a() {
        return m56304a(buuw.DISCONNECTION, buue.f154937a).mo73642k();
    }

    /* renamed from: a */
    static byte[] m56309a(int i, byte[] bArr) {
        bxvd da = buud.f154932d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buud buud = (buud) da.f164949b;
        buud.f154934a |= 1;
        buud.f154935b = i;
        if (bArr != null) {
            bxtx a = bxtx.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            buud buud2 = (buud) da.f164949b;
            a.getClass();
            buud2.f154934a |= 2;
            buud2.f154936c = a;
        }
        return m56304a(buuw.CONNECTION_RESPONSE, da.mo74062i()).mo73642k();
    }

    /* renamed from: a */
    public static byte[] m56310a(butx butx) {
        bxvd da = buty.f154902e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buty buty = (buty) da.f164949b;
        buty.f154905b = 1;
        int i = 1 | buty.f154904a;
        buty.f154904a = i;
        butx.getClass();
        buty.f154906c = butx;
        buty.f154904a = i | 2;
        return m56304a(buuw.BANDWIDTH_UPGRADE_NEGOTIATION, da.mo74062i()).mo73642k();
    }
}
