package p000;

import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseBooleanArray;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.KeyInformation;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.regex.Pattern;

/* renamed from: bjtg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjtg {

    /* renamed from: a */
    private static final Pattern f123271a = Pattern.compile("^[\\-,\\s]+|[\\-,\\s]+$");

    /* renamed from: a */
    public static String m104555a(btwp btwp, char c) {
        return m104556a(btwp, c, null);
    }

    /* renamed from: a */
    static String m104556a(btwp btwp, char c, String str) {
        if (btwp == null) {
            return null;
        }
        if (str == null) {
            str = "\n";
        }
        if (c != 'F') {
            if (c != 'X') {
                if (c != 'Z') {
                    switch (c) {
                        case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                            if (btwp.f152745p.size() > 0) {
                                return (String) btwp.f152745p.get(0);
                            }
                            return null;
                        case '2':
                            if (btwp.f152745p.size() >= 2) {
                                return (String) btwp.f152745p.get(1);
                            }
                            return null;
                        case '3':
                            if (btwp.f152745p.size() >= 3) {
                                return (String) btwp.f152745p.get(2);
                            }
                            return null;
                        default:
                            switch (c) {
                                case KeyInformation.AES128_DES56:
                                    if (btwp.f152745p.size() > 0) {
                                        return TextUtils.join(str, btwp.f152745p);
                                    }
                                    return null;
                                case 'B':
                                    if (!TextUtils.isEmpty(btwp.f152739j)) {
                                        return btwp.f152739j;
                                    }
                                    return null;
                                case KeyInformation.AES128_DES112:
                                    if (!btwp.f152736g.isEmpty()) {
                                        return btwp.f152736g;
                                    }
                                    return null;
                                case 'D':
                                    if (!btwp.f152737h.isEmpty()) {
                                        return btwp.f152737h;
                                    }
                                    return null;
                                default:
                                    switch (c) {
                                        case 'N':
                                            if (!btwp.f152747r.isEmpty()) {
                                                return btwp.f152747r;
                                            }
                                            return null;
                                        case KeyInformation.AES128:
                                            if (!btwp.f152746q.isEmpty()) {
                                                return btwp.f152746q;
                                            }
                                            return null;
                                        case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE /*80*/:
                                            if (!TextUtils.isEmpty(btwp.f152743n)) {
                                                return btwp.f152743n;
                                            }
                                            return null;
                                        default:
                                            switch (c) {
                                                case 'R':
                                                    if (!btwp.f152732c.isEmpty()) {
                                                        return btwp.f152732c;
                                                    }
                                                    int b = bjtv.m104616b(btwp.f152731b);
                                                    if (b == 0 || b == 858) {
                                                        return null;
                                                    }
                                                    return bjtl.m104573b(b);
                                                case 'S':
                                                    if (!btwp.f152734e.isEmpty()) {
                                                        return btwp.f152734e;
                                                    }
                                                    return null;
                                                case 'T':
                                                    if (!btwp.f152738i.isEmpty()) {
                                                        return btwp.f152738i;
                                                    }
                                                    return null;
                                                case 'U':
                                                    if (!btwp.f152735f.isEmpty()) {
                                                        return btwp.f152735f;
                                                    }
                                                    return null;
                                                default:
                                                    return null;
                                            }
                                    }
                            }
                    }
                } else if (!btwp.f152740k.isEmpty()) {
                    return btwp.f152740k;
                } else {
                    return null;
                }
            } else if (!TextUtils.isEmpty(btwp.f152741l)) {
                return btwp.f152741l;
            } else {
                return null;
            }
        } else if (!TextUtils.isEmpty(btwp.f152744o)) {
            return btwp.f152744o;
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public static String m104557a(btwp btwp, String str, char[] cArr, String str2) {
        return String.format("%s%s%s", m104558a(btwp, str, (char[]) null, cArr), str, PhoneNumberUtils.formatNumber(str2)).trim();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static String m104558a(btwp btwp, String str, char[] cArr, char[] cArr2) {
        SparseBooleanArray sparseBooleanArray;
        boolean z;
        btwp btwp2 = btwp;
        char[] cArr3 = cArr2;
        String str2 = str == null ? "\n" : str;
        char[] a = (cArr == null && cArr3.length > 0) ? bjtf.m104554a() : cArr;
        int b = bjtv.m104616b(btwp2.f152731b);
        if (b == 0) {
            b = 858;
        }
        String str3 = btwp2.f152733d;
        boolean a2 = bjtl.m104570a(b, str3);
        String str4 = "%N%n%O%n%A%n%C, %S %Z";
        switch (b) {
            case 36:
            case KeyInformation.AES128_DES56:
            case 71:
            case 114:
            case 121:
            case 122:
            case 133:
            case 139:
            case 143:
            case MfiClientException.TYPE_MFICLIENT_NOT_STARTED:
            case 165:
            case 168:
            case 180:
            case 229:
            case 236:
            case 242:
            case 247:
            case 307:
            case 375:
            case 385:
            case 417:
            case 421:
            case 423:
            case 427:
            case 453:
            case 463:
            case 524:
            case 532:
            case 537:
            case 591:
            case 595:
            case 618:
            case 619:
            case 621:
            case 622:
            case 650:
            case 653:
            case 654:
            case 666:
            case 705:
            case 779:
            case 845:
                str4 = "%N%n%O%n%A%n%Z %C";
                break;
            case FelicaException.TYPE_NOT_CLOSED:
            case 466:
                str4 = "%N%n%O%n%A%n%S";
                break;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                str4 = "%N%n%O%n%A%n%Z%n%C%n%S";
                break;
            case 50:
            case 118:
            case 698:
                str4 = "%N%n%O%n%A%n%Z %C%n%S";
                break;
            case 51:
            case 97:
            case 205:
            case 245:
            case 424:
            case 432:
            case 535:
            case 685:
            case 713:
                str4 = "%N%n%O%n%A%n%C %S %Z";
                break;
            case 52:
            case 69:
            case 460:
                str4 = "%O%n%N%n%A%n%Z %C";
                break;
            case 53:
            case 99:
            case 120:
            case 269:
            case 454:
                str4 = "%O%n%N%n%A%n%C %S %Z";
                break;
            case FelicaException.TYPE_ACTIVATE_FAILED:
                str4 = "%O%n%N%n%A%nAX-%Z %C%nÅLAND";
                break;
            case FelicaException.TYPE_OFFLINE_CANCELED:
                str4 = "%N%n%O%n%A%nAZ %Z %C";
                break;
            case 68:
                str4 = "%N%n%O%n%A%n%C - %Z";
                break;
            case 70:
            case 100:
            case 439:
            case 628:
                str4 = "%N%n%O%n%A%n%C %X";
                break;
            case 72:
            case 77:
            case 78:
            case 300:
            case 335:
            case 360:
            case 386:
            case 403:
            case 436:
            case 438:
            case 464:
            case 609:
                str4 = "%N%n%O%n%A%n%C %Z";
                break;
            case 76:
            case BaseMfiEventCallback.TYPE_INVALID_LINKAGE_DATA:
            case 230:
            case 240:
            case 422:
            case 433:
            case 451:
            case 525:
            case 581:
            case 742:
            case 820:
                str4 = "%O%n%N%n%A%n%Z %C %X";
                break;
            case 82:
                str4 = "%O%n%N%n%A%n%D%n%C-%S%n%Z";
                break;
            case 83:
            case 366:
                str4 = "%N%n%O%n%A%n%C, %S";
                break;
            case 89:
                str4 = "%S%n%Z %C %X%n%A%n%O%n%N";
                break;
            case ErrorInfo.TYPE_SDU_FAILED:
                str4 = "%O%n%N%n%A%nCH-%Z %C";
                break;
            case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                str4 = "%N%n%O%n%X %A %C %X";
                break;
            case 108:
                str4 = "%N%n%O%n%A%n%Z %C%n%D%n%S";
                break;
            case 110:
                if (a2) {
                    str4 = "%N%n%O%n%A%n%D%n%C%n%S, %Z";
                    break;
                } else {
                    str4 = "%Z%n%S%C%D%n%A%n%O%n%N";
                    break;
                }
            case 111:
                str4 = "%N%n%O%n%A%n%C, %S, %Z";
                break;
            case 163:
            case 437:
            case 493:
                str4 = "%N%n%O%n%A%n%Z%n%C";
                break;
            case 167:
            case 226:
            case 597:
            case 673:
                str4 = "%N%n%O%n%A%n%C%n%S%n%Z";
                break;
            case 179:
            case 308:
            case 518:
            case 697:
                str4 = "%N%n%O%n%A%n%Z %C %S";
                break;
            case ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR:
                str4 = "%O%n%N%n%A%nFI-%Z %C";
                break;
            case 203:
            case 243:
            case ErrorInfo.TYPE_FSC_HTTP_ERROR:
            case 303:
            case 526:
            case 616:
            case 643:
                str4 = "%N%n%O%n%A%n%X%n%C%n%Z";
                break;
            case BaseMfiEventCallback.TYPE_EXPIRED_MFI:
                str4 = "%N%n%O%n%A%nFO%Z %C";
                break;
            case 231:
                str4 = "%N%n%O%n%A%n%X%n%C%nGUERNSEY%n%Z";
                break;
            case 233:
                str4 = "%N%n%O%n%A%nGIBRALTAR%n%Z";
                break;
            case 238:
                str4 = "%N%n%O%n%Z %A %C";
                break;
            case 244:
                str4 = "%N%n%O%n%A%n%Z- %C";
                break;
            case 267:
                if (!a2) {
                    str4 = "%S%n%C%n%A%n%O%n%N";
                    break;
                }
                str4 = "%N%n%O%n%A%n%C%n%S";
                break;
            case 270:
                str4 = "%N%n%O%n%A%n%C, %S%n%Z";
                break;
            case 274:
                str4 = "%N%n%O%n%A%nHR-%Z %C";
                break;
            case 276:
                str4 = "%N%n%O%n%A%nHT%Z %C %X";
                break;
            case 277:
                str4 = "%N%n%O%n%C%n%A%n%Z";
                break;
            case 292:
            case 718:
                str4 = "%N%n%O%n%A%n%C%n%S %Z";
                break;
            case 293:
            case 513:
            case 611:
                str4 = "%N%n%O%n%A%n%C%n%S";
                break;
            case 302:
            case 455:
                str4 = "%N%n%O%n%A%n%C %Z%n%S";
                break;
            case 305:
                str4 = "%O%n%N%n%A%n%C, %S%n%Z";
                break;
            case 306:
                str4 = "%O%n%N%n%S%n%C, %D%n%A%n%Z";
                break;
            case 325:
                str4 = "%N%n%O%n%A%n%X%n%C%nJERSEY%n%Z";
                break;
            case 333:
                str4 = "%N%n%O%n%A%n%C%n%S %X";
                break;
            case 336:
                if (!a2) {
                    str4 = "〒%Z%n%S%C%n%A%n%O%n%N";
                    break;
                }
                str4 = "%N%n%O%n%A%n%C, %S%n%Z";
                break;
            case 357:
            case 395:
            case 634:
            case 711:
                str4 = "%N%n%O%n%A%n%C%n%Z";
                break;
            case 359:
                str4 = "%Z %C %X%n%A%n%O%n%N";
                break;
            case 361:
                str4 = "%N%n%O%n%A%n%S%n%C";
                break;
            case 370:
                if (a2) {
                    str4 = "%N%n%O%n%A%n%D%n%C%n%S%n%Z";
                    break;
                } else {
                    str4 = "%S %C%D%n%A%n%O%n%N%n%Z";
                    break;
                }
            case 377:
                str4 = "%N%n%O%n%A%n%S %Z";
                break;
            case 378:
                str4 = "%Z%n%S%n%C%n%A%n%O%n%N";
                break;
            case 393:
                str4 = "%O%n%N%n%A%nFL-%Z %C";
                break;
            case ErrorInfo.TYPE_FELICA_EXCEPTION_TIMEOUT_OCCURRED:
                str4 = "%N%n%O%n%A%n%Z %C %X";
                break;
            case 404:
                str4 = "%O%n%N%n%A%nLT-%Z %C";
                break;
            case 405:
                str4 = "%O%n%N%n%A%nL-%Z %C";
                break;
            case 406:
            case 429:
                str4 = "%N%n%O%n%A%n%C, %Z";
                break;
            case 419:
                str4 = "%N%n%O%n%A%nMC-%Z %C %X";
                break;
            case 420:
                str4 = "%N%n%O%n%A%nMD-%Z %C";
                break;
            case 430:
                str4 = "%N%n%O%n%A%n%S %C-%X%n%Z";
                break;
            case 431:
                if (a2) {
                    str4 = "%N%n%O%n%A";
                    break;
                } else {
                    str4 = "%A%n%O%n%N";
                    break;
                }
            case 440:
                str4 = "%N%n%O%n%A%n%D%n%Z %C, %S";
                break;
            case 441:
                str4 = "%N%n%O%n%A%n%D%n%Z %C%n%S";
                break;
            case 457:
                str4 = "%N%n%O%n%A%n%Z%n%C, %S";
                break;
            case 474:
                str4 = "%N%n%O%n%A%n%D%n%C %Z";
                break;
            case 519:
                str4 = "%N%n%O%n%A%n%C %Z %S";
                break;
            case 520:
                str4 = "%N%n%O%n%A%n%D, %C%n%Z %S";
                break;
            case 523:
                str4 = "%N%n%O%n%A%n%C-%Z";
                break;
            case 530:
                str4 = "%N%n%O%n%A%n%C PR %Z";
                break;
            case 613:
                str4 = "%O%n%N%n%A%nSE-%Z %C";
                break;
            case 615:
                str4 = "%N%n%O%n%A%nSINGAPORE %Z";
                break;
            case 617:
                str4 = "%N%n%O%n%A%nSI- %Z %C";
                break;
            case 623:
            case 691:
                break;
            case 626:
                str4 = "%N%n%O%n%A%n%C %X%n%S";
                break;
            case 630:
                str4 = "%N%n%O%n%A%n%Z-%C%n%S";
                break;
            case 648:
                if (a2) {
                    str4 = "%N%n%O%n%A%n%D, %C%n%S %Z";
                    break;
                } else {
                    str4 = "%N%n%O%n%A%n%D %C%n%S %Z";
                    break;
                }
            case 658:
                str4 = "%N%n%O%n%A%n%Z %C/%S";
                break;
            case 662:
                str4 = "%N%n%O%n%A%n%X%n%C%n%S";
                break;
            case 663:
                if (!a2) {
                    str4 = "%Z%n%S%C%n%A%n%O%n%N";
                    break;
                }
                break;
            case 709:
                str4 = "%N%n%O%n%A%n%C %Z, %S";
                break;
            case 833:
                str4 = "%N%n%O%n%A%n%D%n%C%n%Z";
                break;
            default:
                str4 = "%N%n%O%n%A%n%C";
                break;
        }
        StringBuilder sb = new StringBuilder(str4.length() + 4);
        if (a2 || (!bjtl.m104571a("ja", str3) && !bjtl.m104571a("ko", str3) && !bjtl.m104571a("zh", str3))) {
            sb.append(str4);
            sb.append("%n%R");
        } else {
            sb.append("%R%n");
            sb.append(str4);
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        int length = str2.length();
        if (a != null) {
            sparseBooleanArray = new SparseBooleanArray(bjtf.f123269a.length + 1);
            for (char c : a) {
                if (bjtf.m104553a(c)) {
                    sparseBooleanArray.put(c, true);
                }
            }
            for (char c2 : cArr3) {
                if (bjtf.m104553a(c2)) {
                    sparseBooleanArray.put(c2, false);
                }
            }
        } else {
            sparseBooleanArray = null;
        }
        char[] charArray = sb2.replaceAll("%A", "%1%n%2%n%3").toCharArray();
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        for (char c3 : charArray) {
            if (z2) {
                if (c3 == 'n') {
                    if (sb4.length() > 0) {
                        sb4.append((CharSequence) sb5);
                        sb3.append(f123271a.matcher(sb4).replaceAll(""));
                        sb4.setLength(0);
                        z = true;
                    } else if (sb5.length() <= 0) {
                        z = false;
                    } else {
                        if (!z3) {
                            String replaceAll = f123271a.matcher(sb5).replaceAll("");
                            if (replaceAll.length() > 0) {
                                sb3.append(replaceAll);
                                z = true;
                                z4 = true;
                            }
                        }
                        z = false;
                    }
                    if (z && length > 0) {
                        sb3.append(str2);
                        z5 = true;
                    }
                    z3 = false;
                } else if (!bjtf.m104553a(c3)) {
                    StringBuilder sb6 = new StringBuilder(31);
                    sb6.append("Could not format AddressField.");
                    sb6.append(c3);
                    Log.w("AddressFormatter", sb6.toString());
                    z3 = true;
                } else if (sparseBooleanArray != null && !sparseBooleanArray.get(c3)) {
                    z3 = true;
                } else {
                    String a3 = m104556a(btwp2, c3, str2);
                    if (a3 != null) {
                        a3 = a3.trim();
                    }
                    if (!TextUtils.isEmpty(a3)) {
                        sb4.append(sb5.toString());
                        sb4.append(a3);
                        if (c3 == 'N') {
                            z6 = true;
                        } else {
                            z7 = true;
                        }
                    } else {
                        z3 = true;
                    }
                }
                sb5.setLength(0);
                z2 = false;
            } else if (c3 != '%') {
                sb5.append(c3);
            } else {
                z2 = true;
            }
        }
        if (sb4.length() > 0 || !z3) {
            if (sb4.length() == 0 && sb5.length() > 0) {
                z4 = true;
            }
            sb4.append((CharSequence) sb5);
            sb3.append(f123271a.matcher(sb4).replaceAll(""));
        } else if (z5) {
            sb3.delete(sb3.length() - length, sb3.length());
        }
        if ((sparseBooleanArray == null || sparseBooleanArray.get(82)) && (sb3.length() == 0 || (z6 && !z7 && !z4))) {
            String a4 = m104556a(btwp2, 'R', str2);
            if (!TextUtils.isEmpty(a4)) {
                if (sb3.length() > 0 && length > 0) {
                    sb3.append(str2);
                }
                sb3.append(a4);
            }
        }
        return sb3.toString();
    }
}
