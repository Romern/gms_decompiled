package p000;

import android.content.Context;
import android.content.Intent;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.TokenReference;
import com.google.android.gms.tapandpay.firstparty.TokenStatus;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.TimeZone;

/* renamed from: asuo */
final /* synthetic */ class asuo implements Runnable {

    /* renamed from: a */
    private final Context f89761a;

    /* renamed from: b */
    private final asqw f89762b;

    public asuo(Context context, asqw asqw) {
        this.f89761a = context;
        this.f89762b = asqw;
    }

    public final void run() {
        String str;
        int i;
        Intent startIntent;
        TokenReference tokenReference;
        btof btof;
        int i2;
        Context context = this.f89761a;
        asqw asqw = this.f89762b;
        try {
            if (asqw.mo49396a()) {
                bnsl a = asup.f89763a.mo26019b(aske.m74275a());
                a.mo68432a("asup", "a", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                String str2 = asqw.f89437a;
                switch (asqw.f89454r) {
                    case -1:
                        str = "NO_FAILURE";
                        break;
                    case 0:
                    case 2:
                    case 3:
                    case 6:
                    case 8:
                    case 20:
                    case 35:
                    case 36:
                    default:
                        str = "UNKNOWN";
                        break;
                    case 1:
                        str = "NO_CREDENTIAL";
                        break;
                    case 4:
                        str = "DEVICE_LOCKED";
                        break;
                    case 5:
                        str = "DEVICE_SETUP_REQUIRED";
                        break;
                    case 7:
                        str = "NO_STORAGE_KEY";
                        break;
                    case 9:
                        str = "ATTESTATION_FAILURE";
                        break;
                    case 10:
                        str = "SCREEN_OFF";
                        break;
                    case 11:
                        str = "TEAR";
                        break;
                    case 12:
                        str = "PAYMENT_NOT_STARTED";
                        break;
                    case 13:
                        str = "PROTOCOL_FAILURE";
                        break;
                    case 14:
                        str = "CARD_NOT_SUPPORTED";
                        break;
                    case 15:
                        str = "INTERNAL";
                        break;
                    case 16:
                        str = "PAYMENTS_DISABLED";
                        break;
                    case 17:
                        str = "THROTTLED";
                        break;
                    case 18:
                        str = "PAY_ON_WEAR_DISABLED";
                        break;
                    case 19:
                        str = "CDCVM_REQUIRED_SDK";
                        break;
                    case 21:
                        str = "VELOCITY_CHECK";
                        break;
                    case 22:
                        str = "NO_WALLET";
                        break;
                    case 23:
                        str = "NO_CARD";
                        break;
                    case 24:
                        str = "READER_ERROR_WRONG_AID";
                        break;
                    case 25:
                        str = "READER_ERROR_WRONG_LENGTH";
                        break;
                    case 26:
                        str = "READER_ERROR_IN_SDK";
                        break;
                    case 27:
                        str = "CARD_NOT_SUPPORTED_AID_NOT_SUPPORTED";
                        break;
                    case 28:
                        str = "CARD_NOT_SUPPORTED_MSD_ON_EMV";
                        break;
                    case 29:
                        str = "CARD_NOT_SUPPORTED_SDK";
                        break;
                    case 30:
                        str = "PPSE_ONLY";
                        break;
                    case 31:
                        str = "TRANSIT_INSUFFICIENT_BALANCE";
                        break;
                    case 32:
                        str = "TRANSIT_INVALID_TICKET";
                        break;
                    case 33:
                        str = "TRANSIT_EXPIRED_TICKET";
                        break;
                    case 34:
                        str = "TRANSIT_SUSPENDED_TICKET";
                        break;
                    case FelicaException.TYPE_NOT_CLOSED:
                        str = "PAYMENT_CARDS_BLOCKED";
                        break;
                    case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                        str = "BUNDLE_ON_DIFFERENT_ACCOUNT";
                        break;
                    case FelicaException.TYPE_USED_BY_OTHER_APP:
                        str = "PAYMENT_NOT_STARTED_MULTIPLE_CARDS";
                        break;
                    case FelicaException.TYPE_PUSH_FAILED:
                        str = "ACCESS_SUSPENDED_CARD";
                        break;
                }
                a.mo68424a("Tap %s finished with failure: %s", str2, str);
                atam b = asup.m74862b(context, asqw);
                ArrayList arrayList = new ArrayList(asqw.mo49399d());
                for (asqt asqt : asqw.f89438b) {
                    arrayList.add(asup.m74856a(asqw.f89437a, asqt));
                }
                bxvd da = bozw.f135422N.mo74144da();
                String str3 = asqw.f89437a;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bozw bozw = (bozw) da.f164949b;
                str3.getClass();
                bozw.f135437a |= 1;
                bozw.f135439c = str3;
                long b2 = asqw.mo49397b();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bozw bozw2 = (bozw) da.f164949b;
                int i3 = bozw2.f135437a | 2;
                bozw2.f135437a = i3;
                bozw2.f135440d = b2;
                long j = asqw.f89452p;
                int i4 = i3 | 4;
                bozw2.f135437a = i4;
                bozw2.f135441e = j;
                long j2 = asqw.f89453q;
                bozw2.f135437a = i4 | 8;
                bozw2.f135442f = j2;
                int i5 = asqw.f89454r;
                if (i5 == -1) {
                    i = 6;
                } else if (i5 == 1) {
                    i = 2;
                } else if (i5 == 7) {
                    i = 10;
                } else if (i5 == 37) {
                    i = 32;
                } else if (i5 == 4) {
                    i = 8;
                } else if (i5 != 5) {
                    switch (i5) {
                        case 9:
                            i = 17;
                            break;
                        case 10:
                            i = 11;
                            break;
                        case 11:
                            i = 12;
                            break;
                        case 12:
                            i = 13;
                            break;
                        case 13:
                            i = 4;
                            break;
                        case 14:
                            i = 14;
                            break;
                        case 15:
                            i = 15;
                            break;
                        case 16:
                            i = 16;
                            break;
                        case 17:
                            i = 20;
                            break;
                        case 18:
                            i = 19;
                            break;
                        case 19:
                            i = 21;
                            break;
                        default:
                            switch (i5) {
                                case 21:
                                    i = 22;
                                    break;
                                case 22:
                                    i = 23;
                                    break;
                                case 23:
                                    i = 24;
                                    break;
                                case 24:
                                    i = 25;
                                    break;
                                case 25:
                                    i = 26;
                                    break;
                                case 26:
                                    i = 27;
                                    break;
                                case 27:
                                    i = 28;
                                    break;
                                case 28:
                                    i = 29;
                                    break;
                                case 29:
                                    i = 30;
                                    break;
                                case 30:
                                    i = 31;
                                    break;
                                default:
                                    i = 5;
                                    break;
                            }
                    }
                } else {
                    i = 9;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bozw bozw3 = (bozw) da.f164949b;
                bozw3.f135443g = i - 1;
                int i6 = bozw3.f135437a | 32;
                bozw3.f135437a = i6;
                int i7 = asqw.f89433J;
                int i8 = i7 - 1;
                if (i7 != 0) {
                    bozw3.f135444h = i8;
                    bozw3.f135437a = i6 | 64;
                    boolean a2 = ssk.m36235a(context);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bozw bozw4 = (bozw) da.f164949b;
                    int i9 = bozw4.f135437a | AndroidInputTypeSignal.TYPE_TEXT_FLAG_MULTI_LINE;
                    bozw4.f135437a = i9;
                    bozw4.f135454r = a2;
                    String str4 = "card_info_extra";
                    long j3 = asqw.f89450n;
                    int i10 = i9 | 1048576;
                    bozw4.f135437a = i10;
                    bozw4.f135456t = j3;
                    boolean z = asqw.f89442f;
                    int i11 = 4194304 | i10;
                    bozw4.f135437a = i11;
                    bozw4.f135458v = z;
                    boolean z2 = asqw.f89443g;
                    int i12 = i11 | 8388608;
                    bozw4.f135437a = i12;
                    bozw4.f135459w = z2;
                    int i13 = (int) asqw.f89445i;
                    int i14 = bozw4.f135438b | 2;
                    bozw4.f135438b = i14;
                    bozw4.f135427D = i13;
                    int i15 = asqw.f89447k;
                    int i16 = i14 | 8;
                    bozw4.f135438b = i16;
                    bozw4.f135429F = i15;
                    int i17 = asqw.f89446j;
                    int i18 = i16 | 4;
                    bozw4.f135438b = i18;
                    bozw4.f135428E = i17;
                    boolean z3 = asqw.f89444h;
                    bozw4.f135438b = i18 | 1;
                    bozw4.f135426C = z3;
                    int i19 = asqw.f89432I;
                    int i20 = i19 - 1;
                    if (i19 != 0) {
                        bozw4.f135461y = i20;
                        int i21 = 268435456 | i12;
                        bozw4.f135437a = i21;
                        long j4 = asqw.f89448l;
                        bozw4.f135437a = i21 | 536870912;
                        bozw4.f135462z = j4;
                        int a3 = bepw.m95430a(btre.class, asup.m74857a(asqw.f89459w));
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bozw bozw5 = (bozw) da.f164949b;
                        int i22 = bozw5.f135438b | 64;
                        bozw5.f135438b = i22;
                        bozw5.f135432I = a3;
                        int i23 = asqw.f89460x;
                        int i24 = i22 | 128;
                        bozw5.f135438b = i24;
                        bozw5.f135433J = i23;
                        boolean z4 = asqw.f89461y;
                        int i25 = i24 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        bozw5.f135438b = i25;
                        bozw5.f135434K = z4;
                        boolean z5 = asqw.f89462z;
                        int i26 = i25 | 512;
                        bozw5.f135438b = i26;
                        bozw5.f135435L = z5;
                        boolean z6 = asqw.f89424A;
                        bozw5.f135438b = i26 | 1024;
                        bozw5.f135436M = z6;
                        atkm atkm = new atkm(context);
                        long f = atkm.mo50020f();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bozw bozw6 = (bozw) da.f164949b;
                        bozw6.f135437a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_IME_MULTI_LINE;
                        bozw6.f135455s = f;
                        int d = atkm.mo50018d();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bozw bozw7 = (bozw) da.f164949b;
                        bozw7.f135437a |= 67108864;
                        bozw7.f135460x = d;
                        asqu asqu = asqw.f89456t;
                        if (asqu != null) {
                            String a4 = stm.m36299a(asqu.f89405a);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bozw bozw8 = (bozw) da.f164949b;
                            a4.getClass();
                            int i27 = bozw8.f135437a | 128;
                            bozw8.f135437a = i27;
                            bozw8.f135445i = a4;
                            boolean z7 = asqu.f89411g;
                            int i28 = i27 | 2097152;
                            bozw8.f135437a = i28;
                            bozw8.f135457u = z7;
                            boolean z8 = asqu.f89413i;
                            int i29 = i28 | Integer.MIN_VALUE;
                            bozw8.f135437a = i29;
                            bozw8.f135425B = z8;
                            if (!asqu.f89409e) {
                                i2 = 3;
                            } else {
                                i2 = 2;
                            }
                            bozw8.f135424A = i2 - 1;
                            bozw8.f135437a = 1073741824 | i29;
                            int i30 = asqu.f89415k;
                            int i31 = bozw8.f135438b | 16;
                            bozw8.f135438b = i31;
                            bozw8.f135430G = i30;
                            bozw8.f135431H = asqu.f89416l.f135420k;
                            bozw8.f135438b = 32 | i31;
                        }
                        bozw bozw9 = (bozw) da.mo74062i();
                        bxvd da2 = btqp.f149992o.mo74144da();
                        btql btql = btql.f149970i;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        btqp btqp = (btqp) da2.f164949b;
                        btql.getClass();
                        btqp.f150000g = btql;
                        String str5 = asqw.f89437a;
                        str5.getClass();
                        btqp.f149994a = str5;
                        if (!btqp.f149998e.mo73666a()) {
                            btqp.f149998e = GeneratedMessageLite.m124021a(btqp.f149998e);
                        }
                        bxsy.m123078a(arrayList, btqp.f149998e);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bozw9.getClass();
                        ((btqp) da2.f164949b).f149999f = bozw9;
                        long currentTimeMillis = System.currentTimeMillis();
                        bxvd da3 = bxyk.f165095c.mo74144da();
                        String str6 = "com.google.android.gms.STORE_TAP";
                        long j5 = currentTimeMillis / 1000;
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bxyk bxyk = (bxyk) da3.f164949b;
                        bxyk.f165097a = j5;
                        bxyk.f165098b = ((int) (currentTimeMillis % 1000)) * 1000000;
                        bxyk bxyk2 = (bxyk) da3.mo74062i();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bxyk2.getClass();
                        ((btqp) da2.f164949b).f149996c = bxyk2;
                        String id = TimeZone.getDefault().getID();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        id.getClass();
                        ((btqp) da2.f164949b).f150003j = id;
                        btre a5 = asup.m74857a(asqw.f89459w);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        ((btqp) da2.f164949b).f150004k = a5.mo3214a();
                        CardInfo cardInfo = asqw.f89457u;
                        if (cardInfo != null) {
                            bxvd da4 = btiy.f149054c.mo74144da();
                            String a6 = stm.m36299a(cardInfo.f108340a);
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = false;
                            }
                            a6.getClass();
                            ((btiy) da4.f164949b).f149056a = a6;
                            byte[] bArr = cardInfo.f108341b;
                            if (bArr != null) {
                                ByteString a7 = ByteString.m123261a(bArr);
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                a7.getClass();
                                ((btiy) da4.f164949b).f149057b = a7;
                            }
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            btiy btiy = (btiy) da4.mo74062i();
                            btiy.getClass();
                            ((btqp) da2.f164949b).f149995b = btiy;
                            TokenStatus tokenStatus = cardInfo.f108345f;
                            if (!(tokenStatus == null || (tokenReference = tokenStatus.f108458a) == null)) {
                                int i32 = tokenReference.f108457b;
                                switch (i32) {
                                    case 1:
                                        btof = btof.APTEST_TSP;
                                        break;
                                    case 2:
                                        btof = btof.AMEX_TSP;
                                        break;
                                    case 3:
                                        btof = btof.MASTERCARD_TSP;
                                        break;
                                    case 4:
                                        btof = btof.VISA_TSP;
                                        break;
                                    case 5:
                                        btof = btof.DISCOVER_TSP;
                                        break;
                                    case 6:
                                        btof = btof.EFTPOS_TSP;
                                        break;
                                    case 7:
                                        btof = btof.INTERAC_TSP;
                                        break;
                                    case 8:
                                        btof = btof.OBERTHUR_TSP;
                                        break;
                                    case 9:
                                        btof = btof.PAYPAL_TSP;
                                        break;
                                    case 10:
                                    case 11:
                                    case 12:
                                    default:
                                        StringBuilder sb = new StringBuilder(34);
                                        sb.append("Unknown token provider ");
                                        sb.append(i32);
                                        throw new IllegalArgumentException(sb.toString());
                                    case 13:
                                        btof = btof.JCB_TSP;
                                        break;
                                    case 14:
                                        btof = btof.ELO_TSP;
                                        break;
                                    case 15:
                                        btof = btof.GEMALTO_TSP;
                                        break;
                                }
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                ((btqp) da2.f164949b).f150007n = btof.mo3214a();
                            }
                        }
                        if (!asqw.f89455s || asqw.f89454r != -1) {
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            ((btqp) da2.f164949b).f150005l = btqo.m117042a(4);
                        } else {
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            ((btqp) da2.f164949b).f150005l = btqo.m117042a(3);
                        }
                        asqu asqu2 = asqw.f89456t;
                        if (asqu2 != null) {
                            bxvd da5 = btqq.f150008w.mo74144da();
                            boolean z9 = asqu2.f89411g;
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            btqq btqq = (btqq) da5.f164949b;
                            btqq.f150016g = z9;
                            btqq.f150020k = asqu2.f89413i;
                            String a8 = stm.m36299a(asqu2.f89414j);
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = false;
                            }
                            a8.getClass();
                            ((btqq) da5.f164949b).f150030u = a8;
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            btqq btqq2 = (btqq) da5.mo74062i();
                            btqq2.getClass();
                            ((btqp) da2.f164949b).f149997d = btqq2;
                        }
                        asup.m74859a(asqw.f89429F, da, da2);
                        asup.m74859a(asqw.f89428E, da, da2);
                        asup.m74859a(asqw.f89430G, da, da2);
                        for (asqt asqt2 : asqw.f89438b) {
                            astf astf = asqt2.f89401b;
                            if (astf.mo49461a().length != 0) {
                                try {
                                    asup.m74860a(assu.m74713a(astf.mo49461a()), da, da2);
                                } catch (assv e) {
                                    bnsl bnsl = (bnsl) asup.f89763a.mo68388c();
                                    bnsl.mo68437a(e);
                                    bnsl.mo68432a("asup", "a", 261, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl.mo68405a("Response not in TLV format");
                                }
                            }
                        }
                        bozw bozw10 = (bozw) da.mo74062i();
                        bxvd b3 = b.mo49753b(2, asqw.f89457u);
                        if (b3.f164950c) {
                            b3.mo74035c();
                            b3.f164950c = false;
                        }
                        bpbx bpbx = (bpbx) b3.f164949b;
                        bpbx bpbx2 = bpbx.f135635S;
                        bozw10.getClass();
                        bpbx.f135658d = bozw10;
                        bpbx.f135655a |= 2;
                        b.mo49742a((bpbx) b3.mo74062i(), asqw.f89437a);
                        bnsl a9 = asup.f89763a.mo26019b(aske.m74275a());
                        a9.mo68432a("asup", "a", (int) MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        a9.mo68420a("Session info: \n%s", bozw10);
                        if (asqw.f89441e != null) {
                            if (asqw.f89440d != null) {
                                bnsl a10 = asup.f89763a.mo26019b(aske.m74275a());
                                a10.mo68432a("asup", "b", 597, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                a10.mo68405a("Reporting tap to server");
                                context.startService(IntentOperation.getStartIntent(context, "com.google.android.gms.tapandpay.tapreporting.TapLocationReportingIntentOperation", "com.google.android.gms.tapandpay.tapreporting.TAP_LOCATION_ACTION").putExtra("account_id_extra", asqw.f89440d).putExtra("account_name_extra", asqw.f89441e).putExtra("tap_info_extra", ((btqp) da2.mo74062i()).serializeToBytes()));
                            }
                        }
                        int i33 = ((btqp) da2.f164949b).f150005l;
                        char c = i33 != 0 ? i33 != 1 ? i33 != 2 ? (char) 0 : 4 : 3 : 2;
                        if (c != 0 && c == 3) {
                            btqp btqp2 = (btqp) da2.mo74062i();
                            if (asqw.f89457u == null || asqw.f89440d == null) {
                                bnsl bnsl2 = (bnsl) asup.f89763a.mo68388c();
                                bnsl2.mo68432a("asup", "a", 606, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                bnsl2.mo68405a("Null card info or account, not reporting tap");
                                return;
                            }
                            Intent putExtra = new Intent(str6).putExtra("account_id_extra", asqw.f89440d).putExtra(str4, asqw.f89457u).putExtra("tap_info_extra", btqp2.serializeToBytes());
                            atxn.m76508c(context, putExtra);
                            atxn.m76509d(context, putExtra);
                            if (cgwn.f187872a.mo6606a().mo84642w() && (startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.pay.transactions.data.StoreTapIntentOperation", str6)) != null) {
                                startIntent.putExtra(str4, asqw.f89457u).putExtra("tap_info_extra", btqp2.serializeToBytes());
                                context.startService(startIntent);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw null;
                }
                throw null;
            }
        } catch (RuntimeException e2) {
            bnsl bnsl3 = (bnsl) asup.f89763a.mo68388c();
            bnsl3.mo68437a(e2);
            bnsl3.mo68432a("asup", "a", 168, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Error reporting tap");
        }
    }
}
