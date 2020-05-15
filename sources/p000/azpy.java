package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: azpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azpy {

    /* renamed from: a */
    private static azpy f99861a;

    /* renamed from: b */
    private final Map f99862b = new ConcurrentHashMap();

    private azpy() {
    }

    /* renamed from: a */
    private static long m86120a(Long l) {
        if (l != null) {
            return l.longValue();
        }
        return 0;
    }

    /* renamed from: c */
    private static PackageInfo m86123c() {
        int i = Build.VERSION.SDK_INT;
        return WebView.getCurrentWebViewPackage();
    }

    /* renamed from: b */
    public final void mo55206b() {
        this.f99862b.clear();
    }

    /* renamed from: a */
    public static synchronized azpy m86121a() {
        azpy azpy;
        synchronized (azpy.class) {
            if (f99861a == null) {
                f99861a = new azpy();
            }
            azpy = f99861a;
        }
        return azpy;
    }

    /* renamed from: a */
    public static final void m86122a(String str, String str2, Object... objArr) {
        if (cfgs.m139393M()) {
            azoj.m85930a(str, str2, objArr);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* renamed from: a */
    public final void mo55204a(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        azpy azpy = this;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                if (cfgs.f183989a.mo6606a().mo81162R()) {
                    azph a = azph.m85998a(context);
                    bnhe a2 = bnhe.m109413a(azpy.f99862b);
                    PackageInfo c = m86123c();
                    bxvd b = a.mo55164b(395, 0, null, null, null, null);
                    for (bopw bopw : a2.keySet()) {
                        bxvd da = boqp.f134302d.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boqp boqp = (boqp) da.f164949b;
                        boqp.f134305b = bopw.mo3214a();
                        boqp.f134304a |= 1;
                        long longValue = ((Long) a2.get(bopw)).longValue();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        boqp boqp2 = (boqp) da.f164949b;
                        boqp2.f134304a |= 2;
                        boqp2.f134306c = longValue;
                        boqp boqp3 = (boqp) da.mo74062i();
                        if (b.f164950c) {
                            b.mo74035c();
                            b.f164950c = false;
                        }
                        boqd boqd = (boqd) b.f164949b;
                        boqd boqd2 = boqd.f134234x;
                        boqp3.getClass();
                        if (!boqd.f134256u.mo73666a()) {
                            boqd.f134256u = bxvk.m124021a(boqd.f134256u);
                        }
                        boqd.f134256u.add(boqp3);
                    }
                    if (memoryInfo != null) {
                        bxvd da2 = boqk.f134283f.mo74144da();
                        long j = memoryInfo.totalMem / 1000;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        boqk boqk = (boqk) da2.f164949b;
                        boqk.f134285a |= 1;
                        boqk.f134286b = j;
                        long j2 = memoryInfo.availMem / 1000;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        boqk boqk2 = (boqk) da2.f164949b;
                        boqk2.f134285a |= 2;
                        boqk2.f134287c = j2;
                        long j3 = memoryInfo.threshold / 1000;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        boqk boqk3 = (boqk) da2.f164949b;
                        boqk3.f134285a |= 4;
                        boqk3.f134288d = j3;
                        boolean z = memoryInfo.lowMemory;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        boqk boqk4 = (boqk) da2.f164949b;
                        boqk4.f134285a |= 8;
                        boqk4.f134289e = z;
                        boqk boqk5 = (boqk) da2.mo74062i();
                        if (b.f164950c) {
                            b.mo74035c();
                            b.f164950c = false;
                        }
                        boqd boqd3 = (boqd) b.f164949b;
                        boqd boqd4 = boqd.f134234x;
                        boqk5.getClass();
                        boqd3.f134257v = boqk5;
                        boqd3.f134236a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                    }
                    if (c != null) {
                        bxvd da3 = boqo.f134297d.mo74144da();
                        String str = c.packageName;
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        boqo boqo = (boqo) da3.f164949b;
                        str.getClass();
                        boqo.f134299a |= 1;
                        boqo.f134300b = str;
                        String str2 = c.versionName;
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        boqo boqo2 = (boqo) da3.f164949b;
                        str2.getClass();
                        boqo2.f134299a |= 2;
                        boqo2.f134301c = str2;
                        boqo boqo3 = (boqo) da3.mo74062i();
                        if (b.f164950c) {
                            b.mo74035c();
                            b.f164950c = false;
                        }
                        boqd boqd5 = (boqd) b.f164949b;
                        boqd boqd6 = boqd.f134234x;
                        boqo3.getClass();
                        boqd5.f134258w = boqo3;
                        boqd5.f134236a |= 1048576;
                    }
                    a.mo55158a(b, (LocalEntityId) null);
                }
                if (cfgs.m139393M() && !azpy.f99862b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(azpy.f99862b.entrySet());
                    Collections.sort(arrayList, new azpx());
                    StringBuilder sb = new StringBuilder();
                    long longValue2 = ((Long) ((Map.Entry) arrayList.get(0)).getValue()).longValue();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Map.Entry entry = (Map.Entry) arrayList.get(i);
                        long longValue3 = ((Long) entry.getValue()).longValue();
                        sb.append(((bopw) entry.getKey()).name());
                        sb.append(":");
                        sb.append(longValue3);
                        sb.append(" - \t");
                        sb.append(longValue3 - longValue2);
                        sb.append("\n");
                        i++;
                        azpy = this;
                        longValue2 = longValue3;
                    }
                    long a3 = m86120a((Long) azpy.f99862b.get(bopw.ON_CREATE_ENTRY_ACTIVITY));
                    long a4 = m86120a((Long) azpy.f99862b.get(bopw.ON_NEW_INTENT_ENTRY_ACTIVITY));
                    long a5 = m86120a((Long) azpy.f99862b.get(bopw.ON_CREATE_VIEW_WEB_APP_FRAGMENT));
                    long a6 = m86120a((Long) azpy.f99862b.get(bopw.WEBVIEW_LOAD_URL_INDEX_PAGE));
                    long a7 = m86120a((Long) azpy.f99862b.get(bopw.WEBVIEW_LOADING_RES_INDEX_PAGE));
                    long a8 = m86120a((Long) azpy.f99862b.get(bopw.WEBVIEW_LOADING_RES_JS_BUNDLE));
                    ActivityManager.MemoryInfo memoryInfo2 = memoryInfo;
                    long a9 = m86120a((Long) azpy.f99862b.get(bopw.WEB_APP_LOADED_JS_STARTED));
                    long a10 = m86120a((Long) azpy.f99862b.get(bopw.WEB_APP_UI_DISPLAYED_ALL_DONE));
                    long a11 = m86120a((Long) azpy.f99862b.get(bopw.CHECK_REGISTRATION));
                    long a12 = m86120a((Long) azpy.f99862b.get(bopw.CONVERSATION_ID_RECEIVED));
                    sb.append("----\nEntry-WebUIDisplayed: ");
                    sb.append(a10);
                    sb.append("-");
                    sb.append(Math.max(a3, a4));
                    sb.append("=");
                    sb.append(a10 - Math.max(a3, a4));
                    sb.append("\nLoading/parsing index+JS: ");
                    sb.append(a9);
                    sb.append("-");
                    sb.append(a6);
                    sb.append("=");
                    sb.append(a9 - a6);
                    sb.append("\nCreate webview: ");
                    sb.append(a7);
                    sb.append("-");
                    sb.append(a5);
                    sb.append("=");
                    sb.append(a7 - a5);
                    sb.append("\nLoading index: ");
                    sb.append(a8);
                    sb.append("-");
                    sb.append(a7);
                    sb.append("=");
                    sb.append(a8 - a7);
                    sb.append("\nLoading JS: ");
                    sb.append(a9);
                    sb.append("-");
                    sb.append(a8);
                    sb.append("=");
                    sb.append(a9 - a8);
                    sb.append("\nLoading content: ");
                    sb.append(a10);
                    sb.append("-");
                    sb.append(Math.max(a9, a12));
                    sb.append("=");
                    sb.append(a10 - Math.max(a9, a12));
                    sb.append("\n----\nLoading reg/convId: ");
                    sb.append(a12);
                    sb.append("-");
                    sb.append(a11);
                    sb.append("=");
                    sb.append(a12 - a11);
                    String str3 = "\n";
                    sb.append(str3);
                    if (memoryInfo2 != null) {
                        sb.append("Memory info total/avail/threshold/is_low: ");
                        sb.append(memoryInfo2.totalMem);
                        sb.append("/");
                        sb.append(memoryInfo2.availMem);
                        sb.append("/");
                        sb.append(memoryInfo2.threshold);
                        sb.append("/");
                        sb.append(memoryInfo2.lowMemory);
                        sb.append("/\n");
                    }
                    PackageInfo c2 = m86123c();
                    if (c2 != null) {
                        sb.append("WebView pkg: ");
                        sb.append(c2.packageName);
                        sb.append(c2.versionName);
                        sb.append(str3);
                    }
                    String valueOf = String.valueOf(sb);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 21);
                    sb2.append("-- profiling data --\n");
                    sb2.append(valueOf);
                    m86122a("LTProfilingUtils", sb2.toString(), new Object[0]);
                    return;
                }
            }
        } catch (ClassCastException e) {
        }
        memoryInfo = null;
        if (cfgs.f183989a.mo6606a().mo81162R()) {
        }
        if (cfgs.m139393M()) {
        }
    }

    /* renamed from: a */
    public final void mo55205a(bopw bopw, long j) {
        this.f99862b.put(bopw, Long.valueOf(j));
    }
}
