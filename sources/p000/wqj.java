package p000;

import android.content.Context;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.zip.GZIPInputStream;

/* renamed from: wqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wqj extends whz {

    /* renamed from: b */
    private final String f51152b;

    /* renamed from: c */
    private final boolean f51153c;

    /* renamed from: d */
    private final String f51154d;

    public wqj(Context context, String str, boolean z, String str2) {
        super(context);
        this.f51152b = str;
        this.f51153c = z;
        this.f51154d = str2;
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        InputStream inputStream;
        String readLine;
        String valueOf = String.valueOf(this.f51152b);
        if (valueOf.length() == 0) {
            new String("Reauth account name : ");
        } else {
            "Reauth account name : ".concat(valueOf);
        }
        sbw sbw = wgn.f50624a;
        bxvd da = bslh.f144916f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bslh bslh = (bslh) da.f164949b;
        "me".getClass();
        bslh.f144918a |= 1;
        bslh.f144919b = "me";
        bxvd da2 = bsli.f144923d.mo74144da();
        if (!this.f51153c) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsli bsli = (bsli) da2.f164949b;
            bsli.f144926b = 1;
            bsli.f144925a |= 1;
        } else {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bsli bsli2 = (bsli) da2.f164949b;
            bsli2.f144926b = 2;
            bsli2.f144925a |= 1;
        }
        String str = this.f51154d;
        bsli bsli3 = (bsli) da2.f164949b;
        str.getClass();
        bsli3.f144925a |= 4;
        bsli3.f144927c = str;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bslh bslh2 = (bslh) da.f164949b;
        bsli bsli4 = (bsli) da2.mo74062i();
        bsli4.getClass();
        bslh2.f144920c = bsli4;
        bslh2.f144918a |= 2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bslh bslh3 = (bslh) da.f164949b;
        bslh3.f144922e = 0;
        bslh3.f144918a |= 8;
        try {
            wgo.m41929b();
            wgf a = wgo.m41928a();
            wgo.m41929b();
            ClientContext a2 = wgo.m41927a(this.f51152b);
            bslh bslh4 = (bslh) da.mo74062i();
            sgv sgv = a.f50616a;
            StringBuilder sb = new StringBuilder();
            sb.append("/users/");
            sb.append(shd.m35267a(bslh4.f144919b));
            sb.append("/reauthProofTokens?alt=proto");
            if (!(bslh4 == null || bslh4.f144921d.length() == 0)) {
                sb.append("&versionInfo=");
                sb.append(shd.m35267a(bslh4.f144921d));
            }
            if (bslh4 != null) {
                int a3 = bslo.m115943a(bslh4.f144922e);
                if (a3 != 0) {
                    if (a3 != 1) {
                        sb.append("&delegationType=");
                        int a4 = bslo.m115943a(bslh4.f144922e);
                        if (a4 == 0) {
                            a4 = 1;
                        }
                        sb.append(a4 - 1);
                    }
                }
            }
            String sb2 = sb.toString();
            bsli bsli5 = bslh4.f144920c;
            if (bsli5 == null) {
                bsli5 = bsli.f144923d;
            }
            bsls bsls = (bsls) sgv.mo25513a(a2, 1, sb2, bsli5.serializeToBytes(), bsls.f144946b);
            return new wif(true, 0);
        } catch (gid e) {
            return new wif(false, 2);
        } catch (VolleyError e2) {
            NetworkResponse networkResponse = e2.networkResponse;
            if (networkResponse != null && networkResponse.statusCode == 400) {
                byte[] bArr = networkResponse.data;
                try {
                    if (srz.m36173a(bArr)) {
                        inputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
                    } else {
                        inputStream = new ByteArrayInputStream(bArr);
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    do {
                        readLine = bufferedReader.readLine();
                        if (readLine != null) {
                        }
                    } while (!readLine.toUpperCase(Locale.ENGLISH).contains("INVALID_GRANT"));
                    return new wif(false, 1);
                } catch (IOException e3) {
                    return new wif(false, 2);
                }
            }
            return new wif(false, 2);
        }
    }
}
