package p000;

import android.os.Binder;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NetworkResponse;
import com.android.volley.RequestQueue;
import com.android.volley.TimeoutError;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: awgj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awgj {

    /* renamed from: a */
    private final RequestQueue f94304a;

    public awgj(RequestQueue requestQueue) {
        this.f94304a = requestQueue;
    }

    /* renamed from: a */
    public static ArrayList m79898a(bjev bjev, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pair.create("Content-Type", str));
        arrayList.add(Pair.create("Authorization", bjev.mo65066a()));
        arrayList.add(Pair.create("X-Modality", "ANDROID_NATIVE"));
        arrayList.add(Pair.create("X-Version", Integer.toString(201515033)));
        return arrayList;
    }

    /* renamed from: a */
    public final ServerResponse mo52125a(String str, bjev bjev, byte[] bArr, int i) {
        return mo52126a(str, bjev, bArr, (ArrayList) null, i, 39);
    }

    /* renamed from: a */
    public final ServerResponse mo52126a(String str, bjev bjev, byte[] bArr, ArrayList arrayList, int i, int i2) {
        ArrayList a = m79898a(bjev, "application/x-protobuf");
        if (arrayList != null) {
            a.addAll(arrayList);
        }
        return mo52127a(str, a, "application/x-protobuf", bArr, i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:97:0x0216 A[Catch:{ InterruptedException -> 0x0249, ExecutionException -> 0x0228, all -> 0x0226 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0220 A[Catch:{ InterruptedException -> 0x0249, ExecutionException -> 0x0228, all -> 0x0226 }] */
    /* renamed from: a */
    public final ServerResponse mo52127a(String str, ArrayList arrayList, String str2, byte[] bArr, int i, int i2) {
        ServerResponse serverResponse;
        String str3;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            RequestFuture newFuture = RequestFuture.newFuture();
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                newFuture.setRequest(this.f94304a.add(new awgi(str, bArr, arrayList, str2, newFuture)));
                NetworkResponse networkResponse = (NetworkResponse) newFuture.get();
                int i3 = 53;
                int i4 = 1;
                i4 = 1;
                bmqv bmqv = null;
                r9 = null;
                byte[] bArr2 = null;
                bmqv = null;
                bmqv = null;
                bmqv = null;
                int i5 = i;
                if (i5 != 53) {
                    if (ServerResponse.m94179a(i)) {
                        str3 = "application/x-protobuf";
                    } else {
                        str3 = null;
                    }
                    if (networkResponse == null) {
                        Log.e("ServerConnection", "Null HTTP response");
                    } else {
                        int i6 = networkResponse.statusCode;
                        if (i6 == 401) {
                            i4 = 5;
                        }
                        String str4 = (String) networkResponse.headers.get("Content-Type");
                        if (str4 == null) {
                            str4 = "";
                        }
                        if (str3 == null || str4.contains(str3)) {
                            bArr2 = networkResponse.data;
                            i4 = (i6 == 200 || i6 == 401) ? i5 : i2;
                        }
                    }
                    if (!ServerResponse.m94180b(i4)) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append("Unexpected serverResponseType=");
                        sb.append(i4);
                        Log.w("ServerConnection", sb.toString());
                        serverResponse = new ServerResponse(i4, bArr2);
                    } else {
                        serverResponse = new ServerResponse(i4, bArr2);
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    return serverResponse;
                }
                if (networkResponse == null) {
                    Log.e("ServerConnection", "Null HTTP response");
                    serverResponse = ServerResponse.f110426d;
                } else {
                    int i7 = networkResponse.statusCode;
                    if (i7 == 401) {
                        serverResponse = ServerResponse.f110424b;
                    } else {
                        if (i7 != 200) {
                            i3 = i2;
                        }
                        String parseCharset = HttpHeaderParser.parseCharset(networkResponse.headers, "utf-8");
                        try {
                            try {
                                JSONObject jSONObject = new JSONObject(new String(networkResponse.data, parseCharset));
                                bxvd da = bmqv.f130437d.mo74144da();
                                if (jSONObject.optString("status").equals("SUCCESS")) {
                                    ByteString a = ByteString.m123261a(Base64.decode(jSONObject.optString("document_token"), 0));
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    bmqv bmqv2 = (bmqv) da.f164949b;
                                    a.getClass();
                                    bmqv2.f130439a = 2 | bmqv2.f130439a;
                                    bmqv2.f130441c = a;
                                } else {
                                    JSONObject optJSONObject = jSONObject.optJSONObject("error");
                                    if (optJSONObject == null) {
                                        Log.e("ServerConnection", "No result or error found in response");
                                    } else {
                                        bxvd da2 = bmav.f128500h.mo74144da();
                                        String optString = optJSONObject.optString("message");
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        bmav bmav = (bmav) da2.f164949b;
                                        optString.getClass();
                                        bmav.f128502a |= 1;
                                        bmav.f128503b = optString;
                                        String optString2 = optJSONObject.optString("action");
                                        if (optString2.equals("ALLOW_RETRY")) {
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            bmav bmav2 = (bmav) da2.f164949b;
                                            bmav2.f128504c = 1;
                                            bmav2.f128502a |= 8;
                                        } else if (!optString2.equals("EXIT_APPLICATION")) {
                                            Log.e("ServerConnection", "Could not parse response error");
                                        } else {
                                            if (da2.f164950c) {
                                                da2.mo74035c();
                                                da2.f164950c = false;
                                            }
                                            bmav bmav3 = (bmav) da2.f164949b;
                                            bmav3.f128504c = 2;
                                            bmav3.f128502a |= 8;
                                        }
                                        String optString3 = optJSONObject.optString("errorCode");
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        bmav bmav4 = (bmav) da2.f164949b;
                                        optString3.getClass();
                                        bmav4.f128502a |= 16;
                                        bmav4.f128506e = optString3;
                                        String optString4 = optJSONObject.optString("internalDetails");
                                        if (da2.f164950c) {
                                            da2.mo74035c();
                                            da2.f164950c = false;
                                        }
                                        bmav bmav5 = (bmav) da2.f164949b;
                                        optString4.getClass();
                                        bmav5.f128502a |= 32;
                                        bmav5.f128507f = optString4;
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        bmqv bmqv3 = (bmqv) da.f164949b;
                                        bmav bmav6 = (bmav) da2.mo74062i();
                                        bmav6.getClass();
                                        bmqv3.f130440b = bmav6;
                                        bmqv3.f130439a |= 1;
                                    }
                                    if (bmqv == null) {
                                        serverResponse = new ServerResponse(i3, bmqv.serializeToBytes());
                                    } else {
                                        serverResponse = ServerResponse.f110426d;
                                    }
                                }
                                bmqv = (bmqv) da.mo74062i();
                            } catch (JSONException e) {
                                Log.e("ServerConnection", "Could not parse response");
                            }
                        } catch (UnsupportedEncodingException e2) {
                            String valueOf = String.valueOf(parseCharset);
                            Log.e("ServerConnection", valueOf.length() == 0 ? new String("Unsupported charset: ") : "Unsupported charset: ".concat(valueOf));
                        }
                        if (bmqv == null) {
                        }
                    }
                }
                Binder.restoreCallingIdentity(clearCallingIdentity);
                return serverResponse;
            } catch (InterruptedException e3) {
                Log.e("ServerConnection", "Exception sending Volley request", e3);
                serverResponse = ServerResponse.f110423a;
            } catch (ExecutionException e4) {
                Log.e("ServerConnection", "Exception sending Volley request", e4);
                Throwable cause = e4.getCause();
                if ((cause instanceof NetworkError) || (cause instanceof TimeoutError)) {
                    serverResponse = ServerResponse.f110423a;
                } else if (!(e4.getCause() instanceof AuthFailureError)) {
                    serverResponse = ServerResponse.f110426d;
                } else {
                    serverResponse = ServerResponse.f110424b;
                }
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th;
            }
        } else {
            throw new IllegalStateException("Cannot make network request from UI thread!");
        }
    }
}
