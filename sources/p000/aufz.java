package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObservable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.thunderbird.settings.provider.ThunderbirdSettingsChimeraContentProvider;
import com.google.android.gms.thunderbird.state.EmergencyInfo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: aufz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aufz extends ContentObservable {

    /* renamed from: b */
    private static aufz f91748b;

    /* renamed from: a */
    public final CopyOnWriteArrayList f91749a = new CopyOnWriteArrayList();

    /* renamed from: c */
    private final aufu f91750c = new aufu();

    /* renamed from: d */
    private final CopyOnWriteArrayList f91751d = new CopyOnWriteArrayList();

    /* renamed from: e */
    private boolean f91752e = true;

    /* renamed from: f */
    private boolean f91753f = true;

    /* renamed from: a */
    public static synchronized aufz m77007a() {
        aufz aufz;
        synchronized (aufz.class) {
            if (f91748b == null) {
                f91748b = new aufz();
            }
            aufz = f91748b;
        }
        return aufz;
    }

    /* renamed from: b */
    public static synchronized void m77008b() {
        synchronized (aufz.class) {
            C1223np npVar = auho.f91828a;
            if (f91748b != null) {
                aufz aufz = f91748b;
                synchronized (aufz.f91751d) {
                    aufz.f91752e = true;
                    aufz.mo50505a(augg.f91760a);
                }
                aufz aufz2 = f91748b;
                synchronized (aufz2.f91749a) {
                    aufz2.f91753f = true;
                    aufz2.mo50505a(augf.f91759a);
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aufu.a(boolean, auff):aufq
     arg types: [int, auff]
     candidates:
      aufu.a(java.util.List, int):void
      aufu.a(boolean, auff):aufq */
    /* renamed from: d */
    private final void m77009d(Context context) {
        bmxy.m108600b(this.f91752e);
        this.f91751d.clear();
        aufg a = cgym.f188058a.mo6606a().mo84755a();
        ArrayList arrayList = new ArrayList(a.f91676a.size());
        bxwc bxwc = a.f91676a;
        int size = bxwc.size();
        List list = null;
        for (int i = 0; i < size; i++) {
            auff auff = (auff) bxwc.get(i);
            try {
                arrayList.add(aufu.m77003a(false, auff));
            } catch (IOException | ParseException e) {
                if (list == null) {
                    try {
                        list = (List) ThunderbirdSettingsChimeraContentProvider.m93359a(context, "corruptConfigs");
                    } catch (IOException e2) {
                        auho.m77069a(context, e2);
                        list = bngx.m109376e();
                    }
                }
                if (list.contains(auff.f91649b)) {
                    String valueOf = String.valueOf(auff.f91649b);
                    Log.w("Thunderbird", valueOf.length() == 0 ? new String("unable to reload corrupt config ") : "unable to reload corrupt config ".concat(valueOf));
                } else {
                    String str = auff.f91649b;
                    try {
                        int i2 = ThunderbirdSettingsChimeraContentProvider.f109070a;
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uri = auhi.f91817a;
                        Bundle bundle = new Bundle();
                        auia.m77091a(bundle, str);
                        contentResolver.call(uri, "append", "corruptConfigs", bundle);
                    } catch (IllegalStateException e3) {
                        throw new IOException(e3.getCause());
                    } catch (IOException e4) {
                        auho.m77069a(context, e4);
                    }
                    String valueOf2 = String.valueOf(auff.f91649b);
                    auho.m77069a(context, new IllegalArgumentException(valueOf2.length() == 0 ? new String("error loading config ") : "error loading config ".concat(valueOf2), e));
                }
            }
        }
        this.f91751d.addAll(arrayList);
        this.f91752e = false;
        mo50505a(augg.f91760a);
    }

    /* renamed from: e */
    private final void m77010e(Context context) {
        FileInputStream openFileInput;
        bmxy.m108600b(this.f91753f);
        this.f91749a.clear();
        if (context.getFileStreamPath("thunderbird_mock_configs").exists()) {
            try {
                openFileInput = context.openFileInput("thunderbird_mock_configs");
                aufg aufg = (aufg) bxvk.m124014a(aufg.f91674b, boav.m111020a(openFileInput));
                HashMap hashMap = new HashMap(aufg.f91676a.size());
                Iterator it = aufg.f91676a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    aufq a = aufu.m77002a((auff) it.next());
                    if (TextUtils.isEmpty(a.f91719a)) {
                        Log.w("Thunderbird", "dropping unnamed mock config");
                    } else if (hashMap.put(a.f91719a, a) != null) {
                        String valueOf = String.valueOf(a.f91719a);
                        Log.w("Thunderbird", valueOf.length() == 0 ? new String("dropping duplicate mock config ") : "dropping duplicate mock config ".concat(valueOf));
                    } else if (hashMap.size() >= 50) {
                        Log.w("Thunderbird", "dropping remaining mock configs > 50");
                        break;
                    }
                }
                this.f91749a.addAll(hashMap.values());
                if (openFileInput != null) {
                    openFileInput.close();
                }
            } catch (IOException | ParseException e) {
                Log.e("Thunderbird", "failed to load mock configs from file", e);
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        this.f91753f = false;
        mo50505a(augf.f91759a);
        return;
        throw th;
    }

    /* renamed from: c */
    public final void mo50508c(Context context) {
        FileOutputStream openFileOutput;
        bmxy.m108600b(!this.f91753f);
        try {
            if (this.f91749a.isEmpty()) {
                if (context.getFileStreamPath("thunderbird_mock_configs").exists()) {
                    if (context.deleteFile("thunderbird_mock_configs")) {
                        return;
                    }
                }
            }
            openFileOutput = context.openFileOutput("thunderbird_mock_configs", 0);
            bxvd da = aufg.f91674b.mo74144da();
            List a = aufq.m76988a(this.f91749a);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aufg aufg = (aufg) da.f164949b;
            if (!aufg.f91676a.mo73666a()) {
                aufg.f91676a = bxvk.m124021a(aufg.f91676a);
            }
            bxsy.m123078a(a, aufg.f91676a);
            openFileOutput.write(((aufg) da.mo74062i()).mo73642k());
            if (openFileOutput != null) {
                openFileOutput.close();
                return;
            }
            return;
        } catch (IOException e) {
            Log.e("Thunderbird", "failed to write mock configs to file", e);
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [bnfi, aufv]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* renamed from: a */
    public final Iterable mo50503a(Context context, EmergencyInfo emergencyInfo) {
        if ("SMS".equals(emergencyInfo.mo59538b())) {
            String a = emergencyInfo.mo59537a();
            long j = emergencyInfo.f109086a.f109075e;
            synchronized (auho.f91828a) {
                Long l = (Long) auho.f91828a.get(a);
                if (l != null) {
                    long longValue = l.longValue() + 2000;
                    if (longValue > j) {
                        return bngx.m109376e();
                    }
                }
            }
        }
        return bnjd.m109586b(bnjd.m109575a((Iterable) bnfi.m109236a(mo50507b(context), mo50504a(context)), (bmxj) new aufv(context, emergencyInfo)), aufw.f91744a);
    }

    /* renamed from: b */
    public final List mo50507b(Context context) {
        synchronized (this.f91751d) {
            if (this.f91752e) {
                m77009d(context);
            }
        }
        return this.f91751d;
    }

    /* renamed from: a */
    public final List mo50504a(Context context) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        synchronized (this.f91749a) {
            if (this.f91753f) {
                m77010e(context);
            }
            copyOnWriteArrayList = this.f91749a;
        }
        return copyOnWriteArrayList;
    }

    /* renamed from: a */
    public final void mo50505a(Uri uri) {
        int i = Build.VERSION.SDK_INT;
        dispatchChange(false, uri);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008f, code lost:
        return false;
     */
    /* renamed from: a */
    public final boolean mo50506a(Context context, auff auff, boolean z) {
        bmxy.m108588a(!auff.f91649b.isEmpty());
        synchronized (this.f91749a) {
            mo50504a(context);
            int i = 0;
            while (true) {
                if (i < this.f91749a.size()) {
                    if (((aufq) this.f91749a.get(i)).f91719a.equals(auff.f91649b)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                if (!z) {
                    if (this.f91749a.size() >= 50) {
                    }
                }
            }
            if (auho.m77070a()) {
                String valueOf = String.valueOf(auff.f91649b);
                Log.d("Thunderbird", valueOf.length() == 0 ? new String("setting mock config: ") : "setting mock config: ".concat(valueOf));
            }
            aufq a = aufu.m77002a(auff);
            if (i == -1) {
                this.f91749a.add(a);
            } else {
                this.f91749a.set(i, a);
            }
            mo50508c(context);
            mo50505a(augf.f91759a.buildUpon().appendPath(a.f91719a).build());
            return true;
        }
    }
}
