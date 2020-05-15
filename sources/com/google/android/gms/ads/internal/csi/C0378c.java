package com.google.android.gms.ads.internal.csi;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C0387d;
import com.google.android.gms.ads.internal.util.client.C0633h;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.ads.internal.csi.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0378c {

    /* renamed from: a */
    final BlockingQueue f8279a = new ArrayBlockingQueue(100);

    /* renamed from: b */
    public final LinkedHashMap f8280b = new LinkedHashMap();

    /* renamed from: c */
    public final Map f8281c = new HashMap();

    /* renamed from: d */
    public String f8282d;

    /* renamed from: e */
    public Context f8283e;

    /* renamed from: f */
    public String f8284f;

    /* renamed from: g */
    public AtomicBoolean f8285g;

    /* renamed from: h */
    public File f8286h;

    /* renamed from: i */
    private final HashSet f8287i = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map mo6610a(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                String str3 = (String) linkedHashMap.get(str);
                C0383h hVar = (C0383h) this.f8281c.get(str);
                if (hVar == null) {
                    hVar = C0383h.f8288a;
                }
                linkedHashMap.put(str, hVar.mo6614a(str3, str2));
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public final void mo6611a(C0386k kVar) {
        this.f8279a.offer(kVar);
    }

    /* renamed from: a */
    public final void mo6612a(String str) {
        if (!this.f8287i.contains(str)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("sdkVersion", this.f8284f);
            linkedHashMap.put("ue", str);
            mo6613a(mo6610a(this.f8280b, linkedHashMap), "");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileOutputStream.<init>(java.lang.String, boolean):void throws java.io.FileNotFoundException}
      ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0087 A[SYNTHETIC, Splitter:B:32:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0091 A[SYNTHETIC, Splitter:B:39:0x0091] */
    /* renamed from: a */
    public final void mo6613a(Map map, String str) {
        Uri.Builder buildUpon = Uri.parse(this.f8282d).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        StringBuilder sb = new StringBuilder(buildUpon.build().toString());
        if (!TextUtils.isEmpty(str)) {
            sb.append("&it=");
            sb.append(str);
        }
        String sb2 = sb.toString();
        if (this.f8285g.get()) {
            File file = this.f8286h;
            if (file != null) {
                FileOutputStream fileOutputStream = null;
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                    try {
                        fileOutputStream2.write(sb2.getBytes());
                        fileOutputStream2.write(10);
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e) {
                            e = e;
                            C0633h.m5673d("CsiReporter: Cannot close file: sdk_csi_data.txt.", e);
                        }
                    } catch (IOException e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        try {
                            C0633h.m5673d("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                            if (fileOutputStream == null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (fileOutputStream != null) {
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    C0633h.m5673d("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream == null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            e = e4;
                            C0633h.m5673d("CsiReporter: Cannot close file: sdk_csi_data.txt.", e);
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e5) {
                            C0633h.m5673d("CsiReporter: Cannot close file: sdk_csi_data.txt.", e5);
                        }
                    }
                    throw th;
                }
            } else {
                C0633h.m5672d("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
            }
        } else {
            C0387d.m5363a().mo6852a(this.f8283e, this.f8284f, sb2);
        }
    }
}
