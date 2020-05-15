package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.format.Time;
import com.felicanetworks.cmnctrl.net.DataParser;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;

/* renamed from: lzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lzu {

    /* renamed from: a */
    public static final String f33299a = String.format("Gms-Backup/%s (gzip)", 201515033);

    /* renamed from: b */
    private static final lvn f33300b = new lvn("BackupHttpRequestUtil");

    /* renamed from: c */
    private final Context f33301c;

    /* renamed from: d */
    private final lzz f33302d;

    public lzu(Context context, lzz lzz) {
        this.f33301c = context;
        this.f33302d = lzz;
    }

    /* JADX WARNING: Removed duplicated region for block: B:94:0x0203  */
    /* renamed from: a */
    private final ltq m24732a(String str, byte[] bArr, bjr bjr) {
        HttpURLConnection httpURLConnection;
        String headerField;
        int i;
        int i2;
        int i3;
        bjo bjo;
        int i4;
        int i5;
        int i6;
        bjr bjr2 = bjr;
        DataOutputStream dataOutputStream = null;
        try {
            httpURLConnection = lzy.m24743a(this.f33301c, new URL(str));
            try {
                httpURLConnection.setRequestMethod(DataParser.CONNECT_TYPE_POST);
                httpURLConnection.setRequestProperty("User-Agent", f33299a);
                httpURLConnection.setRequestProperty("Content-Type", "application/octet-stream");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                DataOutputStream dataOutputStream2 = new DataOutputStream(httpURLConnection.getOutputStream());
                try {
                    dataOutputStream2.write(bArr);
                    dataOutputStream2.flush();
                    dataOutputStream2.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    f33300b.mo25414c("Http Response Code: %d", Integer.valueOf(responseCode));
                    if (!(responseCode != 503 || (headerField = httpURLConnection.getHeaderField("Retry-After")) == null || bjr2 == null)) {
                        try {
                            bjr2.mo3201b((Long.parseLong(headerField) * 1000) + System.currentTimeMillis());
                        } catch (NumberFormatException e) {
                            Matcher matcher = bjp.f3395a.matcher(headerField);
                            if (matcher.find()) {
                                i3 = bjp.m3218a(matcher.group(1));
                                i = bjp.m3219b(matcher.group(2));
                                i2 = bjp.m3220c(matcher.group(3));
                                bjo = bjp.m3221d(matcher.group(4));
                            } else {
                                Matcher matcher2 = bjp.f3396b.matcher(headerField);
                                if (matcher2.find()) {
                                    int b = bjp.m3219b(matcher2.group(1));
                                    int a = bjp.m3218a(matcher2.group(2));
                                    bjo d = bjp.m3221d(matcher2.group(3));
                                    i2 = bjp.m3220c(matcher2.group(4));
                                    bjo = d;
                                    i = b;
                                    i3 = a;
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                            if (i2 >= 2038) {
                                i4 = 2038;
                            } else {
                                i4 = i2;
                            }
                            if (i2 < 2038) {
                                i5 = i;
                            } else {
                                i5 = 0;
                            }
                            if (i2 < 2038) {
                                i6 = i3;
                            } else {
                                i6 = 1;
                            }
                            Time time = new Time("UTC");
                            time.set(bjo.f3394c, bjo.f3393b, bjo.f3392a, i6, i5, i4);
                            bjr2.mo3201b(time.toMillis(false));
                        } catch (IllegalArgumentException e2) {
                            f33300b.mo25418e("Invalid Retry-After date: %s", headerField);
                        }
                        f33300b.mo25412b("got 503 Retry-After: %s", headerField);
                    }
                    if (responseCode != 200) {
                        String str2 = new String(boav.m111020a(httpURLConnection.getErrorStream()), "UTF-8");
                        throw new mbf(str2.length() == 0 ? new String("Server rejected http request: ") : "Server rejected http request: ".concat(str2), responseCode);
                    } else if (httpURLConnection.getInputStream() != null) {
                        bxuc a2 = bxuc.m123416a(httpURLConnection.getInputStream());
                        bxus c = bxus.m123744c();
                        GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) ltq.f32971i.mo74142c(4);
                        bxxv a3 = bxxm.f165037a.mo74228a(GeneratedMessageLite);
                        a3.mo74220a(GeneratedMessageLite, bxud.m123454a(a2), c);
                        a3.mo74225d(GeneratedMessageLite);
                        GeneratedMessageLite.m124027b(GeneratedMessageLite);
                        ltq ltq = (ltq) GeneratedMessageLite;
                        if ((ltq.f32973a & 8) != 0) {
                            lzz lzz = this.f33302d;
                            String str3 = ltq.f32976d;
                            if (ccoj.m131012b()) {
                                SharedPreferences.Editor edit = lzz.f33320b.edit();
                                edit.putString("versionInfoToken", str3);
                                edit.putLong("versionInfoTimestamp", System.currentTimeMillis());
                                edit.apply();
                            }
                        }
                        srz.m36171a((Closeable) null);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return ltq;
                    } else {
                        throw new IOException("Missing response body");
                    }
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    srz.m36171a(dataOutputStream);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (IOException e3) {
                if (!(e3.getCause() instanceof bxwf)) {
                    throw new bxwf(e3.getMessage());
                }
                throw ((bxwf) e3.getCause());
            } catch (RuntimeException e4) {
                if (e4.getCause() instanceof bxwf) {
                    throw ((bxwf) e4.getCause());
                }
                throw e4;
            } catch (rti e5) {
                lzz.f33319a.mo25415d("Error writing version_info to shared preferences", e5, new Object[0]);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            srz.m36171a(dataOutputStream);
            if (httpURLConnection != null) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static lzu m24733a(Context context) {
        return new lzu(context, lzz.m24744a(context));
    }

    /* renamed from: a */
    private static void m24734a(Exception exc, lzx lzx, int i) {
        f33300b.mo25417e("Transient error encountered during %s. Will retry %d more times.", exc, lzx, Integer.valueOf(i));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: lzu.a(bxvd, bjr, boolean):ltq
     arg types: [bxvd, ?[OBJECT, ARRAY], int]
     candidates:
      lzu.a(java.lang.String, byte[], bjr):ltq
      lzu.a(java.lang.Exception, lzx, int):void
      lzu.a(bxvd, bjr, boolean):ltq */
    /* renamed from: a */
    public final ltq mo19791a(bxvd bxvd) {
        return mo19792a(bxvd, (bjr) null, false);
    }

    /* renamed from: a */
    public final ltq mo19792a(bxvd bxvd, bjr bjr, boolean z) {
        bmxv a = this.f33302d.mo19797a();
        if (a.mo66813a()) {
            String str = (String) a.mo66814b();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            lth lth = (lth) bxvd.f164949b;
            lth lth2 = lth.f32914q;
            str.getClass();
            lth.f32916a |= 1024;
            lth.f32924i = str;
        }
        byte[] k = ((lth) bxvd.mo74062i()).serializeToBytes();
        int i = 1;
        f33300b.mo25412b("sending request: %d bytes", Integer.valueOf(k.length));
        lzx a2 = lzx.m24742a(bxvd);
        String a3 = maa.m24747a(this.f33301c);
        f33300b.mo25412b("Routing request of type %s", a2);
        switch (a2.ordinal()) {
            case 0:
                if (ccni.f179539a.mo6606a().mo76456a()) {
                    if (z) {
                        a3 = a3.concat("/backup?userinitiated=true");
                        break;
                    } else {
                        a3 = a3.concat("/backup?userinitiated=false");
                        break;
                    }
                } else {
                    a3 = a3.concat("/backup");
                    break;
                }
            case 1:
            case 6:
                a3 = a3.concat("/restore");
                break;
            case 2:
                a3 = a3.concat("/listdevices");
                break;
            case 3:
                a3 = a3.concat("/cleardevice");
                break;
            case 4:
            case 5:
                break;
            default:
                f33300b.mo25412b("Unknown type of request when routing url", new Object[0]);
                break;
        }
        f33300b.mo25412b("request url: %s", a3);
        int ordinal = a2.ordinal();
        if (ordinal == 0) {
            i = (int) cckt.f179251a.mo6606a().mo76195c();
        } else if (ordinal == 1) {
            i = (int) cckt.f179251a.mo6606a().mo76199g();
        } else if (ordinal == 2) {
            i = (int) cckt.f179251a.mo6606a().mo76198f();
        } else if (ordinal == 3) {
            i = (int) cckt.f179251a.mo6606a().mo76196d();
        } else if (ordinal == 6) {
            i = (int) cckt.f179251a.mo6606a().mo76197e();
        }
        int i2 = i - 1;
        while (i2 > 0) {
            try {
                return m24732a(a3, k, bjr);
            } catch (mbf e) {
                if (e.f33375a != 503) {
                    m24734a(e, a2, i2);
                    i2--;
                } else {
                    throw e;
                }
            } catch (IOException e2) {
                m24734a(e2, a2, i2);
                i2--;
            }
        }
        return m24732a(a3, k, bjr);
    }
}
