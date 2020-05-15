package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.VolleyError;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.lso.AuthApps;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.request.DataTypeReadRequest;
import com.google.android.gms.fitness.request.DisableFitRequest;
import com.google.android.gms.fitness.result.DataTypeResult;
import com.google.android.gms.fitness.settings.ConnectedApp;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: zmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zmo implements ytv {

    /* renamed from: a */
    final /* synthetic */ zmp f55478a;

    public zmo(zmp zmp) {
        this.f55478a = zmp;
    }

    /* renamed from: a */
    public final boolean mo30773a(int i, Object obj, ytt ytt) {
        DataTypeResult dataTypeResult;
        DataTypeResult dataTypeResult2;
        String str;
        List<AuthApps.Apps> list;
        String str2;
        Throwable th;
        IOException iOException;
        boolean z;
        Configuration configuration;
        String str3;
        int i2 = i;
        ytt ytt2 = ytt;
        HttpURLConnection httpURLConnection = null;
        if (i2 == 0) {
            zmp zmp = this.f55478a;
            DataTypeCreateRequest dataTypeCreateRequest = (DataTypeCreateRequest) obj;
            String str4 = ytt2.f54617a;
            zbb zbb = dataTypeCreateRequest.f32241c;
            if (zbb == null) {
                return true;
            }
            zmq zmq = zmp.f55481f;
            if (!zmq.f55484c.mo30722a(str4, dataTypeCreateRequest.f32239a)) {
                dataTypeResult = new DataTypeResult(ysl.f54548e, null);
            } else {
                caah b = bzzn.m126364b(dataTypeCreateRequest.f32239a, ywc.m44932a(dataTypeCreateRequest.f32240b));
                caah b2 = zmq.f55484c.mo30724b(dataTypeCreateRequest.f32239a);
                if (b2 == null || b2.equals(b)) {
                    dataTypeResult = zmq.mo31259a(b);
                } else {
                    dataTypeResult = new DataTypeResult(ysl.f54548e, null);
                }
            }
            zbb.mo30900a(dataTypeResult);
            return true;
        } else if (i2 == 1) {
            zmp zmp2 = this.f55478a;
            DataTypeReadRequest dataTypeReadRequest = (DataTypeReadRequest) obj;
            String str5 = ytt2.f54617a;
            zbb zbb2 = dataTypeReadRequest.f32243b;
            try {
                zmq zmq2 = zmp2.f55481f;
                String str6 = dataTypeReadRequest.f32242a;
                if (!zmq2.f55484c.mo30723a(str5, str6, 1)) {
                    bnsl bnsl = (bnsl) zmq.f55482a.mo68388c();
                    bnsl.mo68432a("zmq", "a", 71, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68424a("App %s does not have access to data type %s", str5, str6);
                    dataTypeResult2 = new DataTypeResult(ysl.f54548e, null);
                } else {
                    caah b3 = zmq2.f55485d.mo31383b(str6);
                    if (b3 == null) {
                        bnsl bnsl2 = (bnsl) zmq.f55482a.mo68388c();
                        bnsl2.mo68432a("zmq", "a", 81, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68420a("No datatype %s found. Checking if this is a shareable one.", str6);
                        caah b4 = zmq2.f55484c.mo30724b(str6);
                        if (b4 != null) {
                            bnsl bnsl3 = (bnsl) zmq.f55482a.mo68388c();
                            bnsl3.mo68432a("zmq", "a", 88, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            bnsl3.mo68420a("Adding shareable data type: %s", str6);
                            dataTypeResult2 = zmq2.mo31259a(b4);
                        } else {
                            dataTypeResult2 = new DataTypeResult(ysl.f54550g, null);
                        }
                    } else {
                        dataTypeResult2 = new DataTypeResult(zmq.f55483b, ywb.m44931a(b3));
                    }
                }
                zbb2.mo30900a(dataTypeResult2);
                return true;
            } catch (IOException e) {
                bnsl bnsl4 = (bnsl) zmp.f55479d.mo68387b();
                bnsl4.mo68437a(e);
                bnsl4.mo68405a("Error reading custom data type.");
                zbb2.mo30900a(new DataTypeResult(new Status(5008), null));
                return true;
            }
        } else if (i2 != 2) {
            return false;
        } else {
            zmp zmp3 = this.f55478a;
            String str7 = ytt2.f54617a;
            zcl zcl = ((DisableFitRequest) obj).f32256a;
            try {
                zpj zpj = zmp3.f55480e;
                String str8 = zmp3.f55429b;
                ArrayList arrayList = new ArrayList();
                try {
                    zpk a = zpj.mo31312a();
                    Context context = zpj.f55653b;
                    int myUid = Process.myUid();
                    String packageName = context.getPackageName();
                    ClientContext clientContext = r12;
                    ArrayList arrayList2 = arrayList;
                    ClientContext clientContext2 = new ClientContext(myUid, str8, str8, packageName, packageName);
                    clientContext.mo17806d("https://www.googleapis.com/auth/grants.audit");
                    sep sep = a.f55656a;
                    Resources resources = context.getResources();
                    if (resources == null || (configuration = resources.getConfiguration()) == null) {
                        str = null;
                    } else {
                        Locale locale = configuration.locale;
                        String country = locale.getCountry();
                        String language = locale.getLanguage();
                        if (!TextUtils.isEmpty(country)) {
                            str3 = "-";
                        } else {
                            str3 = "";
                        }
                        StringBuilder sb = new StringBuilder(String.valueOf(language).length() + str3.length() + String.valueOf(country).length());
                        sb.append(language);
                        sb.append(str3);
                        sb.append(country);
                        str = sb.toString();
                    }
                    AuthApps a2 = sep.mo25430a(clientContext, "third_party", str);
                    if (a2.f30255a.contains(3)) {
                        list = a2.f30257c;
                    } else {
                        list = bngx.m109376e();
                    }
                    for (AuthApps.Apps apps : list) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Integer num : apps.f30272h) {
                            int intValue = num.intValue();
                            if (intValue >= 57000) {
                                z = intValue <= 57099;
                            } else {
                                z = false;
                            }
                            if (z) {
                                arrayList3.add(Integer.valueOf(intValue));
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            int[] iArr = new int[arrayList3.size()];
                            for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                                iArr[i3] = ((Integer) arrayList3.get(i3)).intValue();
                            }
                            for (AuthApps.Apps.Clients clients : apps.f30266b) {
                                if (clients.mo17836b()) {
                                    arrayList2.add(new ConnectedApp(clients.f30275b, apps.f30270f, iArr));
                                }
                            }
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ConnectedApp connectedApp = (ConnectedApp) it.next();
                        if (connectedApp.f32442a.equals(str7)) {
                            String str9 = connectedApp.f32443b;
                            zpj.f55653b.sendBroadcast(sbv.m34880b(str7, str8));
                            zpl zpl = new zpl();
                            try {
                                str2 = gie.m13188a(zpj.f55653b, new Account(str8, "com.google"), "oauth2:https://www.googleapis.com/auth/grants.audit", (Bundle) null);
                            } catch (gid | IOException e2) {
                                ((bnsl) zpj.f55652a.mo68388c()).mo68420a("UserRecoverableAuthException: %s", Log.getStackTraceString(e2));
                                str2 = null;
                            }
                            zpl.f55657a = str2;
                            zpl.f55658b = str9;
                            Uri.Builder builder = new Uri.Builder();
                            HashMap hashMap = new HashMap();
                            builder.scheme("https").encodedAuthority("www.googleapis.com").path("/oauth2/v3/RevokeToken").appendQueryParameter("revocation_handle", zpl.f55658b);
                            String valueOf = String.valueOf(zpl.f55657a);
                            hashMap.put("Authorization", valueOf.length() == 0 ? new String("OAuth ") : "OAuth ".concat(valueOf));
                            try {
                                HttpURLConnection httpURLConnection2 = (HttpURLConnection) stp.m36306a(new URL(builder.build().toString()), 3328);
                                httpURLConnection2.setRequestMethod("GET");
                                for (Map.Entry entry : hashMap.entrySet()) {
                                    httpURLConnection2.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                }
                                try {
                                    httpURLConnection2.connect();
                                    stp.m36307a(httpURLConnection2);
                                    zpj.f55654c.mo30739a(str7);
                                    zcl.mo30933a(Status.f30107a);
                                    return true;
                                } catch (IOException e3) {
                                    httpURLConnection = httpURLConnection2;
                                    iOException = e3;
                                    try {
                                        throw new zpf(iOException);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        stp.m36307a(httpURLConnection);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    httpURLConnection = httpURLConnection2;
                                    th = th3;
                                    stp.m36307a(httpURLConnection);
                                    throw th;
                                }
                            } catch (IOException e4) {
                                iOException = e4;
                                throw new zpf(iOException);
                            } catch (Throwable th4) {
                                th = th4;
                                stp.m36307a(httpURLConnection);
                                throw th;
                            }
                        }
                    }
                    throw new zph(String.format("App %s not found in list of connected apps for %s", str7, str8));
                } catch (gid e5) {
                    e = e5;
                    throw new zpf(e);
                } catch (VolleyError e6) {
                    e = e6;
                    throw new zpf(e);
                }
            } catch (ysu e7) {
                throw new zpi(e7);
            } catch (zpf e8) {
                ((bnsl) zmp.f55479d.mo68388c()).mo68420a("API Exception: %s", Log.getStackTraceString(e8));
                zcl.mo30933a(new Status(5011));
                return true;
            } catch (zph e9) {
                ((bnsl) zmp.f55479d.mo68388c()).mo68424a("App %s not found: %s", str7, Log.getStackTraceString(e9));
                zcl.mo30933a(new Status(5010));
                return true;
            } catch (zpi e10) {
                bnsl bnsl5 = (bnsl) zmp.f55479d.mo68388c();
                bnsl5.mo68437a(e10);
                bnsl5.mo68420a("Cannot clear selected account for package %s", str7);
                zcl.mo30933a(new Status(5008));
                return true;
            }
        }
    }
}
