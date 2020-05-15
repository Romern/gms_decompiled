package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: acag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acag extends acpn {

    /* renamed from: a */
    private final Context f59092a;

    /* renamed from: b */
    private final abvy f59093b;

    /* renamed from: c */
    private final abqv f59094c;

    /* renamed from: d */
    private final abze f59095d;

    /* renamed from: e */
    private final abyx f59096e;

    /* renamed from: f */
    private final abym f59097f;

    /* renamed from: n */
    private final abyh f59098n;

    /* renamed from: o */
    private final NativeIndex f59099o;

    /* renamed from: p */
    private final AtomicBoolean f59100p;

    /* renamed from: q */
    private final Map f59101q = new HashMap();

    /* renamed from: r */
    private final Map f59102r = new HashMap();

    /* renamed from: s */
    private final Map f59103s = new HashMap();

    public acag(Context context, abvy abvy, abqv abqv, abze abze, abyx abyx, abym abym, abyh abyh, NativeIndex nativeIndex, AtomicBoolean atomicBoolean) {
        super(bqbd.DRAIN_REQUEST_QUEUE, 2, 3, null, acrz.m49787b(context));
        this.f59092a = context;
        this.f59093b = abvy;
        this.f59094c = abqv;
        this.f59095d = abze;
        this.f59096e = abyx;
        this.f59097f = abym;
        this.f59098n = abyh;
        this.f59099o = nativeIndex;
        this.f59100p = atomicBoolean;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.icing.nativeindex.NativeIndex.a(int, boolean):long
     arg types: [int, int]
     candidates:
      com.google.android.gms.icing.nativeindex.NativeIndex.a(java.lang.String[], abud):abuh
      com.google.android.gms.icing.nativeindex.NativeIndex.a(int, long):bqaw
      com.google.android.gms.icing.nativeindex.NativeIndex.a(int, boolean):long */
    /* renamed from: a */
    private final long m48754a(acak acak, abss abss) {
        absr absr = abss.f58157b;
        if (absr == null) {
            absr = absr.f58134s;
        }
        Long l = (Long) this.f59101q.get(acak);
        if (l == null) {
            l = Long.valueOf(this.f59099o.mo43391a(absr.f58137b, false));
            this.f59101q.put(acak, l);
        }
        return l.longValue();
    }

    /* renamed from: b */
    private final acxd m48761b(acak acak) {
        acxd acxd = (acxd) this.f59103s.get(acak);
        if (acxd != null) {
            return acxd;
        }
        acxd acxd2 = new acxd();
        this.f59103s.put(acak, acxd2);
        return acxd2;
    }

    /* renamed from: c */
    private final void m48762c(acak acak) {
        abss a;
        acxd acxd = (acxd) this.f59103s.get(acak);
        if (acxd != null && (a = m48755a(acak)) != null) {
            absy absy = a.f58158c;
            if (absy == null) {
                absy = absy.f58176h;
            }
            bxvd bxvd = (bxvd) absy.mo74142c(5);
            bxvd.mo73625a((bxvk) absy);
            List a2 = acxd.mo33186a(Collections.unmodifiableList(((absy) bxvd.f164949b).f58179b));
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ((absy) bxvd.f164949b).f58179b = bxvk.m124030de();
            bxvd.mo73950M(a2);
            this.f59095d.mo32517a().mo32542c(acak, (absy) bxvd.mo74062i());
        }
    }

    /* renamed from: a */
    private final abss m48755a(acak acak) {
        abss abss = (abss) this.f59102r.get(acak);
        if (abss == null) {
            abss = this.f59095d.f58793b.mo32534b(acak);
            if (abss != null) {
                absy absy = abss.f58158c;
                if (absy == null) {
                    absy = absy.f58176h;
                }
                int a = absx.m48236a(absy.f58180c);
                if (a == 0 || a == 1) {
                    absr absr = abss.f58157b;
                    if (absr == null) {
                        absr = absr.f58134s;
                    }
                    if (!abww.m48413a(absr.f58138c)) {
                        return null;
                    }
                    String str = absr.f58140e;
                    abyv d = this.f59096e.mo32506d(str);
                    if (d == null || !d.mo32476e()) {
                        absg.m48197c("Not indexing corpus from package %s as it has never connected", str);
                        return null;
                    }
                    this.f59102r.put(acak, abss);
                }
            }
            absg.m48185a("Corpus no longer exists %s", acak.mo32584b());
            return null;
        }
        return abss;
    }

    /* renamed from: a */
    private final bngx m48756a(String str) {
        abyv d = this.f59096e.mo32506d(str);
        if (d != null) {
            return this.f59095d.f58793b.mo32524a(d);
        }
        absg.m48185a("Package %s not found in client registry", str);
        return bngx.m109376e();
    }

    /* renamed from: a */
    private final bqaw m48757a(abss abss, bpxk bpxk) {
        bxvd da = bpxj.f139719d.mo74144da();
        absr absr = abss.f58157b;
        if (absr == null) {
            absr = absr.f58134s;
        }
        String str = absr.f58140e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpxj bpxj = (bpxj) da.f164949b;
        str.getClass();
        bpxj.f139721a |= 1;
        bpxj.f139722b = str;
        absr absr2 = abss.f58157b;
        if (absr2 == null) {
            absr2 = absr.f58134s;
        }
        String a = acww.m49914a(absr2);
        if (a != null && !TextUtils.isEmpty(a)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpxj bpxj2 = (bpxj) da.f164949b;
            a.getClass();
            bpxj2.f139721a |= 2;
            bpxj2.f139723c = a;
        }
        bxvd bxvd = (bxvd) bpxk.mo74142c(5);
        bxvd.mo73625a((bxvk) bpxk);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bpxk bpxk2 = (bpxk) bxvd.f164949b;
        bpxj bpxj3 = (bpxj) da.mo74062i();
        bpxj3.getClass();
        bpxk2.f139727b = bpxj3;
        bpxk2.f139726a |= 64;
        this.f59097f.mo32442a((bpxk) bxvd.mo74062i());
        bqaw a2 = bqaw.m112488a(bpxk.f139728c);
        return a2 == null ? bqaw.OK : a2;
    }

    /* renamed from: a */
    private final void m48758a(abqu abqu, boolean z) {
        absr absr;
        bqaw bqaw;
        absr absr2;
        bqaw bqaw2;
        acak acak = new acak(abqu.f58018a, abqu.f58019b);
        abss a = m48755a(acak);
        if (a != null) {
            long a2 = m48754a(acak, a);
            absg.m48204d("Indexing %s from %s using seqno %d", acak.mo32584b(), abqu.f58018a, Long.valueOf(a2));
            acxd b = m48761b(acak);
            if (!z) {
                String str = abqu.f58018a;
                caef caef = abqu.f58020c;
                if (caef == null) {
                    caef = caef.f172809f;
                }
                String str2 = caef.f172813c;
                absr absr3 = a.f58157b;
                if (absr3 == null) {
                    absr3 = absr.f58134s;
                }
                m48760a(str, str2, absr3.f58138c);
                NativeIndex nativeIndex = this.f59099o;
                byte[] k = caef.mo73642k();
                aclb a3 = acal.m48769a(a);
                absr absr4 = a.f58157b;
                if (absr4 != null) {
                    absr2 = absr4;
                } else {
                    absr2 = absr.f58134s;
                }
                bpxk a4 = nativeIndex.mo43398a(a2, k, a3, absr2, abzu.m48730a());
                if (a4 == null) {
                    bqaw2 = bqaw.PROTO_PARSE_ERROR;
                } else {
                    bqaw2 = m48757a(a, a4);
                }
                String valueOf = String.valueOf(NativeIndex.m66680a(bqaw2));
                b.mo33187a(valueOf.length() == 0 ? new String("index ") : "index ".concat(valueOf));
                String valueOf2 = String.valueOf(NativeIndex.m66680a(bqaw2));
                b.mo33187a(valueOf2.length() == 0 ? new String("index-thing ") : "index-thing ".concat(valueOf2));
                return;
            }
            caef caef2 = abqu.f58020c;
            if (caef2 == null) {
                caef2 = caef.f172809f;
            }
            if (!acaw.m48791h()) {
                b.mo33187a("patch disabled");
                return;
            }
            NativeIndex nativeIndex2 = this.f59099o;
            byte[] k2 = caef2.mo73642k();
            aclb a5 = acal.m48769a(a);
            absr absr5 = a.f58157b;
            if (absr5 == null) {
                absr = absr.f58134s;
            } else {
                absr = absr5;
            }
            bpxk b2 = nativeIndex2.mo43405b(a2, k2, a5, absr, abzu.m48730a());
            if (b2 == null) {
                bqaw = bqaw.PROTO_PARSE_ERROR;
            } else {
                bqaw = m48757a(a, b2);
            }
            String valueOf3 = String.valueOf(NativeIndex.m66680a(bqaw));
            b.mo33187a(valueOf3.length() == 0 ? new String("modify ") : "modify ".concat(valueOf3));
        }
    }

    /* renamed from: a */
    private final void m48759a(String str, String str2) {
        acak acak = new acak(str, str2);
        m48762c(acak);
        this.f59094c.mo32286a(str, str2);
        this.f59101q.remove(acak);
        this.f59102r.remove(acak);
        this.f59103s.remove(acak);
    }

    /* renamed from: a */
    private final void m48760a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        bnre i = m48756a(str).listIterator();
        boolean z = false;
        while (i.hasNext()) {
            acak acak = (acak) i.next();
            abss a = m48755a(acak);
            if (a != null) {
                absr absr = a.f58157b;
                if (absr == null) {
                    absr = absr.f58134s;
                }
                if (!absr.f58138c.equals(str3)) {
                    long a2 = m48754a(acak, a);
                    acxd b = m48761b(acak);
                    arrayList.add(b);
                    NativeIndex nativeIndex = this.f59099o;
                    absr absr2 = a.f58157b;
                    if (absr2 == null) {
                        absr2 = absr.f58134s;
                    }
                    bqaw a3 = nativeIndex.mo43400a(a2, absr2.f58137b, str2);
                    if (!bqaw.ERROR_URI_NOT_FOUND.equals(a3)) {
                        String valueOf = String.valueOf(NativeIndex.m66680a(a3));
                        b.mo33187a(valueOf.length() == 0 ? new String("delete ") : "delete ".concat(valueOf));
                        if (bqaw.OK.equals(a3)) {
                            abyh abyh = this.f59098n;
                            absr absr3 = a.f58157b;
                            if (absr3 == null) {
                                absr3 = absr.f58134s;
                            }
                            abyh.mo32431a(str, absr3.f58138c, str2);
                        }
                        z = true;
                    }
                }
            }
        }
        if (str3 == null && !z) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                acxd acxd = (acxd) arrayList.get(i2);
                String valueOf2 = String.valueOf(NativeIndex.m66680a(bqaw.ERROR_URI_NOT_FOUND));
                acxd.mo33187a(valueOf2.length() == 0 ? new String("delete ") : "delete ".concat(valueOf2));
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: acag.a(abqu, boolean):void
     arg types: [abqu, int]
     candidates:
      acag.a(acak, abss):long
      acag.a(abss, bpxk):bqaw
      acag.a(java.lang.String, java.lang.String):void
      acpn.a(int, int):void
      acag.a(abqu, boolean):void */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (r0.f58566a.equals(r11.f58582j) == false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
        r13 = r11.f58576d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        monitor-enter(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        if (r11.f58580h.f58566a.equals(r11.f58582j) == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r11.f58580h.f58569d.mo73783A() != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        r8 = new android.util.Pair(java.lang.Long.valueOf(r11.f58580h.f58569d.mo73794e()), r11.f58580h.f58569d.mo73804m());
        r11.f58580h.f58569d.mo73816y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0075, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        r8 = null;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        monitor-exit(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        r8 = null;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0081, code lost:
        if (r0 != false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0083, code lost:
        r13 = r11.f58580h.f58569d.mo73794e();
        r8 = r11.f58580h.f58569d.mo73804m();
        r11.f58580h.f58569d.mo73816y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a3, code lost:
        r8 = new android.util.Pair(java.lang.Long.valueOf(r13), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a4, code lost:
        if (r0 != false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ae, code lost:
        if (r11.f58580h.f58569d.mo73783A() == false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        r11.f58580h.close();
        r11.f58581i = r11.f58580h.f58566a;
        r11.f58580h = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00be, code lost:
        if (r8 == null) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r12 = ((java.lang.Long) r8.first).longValue();
        r0 = (byte[]) r8.second;
        r8 = new java.util.zip.CRC32();
        r8.update(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00da, code lost:
        if (r12 != r8.getValue()) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00dc, code lost:
        r0 = (p000.bxxc) r11.f58574b.mo73657a(r0);
        r8 = r11.f58583k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e6, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r11 = r11.f58583k;
        r12 = ((p000.bpys) r11.f164949b).f139930d + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f2, code lost:
        if (r11.f164950c != false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f5, code lost:
        r11.mo74035c();
        r11.f164950c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fa, code lost:
        r11 = (p000.bpys) r11.f164949b;
        r13 = p000.bpys.f139925f;
        r11.f139927a |= 2;
        r11.f139930d = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0107, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010d, code lost:
        r11.mo32370a(p000.bqba.CRC_MISMATCH);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0119, code lost:
        throw new java.io.IOException("CRC Mismatch");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011a, code lost:
        r0 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x002d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x019a A[Catch:{ IOException -> 0x01bd }] */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        abqq abqq;
        bpys bpys;
        abqu abqu;
        abqu abqu2;
        abqs abqs;
        abqr abqr;
        abqt abqt;
        abqu abqu3;
        bxxc bxxc;
        String str;
        int i;
        absg.m48184a("DrainRequestQueueTask starting");
        this.f59100p.set(false);
        int max = Math.max(1, (int) cemz.f183035a.mo6606a().mo79390b());
        long currentTimeMillis = System.currentTimeMillis();
        int i2 = 0;
        while (true) {
            try {
                abvw abvw = ((abvx) this.f59093b).f58584a;
                synchronized (abvw.f58579g) {
                    while (true) {
                        abvu abvu = abvw.f58580h;
                        if (abvu == null) {
                            TreeSet a = abvw.mo32369a();
                            if (a.isEmpty()) {
                                bxxc = null;
                                break;
                            }
                            if (abvw.f58581i != null) {
                                str = (String) a.higher(abvw.f58581i);
                            } else {
                                str = (String) a.first();
                            }
                            if (str == null) {
                                bxxc = null;
                                break;
                            }
                            File file = new File(abvw.f58573a, str);
                            if (abvw.m48365a(str) != null) {
                                try {
                                    abvw.f58580h = new abvu(str, file);
                                    if (abvw.f58580h.f58566a.equals(abvw.f58582j)) {
                                        synchronized (abvw.f58576d) {
                                            if (abvw.f58580h.f58566a.equals(abvw.f58582j)) {
                                                i = abvw.f58580h.f58569d.mo73799h();
                                            }
                                        }
                                        if (i == 1) {
                                            absg.m48210f("Shard %s skipped due to invalid format (expected %d, got %d)", str, 1, Integer.valueOf(i));
                                            abvw.mo32370a(bqba.INVALID_SHARD_FORMAT);
                                            abvw.mo32371b();
                                        }
                                    }
                                    i = abvw.f58580h.f58569d.mo73799h();
                                    if (i == 1) {
                                    }
                                } catch (IOException e) {
                                    absg.m48195b(e, "Failed to open shard %s for reading", str);
                                    abvw.mo32370a(bqba.SHARD_OPEN_FAILED);
                                    if (abvw.f58580h != null) {
                                        abvw.mo32371b();
                                    } else if (!file.delete()) {
                                        absg.m48206e("Failed to delete file %s", file);
                                        abvw.mo32370a(bqba.SHARD_DELETE_FAILED);
                                    }
                                    throw e;
                                }
                            } else {
                                absg.m48206e("Invalid shard name: %s. Shard will be skipped and deleted.", str);
                                abvw.mo32370a(bqba.INVALID_SHARD_NAME);
                                if (!file.delete()) {
                                    abvw.mo32370a(bqba.SHARD_DELETE_FAILED);
                                    String valueOf = String.valueOf(file);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                                    sb.append("Failed to delete file: ");
                                    sb.append(valueOf);
                                    throw new IOException(sb.toString());
                                }
                            }
                        } else {
                            try {
                                break;
                            } catch (IOException e2) {
                                absg.m48195b(e2, "Got IOException trying to read shard %s", abvw.f58580h.f58567b);
                                abvw.mo32370a(bqba.SHARD_READ_FAILED);
                                abvw.mo32371b();
                                throw e2;
                            }
                        }
                    }
                }
                abqq = (abqq) bxxc;
            } catch (IOException e3) {
                absg.m48189a(e3, "Failed to take from request queue");
                abqq = null;
            }
            if (abqq != null) {
                absg.m48202d("RequestQueue processing mutation request, type: %s", abqp.m48084a(abqq.f58003a));
                int ordinal = abqp.m48084a(abqq.f58003a).ordinal();
                if (ordinal == 0) {
                    if (abqq.f58003a == 1) {
                        abqu = (abqu) abqq.f58004b;
                    } else {
                        abqu = abqu.f58016d;
                    }
                    m48758a(abqu, false);
                } else if (ordinal == 1) {
                    if (abqq.f58003a == 2) {
                        abqu2 = (abqu) abqq.f58004b;
                    } else {
                        abqu2 = abqu.f58016d;
                    }
                    m48758a(abqu2, true);
                } else if (ordinal == 2) {
                    if (abqq.f58003a == 3) {
                        abqs = (abqs) abqq.f58004b;
                    } else {
                        abqs = abqs.f58008c;
                    }
                    m48760a(abqs.f58010a, (abqq.f58003a == 3 ? (abqs) abqq.f58004b : abqs.f58008c).f58011b, null);
                } else if (ordinal == 3) {
                    if (abqq.f58003a == 4) {
                        abqr = (abqr) abqq.f58004b;
                    } else {
                        abqr = abqr.f58005b;
                    }
                    bnre i3 = m48756a(abqr.f58007a).listIterator();
                    while (i3.hasNext()) {
                        abss a2 = m48755a((acak) i3.next());
                        if (a2 != null) {
                            String str2 = abqr.f58007a;
                            absr absr = a2.f58157b;
                            if (absr == null) {
                                absr = absr.f58134s;
                            }
                            m48759a(str2, absr.f58138c);
                        }
                    }
                } else if (ordinal == 4) {
                    if (abqq.f58003a == 5) {
                        abqt = (abqt) abqq.f58004b;
                    } else {
                        abqt = abqt.f58012c;
                    }
                    bnre i4 = m48756a(abqt.f58014a).listIterator();
                    while (i4.hasNext()) {
                        acak acak = (acak) i4.next();
                        abss a3 = m48755a(acak);
                        if (a3 != null) {
                            absr absr2 = a3.f58157b;
                            if (absr2 == null) {
                                absr2 = absr.f58134s;
                            }
                            String str3 = absr2.f58138c;
                            absr absr3 = a3.f58157b;
                            if (absr3 == null) {
                                absr3 = absr.f58134s;
                            }
                            abww a4 = abww.m48411a(str3, absr3.f58140e, abxt.m48504a(this.f59092a));
                            if (a4 == null) {
                                absg.m48206e("No AppIndexingCorpusConfig found for corpus %s", acak.mo32584b());
                            } else if (a4.f58661a.f58531b.equals(abqt.f58015b)) {
                                String str4 = abqt.f58014a;
                                absr absr4 = a3.f58157b;
                                if (absr4 == null) {
                                    absr4 = absr.f58134s;
                                }
                                m48759a(str4, absr4.f58138c);
                            }
                        }
                    }
                } else if (ordinal != 5) {
                    absg.m48192b("Unhandled mutation type %s", abqp.m48084a(abqq.f58003a));
                    this.f59097f.mo32447a("bad_mutation_type");
                } else {
                    if (abqq.f58003a == 6) {
                        abqu3 = (abqu) abqq.f58004b;
                    } else {
                        abqu3 = abqu.f58016d;
                    }
                    m48758a(abqu3, false);
                }
                i2++;
                if (i2 % max == 0) {
                    this.f59099o.mo43407c();
                    this.f59093b.mo32373a();
                }
            } else {
                if (i2 % max != 0) {
                    this.f59099o.mo43407c();
                    this.f59093b.mo32373a();
                }
                for (acak acak2 : this.f59103s.keySet()) {
                    m48762c(acak2);
                }
                abvw abvw2 = ((abvx) this.f59093b).f58584a;
                synchronized (abvw2.f58583k) {
                    bpys = (bpys) abvw2.f58583k.mo74062i();
                    bxvd bxvd = abvw2.f58583k;
                    bxvd.f164949b = (bxvk) bxvd.f164949b.mo74142c(4);
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                abym abym = this.f59097f;
                bxvd bxvd2 = (bxvd) bpys.mo74142c(5);
                bxvd2.mo73625a((bxvk) bpys);
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                bpys bpys2 = (bpys) bxvd2.f164949b;
                bpys bpys3 = bpys.f139925f;
                bpys2.f139927a |= 4;
                bpys2.f139931e = currentTimeMillis2;
                bpys bpys4 = (bpys) bxvd2.mo74062i();
                long c = cema.m137236c();
                if (abym.mo32452a(c)) {
                    bxvd da = bpxb.f139606R.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpxb bpxb = (bpxb) da.f164949b;
                    bpys4.getClass();
                    bpxb.f139621N = bpys4;
                    bpxb.f139626b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                    abym.mo32438a(6013, da, c);
                }
                absg.m48186a("Indexing done. Processed %d requests in %d ms", Integer.valueOf(i2), Long.valueOf(currentTimeMillis2));
                return null;
            }
        }
    }
}
