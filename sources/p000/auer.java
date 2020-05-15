package p000;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.regex.Pattern;

/* renamed from: auer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auer implements auef {

    /* renamed from: k */
    private static final audg f91568k = audg.m76790a("SciFi_VZW");

    /* renamed from: a */
    private boolean f91569a = true;

    /* renamed from: b */
    private String f91570b = "Unknown";

    /* renamed from: c */
    private boolean f91571c = false;

    /* renamed from: d */
    private String f91572d = "";

    /* renamed from: e */
    private String f91573e = "";

    /* renamed from: f */
    private boolean f91574f = false;

    /* renamed from: g */
    private boolean f91575g = true;

    /* renamed from: h */
    private boolean f91576h = false;

    /* renamed from: i */
    private boolean f91577i = false;

    /* renamed from: j */
    private final bngx f91578j;

    public auer(auem auem) {
        audw audw = (audw) auem;
        auep auep = audw.f91455i;
        if (auep.f91520h) {
            String valueOf = String.valueOf(auep.f91565b);
            if (valueOf.length() == 0) {
                new String("Host from To header: ");
            } else {
                "Host from To header: ".concat(valueOf);
            }
        } else {
            this.f91569a = false;
        }
        this.f91571c = audw.f91453g.f91467a;
        auek auek = audw.f91455i.f91564a;
        if (cgyd.m147560c() && auek != null && auek.f91523b.isEmpty()) {
            boolean z = this.f91571c;
            this.f91571c = !z ? audw.f91454h.f91475d.contains("volte") : z;
        }
        this.f91574f = audw.f91447a.containsKey("p-com.service");
        this.f91577i = audw.f91456j.toString().contains("lockdown");
        if (!cgyd.f188020a.mo6606a().mo84733j()) {
            this.f91578j = bngx.m109356a("Verizon Wireless");
            f91568k.mo50423b("With out enableScifiPeeringVerizon flag, this Verizon user can detect only VZW");
        } else if (audw.f91456j.f91468a.contains("vzwvn.com") && audw.f91455i.f91565b.startsWith("172.")) {
            this.f91578j = bngx.m109356a("Verizon Wireless");
            f91568k.mo50423b(" This Verizon user can detect only VZW");
        } else if (cgyd.m147561d() && audw.f91456j.f91468a.startsWith("172.") && audw.f91455i.f91565b.startsWith("172.")) {
            this.f91578j = bngx.m109357a("Verizon Wireless", "T-Mobile");
            f91568k.mo50423b(" This Verizon user can detect VZW and TMO");
        } else if (!cgyd.m147560c()) {
            this.f91578j = bngx.m109356a("Verizon Wireless");
            f91568k.mo50423b(" This Verizon user can detect only VZW");
        } else if (!this.f91577i) {
            if (cgyd.m147561d()) {
                this.f91578j = bngx.m109358a("Verizon Wireless", "AT&T", "T-Mobile");
                f91568k.mo50423b(" This Verizon user can detect VZW, ATT and TMO");
            } else {
                this.f91578j = bngx.m109357a("Verizon Wireless", "AT&T");
                f91568k.mo50423b(" This Verizon user can detect VZW, ATT");
            }
        } else if (cgyd.m147561d()) {
            this.f91578j = bngx.m109357a("Verizon Wireless", "T-Mobile");
            f91568k.mo50423b(" This Verizon user can detect VZW, TMO");
        } else {
            this.f91578j = bngx.m109356a("Verizon Wireless");
            f91568k.mo50423b(" This Verizon user can detect only VZW");
        }
        if (audw.f91454h.f91475d.contains("att")) {
            this.f91570b = "AT&T";
        } else if (audw.f91454h.f91475d.contains("vzims")) {
            if (!cgyd.m147560c() || this.f91571c) {
                this.f91570b = "Verizon Wireless";
            } else if (auek != null && auek.f91523b.isEmpty()) {
                this.f91570b = "Verizon Wireless";
            }
        } else if (audw.f91454h.f91475d.contains("tmodns") || (cgyd.m147561d() && m76924a(audw.f91454h.f91475d))) {
            this.f91570b = "T-Mobile";
            this.f91572d = "T-Mobile";
        } else if (cgyd.m147561d() && m76924a(audw.f91455i.f91565b) && audw.f91455i.f91566c.length() > 1) {
            this.f91570b = "T-Mobile";
        } else if (cgyd.m147560c() && audw.f91456j.f91468a.contains("vzwvn")) {
            this.f91570b = "Others";
            this.f91572d = "Others";
        } else if (audw.f91455i.f91565b.contains("vzims")) {
            this.f91570b = "Others";
            this.f91576h = true;
        } else {
            if (!cgyd.m147560c() || !this.f91577i || audw.f91449c <= 1220) {
                if (!audw.f91455i.f91565b.startsWith("198.")) {
                    this.f91570b = "Others";
                } else if (audw.f91449c <= 1300) {
                    if (audw.f91456j.f91468a.startsWith("198.") && !audw.f91447a.containsKey("date")) {
                        this.f91570b = "Via GoogleVoice";
                        this.f91572d = "Via GoogleVoice";
                        this.f91576h = true;
                    }
                }
            }
            this.f91570b = "Verizon Wireless";
            this.f91572d = "Verizon Wireless";
        }
        if (audw.f91447a.containsKey("p-com.nameid-termination-reason") && !((String) audw.f91447a.get("p-com.nameid-termination-reason")).equals("unlicensed")) {
            auee auee = new auee((String) audw.f91447a.get("p-com.nameid-termination-reason"));
            if (cgyd.f188020a.mo6606a().mo84732i()) {
                this.f91575g = auee.f91489f;
            }
            if (audw.f91447a.containsKey("p-com.nameid-name-flags")) {
                String str = (String) audw.f91447a.get("p-com.nameid-name-flags");
                auee.f91485b = Pattern.compile("m2m=(\\w+[^;])");
                auee.f91486c = auee.f91485b.matcher(str);
                if (auee.f91486c.find()) {
                    auee.f91487d = auee.f91486c.group(1).equals("true");
                }
                auee.f91485b = Pattern.compile("crn=(\\w+[\\s|&]\\w+)");
                auee.f91486c = auee.f91485b.matcher(str);
                if (auee.f91486c.find() && auee.f91483g.containsKey(auee.f91486c.group(1))) {
                    auee.f91488e = (String) auee.f91483g.get(auee.f91486c.group(1));
                }
                auee.f91485b = Pattern.compile("lt=(\\S+[^\\;])");
                auee.f91486c = auee.f91485b.matcher(str);
                if (auee.f91486c.find()) {
                    auee.mo50486a(auee.f91486c.group(1));
                }
                String str2 = auee.f91488e;
                int i = auee.f91484a;
                boolean z2 = auee.f91489f;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 65);
                sb.append("VZW  nameflag info, carrier, line type, assigned ");
                sb.append(str2);
                sb.append(i);
                sb.append(z2);
                sb.toString();
            } else if (audw.f91447a.containsKey("p-com.nameid-reputation")) {
                String str3 = (String) audw.f91447a.get("p-com.nameid-reputation");
                auee.f91485b = Pattern.compile("crn=(\\w+[\\s]\\w+)");
                auee.f91486c = auee.f91485b.matcher(str3);
                if (auee.f91486c.find() && auee.f91483g.containsKey(auee.f91486c.group(1))) {
                    auee.f91488e = (String) auee.f91483g.get(auee.f91486c.group(1));
                }
                auee.f91485b = Pattern.compile("lt=(\\w+[^\\;])");
                auee.f91486c = auee.f91485b.matcher(str3);
                if (auee.f91486c.find()) {
                    auee.mo50486a(auee.f91486c.group(1));
                }
                String str4 = auee.f91488e;
                int i2 = auee.f91484a;
                boolean z3 = auee.f91487d;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 48);
                sb2.append("VZW  reputation Name  line type ");
                sb2.append(str4);
                sb2.append(i2);
                sb2.append(z3);
                sb2.toString();
            }
            if (!auee.f91488e.isEmpty()) {
                this.f91572d = auee.f91488e;
            }
        }
        if ((audw.f91447a.containsKey("x-dms-anchor") || audw.f91456j.f91468a.contains("vzims")) && this.f91572d.isEmpty()) {
            this.f91572d = this.f91570b;
        }
        if (audw.f91447a.containsKey("history-info")) {
            aueb aueb = new aueb((String) audw.f91447a.get("history-info"));
            boolean z4 = aueb.f91471b;
            this.f91576h = z4;
            String str5 = aueb.f91470a;
            this.f91573e = str5;
            StringBuilder sb3 = new StringBuilder(String.valueOf(str5).length() + 13);
            sb3.append(" cfdNum ");
            sb3.append(str5);
            sb3.append(z4);
            sb3.toString();
        }
        boolean z5 = this.f91571c;
        String str6 = this.f91570b;
        StringBuilder sb4 = new StringBuilder(String.valueOf(str6).length() + 23);
        sb4.append(" ims = ");
        sb4.append(z5);
        sb4.append(" carrier = ");
        sb4.append(str6);
        sb4.toString();
    }

    /* renamed from: a */
    public static final boolean m76924a(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("check if it is tmobile ip address ");
        } else {
            "check if it is tmobile ip address ".concat(valueOf);
        }
        if (str.length() <= 0) {
            return false;
        }
        try {
            InetAddress byName = InetAddress.getByName(str);
            String hostName = byName.getHostName();
            String valueOf2 = String.valueOf(byName.getHostName());
            if (valueOf2.length() == 0) {
                new String("Host Name: ");
            } else {
                "Host Name: ".concat(valueOf2);
            }
            if (hostName.contains("tmodns")) {
                return true;
            }
            return false;
        } catch (UnknownHostException e) {
            String valueOf3 = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 17);
            sb.append("wrong host name !");
            sb.append(valueOf3);
            sb.toString();
        }
    }

    /* renamed from: a */
    public final boolean mo50444a() {
        return this.f91569a;
    }

    /* renamed from: b */
    public final boolean mo50445b() {
        return this.f91575g;
    }

    /* renamed from: c */
    public final String mo50446c() {
        return this.f91570b;
    }

    /* renamed from: d */
    public final boolean mo50447d() {
        return this.f91571c;
    }

    /* renamed from: e */
    public final String mo50448e() {
        return this.f91572d;
    }

    /* renamed from: f */
    public final String mo50449f() {
        return this.f91573e;
    }

    /* renamed from: g */
    public final boolean mo50450g() {
        return this.f91574f;
    }

    /* renamed from: h */
    public final boolean mo50451h() {
        return this.f91576h;
    }

    /* renamed from: i */
    public final bngx mo50452i() {
        return this.f91578j;
    }
}
