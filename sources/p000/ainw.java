package p000;

import java.io.IOException;

/* renamed from: ainw */
final /* synthetic */ class ainw implements Runnable {

    /* renamed from: a */
    private final ainz f69296a;

    /* renamed from: b */
    private final String f69297b;

    /* renamed from: c */
    private final String f69298c;

    public ainw(ainz ainz, String str, String str2) {
        this.f69296a = ainz;
        this.f69297b = str;
        this.f69298c = str2;
    }

    public final void run() {
        ainz ainz = this.f69296a;
        String str = this.f69297b;
        String str2 = this.f69298c;
        if (ainz.mo37732a(aiof.m57536a(str, str2, false), 13)) {
            try {
                ainz.f69302b = new aint(str, str2, aiof.m57538a(ainz.f69301a));
            } catch (IOException e) {
                throw new RuntimeException(String.format("Failed to start a Wifi AP with SSID %s because we couldn't get the IP address.", str), e);
            }
        } else {
            throw new RuntimeException(String.format("Failed to start a Wifi AP with SSID %s because setting the AP state failed.", str));
        }
    }
}
