package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: brpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brpm extends AsyncTask {

    /* renamed from: a */
    private static final sek f143132a = new sek("FirebaseAuth", "GetAuthDomainTask");

    /* renamed from: b */
    private final String f143133b;

    /* renamed from: c */
    private final String f143134c;

    /* renamed from: d */
    private final WeakReference f143135d;

    /* renamed from: e */
    private final Uri.Builder f143136e;

    /* renamed from: f */
    private final String f143137f;

    public brpm(String str, String str2, Intent intent, brpo brpo) {
        sdo.m34977c(str);
        this.f143133b = str;
        sdo.m34977c(str2);
        sdo.m34959a(intent);
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        sdo.m34977c(stringExtra);
        Uri.Builder buildUpon = Uri.parse(brpo.mo69769a()).buildUpon();
        Uri.Builder appendQueryParameter = buildUpon.appendPath("getProjectConfig").appendQueryParameter("alt", "proto").appendQueryParameter("key", stringExtra).appendQueryParameter("androidPackageName", str);
        sdo.m34959a((Object) str2);
        appendQueryParameter.appendQueryParameter("sha1Cert", str2);
        this.f143134c = buildUpon.build().toString();
        this.f143135d = new WeakReference(brpo);
        this.f143136e = brpo.mo69768a(intent, str, str2);
        this.f143137f = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void onPostExecute(brpl brpl) {
        String str;
        Uri.Builder builder;
        brpo brpo = (brpo) this.f143135d.get();
        String str2 = null;
        if (brpl != null) {
            str2 = brpl.f143130a;
            str = brpl.f143131b;
        } else {
            str = null;
        }
        if (brpo == null) {
            f143132a.mo25418e("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (!TextUtils.isEmpty(str2) && (builder = this.f143136e) != null) {
            builder.authority(str2);
            brpo.mo69771a(this.f143136e.build(), this.f143133b);
        } else {
            brpo.mo69772a(this.f143133b, brrv.m114516a(str));
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f3, code lost:
        r2 = p000.brpm.f143132a;
        r1 = java.lang.String.valueOf(r1);
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r1).length() + 26);
        r4.append("Null pointer encountered: ");
        r4.append(r1);
        r2.mo25418e(r4.toString(), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x011b, code lost:
        r2 = p000.brpm.f143132a;
        r1 = java.lang.String.valueOf(r1);
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r1).length() + 21);
        r4.append("IOException ocurred: ");
        r4.append(r1);
        r2.mo25418e(r4.toString(), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d7 A[Catch:{ IOException -> 0x011a, NullPointerException -> 0x00f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f2 A[ExcHandler: NullPointerException (r1v3 'e' java.lang.NullPointerException A[CUSTOM_DECLARE]), Splitter:B:4:0x0014] */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        String str;
        ByteArrayOutputStream byteArrayOutputStream;
        Void[] voidArr = (Void[]) objArr;
        if (!TextUtils.isEmpty(this.f143137f)) {
            return brpl.m114368a(this.f143137f);
        }
        try {
            HttpURLConnection a = ((brpo) this.f143135d.get()).mo69770a(new URL(this.f143134c));
            a.addRequestProperty("Content-Type", "application/x-protobuf");
            int responseCode = a.getResponseCode();
            if (responseCode != 200) {
                if (a.getResponseCode() >= 400) {
                    InputStream errorStream = a.getErrorStream();
                    if (errorStream != null) {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[128];
                        while (true) {
                            int read = errorStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        str = new String(byteArray);
                    } else {
                        str = "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again.";
                    }
                } else {
                    str = null;
                }
                f143132a.mo25418e(String.format("Error getting project config. Failed with %s %s", str, Integer.valueOf(responseCode)), new Object[0]);
                brpl brpl = new brpl();
                brpl.f143131b = str;
                return brpl;
            }
            for (String str2 : ((bkkn) bxvk.m124011a(bkkn.f124589b, a.getInputStream(), bxus.m123744c())).f124591a) {
                if (str2.endsWith("firebaseapp.com") || str2.endsWith("web.app")) {
                    return brpl.m114368a(str2);
                }
                while (r1.hasNext()) {
                }
            }
            return null;
        } catch (IOException e) {
            sek sek = f143132a;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 75);
            sb.append("Error parsing error message from response body in getErrorMessageFromBody. ");
            sb.append(valueOf);
            sek.mo25416d(sb.toString(), new Object[0]);
            str = null;
        } catch (NullPointerException e2) {
        } catch (Throwable th) {
            byteArrayOutputStream.close();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onCancelled(Object obj) {
        brpl brpl = (brpl) obj;
        onPostExecute(null);
    }
}
