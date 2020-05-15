package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.fido.fido2.api.common.BrowserRequestOptions;
import com.google.android.gms.fido.fido2.api.common.RequestOptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xbg {

    /* renamed from: c */
    private static final Logger f51869c = new Logger(new String[]{"IncomingRequestRpIdValidator"}, (short[]) null);

    /* renamed from: a */
    private final Context f51870a;

    /* renamed from: b */
    private final xbi f51871b;

    public xbg(Context context) {
        xba xba = new xba();
        xbi xbi = new xbi();
        bmxy.m108581a(context);
        this.f51870a = context;
        bmxy.m108581a(xba);
        bmxy.m108581a(xbi);
        this.f51871b = xbi;
    }

    /* renamed from: a */
    public final bmxv mo29606a(RequestOptions requestOptions, String str) {
        boolean z;
        bmxv bmxv;
        String str2;
        HttpURLConnection httpURLConnection;
        String d = xez.m42803d(requestOptions);
        boolean c = xez.m42802c(requestOptions);
        if (d.startsWith("https://") || d.startsWith("http://")) {
            f51869c.mo25418e("The rpId should not have a scheme", new Object[0]);
            return bmvz.f131120a;
        } else if (!c) {
            String valueOf = String.valueOf(d);
            String str3 = valueOf.length() == 0 ? new String("https://") : "https://".concat(valueOf);
            if (str3.startsWith("https://") || str3.startsWith("http://")) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34976b(z, "Website URL %s does not start with https:// or http://", str3);
            StringBuilder sb = new StringBuilder();
            sb.append("https://digitalassetlinks.googleapis.com/v1/assetlinks:check?source.web.site=");
            sb.append(str3);
            sb.append("&relation=");
            sb.append(cduv.f181788a.mo6606a().mo78357a());
            sb.append("&target.android_app.package_name=");
            sb.append(str);
            try {
                bmxv a = xbj.m42600a(str);
                if (a.mo66813a()) {
                    bmxv = bmxv.m108566b(srv.m36162b(((ByteBuffer) a.mo66814b()).array()));
                } else {
                    bmxv = bmvz.f131120a;
                }
            } catch (PackageManager.NameNotFoundException e) {
                bmxv = bmvz.f131120a;
            }
            String str4 = null;
            if (!bmxv.mo66813a()) {
                xba.f51852a.mo25418e("Error when computing the package signature [package name=%s].", str);
                str2 = null;
            } else {
                sb.append("&target.android_app.certificate.sha256_fingerprint=");
                sb.append((String) bmxv.mo66814b());
                sb.append("&key=API_KEY");
                str2 = sb.toString();
            }
            if (str2 != null) {
                xba.f51852a.mo25412b(str2.length() == 0 ? new String("Digital Asset Links REST API Request URL: ") : "Digital Asset Links REST API Request URL: ".concat(str2), new Object[0]);
                try {
                    httpURLConnection = (HttpURLConnection) stp.m36306a(new URL(str2), 4096);
                    if (httpURLConnection == null) {
                        xba.f51852a.mo25418e("HTTP URL connection is null", new Object[0]);
                    } else {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (inputStream != null) {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, bmwy.f131158c));
                            StringBuilder sb2 = new StringBuilder();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                sb2.append(readLine);
                                sb2.append("\n");
                            }
                            bufferedReader.close();
                            String sb3 = sb2.toString();
                            stp.m36307a(httpURLConnection);
                            str4 = sb3;
                        } else {
                            xba.f51852a.mo25418e("Input stream from HTTP connection is null", new Object[0]);
                            stp.m36307a(httpURLConnection);
                        }
                    }
                } catch (IOException e2) {
                    xba.f51852a.mo25418e("URL connection to Digital Asset Links API wasn't successful", new Object[0]);
                } catch (Throwable th) {
                    stp.m36307a(httpURLConnection);
                    throw th;
                }
                if (str4 != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(str4);
                        if (!jSONObject.has("linked")) {
                            xba.f51852a.mo25418e("JSON Object doesn't have linked key", new Object[0]);
                        } else if (jSONObject.getBoolean("linked")) {
                            return bmxv.m108567c(this.f51871b.mo29608a(str));
                        }
                    } catch (JSONException e3) {
                        xba.f51852a.mo25418e("Error parsing String into JSON Object", new Object[0]);
                    }
                } else {
                    xba.f51852a.mo25418e("Couldn't verify the association because response is null", new Object[0]);
                }
            } else {
                xba.f51852a.mo25418e("Couldn't verify the association because request URL is null", new Object[0]);
            }
            return bmvz.f131120a;
        } else if (str.equals("com.google.android.gms")) {
            f51869c.mo25412b("BrowserRequest allowed: caller is another GmsCore module", new Object[0]);
            return bmxv.m108566b(this.f51871b.mo29607a((BrowserRequestOptions) requestOptions));
        } else {
            bmxv b = xbj.m42601b(str);
            if (b.mo66813a()) {
                return xaz.m42591a(this.f51870a, str, (ByteBuffer) b.mo66814b()) ? bmxv.m108566b(this.f51871b.mo29607a((BrowserRequestOptions) requestOptions)) : bmvz.f131120a;
            }
            f51869c.mo25418e("Unable to get the signature for package %s.", str);
            return bmvz.f131120a;
        }
    }
}
