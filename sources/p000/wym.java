package p000;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.feedback.LogOptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: wym */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wym {

    /* renamed from: a */
    static final String[] f51569a = {"logcat", "-d", "-v", "time"};

    /* renamed from: b */
    static final String[] f51570b = {"logcat", "-d", "-b", "events", "-v", "time"};

    /* renamed from: c */
    static final String[] f51571c = {"logcat", "-d", "-b", "radio", "-v", "time"};

    /* renamed from: d */
    static final Runnable f51572d = new wyi();

    /* renamed from: e */
    static Handler f51573e;

    /* renamed from: f */
    static wyk f51574f;

    /* renamed from: g */
    public static wyl f51575g;

    /* renamed from: h */
    static volatile Process f51576h;

    /* renamed from: i */
    public static LogOptions f51577i;

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c4 A[Catch:{ IOException -> 0x00ca }] */
    /* renamed from: a */
    public static Map m42469a(LogOptions logOptions) {
        InputStream inputStream;
        C1223np npVar = new C1223np();
        npVar.put("event_log", f51570b);
        if (logOptions == null) {
            npVar.put("system_log", f51569a);
        } else {
            if (!TextUtils.isEmpty(logOptions.f31614a)) {
                npVar.put("system_log", (String[]) sqc.m35965c(f51569a, logOptions.f31614a));
            } else {
                npVar.put("system_log", f51569a);
            }
            if (logOptions.f31615b) {
                npVar.put("radio_log", f51571c);
            }
        }
        C1223np npVar2 = new C1223np();
        for (String str : npVar.keySet()) {
            try {
                String[] strArr = (String[]) npVar.get(str);
                Runtime runtime = Runtime.getRuntime();
                List arrayList = new ArrayList();
                try {
                    Process exec = runtime.exec(strArr);
                    f51576h = exec;
                    inputStream = exec.getInputStream();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            arrayList.add(readLine.trim());
                        }
                        if (arrayList.size() > ((int) cdtr.m134946h())) {
                            arrayList = arrayList.subList(arrayList.size() - ((int) cdtr.m134946h()), arrayList.size());
                        }
                        String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        f51576h = null;
                        npVar2.put(str, strArr2);
                    } catch (Throwable th) {
                        th = th;
                        if (inputStream != null) {
                        }
                        f51576h = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = null;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    f51576h = null;
                    throw th;
                }
            } catch (IOException e) {
                bqye.m113758a(e);
            }
        }
        return npVar2;
    }

    /* renamed from: a */
    public static synchronized void m42470a() {
        synchronized (wym.class) {
            if (f51573e == null) {
                f51573e = new adzt(Looper.getMainLooper());
            }
            if (f51574f == null) {
                wyk wyk = new wyk();
                f51574f = wyk;
                wyk.start();
                f51573e.postDelayed(f51572d, 15000);
                return;
            }
            m42471a(f51574f.f51568a);
        }
    }

    /* renamed from: a */
    public static void m42471a(Map map) {
        f51573e.removeCallbacks(f51572d);
        f51573e.post(new wyj(map));
    }
}
