package p000;

import android.content.Context;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Locale;

/* renamed from: xav */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xav {

    /* renamed from: b */
    public static final Logger f51828b = new Logger(new String[]{"AppIdCache"}, (short[]) null);

    /* renamed from: a */
    public final xax f51829a;

    public xav(Context context) {
        this.f51829a = new xax(context);
    }

    /* renamed from: b */
    public static long m42577b() {
        Logger Logger = xbh.f51873b;
        HttpURLConnection httpURLConnection = (HttpURLConnection) xbh.f51872a.mo29778a();
        httpURLConnection.setRequestMethod("HEAD");
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            long headerFieldDate = httpURLConnection.getHeaderFieldDate("Date", 0);
            if (headerFieldDate == 0) {
                String valueOf = String.valueOf(httpURLConnection.getHeaderField("Date"));
                throw new IOException(valueOf.length() == 0 ? new String("Got missing or invalid date from header value ") : "Got missing or invalid date from header value ".concat(valueOf));
            }
            xbh.f51873b.mo25412b(String.format(Locale.US, "Got date value %d", Long.valueOf(headerFieldDate)), new Object[0]);
            return headerFieldDate;
        }
        Logger logger2 = xbh.f51873b;
        Locale locale = Locale.US;
        Integer valueOf2 = Integer.valueOf(responseCode);
        logger2.mo25412b(String.format(locale, "URL %s returned %d", xbh.f51872a, valueOf2), new Object[0]);
        throw new IOException(String.format(Locale.US, "HTTP status code %d", valueOf2));
    }

    /* renamed from: a */
    public final void mo29590a() {
        xax xax = this.f51829a;
        xax.f51830b.mo25412b("close", new Object[0]);
        xax.f51831a.close();
    }
}
