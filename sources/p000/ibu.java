package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ibu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ibu extends sji {

    /* renamed from: d */
    private static final AtomicInteger f20697d = new AtomicInteger(0);

    /* renamed from: a */
    protected final RequestQueue f20698a = rpr.m34216b().getAuthChannelBoundApiaryRequestQueue();

    /* renamed from: e */
    private final ClientContext f20699e;

    /* renamed from: f */
    private final hxq f20700f;

    /* renamed from: g */
    private final ProxyRequest f20701g;

    /* renamed from: h */
    private bofs f20702h;

    /* renamed from: i */
    private iei f20703i;

    /* renamed from: j */
    private qws f20704j;

    /* renamed from: k */
    private sie f20705k;

    public ibu(ClientContext clientContext, hxq hxq, ProxyRequest proxyRequest) {
        super(16, "PerformProxyRequestOperation");
        this.f20699e = clientContext;
        this.f20700f = hxq;
        this.f20701g = proxyRequest;
        if (clientContext.mo17811f()) {
            this.f20705k = new sie(clientContext);
        }
    }

    /* renamed from: a */
    private final void m15209a(Context context, int i, int i2, Intent intent) {
        PendingIntent pendingIntent;
        if (intent != null) {
            try {
                pendingIntent = PendingIntent.getActivity(context, f20697d.getAndIncrement(), intent, 134217728);
            } catch (RemoteException e) {
                return;
            }
        } else {
            pendingIntent = null;
        }
        this.f20700f.mo12788a(new ProxyResponse(i, pendingIntent, i2, null));
    }

    /* renamed from: a */
    public final void mo11357a(Status status) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0335, code lost:
        if (r5.f164950c == false) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0338, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x033e, code lost:
        r6 = (p000.bofs) r5.f164949b;
        r6.f132939a |= 1;
        r6.f132940b = r3;
        r3 = (p000.bofs) r5.mo74062i();
        r1.f20702h = r3;
        mo12900a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0355, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0380, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0381, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        m15209a(r2, 3005, -1, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x038e, code lost:
        if (r5.f164950c == false) goto L_0x0390;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0391, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0397, code lost:
        r3 = (p000.bofs) r5.f164949b;
        r3.f132947i = 5;
        r3.f132939a |= 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03a4, code lost:
        r3 = android.os.SystemClock.elapsedRealtime() - r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03ab, code lost:
        if (r5.f164950c == false) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03b1, code lost:
        if (r5.f164950c == false) goto L_0x03b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03b4, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03ba, code lost:
        r3 = (p000.bofs) r5.f164949b;
        r3.f132947i = 4;
        r3.f132939a |= 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03c7, code lost:
        r3 = android.os.SystemClock.elapsedRealtime() - r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03ce, code lost:
        if (r5.f164950c == false) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03f8, code lost:
        if (r5.f164950c != false) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03fc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03fd, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        r4 = r3.f20681b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0400, code lost:
        if (r4 == null) goto L_0x0402;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0402, code lost:
        m15209a(r2, 0, r3.f20680a, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:?, code lost:
        r1.f20700f.mo12788a(new com.google.android.gms.auth.api.proxy.ProxyResponse(1, 0, null, r3.f20680a, com.google.android.gms.auth.api.proxy.ProxyResponse.m6411a(r4.headers), r4.data));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0429, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0443, code lost:
        if (r5.f164950c != false) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0471, code lost:
        if (r5.f164950c != false) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x04a3, code lost:
        if (r5.f164950c != false) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x04a7, code lost:
        r8 = android.os.SystemClock.elapsedRealtime() - r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x04ae, code lost:
        if (r5.f164950c != false) goto L_0x04b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04b1, code lost:
        r5.mo74035c();
        r5.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04b7, code lost:
        r4 = (p000.bofs) r5.f164949b;
        r4.f132939a |= 1;
        r4.f132940b = r8;
        r4 = (p000.bofs) r5.mo74062i();
        r1.f20702h = r4;
        mo12900a(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04cf, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        android.util.Log.w("AuthChimeraService", "Exception while getting app cert is being ignored.");
        r11 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0384 A[ExcHandler: SecurityException (e java.lang.SecurityException), Splitter:B:17:0x00b1] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03ae A[ExcHandler: RemoteException (e android.os.RemoteException), Splitter:B:17:0x00b1] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03fc A[ExcHandler: ibl (r0v2 'e' ibl A[CUSTOM_DECLARE]), Splitter:B:17:0x00b1] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0428 A[Catch:{ gid | IOException -> 0x019e, ibl -> 0x03fc, RemoteException -> 0x03ae, SecurityException -> 0x0384, all -> 0x0380 }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0429 A[Catch:{ gid | IOException -> 0x019e, ibl -> 0x03fc, RemoteException -> 0x03ae, SecurityException -> 0x0384, all -> 0x0380 }] */
    /* renamed from: a */
    public final void mo11356a(Context context) {
        long elapsedRealtime;
        String str;
        ProxyResponse proxyResponse;
        int i;
        Context context2 = context;
        bxvd da = bofs.f132937j.mo74144da();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        try {
            URI uri = new URI(this.f20701g.f10303b);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            String path = uri.getPath();
            StringBuilder sb = new StringBuilder(String.valueOf(scheme).length() + 3 + String.valueOf(host).length() + String.valueOf(path).length());
            sb.append(scheme);
            sb.append("://");
            sb.append(host);
            sb.append(path);
            String sb2 = sb.toString();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bofs bofs = (bofs) da.f164949b;
            sb2.getClass();
            bofs.f132939a |= 4;
            bofs.f132942d = sb2;
        } catch (URISyntaxException e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("AuthChimeraService", valueOf.length() == 0 ? new String("Request url with UriSyntaxException: ") : "Request url with UriSyntaxException: ".concat(valueOf));
        }
        String str2 = this.f20699e.f30216f;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bofs bofs2 = (bofs) da.f164949b;
        str2.getClass();
        bofs2.f132939a |= 2;
        bofs2.f132941c = str2;
        try {
            if (Log.isLoggable("AuthChimeraService", 4)) {
                String valueOf2 = String.valueOf(this.f20701g);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
                sb3.append("Executing request: ");
                sb3.append(valueOf2);
                Log.i("AuthChimeraService", sb3.toString());
            }
            if (this.f20699e.mo17811f()) {
                str = this.f20705k.mo25586b(context2);
                String g = this.f20699e.mo17812g();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bofs bofs3 = (bofs) da.f164949b;
                g.getClass();
                bofs3.f132939a |= 16;
                bofs3.f132944f = g;
            } else {
                str = null;
            }
            if (imy.m15745a(ccei.f178831a.mo6606a().mo75831b()).mo13153b(this.f20701g.f10303b)) {
                ProxyRequest proxyRequest = this.f20701g;
                LinkedHashMap linkedHashMap = new LinkedHashMap(proxyRequest.f10307f.size());
                for (String str3 : proxyRequest.f10307f.keySet()) {
                    linkedHashMap.put(str3, proxyRequest.f10307f.getString(str3));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(Collections.unmodifiableMap(linkedHashMap));
                if (str != null) {
                    String valueOf3 = String.valueOf(str);
                    linkedHashMap2.put("Authorization", valueOf3.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf3));
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bofs bofs4 = (bofs) da.f164949b;
                    bofs4.f132939a |= 32;
                    bofs4.f132945g = true;
                }
                String str4 = this.f20699e.f30216f;
                iei iei = new iei(context2);
                this.f20703i = iei;
                String str5 = iei.mo12952a(str4);
                if (str5 != null) {
                    linkedHashMap2.put("X-Goog-Spatula", str5);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bofs bofs5 = (bofs) da.f164949b;
                    bofs5.f132939a |= 64;
                    bofs5.f132946h = true;
                }
                RequestFuture newFuture = RequestFuture.newFuture();
                ProxyRequest proxyRequest2 = this.f20701g;
                this.f20698a.add(new ibm(proxyRequest2.f10304c, proxyRequest2.f10303b, newFuture, newFuture, linkedHashMap2, proxyRequest2.f10306e, this.f20699e.f30212b));
                proxyResponse = (ProxyResponse) newFuture.get();
                int i2 = proxyResponse.f10311d;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bofs bofs6 = (bofs) da.f164949b;
                bofs6.f132939a |= 8;
                bofs6.f132943e = i2;
                if (Log.isLoggable("AuthChimeraService", 4)) {
                    Log.i("AuthChimeraService", "Executing send connection operation");
                }
                this.f20700f.mo12788a(proxyResponse);
                elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
            } else {
                String str6 = this.f20701g.f10303b;
                StringBuilder sb4 = new StringBuilder(String.valueOf(str6).length() + 48);
                sb4.append("The supplied url [ ");
                sb4.append(str6);
                sb4.append(" ] is not a valid Google url!");
                throw new SecurityException(sb4.toString());
            }
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof VolleyError) {
                VolleyError volleyError = (VolleyError) cause;
                NetworkResponse networkResponse = volleyError.networkResponse;
                if (networkResponse != null) {
                    String str7 = new String(networkResponse.data, "UTF-8");
                    if (Log.isLoggable("AuthChimeraService", 4)) {
                        Log.i("AuthChimeraService", str7.length() == 0 ? new String("Error description received from server: ") : "Error description received from server: ".concat(str7));
                    }
                    int i3 = volleyError.networkResponse.statusCode;
                    if (i3 == 401) {
                        i = 3000;
                    } else if (i3 != 403) {
                        int i4 = i3 / 100;
                        if (i4 == 4) {
                            i = 3002;
                        } else if (i4 != 5) {
                            StringBuilder sb5 = new StringBuilder(35);
                            sb5.append("Response code received: ");
                            sb5.append(i3);
                            Log.e("AuthChimeraService", sb5.toString());
                            i = 10;
                        } else {
                            i = 3003;
                        }
                    } else {
                        i = 3001;
                    }
                    int i5 = volleyError.networkResponse.statusCode;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bofs bofs7 = (bofs) da.f164949b;
                    bofs7.f132939a |= 8;
                    bofs7.f132943e = i5;
                    if (i == 3000) {
                        gie.m13192a(context2, str);
                    }
                    throw new ibl(str7, i, volleyError.networkResponse);
                } else if (volleyError instanceof NetworkError) {
                    proxyResponse = new ProxyResponse(7, null, -1, null);
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bofs bofs8 = (bofs) da.f164949b;
                    bofs8.f132947i = 7;
                    bofs8.f132939a |= 128;
                }
            }
            Log.w("AuthChimeraService", "ExecutionException for cause.", cause);
            proxyResponse = new ProxyResponse(13, null, -1, null);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bofs bofs9 = (bofs) da.f164949b;
            bofs9.f132947i = 7;
            bofs9.f132939a |= 128;
        } catch (InterruptedException e3) {
            Log.w("AuthChimeraService", e3);
            proxyResponse = new ProxyResponse(14, null, -1, null);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bofs bofs10 = (bofs) da.f164949b;
            bofs10.f132947i = 6;
            bofs10.f132939a |= 128;
        } catch (UserRecoverableAuthException e4) {
            UserRecoverableAuthException userRecoverableAuthException = e4;
            Log.e("AuthChimeraService", "Token error");
            m15209a(context2, 3004, -1, userRecoverableAuthException.mo7366a());
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bofs bofs11 = (bofs) da.f164949b;
            bofs11.f132947i = 0;
            bofs11.f132939a |= 128;
            elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
        } catch (gid e5) {
            Log.e("AuthChimeraService", "Token error");
            m15209a(context2, 3004, -1, null);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bofs bofs12 = (bofs) da.f164949b;
            bofs12.f132947i = 1;
            bofs12.f132939a |= 128;
            elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
        } catch (ibl e6) {
        } catch (IOException e7) {
            m15209a(context2, 7, -1, null);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bofs bofs13 = (bofs) da.f164949b;
            bofs13.f132947i = 3;
            bofs13.f132939a |= 128;
            elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
        } catch (RemoteException e8) {
        } catch (SecurityException e9) {
        }
        if (da.f164950c) {
        }
        bofs bofs14 = (bofs) da.f164949b;
        bofs14.f132947i = 2;
        bofs14.f132939a |= 128;
        elapsedRealtime = SystemClock.elapsedRealtime() - elapsedRealtime2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo12900a(Context context, bofs bofs) {
        if (((double) new Random().nextFloat()) < ccei.f178831a.mo6606a().mo75830a()) {
            this.f20704j = new qws(context, "ANDROID_AUTH", null);
            bxvd da = boct.f132600I.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            boct boct = (boct) da.f164949b;
            boct.f132612c = 14;
            int i = boct.f132610a | 1;
            boct.f132610a = i;
            bofs.getClass();
            boct.f132622m = bofs;
            boct.f132610a = i | 8192;
            this.f20704j.mo24335a(((boct) da.mo74062i()).mo73642k()).mo24327b();
        }
    }
}
