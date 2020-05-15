package p000;

import android.location.Location;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: bfzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfzg extends bfzc {

    /* renamed from: d */
    public final bfyq f115766d = this.f115763b.f115753k;

    /* renamed from: e */
    final /* synthetic */ bfzt f115767e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bfzg(bfzt bfzt, bfyy bfyy) {
        super(bfzt, bfyy);
        this.f115767e = bfzt;
    }

    /* renamed from: a */
    public final bpms mo62472a() {
        return bpms.CHRE_GEOFENCING;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo62473b() {
        return this.f115766d.mo62440f() ? -1 : 180;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo62474c() {
        return this.f115766d.mo62440f() ? -1 : 20;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo62491c(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo62475d() {
        return this.f115766d.mo62440f() ? -1 : 20;
    }

    /* renamed from: g */
    public final String mo62478g() {
        return "ChreGeofencingState";
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final double mo62479h() {
        return 1.5d;
    }

    /* renamed from: k */
    public final void mo62503k() {
        this.f115763b.mo62466e();
        super.mo62503k();
    }

    /* renamed from: l */
    public final void mo62504l() {
        if (ceub.f183433a.mo6606a().bugFixUnloadFromChreWhenNlpTurnsOff()) {
            this.f115766d.mo62428a(new bfzf(this));
        } else {
            this.f115766d.mo62438d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62497a(bfwc bfwc) {
        bfyq bfyq = this.f115766d;
        ArrayList<bfwf> arrayList = bfwc.f115477a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (bfyq.f115706a) {
            Iterator it = bfyq.f115710e.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (((bfwf) it.next()).mo62353a() != 0) {
                    it.remove();
                    z = true;
                }
            }
            Iterator it2 = bfyq.f115711f.iterator();
            while (it2.hasNext()) {
                if (!((bfwf) it2.next()).mo62355c()) {
                    it2.remove();
                    z = true;
                }
            }
            if (arrayList != null) {
                for (bfwf bfwf : arrayList) {
                    if (bfwf.mo62355c()) {
                        bfyq.f115711f.add(bfwf);
                    }
                }
            }
            if (z && bfyq.mo62434a(elapsedRealtime)) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                bfyq.mo62436b(arrayList2, arrayList3);
                bfyq.mo62430a(arrayList2, arrayList3);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo62489b(bfzl bfzl) {
        if (bfzl.f115777c != null) {
            mo62481a(bfzl);
            if (!bfzl.f115778d) {
                return true;
            }
            mo62492d(false);
            return true;
        }
        if (!cexh.m138383b()) {
            bfxa.f115569a.mo62416a(new bfwy(1143824402, bfzl.f115776b, "CHRE drops location without transition"));
        } else {
            bfxa.f115569a.mo62412a(186236805, bfzl.f115776b, 8);
        }
        boolean z = bfxc.f115575a;
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo62492d(boolean z) {
        Location location;
        bfww bfww;
        Pair pair = this.f115763b.f115745c.f115522b;
        long j = 1;
        if (pair == null) {
            location = new Location("none");
            location.setLatitude(0.0d);
            location.setLongitude(0.0d);
            location.setTime(1);
            location.setElapsedRealtimeNanos(1);
        } else {
            j = ((Long) pair.first).longValue();
            location = (Location) pair.second;
        }
        List b = this.f115763b.mo62461b();
        if (b != null) {
            bfyq bfyq = this.f115766d;
            C1223np c = bfyq.mo62437c();
            if (z || !c.keySet().containsAll(b) || c.f26809h != b.size()) {
                int b2 = bfyq.f115712g - ((int) ceuh.m138254b());
                if (!(!cewy.m138375b() || bfyq.f115729y == null || (bfww = bfyq.f115728x) == null)) {
                    bfww.mo62406c();
                }
                bfyq.f115729y = null;
                bfxa.f115569a.mo62411a(2015944242, 4, (bfwf) null);
                if (b.size() <= b2) {
                    bfyq.mo62432a(b);
                } else {
                    int i = b2 - 1;
                    List a = bnny.m109908a(new bfyn(location)).mo68162a(b, b2);
                    ArrayList arrayList = new ArrayList(a.subList(0, i));
                    boolean z2 = bfxc.f115575a;
                    bfyq.f115711f.clear();
                    bfyq.f115710e.clear();
                    for (int i2 = i; i2 < a.size(); i2++) {
                        bfwf bfwf = (bfwf) a.get(i2);
                        if (bfwf.mo62353a() == 0) {
                            bfyq.f115710e.add(bfwf);
                        } else if (bfwf.mo62355c()) {
                            bfyq.f115711f.add(bfwf);
                        }
                    }
                    bfwf bfwf2 = (bfwf) a.get(i);
                    bfww bfww2 = bfyq.f115728x;
                    if (bfww2 != null) {
                        bfww2.mo62406c();
                    }
                    bfyq.f115729y = bues.f153631l.mo74144da();
                    bxvd bxvd = bfyq.f115729y;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bues bues = (bues) bxvd.f164949b;
                    bues.f153633a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    bues.f153642j = -2;
                    bxvd bxvd2 = bfyq.f115729y;
                    int latitude = (int) (location.getLatitude() * 1.0E7d);
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    bues bues2 = (bues) bxvd2.f164949b;
                    bues2.f153633a |= 1;
                    bues2.f153634b = latitude;
                    bxvd bxvd3 = bfyq.f115729y;
                    int longitude = (int) (location.getLongitude() * 1.0E7d);
                    if (bxvd3.f164950c) {
                        bxvd3.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    bues bues3 = (bues) bxvd3.f164949b;
                    bues3.f153633a |= 2;
                    bues3.f153635c = longitude;
                    bxvd bxvd4 = bfyq.f115729y;
                    int a2 = (int) bfwf2.mo62350a(location);
                    if (bxvd4.f164950c) {
                        bxvd4.mo74035c();
                        bxvd4.f164950c = false;
                    }
                    bues bues4 = (bues) bxvd4.f164949b;
                    bues4.f153633a |= 4;
                    bues4.f153636d = a2;
                    bxvd bxvd5 = bfyq.f115729y;
                    if (bxvd5.f164950c) {
                        bxvd5.mo74035c();
                        bxvd5.f164950c = false;
                    }
                    bues bues5 = (bues) bxvd5.f164949b;
                    bues5.f153633a |= 8;
                    bues5.f153637e = 0;
                    bfyq.mo62434a(j);
                    bfxb bfxb = bfxa.f115569a;
                    bxvd bxvd6 = bfyq.f115729y;
                    if (cexh.m138385d()) {
                        if (bxvd6 != null) {
                            bxvd da = bfyf.f115676l.mo74144da();
                            bxvd da2 = bfye.f115663l.mo74144da();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bfye bfye = (bfye) da2.f164949b;
                            bfye.f115666b = 1;
                            int i3 = bfye.f115665a | 1;
                            bfye.f115665a = i3;
                            bues bues6 = (bues) bxvd6.f164949b;
                            int i4 = bues6.f153634b;
                            int i5 = i3 | 2;
                            bfye.f115665a = i5;
                            double d = (double) i4;
                            Double.isNaN(d);
                            bfye.f115667c = d / 1.0E7d;
                            int i6 = bues6.f153635c;
                            int i7 = i5 | 4;
                            bfye.f115665a = i7;
                            double d2 = (double) i6;
                            Double.isNaN(d2);
                            bfye.f115668d = d2 / 1.0E7d;
                            int i8 = bues6.f153636d;
                            bfye.f115665a = i7 | 8;
                            bfye.f115669e = (float) i8;
                            String valueOf = String.valueOf(bues6.f153642j);
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bfye bfye2 = (bfye) da2.f164949b;
                            valueOf.getClass();
                            int i9 = bfye2.f115665a | 32;
                            bfye2.f115665a = i9;
                            bfye2.f115671g = valueOf;
                            bues bues7 = (bues) bxvd6.f164949b;
                            int i10 = bues7.f153639g;
                            int i11 = i9 | 64;
                            bfye2.f115665a = i11;
                            bfye2.f115672h = i10;
                            int i12 = bues7.f153637e;
                            int i13 = i11 | 128;
                            bfye2.f115665a = i13;
                            bfye2.f115673i = i12 * 1000;
                            int i14 = bues7.f153638f;
                            int i15 = i13 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            bfye2.f115665a = i15;
                            bfye2.f115674j = i14 * 1000;
                            int i16 = bues7.f153641i;
                            bfye2.f115665a = i15 | 512;
                            bfye2.f115675k = i16;
                            bfye bfye3 = (bfye) da2.mo74062i();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bfyf bfyf = (bfyf) da.f164949b;
                            bfye3.getClass();
                            bfyf.f115679b = bfye3;
                            int i17 = bfyf.f115678a | 1;
                            bfyf.f115678a = i17;
                            bfyf.f115681d = 0;
                            int i18 = i17 | 4;
                            bfyf.f115678a = i18;
                            bfyf.f115682e = 0;
                            int i19 = i18 | 8;
                            bfyf.f115678a = i19;
                            int i20 = i19 | 32;
                            bfyf.f115678a = i20;
                            bfyf.f115684g = false;
                            int i21 = i20 | 64;
                            bfyf.f115678a = i21;
                            bfyf.f115685h = false;
                            int i22 = ((bues) bxvd6.f164949b).f153642j;
                            bfyf.f115678a = i21 | 128;
                            bfyf.f115686i = i22;
                            bfxb.mo62417a(new bfxl(-1798342140, (bfyf) da.mo74062i(), 4));
                        } else {
                            bfxb.mo62417a(new bfxl(-1798342140, null, 4));
                        }
                    }
                    boolean z3 = bfxc.f115575a;
                    bfyq.mo62432a((List) arrayList);
                }
                bfyq.mo62439e();
            } else {
                boolean z4 = bfxc.f115575a;
            }
        }
        if (!this.f115766d.mo62440f()) {
            super.mo62492d(z);
        }
    }

    /* renamed from: a */
    public final void mo62498a(PrintWriter printWriter) {
        super.mo62498a(printWriter);
        printWriter.print("\n    Using CHRE geofencing");
    }

    /* renamed from: a */
    public final boolean mo62484a(Message message) {
        boolean z = bfxc.f115575a;
        int i = message.what;
        if (i == 4) {
            mo62486a((bfyl) message.obj);
            return true;
        } else if (i == 5) {
            mo62499a((bgae) message.obj);
            return true;
        } else if (i != 154) {
            return super.mo62484a(message);
        } else {
            bfzt bfzt = this.f115767e;
            bfzt.mo62547b(bfzt.f115798c);
            this.f115767e.mo62553d(8);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo62485a(Pair pair) {
        this.f115763b.mo62466e();
        return true;
    }

    /* renamed from: a */
    public final boolean mo62486a(bfyl bfyl) {
        boolean z = bfxc.f115575a;
        Pair a = this.f115763b.mo62454a(bfyl.f115696a, bfyl.f115697b);
        bfyl.mo62449a(Integer.valueOf(((Integer) a.first).intValue()));
        if (a.second == null || !mo62500a(bhcb.m100621a(bfyl.f115697b), bfyl.f115696a, (List) a.second)) {
            return false;
        }
        mo62492d(false);
        return true;
    }

    /* renamed from: a */
    public final boolean mo62499a(bgae bgae) {
        boolean z = bfxc.f115575a;
        Pair a = this.f115767e.f115808m.mo62453a(bgae);
        bgae.mo62449a(Integer.valueOf(((Integer) a.first).intValue()));
        if (a.second != null) {
            boolean a2 = mo62501a(bgae.f115864b, (List) a.second);
            bfww bfww = this.f115767e.f115812q;
            if (bfww != null) {
                bfww.mo62401a(bgae.f115864b, bgae.f115863a, ((List) a.second).size());
            }
            if (a2) {
                mo62492d(false);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo62500a(String str, GeofencingRequest geofencingRequest, List list) {
        boolean z;
        Iterator it;
        String str2 = str;
        GeofencingRequest geofencingRequest2 = geofencingRequest;
        List list2 = list;
        if (this.f115767e.f115812q != null) {
            Pair pair = this.f115763b.f115745c.f115522b;
            if (pair == null || pair.second == null) {
                this.f115767e.f115812q.mo62403a(str2, geofencingRequest2, list2, (Location) null);
            } else {
                this.f115767e.f115812q.mo62403a(str2, geofencingRequest2, list2, (Location) pair.second);
            }
            this.f115767e.f115812q.mo62402a(str2, geofencingRequest2, this.f115763b.mo62452a(str2, geofencingRequest2.f79343c), this.f115763b.mo62465d());
        }
        bfyq bfyq = this.f115766d;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (ceuh.m138254b() != 0) {
            synchronized (bfyq.f115706a) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    bfwf bfwf = (bfwf) it2.next();
                    bxvd bxvd = bfyq.f115729y;
                    if (bxvd != null) {
                        ParcelableGeofence parcelableGeofence = bfwf.f115483a;
                        it = it2;
                        double d = parcelableGeofence.f79441d;
                        double d2 = parcelableGeofence.f79442e;
                        bues bues = (bues) bxvd.f164949b;
                        int i = bues.f153634b;
                        int i2 = bues.f153635c;
                        double d3 = (double) i;
                        Double.isNaN(d3);
                        double d4 = d3 / 1.0E7d;
                        double d5 = (double) i2;
                        Double.isNaN(d5);
                        double b = ayuo.m84846b(d, d2, d4, d5 / 1.0E7d);
                        double d6 = (double) bfwf.f115483a.f79443f;
                        Double.isNaN(d6);
                        if (Math.abs(d6 - b) >= ((double) ((bues) bfyq.f115729y.f164949b).f153636d)) {
                            arrayList3.add(bfwf);
                            it2 = it;
                        }
                    } else {
                        it = it2;
                    }
                    arrayList2.add(bfwf);
                    it2 = it;
                }
                if (arrayList2.size() <= bfyq.f115708c.size()) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        bfwf bfwf2 = (bfwf) it3.next();
                        ArrayList arrayList5 = bfyq.f115708c;
                        int intValue = ((Integer) arrayList5.remove(arrayList5.size() - 1)).intValue();
                        arrayList4.add(new bfyo(intValue, bfwf2));
                        bfyq.mo62431a(arrayList, arrayList4, bfwf2.mo62352a(intValue));
                    }
                    if (!arrayList3.isEmpty()) {
                        bfyq.f115710e.addAll(arrayList3);
                        if (bfyq.mo62434a(elapsedRealtime)) {
                            bfyq.mo62436b(arrayList, arrayList4);
                        }
                    }
                    bfyq.mo62430a(arrayList, arrayList4);
                    bfyq.mo62439e();
                    z = false;
                } else {
                    z = true;
                }
            }
        } else {
            z = true;
        }
        if (!cexh.m138383b()) {
            bfxa.f115569a.mo62416a(new bfwx(1994801178, str, list, "Geofences added to CHRE", z));
        } else {
            bfxa.f115569a.mo62413a(121165822, list2, 6, z);
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo62501a(String str, List list) {
        bfyq bfyq = this.f115766d;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        if (ceuh.m138254b() != 0) {
            synchronized (bfyq.f115706a) {
                ArrayList arrayList = new ArrayList();
                C1223np c = bfyq.mo62437c();
                Iterator it = list.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    bfwf bfwf = (bfwf) it.next();
                    z2 = z2 | bfyq.f115710e.remove(bfwf) | bfyq.f115711f.remove(bfwf);
                    Integer num = (Integer) c.get(bfwf);
                    if (num != null) {
                        arrayList.add(new bfyo(num.intValue(), bfwf));
                    }
                }
                bfyq.mo62429a(arrayList);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                if (z2) {
                    if (bfyq.mo62434a(elapsedRealtime)) {
                        bfyq.mo62436b(arrayList2, arrayList3);
                    }
                }
                bfyq.mo62430a(arrayList2, arrayList3);
                bfyq.mo62439e();
            }
        } else {
            z = true;
        }
        if (!cexh.m138383b()) {
            bfxa.f115569a.mo62416a(new bfwx(875464514, str, list, "Geofences removed from CHRE", z));
        } else {
            bfxa.f115569a.mo62413a(2123333319, list, 7, z);
        }
        return z;
    }
}
