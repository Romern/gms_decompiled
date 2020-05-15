package p000;

import com.felicanetworks.cmnctrl.net.DataParser;
import java.util.HashMap;
import java.util.Map;

/* renamed from: auen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auen {

    /* renamed from: o */
    private static final bnhe f91540o;

    /* renamed from: a */
    public boolean f91541a;

    /* renamed from: b */
    public String f91542b;

    /* renamed from: c */
    public int f91543c = 0;

    /* renamed from: d */
    public auds f91544d;

    /* renamed from: e */
    public audt f91545e;

    /* renamed from: f */
    public audx f91546f;

    /* renamed from: g */
    public audz f91547g;

    /* renamed from: h */
    public auec f91548h;

    /* renamed from: i */
    public auep f91549i;

    /* renamed from: j */
    public auea f91550j;

    /* renamed from: k */
    public aueq f91551k;

    /* renamed from: l */
    public aued f91552l;

    /* renamed from: m */
    public final Map f91553m = new HashMap();

    /* renamed from: n */
    private String f91554n = "requestline";

    static {
        audg.m76790a("SciFiEventLogger");
        bnha h = bnhe.m109414h();
        h.mo67695b("i", "call-id");
        h.mo67695b("m", "contact");
        h.mo67695b("a", "accept-contact");
        h.mo67695b("e", "content-encoding");
        h.mo67695b("l", DataParser.CONTENT_LENGTH_KEY);
        h.mo67695b("c", "content-type");
        h.mo67695b("f", "from");
        h.mo67695b("s", "subject");
        h.mo67695b("r", "refer-to");
        h.mo67695b("o", "event");
        h.mo67695b("b", "referred-By");
        h.mo67695b("u", "allow-events");
        h.mo67695b("t", "to");
        h.mo67695b("v", "via");
        h.mo67695b("k", "supported");
        f91540o = h.mo67618b();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0137, code lost:
        if (r13.equals("p-asserted-identity") != false) goto L_0x014d;
     */
    public auen(String str) {
        String str2;
        int i = 1;
        this.f91541a = true;
        String[] split = str.split("\n|\r", -1);
        int length = split.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                String str3 = split[i2];
                if (!str3.trim().isEmpty()) {
                    String lowerCase = str3.toLowerCase();
                    if (lowerCase.contains(":") || !this.f91554n.equals("headers")) {
                        char c = 2;
                        Object[] objArr = new Object[2];
                        String str4 = this.f91554n;
                        objArr[0] = str4;
                        objArr[i] = lowerCase;
                        if (str4.equals("requestline")) {
                            String replaceAll = lowerCase.replaceAll("(\\r|\\n)", "");
                            if (replaceAll != null && !replaceAll.isEmpty()) {
                                String[] split2 = replaceAll.split("\\s");
                                if (split2.length == 3) {
                                    String str5 = split2[0];
                                    this.f91542b = str5;
                                    new Object[i][0] = str5;
                                    String str6 = split2[i];
                                    String str7 = split2[2];
                                    if (str5.equals("sip/2.0")) {
                                        try {
                                            int parseInt = Integer.parseInt(str6);
                                            if (parseInt >= 100) {
                                                if (parseInt > 699) {
                                                }
                                            }
                                        } catch (NumberFormatException e) {
                                        }
                                    } else if (!str7.equals("sip/2.0")) {
                                        Object[] objArr2 = new Object[3];
                                        objArr2[0] = this.f91542b;
                                        objArr2[i] = str6;
                                        objArr2[2] = str7;
                                    }
                                    this.f91554n = "headers";
                                }
                            }
                        } else if (this.f91554n.equals("headers") && lowerCase != null && !lowerCase.isEmpty()) {
                            try {
                                String[] split3 = lowerCase.split(":", 2);
                                String str8 = split3[0];
                                String str9 = split3[i];
                                String replaceAll2 = str9.replaceAll("^\\s+", "");
                                if (str8.length() == i) {
                                    str2 = (String) f91540o.get(str8);
                                } else {
                                    str2 = str8;
                                }
                                switch (str2.hashCode()) {
                                    case -1423461112:
                                        if (str2.equals("accept")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1132779846:
                                        if (str2.equals(DataParser.CONTENT_LENGTH_KEY)) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -858320119:
                                        break;
                                    case -161441598:
                                        if (str2.equals("p-charging-vector")) {
                                            c = 8;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3707:
                                        if (str2.equals("to")) {
                                            c = 4;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 3151786:
                                        if (str2.equals("from")) {
                                            c = 5;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 92906313:
                                        if (str2.equals("allow")) {
                                            c = 9;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 486342275:
                                        if (str2.equals(DataParser.USER_AGENT_KEY)) {
                                            c = 6;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 548583146:
                                        if (str2.equals("call-id")) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 951526432:
                                        if (str2.equals("contact")) {
                                            c = 7;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                switch (c) {
                                    case 0:
                                        this.f91543c = Integer.parseInt(replaceAll2);
                                        break;
                                    case 1:
                                        this.f91544d = new auds(replaceAll2);
                                        break;
                                    case 2:
                                        this.f91548h = new auec(replaceAll2);
                                        break;
                                    case 3:
                                        this.f91546f = new audx(replaceAll2);
                                        break;
                                    case 4:
                                        this.f91549i = new auep(replaceAll2);
                                        break;
                                    case 5:
                                        this.f91550j = new auea(replaceAll2);
                                        break;
                                    case 6:
                                        this.f91551k = new aueq(replaceAll2);
                                        break;
                                    case 7:
                                        this.f91547g = new audz(replaceAll2);
                                        break;
                                    case 8:
                                        this.f91552l = new aued(replaceAll2);
                                        break;
                                    case 9:
                                        this.f91545e = new audt(replaceAll2);
                                        break;
                                }
                                this.f91553m.put(str2, replaceAll2);
                                if (str8.equals(DataParser.CONTENT_LENGTH_KEY)) {
                                    this.f91543c = Integer.parseInt(str9.replaceAll("^\\s+", ""));
                                }
                            } catch (NullPointerException e2) {
                            }
                        }
                    } else {
                        this.f91554n = "sdp";
                    }
                }
                i2++;
                i = 1;
            }
        }
        this.f91541a = false;
        if (this.f91550j == null || this.f91549i == null || this.f91546f == null || this.f91547g == null) {
            this.f91541a = false;
        }
    }
}
