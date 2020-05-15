package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: auek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auek {

    /* renamed from: e */
    private static final bnhe f91521e;

    /* renamed from: a */
    public String f91522a = "";

    /* renamed from: b */
    public String f91523b = "";

    /* renamed from: c */
    private String f91524c = "";

    /* renamed from: d */
    private URI f91525d;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b("att.net", "AT&T");
        h.mo67695b("vzims.com", "Verizon Wireless");
        h.mo67695b("inpeer.vzw.com", "Verizon Wireless");
        h.mo67695b("inpeer.vzb.com", "Verizon Wireless");
        h.mo67695b("volte.vzims.com", "Verizon Wireless");
        h.mo67695b("t-mobile.com", "T-Mobile");
        h.mo67695b("tmobileusa.com", "T-Mobile");
        f91521e = h.mo67618b();
    }

    public auek(String str) {
        m76898a(str);
    }

    /* renamed from: a */
    private final void m76898a(String str) {
        try {
            String valueOf = String.valueOf(str);
            this.f91525d = new URI(valueOf.length() == 0 ? new String("sip://") : "sip://".concat(valueOf));
            StringBuilder sb = new StringBuilder((int) MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA);
            sb.append("(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}):(\\d+)|\\[([a-zA-Z0-9:]+)\\]:(\\d+)|([\\w\\.\\-]+):(\\d+)|([\\w\\.\\-]+)|(\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})|\\[([a-zA-Z0-9:]+)\\]");
            Matcher matcher = Pattern.compile(sb.toString()).matcher(str);
            if (!matcher.matches()) {
                return;
            }
            if (matcher.group(1) != null) {
                try {
                    if (InetAddress.getByName(matcher.group(1)) instanceof Inet4Address) {
                        m76899b();
                    }
                } catch (UnknownHostException e) {
                }
            } else if (matcher.group(3) != null) {
                try {
                    if (InetAddress.getByName(matcher.group(3)) instanceof Inet6Address) {
                        m76899b();
                    }
                } catch (UnknownHostException e2) {
                }
            } else if (matcher.group(5) != null) {
                m76899b();
            } else if (matcher.group(7) != null || matcher.group(8) != null || matcher.group(9) != null) {
                m76899b();
            }
        } catch (URISyntaxException e3) {
        }
    }

    /* renamed from: b */
    private final void m76899b() {
        this.f91524c = bmxx.m108578b(this.f91525d.getHost());
        this.f91525d.getPort();
        if (f91521e.containsKey(this.f91524c)) {
            this.f91522a = (String) f91521e.get(this.f91524c);
            if (this.f91524c.contains("inpeer")) {
                this.f91523b = this.f91522a;
                return;
            }
            return;
        }
        Matcher matcher = Pattern.compile("(.+)\\.(\\w+\\.com|net)").matcher(this.f91524c);
        if (matcher.matches() && matcher.group(2) != null) {
            String group = matcher.group(2);
            if (f91521e.containsKey(group)) {
                String str = (String) f91521e.get(group);
                this.f91522a = str;
                this.f91523b = str;
            }
        }
    }

    /* renamed from: a */
    public final String mo50489a() {
        String str = this.f91524c;
        return str == null ? "" : str;
    }
}
