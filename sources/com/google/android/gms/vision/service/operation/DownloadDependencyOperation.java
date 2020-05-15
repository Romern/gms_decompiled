package com.google.android.gms.vision.service.operation;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.vision.service.DependencyBroadcastReceiver;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DownloadDependencyOperation extends IntentOperation {

    /* renamed from: a */
    static Map f109720a = new HashMap(bnhe.m109411a("vision.barcode", avzq.UNKNOWN, "vision.face", avzq.UNKNOWN, "vision.ocr", avzq.UNKNOWN, "vision.ica", avzq.UNKNOWN));

    /* renamed from: b */
    static Map f109721b = new HashMap(bnhe.m109411a("vision.barcode", 0, "vision.face", 0, "vision.ocr", 0, "vision.ica", 0));

    /* renamed from: e */
    private static final String[] f109722e;

    /* renamed from: f */
    private static final bnhe f109723f = bnhe.m109411a("barcode", "vision.barcode", "face", "vision.face", "ocr", "vision.ocr", "ica", "vision.ica");

    /* renamed from: c */
    boolean f109724c = false;

    /* renamed from: d */
    boolean f109725d = false;

    /* renamed from: g */
    private Set f109726g;

    /* renamed from: h */
    private boolean f109727h;

    /* renamed from: i */
    private avzn f109728i;

    /* renamed from: j */
    private Context f109729j;

    /* renamed from: k */
    private int f109730k;

    /* renamed from: l */
    private avzp f109731l;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class DownloadCompleteIntentOperation extends IntentOperation {
        public final void onHandleIntent(Intent intent) {
            new DependencyBroadcastReceiver().onReceive(getApplicationContext(), intent);
        }
    }

    static {
        String[] a = avza.m79537a();
        f109722e = a;
        avxz.m79527b("Supported ABIS: %s", Arrays.toString(a));
    }

    /* renamed from: a */
    private final boolean m93785a(String str) {
        ModuleManager.FeatureCheck featureCheck = new ModuleManager.FeatureCheck();
        featureCheck.checkFeatureAtAnyVersion(str);
        return ModuleManager.get(this).checkFeaturesAreAvailable(featureCheck) == 0;
    }

    public final void onCreate() {
        this.f109729j = getApplicationContext();
        this.f109728i = new avzn(this.f109729j);
    }

    public final void onDestroy() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avzo.a(android.content.Context, java.util.Set, boolean):void
     arg types: [android.content.Context, java.util.Set, int]
     candidates:
      avzo.a(android.content.Context, java.lang.String, boolean):void
      avzo.a(android.content.Context, java.util.Set, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03ac, code lost:
        if (r9.equals(1) == false) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0203, code lost:
        if (r0 != false) goto L_0x0205;
     */
    public final void onHandleIntent(Intent intent) {
        avzq avzq;
        boolean z;
        int i;
        Intent intent2 = intent;
        try {
            File file = new File(this.f109729j.getFilesDir(), "com.google.android.gms.vision");
            File a = avzc.m79539a(this.f109729j);
            if (file.exists()) {
                if (a.isDirectory()) {
                    if (a.list() != null && a.list().length == 0) {
                        Object[] objArr = {file.getAbsolutePath(), a.getAbsolutePath()};
                        a.delete();
                        file.renameTo(a);
                    }
                }
                new Object[1][0] = file.getAbsolutePath();
                srj.m36120a(file);
            }
        } catch (NullPointerException | SecurityException e) {
            avxz.m79526a(e, "Exception thrown when migrating old engine files to new directory.", new Object[0]);
        }
        this.f109726g = new HashSet(intent2.getStringArrayListExtra("deps"));
        this.f109727h = intent2.getBooleanExtra("prefetch", false);
        this.f109730k = intent2.getIntExtra("ttl", 30);
        for (String str : this.f109726g) {
            new Object[1][0] = str;
            avzn avzn = this.f109728i;
            TreeSet treeSet = new TreeSet(avzo.m79551b(avzn.f94117b));
            if (!treeSet.contains(str)) {
                treeSet.add(str.trim());
            }
            treeSet.retainAll(avzn.f94116a);
            avzo.m79547a(avzn.f94117b).edit().putStringSet("DEPS2", treeSet).apply();
        }
        Set<String> a2 = this.f109728i.mo51762a();
        Integer num = null;
        if (!chef.f188522a.mo6606a().mo85171e()) {
            this.f109724c = false;
            for (String str2 : a2) {
                avxz.m79527b("Requesting optional module download of %s.", str2);
                ModuleManager.FeatureRequest featureRequest = new ModuleManager.FeatureRequest();
                String str3 = (String) f109723f.get(str2);
                if (str3 != null) {
                    if (!f109720a.containsKey(str3)) {
                        avxz.m79525a("Unknown feature %s.", str3);
                        avzq = avzq.ERROR;
                    } else {
                        avzq avzq2 = (avzq) f109720a.get(str3);
                        if (m93785a(str3)) {
                            avzq = avzq2 == avzq.REQUEST_PENDING ? avzq.DOWNLOAD_COMPLETE : avzq.AVAILABLE;
                        } else {
                            avzq = avzq2 == avzq.REQUEST_PENDING ? avzq.REQUEST_PENDING : avzq.UNKNOWN;
                        }
                    }
                    int ordinal = avzq.ordinal();
                    if (ordinal == 0) {
                        File a3 = avzr.m79552a(this.f109729j, str2);
                        if (a3 != null) {
                            avzr.m79553a(a3);
                        }
                        featureRequest.requestFeatureAtLatestVersion(str3);
                        featureRequest.setUrgent();
                        try {
                            if (!ModuleManager.get(this).requestFeatures(featureRequest)) {
                                avxz.m79525a("Feature request of %s failed.", str3);
                                z = false;
                            } else {
                                Object[] objArr2 = {str2, str3};
                                z = true;
                            }
                        } catch (IllegalStateException e2) {
                            avxz.m79526a(e2, "Feature request failed.  Could not determine module ID", new Object[0]);
                            z = false;
                        }
                        if (z) {
                            f109720a.put(str3, avzq.REQUEST_PENDING);
                        }
                        this.f109724c = true;
                    } else if (ordinal == 1) {
                        f109720a.put(str3, avzq.AVAILABLE);
                    } else if (ordinal == 2) {
                        avzs.m79554a(this.f109729j, this.f109728i, str2, this.f109727h);
                        f109720a.put(str3, avzq.DOWNLOAD_COMPLETE);
                    } else if (ordinal == 4) {
                        new Object[1][0] = str3;
                        this.f109724c = true;
                        if (chef.f188522a.mo6606a().mo85170d()) {
                            if (f109721b.containsKey(str3)) {
                                i = ((Integer) f109721b.get(str3)).intValue();
                            } else {
                                i = 0;
                            }
                            int i2 = i + 1;
                            f109721b.put(str3, Integer.valueOf(i2));
                            if (((long) i2) >= chef.f188522a.mo6606a().mo85173g()) {
                                avxz.m79527b("Exceeded maximum feature download tries for %s", str2);
                                f109720a.put(str3, avzq.UNKNOWN);
                                f109721b.put(str3, 0);
                            }
                        }
                    }
                    new Object[1][0] = str2;
                }
                String format = String.format("Request of optional module download of %s failed.", str2);
                avxz.m79528c("%s", format);
                avzs.m79555a(this.f109728i, format, this.f109727h);
            }
            if (this.f109724c && this.f109730k != 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() + (chef.f188522a.mo6606a().mo85167a() * 1000);
                avxz.m79527b("Checking for download completion for %d -- %s", Long.valueOf(elapsedRealtime), TextUtils.join(",", this.f109728i.mo51762a()));
                Intent a4 = avzb.m79538a();
                a4.putExtra("ttl", this.f109730k - 1);
                new Object[1][0] = Integer.valueOf(this.f109730k);
                new skc(this.f109729j).mo25675a("DownloadDependencyOperation", 3, elapsedRealtime, PendingIntent.getBroadcast(this.f109729j, 0, a4, 134217728), (String) null);
                return;
            }
            return;
        }
        ModuleManager.FeatureRequest featureRequest2 = new ModuleManager.FeatureRequest();
        StringBuilder sb = new StringBuilder();
        if (a2 != null) {
            for (String str4 : a2) {
                if (f109723f.containsKey(str4)) {
                    sb.append(", ");
                    sb.append((String) f109723f.get(str4));
                    featureRequest2.requestFeatureAtLatestVersion((String) f109723f.get(str4));
                }
            }
            avzp avzp = new avzp();
            this.f109731l = avzp;
            featureRequest2.setUrgent(avzp);
            try {
                if (!ModuleManager.get(this).requestFeatures(featureRequest2)) {
                    avxz.m79525a("Feature request of %s failed.", sb.toString());
                } else {
                    for (String str5 : a2) {
                        File a5 = avzr.m79552a(this.f109729j, str5);
                        if (a5 != null) {
                            avzr.m79553a(a5);
                        }
                    }
                    new Object[1][0] = sb.toString();
                }
            } catch (IllegalStateException e3) {
                avxz.m79526a(e3, "Feature request failed.  Could not determine module ID", new Object[0]);
            }
        }
        this.f109725d = false;
        avzp avzp2 = this.f109731l;
        if (avzp2 != null && a2 != null) {
            try {
                num = (Integer) avzp2.f94119a.poll(chef.f188522a.mo6606a().mo85172f(), TimeUnit.MINUTES);
            } catch (InterruptedException e4) {
            }
            if (num != null) {
                for (String str6 : a2) {
                    if (f109723f.containsKey(str6) && !m93785a((String) f109723f.get(str6))) {
                        String format2 = String.format("Request for optional module download of %s failed.", str6);
                        avxz.m79528c("%s", String.valueOf(format2).concat(" Request again."));
                        avzs.m79555a(this.f109728i, format2, this.f109727h);
                    } else if (f109723f.containsKey(str6) && m93785a((String) f109723f.get(str6))) {
                        avzs.m79554a(this.f109729j, this.f109728i, str6, this.f109727h);
                    }
                }
            }
            this.f109725d = true;
            if (this.f109725d && this.f109730k != 0) {
                avzo.m79550a(this.f109729j, this.f109726g, true);
            }
        }
    }
}
