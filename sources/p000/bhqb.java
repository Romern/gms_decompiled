package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.leveldb.WriteBatch;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.location.places.internal.PlaceOpeningHoursEntity;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: bhqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhqb implements bhqa {

    /* renamed from: a */
    private final File f119292a;

    /* renamed from: b */
    private final String f119293b;

    /* renamed from: c */
    private final Context f119294c;

    /* renamed from: d */
    private int f119295d = 0;

    /* renamed from: e */
    private long f119296e;

    /* renamed from: f */
    private LevelDb f119297f;

    /* renamed from: g */
    private SharedPreferences f119298g;

    /* renamed from: h */
    private int f119299h = 0;

    /* renamed from: i */
    private int f119300i = 0;

    /* renamed from: j */
    private int f119301j = 0;

    /* renamed from: k */
    private int f119302k = 0;

    public bhqb(Context context, String str) {
        this.f119294c = context;
        this.f119293b = str;
        File cacheDir = this.f119294c.getCacheDir();
        String str2 = File.separator;
        String str3 = this.f119293b;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 12 + String.valueOf(str3).length());
        sb.append("places_cache");
        sb.append(str2);
        sb.append(str3);
        this.f119292a = new File(cacheDir, sb.toString());
    }

    /* renamed from: a */
    private static byte[] m101310a(String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: d */
    private final void m101311d(long j) {
        WriteBatch create = WriteBatch.create();
        LevelDb.Iterator it = this.f119297f.iterator();
        it.seekToFirst();
        int i = 0;
        while (it.isValid()) {
            try {
                if (bxuc.m123419a(it.value()).mo73798g() < j) {
                    create.delete(it.key());
                } else {
                    i++;
                }
            } catch (IOException e) {
                if (Log.isLoggable("Places", 5)) {
                    bioi.m102661b("Places", "Failed to read timestamp", e);
                }
            }
            it.next();
        }
        it.close();
        try {
            this.f119297f.write(create);
            this.f119295d = i;
        } catch (LevelDbException e2) {
            bioi.m102661b("Places", "Failed delete old entries", e2);
            this.f119302k++;
        }
        create.close();
    }

    /* renamed from: b */
    public final synchronized void mo64155b(long j) {
        if (this.f119297f == null) {
            SharedPreferences sharedPreferences = this.f119294c.getSharedPreferences(this.f119293b, 0);
            this.f119298g = sharedPreferences;
            int i = sharedPreferences.getInt("version", -1);
            if (i != 2 || !this.f119292a.exists() || !this.f119292a.isDirectory()) {
                Context context = this.f119294c;
                this.f119298g.edit().putInt("version", 2).putLong("last_maintenance", j).putInt("key_count", 0).apply();
                if (i <= 0) {
                    File file = new File(context.getCacheDir(), "place_cache");
                    if (file.exists() && file.isDirectory() && !srj.m36120a(file) && Log.isLoggable("Places", 5)) {
                        bioi.m102662c("Places", "Failed to remove old places cache");
                    }
                }
                this.f119295d = 0;
                File file2 = this.f119292a;
                if (((file2.exists() && !srj.m36120a(file2)) || !file2.mkdirs()) && Log.isLoggable("Places", 5)) {
                    bioi.m102662c("Places", "Failed to to migrate place cache to version: 2");
                }
            }
            this.f119296e = this.f119298g.getLong("last_maintenance", -1);
            this.f119295d = this.f119298g.getInt("key_count", 0);
            try {
                this.f119297f = LevelDb.open(this.f119292a);
            } catch (LevelDbException e) {
                if (Log.isLoggable("Places", 5)) {
                    String valueOf = String.valueOf(this.f119292a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
                    sb.append("Failed to initialize PlacesCache ");
                    sb.append(valueOf);
                    bioi.m102662c("Places", sb.toString());
                    this.f119302k++;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        return;
     */
    /* renamed from: c */
    public final synchronized void mo64157c(long j) {
        if (this.f119297f != null) {
            m101311d(j - cggp.m145341b());
            this.f119298g.edit().putLong("last_maintenance", j).apply();
            this.f119296e = j;
        } else if (Log.isLoggable("Places", 5)) {
            bioi.m102662c("Places", "discardOldEntries() invoked on closed place cache");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        return null;
     */
    /* renamed from: a */
    public final synchronized PlaceEntity mo64151a(String str, long j) {
        if (this.f119297f != null) {
            try {
                byte[] bArr = this.f119297f.get(m101310a(str));
                if (bArr != null) {
                    bxuc a = bxuc.m123419a(bArr);
                    if (a.mo73798g() + cggp.m145341b() >= j) {
                        PlaceEntity a2 = bian.m101872a((bvmv) bxvk.m124008a(bvmv.f156798q, a));
                        this.f119300i++;
                        return a2;
                    }
                    mo64157c(j);
                    this.f119301j++;
                }
            } catch (IOException e) {
                if (Log.isLoggable("Places", 5)) {
                    bioi.m102661b("Places", "Failed to read data from levelDB", e);
                    this.f119302k++;
                }
            }
            this.f119301j++;
        } else if (Log.isLoggable("Places", 5)) {
            bioi.m102662c("Places", "lookup() invoked on closed place cache");
        }
    }

    /* renamed from: a */
    public final synchronized void mo64152a() {
        LevelDb levelDb = this.f119297f;
        if (levelDb != null) {
            levelDb.close();
            this.f119297f = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo64156a(double d) {
        ArrayList arrayList = new ArrayList();
        LevelDb.Iterator it = this.f119297f.iterator();
        it.seekToFirst();
        while (it.isValid()) {
            try {
                arrayList.add(Long.valueOf(bxuc.m123419a(it.value()).mo73798g()));
            } catch (IOException e) {
                if (Log.isLoggable("Places", 5)) {
                    bioi.m102661b("Places", "Failed to read timestamp", e);
                }
            }
            it.next();
        }
        it.close();
        Collections.sort(arrayList);
        double size = (double) arrayList.size();
        Double.isNaN(size);
        int i = (int) (d * size);
        if (i < 0) {
            i = 0;
        }
        if (i >= arrayList.size()) {
            i = arrayList.size() - 1;
        }
        m101311d(i >= 0 ? ((Long) arrayList.get(i)).longValue() : 0);
    }

    /* renamed from: a */
    public final synchronized void mo64153a(long j) {
        LevelDb levelDb = this.f119297f;
        if (levelDb != null) {
            mo64152a();
        }
        try {
            LevelDb.destroy(this.f119292a);
        } catch (LevelDbException e) {
            if (Log.isLoggable("Places", 5)) {
                bioi.m102661b("Places", "Failed clear levelDB data", e);
            }
            this.f119302k++;
        }
        if (levelDb != null) {
            mo64155b(j);
        }
    }

    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.List, java.util.Collection], assign insn: null */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0478, code lost:
        return;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final synchronized void mo64154a(Collection r19, long j) {
        int i;
        long j2 = j;
        synchronized (this) {
            if (this.f119297f != null) {
                WriteBatch create = WriteBatch.create();
                int size = r19.size();
                boolean z = false;
                int i2 = 0;
                while (i2 < size) {
                    PlaceEntity placeEntity = (PlaceEntity) r19.get(i2);
                    bxvd da = bvmv.f156798q.mo74144da();
                    String str = placeEntity.f79535a;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = z;
                    }
                    bvmv bvmv = (bvmv) da.f164949b;
                    str.getClass();
                    int i3 = bvmv.f156800a | 1;
                    bvmv.f156800a = i3;
                    bvmv.f156801b = str;
                    String str2 = placeEntity.f79545k;
                    str2.getClass();
                    int i4 = i3 | 4;
                    bvmv.f156800a = i4;
                    bvmv.f156804e = str2;
                    String str3 = placeEntity.f79546l;
                    str3.getClass();
                    int i5 = i4 | 8;
                    bvmv.f156800a = i5;
                    bvmv.f156805f = str3;
                    String str4 = placeEntity.f79547m;
                    str4.getClass();
                    int i6 = i5 | 16;
                    bvmv.f156800a = i6;
                    bvmv.f156806g = str4;
                    boolean z2 = placeEntity.f79541g;
                    int i7 = i6 | 128;
                    bvmv.f156800a = i7;
                    bvmv.f156810k = z2;
                    float f = placeEntity.f79542h;
                    int i8 = i7 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    bvmv.f156800a = i8;
                    bvmv.f156811l = f;
                    int i9 = placeEntity.f79543i;
                    int i10 = i8 | 512;
                    bvmv.f156800a = i10;
                    bvmv.f156812m = i9;
                    String str5 = placeEntity.f79539e;
                    str5.getClass();
                    int i11 = i10 | 2048;
                    bvmv.f156800a = i11;
                    bvmv.f156813n = str5;
                    String str6 = placeEntity.f79551q;
                    str6.getClass();
                    bvmv.f156800a = i11 | 8192;
                    bvmv.f156815p = str6;
                    for (int i12 = 0; i12 < placeEntity.f79544j.size(); i12++) {
                        String a = bhqm.m101334a(((Integer) placeEntity.f79544j.get(i12)).intValue());
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = z;
                        }
                        bvmv bvmv2 = (bvmv) da.f164949b;
                        a.getClass();
                        if (!bvmv2.f156802c.mo73666a()) {
                            bvmv2.f156802c = bxvk.m124021a(bvmv2.f156802c);
                        }
                        bvmv2.f156802c.add(a);
                    }
                    Locale locale = placeEntity.f79552r;
                    if (locale != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(locale.getLanguage());
                        if (locale.getCountry().length() > 0) {
                            sb.append("-");
                            sb.append(locale.getCountry());
                        }
                        String sb2 = sb.toString();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = z;
                        }
                        bvmv bvmv3 = (bvmv) da.f164949b;
                        sb2.getClass();
                        bvmv3.f156800a |= 2;
                        bvmv3.f156803d = sb2;
                    }
                    List list = placeEntity.f79548n;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = z;
                    }
                    bvmv bvmv4 = (bvmv) da.f164949b;
                    if (!bvmv4.f156807h.mo73666a()) {
                        bvmv4.f156807h = bxvk.m124021a(bvmv4.f156807h);
                    }
                    bxsy.m123078a(list, bvmv4.f156807h);
                    bxvd da2 = bvmx.f156821d.mo74144da();
                    LatLng latLng = placeEntity.f79536b;
                    if (latLng != null) {
                        bzrv a2 = bian.m101871a(latLng);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = z;
                        }
                        bvmx bvmx = (bvmx) da2.f164949b;
                        a2.getClass();
                        bvmx.f156824b = a2;
                        bvmx.f156823a |= 1;
                    }
                    LatLngBounds latLngBounds = placeEntity.f79538d;
                    if (latLngBounds != null) {
                        bvme a3 = bian.m101869a(latLngBounds);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = z;
                        }
                        bvmx bvmx2 = (bvmx) da2.f164949b;
                        a3.getClass();
                        bvmx2.f156825c = a3;
                        bvmx2.f156823a |= 2;
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = z;
                    }
                    bvmv bvmv5 = (bvmv) da.f164949b;
                    bvmx bvmx3 = (bvmx) da2.mo74062i();
                    bvmx3.getClass();
                    bvmv5.f156808i = bvmx3;
                    bvmv5.f156800a |= 32;
                    Uri uri = placeEntity.f79540f;
                    if (uri != null) {
                        String uri2 = uri.toString();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = z;
                        }
                        bvmv bvmv6 = (bvmv) da.f164949b;
                        uri2.getClass();
                        bvmv6.f156800a |= 64;
                        bvmv6.f156809j = uri2;
                    }
                    PlaceOpeningHoursEntity placeOpeningHoursEntity = placeEntity.f79549o;
                    if (placeOpeningHoursEntity != null) {
                        bxvd da3 = bvoh.f157036c.mo74144da();
                        List list2 = placeOpeningHoursEntity.f79560a;
                        if (list2 != null) {
                            List b = bian.m101878b(list2);
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = z;
                            }
                            bvoh bvoh = (bvoh) da3.f164949b;
                            if (!bvoh.f157038a.mo73666a()) {
                                bvoh.f157038a = bxvk.m124021a(bvoh.f157038a);
                            }
                            bxsy.m123078a(b, bvoh.f157038a);
                        }
                        List<PlaceOpeningHoursEntity.ExceptionalHours> list3 = placeOpeningHoursEntity.f79561b;
                        if (list3 == null) {
                            i = size;
                        } else {
                            for (PlaceOpeningHoursEntity.ExceptionalHours exceptionalHours : list3) {
                                bxvd da4 = bvom.f157052d.mo74144da();
                                bxvd da5 = bvol.f157047d.mo74144da();
                                bxvd da6 = bvok.f157041e.mo74144da();
                                int i13 = exceptionalHours.f79564a;
                                int i14 = size;
                                if (da6.f164950c) {
                                    da6.mo74035c();
                                    da6.f164950c = false;
                                }
                                bvok bvok = (bvok) da6.f164949b;
                                bvok.f157043a |= 4;
                                bvok.f157046d = i13;
                                int a4 = bvoj.m121317a(exceptionalHours.f79565b);
                                if (da6.f164950c) {
                                    da6.mo74035c();
                                    da6.f164950c = false;
                                }
                                bvok bvok2 = (bvok) da6.f164949b;
                                if (a4 != 0) {
                                    bvok2.f157045c = a4;
                                    int i15 = bvok2.f157043a | 2;
                                    bvok2.f157043a = i15;
                                    int i16 = exceptionalHours.f79566c;
                                    bvok2.f157043a = i15 | 1;
                                    bvok2.f157044b = i16;
                                    if (da5.f164950c) {
                                        da5.mo74035c();
                                        da5.f164950c = false;
                                    }
                                    bvol bvol = (bvol) da5.f164949b;
                                    bvok bvok3 = (bvok) da6.mo74062i();
                                    bvok3.getClass();
                                    bvol.f157050b = bvok3;
                                    bvol.f157049a |= 1;
                                    bxvd da7 = bvok.f157041e.mo74144da();
                                    int i17 = exceptionalHours.f79567d;
                                    if (da7.f164950c) {
                                        da7.mo74035c();
                                        da7.f164950c = false;
                                    }
                                    bvok bvok4 = (bvok) da7.f164949b;
                                    bvok4.f157043a |= 4;
                                    bvok4.f157046d = i17;
                                    int a5 = bvoj.m121317a(exceptionalHours.f79568e);
                                    if (da7.f164950c) {
                                        da7.mo74035c();
                                        da7.f164950c = false;
                                    }
                                    bvok bvok5 = (bvok) da7.f164949b;
                                    if (a5 != 0) {
                                        bvok5.f157045c = a5;
                                        int i18 = bvok5.f157043a | 2;
                                        bvok5.f157043a = i18;
                                        int i19 = exceptionalHours.f79569f;
                                        bvok5.f157043a = i18 | 1;
                                        bvok5.f157044b = i19;
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bvol bvol2 = (bvol) da5.f164949b;
                                        bvok bvok6 = (bvok) da7.mo74062i();
                                        bvok6.getClass();
                                        bvol2.f157051c = bvok6;
                                        bvol2.f157049a |= 2;
                                        if (da4.f164950c) {
                                            da4.mo74035c();
                                            da4.f164950c = false;
                                        }
                                        bvom bvom = (bvom) da4.f164949b;
                                        bvol bvol3 = (bvol) da5.mo74062i();
                                        bvol3.getClass();
                                        bvom.f157055b = bvol3;
                                        bvom.f157054a |= 1;
                                        List b2 = bian.m101878b(exceptionalHours.f79570g);
                                        if (da4.f164950c) {
                                            da4.mo74035c();
                                            da4.f164950c = false;
                                        }
                                        bvom bvom2 = (bvom) da4.f164949b;
                                        if (!bvom2.f157056c.mo73666a()) {
                                            bvom2.f157056c = bxvk.m124021a(bvom2.f157056c);
                                        }
                                        bxsy.m123078a(b2, bvom2.f157056c);
                                        bvom bvom3 = (bvom) da4.mo74062i();
                                        if (da3.f164950c) {
                                            da3.mo74035c();
                                            da3.f164950c = false;
                                        }
                                        bvoh bvoh2 = (bvoh) da3.f164949b;
                                        bvom3.getClass();
                                        if (!bvoh2.f157039b.mo73666a()) {
                                            bvoh2.f157039b = bxvk.m124021a(bvoh2.f157039b);
                                        }
                                        bvoh2.f157039b.add(bvom3);
                                        size = i14;
                                    } else {
                                        throw null;
                                    }
                                } else {
                                    throw null;
                                }
                            }
                            i = size;
                        }
                        bvoh bvoh3 = (bvoh) da3.mo74062i();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bvmv bvmv7 = (bvmv) da.f164949b;
                        bvoh3.getClass();
                        bvmv7.f156814o = bvoh3;
                        bvmv7.f156800a |= 4096;
                    } else {
                        i = size;
                    }
                    bvmv bvmv8 = (bvmv) da.mo74062i();
                    int i20 = bvmv8.f164961ai;
                    if (i20 == -1) {
                        i20 = bxxm.f165037a.mo74228a(bvmv8).mo74223b(bvmv8);
                        bvmv8.f164961ai = i20;
                    }
                    byte[] bArr = new byte[(i20 + 8)];
                    bxuk a6 = bxuk.m123637a(bArr);
                    try {
                        a6.mo73857d(j2);
                        bvmv8.mo73644a(a6);
                        create.put(m101310a(placeEntity.f79535a), bArr);
                        this.f119295d++;
                    } catch (IOException e) {
                        if (Log.isLoggable("Places", 5)) {
                            String valueOf = String.valueOf(placeEntity.f79535a);
                            bioi.m102662c("Places", valueOf.length() == 0 ? new String("Failed to serialize ") : "Failed to serialize ".concat(valueOf));
                        }
                    } catch (Throwable th) {
                        create.close();
                        throw th;
                    }
                    i2++;
                    size = i;
                    z = false;
                }
                try {
                    this.f119297f.write(create);
                    this.f119299h += r19.size();
                } catch (LevelDbException e2) {
                    if (Log.isLoggable("Places", 5)) {
                        bioi.m102661b("Places", "Failed to write data to levelDB", e2);
                        this.f119302k++;
                        create.close();
                        return;
                    }
                }
                create.close();
                if (this.f119296e + cggp.f186889a.mo6606a().mo83753e() < j2) {
                    mo64157c(j2);
                }
                if (((long) this.f119295d) > cggp.m145342c()) {
                    mo64156a(cggp.f186889a.mo6606a().mo83750b());
                }
                this.f119298g.edit().putInt("key_count", this.f119295d).apply();
            } else if (Log.isLoggable("Places", 5)) {
                bioi.m102662c("Places", "insert() invoked on closed place cache");
            }
        }
    }
}
