package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: cec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cec implements cdt {

    /* renamed from: a */
    private final cjd f6601a;

    /* renamed from: b */
    private final int f6602b;

    /* renamed from: c */
    private HttpURLConnection f6603c;

    /* renamed from: d */
    private InputStream f6604d;

    /* renamed from: e */
    private volatile boolean f6605e;

    /* renamed from: a */
    private static int m4040a(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            return -1;
        }
    }

    /* renamed from: a */
    public final Class mo3747a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public final void mo3753b() {
        InputStream inputStream = this.f6604d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
        HttpURLConnection httpURLConnection = this.f6603c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f6603c = null;
    }

    /* renamed from: c */
    public final void mo3754c() {
        this.f6605e = true;
    }

    /* renamed from: d */
    public final int mo3755d() {
        return 2;
    }

    public cec(cjd cjd, int i) {
        this.f6601a = cjd;
        this.f6602b = i;
    }

    /* renamed from: a */
    private final InputStream m4041a(URL url, int i, URL url2, Map map) {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new ccw("In re-direct loop", -1);
                    }
                } catch (URISyntaxException e) {
                }
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpURLConnection.setConnectTimeout(this.f6602b);
                httpURLConnection.setReadTimeout(this.f6602b);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.f6603c = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.f6604d = this.f6603c.getInputStream();
                    if (this.f6605e) {
                        return null;
                    }
                    int a = m4040a(this.f6603c);
                    int i2 = a / 100;
                    if (i2 == 2) {
                        HttpURLConnection httpURLConnection2 = this.f6603c;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                this.f6604d = new cqr(httpURLConnection2.getInputStream(), (long) httpURLConnection2.getContentLength());
                            } else {
                                this.f6604d = httpURLConnection2.getInputStream();
                            }
                            return this.f6604d;
                        } catch (IOException e2) {
                            throw new ccw("Failed to obtain InputStream", m4040a(httpURLConnection2), e2);
                        }
                    } else if (i2 == 3) {
                        String headerField = this.f6603c.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField)) {
                            try {
                                URL url3 = new URL(url, headerField);
                                mo3753b();
                                return m4041a(url3, i + 1, url, map);
                            } catch (MalformedURLException e3) {
                                String valueOf = String.valueOf(headerField);
                                throw new ccw(valueOf.length() == 0 ? new String("Bad redirect url: ") : "Bad redirect url: ".concat(valueOf), a, e3);
                            }
                        } else {
                            throw new ccw("Received empty or null redirect url", a);
                        }
                    } else if (a != -1) {
                        try {
                            throw new ccw(this.f6603c.getResponseMessage(), a);
                        } catch (IOException e4) {
                            throw new ccw("Failed to get a response message", a, e4);
                        }
                    } else {
                        throw new ccw("Http request failed", -1);
                    }
                } catch (IOException e5) {
                    throw new ccw("Failed to connect or obtain data", m4040a(this.f6603c), e5);
                }
            } catch (IOException e6) {
                throw new ccw("URL.openConnection threw", 0, e6);
            }
        } else {
            throw new ccw("Too many (> 5) redirects!", -1);
        }
    }

    /* renamed from: a */
    public final void mo3751a(cbs cbs, cds cds) {
        cqw.m7370a();
        try {
            cjd cjd = this.f6601a;
            if (cjd.f6928f == null) {
                if (TextUtils.isEmpty(cjd.f6927e)) {
                    String str = cjd.f6926d;
                    if (TextUtils.isEmpty(str)) {
                        URL url = cjd.f6925c;
                        crb.m7382a(url);
                        str = url.toString();
                    }
                    cjd.f6927e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
                }
                cjd.f6928f = new URL(cjd.f6927e);
            }
            URL url2 = cjd.f6928f;
            cje cje = this.f6601a.f6924b;
            if (((cjh) cje).f6937c == null) {
                synchronized (cje) {
                    if (((cjh) cje).f6937c == null) {
                        HashMap hashMap = new HashMap();
                        for (Map.Entry entry : ((cjh) cje).f6936b.entrySet()) {
                            List list = (List) entry.getValue();
                            StringBuilder sb = new StringBuilder();
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                String str2 = ((cjg) list.get(i)).f6935a;
                                if (!TextUtils.isEmpty(str2)) {
                                    sb.append(str2);
                                    if (i != list.size() - 1) {
                                        sb.append(',');
                                    }
                                }
                            }
                            String sb2 = sb.toString();
                            if (!TextUtils.isEmpty(sb2)) {
                                hashMap.put((String) entry.getKey(), sb2);
                            }
                        }
                        ((cjh) cje).f6937c = Collections.unmodifiableMap(hashMap);
                    }
                }
            }
            cds.mo3762a(m4041a(url2, 0, null, ((cjh) cje).f6937c));
        } catch (IOException e) {
            cds.mo3761a((Exception) e);
        }
    }
}
