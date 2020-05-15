package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.format.DateFormat;
import com.google.android.gms.net.PlayServicesCronetProvider;
import com.google.android.gms.security.settings.VerifyAppsSettingsChimeraActivity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: apum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apum extends apuh {

    /* renamed from: a */
    public static final long f84928a = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: b */
    public static final long f84929b = 102400;

    /* renamed from: c */
    private static final Map f84930c = new HashMap();

    static {
        apum.class.getSimpleName();
    }

    /* renamed from: a */
    public static long m71042a(long j) {
        return j * 1073741824;
    }

    /* renamed from: b */
    public static byte[] m71050b(File file) {
        FileInputStream fileInputStream;
        if (file != null) {
            if (f84930c.containsKey(file)) {
                return (byte[]) f84930c.get(file);
            }
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                try {
                    fileInputStream = new FileInputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read <= 0) {
                            fileInputStream.close();
                            byte[] digest = instance.digest();
                            f84930c.put(file, digest);
                            return digest;
                        }
                        instance.update(bArr, 0, read);
                    }
                } catch (IOException e) {
                    return null;
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            } catch (NoSuchAlgorithmException e2) {
            }
        }
        return null;
        throw th;
    }

    /* renamed from: c */
    public static boolean m71051c(Context context) {
        return new apgy(context).mo47204c();
    }

    /* renamed from: d */
    public static boolean m71052d(Context context) {
        int i = Build.VERSION.SDK_INT;
        return m71053e(context) < 1500000000;
    }

    /* renamed from: e */
    public static long m71053e(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    /* renamed from: f */
    public static boolean m71054f(Context context) {
        int i = Build.VERSION.SDK_INT;
        return m71053e(context) >= m71042a(cgkt.f187180a.mo6606a().mo84011N());
    }

    /* renamed from: a */
    public static Intent m71043a(Context context, int i) {
        if (cgkt.m145936h()) {
            Intent intent = new Intent("com.google.android.finsky.PLAY_PROTECT").addCategory("android.intent.category.DEFAULT").setPackage("com.android.vending");
            if (cgkt.m145939k()) {
                intent.putExtra("gpp_home_user_entry_point", i - 1);
            }
            if (!context.getPackageManager().queryIntentActivities(intent, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE).isEmpty()) {
                return intent;
            }
        }
        Intent a = apuh.m71021a(context, VerifyAppsSettingsChimeraActivity.class);
        if (cgkt.m145939k()) {
            a.putExtra("gpp_home_user_entry_point", i - 1);
        }
        return a;
    }

    /* renamed from: a */
    public static apul m71044a(Context context, long j, long j2) {
        String str;
        if (j2 > j) {
            return null;
        }
        long j3 = j - j2;
        if (j3 < 691200000) {
            int i = (int) (j3 / 86400000);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d");
            if (!simpleDateFormat.format(Long.valueOf(j)).equals(simpleDateFormat.format(Long.valueOf((((long) i) * 86400000) + j2)))) {
                i++;
            }
            int i2 = 1;
            if (i <= 1) {
                if (DateFormat.is24HourFormat(context)) {
                    str = new SimpleDateFormat("HH:mm").format(new Date(j2));
                } else {
                    str = java.text.DateFormat.getTimeInstance(3, context.getResources().getConfiguration().locale).format(new Date(j2));
                }
                if (i != 0) {
                    i2 = 2;
                }
                return new apul(i2, str);
            } else if (i <= 7) {
                return new apul(i);
            }
        }
        if (j3 < 28857600000L) {
            return new apul(4, new SimpleDateFormat("MMMM d").format(new Date(j2)));
        }
        return null;
    }

    /* renamed from: a */
    public static File m71045a(String str, Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                return new File(applicationInfo.sourceDir);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m71046a(StringBuilder sb, String str, String str2) {
        try {
            sb.append("&");
            sb.append(URLEncoder.encode(str, "UTF-8"));
            sb.append("=");
            if (str2 == null) {
                str2 = "";
            }
            sb.append(URLEncoder.encode(str2, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("UTF-8 should be always supported", e);
        }
    }

    /* renamed from: a */
    public static void m71047a(svk svk, suh suh, int i, int i2) {
        svk.mo26086b(i);
        svk.mo26106c(i2);
        svk.mo26102a(suh);
    }

    /* renamed from: a */
    public static boolean m71048a(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0085 A[SYNTHETIC, Splitter:B:45:0x0085] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009a A[SYNTHETIC, Splitter:B:56:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00a6  */
    /* renamed from: a */
    public static byte[] m71049a(String str, int i, Context context) {
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        if (i != 0) {
            shr.m35316b(i);
        }
        InputStream inputStream2 = null;
        try {
            URL url = new URL(str);
            if (!cgkt.m145934f()) {
                httpURLConnection = (HttpURLConnection) stp.m36306a(url, i);
            } else {
                shr.m35316b(i);
                httpURLConnection = (HttpURLConnection) new PlayServicesCronetProvider(context).createBuilder().build().openConnection(url);
            }
            try {
                if (httpURLConnection.getResponseCode() == 200) {
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read < 0) {
                                break;
                            } else if (read > 0) {
                                byteArrayOutputStream.write(bArr, 0, read);
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e) {
                            }
                        }
                        if (httpURLConnection != null) {
                            stp.m36307a(httpURLConnection);
                        }
                        if (i != 0) {
                            shr.m35312a();
                        }
                        return byteArray;
                    } catch (IOException e2) {
                    } catch (Throwable th) {
                        httpURLConnection2 = httpURLConnection;
                        th = th;
                        inputStream2 = inputStream;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException e3) {
                            }
                        }
                        if (httpURLConnection2 != null) {
                            stp.m36307a(httpURLConnection2);
                        }
                        if (i != 0) {
                            shr.m35312a();
                        }
                        throw th;
                    }
                } else {
                    if (httpURLConnection != null) {
                        stp.m36307a(httpURLConnection);
                    }
                    if (i != 0) {
                        shr.m35312a();
                    }
                    return null;
                }
            } catch (IOException e4) {
                inputStream = null;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException e5) {
                    }
                }
                if (httpURLConnection != null) {
                    stp.m36307a(httpURLConnection);
                }
                if (i != 0) {
                    shr.m35312a();
                }
                return null;
            } catch (Throwable th2) {
                httpURLConnection2 = httpURLConnection;
                th = th2;
                if (inputStream2 != null) {
                }
                if (httpURLConnection2 != null) {
                }
                if (i != 0) {
                }
                throw th;
            }
        } catch (IOException e6) {
            httpURLConnection = null;
            inputStream = null;
            if (inputStream != null) {
            }
            if (httpURLConnection != null) {
            }
            if (i != 0) {
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection2 = null;
            if (inputStream2 != null) {
            }
            if (httpURLConnection2 != null) {
            }
            if (i != 0) {
            }
            throw th;
        }
    }
}
