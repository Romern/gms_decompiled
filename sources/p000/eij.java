package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.SystemClock;
import android.util.Log;
import com.felicanetworks.cmnctrl.net.DataParser;
import com.felicanetworks.mfc.BuildConfig;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: eij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eij implements ejs {

    /* renamed from: a */
    final URL f15047a = m10482a(eig.f15036a);

    /* renamed from: b */
    private final eme f15048b;

    /* renamed from: c */
    private final eme f15049c;

    /* renamed from: a */
    private static URL m10482a(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid url: ") : "Invalid url: ".concat(valueOf), e);
        }
    }

    public eij(Context context, eme eme, eme eme2) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f15048b = eme2;
        this.f15049c = eme;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List, java.lang.Iterable], assign insn: 0x000f: IGET  (r5v0 ? I:java.lang.Iterable) = (r4v1 ejf) ejf.a java.lang.Iterable */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0520 A[Catch:{ IOException -> 0x0569 }] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0530 A[Catch:{ IOException -> 0x0569 }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0533 A[Catch:{ IOException -> 0x0569 }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x053b A[EDGE_INSN: B:242:0x053b->B:202:0x053b ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    public final ejl mo10161a(ejk ejk) {
        boolean z;
        String str;
        String str2;
        eii eii;
        URL url;
        eii eii2;
        InputStream inputStream;
        HashMap hashMap = new HashMap();
        ejf ejf = (ejf) ejk;
        ? r5 = ejf.f15133a;
        int size = r5.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            eix eix = (eix) r5.get(i);
            String a = eix.mo10162a();
            if (!hashMap.containsKey(a)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(eix);
                hashMap.put(a, arrayList);
            } else {
                ((List) hashMap.get(a)).add(eix);
            }
        }
        bxvd da = eim.f15060b.mo74144da();
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            String str3 = "CctTransportBackend";
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                eix eix2 = (eix) ((List) entry.getValue()).get(z ? 1 : 0);
                bxvd da2 = eip.f15076h.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = z;
                }
                ((eip) da2.f164949b).f15084g = z;
                long currentTimeMillis = System.currentTimeMillis();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = z;
                }
                ((eip) da2.f164949b).f15080c = currentTimeMillis;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = z;
                }
                ((eip) da2.f164949b).f15081d = elapsedRealtime;
                bxvd da3 = ein.f15063c.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = z;
                }
                ((ein) da3.f164949b).f15065a = 4;
                bxvd da4 = eil.f15050i.mo74144da();
                int a2 = eix2.mo10184a("sdk-version");
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = z;
                }
                ((eil) da4.f164949b).f15052a = a2;
                String b = eix2.mo10185b("model");
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = z;
                }
                b.getClass();
                ((eil) da4.f164949b).f15053b = b;
                String b2 = eix2.mo10185b("hardware");
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = z;
                }
                b2.getClass();
                ((eil) da4.f164949b).f15055d = b2;
                String b3 = eix2.mo10185b("device");
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = z;
                }
                b3.getClass();
                ((eil) da4.f164949b).f15056e = b3;
                String b4 = eix2.mo10185b(BuildConfig.FLAVOR_mode);
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = z;
                }
                b4.getClass();
                ((eil) da4.f164949b).f15054c = b4;
                String b5 = eix2.mo10185b("os-uild");
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = z;
                }
                b5.getClass();
                ((eil) da4.f164949b).f15057f = b5;
                String b6 = eix2.mo10185b("manufacturer");
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = z;
                }
                b6.getClass();
                ((eil) da4.f164949b).f15058g = b6;
                String b7 = eix2.mo10185b("fingerprint");
                if (da4.f164950c) {
                    da4.mo74035c();
                    da4.f164950c = z;
                }
                b7.getClass();
                ((eil) da4.f164949b).f15059h = b7;
                eil eil = (eil) da4.mo74062i();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = z;
                }
                eil.getClass();
                ((ein) da3.f164949b).f15066b = eil;
                ein ein = (ein) da3.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = z;
                }
                ein.getClass();
                ((eip) da2.f164949b).f15082e = ein;
                int i2 = 6;
                try {
                    int intValue = Integer.valueOf((String) entry.getKey()).intValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = z;
                    }
                    eip eip = (eip) da2.f164949b;
                    eip.f15078a = 2;
                    eip.f15079b = Integer.valueOf(intValue);
                } catch (NumberFormatException e) {
                    String str4 = (String) entry.getKey();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = z;
                    }
                    eip eip2 = (eip) da2.f164949b;
                    str4.getClass();
                    eip2.f15078a = 6;
                    eip2.f15079b = str4;
                }
                for (eix eix3 : (List) entry.getValue()) {
                    eiv c = eix3.mo10164c();
                    eid eid = c.f15102a;
                    bxvd da5 = eio.f15067h.mo74144da();
                    if (eid.equals(eid.m10480a("proto"))) {
                        bxtx a3 = bxtx.m123261a(c.f15103b);
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = z;
                        }
                        eio eio = (eio) da5.f164949b;
                        a3.getClass();
                        eio.f15069a = i2;
                        eio.f15070b = a3;
                    } else if (eid.equals(eid.m10480a("json"))) {
                        bxtx a4 = bxtx.m123261a(c.f15103b);
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = z;
                        }
                        eio eio2 = (eio) da5.f164949b;
                        if (a4.mo73762f()) {
                            eio2.f15070b = a4.mo73781l();
                            eio2.f15069a = 29;
                        } else {
                            throw new IllegalArgumentException("Byte string is not UTF-8.");
                        }
                    } else {
                        Log.w(ejt.m10551a(str3), String.format("Received event of unsupported encoding %s. Skipping...", eid));
                        z = false;
                        i2 = 6;
                    }
                    long d = eix3.mo10165d();
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    ((eio) da5.f164949b).f15071c = d;
                    long e2 = eix3.mo10166e();
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    ((eio) da5.f164949b).f15073e = e2;
                    String str5 = (String) eix3.mo10168f().get("tz-offset");
                    long longValue = str5 != null ? Long.valueOf(str5).longValue() : 0;
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    ((eio) da5.f164949b).f15074f = longValue;
                    bxvd da6 = eir.f15088c.mo74144da();
                    int a5 = eix3.mo10184a("net-type");
                    if (da6.f164950c) {
                        da6.mo74035c();
                        da6.f164950c = false;
                    }
                    ((eir) da6.f164949b).f15090a = a5;
                    int a6 = eix3.mo10184a("mobile-subtype");
                    if (da6.f164950c) {
                        da6.mo74035c();
                        da6.f164950c = false;
                    }
                    ((eir) da6.f164949b).f15091b = a6;
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    eir eir = (eir) da6.mo74062i();
                    eir.getClass();
                    ((eio) da5.f164949b).f15075g = eir;
                    if (eix3.mo10163b() != null) {
                        int intValue2 = eix3.mo10163b().intValue();
                        if (da5.f164950c) {
                            da5.mo74035c();
                            da5.f164950c = false;
                        }
                        ((eio) da5.f164949b).f15072d = intValue2;
                    }
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    eip eip3 = (eip) da2.f164949b;
                    eio eio3 = (eio) da5.mo74062i();
                    eio3.getClass();
                    if (!eip3.f15083f.mo73666a()) {
                        eip3.f15083f = bxvk.m124021a(eip3.f15083f);
                    }
                    eip3.f15083f.add(eio3);
                    z = false;
                    i2 = 6;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                eim eim = (eim) da.f164949b;
                eip eip4 = (eip) da2.mo74062i();
                eip4.getClass();
                if (!eim.f15062a.mo73666a()) {
                    eim.f15062a = bxvk.m124021a(eim.f15062a);
                }
                eim.f15062a.add(eip4);
                z2 = false;
            } else {
                eim eim2 = (eim) da.mo74062i();
                URL url2 = this.f15047a;
                byte[] bArr = ejf.f15134b;
                if (bArr != null) {
                    try {
                        eig a7 = eig.m10481a(bArr);
                        str = a7.f15040d;
                        if (str == null) {
                            str = null;
                        }
                        String str6 = a7.f15039c;
                        if (str6 != null) {
                            url2 = m10482a(str6);
                        }
                    } catch (IllegalArgumentException e3) {
                        return ejl.m10538d();
                    }
                } else {
                    str = null;
                }
                try {
                    eih eih = new eih(url2, eim2, str);
                    int i3 = 5;
                    while (true) {
                        ejt.m10552a(str3, eih.f15041a);
                        HttpURLConnection httpURLConnection = (HttpURLConnection) eih.f15041a.openConnection();
                        httpURLConnection.setConnectTimeout(30000);
                        httpURLConnection.setReadTimeout(40000);
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setRequestMethod(DataParser.CONNECT_TYPE_POST);
                        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.0.0"));
                        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-protobuf");
                        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                        String str7 = eih.f15043c;
                        if (str7 != null) {
                            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str7);
                        }
                        WritableByteChannel newChannel = Channels.newChannel(httpURLConnection.getOutputStream());
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            try {
                                eih.f15042b.mo73638a(gZIPOutputStream);
                                gZIPOutputStream.close();
                                newChannel.write(ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
                                int responseCode = httpURLConnection.getResponseCode();
                                StringBuilder sb = new StringBuilder(24);
                                sb.append("Status Code: ");
                                sb.append(responseCode);
                                ejt.m10553a(str3, sb.toString());
                                String valueOf = String.valueOf(httpURLConnection.getHeaderField("Content-Type"));
                                ejt.m10553a(str3, valueOf.length() == 0 ? new String("Content-Type: ") : "Content-Type: ".concat(valueOf));
                                String valueOf2 = String.valueOf(httpURLConnection.getHeaderField("Content-Encoding"));
                                ejt.m10553a(str3, valueOf2.length() == 0 ? new String("Content-Encoding: ") : "Content-Encoding: ".concat(valueOf2));
                                if (responseCode != 302) {
                                    if (!(responseCode == 301 || responseCode == 307)) {
                                        if (responseCode == 200) {
                                            String headerField = httpURLConnection.getHeaderField("Content-Encoding");
                                            if (headerField == null || !headerField.equals("gzip")) {
                                                inputStream = httpURLConnection.getInputStream();
                                            } else {
                                                inputStream = new GZIPInputStream(httpURLConnection.getInputStream());
                                            }
                                            eii2 = new eii(BaseMfiEventCallback.TYPE_UNKNOWN_ERROR, null, ((eiq) bxvk.m124010a(eiq.f15085b, inputStream)).f15087a);
                                            inputStream.close();
                                        } else {
                                            eii2 = new eii(responseCode, null, 0);
                                        }
                                        newChannel.close();
                                        eii = eii2;
                                        str2 = str3;
                                        url = eii.f15045b;
                                        if (url == null) {
                                            ejt.m10552a(str2, url);
                                            eih = new eih(eii.f15045b, eih.f15042b, eih.f15043c);
                                        } else {
                                            eih = null;
                                        }
                                        if (eih == null) {
                                            break;
                                        }
                                        i3--;
                                        if (i3 <= 0) {
                                            break;
                                        }
                                        str3 = str2;
                                    }
                                }
                                URL url3 = new URL(httpURLConnection.getHeaderField("Location"));
                                str2 = str3;
                                eii = new eii(responseCode, url3, 0);
                            } catch (Throwable th) {
                                th = th;
                                newChannel.close();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            str2 = str3;
                            newChannel.close();
                            throw th;
                        }
                        try {
                            newChannel.close();
                            url = eii.f15045b;
                            if (url == null) {
                            }
                            if (eih == null) {
                            }
                        } catch (IOException e4) {
                            e = e4;
                            Log.e(ejt.m10551a(str2), "Could not make request to the backend", e);
                            return ejl.m10537c();
                        }
                    }
                    int i4 = eii.f15044a;
                    if (i4 == 200) {
                        return new ejg(1, eii.f15046c);
                    }
                    if (i4 < 500) {
                        if (i4 != 404) {
                            return ejl.m10538d();
                        }
                    }
                    return ejl.m10537c();
                } catch (IOException e5) {
                    e = e5;
                    str2 = str3;
                    Log.e(ejt.m10551a(str2), "Could not make request to the backend", e);
                    return ejl.m10537c();
                }
            }
        }
    }
}
