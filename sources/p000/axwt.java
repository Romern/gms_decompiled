package p000;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.AbstractHttpEntity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: axwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axwt implements axwm {

    /* renamed from: a */
    private final axzq f96624a;

    /* renamed from: b */
    private final ayjq f96625b;

    /* renamed from: c */
    private final int f96626c;

    /* renamed from: d */
    private final axyb f96627d;

    /* renamed from: e */
    private final axyd f96628e;

    /* renamed from: f */
    private final axzt f96629f;

    /* renamed from: g */
    private final abop f96630g;

    public axwt(Context context, abop abop, axzt axzt, axzq axzq, ayjq ayjq, axyb axyb, axyd axyd) {
        this.f96627d = axyb;
        this.f96628e = axyd;
        context.getContentResolver();
        this.f96626c = context.getApplicationInfo().uid;
        this.f96625b = ayjq;
        this.f96630g = abop;
        this.f96629f = axzt;
        this.f96624a = axzq;
        axzq.mo53800a(abop);
    }

    /* renamed from: a */
    private static final String m83428a(HttpEntity httpEntity) {
        return httpEntity != null ? new String(srz.m36178b(abop.m48011a(httpEntity))) : "";
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{org.json.JSONObject.put(java.lang.String, boolean):org.json.JSONObject throws org.json.JSONException}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{org.json.JSONObject.put(java.lang.String, double):org.json.JSONObject throws org.json.JSONException}
      ClspMth{org.json.JSONObject.put(java.lang.String, long):org.json.JSONObject throws org.json.JSONException}
      ClspMth{org.json.JSONObject.put(java.lang.String, int):org.json.JSONObject throws org.json.JSONException}
      ClspMth{org.json.JSONObject.put(java.lang.String, java.lang.Object):org.json.JSONObject throws org.json.JSONException}
      ClspMth{org.json.JSONObject.put(java.lang.String, boolean):org.json.JSONObject throws org.json.JSONException} */
    /* renamed from: b */
    public final axwl mo53695b(String str, String str2) {
        try {
            this.f96628e.mo53758a(":startSync");
            String str3 = this.f96629f.mo53808b().f96814a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("networkId", str).put("nodeId", str3);
            if (!bmxx.m108577a(str2) && !"null".equals(str2)) {
                jSONObject.put("registrationId", str2);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("isWatch", false);
            jSONObject2.put("isFeldspar", true);
            jSONObject.put("deviceInfo", jSONObject2);
            axww.m83443a(jSONObject);
            String a = mo53702a(":startSync", jSONObject);
            axwl axwl = new axwl();
            JSONObject jSONObject3 = new JSONObject(a);
            axwl.f96606a = axwu.m83440b(jSONObject3, "seqId");
            if (jSONObject3.has("syncTable")) {
                axwl.f96607b = axww.m83444b(jSONObject3.getJSONObject("syncTable"));
            }
            if (jSONObject3.has("pendingAsset")) {
                axwl.mo53688a(axww.m83442a(jSONObject3.getJSONArray("pendingAsset")));
            }
            this.f96628e.mo53760b(":startSync");
            return axwl;
        } catch (JSONException e) {
            Log.e("CloudNode", "Error parsing or creating json.", e);
            throw new axwq("Error parsing or creating json.", e);
        } catch (Throwable th) {
            this.f96628e.mo53760b(":startSync");
            throw th;
        }
    }

    /* renamed from: c */
    public final axwj mo53696c(String str, String str2) {
        HashSet<String> hashSet = new HashSet();
        hashSet.add(str2);
        try {
            this.f96628e.mo53758a(":getAssetAcls");
            String str3 = this.f96629f.mo53808b().f96814a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("networkId", str);
            jSONObject.put("nodeId", str3);
            JSONArray jSONArray = new JSONArray();
            for (String str4 : hashSet) {
                jSONArray.put(str4);
            }
            jSONObject.put("digest", jSONArray);
            axww.m83443a(jSONObject);
            JSONArray jSONArray2 = new JSONObject(mo53702a(":getAssetAcls", jSONObject)).getJSONArray("assetAcl");
            HashSet hashSet2 = new HashSet();
            for (int i = 0; i < jSONArray2.length(); i++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                String c = axwu.m83441c(jSONObject2, "digest");
                JSONArray optJSONArray = jSONObject2.optJSONArray("app");
                if (optJSONArray == null) {
                    String valueOf = String.valueOf(c);
                    Log.w("CloudNode", valueOf.length() == 0 ? new String("Incomplete asset received on client: ") : "Incomplete asset received on client: ".concat(valueOf));
                    throw new JSONException("unable to create AssetAcl because no acl array was provided");
                }
                HashSet hashSet3 = new HashSet();
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject jSONObject3 = optJSONArray.getJSONObject(i2);
                    hashSet3.add(axue.m83239a(axwu.m83441c(jSONObject3, "appPackageName"), axwu.m83441c(jSONObject3, "appDigest")));
                }
                hashSet2.add(new axwj(c, hashSet3));
            }
            axyd axyd = this.f96628e;
            int size = hashSet2.size();
            StringBuilder sb = new StringBuilder(20);
            sb.append("numAcls: ");
            sb.append(size);
            axyd.mo53759a(":getAssetAcls", sb.toString());
            return (axwj) hashSet2.iterator().next();
        } catch (JSONException e) {
            Log.e("CloudNode", "Error parsing or creating json.");
            throw new axwq("Error parsing or creating json.", e);
        }
    }

    /* renamed from: a */
    private static void m83429a(String str) {
        if (str.length() < 2000) {
            String valueOf = String.valueOf(str);
            Log.d("CloudNode", valueOf.length() == 0 ? new String("CloudNodeClient: ") : "CloudNodeClient: ".concat(valueOf));
            return;
        }
        int i = 0;
        while (i < str.length()) {
            int i2 = i + 2000;
            int min = Math.min(i2, str.length());
            int length = str.length();
            String substring = str.substring(i, min);
            StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 47);
            sb.append("CloudNodeClient: (");
            sb.append(i);
            sb.append(" of ");
            sb.append(length);
            sb.append("): ");
            sb.append(substring);
            Log.d("CloudNode", sb.toString());
            i = i2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x014b A[Catch:{ JSONException -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0151 A[Catch:{ JSONException -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x016b A[Catch:{ JSONException -> 0x01f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x019e A[Catch:{ JSONException -> 0x01f2 }] */
    /* renamed from: a */
    public final axwk mo53689a(String str, Map map, long j) {
        boolean z;
        String str2;
        JSONArray jSONArray;
        String str3 = "dataItemAsset";
        try {
            this.f96628e.mo53758a(":getDataItems");
            JSONObject put = new JSONObject().put("networkId", str).put("nodeId", this.f96629f.mo53808b().f96814a).put("version", 2);
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("nodeId", entry.getKey());
                jSONObject2.put("seqId", entry.getValue());
                jSONArray2.put(jSONObject2);
                it = it;
                str3 = str3;
            }
            String str4 = str3;
            jSONObject.put("syncEntry", jSONArray2);
            JSONObject put2 = put.put("syncTable", jSONObject).put("maxItems", j);
            axww.m83443a(put2);
            String a = mo53702a(":getDataItems", put2);
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject3 = new JSONObject(a);
            if (jSONObject3.has("dataItem")) {
                JSONArray jSONArray3 = jSONObject3.getJSONArray("dataItem");
                int i = 0;
                while (i < jSONArray3.length()) {
                    try {
                        JSONObject jSONObject4 = jSONArray3.getJSONObject(i);
                        JSONObject jSONObject5 = jSONObject4.getJSONObject("app");
                        axxi axxi = new axxi(axue.m83239a(axwu.m83441c(jSONObject5, "appPackageName"), axwu.m83441c(jSONObject5, "appDigest")));
                        axxi.f96651f = axwu.m83440b(jSONObject4, "seqId");
                        axxi.f96653h = axwu.m83440b(jSONObject4, "lastModifiedMs");
                        if (!"".equals(axwu.m83441c(jSONObject4, "sourceNodeId"))) {
                            axxi.f96650e = axwu.m83441c(jSONObject4, "sourceNodeId");
                        }
                        axxi.f96647b = new axxf(axwu.m83441c(jSONObject4, "host"), axwu.m83441c(jSONObject4, "path"));
                        axxi.f96648c = false;
                        axxi.f96648c = axwu.m83439a(jSONObject4, "deleted");
                        if (!"".equals(axwu.m83441c(jSONObject4, "data"))) {
                            try {
                                try {
                                    byte[] decode = Base64.decode(axwu.m83441c(jSONObject4, "data"), 2);
                                    if (decode == null) {
                                        Log.e("CloudNode", "Failed to decode bytes, result was null");
                                        axxi.f96647b.f96642d = new byte[0];
                                    } else {
                                        axxi.f96647b.f96642d = decode;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    String valueOf = String.valueOf(e.getMessage());
                                    Log.e("CloudNode", valueOf.length() != 0 ? new String("Failed to decode bytes: ") : "Failed to decode bytes: ".concat(valueOf));
                                    axxi.f96647b.f96642d = new byte[0];
                                    str2 = str4;
                                    if (jSONObject4.has(str2)) {
                                    }
                                    arrayList.add(axxi);
                                    i++;
                                    jSONArray3 = jSONArray;
                                    str4 = str2;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                String valueOf2 = String.valueOf(e.getMessage());
                                Log.e("CloudNode", valueOf2.length() != 0 ? new String("Failed to decode bytes: ") : "Failed to decode bytes: ".concat(valueOf2));
                                axxi.f96647b.f96642d = new byte[0];
                                str2 = str4;
                                if (jSONObject4.has(str2)) {
                                }
                                arrayList.add(axxi);
                                i++;
                                jSONArray3 = jSONArray;
                                str4 = str2;
                            }
                        }
                        str2 = str4;
                        if (jSONObject4.has(str2)) {
                            JSONArray jSONArray4 = jSONObject4.getJSONArray(str2);
                            axxf axxf = axxi.f96647b;
                            int i2 = 0;
                            while (i2 < jSONArray4.length()) {
                                JSONObject jSONObject6 = jSONArray4.getJSONObject(i2);
                                axxf.mo53711a(axwu.m83441c(jSONObject6, "key"), axuh.m83243a(axwu.m83441c(jSONObject6, "digest")));
                                i2++;
                                jSONArray4 = jSONArray4;
                                jSONArray3 = jSONArray3;
                            }
                            jSONArray = jSONArray3;
                        } else {
                            jSONArray = jSONArray3;
                        }
                        arrayList.add(axxi);
                        i++;
                        jSONArray3 = jSONArray;
                        str4 = str2;
                    } catch (JSONException e3) {
                        e = e3;
                        Log.e("CloudNode", "Error parsing or creating json.", e);
                        throw new axwq("Error parsing or creating json.", e);
                    }
                }
            }
            if (axwu.m83440b(jSONObject3, "hasMore") > 0) {
                z = true;
            } else {
                z = false;
            }
            axwk axwk = new axwk(arrayList, z);
            int size = axwk.f96604a.size();
            StringBuilder sb = new StringBuilder(21);
            sb.append("numItems: ");
            sb.append(size);
            String sb2 = sb.toString();
            if (axwk.f96605b) {
                sb2 = String.valueOf(sb2).concat(", hasMoreData");
            }
            try {
                this.f96628e.mo53759a(":getDataItems", sb2);
                return axwk;
            } catch (JSONException e4) {
                e = e4;
                Log.e("CloudNode", "Error parsing or creating json.", e);
                throw new axwq("Error parsing or creating json.", e);
            }
        } catch (JSONException e5) {
            e = e5;
            Log.e("CloudNode", "Error parsing or creating json.", e);
            throw new axwq("Error parsing or creating json.", e);
        }
    }

    /* renamed from: a */
    public final axwl mo53690a(String str, Iterator it, int i) {
        try {
            this.f96628e.mo53758a(":putDataItems");
            String str2 = this.f96629f.mo53808b().f96814a;
            JSONArray jSONArray = new JSONArray();
            int i2 = 0;
            while (it.hasNext()) {
                if (jSONArray.length() >= i) {
                    break;
                }
                axxi axxi = (axxi) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("host", axxi.f96647b.f96639a);
                jSONObject.put("path", axxi.f96647b.f96640b);
                jSONObject.put("app", new JSONObject().put("appDigest", axxi.f96646a.f96379c).put("appPackageName", axxi.f96646a.f96377a));
                jSONObject.put("lastModifiedMs", axxi.f96653h);
                jSONObject.put("seqId", axxi.f96651f);
                jSONObject.put("deleted", axxi.f96648c);
                String str3 = "dataItemAsset";
                axxf axxf = axxi.f96647b;
                JSONArray jSONArray2 = new JSONArray();
                for (Map.Entry entry : axxf.mo53710a().entrySet()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("key", entry.getKey());
                    jSONObject2.put("digest", ((axuh) entry.getValue()).f96387b);
                    jSONArray2.put(jSONObject2);
                    axxi = axxi;
                    str3 = str3;
                }
                jSONObject.put(str3, jSONArray2);
                String str4 = axxi.f96650e;
                if (str4 != null) {
                    jSONObject.put("sourceNodeId", str4);
                }
                byte[] bArr = axxi.f96647b.f96642d;
                if (bArr != null) {
                    jSONObject.put("data", Base64.encodeToString(bArr, 2));
                }
                jSONArray.put(jSONObject);
                if (Log.isLoggable("CloudNode", 2)) {
                    String valueOf = String.valueOf(axxi);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
                    sb.append("pushing: ");
                    sb.append(valueOf);
                    Log.v("CloudNode", sb.toString());
                }
                i2++;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("networkId", str);
            jSONObject3.put("nodeId", str2);
            jSONObject3.put("version", 2);
            jSONObject3.put("dataItem", jSONArray);
            axww.m83443a(jSONObject3);
            axwv axwv = new axwv(jSONObject3, i2);
            String a = mo53702a(":putDataItems", axwv.f96631a);
            if (!TextUtils.isEmpty(a)) {
                axwl axwl = new axwl();
                JSONObject jSONObject4 = new JSONObject(a);
                axwl.f96606a = axwu.m83440b(jSONObject4, "seqId");
                if (jSONObject4.has("syncTable")) {
                    axwl.f96607b = axww.m83444b(jSONObject4.getJSONObject("syncTable"));
                }
                if (jSONObject4.has("pendingAsset")) {
                    axwl.mo53688a(axww.m83442a(jSONObject4.getJSONArray("pendingAsset")));
                }
                if (Log.isLoggable("CloudNode", 2)) {
                    int i3 = axwv.f96632b;
                    long j = axwl.f96606a;
                    String valueOf2 = String.valueOf(axwl.f96607b);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 85);
                    sb2.append("put ");
                    sb2.append(i3);
                    sb2.append(" items, seqId=");
                    sb2.append(j);
                    sb2.append(", synctable=");
                    sb2.append(valueOf2);
                    sb2.append(", hasPendingAssets=");
                    sb2.append(!axwl.f96608c.isEmpty());
                    Log.v("CloudNode", sb2.toString());
                }
                axyd axyd = this.f96628e;
                int i4 = axwv.f96632b;
                StringBuilder sb3 = new StringBuilder(21);
                sb3.append("numItems: ");
                sb3.append(i4);
                axyd.mo53759a(":putDataItems", sb3.toString());
                return axwl;
            }
            Log.e("CloudNode", "unexpected empty response from putDataItems");
            throw new IOException("unexpected empty response from putDataItems");
        } catch (JSONException e) {
            Log.e("CloudNode", "Error parsing or creating json.", e);
            throw new axwq("Error parsing or creating json.", e);
        }
    }

    /* renamed from: a */
    public final String mo53691a(long j, String str, String str2) {
        try {
            this.f96628e.mo53758a(":createNetwork");
            String c = axwu.m83441c(new JSONObject(mo53702a(":createNetwork", new JSONObject().put("nodeId", this.f96629f.mo53808b().f96814a).put("androidId", j).put("registrationId", str).put("publicKey", str2))), "networkId");
            if (!bmxx.m108577a(c)) {
                this.f96628e.mo53760b(":createNetwork");
                return c;
            }
            throw new axwq(3, "createNetwork error: networkId is empty");
        } catch (JSONException e) {
            Log.e("CloudNode", "Error parsing or creating json.", e);
            throw new axwq("Error parsing or creating json.", e);
        } catch (Throwable th) {
            this.f96628e.mo53760b(":createNetwork");
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x01fe  */
    /* renamed from: a */
    public final String mo53702a(String str, JSONObject jSONObject) {
        HttpEntity httpEntity;
        Uri.Builder buildUpon = Uri.parse(chnj.m149028d()).buildUpon();
        String valueOf = String.valueOf(chnj.m149029e());
        String uri = buildUpon.appendEncodedPath(str.length() == 0 ? new String(valueOf) : valueOf.concat(str)).build().toString();
        String jSONObject2 = jSONObject.toString();
        if (Log.isLoggable("CloudNodeJSON", 2)) {
            StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 34 + String.valueOf(jSONObject2).length());
            sb.append("\nPosting to URL: ");
            sb.append(uri);
            sb.append(";  JSON OBJECT: \n");
            sb.append(jSONObject2);
            m83429a(sb.toString());
        } else if (Log.isLoggable("CloudNode", 2)) {
            String valueOf2 = String.valueOf(uri);
            m83429a(valueOf2.length() == 0 ? new String("\nPosting to URL: ") : "\nPosting to URL: ".concat(valueOf2));
        }
        HttpPost httpPost = new HttpPost(uri);
        abop.m48014a((HttpRequest) httpPost);
        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-type", "application/json");
        try {
            shr.m35313a(1794, this.f96626c);
            AbstractHttpEntity a = abop.m48013a(jSONObject2.getBytes());
            httpPost.setEntity(a);
            axya axya = new axya(str);
            this.f96627d.mo53756a(axya, "bytesSent", (int) a.getContentLength());
            HttpResponse execute = this.f96630g.execute(httpPost);
            httpEntity = execute.getEntity();
            if (httpEntity != null) {
                try {
                    this.f96627d.mo53756a(axya, "bytesRecv", (int) httpEntity.getContentLength());
                } catch (Throwable th) {
                    th = th;
                    if (httpEntity != null) {
                        httpEntity.consumeContent();
                    }
                    shr.m35312a();
                    throw th;
                }
            }
            int statusCode = execute.getStatusLine().getStatusCode();
            if (statusCode == 200) {
                this.f96627d.mo53756a(axya, "success", 1);
                this.f96625b.mo54035a();
                String a2 = m83428a(httpEntity);
                if (Log.isLoggable("CloudNodeJSON", 2)) {
                    m83429a(a2.length() == 0 ? new String("Got HttpPost response: ") : "Got HttpPost response: ".concat(a2));
                }
                if (httpEntity != null) {
                    httpEntity.consumeContent();
                }
                shr.m35312a();
                return a2;
            } else if (statusCode >= 400 && statusCode < 500) {
                this.f96627d.mo53756a(axya, "400s", 1);
                String a3 = m83428a(httpEntity);
                int statusCode2 = execute.getStatusLine().getStatusCode();
                String reasonPhrase = execute.getStatusLine().getReasonPhrase();
                StringBuilder sb2 = new StringBuilder(String.valueOf(reasonPhrase).length() + 60);
                sb2.append("Fatal error!!! Server response code ");
                sb2.append(statusCode2);
                sb2.append(" reason was: ");
                sb2.append(reasonPhrase);
                Log.d("CloudNode", sb2.toString());
                if (statusCode == 401) {
                    throw new axwq(4, a3);
                }
                throw new axwq(2, a3);
            } else if (statusCode >= 500) {
                this.f96627d.mo53756a(axya, "500s", 1);
                String reasonPhrase2 = execute.getStatusLine().getReasonPhrase();
                StringBuilder sb3 = new StringBuilder(String.valueOf(reasonPhrase2).length() + 53);
                sb3.append("Failed! Server response code ");
                sb3.append(statusCode);
                sb3.append(" reason was: ");
                sb3.append(reasonPhrase2);
                Log.d("CloudNode", sb3.toString());
                String reasonPhrase3 = execute.getStatusLine().getReasonPhrase();
                StringBuilder sb4 = new StringBuilder(String.valueOf(reasonPhrase3).length() + 13);
                sb4.append(statusCode);
                sb4.append(": ");
                sb4.append(reasonPhrase3);
                throw new IOException(sb4.toString());
            } else {
                this.f96627d.mo53756a(axya, "IOException", 1);
                StringBuilder sb5 = new StringBuilder(44);
                sb5.append("Received unexpected status code: ");
                sb5.append(statusCode);
                throw new IOException(sb5.toString());
            }
        } catch (Throwable th2) {
            th = th2;
            httpEntity = null;
            if (httpEntity != null) {
            }
            shr.m35312a();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo53692a(String str, String str2) {
        try {
            this.f96628e.mo53758a(":revokeNode");
            mo53702a(":revokeNode", new JSONObject().put("networkId", str).put("nodeId", this.f96629f.mo53808b().f96814a).put("nodeIdToRevoke", str2));
            this.f96628e.mo53760b(":revokeNode");
        } catch (JSONException e) {
            Log.e("CloudNode", "Error parsing or creating json.", e);
            throw new axwq("Error parsing or creating json.", e);
        } catch (Throwable th) {
            this.f96628e.mo53760b(":revokeNode");
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo53693a(String str, String str2, long j, String str3, String str4) {
        try {
            this.f96628e.mo53758a(":enrollNode");
            mo53702a(":enrollNode", new JSONObject().put("networkId", str).put("nodeId", this.f96629f.mo53808b().f96814a).put("targetAndroidId", j).put("targetRegistrationId", str3).put("targetNodeId", str2).put("targetPublicKey", str4));
            this.f96628e.mo53760b(":enrollNode");
        } catch (JSONException e) {
            Log.e("CloudNode", "Error parsing or creating json.", e);
            throw new axwq("Error parsing or creating json.", e);
        } catch (Throwable th) {
            this.f96628e.mo53760b(":enrollNode");
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo53694a(String str, String str2, Set set) {
        try {
            this.f96628e.mo53758a(":putAssetAcls");
            JSONObject put = new JSONObject().put("networkId", str).put("nodeId", this.f96629f.mo53808b().f96814a);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("digest", str2);
            JSONArray jSONArray = new JSONArray();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                axue axue = (axue) it.next();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("appPackageName", axue.f96377a);
                jSONObject2.put("appDigest", axue.f96379c);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("app", jSONArray);
            JSONObject put2 = put.put("assetAcl", jSONObject);
            axww.m83443a(put2);
            mo53702a(":putAssetAcls", put2);
            axyd axyd = this.f96628e;
            int size = set.size();
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 22);
            sb.append(str2);
            sb.append(", numAcls: ");
            sb.append(size);
            axyd.mo53759a(":putAssetAcls", sb.toString());
        } catch (JSONException e) {
            Log.e("CloudNode", "Error parsing or creating json.");
            throw new axwq("Error parsing or creating json.", e);
        }
    }
}
