package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.RequestFuture;
import com.google.android.wallet.bender3.framework.client.WidgetConfig;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bjjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjjc implements bjew {

    /* renamed from: a */
    private final Context f122808a;

    /* renamed from: b */
    private final RequestQueue f122809b;

    /* renamed from: c */
    private final bjjb f122810c;

    public bjjc(Context context, RequestQueue requestQueue, bjjb bjjb) {
        this.f122808a = context;
        this.f122809b = requestQueue;
        this.f122810c = bjjb;
    }

    /* renamed from: a */
    private static bjfd m103641a() {
        return new bjfd(bjfd.m103295a(2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a4 A[SYNTHETIC, Splitter:B:30:0x00a4] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1 A[Catch:{ AuthFailureError | InterruptedException | ExecutionException -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b9 A[Catch:{ AuthFailureError | InterruptedException | ExecutionException -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f4 A[Catch:{ AuthFailureError | InterruptedException | ExecutionException -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fb A[Catch:{ AuthFailureError | InterruptedException | ExecutionException -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0121 A[Catch:{ AuthFailureError | InterruptedException | ExecutionException -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0130 A[Catch:{ AuthFailureError | InterruptedException | ExecutionException -> 0x0144 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x013a A[SYNTHETIC, Splitter:B:66:0x013a] */
    /* renamed from: a */
    public final bjfd mo52455a(bjfc bjfc) {
        ParcelFileDescriptor parcelFileDescriptor;
        Throwable th;
        byte[] bArr;
        String str;
        String parseCharset;
        String str2;
        JSONObject jSONObject;
        ParcelFileDescriptor parcelFileDescriptor2;
        Intent intent = bjfc.f122612a;
        WidgetConfig b = bjfc.mo65079b();
        bwqe bwqe = (bwqe) bjhq.m103510a(intent, "documentUploadData", bwqe.f160648e);
        String stringExtra = intent.getStringExtra("filename");
        String concat = String.valueOf(bwqe.f160654d).concat("?s7e_mode=b64file");
        RequestFuture newFuture = RequestFuture.newFuture();
        try {
            String a = this.f122810c.mo65089a(this.f122808a, b.f151760a, bjje.m103645b(b.f151761b), false, 0);
            try {
                parcelFileDescriptor2 = this.f122808a.getContentResolver().openFileDescriptor(Uri.parse(stringExtra), "r");
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(parcelFileDescriptor2.getFileDescriptor()));
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[1024];
                    for (int read = bufferedInputStream.read(bArr2); read != -1; read = bufferedInputStream.read(bArr2)) {
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                    bArr = byteArrayOutputStream.toByteArray();
                    if (parcelFileDescriptor2 != null) {
                        try {
                            parcelFileDescriptor2.close();
                        } catch (IOException e) {
                            Log.e("DocumentUtils", "Error closing file descriptor", e);
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    try {
                        Log.e("DocumentUtils", "Error reading file", e);
                        if (parcelFileDescriptor2 != null) {
                        }
                        bArr = null;
                        if (bArr != null) {
                        }
                        newFuture.setRequest(this.f122809b.add(new bjjd(concat, a, stringExtra, str, newFuture, bwqe)));
                        NetworkResponse networkResponse = (NetworkResponse) newFuture.get();
                        parseCharset = HttpHeaderParser.parseCharset(networkResponse.headers, "utf-8");
                        try {
                            jSONObject = new JSONObject(new String(networkResponse.data, parseCharset));
                            str2 = "";
                            if (jSONObject.optString("status").equals("SUCCESS")) {
                            }
                        } catch (JSONException e3) {
                            Log.e("DocumentUploadNetwork", "Could not parse response.", e3);
                            str2 = null;
                        }
                        if (str2 == null) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        parcelFileDescriptor = parcelFileDescriptor2;
                        if (parcelFileDescriptor != null) {
                            try {
                                parcelFileDescriptor.close();
                            } catch (IOException e4) {
                                Log.e("DocumentUtils", "Error closing file descriptor", e4);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    parcelFileDescriptor = parcelFileDescriptor2;
                    if (parcelFileDescriptor != null) {
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
                parcelFileDescriptor2 = null;
                Log.e("DocumentUtils", "Error reading file", e);
                if (parcelFileDescriptor2 != null) {
                    try {
                        parcelFileDescriptor2.close();
                        bArr = null;
                    } catch (IOException e6) {
                        Log.e("DocumentUtils", "Error closing file descriptor", e6);
                        bArr = null;
                        if (bArr != null) {
                        }
                        newFuture.setRequest(this.f122809b.add(new bjjd(concat, a, stringExtra, str, newFuture, bwqe)));
                        NetworkResponse networkResponse2 = (NetworkResponse) newFuture.get();
                        parseCharset = HttpHeaderParser.parseCharset(networkResponse2.headers, "utf-8");
                        jSONObject = new JSONObject(new String(networkResponse2.data, parseCharset));
                        str2 = "";
                        if (jSONObject.optString("status").equals("SUCCESS")) {
                        }
                        if (str2 == null) {
                        }
                    }
                    if (bArr != null) {
                    }
                    newFuture.setRequest(this.f122809b.add(new bjjd(concat, a, stringExtra, str, newFuture, bwqe)));
                    NetworkResponse networkResponse22 = (NetworkResponse) newFuture.get();
                    parseCharset = HttpHeaderParser.parseCharset(networkResponse22.headers, "utf-8");
                    jSONObject = new JSONObject(new String(networkResponse22.data, parseCharset));
                    str2 = "";
                    if (jSONObject.optString("status").equals("SUCCESS")) {
                    }
                    if (str2 == null) {
                    }
                }
                bArr = null;
                if (bArr != null) {
                }
                newFuture.setRequest(this.f122809b.add(new bjjd(concat, a, stringExtra, str, newFuture, bwqe)));
                NetworkResponse networkResponse222 = (NetworkResponse) newFuture.get();
                parseCharset = HttpHeaderParser.parseCharset(networkResponse222.headers, "utf-8");
                jSONObject = new JSONObject(new String(networkResponse222.data, parseCharset));
                str2 = "";
                if (jSONObject.optString("status").equals("SUCCESS")) {
                }
                if (str2 == null) {
                }
            } catch (Throwable th4) {
                th = th4;
                parcelFileDescriptor = null;
                if (parcelFileDescriptor != null) {
                }
                throw th;
            }
            if (bArr != null) {
                str = Base64.encodeToString(bArr, 10);
            } else {
                str = null;
            }
            newFuture.setRequest(this.f122809b.add(new bjjd(concat, a, stringExtra, str, newFuture, bwqe)));
            NetworkResponse networkResponse2222 = (NetworkResponse) newFuture.get();
            parseCharset = HttpHeaderParser.parseCharset(networkResponse2222.headers, "utf-8");
            try {
                jSONObject = new JSONObject(new String(networkResponse2222.data, parseCharset));
                str2 = "";
                if (jSONObject.optString("status").equals("SUCCESS")) {
                    str2 = jSONObject.optString("document_token");
                }
            } catch (UnsupportedEncodingException e7) {
                String valueOf = String.valueOf(parseCharset);
                Log.e("DocumentUploadNetwork", valueOf.length() == 0 ? new String("unsupported charset: ") : "unsupported charset: ".concat(valueOf), e7);
                str2 = null;
            }
            if (str2 == null) {
                return m103641a();
            }
            Intent a2 = bjfd.m103295a(0);
            a2.putExtra("documentToken", str2);
            return new bjfd(a2);
        } catch (AuthFailureError | InterruptedException | ExecutionException e8) {
            return m103641a();
        }
    }
}
