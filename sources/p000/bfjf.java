package p000;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.SecretKey;

/* renamed from: bfjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfjf implements bhba {

    /* renamed from: a */
    public final bfnl f114154a;

    /* renamed from: b */
    public long f114155b = 0;

    /* renamed from: c */
    public bngx f114156c = bngx.m109376e();

    /* renamed from: d */
    private long f114157d = 0;

    /* renamed from: e */
    private long f114158e = 0;

    /* renamed from: f */
    private long f114159f = 0;

    /* renamed from: g */
    private long f114160g = 0;

    /* renamed from: h */
    private int f114161h = 0;

    /* renamed from: i */
    private int f114162i = Integer.MIN_VALUE;

    /* renamed from: j */
    private int f114163j = Integer.MIN_VALUE;

    /* renamed from: k */
    private int f114164k;

    /* renamed from: l */
    private bngx f114165l = bngx.m109376e();

    public bfjf(bgmm bgmm, SecretKey secretKey, byte[] bArr) {
        this.f114154a = new bfnl(1, secretKey, 2, bArr, bgox.f117114ca, m96993a(bgmm), bfnl.f114483c);
    }

    /* renamed from: a */
    public static File m96993a(bgmm bgmm) {
        File h = bgmm.mo62788h();
        if (h != null) {
            return new File(h, "nlp_clts");
        }
        return null;
    }

    /* renamed from: a */
    public final void mo61420a() {
    }

    /* renamed from: a */
    public final synchronized void mo61782a(int i) {
        this.f114163j = i;
    }

    /* renamed from: a */
    public final synchronized void mo61783a(long j) {
        this.f114158e = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c A[Catch:{ IOException -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0063 A[Catch:{ IOException -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c A[Catch:{ IOException -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073 A[Catch:{ IOException -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0095 A[Catch:{ IOException -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d0 A[Catch:{ IOException -> 0x015e }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f6 A[Catch:{ IOException -> 0x015e }] */
    /* renamed from: b */
    public final synchronized void mo61786b() {
        int i;
        int j;
        int i2;
        int j2;
        int i3;
        int size;
        Integer num;
        int i4;
        int i5;
        synchronized (this) {
            try {
                bsax a = this.f114154a.mo61993a();
                int i6 = 2;
                this.f114157d = bsba.m115024a(a, 2, 0);
                this.f114164k = (int) bsba.m115024a(a, 11, 1);
                this.f114158e = bsba.m115024a(a, 3, 0);
                this.f114159f = bsba.m115024a(a, 6, 0);
                this.f114155b = bsba.m115024a(a, 9, 0);
                this.f114160g = bsba.m115024a(a, 8, 0);
                if (a != null) {
                    try {
                        if (a.mo70137i(7)) {
                            i = a.mo70114b(7);
                            this.f114161h = i;
                            int i7 = 5;
                            if (a.mo70138j(5) <= 0) {
                                this.f114162i = a.mo70114b(5);
                            } else {
                                this.f114162i = Integer.MIN_VALUE;
                            }
                            int i8 = 4;
                            if (a.mo70138j(4) <= 0) {
                                this.f114163j = a.mo70114b(4);
                            } else {
                                this.f114163j = Integer.MIN_VALUE;
                            }
                            int i9 = 10;
                            j = a.mo70138j(10);
                            ArrayList arrayList = new ArrayList(j);
                            i2 = 0;
                            while (i2 < j) {
                                bsax f = a.mo70131f(i9, i2);
                                if (f.mo70137i(1)) {
                                    String f2 = f.mo70132f(1);
                                    ArrayList arrayList2 = new ArrayList();
                                    int i10 = 0;
                                    while (i10 < f.mo70138j(i6)) {
                                        bsax f3 = f.mo70131f(i6, i10);
                                        if (!f3.mo70137i(1)) {
                                            i5 = j;
                                        } else if (f3.mo70137i(i6)) {
                                            long b = (long) f3.mo70114b(1);
                                            int b2 = f3.mo70114b(i6);
                                            i5 = j;
                                            long j3 = (long) b2;
                                            if (b < j3) {
                                                arrayList2.add(new bfla(b, j3));
                                            }
                                        } else {
                                            i5 = j;
                                        }
                                        i10++;
                                        j = i5;
                                        i6 = 2;
                                    }
                                    arrayList.add(new bfje(f2, arrayList2));
                                    i4 = j;
                                } else {
                                    i4 = j;
                                }
                                i2++;
                                j = i4;
                                i7 = 5;
                                i8 = 4;
                                i9 = 10;
                                i6 = 2;
                            }
                            this.f114156c = bngx.m109368a((Collection) arrayList);
                            j2 = a.mo70138j(1);
                            List arrayList3 = new ArrayList(j2);
                            for (i3 = 0; i3 < j2; i3++) {
                                bsax f4 = a.mo70131f(1, i3);
                                if (f4.mo70138j(i7) > 0) {
                                    num = Integer.valueOf(f4.mo70114b(i7));
                                } else {
                                    num = null;
                                }
                                arrayList3.add(new bfjd(f4.mo70124c(1), f4.mo70124c(i6), f4.mo70114b(i8), num));
                            }
                            Collections.sort(arrayList3);
                            size = arrayList3.size();
                            if (size > 20) {
                                arrayList3 = arrayList3.subList(size - 20, size);
                            }
                            this.f114165l = bngx.m109368a((Collection) arrayList3);
                            int i11 = this.f114154a.f114485b;
                            StringBuilder sb = new StringBuilder(32);
                            sb.append("Actual file version: ");
                            sb.append(i11);
                            sb.toString();
                            new Object[1][0] = toString();
                        }
                    } catch (ClassCastException | IllegalArgumentException e) {
                        i = 0;
                    }
                }
                i = 0;
                this.f114161h = i;
                int i72 = 5;
                if (a.mo70138j(5) <= 0) {
                }
                int i82 = 4;
                if (a.mo70138j(4) <= 0) {
                }
                int i92 = 10;
                j = a.mo70138j(10);
                ArrayList arrayList4 = new ArrayList(j);
                i2 = 0;
                while (i2 < j) {
                }
                this.f114156c = bngx.m109368a((Collection) arrayList4);
                j2 = a.mo70138j(1);
                List arrayList32 = new ArrayList(j2);
                while (i3 < j2) {
                }
                Collections.sort(arrayList32);
                size = arrayList32.size();
                if (size > 20) {
                }
                this.f114165l = bngx.m109368a((Collection) arrayList32);
                int i112 = this.f114154a.f114485b;
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Actual file version: ");
                sb2.append(i112);
                sb2.toString();
            } catch (IOException e2) {
                e2.toString();
            }
            new Object[1][0] = toString();
        }
    }

    /* renamed from: b */
    public final synchronized void mo61787b(int i) {
        this.f114162i = i;
    }

    /* renamed from: b */
    public final synchronized void mo61788b(long j) {
        this.f114160g = j;
    }

    /* renamed from: c */
    public final synchronized bsax mo61789c(long j) {
        int i;
        bsax bsax = new bsax(bgox.f117051ar);
        bnre i2 = this.f114165l.listIterator();
        while (i2.hasNext()) {
            bfjd bfjd = (bfjd) i2.next();
            long j2 = bfjd.f114149b;
            if (j2 >= j) {
                bsax bsax2 = new bsax(bgox.f117050aq);
                Integer num = bfjd.f114151d;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 1;
                }
                bsax2.mo70134g(2, i);
                bsax2.mo70134g(1, bfjd.f114150c);
                bsax2.mo70134g(3, (int) bfla.m97166b(j2));
                bsax.mo70107a(1, bsax2);
            }
        }
        if (bsax.mo70138j(1) == 0) {
            return null;
        }
        return bsax;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized bsax mo61791d() {
        int size;
        size = this.f114165l.size();
        return size != 0 ? ((bfjd) this.f114165l.get(size - 1)).mo61780a() : null;
    }

    /* renamed from: e */
    public final synchronized int mo61792e() {
        int i = this.f114163j;
        if (i == Integer.MIN_VALUE) {
            return 1;
        }
        return i;
    }

    /* renamed from: f */
    public final synchronized int mo61793f() {
        int i = this.f114162i;
        if (i == Integer.MIN_VALUE) {
            return 1;
        }
        return i;
    }

    /* renamed from: g */
    public final synchronized boolean mo61794g() {
        return this.f114163j != Integer.MIN_VALUE;
    }

    /* renamed from: h */
    public final synchronized boolean mo61795h() {
        return this.f114162i != Integer.MIN_VALUE;
    }

    /* renamed from: i */
    public final synchronized long mo61796i() {
        return this.f114160g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final synchronized void mo61797j() {
        this.f114160g = 0;
    }

    /* renamed from: k */
    public final synchronized Date mo61798k() {
        long j = this.f114159f;
        if (j == 0) {
            return null;
        }
        return new Date(j);
    }

    /* renamed from: l */
    public final synchronized void mo61799l() {
        this.f114161h++;
    }

    /* renamed from: m */
    public final synchronized int mo61800m() {
        return this.f114161h;
    }

    /* renamed from: n */
    public final synchronized Map mo61801n() {
        HashMap hashMap;
        if (this.f114155b != 0) {
            hashMap = new HashMap();
            bnre i = this.f114156c.listIterator();
            while (i.hasNext()) {
                bfje bfje = (bfje) i.next();
                hashMap.put(bfje.f114152a, bfje.f114153b);
            }
        } else {
            hashMap = null;
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final synchronized bsax mo61802o() {
        bsax bsax;
        bsax = new bsax(bgox.f117114ca);
        long j = this.f114157d;
        if (j != 0) {
            bsax.mo70117b(2, j);
        }
        bsax.mo70134g(11, this.f114164k);
        bsax.mo70117b(3, this.f114158e);
        long j2 = this.f114159f;
        if (j2 != 0) {
            bsax.mo70117b(6, j2);
        }
        long j3 = this.f114155b;
        if (j3 != 0) {
            bsax.mo70117b(9, j3);
        }
        long j4 = this.f114160g;
        if (j4 != 0) {
            bsax.mo70117b(8, j4);
        }
        bsax.mo70134g(7, this.f114161h);
        int i = this.f114162i;
        if (i != Integer.MIN_VALUE) {
            bsax.mo70134g(5, i);
        }
        int i2 = this.f114163j;
        if (i2 != Integer.MIN_VALUE) {
            bsax.mo70134g(4, i2);
        }
        bnre i3 = this.f114156c.listIterator();
        while (i3.hasNext()) {
            bfje bfje = (bfje) i3.next();
            bsax bsax2 = new bsax(bgox.f117086bZ);
            bsax2.mo70118b(1, bfje.f114152a);
            bnre i4 = bfje.f114153b.listIterator();
            while (i4.hasNext()) {
                bfla bfla = (bfla) i4.next();
                bsax bsax3 = new bsax(bgox.f117085bY);
                bsax3.mo70134g(1, (int) bfla.f114327a);
                bsax3.mo70134g(2, (int) bfla.f114328b);
                bsax2.mo70107a(2, bsax3);
            }
            bsax.mo70107a(10, bsax2);
        }
        bnre i5 = this.f114165l.listIterator();
        while (i5.hasNext()) {
            bsax.mo70107a(1, ((bfjd) i5.next()).mo61780a());
        }
        return bsax;
    }

    public final synchronized String toString() {
        StringBuilder sb;
        String str;
        sb = new StringBuilder();
        Object[] objArr = new Object[1];
        long j = this.f114157d;
        if (j != 0) {
            str = new Date(j).toString();
        } else {
            str = "none";
        }
        objArr[0] = str;
        sb.append(String.format("NextSensorCollectionTimeSinceEpoch: %s", objArr));
        bnre i = this.f114165l.listIterator();
        while (i.hasNext()) {
            bfjd bfjd = (bfjd) i.next();
            sb.append(", [");
            sb.append(String.format("start: %s, end: %s", new Date(bfjd.f114148a), new Date(bfjd.f114149b)));
            sb.append("]");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final synchronized void mo61784a(long j, long j2, int i, bfju bfju) {
        Integer num;
        int i2;
        long min = Math.min(j, j2);
        long max = Math.max(j, j2);
        if (bfju != null) {
            if (bfju == bfju.USING_IN_OUTDOOR_HINTS) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            num = Integer.valueOf(i2);
        } else {
            num = null;
        }
        List arrayList = new ArrayList(this.f114165l);
        arrayList.add(new bfjd(min, max, i, num));
        Collections.sort(arrayList);
        int size = arrayList.size();
        if (size > 20) {
            arrayList = arrayList.subList(size - 20, size);
        }
        this.f114165l = bngx.m109368a((Collection) arrayList);
    }

    /* renamed from: c */
    public final void mo61790c() {
        byte[] byteArray;
        FileOutputStream fileOutputStream;
        try {
            synchronized (this) {
                bfnl bfnl = this.f114154a;
                bsax o = mo61802o();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bfnl.mo61995a(o, byteArrayOutputStream);
                byteArray = byteArrayOutputStream.toByteArray();
            }
            bfnl bfnl2 = this.f114154a;
            File file = bfnl2.f114484a;
            if (file != null) {
                try {
                    if (!file.exists()) {
                        bfnl2.f114484a.createNewFile();
                    }
                    fileOutputStream = new FileOutputStream(bfnl2.f114484a);
                    try {
                        fileOutputStream.write(byteArray);
                        bhcy.m100661a(fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        bhcy.m100661a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                    bhcy.m100661a(fileOutputStream);
                    throw th;
                }
            }
        } catch (IOException e) {
        }
    }

    /* renamed from: a */
    public final void mo61425a(bsax bsax, long j) {
        bsax c = mo61789c(j);
        if (c != null) {
            bsax.mo70118b(12, c);
        }
    }

    /* renamed from: a */
    public final void mo61426a(bxvd bxvd, long j) {
        int i;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            bnre i2 = this.f114165l.listIterator();
            while (i2.hasNext()) {
                bfjd bfjd = (bfjd) i2.next();
                if (bfjd.f114149b >= j) {
                    arrayList.add(bfjd);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            bxvd da = bumt.f154272b.mo74144da();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                bfjd bfjd2 = (bfjd) arrayList.get(i3);
                Integer num = bfjd2.f114151d;
                if (num != null) {
                    i = bumw.m120013a(num.intValue());
                } else {
                    i = 1;
                }
                long b = bfla.m97166b(bfjd2.f114149b);
                int a = bumy.m120015a(bfjd2.f114150c);
                bxvd da2 = bumz.f154283e.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bumz bumz = (bumz) da2.f164949b;
                if (a != 0) {
                    bumz.f154286b = a;
                    int i4 = bumz.f154285a | 1;
                    bumz.f154285a = i4;
                    int i5 = i4 | 4;
                    bumz.f154285a = i5;
                    bumz.f154288d = (int) b;
                    if (i != 0) {
                        bumz.f154287c = i;
                        bumz.f154285a = i5 | 2;
                        bumz bumz2 = (bumz) da2.mo74062i();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bumt bumt = (bumt) da.f164949b;
                        bumz2.getClass();
                        if (!bumt.f154274a.mo73666a()) {
                            bumt.f154274a = bxvk.m124021a(bumt.f154274a);
                        }
                        bumt.f154274a.add(bumz2);
                        i3++;
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
            bumt bumt2 = (bumt) da.mo74062i();
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            buna buna = (buna) bxvd.f164949b;
            buna buna2 = buna.f154289i;
            bumt2.getClass();
            buna.f154295e = bumt2;
            buna.f154291a |= 512;
        }
    }

    /* renamed from: a */
    public final synchronized void mo61785a(Calendar calendar) {
        if (calendar != null) {
            this.f114159f = calendar.getTimeInMillis();
            this.f114161h = 0;
        }
    }
}
