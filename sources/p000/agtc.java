package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import org.json.JSONException;

/* renamed from: agtc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agtc extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ String f66437a;

    /* renamed from: b */
    final /* synthetic */ Locale f66438b;

    /* renamed from: c */
    final /* synthetic */ ConnectivityManager f66439c;

    /* renamed from: d */
    final /* synthetic */ agth f66440d;

    public agtc(agth agth, String str, Locale locale, ConnectivityManager connectivityManager) {
        this.f66440d = agth;
        this.f66437a = str;
        this.f66438b = locale;
        this.f66439c = connectivityManager;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x0171 A[SYNTHETIC, Splitter:B:57:0x0171] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01ca A[SYNTHETIC, Splitter:B:76:0x01ca] */
    public final void onAvailable(Network network) {
        ConnectivityManager connectivityManager;
        String str;
        agth.f66447g.mo26019b(agyt.m55307c()).mo68424a("Cellular network %s is available for CPID end point: %s", network, this.f66437a);
        BufferedReader bufferedReader = null;
        MdpCarrierPlanIdResponse mdpCarrierPlanIdResponse = null;
        r1 = null;
        BufferedReader bufferedReader2 = null;
        try {
            URLConnection openConnection = network.openConnection(new URL(this.f66437a));
            Locale locale = this.f66438b;
            if (locale != null) {
                openConnection.setRequestProperty("Accept-Language", locale.toLanguageTag());
            }
            BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(openConnection.getInputStream()));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader3.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                String sb2 = sb.toString();
                try {
                    bufferedReader3.close();
                } catch (IOException e) {
                    bnsl bnsl = (bnsl) agth.f66447g.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68405a("Buffer reader did not close correctly");
                }
                this.f66439c.unregisterNetworkCallback(this);
                try {
                    mdpCarrierPlanIdResponse = this.f66440d.mo36080a(sb2);
                } catch (JSONException e2) {
                    bnsl bnsl2 = (bnsl) agth.f66447g.mo68387b();
                    bnsl2.mo68437a(e2);
                    bnsl2.mo68420a("Unable to parse json from carrier:{%s}", new bryx(2, sb2));
                }
                if (mdpCarrierPlanIdResponse == null || (str = mdpCarrierPlanIdResponse.f80151a) == null || str.isEmpty()) {
                    ((bnsl) agth.f66447g.mo68388c()).mo68405a("MDP_SERVER_CARRIER_INVALID_RESPONSE. Unable to parse carrier response.");
                    agth agth = this.f66440d;
                    String valueOf = String.valueOf(sb2);
                    agth.mo6503a(new Status(27008, valueOf.length() == 0 ? new String("MDP_SERVER_CARRIER_INVALID_RESPONSE. Unable to parse carrier response: ") : "MDP_SERVER_CARRIER_INVALID_RESPONSE. Unable to parse carrier response: ".concat(valueOf)));
                } else if (!cfmv.m140307f() || mdpCarrierPlanIdResponse.f80152b > 0) {
                    this.f66440d.mo36081a(mdpCarrierPlanIdResponse);
                } else {
                    ((bnsl) agth.f66447g.mo68388c()).mo68415a("MDP_SERVER_CARRIER_INVALID_TTL. TTL of CPID is invalid: %d", mdpCarrierPlanIdResponse.f80152b);
                    agth agth2 = this.f66440d;
                    String valueOf2 = String.valueOf(sb2);
                    agth2.mo6503a(new Status(27053, valueOf2.length() == 0 ? new String("MDP_SERVER_CARRIER_INVALID_TTL. TTL of CPID is invalid: ") : "MDP_SERVER_CARRIER_INVALID_TTL. TTL of CPID is invalid: ".concat(valueOf2)));
                }
            } catch (MalformedURLException e3) {
                e = e3;
                bufferedReader = bufferedReader3;
            } catch (IOException e4) {
                e = e4;
                bufferedReader2 = bufferedReader3;
                try {
                    bnsl bnsl3 = (bnsl) agth.f66447g.mo68388c();
                    bnsl3.mo68437a(e);
                    bnsl3.mo68420a("Error in getting a valid response or in connecting CPID endpoint. Message: %s", bryx.m114908a(e.getMessage()));
                    agth agth3 = this.f66440d;
                    String str2 = this.f66437a;
                    String valueOf3 = String.valueOf(e);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 54 + String.valueOf(valueOf3).length());
                    sb3.append("MDP_SERVER_CARRIER_FAILURE. Error from carrier:");
                    sb3.append(str2);
                    sb3.append("\nError:");
                    sb3.append(valueOf3);
                    agth3.mo6503a(new Status(27007, sb3.toString()));
                    if (bufferedReader2 != null) {
                    }
                    connectivityManager = this.f66439c;
                    connectivityManager.unregisterNetworkCallback(this);
                } catch (Throwable th) {
                    th = th;
                    if (bufferedReader2 != null) {
                    }
                    this.f66439c.unregisterNetworkCallback(this);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader2 = bufferedReader3;
                if (bufferedReader2 != null) {
                }
                this.f66439c.unregisterNetworkCallback(this);
                throw th;
            }
        } catch (MalformedURLException e5) {
            e = e5;
            try {
                bnsl bnsl4 = (bnsl) agth.f66447g.mo68388c();
                bnsl4.mo68437a(e);
                bnsl4.mo68420a("URL string %s cannot be converted to a URL", this.f66437a);
                this.f66440d.mo6503a(new Status(27020, "MDP_BAD_CPID_END_POINT. CPID end point url error"));
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e6) {
                        bnsl bnsl5 = (bnsl) agth.f66447g.mo68388c();
                        bnsl5.mo68437a(e6);
                        bnsl5.mo68405a("Buffer reader did not close correctly");
                    }
                }
                connectivityManager = this.f66439c;
                connectivityManager.unregisterNetworkCallback(this);
            } catch (Throwable th3) {
                th = th3;
                if (bufferedReader2 != null) {
                }
                this.f66439c.unregisterNetworkCallback(this);
                throw th;
            }
        } catch (IOException e7) {
            e = e7;
            bnsl bnsl32 = (bnsl) agth.f66447g.mo68388c();
            bnsl32.mo68437a(e);
            bnsl32.mo68420a("Error in getting a valid response or in connecting CPID endpoint. Message: %s", bryx.m114908a(e.getMessage()));
            agth agth32 = this.f66440d;
            String str22 = this.f66437a;
            String valueOf32 = String.valueOf(e);
            StringBuilder sb32 = new StringBuilder(String.valueOf(str22).length() + 54 + String.valueOf(valueOf32).length());
            sb32.append("MDP_SERVER_CARRIER_FAILURE. Error from carrier:");
            sb32.append(str22);
            sb32.append("\nError:");
            sb32.append(valueOf32);
            agth32.mo6503a(new Status(27007, sb32.toString()));
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException e8) {
                    bnsl bnsl6 = (bnsl) agth.f66447g.mo68388c();
                    bnsl6.mo68437a(e8);
                    bnsl6.mo68405a("Buffer reader did not close correctly");
                }
            }
            connectivityManager = this.f66439c;
            connectivityManager.unregisterNetworkCallback(this);
        } catch (Throwable th4) {
            th = th4;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException e9) {
                    bnsl bnsl7 = (bnsl) agth.f66447g.mo68388c();
                    bnsl7.mo68437a(e9);
                    bnsl7.mo68405a("Buffer reader did not close correctly");
                }
            }
            this.f66439c.unregisterNetworkCallback(this);
            throw th;
        }
    }

    public final void onUnavailable() {
        this.f66439c.unregisterNetworkCallback(this);
        agth.f66447g.mo26019b(agyt.m55307c()).mo68405a("Cellular network is unavailable while querying CPID endpoint");
        if (cfmq.m140243n()) {
            this.f66440d.mo6503a(new Status(27046, "MDP_NOT_ON_CELLULAR_UNAVAILABLE: cellular network is unavailable while querying CPID endpoint."));
        } else {
            this.f66440d.mo6503a(new Status(27019, "MDP_NOT_ON_CELLULAR: cellular network is unavailable"));
        }
    }
}
