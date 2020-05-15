package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.location.geofencer.data.PendingIntentCacheItem;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: bfzn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfzn extends bfze {

    /* renamed from: a */
    final /* synthetic */ bfzt f115780a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfzn(bfzt bfzt, bfyy bfyy) {
        super(bfzt, bfyy);
        this.f115780a = bfzt;
    }

    /* renamed from: a */
    public final bpms mo62472a() {
        return bpms.NOT_INITIALIZED;
    }

    /* renamed from: g */
    public final String mo62478g() {
        return "NotInitializedState";
    }

    /* JADX WARNING: Removed duplicated region for block: B:132:0x024e A[Catch:{ IOException -> 0x04c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0270 A[Catch:{ IOException -> 0x04c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x027c A[Catch:{ IOException -> 0x04c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0290 A[Catch:{ IOException -> 0x04c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x032c A[Catch:{ IOException -> 0x04c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0356 A[Catch:{ IOException -> 0x04c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b7 A[SYNTHETIC] */
    /* renamed from: a */
    public final boolean mo62484a(Message message) {
        boolean z;
        bgev bgev;
        PendingIntentCacheItem pendingIntentCacheItem;
        Iterator it;
        boolean z2;
        PackageManager packageManager;
        bfwf bfwf;
        PackageManager packageManager2;
        Iterator it2;
        ParcelableGeofence parcelableGeofence;
        long j;
        String str;
        boolean z3;
        int i;
        int i2;
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2;
        Message message2 = message;
        boolean z4 = bfxc.f115575a;
        int i3 = message2.what;
        if (i3 == 4) {
            z = false;
        } else {
            z = i3 != 5;
        }
        rzz.m34730a(z, "Received add or remove geofence request before initialized.");
        int i4 = 2;
        if (i3 != 2) {
            if (Log.isLoggable("GeofencerStateMachine", 5)) {
                String a = this.f115780a.mo62506a(i3);
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 32);
                sb.append("Received ");
                sb.append(a);
                sb.append(" in NotInitializedState");
                bfxc.m98134c("GeofencerStateMachine", sb.toString());
            }
            return super.mo62502b(message);
        }
        boolean z5 = bfxc.f115575a;
        bfyy bfyy = this.f115763b;
        Intent intent = (Intent) message2.obj;
        bhbe bhbe = bfyy.f115756n;
        bhbe.f118228b = bhbe.mo63516b();
        if (bhbe.f118228b == null || bhbe.f118228b.length != 32) {
            boolean z6 = bfxc.f115575a;
            byte[] bArr = new byte[32];
            new SecureRandom().nextBytes(bArr);
            try {
                dataOutputStream2 = new DataOutputStream(bhbe.f118227a.openFileOutput(bhbe.f118229c, 0));
                try {
                    dataOutputStream2.writeShort(1);
                    dataOutputStream2.write(bArr);
                } catch (FileNotFoundException e) {
                } catch (IOException e2) {
                    boolean z7 = bfxc.f115575a;
                    bhcy.m100661a(dataOutputStream2);
                    bhbe.f118228b = bArr;
                    bgev = bfyy.f115746d;
                    bfmf a2 = bfyy.f115756n.mo63515a();
                    synchronized (bgev.f116306h) {
                    }
                } catch (Throwable th) {
                    th = th;
                    dataOutputStream = dataOutputStream2;
                    bhcy.m100661a(dataOutputStream);
                    throw th;
                }
            } catch (FileNotFoundException e3) {
                dataOutputStream2 = null;
                boolean z8 = bfxc.f115575a;
                bhcy.m100661a(dataOutputStream2);
                bhbe.f118228b = bArr;
                bgev = bfyy.f115746d;
                bfmf a22 = bfyy.f115756n.mo63515a();
                synchronized (bgev.f116306h) {
                }
            } catch (IOException e4) {
                dataOutputStream2 = null;
                boolean z72 = bfxc.f115575a;
                bhcy.m100661a(dataOutputStream2);
                bhbe.f118228b = bArr;
                bgev = bfyy.f115746d;
                bfmf a222 = bfyy.f115756n.mo63515a();
                synchronized (bgev.f116306h) {
                }
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = dataOutputStream2;
                bhcy.m100661a(dataOutputStream);
                throw th;
            }
            bhcy.m100661a(dataOutputStream2);
            bhbe.f118228b = bArr;
        }
        bgev = bfyy.f115746d;
        bfmf a2222 = bfyy.f115756n.mo63515a();
        synchronized (bgev.f116306h) {
            bgev.f116307i = new bfkw(2, new File(bgev.f116300b.getFilesDir(), bgev.f116303e), a2222);
            try {
                bfyd bfyd = (bfyd) bgev.f116307i.mo61862a((bxxk) bfyd.f115657e.mo74142c(7));
                long j2 = bfyd.f115660b;
                long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                if (Math.abs(j2 - currentTimeMillis) >= 10000 || bfyd.f115661c.size() == 0) {
                    boolean z9 = bfxc.f115575a;
                } else {
                    boolean z10 = bfxc.f115575a;
                    bgfa bgfa = bgev.f116305g;
                    Math.min(currentTimeMillis, j2);
                    bgfa.mo62736a(bfyd);
                }
            } catch (IOException e5) {
                boolean z11 = bfxc.f115575a;
            }
        }
        bfwg bfwg = bfyy.f115748f;
        bfmf a3 = bfyy.f115756n.mo63515a();
        PackageManager packageManager3 = bfwg.f115498d.getPackageManager();
        if (bfwg.f115496b != null) {
            bfwg.f115496b.mo25070c(intent);
            List<PendingIntentCacheItem> e6 = bfwg.f115496b.mo25074e();
            boolean z12 = bfxc.f115575a;
            bfwg.f115497c = new bfkw(2, new File(bfwg.f115498d.getFilesDir(), "geofencer_state_list"), a3);
            int i5 = 6;
            try {
                bfyj bfyj = (bfyj) bfwg.f115497c.mo61862a((bxxk) bfyj.f115690d.mo74142c(7));
                boolean z13 = !bfwg.f115496b.mo25066b().equals(bfyj.f115693b);
                boolean z14 = bfxc.f115575a;
                HashMap hashMap = new HashMap();
                Iterator it3 = bfyj.f115694c.iterator();
                while (it3.hasNext()) {
                    bfyf bfyf = (bfyf) it3.next();
                    if ((bfyf.f115678a & i4) != 0) {
                        String str2 = bfyf.f115680c;
                        Iterator it4 = e6.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                pendingIntentCacheItem = null;
                                break;
                            }
                            pendingIntentCacheItem = (PendingIntentCacheItem) it4.next();
                            if (pendingIntentCacheItem.f150775b.equals(str2)) {
                                break;
                            }
                        }
                        if (pendingIntentCacheItem != null) {
                            PendingIntent pendingIntent = pendingIntentCacheItem.f150774a;
                            int i6 = bfyf.f115678a;
                            if ((i6 & 1) == 0) {
                                packageManager2 = packageManager3;
                                z2 = z13;
                                it2 = it3;
                            } else if ((i6 & 2) == 0 || (i6 & 4) == 0) {
                                packageManager2 = packageManager3;
                                z2 = z13;
                                it2 = it3;
                            } else {
                                int i7 = bfyf.f115681d;
                                bfye bfye = bfyf.f115679b;
                                if (bfye == null) {
                                    bfye = bfye.f115663l;
                                }
                                int i8 = bfye.f115666b;
                                int i9 = bfye.f115665a;
                                z2 = z13;
                                if ((i9 & 32) == 0 || (i9 & 16) == 0 || (i9 & 2) == 0 || (i9 & 4) == 0 || (i9 & 8) == 0 || (i9 & 64) == 0) {
                                    packageManager = packageManager3;
                                    it = it3;
                                    j = -1;
                                    parcelableGeofence = null;
                                } else {
                                    if ((i9 & 128) != 0) {
                                        i = bfye.f115673i;
                                    } else {
                                        i = 0;
                                    }
                                    if ((i9 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                        i2 = bfye.f115674j;
                                    } else {
                                        i2 = -1;
                                    }
                                    try {
                                        aehf aehf = new aehf();
                                        aehf.f63388a = bfye.f115671g;
                                        aehf.f63389b = bfye.f115672h;
                                        packageManager = packageManager3;
                                        try {
                                            it = it3;
                                        } catch (IllegalArgumentException e7) {
                                            e = e7;
                                            it = it3;
                                            j = -1;
                                            if (!Log.isLoggable("GeofenceState", 6)) {
                                                String valueOf = String.valueOf(e.getMessage());
                                                bfxc.m98133b("GeofenceState", valueOf.length() == 0 ? new String("Invalid geofence from protocol buffer: ") : "Invalid geofence from protocol buffer: ".concat(valueOf));
                                                parcelableGeofence = null;
                                            } else {
                                                parcelableGeofence = null;
                                            }
                                            if (parcelableGeofence == null) {
                                            }
                                            if (bfwf == null) {
                                            }
                                        }
                                        try {
                                            aehf.mo34146a(bfye.f115667c, bfye.f115668d, bfye.f115669e);
                                            long j3 = bfye.f115670f;
                                            if (j3 >= 0) {
                                                aehf.f63390c = j3;
                                                j = -1;
                                            } else {
                                                j = -1;
                                                try {
                                                    aehf.f63390c = -1;
                                                } catch (IllegalArgumentException e8) {
                                                    e = e8;
                                                    if (!Log.isLoggable("GeofenceState", 6)) {
                                                    }
                                                    if (parcelableGeofence == null) {
                                                    }
                                                    if (bfwf == null) {
                                                    }
                                                }
                                            }
                                            aehf.f63391d = i;
                                            aehf.f63392e = i2;
                                            parcelableGeofence = aehf.mo34145a();
                                        } catch (IllegalArgumentException e9) {
                                            e = e9;
                                            j = -1;
                                            if (!Log.isLoggable("GeofenceState", 6)) {
                                            }
                                            if (parcelableGeofence == null) {
                                            }
                                            if (bfwf == null) {
                                            }
                                        }
                                    } catch (IllegalArgumentException e10) {
                                        e = e10;
                                        packageManager = packageManager3;
                                        it = it3;
                                        j = -1;
                                        if (!Log.isLoggable("GeofenceState", 6)) {
                                        }
                                        if (parcelableGeofence == null) {
                                        }
                                        if (bfwf == null) {
                                        }
                                    }
                                }
                                if (parcelableGeofence == null) {
                                    if (Log.isLoggable("GeofenceState", 6)) {
                                        bfxc.m98133b("GeofenceState", "Invalid geofence from protocol buffer.");
                                    }
                                    bfwf = null;
                                } else {
                                    bfye bfye2 = bfyf.f115679b;
                                    if (bfye2 == null) {
                                        bfye2 = bfye.f115663l;
                                    }
                                    int a4 = aehm.m51846a(bfye2.f115675k);
                                    boolean z15 = bfyf.f115685h;
                                    if ((bfyf.f115678a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                        str = bfyf.f115687j;
                                    } else {
                                        str = "";
                                    }
                                    bfwf = new bfwf(parcelableGeofence, a4, pendingIntent, bfyf.f115686i, str);
                                    bfwl bfwl = bfwf.f115493k;
                                    int a5 = bfyh.m98167a(bfyf.f115681d);
                                    if (a5 == 0) {
                                        a5 = 1;
                                    }
                                    bfwl.f115513b = bfwf.m98039b(a5);
                                    bfwf.f115491i = z15;
                                    if ((bfyf.f115678a & 8) != 0) {
                                        int a6 = bfyh.m98167a(bfyf.f115682e);
                                        if (a6 == 0) {
                                            a6 = 1;
                                        }
                                        byte b = bfwf.m98039b(a6);
                                        if (b != 1) {
                                            if (b != 2) {
                                                bfwf.f115487e = 0;
                                            }
                                        }
                                        bfwf.f115487e = b;
                                    }
                                    int i10 = bfyf.f115678a;
                                    if ((i10 & 32) == 0 || bfwf.f115487e != 1) {
                                        z3 = false;
                                    } else {
                                        z3 = bfyf.f115684g;
                                        if (!z3 && (i10 & 16) != 0) {
                                            j = bfyf.f115683f;
                                        }
                                    }
                                    bfwf.f115490h = z3;
                                    bfwf.f115489g = j;
                                }
                                if (bfwf == null) {
                                    String str3 = bfwf.f115483a.f79438a;
                                    List list = pendingIntentCacheItem.f150776c;
                                    if (list != null) {
                                        int binarySearch = Collections.binarySearch(list, str3);
                                        if (binarySearch >= 0) {
                                            pendingIntentCacheItem.f150776c.remove(binarySearch);
                                            List list2 = (List) hashMap.get(pendingIntentCacheItem.f150774a);
                                            if (list2 == null) {
                                                list2 = new ArrayList(pendingIntentCacheItem.mo70871a());
                                                hashMap.put(pendingIntentCacheItem.f150774a, list2);
                                            }
                                            list2.add(bfwf);
                                            packageManager3 = packageManager;
                                            z13 = z2;
                                            it3 = it;
                                            i4 = 2;
                                            i5 = 6;
                                        }
                                    }
                                    if (Log.isLoggable("GeofenceStateCache", 6)) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 98);
                                        sb2.append("Request ID ");
                                        sb2.append(str3);
                                        sb2.append(" not found in memory cache. Probably caused by I/O failure during removeGeofences call.");
                                        bfxc.m98133b("GeofenceStateCache", sb2.toString());
                                        packageManager3 = packageManager;
                                        z13 = z2;
                                        it3 = it;
                                        i4 = 2;
                                        i5 = 6;
                                    } else {
                                        packageManager3 = packageManager;
                                        z13 = z2;
                                        it3 = it;
                                        i4 = 2;
                                        i5 = 6;
                                    }
                                } else if (Log.isLoggable("GeofenceStateCache", 6)) {
                                    bfxc.m98133b("GeofenceStateCache", "Protocol buffer does not convert to a valid geofence state.");
                                    packageManager3 = packageManager;
                                    z13 = z2;
                                    it3 = it;
                                    i4 = 2;
                                    i5 = 6;
                                } else {
                                    packageManager3 = packageManager;
                                    z13 = z2;
                                    it3 = it;
                                    i4 = 2;
                                    i5 = 6;
                                }
                            }
                            if (Log.isLoggable("GeofenceState", 6)) {
                                bfxc.m98133b("GeofenceState", "Incomplete geofence state.");
                                bfwf = null;
                            } else {
                                bfwf = null;
                            }
                            if (bfwf == null) {
                            }
                        } else {
                            PackageManager packageManager4 = packageManager3;
                            boolean z16 = z13;
                            Iterator it5 = it3;
                            if (z16) {
                                packageManager3 = packageManager4;
                                z13 = z16;
                                it3 = it5;
                                i4 = 2;
                                i5 = 6;
                            } else if (Log.isLoggable("GeofenceStateCache", 6)) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 77);
                                sb3.append("Unable to find pending intent for key: ");
                                sb3.append(str2);
                                sb3.append(". Registered geofence will be dropped.");
                                bfxc.m98133b("GeofenceStateCache", sb3.toString());
                                packageManager3 = packageManager4;
                                z13 = z16;
                                it3 = it5;
                                i4 = 2;
                                i5 = 6;
                            } else {
                                packageManager3 = packageManager4;
                                z13 = z16;
                                it3 = it5;
                                i4 = 2;
                                i5 = 6;
                            }
                        }
                    } else if (Log.isLoggable("GeofenceStateCache", i5)) {
                        bfxc.m98133b("GeofenceStateCache", "Incomplete geofence information: lack PendingIntent key.");
                    }
                }
                PackageManager packageManager5 = packageManager3;
                for (PendingIntentCacheItem pendingIntentCacheItem2 : e6) {
                    if (pendingIntentCacheItem2.mo70871a() == 0) {
                        PendingIntent pendingIntent2 = pendingIntentCacheItem2.f150774a;
                        String a7 = bhcb.m100621a(pendingIntent2);
                        if (a7 != null) {
                            try {
                                packageManager5.getApplicationInfo(a7, 0);
                                List<bfwf> list3 = (List) hashMap.get(pendingIntent2);
                                if (list3 != null) {
                                    for (bfwf bfwf2 : list3) {
                                        bfwn a8 = bfwg.f115499e.mo62369a(new bfwk(bhcb.m100621a(bfwf2.f115484b), bfwf2.f115485c));
                                        if (a8 != null) {
                                            a8.mo62383a(bfwf2);
                                        }
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException e11) {
                            }
                        }
                        if (Log.isLoggable("GeofenceStateCache", 5)) {
                            String valueOf2 = String.valueOf(a7);
                            bfxc.m98134c("GeofenceStateCache", valueOf2.length() == 0 ? new String("Not recovering removed package: ") : "Not recovering removed package: ".concat(valueOf2));
                        }
                    } else if (Log.isLoggable("GeofenceStateCache", 6)) {
                        bfxc.m98133b("GeofenceStateCache", "Some geofence(s) couldn't be found on disk.");
                    }
                }
            } catch (IOException e12) {
                if (Log.isLoggable("GeofenceStateCache", 6)) {
                    bfxc.m98133b("GeofenceStateCache", "Unable to load state, all registered geofences are lost.");
                }
            }
            try {
                bfwg.mo62364b();
            } catch (IOException e13) {
                if (Log.isLoggable("GeofenceStateCache", 5)) {
                    bfxc.m98134c("GeofenceStateCache", "Unable to do clean up after restarted.");
                }
            }
        }
        this.f115763b.mo62470i();
        bxvd bxvd = this.f115780a.f115790C;
        if (bxvd != null) {
            boolean b2 = this.f115763b.f115755m.mo62445b();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpmn bpmn = (bpmn) bxvd.f164949b;
            bpmn bpmn2 = bpmn.f138303g;
            bpmn.f138305a |= 8;
            bpmn.f138309e = b2;
        }
        if (!this.f115780a.f115819x.mo62522a()) {
            if (Log.isLoggable("GeofencerStateMachine", 4)) {
                bfxc.m98132a("GeofencerStateMachine", "Network location disabled.");
            }
            bfzt bfzt = this.f115780a;
            bfzt.mo62547b(bfzt.f115797b);
            return true;
        } else if (this.f115763b.mo62464c()) {
            this.f115763b.mo62471j();
            bfzt bfzt2 = this.f115780a;
            bfzt2.mo62547b(bfzt2.f115798c);
            this.f115780a.mo62552d();
            return true;
        } else {
            bfzt bfzt3 = this.f115780a;
            bfzt3.mo62547b(bfzt3.f115796a);
            return true;
        }
    }
}
