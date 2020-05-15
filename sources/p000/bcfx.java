package p000;

import android.content.Context;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: bcfx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcfx implements bcnt {

    /* renamed from: c */
    private static bcfx f104096c;

    /* renamed from: a */
    public boolean f104097a = true;

    /* renamed from: b */
    public final Set f104098b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: d */
    private final Context f104099d;

    /* renamed from: e */
    private final qws f104100e;

    /* renamed from: f */
    private final Executor f104101f = Executors.newSingleThreadExecutor();

    private bcfx(Context context) {
        this.f104099d = context;
        this.f104100e = new qws(context, "LIGHTER_ANDROID", null);
    }

    /* renamed from: a */
    public static synchronized bcfx m88929a(Context context) {
        bcfx bcfx;
        synchronized (bcfx.class) {
            if (f104096c == null) {
                bcfx = new bcfx(context.getApplicationContext());
                f104096c = bcfx;
            } else {
                bcfx = f104096c;
            }
        }
        return bcfx;
    }

    /* renamed from: a */
    public static final bqhu m88930a(ContactId contactId) {
        bxvd da = bqhu.f140722e.mo74144da();
        String a = contactId.mo60492a();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((bqhu) da.f164949b).f140725b = a;
        String b = contactId.mo60493b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        b.getClass();
        ((bqhu) da.f164949b).f140727d = b;
        ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
        int ordinal = contactId.mo60494c().ordinal();
        if (ordinal == 0) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bqhu) da.f164949b).f140724a = cbel.m127776a(2);
        } else if (ordinal == 1) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bqhu) da.f164949b).f140724a = cbel.m127776a(3);
        } else if (ordinal == 2) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bqhu) da.f164949b).f140724a = cbel.m127776a(4);
        } else if (ordinal == 3) {
            bbot.m88296a(contactId.mo60495d(), new bcfc(da));
        } else if (ordinal == 4) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bqhu) da.f164949b).f140724a = cbel.m127776a(7);
        }
        return (bqhu) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo56753a(bcns bcns) {
        int i;
        bcfv bcfv = new bcfv(null);
        bxvd da = bqhp.f140683q.mo74144da();
        String packageName = this.f104099d.getPackageName();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        packageName.getClass();
        ((bqhp) da.f164949b).f140700p = packageName;
        int a = bcns.mo56983a();
        switch (a) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 9;
                break;
            case 8:
                i = 10;
                break;
            case 9:
                i = 11;
                break;
            case 10:
                i = 12;
                break;
            case 11:
                i = 13;
                break;
            case 12:
                i = 14;
                break;
            case 13:
                i = 15;
                break;
            case 14:
                i = 16;
                break;
            case 15:
                i = 17;
                break;
            case 16:
                i = 18;
                break;
            case 17:
                i = 19;
                break;
            case 18:
                i = 20;
                break;
            case 19:
                i = 21;
                break;
            case 20:
                i = 22;
                break;
            case 21:
                i = 23;
                break;
            case 22:
                i = 24;
                break;
            case 23:
                i = 25;
                break;
            case 24:
                i = 26;
                break;
            case 25:
                i = 27;
                break;
            case 26:
                i = 28;
                break;
            case 27:
                i = 29;
                break;
            case 28:
                i = 30;
                break;
            case 29:
                i = 31;
                break;
            case 30:
                i = 32;
                break;
            case 31:
                i = 33;
                break;
            case 32:
                i = 34;
                break;
            case 33:
                i = 35;
                break;
            case 34:
                i = 36;
                break;
            case 35:
                i = 37;
                break;
            case 36:
                i = 38;
                break;
            case FelicaException.TYPE_NOT_CLOSED:
                i = 39;
                break;
            case FelicaException.TYPE_ILLEGAL_METHOD_CALL:
                i = 40;
                break;
            case FelicaException.TYPE_USED_BY_OTHER_APP:
                i = 41;
                break;
            case FelicaException.TYPE_PUSH_FAILED:
                i = 42;
                break;
            case 41:
                i = 43;
                break;
            case FelicaException.TYPE_ALREADY_ACTIVATED:
                i = 44;
                break;
            case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                i = 45;
                break;
            case FelicaException.TYPE_RESET_FAILED:
                i = 46;
                break;
            case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                i = 47;
                break;
            case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                i = 48;
                break;
            case 47:
                i = 49;
                break;
            case 48:
                i = 50;
                break;
            case FelicaException.TYPE_CURRENTLY_ACTIVATING:
                i = 51;
                break;
            default:
                switch (a) {
                    case 100:
                        i = 102;
                        break;
                    case 101:
                        i = ErrorInfo.TYPE_SDU_COMMUNICATIONERROR;
                        break;
                    case 102:
                        i = ErrorInfo.TYPE_SDU_FAILED;
                        break;
                    case ErrorInfo.TYPE_SDU_COMMUNICATIONERROR:
                        i = ErrorInfo.TYPE_SDU_MEMORY_FULL;
                        break;
                    case ErrorInfo.TYPE_SDU_FAILED:
                        i = 106;
                        break;
                    case ErrorInfo.TYPE_SDU_MEMORY_FULL:
                        i = 107;
                        break;
                    case 106:
                        i = 108;
                        break;
                    case 107:
                        i = 109;
                        break;
                    case 108:
                        i = 110;
                        break;
                    case 109:
                        i = 111;
                        break;
                    case 110:
                        i = AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
                        break;
                    case 111:
                        i = 113;
                        break;
                    case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS /*112*/:
                        i = 114;
                        break;
                    case 113:
                        i = 115;
                        break;
                    case 114:
                        i = 116;
                        break;
                    case 115:
                        i = 117;
                        break;
                    case 116:
                        i = 118;
                        break;
                    case 117:
                        i = 119;
                        break;
                    case 118:
                        i = 120;
                        break;
                    case 119:
                        i = 121;
                        break;
                    case 120:
                        i = 122;
                        break;
                    case 121:
                        i = 123;
                        break;
                    case 122:
                        i = 124;
                        break;
                    case 123:
                        i = 125;
                        break;
                    case 124:
                        i = 126;
                        break;
                    case 125:
                        i = 127;
                        break;
                    case 126:
                        i = 128;
                        break;
                    case 127:
                        i = 129;
                        break;
                    case 128:
                        i = 130;
                        break;
                    case 129:
                        i = 131;
                        break;
                    case 130:
                        i = 132;
                        break;
                    case 131:
                        i = 133;
                        break;
                    case 132:
                        i = 134;
                        break;
                    default:
                        switch (a) {
                            case 10000:
                                i = 10002;
                                break;
                            case 10001:
                                i = 10003;
                                break;
                            case 10002:
                                i = 10004;
                                break;
                            case 10003:
                                i = 10005;
                                break;
                            case 10004:
                                i = 10006;
                                break;
                            case 10005:
                                i = 10007;
                                break;
                            case 10006:
                                i = 10008;
                                break;
                            case 10007:
                                i = 10009;
                                break;
                            case 10008:
                                i = 10010;
                                break;
                            case 10009:
                                i = 10011;
                                break;
                            case 10010:
                                i = 10012;
                                break;
                            case 10011:
                                i = 10013;
                                break;
                            case 10012:
                                i = 10014;
                                break;
                            case 10013:
                                i = 10015;
                                break;
                            case 10014:
                                i = 10016;
                                break;
                            case 10015:
                                i = 10017;
                                break;
                            case 10016:
                                i = 10018;
                                break;
                            case 10017:
                                i = 10019;
                                break;
                            case 10018:
                                i = 10020;
                                break;
                            case 10019:
                                i = 10021;
                                break;
                            case 10020:
                                i = 10022;
                                break;
                            case 10021:
                                i = 10023;
                                break;
                            case 10022:
                                i = 10024;
                                break;
                            case 10023:
                                i = 10025;
                                break;
                            case 10024:
                                i = 10026;
                                break;
                            case 10025:
                                i = 10027;
                                break;
                            case 10026:
                                i = 10028;
                                break;
                            case 10027:
                                i = 10029;
                                break;
                            case 10028:
                                i = 10030;
                                break;
                            case 10029:
                                i = 10031;
                                break;
                            case 10030:
                                i = 10032;
                                break;
                            case 10031:
                                i = 10033;
                                break;
                            case 10032:
                                i = 10034;
                                break;
                            case 10033:
                                i = 10035;
                                break;
                            case 10034:
                                i = 10036;
                                break;
                            case 10035:
                                i = 10037;
                                break;
                            case 10036:
                                i = 10038;
                                break;
                            case 10037:
                                i = 10039;
                                break;
                            case 10038:
                                i = 10040;
                                break;
                            case 10039:
                                i = 10041;
                                break;
                            case 10040:
                                i = 10042;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                }
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqhp bqhp = (bqhp) da.f164949b;
        if (i != 1) {
            bqhp.f140685a = i - 2;
            bbot.m88296a(bcns.mo56984b(), new bcfd(da));
            bmxv c = bcns.mo56985c();
            da.getClass();
            bbot.m88296a(c, new bcfn(da));
            bmxv d = bcns.mo56986d();
            da.getClass();
            bbot.m88296a(d, new bcfo(da));
            bbot.m88296a(bcns.mo56987e(), new bcfp(da));
            bbot.m88296a(bcns.mo56989f(), new bcfq(da));
            bbot.m88296a(bcns.mo56990g(), new bcfr(da));
            bbot.m88296a(bcns.mo56991h(), new bcfs(da));
            bmxv i2 = bcns.mo56993i();
            da.getClass();
            bbot.m88296a(i2, new bcft(da));
            bmxv j = bcns.mo56994j();
            da.getClass();
            bbot.m88296a(j, new bcfu(da));
            bmxv n = bcns.mo56998n();
            da.getClass();
            bbot.m88296a(n, new bcet(da));
            if (!bcns.mo56996l().isEmpty()) {
                bxvd da2 = bqht.f140719b.mo74144da();
                bngx l = bcns.mo56996l();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bqht bqht = (bqht) da2.f164949b;
                if (!bqht.f140721a.mo73666a()) {
                    bqht.f140721a = GeneratedMessageLite.m124020a(bqht.f140721a);
                }
                bxsy.m123078a(l, bqht.f140721a);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bqht bqht2 = (bqht) da2.mo74062i();
                bqht2.getClass();
                ((bqhp) da.f164949b).f140694j = bqht2;
            }
            bmxv k = bcns.mo56995k();
            da.getClass();
            bbot.m88296a(k, new bceu(da));
            bbot.m88296a(bcns.mo56997m(), new bcev(da));
            bbot.m88296a(bcns.mo57000p(), new bcew(da));
            bbot.m88296a(bcns.mo56999o(), new bcex(da));
            ByteString aL = ((bqhp) da.mo74062i()).mo73639aL();
            if (aL != null) {
                bcfv.f104090a = aL;
                bcfv.f104091b = Integer.valueOf(bcns.mo56983a());
                if (this.f104097a && bcns.mo56984b().mo66813a() && ((ContactId) bcns.mo56984b().mo66814b()).mo60494c().equals(ContactId.ContactType.EMAIL)) {
                    bcfv.f104095f = bmxv.m108566b(((ContactId) bcns.mo56984b().mo66814b()).mo60492a());
                }
                qws qws = this.f104100e;
                String str = bcfv.f104090a == null ? " event" : "";
                if (bcfv.f104091b == null) {
                    str = str.concat(" eventCode");
                }
                if (!str.isEmpty()) {
                    String valueOf = String.valueOf(str);
                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                }
                bcer bcer = new bcer(bcfv.f104090a, bcfv.f104091b.intValue(), bcfv.f104092c, bcfv.f104093d, bcfv.f104094e, bcfv.f104095f);
                qwo a2 = qws.mo24335a(bcer.f104054a.getKey());
                a2.mo24328b(bcer.f104055b);
                if (bcer.f104059f.mo66813a()) {
                    a2.mo24330c((String) bcer.f104059f.mo66814b());
                }
                a2.mo24327b();
                this.f104101f.execute(new bces(this, bcns));
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
