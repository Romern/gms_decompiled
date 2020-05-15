package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: agsv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agsv implements Callable {

    /* renamed from: a */
    public static final srn f66398a = srn.m36126a("MobileDataPlan", sgj.MOBILE_DATA_PLAN);

    /* renamed from: b */
    private final Context f66399b;

    /* renamed from: c */
    private final int f66400c;

    /* renamed from: d */
    private final long f66401d;

    /* renamed from: e */
    private String f66402e;

    /* renamed from: f */
    private Long f66403f;

    public agsv(Context context, Integer num) {
        this.f66399b = context;
        this.f66400c = num == null ? agrl.m54949c() : num.intValue();
        this.f66401d = agrl.m54947b();
    }

    /* renamed from: a */
    private final boolean m55059a(String str) {
        ConnectivityManager connectivityManager;
        agsu agsu;
        boolean z;
        try {
            int i = Build.VERSION.SDK_INT;
            if (agyq.m55280b(this.f66399b)) {
                if (!agyq.m55281c(this.f66399b)) {
                    return mo36069a(str, new URL(str).openConnection());
                }
            }
            connectivityManager = (ConnectivityManager) this.f66399b.getSystemService("connectivity");
            if (connectivityManager != null) {
                NetworkRequest.Builder builder = new NetworkRequest.Builder();
                builder.addCapability(12);
                if (!agyq.m55291l(this.f66399b)) {
                    builder.addTransportType(0);
                }
                agsu = new agsu(this, str);
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    connectivityManager.requestNetwork(builder.build(), agsu, (int) TimeUnit.SECONDS.toMillis(cfmv.m140316o() + 1));
                    try {
                        cfmv.m140316o();
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        agsu.f66395c.await();
                        IOException iOException = agsu.f66394b;
                        if (iOException == null) {
                            Boolean bool = agsu.f66396d;
                            if (bool != null) {
                                z = bool.booleanValue();
                            } else {
                                z = false;
                            }
                            connectivityManager.unregisterNetworkCallback(agsu);
                            return z;
                        }
                        throw iOException;
                    } catch (InterruptedException e) {
                        mo36068a(27045);
                        connectivityManager.unregisterNetworkCallback(agsu);
                        return false;
                    }
                } catch (SecurityException e2) {
                    bnsl bnsl = (bnsl) f66398a.mo68388c();
                    bnsl.mo68437a(e2);
                    bnsl.mo68420a("%s Permission denied while querying CPID endpoint", "BgTaskGetCpid:");
                    mo36068a(27047);
                    return false;
                }
            } else {
                mo36068a(27049);
                return false;
            }
        } catch (MalformedURLException e3) {
            bnsl bnsl2 = (bnsl) f66398a.mo68388c();
            bnsl2.mo68437a(e3);
            bnsl2.mo68424a("%s URL string %s cannot be converted to a URL", "BgTaskGetCpid:", str);
            mo36068a(27020);
            return false;
        } catch (IOException e4) {
            bnsl bnsl3 = (bnsl) f66398a.mo68388c();
            bnsl3.mo68437a(e4);
            bnsl3.mo68425a("%s Error connecting CPID endpoint. Message: %s\nURL: %s", "BgTaskGetCpid:", bryx.m114908a(e4.getMessage()), new bryx(2, str));
            mo36068a(27007);
            return false;
        } catch (Throwable th) {
            connectivityManager.unregisterNetworkCallback(agsu);
            throw th;
        }
    }

    public final /* bridge */ /* synthetic */ Object call() {
        String str = null;
        for (agzc agzc : agyq.m55295p(this.f66399b)) {
            if (agzc.mo36196d()) {
                str = agzc.mo36193a();
            }
        }
        boolean z = false;
        if (str != null) {
            this.f66402e = str;
            Long b = agpk.m54726a().mo35839b(str);
            this.f66403f = b;
            if (b == null) {
                mo36068a(27048);
            } else {
                btap c = agpk.m54726a().mo35841c(str);
                if (c == null || c.f148029a.isEmpty() || c.f148029a.get(0) == null) {
                    mo36068a(27006);
                } else {
                    z = m55059a((String) c.f148029a.get(0));
                }
            }
        } else {
            mo36068a(27019);
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final void mo36068a(long j) {
        agrl.m54942a().mo35989a(j, 0, this.f66400c, this.f66401d);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ba, code lost:
        r13 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e5, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e6, code lost:
        r1 = (p000.bnsl) p000.agsv.f66398a.mo68388c();
        r1.mo68437a(r14);
        r1.mo68425a("%s Error getting a response from the CPID endpoint. Message: %s\nURL: %s", "BgTaskGetCpid:", p000.bryx.m114908a(r14.getMessage()), new p000.bryx(2, r13));
        mo36068a(27051);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0108, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e5 A[ExcHandler: IOException (r14v1 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:4:0x001f] */
    /* renamed from: a */
    public final boolean mo36069a(String str, URLConnection uRLConnection) {
        int i = Build.VERSION.SDK_INT;
        if (agyt.m55304b(this.f66399b) != null) {
            uRLConnection.setRequestProperty("Accept-Language", agyt.m55304b(this.f66399b).toLanguageTag());
        }
        String str2 = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream()));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                str2 = sb.toString();
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    boolean a = agpk.m54726a().mo35835a(this.f66402e, this.f66403f, jSONObject.getString("cpid"), jSONObject.getLong("ttlSeconds"));
                    if (cfmq.m140237h()) {
                        agrl a2 = agrl.m54942a();
                        bxvd da = booc.f133888c.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((booc) da.f164949b).f133890a = boob.m111380a(6);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        ((booc) da.f164949b).f133891b = a;
                        a2.mo35992a((booc) da.mo74062i(), "MDP_BgTask", Integer.valueOf(this.f66400c));
                    }
                    if (!a) {
                        mo36068a(27050);
                    }
                    bufferedReader.close();
                    return a;
                } catch (Throwable th) {
                    th = th;
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        bqye.m113761a(th, th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e) {
        } catch (JSONException e2) {
            e = e2;
            bnsl bnsl = (bnsl) f66398a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68424a("%s Unable to parse json from carrier:{%s}", "BgTaskGetCpid:", new bryx(2, str2));
            ((bnsl) f66398a.mo68388c()).mo68420a("%s MDP_SERVER_CARRIER_INVALID_RESPONSE. Unable to parse carrier response.", "BgTaskGetCpid:");
            mo36068a(27008);
            return false;
        }
    }
}
