package p000;

/* renamed from: aueo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aueo implements auef {

    /* renamed from: i */
    private static final audg f91555i = audg.m76790a("SciFi_Tmo");

    /* renamed from: a */
    private final bngx f91556a = bngx.m109359a("T-Mobile", "Google Voice", "Fi", "Via GoogleVoice");

    /* renamed from: b */
    private boolean f91557b = true;

    /* renamed from: c */
    private String f91558c = "Unknown";

    /* renamed from: d */
    private boolean f91559d = false;

    /* renamed from: e */
    private String f91560e = "";

    /* renamed from: f */
    private String f91561f = "";

    /* renamed from: g */
    private boolean f91562g = false;

    /* renamed from: h */
    private int f91563h = 0;

    public aueo(auem auem) {
        audw audw = (audw) auem;
        auep auep = audw.f91455i;
        if (auep.f91520h) {
            String valueOf = String.valueOf(auep.f91565b);
            if (valueOf.length() == 0) {
                new String("Host in To header: ");
            } else {
                "Host in To header: ".concat(valueOf);
            }
        } else {
            this.f91557b = false;
        }
        auea auea = audw.f91456j;
        if (auea.f91520h) {
            String valueOf2 = String.valueOf(auea.f91468a);
            if (valueOf2.length() == 0) {
                new String("Host in From  header: ");
            } else {
                "Host in From  header: ".concat(valueOf2);
            }
        } else {
            this.f91557b = false;
        }
        this.f91559d = audw.f91453g.f91467a;
        this.f91563h = 3;
        if (audw.f91456j.f91468a.contains("google.com")) {
            this.f91558c = "Google Voice";
            this.f91560e = "Google Voice";
        } else if (!this.f91559d) {
            aueq aueq = audw.f91457k;
            if (aueq != null) {
                String valueOf3 = String.valueOf(aueq.f91567a);
                if (valueOf3.length() == 0) {
                    new String(" userAgent carrier ");
                } else {
                    " userAgent carrier ".concat(valueOf3);
                }
                if (audw.f91457k.f91567a.equals("Fi")) {
                    this.f91558c = "Fi";
                    this.f91560e = "Fi";
                } else if (audw.f91457k.f91567a.equals("T-Mobile") && !"T-Mobile".equals(audw.f91458l.f91481a)) {
                    audt audt = audw.f91451e;
                    if (audt != null && audt.f91427a == 5) {
                        this.f91558c = "Google Voice";
                        this.f91560e = "Google Voice";
                    } else {
                        auds auds = audw.f91450d;
                        if (auds != null && auds.f91426a == 4) {
                            this.f91558c = "Via GoogleVoice";
                            if (cgyd.f188020a.mo6606a().mo84731h()) {
                                this.f91560e = "Via GoogleVoice";
                            }
                            this.f91563h = 1;
                            f91555i.mo50423b(" Likely VoIP peering, including Google Voice  ");
                        }
                    }
                }
            } else if (audw.f91449c > 660) {
                this.f91558c = "T-Mobile";
                this.f91560e = "T-Mobile";
            }
        } else if (audw.f91455i.f91565b.equals(audw.f91456j.f91468a)) {
            this.f91558c = "T-Mobile";
            this.f91560e = "T-Mobile";
            this.f91563h = 3;
        }
        if (audw.f91447a.containsKey("history-info")) {
            aueb aueb = new aueb((String) audw.f91447a.get("history-info"));
            boolean z = aueb.f91471b;
            this.f91562g = z;
            String str = aueb.f91470a;
            this.f91561f = str;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
            sb.append(" cfdNum ");
            sb.append(str);
            sb.append(z);
            sb.toString();
        }
        boolean z2 = this.f91559d;
        String str2 = this.f91558c;
        int i = this.f91563h;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 45);
        sb2.append(" isIms: ");
        sb2.append(z2);
        sb2.append(" Carrier: ");
        sb2.append(str2);
        sb2.append(" line type ");
        sb2.append(i);
        sb2.toString();
    }

    /* renamed from: a */
    public final boolean mo50444a() {
        return this.f91557b;
    }

    /* renamed from: b */
    public final boolean mo50445b() {
        return true;
    }

    /* renamed from: c */
    public final String mo50446c() {
        return this.f91558c;
    }

    /* renamed from: d */
    public final boolean mo50447d() {
        return this.f91559d;
    }

    /* renamed from: e */
    public final String mo50448e() {
        return this.f91560e;
    }

    /* renamed from: f */
    public final String mo50449f() {
        return this.f91561f;
    }

    /* renamed from: g */
    public final boolean mo50450g() {
        return false;
    }

    /* renamed from: h */
    public final boolean mo50451h() {
        return this.f91562g;
    }

    /* renamed from: i */
    public final bngx mo50452i() {
        return this.f91556a;
    }
}
