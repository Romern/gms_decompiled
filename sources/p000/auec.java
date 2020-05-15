package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: auec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auec extends auej {

    /* renamed from: a */
    public String f91472a = "";

    /* renamed from: b */
    public String f91473b = "";

    /* renamed from: c */
    public int f91474c = 0;

    /* renamed from: d */
    public String f91475d = "";

    /* renamed from: e */
    public boolean f91476e = false;

    /* renamed from: f */
    public int f91477f = 3;

    /* renamed from: g */
    private String f91478g = "";

    /* renamed from: i */
    private auek f91479i;

    /* renamed from: j */
    private aues f91480j;

    public auec(String str) {
        super(str);
        if (!str.contains("anonymous")) {
            try {
                Matcher matcher = Pattern.compile("sip\\D*(\\d+)").matcher(str);
                if (matcher.find()) {
                    this.f91473b = matcher.group(1);
                }
                Matcher matcher2 = Pattern.compile("@(\\S[^\\>\\;]+)").matcher(str);
                if (matcher2.find()) {
                    auek auek = new auek(matcher2.group(1));
                    this.f91479i = auek;
                    if (!auek.mo50489a().isEmpty()) {
                        this.f91475d = this.f91479i.mo50489a();
                    }
                }
                Matcher matcher3 = Pattern.compile("tel\\D*(\\d+)").matcher(str);
                if (matcher3.find()) {
                    this.f91478g = matcher3.group(1);
                }
                Matcher matcher4 = Pattern.compile("oli\\D*(\\d+)").matcher(str);
                if (matcher4.find()) {
                    try {
                        this.f91474c = Integer.parseInt(matcher4.group(1));
                    } catch (NumberFormatException e) {
                        mo50487b();
                    }
                }
                if (!this.f91475d.isEmpty()) {
                    Matcher matcher5 = Pattern.compile("@(\\S+)").matcher(str);
                    if (matcher5.find()) {
                        matcher5.group(1);
                    }
                }
                Matcher matcher6 = Pattern.compile("rn=\\D*(\\d+)").matcher(str);
                if (!matcher6.find() || matcher6.group(1) == null) {
                    this.f91477f = 1;
                } else {
                    this.f91472a = matcher6.group(1);
                    m76872c();
                }
                if (cgyd.m147563f()) {
                    Matcher matcher7 = Pattern.compile("verstat=(\\D+)").matcher(str);
                    if (matcher7.find()) {
                        this.f91480j = new aues(matcher7.group(1));
                    }
                }
            } catch (NullPointerException e2) {
                mo50487b();
            }
        } else {
            this.f91476e = true;
        }
    }

    /* renamed from: c */
    private final void m76872c() {
        try {
            if (!this.f91473b.isEmpty() && !this.f91473b.substring(1, 6).equals(this.f91472a.substring(1, 6))) {
                if (!this.f91473b.substring(1, 6).equals(this.f91472a.substring(2, 7))) {
                    this.f91477f = 2;
                }
            }
            if (!this.f91478g.isEmpty() && !this.f91478g.substring(1, 6).equals(this.f91472a.substring(1, 6)) && !this.f91478g.substring(1, 6).equals(this.f91472a.substring(2, 7))) {
                this.f91477f = 2;
            }
        } catch (StringIndexOutOfBoundsException e) {
            mo50487b();
        }
    }

    /* renamed from: a */
    public final int mo50485a() {
        aues aues = this.f91480j;
        if (aues != null) {
            return aues.f91579a;
        }
        return 4;
    }
}
