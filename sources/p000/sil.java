package p000;

import android.util.Log;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* renamed from: sil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sil {
    /* renamed from: a */
    public static String m35352a(VolleyError volleyError) {
        Map map;
        String str;
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse == null || (map = networkResponse.headers) == null || (str = (String) map.get("Content-Type")) == null) {
            return null;
        }
        byte[] bArr = networkResponse.data;
        if (srz.m36173a(bArr)) {
            InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                InputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    byte[] bArr2 = new byte[4096];
                    while (true) {
                        int read = gZIPInputStream.read(bArr2, 0, 4096);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        gZIPInputStream.close();
                    } catch (IOException e) {
                        Log.e("ErrorUtils", e.toString());
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        Log.e("ErrorUtils", e2.toString());
                    }
                    bArr = byteArray;
                } catch (IOException e3) {
                    e = e3;
                    byteArrayInputStream = gZIPInputStream;
                } catch (Throwable th) {
                    th = th;
                    byteArrayInputStream = gZIPInputStream;
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e4) {
                        Log.e("ErrorUtils", e4.toString());
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e5) {
                        Log.e("ErrorUtils", e5.toString());
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
                try {
                    Log.e("ErrorUtils", e.toString());
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e7) {
                        Log.e("ErrorUtils", e7.toString());
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e8) {
                        Log.e("ErrorUtils", e8.toString());
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayInputStream.close();
                    byteArrayOutputStream.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                byteArrayInputStream.close();
                byteArrayOutputStream.close();
                throw th;
            }
        }
        if (str.startsWith("application/json")) {
            sij b = m35354b(volleyError, null);
            if (b != null) {
                return (String) b.f44540b.get("reason");
            }
            return null;
        } else if (str.startsWith("application/x-protobuf")) {
            try {
                bklt bklt = (bklt) bxvk.m124016a(bklt.f124847b, bArr, bxus.m123744c());
                bklu bklu = bklt.f124849a;
                if (bklu == null) {
                    bklu = bklu.f124851b;
                }
                if (bklu.f124853a.size() <= 0) {
                    return null;
                }
                bklu bklu2 = bklt.f124849a;
                if (bklu2 == null) {
                    bklu2 = bklu.f124851b;
                }
                return ((bklv) bklu2.f124853a.get(0)).f124856a;
            } catch (bxwf e9) {
                Log.e("ErrorUtils", e9.toString());
                return null;
            }
        } else if (!str.startsWith("text/html")) {
            return null;
        } else {
            String str2 = new String(bArr);
            if ("Invalid Credentials".equalsIgnoreCase(str2)) {
                return "authError";
            }
            if ("Session Expired".equalsIgnoreCase(str2)) {
                return "expired";
            }
            if ("User Rate Limit Exceeded".equalsIgnoreCase(str2)) {
                return "userRateLimitExceeded";
            }
            return null;
        }
    }

    /* renamed from: b */
    public static sij m35354b(VolleyError volleyError, String str) {
        ArrayList errors;
        sik a = m35353a(volleyError, str);
        if (a == null || (errors = a.getErrors()) == null || errors.size() == 0) {
            return null;
        }
        return (sij) errors.get(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079 A[SYNTHETIC, Splitter:B:30:0x0079] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086 A[SYNTHETIC, Splitter:B:38:0x0086] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0093 A[SYNTHETIC, Splitter:B:45:0x0093] */
    /* renamed from: a */
    public static sik m35353a(VolleyError volleyError, String str) {
        byte[] bArr;
        InputStream inputStream;
        rzz.m34731b(volleyError);
        NetworkResponse networkResponse = volleyError.networkResponse;
        InputStream inputStream2 = null;
        if (!(networkResponse == null || (bArr = networkResponse.data) == null)) {
            try {
                if (srz.m36173a(bArr)) {
                    inputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
                } else {
                    inputStream = new ByteArrayInputStream(bArr);
                }
                try {
                    sim sim = new sim();
                    new sja().mo25625a(inputStream, sim);
                    sik sik = (sik) sim.f44538a.get("error");
                    if (str != null) {
                        if (sik != null) {
                            Log.w(str, sik.toString());
                        }
                    }
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        Log.e("ErrorUtils", "Failed to close input stream", e);
                    }
                    return sik;
                } catch (IOException e2) {
                    e = e2;
                    Log.e("ErrorUtils", "Unable to read error response", e);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return null;
                } catch (siy e3) {
                    try {
                        int i = volleyError.networkResponse.statusCode;
                        StringBuilder sb = new StringBuilder(47);
                        sb.append("Received generic error from server: ");
                        sb.append(i);
                        Log.e("ErrorUtils", sb.toString());
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e4) {
                                Log.e("ErrorUtils", "Failed to close input stream", e4);
                            }
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = inputStream;
                        if (inputStream2 != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e5) {
                            Log.e("ErrorUtils", "Failed to close input stream", e5);
                        }
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
                inputStream = null;
                Log.e("ErrorUtils", "Unable to read error response", e);
                if (inputStream != null) {
                }
                return null;
            } catch (siy e7) {
                inputStream = null;
                int i2 = volleyError.networkResponse.statusCode;
                StringBuilder sb2 = new StringBuilder(47);
                sb2.append("Received generic error from server: ");
                sb2.append(i2);
                Log.e("ErrorUtils", sb2.toString());
                if (inputStream != null) {
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                if (inputStream2 != null) {
                }
                throw th;
            }
        }
        return null;
    }
}
