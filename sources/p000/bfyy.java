package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.RemoveGeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: bfyy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfyy implements bfwh {

    /* renamed from: a */
    public int f115743a = Integer.MAX_VALUE;

    /* renamed from: b */
    public int f115744b = Integer.MAX_VALUE;

    /* renamed from: c */
    public final bfwo f115745c = new bfwo();

    /* renamed from: d */
    final bgev f115746d;

    /* renamed from: e */
    final bfzw f115747e;

    /* renamed from: f */
    final bfwg f115748f;

    /* renamed from: g */
    final asfb f115749g;

    /* renamed from: h */
    final bgey f115750h;

    /* renamed from: i */
    public int f115751i = ((int) (System.currentTimeMillis() % 8192));

    /* renamed from: j */
    public final TreeMap f115752j = new TreeMap();

    /* renamed from: k */
    public final bfyq f115753k;

    /* renamed from: l */
    public final Context f115754l;

    /* renamed from: m */
    public bfyr f115755m;

    /* renamed from: n */
    public final bhbe f115756n;

    /* renamed from: o */
    private final bfzv f115757o;

    public bfyy(ayte ayte, Context context, Handler handler, bfzt bfzt, String str, bfwi bfwi, bfww bfww) {
        bfzu bfzu;
        aesh aesh;
        rjx rjx;
        Context context2 = context;
        bfzt bfzt2 = bfzt;
        try {
            int i = Build.VERSION.SDK_INT;
            bfzu = bfzu.f115822a;
        } catch (NoClassDefFoundError | VerifyError e) {
            bfzu = null;
        }
        this.f115757o = bfzu;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
        this.f115755m = new bgac(bfzt2, cexq.f183497a.mo80414c().flpGeofenceEnableHalDebugMode() ? 1 : 0);
        this.f115753k = new bfyq(context, bfzt, new skc(context), spf.m35821a(context), bfww);
        this.f115750h = new bgey(((PowerManager) context.getSystemService("power")).isScreenOn());
        asfb asfb = new asfb(context, 1, "GeofencePendingIntentWakeLock", null, "com.google.android.gms");
        this.f115749g = asfb;
        asfb.mo49115a(true);
        this.f115746d = new bgev(context, this.f115750h, new bfyx(bfzt2), "geofencer_ad_state");
        if (!cexb.m138378b()) {
            aesh = new aesh(context);
        } else {
            aesh = null;
        }
        if (cexb.m138378b()) {
            rjx = aeie.m51878c(context);
        } else {
            rjx = null;
        }
        this.f115747e = new bfzw(context, bfzt, aesh, rjx, bfww);
        this.f115756n = new bhbe(context);
        this.f115748f = new bfwg(ayte, context, handler, this.f115749g, bfwi, str, this, bfww);
        this.f115754l = context2;
    }

    /* renamed from: a */
    public static final boolean m98204a(List list) {
        return list == null || list.size() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo62460a() {
        return this.f115743a == Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final List mo62461b() {
        bfwj bfwj = this.f115748f.f115499e;
        return bfwj.f115503g.mo62337a(bfwj.mo25992c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo62463b(double d) {
        int i = this.f115743a;
        return i != Integer.MAX_VALUE && ((double) i) > d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo62464c() {
        return this.f115748f.mo62365c() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo62465d() {
        return this.f115748f.mo62365c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo62466e() {
        this.f115747e.mo62519a();
        this.f115746d.mo62720a();
        bfxa.f115569a.mo62410a(1038980360, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo62467f() {
        this.f115749g.mo49121c((WorkSource) null);
        if (this.f115749g.mo49124e()) {
            this.f115749g.mo49120c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo62468g() {
        bgev bgev = this.f115746d;
        bxvd e = bgev.f116305g.mo62742e();
        if (e != null) {
            try {
                bgev.f116307i.mo61863a((bfyd) e.mo74062i());
                boolean z = bfxc.f115575a;
            } catch (IOException e2) {
                boolean z2 = bfxc.f115575a;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final bgez mo62469h() {
        return this.f115746d.f116305g.mo62739b();
    }

    /* renamed from: i */
    public final void mo62470i() {
        bfyu bfyu = null;
        if (!cewv.f183483a.mo6606a().swallowNpeFromGpsHardwareGeofencer()) {
            bfyr bfyr = this.f115755m;
            bfzv bfzv = this.f115757o;
            if (bfzv != null) {
                bfyu = bfzv.mo62517a();
            }
            bfyr.mo62441a(bfyu);
            return;
        }
        try {
            bfyr bfyr2 = this.f115755m;
            bfzv bfzv2 = this.f115757o;
            if (bfzv2 != null) {
                bfyu = bfzv2.mo62517a();
            }
            bfyr2.mo62441a(bfyu);
        } catch (NullPointerException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41);
            sb.append("Failed to update GNSS Geofence hardware: ");
            sb.append(valueOf);
            bfxc.m98133b("GeofencerStateInfo", sb.toString());
            this.f115755m = new bfzy();
        }
    }

    /* renamed from: j */
    public final void mo62471j() {
        bfwj bfwj = this.f115748f.f115499e;
        if (bfwj.f115505i != null) {
            int i = 0;
            for (bfwn bfwn : bfwj.mo25992c()) {
                bfww bfww = bfwj.f115505i;
                String k = bfwn.mo9758k();
                String c = bfwn.mo62386c();
                List<bfwf> unmodifiableList = Collections.unmodifiableList(bfwn.f115519c);
                bfwu a = bfww.mo62396a(k, c, unmodifiableList.size());
                for (bfwf bfwf : unmodifiableList) {
                    bfww.m98098a(a, bfwf.f115483a.f79444g, bfwf.f115486d);
                }
                i += bfwn.mo62380a();
            }
            bfwj.f115505i.mo62398a(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo62452a(String str, String str2) {
        for (bfwn bfwn : this.f115748f.f115499e.mo25992c()) {
            if (bfwn.mo9758k().equals(str)) {
                String c = bfwn.mo62386c();
                if (!TextUtils.isEmpty(str2) ? str2.equals(c) : TextUtils.isEmpty(c)) {
                    return bfwn.mo62380a();
                }
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final List mo62462b(int i) {
        bfwj bfwj = this.f115748f.f115499e;
        return bfwj.f115503g.mo62343b(bfwj.mo25992c(), i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Pair mo62453a(bgae bgae) {
        boolean z;
        List list;
        boolean z2;
        List list2;
        List list3;
        boolean z3;
        List list4;
        int i = bgae.f115863a;
        if (i == 1) {
            bfwg bfwg = this.f115748f;
            String str = bgae.f115864b;
            bfwg.f115499e.mo62373i();
            bfwj bfwj = bfwg.f115499e;
            bfwj.f115502b = true;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (bfwn bfwn : bfwj.mo25994e()) {
                if (bfwn.mo9758k().equals(str)) {
                    arrayList.addAll(bfwn.mo62385b());
                    arrayList2.add(bfwn.f115518b);
                }
            }
            if (arrayList2.size() > 0) {
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    bfwj.mo25984a((Object) ((bfwk) arrayList2.get(i2)));
                }
            }
            bfwj.f115502b = false;
            if (!arrayList.isEmpty()) {
                bfwj.mo9714a(2);
            }
            if (!arrayList.isEmpty()) {
                try {
                    bfwg.mo62364b();
                    z = false;
                } catch (IOException e) {
                    z = true;
                }
            } else {
                z = false;
            }
            if (z) {
                bfwg.f115499e.mo62371g();
            }
            bfwg.f115499e.mo62372h();
            if (!z) {
                return Pair.create(0, arrayList);
            }
            return Pair.create(1, null);
        } else if (i != 2) {
            bfwg bfwg2 = this.f115748f;
            RemoveGeofencingRequest removeGeofencingRequest = bgae.f115865c;
            PendingIntent pendingIntent = removeGeofencingRequest.f79379b;
            String str2 = removeGeofencingRequest.f79380c;
            bfwg2.f115499e.mo62373i();
            String a = bhcb.m100621a(pendingIntent);
            if (str2 == null || str2.isEmpty()) {
                bfwj bfwj2 = bfwg2.f115499e;
                bfwj2.f115502b = true;
                ArrayList arrayList3 = new ArrayList();
                if (pendingIntent != null) {
                    String a2 = bhcb.m100621a(pendingIntent);
                    List list5 = null;
                    for (bfwn bfwn2 : bfwj2.mo25994e()) {
                        List a3 = bfwn2.mo62381a(pendingIntent);
                        if (a2.equals(bfwn2.mo9758k()) && !a3.isEmpty() && bfwn2.mo62380a() == 0) {
                            arrayList3.add(bfwn2.f115518b);
                        }
                        list5 = a3;
                    }
                    list4 = list5;
                } else {
                    list4 = null;
                }
                if (arrayList3.size() > 0) {
                    int size2 = arrayList3.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        bfwj2.mo25984a((Object) ((bfwk) arrayList3.get(i3)));
                    }
                }
                bfwj2.f115502b = false;
                if (list3 != null && !list3.isEmpty()) {
                    bfwj2.mo9714a(2);
                }
            } else {
                bfwk bfwk = new bfwk(a, str2);
                bfwj bfwj3 = bfwg2.f115499e;
                bfwj3.f115502b = true;
                bfwn bfwn3 = (bfwn) bfwj3.mo25989b(bfwk);
                if (bfwn3 != null) {
                    list3 = bfwn3.mo62381a(pendingIntent);
                    if (!list3.isEmpty() && bfwn3.mo62380a() == 0) {
                        bfwj3.mo25984a((Object) bfwn3.f115518b);
                    }
                } else {
                    list3 = null;
                }
                bfwj3.f115502b = false;
                if (list3 != null && !list3.isEmpty()) {
                    bfwj3.mo9714a(2);
                }
            }
            if (list3 == null || list3.isEmpty()) {
                z3 = false;
            } else {
                try {
                    bfwg2.mo62364b();
                    z3 = false;
                } catch (IOException e2) {
                    z3 = true;
                }
            }
            if (z3) {
                bfwg2.f115499e.mo62371g();
            }
            bfwg2.f115499e.mo62372h();
            if (z3) {
                return Pair.create(1, null);
            }
            return Pair.create(0, list3);
        } else {
            bfwg bfwg3 = this.f115748f;
            String str3 = bgae.f115864b;
            RemoveGeofencingRequest removeGeofencingRequest2 = bgae.f115865c;
            List list6 = removeGeofencingRequest2.f79378a;
            String str4 = removeGeofencingRequest2.f79380c;
            bfwg3.f115499e.mo62373i();
            if (str4 != null && !str4.isEmpty()) {
                list = bfwg3.f115499e.mo62370a(new bfwk(str3, str4), list6);
            } else {
                bfwj bfwj4 = bfwg3.f115499e;
                bfwj4.f115502b = true;
                ArrayList arrayList4 = new ArrayList();
                if (str3 != null) {
                    list2 = null;
                    for (bfwn bfwn4 : bfwj4.mo25994e()) {
                        List a4 = bfwn4.mo62382a(list6);
                        if (bfwn4.mo9758k().equals(str3) && !a4.isEmpty() && bfwn4.mo62380a() == 0) {
                            arrayList4.add(bfwn4.f115518b);
                        }
                        list2 = a4;
                    }
                } else {
                    list2 = null;
                }
                if (arrayList4.size() > 0) {
                    int size3 = arrayList4.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        bfwj4.mo25984a((Object) ((bfwk) arrayList4.get(i4)));
                    }
                }
                bfwj4.f115502b = false;
                if (list2 != null && !list2.isEmpty()) {
                    bfwj4.mo9714a(2);
                }
                list = list2;
            }
            if (list == null || list.isEmpty()) {
                z2 = false;
            } else {
                try {
                    bfwg3.mo62364b();
                    z2 = false;
                } catch (IOException e3) {
                    z2 = true;
                }
            }
            if (z2) {
                bfwg3.f115499e.mo62371g();
            }
            bfwg3.f115499e.mo62372h();
            if (!z2) {
                return Pair.create(0, list);
            }
            return Pair.create(1, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0229 A[SYNTHETIC, Splitter:B:66:0x0229] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0248 A[RETURN] */
    /* renamed from: a */
    public final Pair mo62454a(GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        int i;
        Pair pair;
        int intValue;
        bfyy bfyy;
        GeofencingRequest geofencingRequest2 = geofencingRequest;
        if (geofencingRequest2.f79341a.size() == 0) {
            return Pair.create(0, null);
        }
        bfwg bfwg = this.f115748f;
        bfwg.f115499e.mo62373i();
        bfwj bfwj = bfwg.f115499e;
        String a = bhcb.m100621a(pendingIntent);
        String str = geofencingRequest2.f79343c;
        bfwk bfwk = new bfwk(a, str);
        if (cexk.f183493a.mo6606a().enableAddGeofencesThrottling()) {
            sgf sgf = (sgf) bfwj.f115506j.get(bfwk);
            if (sgf == null) {
                int geofencerAddGeofencesBurstEvents = (int) cexk.f183493a.mo6606a().geofencerAddGeofencesBurstEvents();
                sgf sgf2 = new sgf((int) cexk.f183493a.mo6606a().geofencerAddGeofencesIntervalSeconds(), geofencerAddGeofencesBurstEvents, geofencerAddGeofencesBurstEvents);
                bfwj.f115506j.put(bfwk, sgf2);
                sgf = sgf2;
            }
            if (!sgf.mo25492a()) {
                pair = Pair.create(1005, null);
                i = 1;
                intValue = ((Integer) pair.first).intValue();
                if (intValue != 0) {
                    i = intValue;
                } else {
                    try {
                        bfwg.mo62364b();
                        i = 0;
                    } catch (IOException e) {
                    }
                }
                if (i != 0) {
                    bfwg.f115499e.mo62371g();
                }
                bfwg.f115499e.mo62372h();
                return i != 0 ? Pair.create(Integer.valueOf(i), null) : pair;
            }
        }
        List list = geofencingRequest2.f79341a;
        C1223np npVar = new C1223np(list.size());
        int size = list.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            ParcelableGeofence parcelableGeofence = (ParcelableGeofence) list.get(i2);
            if (parcelableGeofence != null) {
                ParcelableGeofence parcelableGeofence2 = (ParcelableGeofence) npVar.put(parcelableGeofence.f79438a, parcelableGeofence);
                if (!z && parcelableGeofence2 == null) {
                    z = false;
                }
            }
            z = true;
        }
        if (z) {
            list = new ArrayList(npVar.values());
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            arrayList.add(((ParcelableGeofence) list.get(i3)).f79438a);
        }
        bfwj.mo62370a(bfwk, arrayList);
        bfwn bfwn = (bfwn) bfwj.mo25989b(bfwk);
        if (bfwn != null) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = bfwn.f115519c;
            int size3 = arrayList2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                hashSet.add(((bfwf) arrayList2.get(i4)).f115484b);
            }
            if (!hashSet.contains(pendingIntent) && hashSet.size() >= 5) {
                if (Log.isLoggable("GeofenceByPackageAndTag", 5)) {
                    bfxc.m98134c("GeofenceByPackageAndTag", String.format(Locale.US, "Too many PendingIntent from package: %s. At most %d allowed.", bfwn.f115518b.toString(), 5));
                }
                pair = Pair.create(1002, null);
                i = 1;
                intValue = ((Integer) pair.first).intValue();
                if (intValue != 0) {
                }
                if (i != 0) {
                }
                bfwg.f115499e.mo62372h();
                if (i != 0) {
                }
            }
        }
        bfwn bfwn2 = (bfwn) bfwj.mo25989b(bfwk);
        int size4 = list.size();
        if (bfwn2 != null) {
            int size5 = bfwn2.f115519c.size();
            if (size5 + size4 > 100) {
                if (Log.isLoggable("GeofenceByPackageAndTag", 5)) {
                    bfxc.m98134c("GeofenceByPackageAndTag", String.format(Locale.US, "Too many geofences (%d + %d) from package %s. At most %d allowed.", Integer.valueOf(size5), Integer.valueOf(size4), bfwn2.f115518b.toString(), 100));
                    i = 1;
                } else {
                    i = 1;
                }
                pair = Pair.create(1001, null);
                intValue = ((Integer) pair.first).intValue();
                if (intValue != 0) {
                }
                if (i != 0) {
                }
                bfwg.f115499e.mo62372h();
                if (i != 0) {
                }
            }
        } else if (size4 > 100) {
            i = 1;
            pair = Pair.create(1001, null);
            intValue = ((Integer) pair.first).intValue();
            if (intValue != 0) {
            }
            if (i != 0) {
            }
            bfwg.f115499e.mo62372h();
            if (i != 0) {
            }
        }
        bfwn a2 = bfwj.mo62369a(bfwk);
        if (a2 == null) {
            pair = Pair.create(1, null);
            i = 1;
        } else {
            ArrayList arrayList3 = new ArrayList(list.size());
            int size6 = list.size();
            int i5 = 0;
            while (i5 < size6) {
                ParcelableGeofence parcelableGeofence3 = (ParcelableGeofence) list.get(i5);
                int i6 = geofencingRequest2.f79342b;
                bfwh bfwh = bfwj.f115504h;
                while (true) {
                    bfyy = (bfyy) bfwh;
                    if (!bfyy.f115752j.containsKey(Integer.valueOf(bfyy.f115751i))) {
                        break;
                    }
                    bfyy.f115751i = (bfyy.f115751i + 1) % 8192;
                }
                bfwf bfwf = new bfwf(parcelableGeofence3, i6, pendingIntent, bfyy.f115751i, str);
                arrayList3.add(bfwf);
                a2.mo62383a(bfwf);
                i5++;
                arrayList3 = arrayList3;
                size6 = size6;
                geofencingRequest2 = geofencingRequest;
            }
            i = 1;
            pair = Pair.create(0, arrayList3);
        }
        intValue = ((Integer) pair.first).intValue();
        if (intValue != 0) {
        }
        if (i != 0) {
        }
        bfwg.f115499e.mo62372h();
        if (i != 0) {
        }
    }

    /* renamed from: a */
    public final bfwc mo62455a(long j, Location location, boolean z, double d, Map map) {
        Pair pair;
        long j2;
        if (z) {
            bfwo bfwo = this.f115745c;
            Pair pair2 = new Pair(Long.valueOf(j), location);
            if (pair2.second != null) {
                bfwo.f115522b = pair2;
                if (bfwo.f115521a.size() != 0) {
                    LinkedList linkedList = bfwo.f115521a;
                    pair = (Pair) linkedList.get(linkedList.size() - 1);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    j2 = ((Long) pair.first).longValue();
                } else {
                    j2 = -1;
                }
                if (pair != null && Math.abs(((Long) pair2.first).longValue() - j2) < 10000) {
                    if (((Location) pair.second).getAccuracy() <= ((Location) pair2.second).getAccuracy()) {
                        boolean z2 = bfxc.f115575a;
                    } else {
                        boolean z3 = bfxc.f115575a;
                        bfwo.f115521a.removeLast();
                    }
                }
                if (bfwo.f115521a.size() >= 100) {
                    bfwo.f115521a.remove(0);
                }
                long longValue = ((Long) pair2.first).longValue();
                int size = bfwo.f115521a.size() - 1;
                while (size >= 0 && longValue < ((Long) ((Pair) bfwo.f115521a.get(size)).first).longValue()) {
                    size--;
                }
                bfwo.f115521a.add(size + 1, pair2);
            }
        }
        bfwg bfwg = this.f115748f;
        bfwj bfwj = bfwg.f115499e;
        bfwc a = bfwj.f115503g.mo62336a(bfwj.mo25992c(), bfwj.mo62374j(), j, location, d, map);
        if (a != null) {
            try {
                bfwg.mo62364b();
            } catch (IOException e) {
            }
        }
        mo62456a(d);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo62456a(double d) {
        int i;
        boolean z = bfxc.f115575a;
        List a = this.f115748f.mo62360a(d, 1);
        int i2 = Integer.MAX_VALUE;
        if (a == null || a.size() != 1) {
            i = Integer.MAX_VALUE;
        } else {
            i = ((bfwf) a.get(0)).mo62351a(d);
        }
        this.f115743a = i;
        List b = this.f115748f.mo62363b(1);
        if (b != null && b.size() == 1) {
            i2 = ((bfwf) b.get(0)).mo62356d();
        }
        this.f115744b = i2;
        boolean z2 = bfxc.f115575a;
    }

    /* renamed from: a */
    public final void mo62367a(int i) {
        if (((bfwf) this.f115752j.remove(Integer.valueOf(i))) == null && Log.isLoggable("GeofencerStateInfo", 5) && Log.isLoggable("GeofencerStateInfo", 6)) {
            StringBuilder sb = new StringBuilder(54);
            sb.append("Trying to remove an ID that doesn't exist: ");
            sb.append(i);
            bfxc.m98133b("GeofencerStateInfo", sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo62368a(int i, bfwf bfwf) {
        if (Log.isLoggable("GeofencerStateInfo", 5) && this.f115752j.containsKey(Integer.valueOf(i)) && Log.isLoggable("GeofencerStateInfo", 6)) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("ID already exists. Overwriting the previous one: ");
            sb.append(i);
            bfxc.m98133b("GeofencerStateInfo", sb.toString());
        }
        this.f115752j.put(Integer.valueOf(i), bfwf);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rzz.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      rzz.a(java.lang.Object, java.lang.Object):void
      rzz.a(boolean, java.lang.Object):void */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo62457a(int i, boolean z, Collection collection, int i2, Collection collection2, boolean z2) {
        boolean z3;
        if (i <= 0) {
            this.f115747e.mo62519a();
        } else {
            this.f115747e.mo62520a(i, z, collection, z2);
        }
        if (i2 > 0) {
            bgev bgev = this.f115746d;
            StringBuilder sb = new StringBuilder(56);
            sb.append("Activity update interval should be positive: ");
            sb.append(i2);
            rzz.m34730a(true, (Object) sb.toString());
            if (collection2 == null) {
                boolean z4 = bfxc.f115575a;
                collection2 = Collections.singletonList(new ClientIdentity(bgev.f116301c, bgev.f116302d));
            }
            synchronized (bgev.f116306h) {
                if (i2 == bgev.f116308j) {
                    Collection collection3 = bgev.f116309k;
                    if (collection3 != null && collection3.equals(collection2)) {
                        boolean z5 = bfxc.f115575a;
                    }
                }
                long a = bgev.f116305g.mo62734a();
                if (a < 0 || SystemClock.elapsedRealtime() - a > 90000) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bgev.f116308j == -1) {
                    bgev.f116305g.mo62738a(true);
                }
                bgev.f116308j = i2;
                bgev.f116309k = collection2;
                bgev.mo62721a(i2, z3, collection2);
            }
            bfxa.f115569a.mo62410a(-1165682797, i2);
            return;
        }
        this.f115746d.mo62720a();
        bfxa.f115569a.mo62410a(-1206718418, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo62458a(Intent intent) {
        bgey bgey = this.f115750h;
        String action = intent.getAction();
        if ("android.intent.action.SCREEN_OFF".equals(action)) {
            bgey.mo62733a(false);
        } else if ("android.intent.action.SCREEN_ON".equals(action)) {
            bgey.mo62733a(true);
        } else if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
            bgey.mo62732a();
        } else if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
            bgey.mo62732a();
        }
    }

    /* renamed from: a */
    public final void mo62459a(Collection collection, PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            try {
                String a = bhcb.m100621a(pendingIntent);
                collection.add(new ClientIdentity(svr.m36484b(this.f115754l).mo26172a(a, 0).uid, a));
            } catch (PackageManager.NameNotFoundException e) {
            }
        } else {
            collection.add(bhby.m100614a(this.f115754l));
        }
    }
}
