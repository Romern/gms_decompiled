package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import com.google.android.gms.ads.internal.flag.C0397j;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: com.google.android.gms.ads.internal.util.client.g */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0632g {

    /* renamed from: a */
    public static final Object f8963a = new Object();

    /* renamed from: b */
    public static boolean f8964b = false;

    /* renamed from: c */
    public static boolean f8965c = false;

    /* renamed from: d */
    private static final Set f8966d = new HashSet(Arrays.asList(new String[0]));

    /* renamed from: e */
    private final List f8967e;

    public C0632g() {
        this(null);
    }

    /* renamed from: a */
    public static void m5651a(JsonWriter jsonWriter, Map map) {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                if (!f8966d.contains(str)) {
                    if (!(entry.getValue() instanceof List)) {
                        if (!(entry.getValue() instanceof String)) {
                            C0633h.m5668b("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value((String) entry.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String str2 : (List) entry.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name("name").value(str);
                            jsonWriter.name("value").value(str2);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    /* renamed from: b */
    private final void m5655b(String str, String str2, Map map, byte[] bArr) {
        m5652a("onNetworkRequest", new C0627b(str, str2, map, bArr));
    }

    /* renamed from: c */
    private static synchronized void m5656c(String str) {
        synchronized (C0632g.class) {
            C0633h.m5670c("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                String valueOf = String.valueOf(str.substring(i, Math.min(i2, str.length())));
                C0633h.m5670c(valueOf.length() == 0 ? new String("GMA Debug CONTENT ") : "GMA Debug CONTENT ".concat(valueOf));
                i = i2;
            }
            C0633h.m5670c("GMA Debug FINISH");
        }
    }

    public C0632g(String str) {
        List list;
        if (!m5653a()) {
            list = new ArrayList();
        } else {
            String uuid = UUID.randomUUID().toString();
            if (str == null) {
                String[] strArr = new String[1];
                String valueOf = String.valueOf(uuid);
                strArr[0] = valueOf.length() == 0 ? new String("network_request_") : "network_request_".concat(valueOf);
                list = Arrays.asList(strArr);
            } else {
                String[] strArr2 = new String[2];
                strArr2[0] = str.length() == 0 ? new String("ad_request_") : "ad_request_".concat(str);
                String valueOf2 = String.valueOf(uuid);
                strArr2[1] = valueOf2.length() == 0 ? new String("network_request_") : "network_request_".concat(valueOf2);
                list = Arrays.asList(strArr2);
            }
        }
        this.f8967e = list;
    }

    /* renamed from: b */
    public final void mo6816b(String str) {
        m5652a("onNetworkRequestError", new C0630e(str));
    }

    /* renamed from: a */
    private final void m5652a(String str, C0631f fVar) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(System.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String str2 : this.f8967e) {
                jsonWriter.value(str2);
            }
            jsonWriter.endArray();
            fVar.mo6809a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            C0633h.m5669b("unable to log", e);
        }
        m5656c(stringWriter.toString());
    }

    /* renamed from: a */
    public static boolean m5653a() {
        boolean z;
        synchronized (f8963a) {
            z = false;
            if (f8964b && f8965c) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m5654a(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (!((Boolean) C0397j.f8338a.mo6621a()).booleanValue()) {
            return false;
        }
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            C0633h.m5673d("Fail to determine debug setting.", e);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo6810a(String str) {
        if (m5653a() && str != null) {
            mo6815a(str.getBytes());
        }
    }

    /* renamed from: a */
    public final void mo6811a(String str, String str2, Map map, byte[] bArr) {
        if (m5653a()) {
            m5655b(str, str2, map, bArr);
        }
    }

    /* renamed from: a */
    public final void mo6812a(HttpURLConnection httpURLConnection, int i) {
        HashMap hashMap;
        if (m5653a()) {
            String str = null;
            if (httpURLConnection.getHeaderFields() != null) {
                hashMap = new HashMap(httpURLConnection.getHeaderFields());
            } else {
                hashMap = null;
            }
            mo6814a(hashMap, i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    String valueOf = String.valueOf(e.getMessage());
                    C0633h.m5672d(valueOf.length() == 0 ? new String("Can not get error message from error HttpURLConnection\n") : "Can not get error message from error HttpURLConnection\n".concat(valueOf));
                }
                mo6816b(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo6813a(HttpURLConnection httpURLConnection, byte[] bArr) {
        HashMap hashMap;
        if (m5653a()) {
            if (httpURLConnection.getRequestProperties() != null) {
                hashMap = new HashMap(httpURLConnection.getRequestProperties());
            } else {
                hashMap = null;
            }
            m5655b(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), hashMap, bArr);
        }
    }

    /* renamed from: a */
    public final void mo6814a(Map map, int i) {
        m5652a("onNetworkResponse", new C0628c(i, map));
    }

    /* renamed from: a */
    public final void mo6815a(byte[] bArr) {
        m5652a("onNetworkResponseBody", new C0629d(bArr));
    }
}
