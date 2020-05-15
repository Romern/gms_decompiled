package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.felicanetworks.mfc.Felica;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.client.C0341h;
import com.google.android.gms.ads.internal.config.C0371o;
import com.google.android.gms.ads.internal.flag.C0396i;
import com.google.android.gms.ads.internal.flag.C0405r;
import com.google.android.gms.ads.internal.reward.C0573a;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.internal.util.o */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0658o {

    /* renamed from: a */
    public static final adzt f9012a = new C0641f(Looper.getMainLooper());

    /* renamed from: b */
    public final Object f9013b = new Object();

    /* renamed from: c */
    public String f9014c;

    /* renamed from: d */
    public boolean f9015d = false;

    /* renamed from: e */
    private final AtomicReference f9016e = new AtomicReference(null);

    /* renamed from: f */
    private final AtomicReference f9017f = new AtomicReference(null);

    /* renamed from: a */
    private static int m5697a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        throw new IllegalArgumentException("Invalid Hex.");
    }

    /* renamed from: c */
    static final String m5703c() {
        StringBuilder sb = new StringBuilder((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(Build.VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append("; ");
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    /* renamed from: b */
    public final WebResourceResponse mo6859b(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("User-Agent", C0387d.m5363a().mo6860b(context, str));
            hashMap.put("Cache-Control", "max-stale=3600");
            new C0610ah(context);
            String str3 = (String) C0610ah.m5613a(str2, hashMap).get(60, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
            return null;
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            C0633h.m5673d("Could not fetch MRAID JS.", e);
            return null;
        }
    }

    /* renamed from: a */
    protected static final String m5698a(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable th) {
            return m5703c();
        }
    }

    /* renamed from: a */
    private final JSONArray m5699a(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : collection) {
            m5700a(jSONArray, obj);
        }
        return jSONArray;
    }

    /* renamed from: a */
    private final void m5700a(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(mo6848a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(mo6849a((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(m5699a((Collection) obj));
        } else if (obj instanceof Object[]) {
            JSONArray jSONArray2 = new JSONArray();
            for (Object obj2 : (Object[]) obj) {
                m5700a(jSONArray2, obj2);
            }
            jSONArray.put(jSONArray2);
        } else {
            jSONArray.put(obj);
        }
    }

    /* renamed from: b */
    public final String mo6860b(Context context, String str) {
        synchronized (this.f9013b) {
            String str2 = this.f9014c;
            if (str2 != null) {
                return str2;
            }
            if (str == null) {
                String c = m5703c();
                return c;
            }
            try {
                this.f9014c = C0387d.m5364b().mo6868a(context);
            } catch (Exception e) {
            }
            if (TextUtils.isEmpty(this.f9014c)) {
                if (!C0341h.m5274a().mo6806a()) {
                    this.f9014c = null;
                    f9012a.post(new C0654l(this, context));
                    while (this.f9014c == null) {
                        try {
                            this.f9013b.wait();
                        } catch (InterruptedException e2) {
                            String c2 = m5703c();
                            this.f9014c = c2;
                            String valueOf = String.valueOf(c2);
                            C0633h.m5672d(valueOf.length() == 0 ? new String("Interrupted, use default user agent: ") : "Interrupted, use default user agent: ".concat(valueOf));
                        }
                    }
                } else {
                    this.f9014c = m5698a(context);
                }
            }
            String valueOf2 = String.valueOf(this.f9014c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 10 + str.length());
            sb.append(valueOf2);
            sb.append(" (Mobile; ");
            sb.append(str);
            this.f9014c = sb.toString();
            try {
                if (svr.m36484b(context).mo26173a()) {
                    this.f9014c = String.valueOf(this.f9014c).concat(";aia");
                }
            } catch (Exception e3) {
                C0387d.m5366d().mo6783a(e3, "AdUtil.getUserAgent");
            }
            String concat = String.valueOf(this.f9014c).concat(")");
            this.f9014c = concat;
            return concat;
        }
    }

    /* renamed from: a */
    private final void m5701a(JSONObject jSONObject, String str, Object obj) {
        if (obj instanceof Bundle) {
            jSONObject.put(str, mo6848a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, mo6849a((Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, m5699a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, m5699a(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: a */
    private static boolean m5702a(String str, AtomicReference atomicReference, String str2) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Pattern pattern = (Pattern) atomicReference.get();
                if (pattern != null) {
                    if (str2.equals(pattern.pattern())) {
                        return pattern.matcher(str).matches();
                    }
                }
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
                return pattern.matcher(str).matches();
            } catch (PatternSyntaxException e) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public final DisplayMetrics mo6843a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e  */
    /* renamed from: a */
    public final WebResourceResponse mo6844a(HttpURLConnection httpURLConnection) {
        String str;
        String str2;
        C0387d.m5363a();
        String contentType = httpURLConnection.getContentType();
        String str3 = "";
        if (!TextUtils.isEmpty(contentType)) {
            str = contentType.split(";")[0].trim();
        } else {
            str = str3;
        }
        C0387d.m5363a();
        String contentType2 = httpURLConnection.getContentType();
        if (!TextUtils.isEmpty(contentType2)) {
            String[] split = contentType2.split(";");
            if (split.length == 1) {
                str2 = str3;
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                HashMap hashMap = new HashMap(headerFields.size());
                for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                    if (!(entry.getKey() == null || entry.getValue() == null || entry.getValue().size() <= 0)) {
                        hashMap.put(entry.getKey(), entry.getValue().get(0));
                    }
                }
                return C0387d.m5364b().mo6871a(str, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            }
            int i = 1;
            while (true) {
                if (i >= split.length) {
                    break;
                }
                if (split[i].trim().startsWith("charset")) {
                    String[] split2 = split[i].trim().split("=");
                    if (split2.length > 1) {
                        str3 = split2[1].trim();
                        break;
                    }
                }
                i++;
            }
        }
        str2 = str3;
        Map<String, List<String>> headerFields2 = httpURLConnection.getHeaderFields();
        HashMap hashMap2 = new HashMap(headerFields2.size());
        while (r0.hasNext()) {
        }
        return C0387d.m5364b().mo6871a(str, str2, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap2, httpURLConnection.getInputStream());
    }

    /* renamed from: b */
    public final boolean mo6861b(String str) {
        return m5702a(str, this.f9017f, (String) C0371o.f8266s.mo6604a());
    }

    /* renamed from: b */
    public final int[] mo6862b() {
        return new int[]{0, 0};
    }

    /* renamed from: a */
    public final String mo6845a() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo6846a(InputStreamReader inputStreamReader) {
        StringBuilder sb = new StringBuilder(8192);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return sb.toString();
            }
            sb.append(cArr, 0, read);
        }
    }

    /* renamed from: a */
    public final Map mo6847a(Uri uri) {
        HashMap hashMap = null;
        if (!((Boolean) C0396i.f8336a.mo6621a()).booleanValue()) {
            if (uri != null) {
                hashMap = new HashMap();
                C0387d.m5364b();
                for (String str : uri.getQueryParameterNames()) {
                    hashMap.put(str, uri.getQueryParameter(str));
                }
            }
            return hashMap;
        } else if (uri == null) {
            return null;
        } else {
            HashMap hashMap2 = new HashMap(20);
            String encodedQuery = uri.getEncodedQuery();
            if (encodedQuery != null) {
                int length = encodedQuery.length();
                StringBuilder sb = new StringBuilder(100);
                StringBuilder sb2 = new StringBuilder(length);
                StringBuilder sb3 = sb;
                int i = 0;
                while (i < length) {
                    char charAt = encodedQuery.charAt(i);
                    if (charAt == '%') {
                        byte[] bArr = new byte[((length - i) / 3)];
                        int i2 = 0;
                        while (i < length - 2 && charAt == '%') {
                            try {
                                bArr[i2] = (byte) ((m5697a(encodedQuery.charAt(i + 1)) << 4) + m5697a(encodedQuery.charAt(i + 2)));
                                i2++;
                            } catch (IllegalArgumentException e) {
                            }
                            i += 3;
                            if (i < length) {
                                charAt = encodedQuery.charAt(i);
                            }
                        }
                        try {
                            sb3.append(new String(bArr, 0, i2, "UTF-8"));
                        } catch (UnsupportedEncodingException e2) {
                        }
                        if (charAt != '%') {
                        }
                    } else if (charAt == '&') {
                        if (sb.length() > 0 && sb3 != sb) {
                            hashMap2.put(sb.toString(), sb2.toString());
                            sb.setLength(0);
                            sb2.setLength(0);
                        }
                        sb3 = sb;
                    } else if (charAt == '+') {
                        sb3.append(' ');
                    } else if (charAt != '=') {
                        sb3.append(charAt);
                    } else if (sb3 == sb2) {
                        sb3.append(charAt);
                    } else {
                        sb3 = sb2;
                    }
                    i++;
                }
                if (sb.length() > 0 && sb3 != sb) {
                    hashMap2.put(sb.toString(), sb2.toString());
                }
            }
            return hashMap2;
        }
    }

    /* renamed from: a */
    public final JSONObject mo6848a(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m5701a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final JSONObject mo6849a(Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                m5701a(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new JSONException(valueOf.length() == 0 ? new String("Could not convert map to JSON: ") : "Could not convert map to JSON: ".concat(valueOf));
        }
    }

    /* renamed from: a */
    public final void mo6850a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable th) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public final void mo6851a(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(mo6860b(context, str));
    }

    /* renamed from: a */
    public final void mo6852a(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            new C0614al(context, str, (String) arrayList.get(i)).mo6801b();
        }
    }

    /* renamed from: a */
    public final void mo6853a(Context context, String str, String str2, Bundle bundle) {
        bundle.putString("device", C0387d.m5363a().mo6845a());
        bundle.putString("eids", TextUtils.join(",", C0371o.m5338a()));
        C0341h.m5274a();
        C0655m mVar = new C0655m(context, str);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            int i = rfj.f42871c;
            int j = rfy.m33553j(context);
            StringBuilder sb = new StringBuilder(23);
            sb.append(j);
            sb.append(".201515000");
            str = sb.toString();
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        C0387d.m5363a().mo6852a(mVar.f9010a, mVar.f9011b, appendQueryParameter.toString());
    }

    /* renamed from: a */
    public final void mo6854a(Context context, String str, HttpURLConnection httpURLConnection) {
        httpURLConnection.setConnectTimeout(Felica.MAX_TIMEOUT);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(Felica.MAX_TIMEOUT);
        httpURLConnection.setRequestProperty("User-Agent", mo6860b(context, str));
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: a */
    public final void mo6855a(Context context, Throwable th) {
        if (context != null) {
            try {
                if (((Boolean) C0405r.f8358a.mo6621a()).booleanValue()) {
                    sqx.m36053a(context, th);
                }
            } catch (IllegalStateException e) {
            }
        }
    }

    /* renamed from: a */
    public final boolean mo6856a(Context context, String str) {
        Context a = C0573a.m5575a(context);
        return svr.m36484b(a).mo26171a(str, a.getPackageName()) == 0;
    }

    /* renamed from: a */
    public final boolean mo6857a(String str) {
        return m5702a(str, this.f9016e, (String) C0371o.f8265r.mo6604a());
    }

    /* renamed from: a */
    public final int[] mo6858a(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        return (window == null || (findViewById = window.findViewById(16908290)) == null) ? mo6862b() : new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }
}
