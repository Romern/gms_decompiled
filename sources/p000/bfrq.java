package p000;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: bfrq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfrq extends bfow implements bfrb, sth, bhbp {

    /* renamed from: a */
    private final bfrh f115055a;

    /* renamed from: b */
    private final sti f115056b;

    /* renamed from: c */
    private final bfqv f115057c;

    /* renamed from: d */
    private bfrb f115058d;

    /* renamed from: f */
    private bhbr f115059f;

    /* renamed from: g */
    private boolean f115060g;

    /* renamed from: h */
    private boolean f115061h;

    /* renamed from: i */
    private long f115062i = Long.MIN_VALUE;

    /* renamed from: j */
    private boolean f115063j = false;

    /* renamed from: k */
    private boolean f115064k = true;

    /* renamed from: l */
    private int f115065l = 0;

    public bfrq(bfrc bfrc, Context context, Looper looper, bfrh bfrh) {
        super(bfrc);
        this.f115055a = bfrh;
        sti sti = new sti(context, looper);
        this.f115056b = sti;
        sti.f45129a = this;
        this.f115057c = null;
    }

    /* renamed from: a */
    public final Location mo62068a(boolean z) {
        Location a = this.f114732e.mo62068a(z);
        bfrh bfrh = this.f115055a;
        boolean z2 = this.f115061h;
        boolean z3 = this.f115060g;
        if (bfrh.mo62179c()) {
            bfrh.mo62180d();
        }
        if (bfrh.mo62176a()) {
            if (a == null) {
                bfrh.f115026y++;
            } else {
                bfrh.f115026y = 0;
                bfrh.f115011j = bfrh.m97611a(a);
            }
            if (((double) bfrh.f115008g.nextFloat()) < ceyp.m138439d() && ((long) bfrh.f115018q) < ceyp.m138441f()) {
                bplt a2 = bfrh.mo62172a(a, false, z2, z3, bfrh.f115026y, -1);
                bfpc bfpc = bfrh.f115005d;
                bpkr a3 = bfrh.f115002a.mo62170a();
                bxvd da = bpmc.f138211m.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpmc bpmc = (bpmc) da.f164949b;
                bpmc.f138219g = 2;
                int i = bpmc.f138213a | 16;
                bpmc.f138213a = i;
                if (a3 != null) {
                    a3.getClass();
                    bpmc.f138218f = a3;
                    i |= 8;
                    bpmc.f138213a = i;
                }
                if (a2 != null) {
                    a2.getClass();
                    bpmc.f138216d = a2;
                    bpmc.f138213a = i | 2;
                }
                bfpc.mo62082a((bpmc) da.mo74062i());
                bfrh.f115018q++;
            }
        }
        return a;
    }

    /* renamed from: b */
    public final void mo62061b() {
        this.f114732e.mo62061b();
        this.f115056b.mo26073b();
        bhbr bhbr = this.f115059f;
        if (bhbr != null) {
            bhbr.mo63531a(this);
        }
    }

    /* renamed from: f */
    public final void mo62122f(List list) {
        String str;
        int i;
        int i2;
        Location location;
        Iterator it;
        float f;
        List list2 = list;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Location location2 = (Location) it2.next();
            bfrh bfrh = this.f115055a;
            if (bfrh.mo62179c()) {
                bfrh.mo62180d();
            }
            if (bfrh.mo62176a()) {
                bfrd bfrd = bfrh.f115004c;
                if (bfrd.f114970d == Long.MIN_VALUE && bfrh.f115010i == null && location2 != null && bfrd.f114971e != Long.MIN_VALUE) {
                    int i3 = Build.VERSION.SDK_INT;
                    bfrd.f114970d = TimeUnit.NANOSECONDS.toMillis(location2.getElapsedRealtimeNanos()) - bfrd.f114977k.f115013l;
                }
                Location location3 = bfrh.f115010i;
                if (location3 != null) {
                    int b = bfrh.m97613b(location3);
                    int b2 = bfrh.m97613b(location2);
                    long a = bfrh.m97612a(bfrh.f115010i, location2);
                    float distanceTo = location2.distanceTo(bfrh.f115010i);
                    if (a > 0) {
                        f = distanceTo / ((float) a);
                    } else {
                        f = 0.0f;
                    }
                    float millis = f * ((float) TimeUnit.SECONDS.toMillis(1));
                    float abs = Math.abs(millis);
                    float locationQualityJumpSpeedThreshold = (float) ceyp.f183514a.mo6606a().locationQualityJumpSpeedThreshold();
                    if (abs <= locationQualityJumpSpeedThreshold) {
                        it = it2;
                    } else {
                        bfrd bfrd2 = bfrh.f115004c;
                        if (bfrd2.f114969c == null) {
                            bfrd2.f114969c = new ArrayList(15);
                        }
                        if (bfrd2.f114969c.size() < 15) {
                            ArrayList arrayList = bfrd2.f114969c;
                            float f2 = millis;
                            long a2 = bfrh.m97611a(location2);
                            bxvd da = bpmd.f138225g.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bpmd bpmd = (bpmd) da.f164949b;
                            it = it2;
                            int i4 = bpmd.f138227a | 1;
                            bpmd.f138227a = i4;
                            bpmd.f138228b = a2;
                            int i5 = i4 | 2;
                            bpmd.f138227a = i5;
                            bpmd.f138229c = b - 1;
                            int i6 = i5 | 4;
                            bpmd.f138227a = i6;
                            bpmd.f138230d = b2 - 1;
                            int i7 = i6 | 8;
                            bpmd.f138227a = i7;
                            bpmd.f138231e = distanceTo;
                            bpmd.f138227a = i7 | 16;
                            bpmd.f138232f = f2;
                            arrayList.add((bpmd) da.mo74062i());
                        } else {
                            it = it2;
                        }
                    }
                    bfrd bfrd3 = bfrh.f115004c;
                    float accuracy = location2.getAccuracy();
                    if (bfrd3.f114967a == null) {
                        bfrd3.f114967a = new SparseArray(4);
                    }
                    int i8 = b2 - 1;
                    bfrf bfrf = (bfrf) bfrd3.f114967a.get(i8);
                    if (bfrf == null) {
                        bfrf = new bfrf();
                        bfrd3.f114967a.put(i8, bfrf);
                    }
                    int i9 = bfrf.f114981b;
                    int i10 = bfrf.f114980a;
                    int i11 = i10 + 1;
                    bfrf.f114980a = i11;
                    bfrf.f114981b = ((int) (((float) (i9 * i10)) + accuracy)) / i11;
                    if (aeim.m51906j(location2) == 3 && location2.hasAltitude()) {
                        bfrh.f115004c.f114976j++;
                    }
                    int i12 = ((b - 1) * 1000) + i8;
                    bfrd bfrd4 = bfrh.f115004c;
                    if (bfrd4.f114968b == null) {
                        bfrd4.f114968b = new SparseArray(16);
                    }
                    bfrg bfrg = (bfrg) bfrd4.f114968b.get(i12);
                    if (bfrg == null) {
                        bfrg = new bfrg();
                        bfrd4.f114968b.put(i12, bfrg);
                    }
                    bfrg.f114982a++;
                    if (abs > locationQualityJumpSpeedThreshold) {
                        bfrg.f114983b++;
                    }
                } else {
                    it = it2;
                }
                bfrh.f115010i = location2;
            } else {
                it = it2;
            }
            bfrh bfrh2 = this.f115055a;
            if (bfrh2.mo62179c()) {
                bfrh2.mo62180d();
            }
            if (!bfrh2.mo62176a() || location2 == null) {
                it2 = it;
            } else if (bfrh2.f114995L == null || TimeUnit.MILLISECONDS.toSeconds(bfrh.m97612a(location2, bfrh2.f114995L)) > 10 || ((double) bfrh2.f115008g.nextFloat()) >= ceyp.m138439d() || ((long) bfrh2.f115024w) >= ceyp.m138441f()) {
                bfrh2.f114995L = location2;
                it2 = it;
            } else {
                bxvd da2 = bplv.f138175h.mo74144da();
                long a3 = bfrh.m97611a(location2);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bplv bplv = (bplv) da2.f164949b;
                bplv.f138177a |= 1;
                bplv.f138178b = a3;
                int b3 = bfrh.m97613b(bfrh2.f114995L) - 1;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bplv bplv2 = (bplv) da2.f164949b;
                bplv2.f138177a |= 2;
                bplv2.f138179c = b3;
                float accuracy2 = bfrh2.f114995L.getAccuracy();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bplv bplv3 = (bplv) da2.f164949b;
                bplv3.f138177a |= 4;
                bplv3.f138180d = accuracy2;
                int b4 = bfrh.m97613b(location2) - 1;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bplv bplv4 = (bplv) da2.f164949b;
                bplv4.f138177a |= 8;
                bplv4.f138181e = b4;
                float accuracy3 = location2.getAccuracy();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bplv bplv5 = (bplv) da2.f164949b;
                bplv5.f138177a |= 16;
                bplv5.f138182f = accuracy3;
                float distanceTo2 = location2.distanceTo(bfrh2.f114995L);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bplv bplv6 = (bplv) da2.f164949b;
                bplv6.f138177a |= 32;
                bplv6.f138183g = distanceTo2;
                bplv bplv7 = (bplv) da2.mo74062i();
                bfpc bfpc = bfrh2.f115005d;
                bpkr a4 = bfrh2.f115002a.mo62170a();
                bxvd da3 = bpmc.f138211m.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bpmc bpmc = (bpmc) da3.f164949b;
                bpmc.f138219g = 7;
                int i13 = bpmc.f138213a | 16;
                bpmc.f138213a = i13;
                if (a4 != null) {
                    a4.getClass();
                    bpmc.f138218f = a4;
                    i13 |= 8;
                    bpmc.f138213a = i13;
                }
                if (bplv7 != null) {
                    bplv7.getClass();
                    bpmc.f138223k = bplv7;
                    bpmc.f138213a = i13 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                }
                bfpc.mo62082a((bpmc) da3.mo74062i());
                bfrh2.f115024w++;
                bfrh2.f114995L = location2;
                it2 = it;
            }
        }
        bfrh bfrh3 = this.f115055a;
        boolean z = this.f115061h;
        boolean z2 = this.f115060g;
        if (bfrh3.mo62179c()) {
            bfrh3.mo62180d();
        }
        if (bfrh3.mo62176a()) {
            if (list2 != null && !list.isEmpty()) {
                Location location4 = (Location) bnjd.m109595d(list);
                if (location4 != null) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        Location location5 = (Location) it3.next();
                        if (location5 != null) {
                            bfrh3.f115004c.f114972f++;
                            bfrh3.f115027z = 0;
                            bfrh3.f115011j = bfrh.m97611a(location5);
                        } else {
                            bfrh3.f115004c.f114973g++;
                            bfrh3.f115027z++;
                        }
                    }
                } else {
                    bfrh3.f115027z = 0;
                }
                location = location4;
            } else {
                bfrh3.f115027z++;
                location = null;
            }
            if (((double) bfrh3.f115008g.nextFloat()) < ceyp.m138439d()) {
                if (((long) bfrh3.f115019r) < ceyp.m138441f()) {
                    bfrn bfrn = bfrh3.f115003b;
                    bplt a5 = bfrh3.mo62172a(location, true, z, z2, bfrh3.f115027z, bfrn != null ? bfrn.f115038f : -1);
                    bfpc bfpc2 = bfrh3.f115005d;
                    bpkr a6 = bfrh3.f115002a.mo62170a();
                    bxvd da4 = bpmc.f138211m.mo74144da();
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    bpmc bpmc2 = (bpmc) da4.f164949b;
                    bpmc2.f138219g = 3;
                    int i14 = bpmc2.f138213a | 16;
                    bpmc2.f138213a = i14;
                    if (a6 != null) {
                        a6.getClass();
                        bpmc2.f138218f = a6;
                        i14 |= 8;
                        bpmc2.f138213a = i14;
                    }
                    if (a5 != null) {
                        a5.getClass();
                        bpmc2.f138217e = a5;
                        bpmc2.f138213a = i14 | 4;
                    }
                    bfpc2.mo62082a((bpmc) da4.mo74062i());
                    bfrh3.f115019r++;
                }
            }
        }
        if (this.f115062i >= 0 && this.f115063j && !list.isEmpty()) {
            bfrh bfrh4 = this.f115055a;
            Location location6 = (Location) list2.get(0);
            long j = this.f115062i;
            boolean z3 = this.f115061h;
            boolean z4 = this.f115060g;
            if (bfrh4.mo62179c()) {
                bfrh4.mo62180d();
            }
            if (bfrh4.mo62176a() && location6 != null && j >= 0) {
                int i15 = Build.VERSION.SDK_INT;
                long millis2 = TimeUnit.NANOSECONDS.toMillis(location6.getElapsedRealtimeNanos()) - j;
                if (millis2 >= 0 && ((double) bfrh4.f115008g.nextFloat()) < ceyp.m138439d() && bfrh4.f115020s < 25) {
                    bxvd da5 = bplu.f138167g.mo74144da();
                    long a7 = bfrh.m97611a(location6);
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bplu bplu = (bplu) da5.f164949b;
                    bplu.f138169a |= 1;
                    bplu.f138170b = a7;
                    bplm a8 = bfrh4.mo62171a(z3, z4);
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bplu bplu2 = (bplu) da5.f164949b;
                    a8.getClass();
                    bplu2.f138171c = a8;
                    int i16 = bplu2.f138169a | 2;
                    bplu2.f138169a = i16;
                    bplu2.f138169a = i16 | 4;
                    bplu2.f138172d = millis2;
                    int b5 = bfrh.m97613b(location6) - 1;
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    bplu bplu3 = (bplu) da5.f164949b;
                    int i17 = bplu3.f138169a | 8;
                    bplu3.f138169a = i17;
                    bplu3.f138173e = b5;
                    bplu3.f138169a = i17 | 16;
                    bplu3.f138174f = false;
                    bfrh4.f115005d.mo62081a((bplu) da5.mo74062i(), bfrh4.f115002a.mo62170a());
                    bfrh4.f115020s++;
                }
            }
            this.f115062i = Long.MIN_VALUE;
        }
        if (ceyp.f183514a.mo6606a().enableLoggingTtffInLatencyLogSample() && this.f115064k && this.f115063j) {
            bfrh bfrh5 = this.f115055a;
            Location location7 = (Location) list2.get(0);
            boolean z5 = this.f115061h;
            boolean z6 = this.f115060g;
            if (bfrh5.mo62179c()) {
                bfrh5.mo62180d();
            }
            if (bfrh5.mo62176a() && location7 != null && ((bfrh5.f115013l >= 0 || bfrh5.f115012k >= 0) && (bfrh5.f115015n >= 0 || bfrh5.f115014m >= 0))) {
                int i18 = Build.VERSION.SDK_INT;
                long millis3 = TimeUnit.NANOSECONDS.toMillis(location7.getElapsedRealtimeNanos()) - Math.max(bfrh5.f115013l, bfrh5.f115015n);
                if (millis3 >= 0 && ((double) bfrh5.f115008g.nextFloat()) < ceyp.f183514a.mo6606a().locationQualityFlpTtffSampleLogsSamplingRate()) {
                    bxvd da6 = bplu.f138167g.mo74144da();
                    long a9 = bfrh.m97611a(location7);
                    if (da6.f164950c) {
                        da6.mo74035c();
                        da6.f164950c = false;
                    }
                    bplu bplu4 = (bplu) da6.f164949b;
                    bplu4.f138169a |= 1;
                    bplu4.f138170b = a9;
                    bplm a10 = bfrh5.mo62171a(z5, z6);
                    if (da6.f164950c) {
                        da6.mo74035c();
                        da6.f164950c = false;
                    }
                    bplu bplu5 = (bplu) da6.f164949b;
                    a10.getClass();
                    bplu5.f138171c = a10;
                    int i19 = bplu5.f138169a | 2;
                    bplu5.f138169a = i19;
                    bplu5.f138169a = i19 | 4;
                    bplu5.f138172d = millis3;
                    int b6 = bfrh.m97613b(location7) - 1;
                    if (da6.f164950c) {
                        da6.mo74035c();
                        da6.f164950c = false;
                    }
                    bplu bplu6 = (bplu) da6.f164949b;
                    int i20 = bplu6.f138169a | 8;
                    bplu6.f138169a = i20;
                    bplu6.f138173e = b6;
                    bplu6.f138169a = i20 | 16;
                    bplu6.f138174f = true;
                    bfrh5.f115005d.mo62081a((bplu) da6.mo74062i(), bfrh5.f115002a.mo62170a());
                }
            }
        }
        this.f115064k = false;
        bfrh bfrh6 = this.f115055a;
        if (bfrh6.mo62179c()) {
            bfrh6.mo62180d();
        }
        if (bfrh6.mo62176a() && ((double) bfrh6.f115008g.nextFloat()) < ceyp.f183514a.mo6606a().locationQualityBatteryUsageLogsSamplingRate() && bfrh6.f115025x < 25 && bfrh6.f115003b != null) {
            bxvd da7 = bplq.f138128i.mo74144da();
            int i21 = bfrh6.f115003b.f115040h;
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            bplq bplq = (bplq) da7.f164949b;
            int i22 = bplq.f138130a | 1;
            bplq.f138130a = i22;
            bplq.f138131b = i21;
            bfrn bfrn2 = bfrh6.f115003b;
            int i23 = bfrn2.f115041i;
            int i24 = i22 | 2;
            bplq.f138130a = i24;
            bplq.f138132c = i23;
            long j2 = bfrn2.f115038f;
            bplq.f138130a = i24 | 4;
            bplq.f138133d = j2;
            if (bfrh6.f115007f.mo61852a()) {
                ArrayList arrayList2 = new ArrayList(bfrh6.f115003b.f115043k);
                ArrayList arrayList3 = new ArrayList(bfrh6.f115003b.f115044l);
                int size = arrayList2.size();
                if (da7.f164950c) {
                    da7.mo74035c();
                    da7.f164950c = false;
                }
                bplq bplq2 = (bplq) da7.f164949b;
                bplq2.f138130a |= 8;
                bplq2.f138134e = size;
                if (!arrayList2.isEmpty()) {
                    Random random = bfrh6.f115008g;
                    if (!arrayList3.isEmpty()) {
                        Collections.shuffle(arrayList3, random);
                    }
                    if (arrayList2.size() > 10) {
                        Collections.shuffle(arrayList2, random);
                    }
                    int min = Math.min(arrayList2.size(), 10);
                    if (da7.f164950c) {
                        da7.mo74035c();
                        da7.f164950c = false;
                    }
                    ((bplq) da7.f164949b).f138137h = GeneratedMessageLite.m124030de();
                    int i25 = 0;
                    for (int i26 = 0; i26 < min; i26++) {
                        bxvd da8 = bpkf.f137938j.mo74144da();
                        String str2 = ((ClientIdentity) arrayList2.get(i26)).f30222b;
                        if (!"com.google.android.gms".equals(str2)) {
                            str = null;
                        } else if (arrayList3.isEmpty()) {
                            str = null;
                        } else if (i25 < arrayList3.size()) {
                            str = (String) arrayList3.get(i25);
                            i25++;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            if (str2 != null) {
                                StringBuilder sb = new StringBuilder(str2.length() + 1 + String.valueOf(str).length());
                                sb.append(str2);
                                sb.append(":");
                                sb.append(str);
                                String sb2 = sb.toString();
                                if (da8.f164950c) {
                                    da8.mo74035c();
                                    da8.f164950c = false;
                                }
                                bpkf bpkf = (bpkf) da8.f164949b;
                                sb2.getClass();
                                bpkf.f137940a |= 1;
                                bpkf.f137941b = sb2;
                            }
                        } else if (str2 != null) {
                            if (da8.f164950c) {
                                da8.mo74035c();
                                da8.f164950c = false;
                            }
                            bpkf bpkf2 = (bpkf) da8.f164949b;
                            str2.getClass();
                            bpkf2.f137940a |= 1;
                            bpkf2.f137941b = str2;
                        }
                        if (cevw.f183465a.mo6606a().uploadLocationPermission()) {
                            String str3 = ((bpkf) da8.f164949b).f137941b;
                            if (bfrh6.mo62177a(str3, "android.permission.ACCESS_COARSE_LOCATION") || bfrh6.mo62177a(str3, "android.permission.ACCESS_FINE_LOCATION")) {
                                int i27 = Build.VERSION.SDK_INT;
                                i = !bfrh6.mo62177a(str3, "android.permission.ACCESS_BACKGROUND_LOCATION") ? 3 : 2;
                            } else {
                                i = 4;
                            }
                            if (da8.f164950c) {
                                da8.mo74035c();
                                da8.f164950c = false;
                            }
                            bpkf bpkf3 = (bpkf) da8.f164949b;
                            bpkf3.f137947h = i - 1;
                            bpkf3.f137940a |= 64;
                            String str4 = bpkf3.f137941b;
                            if (!bfrh6.mo62177a(str4, "android.permission.ACCESS_FINE_LOCATION")) {
                                i2 = !bfrh6.mo62177a(str4, "android.permission.ACCESS_COARSE_LOCATION") ? 2 : 3;
                            } else {
                                i2 = 4;
                            }
                            if (da8.f164950c) {
                                da8.mo74035c();
                                da8.f164950c = false;
                            }
                            bpkf bpkf4 = (bpkf) da8.f164949b;
                            bpkf4.f137948i = i2 - 1;
                            bpkf4.f137940a |= 128;
                        }
                        int i28 = Build.VERSION.SDK_INT;
                        int i29 = !bfrh6.f115006e.mo25946a(((ClientIdentity) arrayList2.get(i26)).f30221a) ? 3 : 2;
                        if (da8.f164950c) {
                            da8.mo74035c();
                            da8.f164950c = false;
                        }
                        bpkf bpkf5 = (bpkf) da8.f164949b;
                        bpkf5.f137946g = i29 - 1;
                        bpkf5.f137940a |= 32;
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        bplq bplq3 = (bplq) da7.f164949b;
                        bpkf bpkf6 = (bpkf) da8.mo74062i();
                        bpkf6.getClass();
                        if (!bplq3.f138137h.mo73666a()) {
                            bplq3.f138137h = GeneratedMessageLite.m124021a(bplq3.f138137h);
                        }
                        bplq3.f138137h.add(bpkf6);
                    }
                }
            }
            boolean b7 = bfrh6.f115003b.mo62183b();
            if (da7.f164950c) {
                da7.mo74035c();
                da7.f164950c = false;
            }
            bplq bplq4 = (bplq) da7.f164949b;
            int i30 = bplq4.f138130a | 16;
            bplq4.f138130a = i30;
            bplq4.f138135f = b7;
            long j3 = bfrh6.f115003b.f115039g;
            bplq4.f138130a = i30 | 32;
            bplq4.f138136g = j3;
            bfpc bfpc3 = bfrh6.f115005d;
            bplq bplq5 = (bplq) da7.mo74062i();
            bpkr a11 = bfrh6.f115002a.mo62170a();
            bxvd da9 = bpmc.f138211m.mo74144da();
            if (da9.f164950c) {
                da9.mo74035c();
                da9.f164950c = false;
            }
            bpmc bpmc3 = (bpmc) da9.f164949b;
            bpmc3.f138219g = 6;
            int i31 = bpmc3.f138213a | 16;
            bpmc3.f138213a = i31;
            if (bplq5 != null) {
                bplq5.getClass();
                bpmc3.f138222j = bplq5;
                i31 |= 128;
                bpmc3.f138213a = i31;
            }
            if (a11 != null) {
                a11.getClass();
                bpmc3.f138218f = a11;
                bpmc3.f138213a = i31 | 8;
            }
            bfpc3.mo62082a((bpmc) da9.mo74062i());
            bfrh6.f115025x++;
        }
        bfrb bfrb = this.f115058d;
        if (bfrb != null) {
            bfrb.mo62122f(list2);
        }
    }

    public bfrq(bfrc bfrc, Context context, Looper looper, bfrh bfrh, bfqv bfqv) {
        super(bfrc);
        this.f115055a = bfrh;
        sti sti = new sti(context, looper);
        this.f115056b = sti;
        sti.f45129a = this;
        this.f115057c = bfqv;
        this.f115059f = cevw.m138331p() ? bhbr.m100591a(context) : null;
    }

    /* renamed from: a */
    public final void mo62058a() {
        this.f114732e.mo62058a();
        this.f115056b.mo26072a();
        bhbr bhbr = this.f115059f;
        if (bhbr != null) {
            bhbr.mo63532a(this, bqfb.INSTANCE);
        }
    }

    /* renamed from: a */
    public final void mo61257a(bfkr bfkr) {
        bfkr bfkr2 = bfkr;
        if (ceyp.m138437b()) {
            bfqv bfqv = this.f115057c;
            if (bfqv == null) {
                return;
            }
            if (bfqv.f114949d) {
                int a = bfkr.mo61839a();
                int i = 0;
                while (true) {
                    int i2 = 1;
                    if (i < a) {
                        if (bfkr2.mo61846f(i)) {
                            int a2 = bply.m112053a(bfkr2.mo61840a(i));
                            int b = bfkr2.mo61841b(i);
                            int i3 = a2 - 1;
                            if (a2 != 0) {
                                int a3 = bfav.m96290a(bfav.m96291a(i3, (double) bfkr2.mo61847g(i)));
                                if (((double) bfkr2.mo61847g(i)) == 0.0d) {
                                    a3 = 1;
                                }
                                bfqu bfqu = new bfqu(a2, a3, b);
                                Integer num = (Integer) bfqv.f114946a.get(bfqu);
                                Map map = bfqv.f114946a;
                                if (num != null) {
                                    i2 = 1 + num.intValue();
                                }
                                map.put(bfqu, Integer.valueOf(i2));
                            } else {
                                throw null;
                            }
                        }
                        i++;
                    } else if (SystemClock.elapsedRealtime() - bfqv.f114948c >= TimeUnit.HOURS.toMillis(24)) {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : bfqv.f114946a.entrySet()) {
                            bfqu bfqu2 = (bfqu) entry.getKey();
                            int intValue = ((Integer) entry.getValue()).intValue();
                            bxvd da = bplz.f138186f.mo74144da();
                            int i4 = bfqu2.f114944b;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bplz bplz = (bplz) da.f164949b;
                            bplz.f138189b = i4 - 1;
                            int i5 = bplz.f138188a | 1;
                            bplz.f138188a = i5;
                            bplz.f138190c = bfqu2.f114945c - 1;
                            int i6 = i5 | 2;
                            bplz.f138188a = i6;
                            int i7 = bfqu2.f114943a;
                            int i8 = i6 | 4;
                            bplz.f138188a = i8;
                            bplz.f138191d = i7;
                            bplz.f138188a = i8 | 8;
                            bplz.f138192e = intValue;
                            arrayList.add((bplz) da.mo74062i());
                            if (((long) arrayList.size()) > ceyp.f183514a.mo6606a().gnssStatusStatsMaxSatelliteCount()) {
                                break;
                            }
                        }
                        bfpc bfpc = bfqv.f114947b;
                        rjx rjx = bfpc.f114755a;
                        if (rjx != null) {
                            rjx.mo24673E().mo50373a(new bfpb(bfpc, arrayList));
                        }
                        bfqv.f114946a.clear();
                        bfqv.mo62165a();
                        return;
                    } else {
                        return;
                    }
                }
            } else if (SystemClock.elapsedRealtime() - bfqv.f114948c > 24) {
                bfqv.mo62165a();
            }
        }
    }

    /* renamed from: a */
    public final void mo62071a(bfrb bfrb) {
        this.f115058d = bfrb;
        this.f114732e.mo62071a(this);
    }

    /* renamed from: a */
    public final void mo62121a(LocationAvailability locationAvailability) {
        if (!ceyp.f183514a.mo6606a().removeAvailabilityLogging()) {
            this.f115055a.f115016o = Integer.valueOf(locationAvailability.f79345b);
            this.f115055a.f115017p = Integer.valueOf(locationAvailability.f79344a);
            bfrh bfrh = this.f115055a;
            Location a = this.f114732e.mo62068a(false);
            boolean z = this.f115061h;
            boolean z2 = this.f115060g;
            int i = 3;
            int i2 = !locationAvailability.mo43544a() ? 3 : 2;
            if (bfrh.mo62179c()) {
                bfrh.mo62180d();
            }
            if (!bfrh.mo62176a() && bfrh.f114988E == Long.MIN_VALUE) {
                bfrh.f114996M = i2;
                bfrh.f114990G = SystemClock.elapsedRealtime();
            } else {
                int i3 = bfrh.f114996M;
                if (i3 == 2) {
                    if (i2 == 2) {
                        if (((double) bfrh.f115008g.nextFloat()) < ceyp.m138438c() && bfrh.f115022u < 15) {
                            bfrh.mo62174a(2, a, 0, 0, null, null, bfrh.mo62171a(z, z2));
                            bfrh.mo62178b();
                        }
                    } else if (((double) bfrh.f115008g.nextFloat()) < ceyp.m138438c() && bfrh.f115021t < 15) {
                        bfrh.f114997N = 3;
                        bfrh.f114987D = true;
                        bfrh.f114988E = SystemClock.elapsedRealtime();
                        bfrh.f114994K = bfrh.mo62171a(z, z2);
                        bfrh.mo62175a(locationAvailability);
                        bfrh.f114986C++;
                        if (bfrh.mo62176a()) {
                            bfrh.f114984A += bfrh.f114988E - bfrh.f114989F;
                        }
                        bfrh.f114996M = i;
                        bfrh.f114990G = SystemClock.elapsedRealtime();
                    }
                } else if (i3 == 3) {
                    if (bfrh.f114987D) {
                        if (i2 == 2) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            bfrh.f114989F = elapsedRealtime;
                            long j = elapsedRealtime - bfrh.f114988E;
                            bfrh.mo62174a(bfrh.f114997N, a, j, bfrh.f114991H, bfrh.f114992I, bfrh.f114993J, bfrh.f114994K);
                            bfrh.mo62178b();
                            if (bfrh.mo62176a()) {
                                bfrh.f114985B += j;
                            }
                        } else {
                            bfrh.mo62175a(locationAvailability);
                            bfrh.f114996M = i;
                            bfrh.f114990G = SystemClock.elapsedRealtime();
                        }
                    }
                } else if (i3 == 1) {
                    if (((double) bfrh.f115008g.nextFloat()) < ceyp.m138438c() && bfrh.f115023v < 15) {
                        if (i2 != 2) {
                            bfrh.f114997N = 4;
                            bfrh.f114987D = true;
                            bfrh.f114988E = bfrh.f115013l;
                            bfrh.f114994K = bfrh.mo62171a(z, z2);
                            bfrh.mo62175a(locationAvailability);
                            bfrh.f114986C++;
                            bfrh.f114996M = i;
                            bfrh.f114990G = SystemClock.elapsedRealtime();
                        } else {
                            bfrh.mo62174a(4, a, SystemClock.elapsedRealtime() - bfrh.f115013l, 0, null, null, bfrh.mo62171a(z, z2));
                            bfrh.mo62178b();
                        }
                    }
                }
                i = i2;
                bfrh.f114996M = i;
                bfrh.f114990G = SystemClock.elapsedRealtime();
            }
        }
        bfrb bfrb = this.f115058d;
        if (bfrb != null) {
            bfrb.mo62121a(locationAvailability);
        }
    }

    /* renamed from: a */
    public final void mo62072a(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (ceyp.f183514a.mo6606a().addAggregateFlpStatsToDumpsys()) {
            bfrh bfrh = this.f115055a;
            String[] strArr2 = bfrh.f115009h ? new String[]{bfrh.mo62173a(2, "GPS"), bfrh.mo62173a(17, "Wifi"), bfrh.mo62173a(33, "Cell"), bfrh.mo62173a(1, "Other")} : null;
            if (strArr2 != null) {
                printWriter.println("--LoggingLocationEngine--");
                int length = strArr2.length;
                for (int i = 0; i < 4; i++) {
                    printWriter.println(strArr2[i]);
                }
            }
        }
        this.f114732e.mo62072a(fileDescriptor, printWriter, strArr);
    }

    /* renamed from: a */
    public final void mo62059a(Collection collection, boolean z) {
        if (!collection.isEmpty()) {
            int i = Build.VERSION.SDK_INT;
            this.f115062i = SystemClock.elapsedRealtime();
            this.f115063j = z;
            if (this.f115064k && this.f115065l == 0) {
                bfrh bfrh = this.f115055a;
                bfrh.f115013l = SystemClock.elapsedRealtime();
                bfrh.f115012k = System.currentTimeMillis();
            }
        } else {
            this.f115062i = Long.MIN_VALUE;
            this.f115063j = false;
        }
        this.f115065l = collection.size();
        this.f114732e.mo62059a(collection, z);
    }

    /* renamed from: a */
    public final void mo26071a(boolean z, boolean z2) {
        boolean z3;
        if (this.f115055a.mo62176a()) {
            boolean z4 = false;
            if (this.f115060g || this.f115061h) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z) {
                z4 = true;
            } else if (z2) {
                z4 = true;
            }
            if (!z3 && z4) {
                bfrh bfrh = this.f115055a;
                bfrh.f115015n = SystemClock.elapsedRealtime();
                bfrh.f115014m = System.currentTimeMillis();
            }
            if (z != this.f115060g) {
                this.f115060g = z;
                this.f115055a.f115004c.f114975i++;
            }
            if (z2 != this.f115061h) {
                this.f115061h = z2;
                this.f115055a.f115004c.f114974h++;
            }
            if (!z3 || !z4) {
                this.f115064k = true;
            }
        }
    }
}
