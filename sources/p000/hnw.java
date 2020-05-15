package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Base64;
import com.android.volley.NetworkResponse;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.common.internal.ClientContext;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.zip.GZIPInputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: hnw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hnw {

    /* renamed from: a */
    private static final Logger f20093a = ght.m13172b("CredentialsApiHelper");

    /* renamed from: b */
    private final Context f20094b;

    @Deprecated
    public hnw(Context context) {
        sdo.m34959a(context);
        this.f20094b = context;
    }

    /* renamed from: a */
    public static adbe m14662a(VolleyError volleyError) {
        byte[] bArr;
        byte[] bArr2;
        if (!(volleyError instanceof ServerError)) {
            adbd a = adbe.m50105a();
            a.f61232a = "Network error.";
            a.f61234c = 7;
            a.f61233b = volleyError;
            return a.mo33301a();
        }
        NetworkResponse networkResponse = volleyError.networkResponse;
        String str = null;
        if (!(networkResponse == null || (bArr = networkResponse.data) == null)) {
            if (srz.m36173a(bArr)) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(networkResponse.data);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    byte[] bArr3 = new byte[1024];
                    while (true) {
                        try {
                            int read = gZIPInputStream.read(bArr3);
                            if (read < 0) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr3, 0, read);
                        } catch (IOException e) {
                            try {
                                gZIPInputStream.close();
                            } catch (IOException e2) {
                                f20093a.mo25417e("Error closing gzip stream", e2, new Object[0]);
                            }
                        } catch (Throwable th) {
                            try {
                                gZIPInputStream.close();
                            } catch (IOException e3) {
                                f20093a.mo25417e("Error closing gzip stream", e3, new Object[0]);
                            }
                            throw th;
                        }
                    }
                    bArr2 = byteArrayOutputStream.toByteArray();
                    try {
                        gZIPInputStream.close();
                    } catch (IOException e4) {
                        f20093a.mo25417e("Error closing gzip stream", e4, new Object[0]);
                    }
                } catch (IOException e5) {
                    f20093a.mo25417e("Unable to gzip decode error response", e5, new Object[0]);
                }
            } else {
                bArr2 = networkResponse.data;
            }
            try {
                str = new String(bArr2, "UTF-8");
            } catch (UnsupportedEncodingException e6) {
                f20093a.mo25419f("UTF-8 encoding not supported!?", e6, new Object[0]);
            }
        }
        if (str != null) {
            try {
                String string = new JSONObject(str).getJSONObject("error").getString("message");
                if ("CUSTOM_PASSPHRASE".equals(string)) {
                    adbd a2 = adbe.m50105a();
                    a2.f61232a = "The current user is a custom passphrase user.";
                    a2.f61234c = 28402;
                    a2.f61233b = volleyError;
                    return a2.mo33301a();
                } else if ("NOT_A_SYNC_USER".equals(string)) {
                    adbd a3 = adbe.m50105a();
                    a3.f61232a = "The current user is not a ChromeSync user.";
                    a3.f61234c = 28403;
                    a3.f61233b = volleyError;
                    return a3.mo33301a();
                } else if ("RATE_LIMIT_EXCEEDED".equals(string)) {
                    adbd a4 = adbe.m50105a();
                    a4.f61232a = "Request throttled.";
                    a4.f61234c = 28401;
                    a4.f61233b = volleyError;
                    return a4.mo33301a();
                } else {
                    adbd a5 = adbe.m50105a();
                    String valueOf = String.valueOf(string);
                    a5.f61232a = valueOf.length() == 0 ? new String("Unknown error code: ") : "Unknown error code: ".concat(valueOf);
                    a5.f61234c = 28404;
                    a5.f61233b = volleyError;
                    return a5.mo33301a();
                }
            } catch (JSONException e7) {
                adbd a6 = adbe.m50105a();
                a6.f61232a = "Unable to parse the error.";
                a6.f61234c = 28404;
                a6.f61233b = volleyError;
                return a6.mo33301a();
            }
        } else {
            adbd a7 = adbe.m50105a();
            a7.f61232a = "Unable to extract network response data.";
            a7.f61234c = 28404;
            a7.f61233b = volleyError;
            return a7.mo33301a();
        }
    }

    /* renamed from: a */
    public static hnw m14663a(Context context) {
        return new hnw(context);
    }

    /* renamed from: a */
    public final bytr mo12638a(String str) {
        bxvd da = bytr.f167707e.mo74144da();
        String num = Integer.toString(201515033);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bytr bytr = (bytr) da.f164949b;
        num.getClass();
        bytr.f167709a |= 1;
        bytr.f167710b = num;
        if (str != null) {
            String host = Uri.parse(str).getHost();
            if (host != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bytr bytr2 = (bytr) da.f164949b;
                host.getClass();
                bytr2.f167709a |= 4;
                bytr2.f167712d = host;
            }
            Context context = this.f20094b;
            String host2 = Uri.parse(str).getHost();
            String str2 = null;
            if (host2 != null) {
                try {
                    byte[] c = spn.m35875c(context, host2, "SHA1");
                    if (c != null) {
                        str2 = Base64.encodeToString(c, 2);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                }
            }
            if (str2 == null) {
                throw new IllegalStateException(str.length() == 0 ? new String("Cannot construct request header for unknown app") : "Cannot construct request header for unknown app".concat(str));
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bytr bytr3 = (bytr) da.f164949b;
            str2.getClass();
            bytr3.f167709a |= 2;
            bytr3.f167711c = str2;
        }
        return (bytr) da.mo74062i();
    }

    /* renamed from: a */
    public final IdToken mo12639a(acyr acyr, String str, String str2, String str3) {
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        try {
            bxvd da = bytn.f167686h.mo74144da();
            bytr a = mo12638a(str);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bytn bytn = (bytn) da.f164949b;
            a.getClass();
            bytn.f167689b = a;
            int i = bytn.f167688a | 1;
            bytn.f167688a = i;
            str.getClass();
            int i2 = i | 2;
            bytn.f167688a = i2;
            bytn.f167690c = str;
            String str4 = acyr.f61088b;
            str4.getClass();
            int i3 = i2 | 4;
            bytn.f167688a = i3;
            bytn.f167691d = str4;
            if (str2 != null) {
                str2.getClass();
                i3 |= 32;
                bytn.f167688a = i3;
                bytn.f167694g = str2;
            }
            if (str3 != null) {
                str3.getClass();
                bytn.f167688a = i3 | 16;
                bytn.f167693f = str3;
            }
            iee a2 = mo12641a();
            ClientContext a3 = mo12640a(acyr);
            bytn bytn2 = (bytn) da.mo74062i();
            sgv sgv = a2.f20793a;
            StringBuilder sb = new StringBuilder();
            sb.append("/idToken?alt=proto");
            if (!(bytn2 == null || (bytn2.f167688a & 1) == 0)) {
                bytr bytr = bytn2.f167689b;
                if (bytr == null) {
                    bytr = bytr.f167707e;
                }
                if ((bytr.f167709a & 1) != 0) {
                    sb.append("&header.playServicesVersion=");
                    bytr bytr2 = bytn2.f167689b;
                    if (bytr2 == null) {
                        bytr2 = bytr.f167707e;
                    }
                    sb.append(shd.m35267a(bytr2.f167710b));
                }
            }
            if (!(bytn2 == null || (bytn2.f167688a & 1) == 0)) {
                bytr bytr3 = bytn2.f167689b;
                if (bytr3 == null) {
                    bytr3 = bytr.f167707e;
                }
                if ((bytr3.f167709a & 2) != 0) {
                    sb.append("&header.certificateSha1=");
                    bytr bytr4 = bytn2.f167689b;
                    if (bytr4 == null) {
                        bytr4 = bytr.f167707e;
                    }
                    sb.append(shd.m35267a(bytr4.f167711c));
                }
            }
            if (!(bytn2 == null || (bytn2.f167688a & 1) == 0)) {
                bytr bytr5 = bytn2.f167689b;
                if (bytr5 == null) {
                    bytr5 = bytr.f167707e;
                }
                if ((bytr5.f167709a & 4) != 0) {
                    sb.append("&header.packageName=");
                    bytr bytr6 = bytn2.f167689b;
                    if (bytr6 == null) {
                        bytr6 = bytr.f167707e;
                    }
                    sb.append(shd.m35267a(bytr6.f167712d));
                }
            }
            if (!(bytn2 == null || (bytn2.f167688a & 2) == 0)) {
                sb.append("&url=");
                sb.append(shd.m35267a(bytn2.f167690c));
            }
            if (!(bytn2 == null || (bytn2.f167688a & 4) == 0)) {
                sb.append("&email=");
                sb.append(shd.m35267a(bytn2.f167691d));
            }
            if (!(bytn2 == null || (bytn2.f167688a & 8) == 0)) {
                sb.append("&profileConsented=");
                sb.append(bytn2.f167692e);
            }
            if (!(bytn2 == null || (bytn2.f167688a & 16) == 0)) {
                sb.append("&nonce=");
                sb.append(shd.m35267a(bytn2.f167693f));
            }
            if (!(bytn2 == null || (bytn2.f167688a & 32) == 0)) {
                sb.append("&audience=");
                sb.append(shd.m35267a(bytn2.f167694g));
            }
            return new IdToken("https://accounts.google.com", ((byto) sgv.mo25513a(a3, 0, sb.toString(), (byte[]) null, byto.f167695b)).f167697a);
        } catch (VolleyError e) {
            throw m14662a(e);
        } catch (gid e2) {
            throw adbe.m50107a(e2);
        }
    }

    /* renamed from: a */
    public final ClientContext mo12640a(acyr acyr) {
        int i = this.f20094b.getApplicationInfo().uid;
        String str = acyr.f61088b;
        String packageName = this.f20094b.getPackageName();
        ClientContext clientContext = new ClientContext(i, str, str, packageName, packageName);
        clientContext.mo17806d((String) hfe.f19642d.mo58455c());
        return clientContext;
    }

    /* renamed from: a */
    public final iee mo12641a() {
        return new iee(new sgv(this.f20094b, (String) hfe.f19639a.mo58455c(), (String) hfe.f19640b.mo58455c(), false, false, (String) hfe.f19641c.mo58455c(), null));
    }
}
