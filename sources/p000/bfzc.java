package p000;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: bfzc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bfzc extends bfze {

    /* renamed from: a */
    final /* synthetic */ bfzt f115760a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfzc(bfzt bfzt, bfyy bfyy) {
        super(bfzt, bfyy);
        this.f115760a = bfzt;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
        if ((r8 > 0) == (r1.f115734c > 0)) goto L_0x0058;
     */
    /* renamed from: a */
    public final void mo62480a(int i, boolean z, boolean z2) {
        int i2 = -1;
        if (i <= 0) {
            int c = mo62474c();
            int d = mo62475d();
            if (c != -1) {
                i2 = d == -1 ? c : Math.max(20, Math.min(1800, Math.min(c, d)));
            } else if (d != -1) {
                i2 = d;
            }
        } else {
            i2 = i;
        }
        int b = mo62473b();
        bfyt bfyt = this.f115760a.f115789B;
        sgf sgf = bfyt.f115732a;
        if (sgf != null) {
            boolean a = sgf.mo25492a();
            boolean z3 = false;
            if ((i > 0) == (bfyt.f115733b > 0)) {
            }
            z3 = true;
            bfyt.f115733b = i;
            bfyt.f115734c = b;
            if (!a && !z3 && !z2) {
                return;
            }
        }
        this.f115763b.mo62457a(i2, z, mo62476e(), b, mo62477f(), z2);
        bfzt bfzt = this.f115760a;
        bfww bfww = bfzt.f115812q;
        if (bfww != null) {
            bfww.mo62399a(((bfze) bfzt.mo62550c()).mo62472a(), i2, b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo62488a(boolean z) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo62473b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo62489b(bfzl bfzl) {
        mo62481a(bfzl);
        mo62492d(false);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo62490b(boolean z) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo62474c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo62491c(boolean z) {
        this.f115763b.mo62456a(mo62479h());
        if (this.f115763b.mo62464c()) {
            mo62492d(z);
            return;
        }
        bfzt bfzt = this.f115760a;
        bfzt.mo62547b(bfzt.f115796a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo62475d();

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfzc.a(int, boolean, boolean):void
     arg types: [int, boolean, int]
     candidates:
      bfze.a(java.lang.String, com.google.android.gms.location.GeofencingRequest, java.util.List):boolean
      bfzc.a(int, boolean, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo62492d(boolean z) {
        mo62480a(-1, z, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Collection mo62476e() {
        Pair pair;
        HashSet hashSet = null;
        if (this.f115763b.mo62460a()) {
            return null;
        }
        bfyy bfyy = this.f115763b;
        double h = mo62479h();
        List<bfwf> a = bfyy.f115748f.mo62360a(h, 100);
        List<bfwf> b = bfyy.f115748f.mo62363b(100);
        if (!bfyy.m98204a(a) || !bfyy.m98204a(b)) {
            hashSet = new HashSet();
            if (bfyy.m98204a(b)) {
                pair = Pair.create((bfwf) a.get(0), Integer.valueOf(((bfwf) a.get(0)).mo62351a(h)));
            } else if (bfyy.m98204a(a)) {
                pair = Pair.create((bfwf) b.get(0), Integer.valueOf(((bfwf) b.get(0)).mo62356d()));
            } else {
                bfwf bfwf = (bfwf) a.get(0);
                bfwf bfwf2 = (bfwf) b.get(0);
                int a2 = bfwf.mo62351a(h);
                int d = bfwf2.mo62356d();
                pair = a2 >= d ? Pair.create(bfwf2, Integer.valueOf(d)) : Pair.create(bfwf, Integer.valueOf(a2));
            }
            bfyy.mo62459a(hashSet, ((bfwf) pair.first).f115484b);
            long max = (long) Math.max(60, ((((Integer) pair.second).intValue() + 1) * 3) / 2);
            if (a != null) {
                for (bfwf bfwf3 : a) {
                    if (((long) bfwf3.mo62351a(h)) <= max) {
                        bfyy.mo62459a(hashSet, bfwf3.f115484b);
                    }
                }
            }
            if (b != null) {
                for (bfwf bfwf4 : b) {
                    if (((long) bfwf4.mo62356d()) <= max) {
                        bfyy.mo62459a(hashSet, bfwf4.f115484b);
                    }
                }
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Collection mo62477f() {
        bfyy bfyy = this.f115763b;
        bfwj bfwj = bfyy.f115748f.f115499e;
        C1225nr<String> nrVar = new C1225nr();
        for (bfwk bfwk : bfwj.f44998d.keySet()) {
            nrVar.add(bfwk.f115510a);
        }
        ArrayList arrayList = new ArrayList(nrVar.f26758b);
        for (String str : nrVar) {
            try {
                arrayList.add(new ClientIdentity(svr.m36484b(bfyy.f115754l).mo26172a(str, 0).uid, str));
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract double mo62479h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo62493i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo62494j() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62481a(bfzl bfzl) {
        Pair pair;
        bfzl bfzl2 = bfzl;
        if (this.f115760a.f115820y && bfzl2.f115777c == null && (pair = this.f115763b.f115745c.f115522b) != null && bfzl2.f115776b.getAccuracy() > 30.0f) {
            double accuracy = (double) ((Location) pair.second).getAccuracy();
            Double.isNaN(accuracy);
            if (((double) bfzl2.f115776b.getAccuracy()) > accuracy * 3.0d) {
                if (!cexh.m138383b()) {
                    bfxa.f115569a.mo62416a(new bfwy(-826286066, bfzl2.f115776b, "Inaccurate location dropped"));
                } else {
                    bfxa.f115569a.mo62412a(-1809410856, bfzl2.f115776b, 6);
                }
                if (Log.isLoggable("GeofencerStateMachine", 4)) {
                    bfxc.m98132a("GeofencerStateMachine", "Inaccurate location dropped.");
                    return;
                }
                return;
            }
        }
        Location location = bfzl2.f115776b;
        bfwc a = this.f115763b.mo62455a(bfzl2.f115775a, location, true, mo62479h(), bfzl2.f115777c);
        if (this.f115760a.f115812q != null) {
            List b = this.f115763b.mo62462b(1);
            if (b != null && !b.isEmpty()) {
                ParcelableGeofence parcelableGeofence = ((bfwf) b.get(0)).f115483a;
                float[] fArr = new float[1];
                Location.distanceBetween(location.getLatitude(), location.getLongitude(), parcelableGeofence.f79441d, parcelableGeofence.f79442e, fArr);
                bfzt bfzt = this.f115760a;
                bfww bfww = bfzt.f115812q;
                bpms a2 = ((bfze) bfzt.mo62550c()).mo62472a();
                float accuracy2 = location.getAccuracy();
                float f = fArr[0] - parcelableGeofence.f79443f;
                if (bfww.mo62407d()) {
                    bxvd e = bfww.mo62408e();
                    bxvd da = bpmu.f138355e.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpmu bpmu = (bpmu) da.f164949b;
                    bpmu.f138358b = a2.f138340m;
                    int i = 1 | bpmu.f138357a;
                    bpmu.f138357a = i;
                    int i2 = i | 2;
                    bpmu.f138357a = i2;
                    bpmu.f138359c = accuracy2;
                    bpmu.f138357a = 4 | i2;
                    bpmu.f138360d = f;
                    bpmu bpmu2 = (bpmu) da.mo74062i();
                    if (e.f164950c) {
                        e.mo74035c();
                        e.f164950c = false;
                    }
                    bpmt bpmt = (bpmt) e.f164949b;
                    bpmt bpmt2 = bpmt.f138341m;
                    bpmu2.getClass();
                    bpmt.f138352j = bpmu2;
                    bpmt.f138343a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    bfww.f115542a.mo62394a((bpmt) e.mo74062i());
                }
            } else {
                return;
            }
        }
        if (a != null) {
            this.f115760a.mo62514b(a, location);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62482a(LocationAvailability locationAvailability) {
        if (this.f115760a.f115817v != locationAvailability.mo43544a()) {
            this.f115760a.f115817v = locationAvailability.mo43544a();
            if (!this.f115760a.f115817v) {
                this.f115763b.f115748f.mo62361a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo62483a(Intent intent) {
        this.f115763b.mo62458a(intent);
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfzc.a(int, boolean, boolean):void
     arg types: [int, int, int]
     candidates:
      bfze.a(java.lang.String, com.google.android.gms.location.GeofencingRequest, java.util.List):boolean
      bfzc.a(int, boolean, boolean):void */
    /* renamed from: a */
    public boolean mo62484a(Message message) {
        Integer num;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        Integer num2;
        Message message2 = message;
        boolean z4 = bfxc.f115575a;
        int i = message2.what;
        if (i == 4) {
            z = false;
            num = null;
        } else {
            if (i != 5) {
                bfwg bfwg = this.f115763b.f115748f;
                bfwj bfwj = bfwg.f115499e;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                bfwj.f115502b = true;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = null;
                for (bfwn bfwn : bfwj.mo25994e()) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = bfwn.f115519c.iterator();
                    while (it.hasNext()) {
                        bfwf bfwf = (bfwf) it.next();
                        Iterator it2 = it;
                        long j = bfwf.f115483a.f79439b;
                        if (j < 0 || j >= elapsedRealtime) {
                            break;
                        }
                        boolean z5 = bfxc.f115575a;
                        bfwn.f115517a.mo62367a(bfwf.f115492j);
                        arrayList3.add(bfwf);
                        it2.remove();
                        it = it2;
                    }
                    arrayList.addAll(arrayList3);
                    if (bfwn.mo62380a() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(bfwn.f115518b);
                    }
                }
                if (arrayList2 != null) {
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
                    } catch (IOException e) {
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f115763b.mo62456a(mo62479h());
                    num = null;
                    z = mo62501a((String) null, arrayList);
                    if (z && !this.f115763b.mo62464c()) {
                        this.f115760a.mo62542a(message2);
                        bfzt bfzt = this.f115760a;
                        bfzt.mo62547b(bfzt.f115796a);
                        return true;
                    }
                }
            }
            num = null;
            z = false;
        }
        if (i != 1) {
            if (i == 97) {
                mo62482a((LocationAvailability) message2.obj);
                z3 = false;
                z2 = true;
            } else if (i == 101) {
                boolean booleanValue = ((Boolean) message2.obj).booleanValue();
                if (!this.f115760a.f115789B.mo62446a()) {
                    return true;
                }
                mo62480a(-1, false, true);
                this.f115760a.f115820y = booleanValue;
                return true;
            } else if (i != 151) {
                switch (i) {
                    case 4:
                        z3 = mo62486a((bfyl) message2.obj);
                        z2 = true;
                        break;
                    case 5:
                        z3 = mo62499a((bgae) message2.obj);
                        z2 = true;
                        break;
                    case 6:
                        z3 = mo62489b((bfzl) message2.obj);
                        z2 = true;
                        break;
                    case 7:
                        z3 = mo62485a((Pair) message2.obj);
                        z2 = true;
                        break;
                    case 8:
                        this.f115763b.mo62456a(mo62479h());
                        mo62492d(true);
                        z3 = true;
                        z2 = true;
                        break;
                    case 9:
                        z3 = mo62483a((Intent) message2.obj);
                        z2 = true;
                        break;
                    case 10:
                        this.f115763b.mo62468g();
                        z3 = false;
                        z2 = true;
                        break;
                    case 11:
                        this.f115760a.mo62547b(mo62496a(this.f115763b.mo62469h()));
                        this.f115760a.mo62552d();
                        z3 = false;
                        z2 = true;
                        break;
                    default:
                        switch (i) {
                            case 13:
                                z3 = mo62488a(((Boolean) message2.obj).booleanValue());
                                z2 = true;
                                break;
                            case 14:
                                z3 = mo62490b(((Boolean) message2.obj).booleanValue());
                                z2 = true;
                                break;
                            case 15:
                                z3 = mo62494j();
                                z2 = true;
                                break;
                            case 16:
                                mo62491c(message2.arg1 == 1);
                                z3 = false;
                                z2 = true;
                                break;
                            default:
                                z2 = mo62502b(message);
                                z3 = false;
                                break;
                        }
                }
            } else {
                bfyq bfyq = this.f115763b.f115753k;
                bufg bufg = (bufg) message2.obj;
                if (!bfyq.mo62440f()) {
                    if (Log.isLoggable("ChreGeofenceHardware", 4)) {
                        bfxc.m98132a("ChreGeofenceHardware", "Transition dropped because it was from old CHRE connection.");
                    }
                    z3 = false;
                    z2 = true;
                } else {
                    bueu bueu = bufg.f153694a;
                    if (bueu == null) {
                        bueu = bueu.f153646k;
                    }
                    int i3 = bueu.f153648a;
                    if ((i3 & 4) == 0 || (i3 & 8) == 0 || (i3 & 2) == 0) {
                        if (Log.isLoggable("ChreGeofenceHardware", 5)) {
                            bfxc.m98134c("ChreGeofenceHardware", "Invalid location received.");
                        }
                        z3 = false;
                        z2 = true;
                    } else {
                        int i4 = bueu.f153657j;
                        if (i4 != 0) {
                            str = i4 != 1 ? i4 != 2 ? i4 != 3 ? "unknown" : "other" : "cell" : "wifi";
                        } else {
                            str = "gps";
                        }
                        Location location = new Location(str.length() == 0 ? new String("chre:") : "chre:".concat(str));
                        double d = (double) bueu.f153651d;
                        Double.isNaN(d);
                        location.setLatitude(d / 1.0E7d);
                        double d2 = (double) bueu.f153652e;
                        Double.isNaN(d2);
                        location.setLongitude(d2 / 1.0E7d);
                        location.setElapsedRealtimeNanos(bueu.f153650c);
                        if ((bueu.f153648a & 1) != 0) {
                            location.setTime(bueu.f153649b / 1000000);
                        } else {
                            location.setTime(System.currentTimeMillis() - ((SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000));
                        }
                        if ((bueu.f153648a & 16) != 0) {
                            location.setAccuracy((float) bueu.f153653f);
                        }
                        if ((bueu.f153648a & 32) != 0) {
                            location.setAltitude((double) bueu.f153654g);
                        }
                        if ((bueu.f153648a & 64) != 0) {
                            location.setSpeed(bueu.f153655h);
                        }
                        if ((bueu.f153648a & 128) != 0) {
                            location.setBearing(bueu.f153656i);
                        }
                        C1223np npVar = new C1223np();
                        for (int i5 = 0; i5 < bfyq.f115706a.size(); i5++) {
                            bfwf bfwf2 = (bfwf) bfyq.f115706a.get(i5);
                            if (bfwf2 != null) {
                                npVar.put(bfwf2, (byte) 0);
                            }
                        }
                        boolean z6 = false;
                        for (int i6 = 0; i6 < bufg.f153695b.size(); i6++) {
                            int i7 = ((buff) bufg.f153695b.get(i6)).f153689b;
                            if (i7 >= 0) {
                                if (i7 < bfyq.f115706a.size()) {
                                    bfwf bfwf3 = (bfwf) bfyq.f115706a.get(i7);
                                    if (bfwf3 != null) {
                                        if ((((buff) bufg.f153695b.get(i6)).f153688a & 4) != 0) {
                                            num2 = Integer.valueOf(((buff) bufg.f153695b.get(i6)).f153691d);
                                        } else {
                                            num2 = num;
                                        }
                                        byte b = (byte) ((buff) bufg.f153695b.get(i6)).f153690c;
                                        if (bfwf3 != bfyq.f115717l) {
                                            if (num2 == null || num2.intValue() == bfwf3.f115492j) {
                                                npVar.put(bfwf3, Byte.valueOf((byte) ((buff) bufg.f153695b.get(i6)).f153690c));
                                            } else if (Log.isLoggable("ChreGeofenceHardware", 5)) {
                                                bfxc.m98134c("ChreGeofenceHardware", "Transition dropped because unique ID mismatches.");
                                            }
                                        } else if (b == 2) {
                                            z6 = true;
                                        }
                                    }
                                }
                            }
                            if (Log.isLoggable("ChreGeofenceHardware", 5)) {
                                bfxc.m98134c("ChreGeofenceHardware", "Geofence slot index out of range.");
                            }
                        }
                        Location location2 = bfyq.f115716k;
                        if (location2 != null && location2.getElapsedRealtimeNanos() == location.getElapsedRealtimeNanos()) {
                            z3 = false;
                            z2 = true;
                        } else {
                            bfyq.f115716k = location;
                            bfyq.f115715j.mo62509a(location, npVar, z6);
                            z3 = false;
                            z2 = true;
                        }
                    }
                }
            }
            this.f115763b.f115746d.f116305g.mo62741d();
            if (z && !z3) {
                boolean z7 = bfxc.f115575a;
                mo62492d(false);
            }
            return z2;
        } else if (!this.f115760a.f115819x.mo62522a()) {
            if (Log.isLoggable("GeofencerStateMachine", 4)) {
                bfxc.m98132a("GeofencerStateMachine", "Network location disabled.");
            }
            bfzt bfzt2 = this.f115760a;
            bfzt2.mo62547b(bfzt2.f115797b);
            return true;
        } else if (this.f115760a.f115819x.mo62523b()) {
            return true;
        } else {
            if (Log.isLoggable("GeofencerStateMachine", 4)) {
                bfxc.m98132a("GeofencerStateMachine", "GPS disabled.");
            }
            mo62493i();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo62485a(Pair pair) {
        bgaf a = mo62496a((bgez) pair.second);
        rzz.m34731b(a);
        if (!cexk.m138390c()) {
            this.f115760a.mo62552d();
        }
        this.f115760a.mo62547b(a);
        return false;
    }

    /* renamed from: a */
    public boolean mo62486a(bfyl bfyl) {
        return mo62487a(bfyl, 5);
    }

    /* renamed from: a */
    public final boolean mo62487a(bfyl bfyl, int i) {
        bfwc bfwc;
        boolean z = bfxc.f115575a;
        Pair a = this.f115763b.mo62454a(bfyl.f115696a, bfyl.f115697b);
        int intValue = ((Integer) a.first).intValue();
        bfyl.mo62449a(Integer.valueOf(intValue));
        if (a.second != null) {
            mo62500a(bhcb.m100621a(bfyl.f115697b), bfyl.f115696a, (List) a.second);
        }
        if (!cexk.m138390c()) {
            bfyy bfyy = this.f115763b;
            Pair pair = bfyy.f115745c.f115522b;
            double h = mo62479h();
            Pair pair2 = bfyy.f115745c.f115522b;
            Location location = null;
            if (pair2 == null) {
                bfwc = null;
            } else {
                bfwc = (i < 0 || SystemClock.elapsedRealtime() - ((Long) pair2.first).longValue() < ((long) i) * 1000) ? bfyy.mo62455a(((Long) pair2.first).longValue(), (Location) pair2.second, false, h, null) : null;
            }
            if (bfwc != null) {
                bfzt bfzt = this.f115760a;
                if (pair != null) {
                    location = (Location) pair.second;
                }
                bfzt.mo62514b(bfwc, location);
            }
        }
        return intValue == 0;
    }
}
