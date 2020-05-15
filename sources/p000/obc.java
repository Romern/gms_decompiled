package p000;

import java.io.PrintWriter;
import java.nio.ByteBuffer;

/* renamed from: obc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class obc extends obe {

    /* renamed from: a */
    public static obe f37119a;

    /* renamed from: a */
    public final void mo21936a(String str, long j, boolean z, ByteBuffer byteBuffer, PrintWriter printWriter) {
        char c;
        String str2;
        char c2;
        String str3;
        ByteBuffer byteBuffer2 = byteBuffer;
        PrintWriter printWriter2 = printWriter;
        short s = byteBuffer.getShort();
        char c3 = (char) s;
        int i = 0;
        if (c3 == 255) {
            c = 255;
        } else if (c3 != 65535) {
            switch (c3) {
                case 1:
                    c = 1;
                    break;
                case 2:
                    c = 2;
                    break;
                case 3:
                    c = 3;
                    break;
                case 4:
                    c = 4;
                    break;
                case 5:
                    c = 5;
                    break;
                case 6:
                    c = 6;
                    break;
                case 7:
                    c = 7;
                    break;
                case 8:
                    c = 8;
                    break;
                case 9:
                    c = 9;
                    break;
                default:
                    switch (c3) {
                        case 11:
                            c = 11;
                            break;
                        case 12:
                            c = 12;
                            break;
                        case 13:
                            c = 13;
                            break;
                        case 14:
                            c = 14;
                            break;
                        case 15:
                            c = 15;
                            break;
                        case 16:
                            c = 16;
                            break;
                        case 17:
                            c = 17;
                            break;
                        case 18:
                            c = 18;
                            break;
                        case 19:
                            c = 19;
                            break;
                        case 20:
                            c = 20;
                            break;
                        case 21:
                            c = 21;
                            break;
                        case 22:
                            c = 22;
                            break;
                        case 23:
                            c = 23;
                            break;
                        case 24:
                            c = 24;
                            break;
                        case 25:
                            c = 25;
                            break;
                        case 26:
                            c = 26;
                            break;
                        default:
                            c = 0;
                            break;
                    }
            }
        } else {
            c = 65535;
        }
        String name = oer.CONTROL.name();
        if (c == 0) {
            str2 = String.valueOf((int) s);
            c2 = 0;
        } else {
            if (c == 255) {
                str3 = "MESSAGE_UNEXPECTED_MESSAGE";
            } else if (c != 65535) {
                switch (c) {
                    case 1:
                        str3 = "MESSAGE_VERSION_REQUEST";
                        break;
                    case 2:
                        str3 = "MESSAGE_VERSION_RESPONSE";
                        break;
                    case 3:
                        str3 = "MESSAGE_ENCAPSULATED_SSL";
                        break;
                    case 4:
                        str3 = "MESSAGE_AUTH_COMPLETE";
                        break;
                    case 5:
                        str3 = "MESSAGE_SERVICE_DISCOVERY_REQUEST";
                        break;
                    case 6:
                        str3 = "MESSAGE_SERVICE_DISCOVERY_RESPONSE";
                        break;
                    case 7:
                        str3 = "MESSAGE_CHANNEL_OPEN_REQUEST";
                        break;
                    case 8:
                        str3 = "MESSAGE_CHANNEL_OPEN_RESPONSE";
                        break;
                    case 9:
                        str3 = "MESSAGE_CHANNEL_CLOSE_NOTIFICATION";
                        break;
                    default:
                        switch (c) {
                            case 11:
                                str3 = "MESSAGE_PING_REQUEST";
                                break;
                            case 12:
                                str3 = "MESSAGE_PING_RESPONSE";
                                break;
                            case 13:
                                str3 = "MESSAGE_NAV_FOCUS_REQUEST";
                                break;
                            case 14:
                                str3 = "MESSAGE_NAV_FOCUS_NOTIFICATION";
                                break;
                            case 15:
                                str3 = "MESSAGE_BYEBYE_REQUEST";
                                break;
                            case 16:
                                str3 = "MESSAGE_BYEBYE_RESPONSE";
                                break;
                            case 17:
                                str3 = "MESSAGE_VOICE_SESSION_NOTIFICATION";
                                break;
                            case 18:
                                str3 = "MESSAGE_AUDIO_FOCUS_REQUEST";
                                break;
                            case 19:
                                str3 = "MESSAGE_AUDIO_FOCUS_NOTIFICATION";
                                break;
                            case 20:
                                str3 = "MESSAGE_CAR_CONNECTED_DEVICES_REQUEST";
                                break;
                            case 21:
                                str3 = "MESSAGE_CAR_CONNECTED_DEVICES_RESPONSE";
                                break;
                            case 22:
                                str3 = "MESSAGE_USER_SWITCH_REQUEST";
                                break;
                            case 23:
                                str3 = "MESSAGE_BATTERY_STATUS_NOTIFICATION";
                                break;
                            case 24:
                                str3 = "MESSAGE_CALL_AVAILABILITY_STATUS";
                                break;
                            case 25:
                                str3 = "MESSAGE_USER_SWITCH_RESPONSE";
                                break;
                            case 26:
                                str3 = "MESSAGE_SERVICE_DISCOVERY_UPDATE";
                                break;
                            default:
                                str3 = "null";
                                break;
                        }
                }
            } else {
                str3 = "MESSAGE_FRAMING_ERROR";
            }
            c2 = c;
            str2 = str3;
        }
        m28338a(str, j, name, z, str2, byteBuffer, printWriter);
        if (c2 == 0) {
            printWriter.println();
            printWriter2.printf("Received unexpected message of type %d\n", Short.valueOf(s));
            return;
        }
        printWriter2.print(":{");
        if (s == 18) {
            Object[] objArr = new Object[1];
            bios a = bios.m102673a(((bioq) bxvk.m124013a(bioq.f121089c, byteBuffer2, bxus.m123744c())).f121092b);
            if (a == null) {
                a = bios.AUDIO_FOCUS_GAIN;
            }
            objArr[0] = a;
            printWriter2.printf("%s", objArr);
        } else if (s == 19) {
            biop biop = (biop) bxvk.m124013a(biop.f121083c, byteBuffer2, bxus.m123744c());
            Object[] objArr2 = new Object[2];
            objArr2[0] = Boolean.valueOf(biop.f121086b);
            biou a2 = biou.m102677a(biop.f121085a);
            if (a2 == null) {
                a2 = biou.AUDIO_FOCUS_STATE_INVALID;
            }
            objArr2[1] = a2;
            printWriter2.printf("%b:%s", objArr2);
        } else if (s != 26) {
            switch (s) {
                case 1:
                    if (byteBuffer.remaining() < 4) {
                        printWriter2.print("Payload size not that big");
                        break;
                    } else {
                        printWriter2.printf("%d:%d", Short.valueOf(byteBuffer.getShort()), Short.valueOf(byteBuffer.getShort()));
                        break;
                    }
                case 2:
                    if (byteBuffer.remaining() < 6) {
                        printWriter2.print("Payload size not that big");
                        break;
                    } else {
                        printWriter2.printf("%d:%d:%d", Short.valueOf(byteBuffer.getShort()), Short.valueOf(byteBuffer.getShort()), Short.valueOf(byteBuffer.getShort()));
                        break;
                    }
                case 3:
                    break;
                case 4:
                    printWriter2.print(((biox) bxvk.m124013a(biox.f121113b, byteBuffer2, bxus.m123744c())).f121115a);
                    break;
                case 5:
                    bivc bivc = (bivc) bxvk.m124013a(bivc.f121939g, byteBuffer2, bxus.m123744c());
                    int i2 = bivc.f121941a;
                    if ((i2 & 16) != 0) {
                        if ((i2 & 8) != 0) {
                            printWriter2.printf("%s:%s", bivc.f121946f, bivc.f121945e);
                            break;
                        }
                    }
                    printWriter2.print("missing fields");
                    break;
                case 6:
                    printWriter2.print(((bivd) bxvk.m124013a(bivd.f121947o, byteBuffer2, bxus.m123744c())).toString());
                    break;
                default:
                    switch (s) {
                        case 11:
                            bitp bitp = (bitp) bxvk.m124013a(bitp.f121689e, byteBuffer2, bxus.m123744c());
                            Object[] objArr3 = new Object[2];
                            objArr3[0] = Long.valueOf(bitp.f121692b);
                            if ((bitp.f121691a & 4) != 0) {
                                i = bitp.f121694d.mo73744a();
                            }
                            objArr3[1] = Integer.valueOf(i);
                            printWriter2.printf("%d, Data(%d)", objArr3);
                            break;
                        case 12:
                            bitq bitq = (bitq) bxvk.m124013a(bitq.f121696d, byteBuffer2, bxus.m123744c());
                            Object[] objArr4 = new Object[2];
                            objArr4[0] = Long.valueOf(bitq.f121699b);
                            if ((bitq.f121698a & 2) != 0) {
                                i = bitq.f121700c.mo73744a();
                            }
                            objArr4[1] = Integer.valueOf(i);
                            printWriter2.printf("%d, Data(%d)", objArr4);
                            break;
                        case 13:
                            bisn a3 = bisn.m102792a(((bisl) bxvk.m124013a(bisl.f121580c, byteBuffer2, bxus.m123744c())).f121583b);
                            if (a3 == null) {
                                a3 = bisn.NAV_FOCUS_NATIVE;
                            }
                            printWriter2.print(a3);
                            break;
                        case 14:
                            bisn a4 = bisn.m102792a(((bisk) bxvk.m124013a(bisk.f121575b, byteBuffer2, bxus.m123744c())).f121577a);
                            if (a4 == null) {
                                a4 = bisn.NAV_FOCUS_NATIVE;
                            }
                            printWriter2.print(a4);
                            break;
                        case 15:
                            bipi a5 = bipi.m102695a(((bipj) bxvk.m124013a(bipj.f121170c, byteBuffer2, bxus.m123744c())).f121173b);
                            if (a5 == null) {
                                a5 = bipi.USER_SELECTION;
                            }
                            printWriter2.print(a5);
                            break;
                        case 16:
                            printWriter2.print((bipk) bxvk.m124013a(bipk.f121175a, byteBuffer2, bxus.m123744c()));
                            break;
                        default:
                            try {
                                printWriter2.printf("Received unexpected message of type %d", Short.valueOf(s));
                                break;
                            } catch (bxwf e) {
                                break;
                            }
                    }
            }
        } else {
            bive bive = (bive) bxvk.m124013a(bive.f121965c, byteBuffer2, bxus.m123744c());
            if ((bive.f121967a & 1) != 0) {
                bivb bivb = bive.f121968b;
                if (bivb == null) {
                    bivb = bivb.f121921l;
                }
                printWriter2.print(bivb.toString());
            }
        }
        printWriter2.println("}");
    }
}
