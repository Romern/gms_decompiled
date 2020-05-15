package p000;

import com.felicanetworks.cmnctrl.net.DataParser;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: icn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class icn implements Runnable {

    /* renamed from: a */
    private static final sek f20742a = new sek("RevokeAccessOperation", new String[0]);

    /* renamed from: b */
    private final String f20743b;

    /* renamed from: c */
    private final rou f20744c = new rou((rkb) null);

    public icn(String str) {
        sdo.m34977c(str);
        this.f20743b = str;
    }

    /* renamed from: a */
    public static rke m15234a(String str) {
        if (str == null) {
            Status status = new Status(4);
            sdo.m34966a(status, "Result must not be null");
            sdo.m34975b(!status.mo17710c(), "Status code must not be SUCCESS");
            rkf rkf = new rkf(status);
            rkf.mo17716a(status);
            return rkf;
        }
        icn icn = new icn(str);
        new Thread(icn).start();
        return icn.f20744c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
    public final void run() {
        Status status = Status.f30109c;
        try {
            String str = this.f20743b;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str.length() == 0 ? new String("https://accounts.google.com/o/oauth2/revoke?token=") : "https://accounts.google.com/o/oauth2/revoke?token=".concat(str)).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", DataParser.CONTENT_TYPE_VALUE);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                f20742a.mo25418e("Unable to revoke access!", new Object[0]);
            } else {
                status = Status.f30107a;
            }
            try {
                sek sek = f20742a;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Response Code: ");
                sb.append(responseCode);
                sek.mo25412b(sb.toString(), new Object[0]);
            } catch (IOException e) {
                e = e;
            } catch (Exception e2) {
                e = e2;
                sek sek2 = f20742a;
                String valueOf = String.valueOf(e.toString());
                sek2.mo25418e(valueOf.length() != 0 ? new String("Exception when revoking access: ") : "Exception when revoking access: ".concat(valueOf), new Object[0]);
                this.f20744c.mo17716a(status);
            }
        } catch (IOException e3) {
            e = e3;
            sek sek3 = f20742a;
            String valueOf2 = String.valueOf(e.toString());
            sek3.mo25418e(valueOf2.length() == 0 ? new String("IOException when revoking access: ") : "IOException when revoking access: ".concat(valueOf2), new Object[0]);
            this.f20744c.mo17716a(status);
        } catch (Exception e4) {
            e = e4;
            sek sek22 = f20742a;
            String valueOf3 = String.valueOf(e.toString());
            sek22.mo25418e(valueOf3.length() != 0 ? new String("Exception when revoking access: ") : "Exception when revoking access: ".concat(valueOf3), new Object[0]);
            this.f20744c.mo17716a(status);
        }
        this.f20744c.mo17716a(status);
    }
}
