package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: audu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class audu implements auef {

    /* renamed from: h */
    private static final audg f91428h = audg.m76790a("SciFi_ATT");

    /* renamed from: a */
    private boolean f91429a = true;

    /* renamed from: b */
    private String f91430b = "Others";

    /* renamed from: c */
    private boolean f91431c;

    /* renamed from: d */
    private String f91432d;

    /* renamed from: e */
    private String f91433e;

    /* renamed from: f */
    private boolean f91434f;

    /* renamed from: g */
    private final bngx f91435g;

    public audu(auem auem) {
        int i = 0;
        this.f91431c = false;
        this.f91432d = "";
        this.f91433e = "";
        this.f91434f = false;
        this.f91435g = bngx.m109357a("AT&T", "Verizon Wireless");
        audw audw = (audw) auem;
        if (audw.f91447a.containsKey("diversion")) {
            this.f91434f = true;
            Matcher matcher = Pattern.compile("sip\\D+(\\+\\d+)").matcher((CharSequence) audw.f91447a.get("diversion"));
            if (matcher.find()) {
                String group = matcher.group(1);
                this.f91433e = group;
                audg audg = f91428h;
                String valueOf = String.valueOf(group);
                audg.mo50423b(valueOf.length() == 0 ? new String(" call forwarded via ") : " call forwarded via ".concat(valueOf));
            }
        }
        boolean z = audw.f91453g.f91467a;
        this.f91431c = z;
        if (z) {
            auec auec = audw.f91454h;
            if (auec.f91477f != 2) {
                this.f91430b = "Verizon Wireless";
            } else if (auec.f91474c == 62) {
                this.f91430b = "AT&T";
            } else {
                this.f91430b = "AT&T";
            }
        } else if ("16617480000".equals(audw.f91454h.f91472a)) {
            this.f91430b = "Skype";
        } else if (!this.f91434f && audw.f91454h.f91477f == 2) {
            this.f91430b = "AT&T";
            this.f91432d = "AT&T";
        }
        if (audw.f91447a.containsKey("max-forwards")) {
            try {
                i = Integer.parseInt((String) ((audw) auem).f91447a.get("max-forwards"));
            } catch (NumberFormatException e) {
                this.f91429a = false;
                return;
            }
        }
        if (i == 2 || i == 22 || i == 26 || i == 28) {
            this.f91430b = "VoIP";
        } else if (i != 54) {
            if (i != 79) {
                if (i != 19) {
                    if (i == 20) {
                        int i2 = audw.f91454h.f91474c;
                        if (i2 == 95 || i2 == 63) {
                            this.f91434f = true;
                        }
                    } else if (i != 61) {
                        if (i != 62) {
                            if (i < 10) {
                                this.f91430b = "VoIP";
                            } else if (cgyd.m147560c() && i > 50 && i < 60) {
                                if (!this.f91431c) {
                                    this.f91430b = "Others";
                                    this.f91432d = "Others";
                                } else {
                                    this.f91432d = this.f91430b;
                                }
                            }
                            boolean z2 = this.f91431c;
                            String str = this.f91430b;
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
                            sb.append(" ims = ");
                            sb.append(z2);
                            sb.append(" carrier = ");
                            sb.append(str);
                            sb.toString();
                        } else if (!this.f91431c || !this.f91434f) {
                            this.f91430b.equals("AT&T");
                        }
                    }
                } else if (audw.f91454h.f91474c == 63) {
                    this.f91430b = "T-Mobile";
                    this.f91432d = "T-Mobile";
                }
            }
            if (audw.f91454h.f91474c == 63) {
                this.f91430b = "Via GoogleVoice";
                this.f91432d = "Via GoogleVoice";
                this.f91434f = true;
            }
        } else {
            this.f91430b = "Verizon Wireless";
            this.f91432d = "Verizon Wireless";
        }
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append(" maxForwards ");
        sb2.append(i);
        sb2.toString();
        audg audg2 = f91428h;
        boolean z3 = this.f91434f;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append(" call forwarding is  ");
        sb3.append(z3);
        audg2.mo50423b(sb3.toString());
    }

    /* renamed from: a */
    public final boolean mo50444a() {
        return this.f91429a;
    }

    /* renamed from: b */
    public final boolean mo50445b() {
        return true;
    }

    /* renamed from: c */
    public final String mo50446c() {
        return this.f91430b;
    }

    /* renamed from: d */
    public final boolean mo50447d() {
        return this.f91431c;
    }

    /* renamed from: e */
    public final String mo50448e() {
        return this.f91432d;
    }

    /* renamed from: f */
    public final String mo50449f() {
        return this.f91433e;
    }

    /* renamed from: g */
    public final boolean mo50450g() {
        return false;
    }

    /* renamed from: h */
    public final boolean mo50451h() {
        return this.f91434f;
    }

    /* renamed from: i */
    public final bngx mo50452i() {
        return this.f91435g;
    }
}
