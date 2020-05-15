package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.felicanetworks.cmnctrl.net.DataParser;
import com.google.android.gms.common.api.Status;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: wac */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wac extends aaab {

    /* renamed from: a */
    private final String f50316a;

    /* renamed from: b */
    private final Bundle f50317b;

    /* renamed from: c */
    private HttpURLConnection f50318c;

    /* renamed from: d */
    private final brsm f50319d;

    public wac(brsm brsm, String str, Bundle bundle) {
        super(131, "CreateShortDynamicLink");
        this.f50319d = brsm;
        this.f50316a = str;
        this.f50317b = bundle;
    }

    /* renamed from: a */
    private static final String m41655a(InputStream inputStream) {
        if (inputStream != null) {
            return new String(srz.m36178b(inputStream), "UTF-8");
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        Uri uri;
        JSONObject jSONObject;
        ArrayList arrayList;
        Uri uri2;
        Uri uri3;
        if (cdrt.f181617a.mo6606a().mo78227c()) {
            try {
                Bundle bundle = this.f50317b;
                Uri uri4 = (Uri) bundle.getParcelable("dynamicLink");
                if (TextUtils.isEmpty(bundle.getString("domainUriPrefix"))) {
                    if (uri4 == null) {
                        throw new IllegalArgumentException("FDL domain is missing. Set with setDomainUriPrefix() or setDynamicLinkDomain().");
                    }
                }
                uri = (Uri) bundle.getParcelable("dynamicLink");
                if (uri == null) {
                    Uri.Builder builder = new Uri.Builder();
                    Uri parse = Uri.parse(bundle.getString("domainUriPrefix"));
                    builder.scheme(parse.getScheme());
                    builder.authority(parse.getAuthority());
                    builder.path(parse.getPath());
                    Bundle bundle2 = bundle.getBundle("parameters");
                    for (String str : bundle2.keySet()) {
                        Object obj = bundle2.get(str);
                        if (obj != null) {
                            builder.appendQueryParameter(str, obj.toString());
                        }
                    }
                    uri = builder.build();
                }
            } catch (IllegalArgumentException e) {
                uri = null;
            }
            if (uri != null) {
                try {
                    shr.m35316b((int) AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES);
                    URL url = new URL(String.format(cdrt.f181617a.mo6606a().mo78228d(), this.f50317b.getString("apiKey")));
                    if (this.f50318c == null) {
                        this.f50318c = (HttpURLConnection) url.openConnection();
                    }
                    this.f50318c.setRequestMethod(DataParser.CONNECT_TYPE_POST);
                    this.f50318c.setRequestProperty("Content-Type", "application/json");
                    this.f50318c.setRequestProperty("Accept", "application/json");
                    this.f50318c.setRequestProperty("X-Android-Package", this.f50316a);
                    this.f50318c.setRequestProperty("X-Android-Cert", spn.m35895h(context, this.f50316a));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("longDynamicLink", uri.toString());
                    if (this.f50317b.containsKey("suffix")) {
                        int i = this.f50317b.getInt("suffix");
                        String str2 = i != 1 ? i != 2 ? null : "SHORT" : "UNGUESSABLE";
                        if (str2 != null) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("option", str2);
                            jSONObject2.put("suffix", jSONObject3);
                        }
                    }
                    this.f50318c.setDoOutput(true);
                    DataOutputStream dataOutputStream = new DataOutputStream(this.f50318c.getOutputStream());
                    dataOutputStream.writeBytes(jSONObject2.toString());
                    dataOutputStream.close();
                    if (this.f50318c.getResponseCode() < 200 || this.f50318c.getResponseCode() > 299) {
                        brsm brsm = this.f50319d;
                        String responseMessage = this.f50318c.getResponseMessage();
                        String a = m41655a(this.f50318c.getErrorStream());
                        int i2 = 7;
                        if (!TextUtils.isEmpty(a) && (jSONObject = new JSONObject(a).getJSONObject("error")) != null && jSONObject.has("code") && jSONObject.has("message")) {
                            i2 = jSONObject.getInt("code");
                            responseMessage = jSONObject.getString("message");
                        }
                        brsm.mo69838a(new Status(i2, responseMessage), (ShortDynamicLinkImpl) null);
                        return;
                    }
                    JSONObject jSONObject4 = new JSONObject(m41655a(this.f50318c.getInputStream()));
                    String string = jSONObject4.getString("shortLink");
                    String string2 = jSONObject4.getString("previewLink");
                    if (jSONObject4.has("warning")) {
                        JSONArray jSONArray = jSONObject4.getJSONArray("warning");
                        arrayList = new ArrayList(jSONArray.length());
                        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                            arrayList.add(new ShortDynamicLinkImpl.WarningImpl(jSONArray.getJSONObject(i3).getString("warningMessage")));
                        }
                    } else {
                        arrayList = null;
                    }
                    if (string != null) {
                        uri2 = Uri.parse(string);
                    } else {
                        uri2 = null;
                    }
                    if (string2 != null) {
                        uri3 = Uri.parse(string2);
                    } else {
                        uri3 = null;
                    }
                    this.f50319d.mo69838a(Status.f30107a, new ShortDynamicLinkImpl(uri2, uri3, arrayList));
                } catch (IOException | JSONException e2) {
                    bqye.m113758a(e2);
                    this.f50319d.mo69838a(Status.f30109c, (ShortDynamicLinkImpl) null);
                }
            } else {
                this.f50319d.mo69838a(Status.f30109c, (ShortDynamicLinkImpl) null);
            }
        } else {
            this.f50319d.mo69838a(Status.f30109c, (ShortDynamicLinkImpl) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f50319d.mo69838a(status, (ShortDynamicLinkImpl) null);
    }
}
