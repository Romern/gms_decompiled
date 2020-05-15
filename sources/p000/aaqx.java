package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.concurrent.Executor;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

/* renamed from: aaqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaqx {

    /* renamed from: a */
    public static final Random f28952a = new Random();

    /* renamed from: d */
    private static final bmyx f28953d = bmyx.m108640a(10);

    /* renamed from: e */
    private static final bmyx f28954e = bmyx.m108640a('=').mo66921b(2);

    /* renamed from: b */
    final Executor f28955b = sne.m35694a((int) cecz.f182285a.mo6606a().mo78795N(), 10);

    /* renamed from: c */
    public final PriorityQueue f28956c = new PriorityQueue();

    /* renamed from: f */
    private final Context f28957f;

    /* renamed from: g */
    private final aakw f28958g;

    /* renamed from: h */
    private final aaqs f28959h;

    /* renamed from: i */
    private final Object f28960i = new Object();

    /* renamed from: j */
    private long f28961j;

    /* renamed from: k */
    private int f28962k;

    /* renamed from: l */
    private final abop f28963l;

    public aaqx(Context context, abop abop, aakw aakw, aaqs aaqs, aalt aalt) {
        this.f28957f = context.getApplicationContext();
        this.f28963l = abop;
        this.f28958g = aakw;
        this.f28959h = aaqs;
        aalt.mo16978a(0, new aaqu(this));
        aalt.mo16978a(1, new aaqv(this));
    }

    /* renamed from: a */
    private final void m21835a(aara aara, String str, boolean z) {
        int i;
        if (z) {
            if (str.equals("SERVICE_NOT_AVAILABLE") || str.equals("AUTHENTICATION_FAILED")) {
                int H = (int) cecz.f182285a.mo6606a().mo78789H();
                if (H != 0) {
                    synchronized (this.f28960i) {
                        int i2 = this.f28962k;
                        if (i2 == 0) {
                            i = ((int) cecz.f182285a.mo6606a().mo78792K()) + f28952a.nextInt(1000);
                            this.f28962k = i;
                        } else {
                            i = i2 + i2;
                            this.f28962k = i;
                        }
                        this.f28962k = Math.min(i, H);
                        this.f28961j = System.currentTimeMillis() + ((long) this.f28962k);
                    }
                }
            } else {
                mo17193a();
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("error", str);
        aara.mo17198a(this.f28957f, bundle);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aaqx.a(aara, java.lang.String, boolean):void
     arg types: [aara, java.lang.String, int]
     candidates:
      aaqx.a(java.util.List, java.lang.String, java.lang.String):void
      aaqx.a(aara, java.lang.String, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0234, code lost:
        if (r3 != 401) goto L_0x0236;
     */
    /* renamed from: b */
    public final boolean mo17197b(aara aara) {
        long currentTimeMillis;
        long j;
        String str;
        String str2;
        int i = aara.f28967c;
        if ((i == 0 || i == 1) && TextUtils.isEmpty(aara.f28969e.getString("sender"))) {
            Log.w("GCM", "Invalid parameter sender");
            m21835a(aara, "INVALID_PARAMETERS", false);
            return false;
        } else if (!this.f28958g.mo16953a()) {
            m21835a(aara, "AUTHENTICATION_FAILED", false);
            return false;
        } else if (!TextUtils.isEmpty(cecz.m136054b())) {
            synchronized (this.f28960i) {
                currentTimeMillis = System.currentTimeMillis();
                j = this.f28961j;
            }
            if (currentTimeMillis > j) {
                HttpPost httpPost = new HttpPost(cecz.m136054b());
                ArrayList arrayList = new ArrayList();
                for (String str3 : aara.f28969e.keySet()) {
                    String string = aara.f28969e.getString(str3);
                    if (TextUtils.isEmpty(string)) {
                        String valueOf = String.valueOf(str3);
                        Log.w("GCM", valueOf.length() == 0 ? new String("Ignoring registration extra: ") : "Ignoring registration extra: ".concat(valueOf));
                    } else {
                        if (!"sender".equals(str3)) {
                            String valueOf2 = String.valueOf(str3);
                            str3 = valueOf2.length() == 0 ? new String("X-") : "X-".concat(valueOf2);
                        }
                        arrayList.add(new BasicNameValuePair(str3, string));
                    }
                }
                for (Map.Entry entry : aara.f28970f.entrySet()) {
                    arrayList.add(new BasicNameValuePair((String) entry.getKey(), (String) entry.getValue()));
                }
                m21836a(arrayList, "app", aara.f28968d.f28457a);
                m21836a(arrayList, "device", this.f28958g.mo16954b());
                int i2 = aara.f28968d.f28458b;
                if (i2 != 0) {
                    m21836a(arrayList, "device_user_id", String.valueOf(i2));
                }
                m21836a(arrayList, "app_ver", Integer.toString(aakw.m21416b(this.f28957f, aara.f28968d.f28457a)));
                m21836a(arrayList, "info", aakw.m21414a(this.f28957f));
                m21836a(arrayList, "gcm_ver", "201515033");
                m21836a(arrayList, "plat", "0");
                try {
                    PackageInfo b = aara.f28968d.mo17017b(aakb.m21381a().f28351l, 64);
                    String a = spn.m35850a(b);
                    if (a != null) {
                        str2 = a.toLowerCase(Locale.US);
                    } else {
                        str2 = null;
                    }
                    m21836a(arrayList, "cert", str2);
                    m21836a(arrayList, "target_ver", String.valueOf(b.applicationInfo.targetSdkVersion));
                } catch (PackageManager.NameNotFoundException e) {
                }
                int a2 = (int) cedf.f182384a.mo6606a().mo78879a();
                if (a2 == 2 || (a2 == 1 && aara.f28968d.f28458b == 0)) {
                    adgs a3 = adee.m50253a(aakb.m21381a().f28351l.mo17012b(aara.f28968d.f28458b));
                    String str4 = aara.f28968d.f28457a;
                    int i3 = Build.VERSION.SDK_INT;
                    if (a3.f61606a.getPackageManager().isInstantApp(str4)) {
                        if (cedf.f182384a.mo6606a().mo78880b()) {
                            m21836a(arrayList, "android_instant_app", Boolean.toString(true));
                        } else {
                            m21835a(aara, "SERVICE_NOT_AVAILABLE", false);
                            return false;
                        }
                    }
                }
                String b2 = this.f28958g.mo16954b();
                String c = this.f28958g.mo16955c();
                if (!(b2 == null || c == null)) {
                    StringBuilder sb = new StringBuilder(b2.length() + 10 + c.length());
                    sb.append("AidLogin ");
                    sb.append(b2);
                    sb.append(":");
                    sb.append(c);
                    httpPost.addHeader("Authorization", sb.toString());
                }
                httpPost.addHeader("app", aara.f28968d.f28457a);
                httpPost.addHeader("gcm_ver", "201515033");
                try {
                    httpPost.setEntity(new UrlEncodedFormEntity(arrayList));
                    try {
                        shr.m35316b(1031);
                        HttpResponse execute = this.f28963l.execute(httpPost);
                        int statusCode = execute.getStatusLine().getStatusCode();
                        if (statusCode != 200) {
                            if (statusCode == 403) {
                            }
                            m21835a(aara, "AUTHENTICATION_FAILED", true);
                            shr.m35312a();
                            return false;
                        }
                        String entityUtils = EntityUtils.toString(execute.getEntity(), "UTF-8");
                        shr.m35312a();
                        Iterable<String> a4 = f28953d.mo66918a((CharSequence) entityUtils);
                        C1245ok okVar = new C1245ok();
                        for (String str5 : a4) {
                            List c2 = f28954e.mo66925c((CharSequence) str5);
                            if (c2.size() > 1) {
                                okVar.put((String) c2.get(0), (String) c2.get(1));
                            } else {
                                String valueOf3 = String.valueOf(str5);
                                if (valueOf3.length() == 0) {
                                    new String("Unexpected result: ");
                                } else {
                                    "Unexpected result: ".concat(valueOf3);
                                }
                            }
                        }
                        if (okVar.containsKey("token")) {
                            mo17193a();
                            Bundle bundle = new Bundle();
                            bundle.putString("registration_id", (String) okVar.get("token"));
                            aara.mo17198a(this.f28957f, bundle);
                            if (aara.mo17199a() == 0) {
                                this.f28959h.f28943b.mo17025a(aara.f28968d, 2);
                            }
                            this.f28959h.mo17188a(this);
                            return true;
                        } else if (okVar.containsKey("deleted")) {
                            mo17193a();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("unregistered", aara.f28968d.f28457a);
                            aara.mo17198a(this.f28957f, bundle2);
                            return true;
                        } else {
                            if (entityUtils != null && entityUtils.startsWith("Error=")) {
                                str = entityUtils.substring(6);
                                if (str.endsWith("\n")) {
                                    str = str.substring(0, str.length() - 1);
                                }
                            } else {
                                str = "SERVICE_NOT_AVAILABLE";
                            }
                            m21835a(aara, str, true);
                            return false;
                        }
                    } catch (IOException e2) {
                        m21835a(aara, "SERVICE_NOT_AVAILABLE", true);
                    } catch (Throwable th) {
                        shr.m35312a();
                        throw th;
                    }
                } catch (UnsupportedEncodingException e3) {
                    m21835a(aara, "INVALID_PARAMETERS", false);
                    return false;
                }
            } else {
                m21835a(aara, "SERVICE_NOT_AVAILABLE", false);
                return false;
            }
        } else {
            m21835a(aara, "SERVICE_DISABLED", false);
            return false;
        }
    }

    /* renamed from: a */
    private static final void m21836a(List list, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            list.add(new BasicNameValuePair(str, str2));
        }
    }

    /* renamed from: a */
    public final void mo17193a() {
        synchronized (this.f28960i) {
            this.f28961j = 0;
            this.f28962k = 0;
        }
    }

    /* renamed from: a */
    public final void mo17194a(aalr aalr) {
        mo17195a(new aaqy(aalr.f28414c, aalr.f28415d, Collections.emptyMap(), aalr));
    }

    /* renamed from: a */
    public final void mo17195a(aara aara) {
        synchronized (this) {
            this.f28956c.offer(aara);
        }
        this.f28955b.execute(new aaqw(this));
    }

    /* renamed from: a */
    public final void mo17196a(Runnable runnable) {
        this.f28955b.execute(runnable);
    }
}
