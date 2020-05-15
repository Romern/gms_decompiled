package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import android.webkit.URLUtil;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.Felica;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import org.chromium.net.CronetEngine;

/* renamed from: shl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class shl extends sgw {

    /* renamed from: a */
    private String f44479a;

    /* renamed from: b */
    public volatile chsz f44480b;

    /* renamed from: c */
    public volatile chtr f44481c;

    /* renamed from: d */
    public boolean f44482d;

    /* renamed from: e */
    public final shn f44483e;

    /* renamed from: f */
    public String f44484f;

    /* renamed from: g */
    private int f44485g;

    /* renamed from: h */
    private SSLSocketFactory f44486h;

    /* renamed from: j */
    private int f44487j;

    /* renamed from: k */
    private int f44488k;

    /* renamed from: l */
    private final Object f44489l;

    /* renamed from: m */
    private final CronetEngine f44490m;

    public shl(Context context) {
        this(context, cbri.m128137g(), (int) cbri.f178135a.mo6606a().mo75272v(), context.getApplicationInfo().uid, 4102, (CronetEngine) ffy.m11632b().mo66815c());
        mo25556a("Accept-Language", fgd.m11651b());
        if (!bmxx.m108577a(cbri.m128136f())) {
            mo25556a("X-Server-Token", cbri.m128136f());
        }
    }

    /* renamed from: a */
    public final chqo mo25551a(long j, TimeUnit timeUnit) {
        if (j >= 0 && timeUnit != null) {
            return chqo.f189006a.mo85544a(j, timeUnit).mo85547a(this.f44484f);
        }
        return chqo.f189006a.mo85547a(this.f44484f);
    }

    /* renamed from: b */
    public final void mo25558b() {
        if (this.f44480b != null) {
            this.f44480b.mo85626e();
        }
    }

    /* renamed from: e */
    public final chtr mo25560e(ClientContext clientContext) {
        Map map;
        if (clientContext == null) {
            return this.f44481c;
        }
        Bundle bundle = clientContext.f30219i.getBundle("binary_headers");
        if (bundle == null || bundle.keySet().isEmpty()) {
            map = Collections.emptyMap();
        } else {
            map = new HashMap();
            for (String str : bundle.keySet()) {
                map.put(str, ByteString.m123261a(bundle.getByteArray(str)));
            }
        }
        if (map.isEmpty()) {
            return this.f44481c;
        }
        chtr chtr = new chtr();
        if (this.f44481c != null) {
            chtr.mo85649a(this.f44481c);
        }
        for (Map.Entry entry : map.entrySet()) {
            chtr.mo85648a(chtn.m149536a((String) entry.getKey(), chtr.f189133a), ((ByteString) entry.getValue()).getKey());
        }
        return chtr;
    }

    /* renamed from: g */
    public final void mo25561g() {
        if (this.f44480b != null) {
            this.f44480b.mo85624c();
        }
    }

    /* renamed from: b */
    public final void mo25559b(String str) {
        if (this.f44481c != null) {
            synchronized (this) {
                this.f44481c.mo85656d(chtn.m149535a(str, chtr.f189134b));
            }
        }
    }

    /* renamed from: a */
    public final chtv mo25552a(chtv chtv) {
        String str;
        chsz chsz;
        try {
            Context context = this.f44453i;
            shu shu = new shu(chtv, this.f44479a);
            SSLSocketFactory sSLSocketFactory = this.f44486h;
            String str2 = shu.f44505b;
            chtv chtv2 = shu.f44504a;
            StringBuilder sb = new StringBuilder();
            if (sSLSocketFactory == null) {
                str = "http://";
            } else {
                str = "https://";
            }
            sb.append(str);
            sb.append(str2);
            sb.append("/");
            sb.append(chtv2.f189150b);
            String sb2 = sb.toString();
            Bundle a = new abox(context).mo32269a(sb2);
            if (a != null) {
                if (a.getString("block") != null) {
                    String string = a.getString("name");
                    StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 13 + String.valueOf(sb2).length());
                    sb3.append("Blocked by ");
                    sb3.append(string);
                    sb3.append(": ");
                    sb3.append(sb2);
                    Log.w("GrpcServerHelper", sb3.toString());
                    chuv chuv = chuv.f189229p;
                    String valueOf = String.valueOf(a.getString("name"));
                    throw new chuw(chuv.mo85687a(valueOf.length() == 0 ? new String("Blocked by rule: ") : "Blocked by rule: ".concat(valueOf)));
                }
                String trim = a.getString("rewrite").trim();
                if (trim != null) {
                    if (URLUtil.isHttpUrl(trim) || URLUtil.isHttpsUrl(trim)) {
                        Uri parse = Uri.parse(trim);
                        str2 = parse.getAuthority();
                        String path = parse.getPath();
                        if (path.startsWith("/")) {
                            path = path.substring(1);
                        }
                        if (!chtv2.f189150b.equalsIgnoreCase(path)) {
                            chtv2 = chtv.m149566a(chtv2.f189149a, path, chtv2.f189152d, chtv2.f189153e);
                        }
                    }
                }
            }
            shu shu2 = new shu(chtv2, str2);
            String str3 = shu2.f44505b;
            if (this.f44480b == null || !this.f44479a.equalsIgnoreCase(str3)) {
                synchronized (this.f44489l) {
                    if (this.f44480b == null || !this.f44479a.equalsIgnoreCase(str3)) {
                        this.f44479a = str3;
                        CronetEngine cronetEngine = this.f44490m;
                        if (cronetEngine == null) {
                            Context context2 = this.f44453i;
                            String str4 = this.f44479a;
                            int i = this.f44485g;
                            int i2 = this.f44487j;
                            int i3 = this.f44488k;
                            SSLSocketFactory sSLSocketFactory2 = this.f44486h;
                            cifv b = cifv.m150191b(str4, i);
                            sdo.m34959a(sSLSocketFactory2);
                            b.sslSocketFactory(sSLSocketFactory2);
                            b.transportExecutor(new shs(i2, i3));
                            if (cdln.f181201a.mo6606a().mo77865a()) {
                                chvj chvj = new chvj(b);
                                if (cdln.f181201a.mo6606a().mo77866b()) {
                                    chvj.f189267a = context2.getApplicationContext();
                                }
                                chsz = chvj.mo85581b();
                            } else {
                                chsz = b.mo85581b();
                            }
                            this.f44480b = chsz;
                        } else {
                            int i4 = this.f44485g;
                            int i5 = this.f44487j;
                            int i6 = this.f44488k;
                            chvz a2 = chvz.m149656a(str3, i4, cronetEngine);
                            a2.mo85718b(i5);
                            a2.mo85717a(shr.m35311a(i6));
                            this.f44480b = a2.mo85581b();
                        }
                    }
                }
            }
            return shu2.f44504a;
        } catch (VolleyError e) {
            return chtv;
        }
    }

    public shl(Context context, String str, int i, int i2, int i3) {
        this(context, str, i, i2, i3, (CronetEngine) null);
    }

    public shl(Context context, String str, int i, int i2, int i3, CronetEngine cronetEngine) {
        super(context);
        this.f44489l = new Object();
        boolean z = true;
        this.f44482d = true;
        this.f44479a = str;
        this.f44485g = i;
        if (shv.f44506a == null) {
            synchronized (shv.class) {
                if (shv.f44506a == null) {
                    shv.f44506a = new shv();
                }
            }
        }
        shv shv = shv.f44506a;
        if (cronetEngine == null) {
            mo25557a(apto.m70980a((int) Felica.MAX_TIMEOUT, context));
        }
        this.f44487j = i2;
        this.f44488k = i3;
        this.f44483e = shn.f44491a;
        this.f44490m = cronetEngine;
        if (cronetEngine == null && this.f44486h == null) {
            z = false;
        }
        sdo.m34970a(z);
    }

    public shl(Context context, String str, int i, int i2, int i3, byte[] bArr) {
        this(context, str, i, i2, i3);
        mo25556a("X-Goog-Api-Key", "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
        mo25556a("X-Android-Package", context.getPackageName());
        mo25556a("X-Android-Cert", spn.m35895h(context, context.getPackageName()));
    }

    public shl(Context context, byte[] bArr) {
        this(context, (String) aseh.f88762a.mo58455c(), ((Integer) aseh.f88763b.mo58455c()).intValue(), -1, 9472);
        mo25556a("X-Goog-Api-Key", "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
        mo25556a("X-Android-Package", context.getPackageName());
        mo25556a("X-Android-Cert", spn.m35895h(context, context.getPackageName()));
    }

    public shl(Context context, char[] cArr) {
        this(context, cewm.f183477a.mo6606a().geocoderServerName(), 443, Binder.getCallingUid(), 1544);
        mo25556a("X-Goog-Api-Key", "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
        mo25556a("X-Android-Package", context.getPackageName());
        mo25556a("X-Android-Cert", spn.m35895h(context, context.getPackageName()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x0038] */
    /* renamed from: a */
    public final Object mo25553a(chtv chtv, ClientContext clientContext, Object obj, long j, TimeUnit timeUnit) {
        Object a;
        shn shn;
        ClientContext clientContext2 = clientContext;
        Object obj2 = obj;
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        chtv a2 = mo25552a(chtv);
        sdo.checkIfNull(this.f44480b, "grpc channel is null, cannot make grpc request");
        try {
            String d = mo25529d(clientContext2);
            String c = mo25528c(clientContext2);
            chtr e = mo25560e(clientContext2);
            chqp a3 = shv.m35322a(this.f44453i, this.f44480b, d, c, e, this.f44482d);
            chuv chuv = chuv.f189215b;
            chuv chuv2 = null;
            try {
                a = shv.m35323a(a3, a2, obj2, mo25551a(j2, timeUnit2));
                this.f44483e.mo25565a(a2, chuv);
                shn = this.f44483e;
            } catch (RuntimeException e2) {
                if (!this.f44482d || chuv.f189223j.f189233s != chuv.m149608a(e2).f189233s) {
                    throw e2;
                }
                chuv2 = chuv.m149608a(e2);
                try {
                    a = shv.m35323a(shv.m35322a(this.f44453i, this.f44480b, mo25529d(clientContext2), c, e, false), a2, obj2, mo25551a(j2, timeUnit2));
                    this.f44483e.mo25565a(a2, chuv);
                    if (chuv2 != null) {
                        this.f44483e.mo25565a(a2, chuv2);
                    }
                    shn = this.f44483e;
                } catch (VolleyError e3) {
                    throw new chuw(chuv.f189229p.mo85687a("IOException when getting auth token").mo85692c(e3));
                } catch (RuntimeException e4) {
                    e = e4;
                    try {
                        chuv a4 = chuv.m149608a(e);
                        if (Log.isLoggable("BaseGrpcServer", 3)) {
                            Log.d("BaseGrpcServer", "Exception for gRPC call", e);
                        }
                        throw a4.mo85693c();
                    } catch (Throwable th) {
                        th = th;
                        this.f44483e.mo25565a(a2, chuv);
                        if (chuv2 != null) {
                            this.f44483e.mo25565a(a2, chuv2);
                        }
                        this.f44483e.mo25564a();
                        throw th;
                    }
                }
            } catch (RuntimeException e5) {
                e = e5;
            } catch (Throwable th2) {
            }
            shn.mo25564a();
            return a;
        } catch (VolleyError e6) {
            throw new chuw(chuv.f189229p.mo85687a("IOException when getting auth token").mo85692c(e6));
        }
    }

    /* renamed from: a */
    public final Object mo25554a(chtv chtv, Object obj, long j, TimeUnit timeUnit) {
        chtv a = mo25552a(chtv);
        sdo.checkIfNull(this.f44480b, "grpc channel is null, cannot make grpc request");
        chqp a2 = shv.m35322a(this.f44453i, this.f44480b, null, null, this.f44481c, false);
        chuv chuv = chuv.f189215b;
        try {
            Object a3 = shv.m35323a(a2, a, obj, mo25551a(j, timeUnit));
            this.f44483e.mo25565a(a, chuv);
            this.f44483e.mo25564a();
            return a3;
        } catch (RuntimeException e) {
            chuv = chuv.m149608a(e);
            if (Log.isLoggable("BaseGrpcServer", 3)) {
                Log.d("BaseGrpcServer", "Exception for gRPC call", e);
            }
            throw chuv.mo85693c();
        } catch (Throwable th) {
            th = th;
            this.f44483e.mo25565a(a, chuv);
            this.f44483e.mo25564a();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo25555a(chtv chtv, ClientContext clientContext, Object obj, ciiv ciiv, long j, TimeUnit timeUnit) {
        chtv a = mo25552a(chtv);
        shk shk = new shk(this, ciiv, a);
        sdo.checkIfNull(this.f44480b, "grpc channel is null, cannot make grpc request");
        try {
            String d = mo25529d(clientContext);
            try {
                ciiq.m150398a(shv.m35322a(this.f44453i, this.f44480b, d, mo25528c(clientContext), mo25560e(clientContext), this.f44482d).mo70053a(a, mo25551a(j, timeUnit)), obj, shk);
            } catch (RuntimeException e) {
                if (Log.isLoggable("BaseGrpcServer", 3)) {
                    Log.d("BaseGrpcServer", "Exception for gRPC call", e);
                }
                throw chuv.m149608a(e).mo85693c();
            }
        } catch (VolleyError e2) {
            throw new chuw(chuv.f189229p.mo85687a("IOException when getting auth token").mo85692c(e2));
        }
    }

    /* renamed from: a */
    public final void mo25556a(String str, String str2) {
        if (this.f44481c == null) {
            synchronized (this) {
                if (this.f44481c == null) {
                    this.f44481c = new chtr();
                }
            }
        }
        synchronized (this) {
            this.f44481c.mo85648a(chtn.m149535a(str, chtr.f189134b), str2);
        }
    }

    /* renamed from: a */
    public final void mo25557a(SSLSocketFactory sSLSocketFactory) {
        sdo.m34959a(sSLSocketFactory);
        byte[][] bArr = {"h2".getBytes()};
        int i = 0;
        for (char c = 0; c <= 0; c = 1) {
            int length = bArr[0].length;
            if (length == 0 || length > 255) {
                StringBuilder sb = new StringBuilder(44);
                sb.append("s.length == 0 || s.length > 255: ");
                sb.append(length);
                throw new IllegalArgumentException(sb.toString());
            }
            i += length + 1;
        }
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (char c2 = 0; c2 <= 0; c2 = 1) {
            byte[] bArr3 = bArr[0];
            int length2 = bArr3.length;
            bArr2[i2] = (byte) length2;
            i2++;
            int i3 = 0;
            while (i3 < length2) {
                bArr2[i2] = bArr3[i3];
                i3++;
                i2++;
            }
        }
        ((apto) sSLSocketFactory).f84861c = bArr2;
        this.f44486h = sSLSocketFactory;
    }
}
