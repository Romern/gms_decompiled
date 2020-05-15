package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import com.google.android.gms.common.internal.ClientContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: bfvy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfvy {

    /* renamed from: a */
    public final bfvv f115460a;

    /* renamed from: b */
    public int f115461b;

    /* renamed from: c */
    public int f115462c;

    /* renamed from: d */
    public int f115463d;

    /* renamed from: e */
    public int f115464e;

    /* renamed from: f */
    private final bfcq f115465f;

    /* renamed from: g */
    private long f115466g;

    /* renamed from: h */
    private long f115467h;

    /* renamed from: i */
    private long f115468i;

    /* renamed from: j */
    private final ReadWriteLock f115469j = new ReentrantReadWriteLock();

    /* renamed from: k */
    private bfcp f115470k;

    /* renamed from: l */
    private final qws f115471l;

    /* renamed from: m */
    private final SharedPreferences f115472m;

    /* renamed from: n */
    private final bqgj f115473n;

    /* renamed from: o */
    private final ConcurrentHashMap f115474o;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.Object):void
     arg types: [int, java.lang.String]
     candidates:
      bmxy.a(java.lang.Object, java.lang.Object):java.lang.Object
      bmxy.a(int, int):void
      bmxy.a(boolean, java.lang.Object):void */
    public bfvy(Context context, bfvv bfvv, qws qws) {
        boolean z;
        this.f115460a = bfvv;
        boolean z2 = false;
        this.f115472m = context.getSharedPreferences("geocoder_mafe_client", 0);
        bfco bfco = new bfco();
        int c = (int) cewm.m138365c();
        if (c > 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Memory capacity must be positive.");
        bfco.f113409a = c;
        bmxy.m108589a(true, (Object) "Version must be non-negaive.");
        bmxy.m108589a(true, (Object) "Version must be non-negaive.");
        bmxy.m108589a(bfco.f113409a > 0 ? true : z2, "Memory capacity must be positive.");
        this.f115465f = new bfcq(bfco.f113409a);
        this.f115466g = System.currentTimeMillis();
        this.f115467h = -1;
        this.f115468i = -1;
        this.f115471l = qws;
        this.f115474o = new ConcurrentHashMap();
        this.f115473n = snp.m35702a(10);
    }

    /* renamed from: a */
    private static int m98014a(bsyx bsyx) {
        bsyx bsyx2 = bsyx.ADDRESS_COMPONENT_TYPE_UNSPECIFIED;
        int ordinal = bsyx.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal != 4) {
            return ordinal != 14 ? 3 : 2;
        }
        return 1;
    }

    /* renamed from: a */
    private final long m98015a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f115472m.contains(str)) {
            return this.f115472m.getLong(str, currentTimeMillis);
        }
        this.f115472m.edit().putLong(str, currentTimeMillis).apply();
        return currentTimeMillis;
    }

    /* renamed from: a */
    private final void m98016a(bfcp bfcp) {
        bxvd da = bplf.f138075e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bplf bplf = (bplf) da.f164949b;
        bplf.f138078b = 1;
        bplf.f138077a |= 1;
        bxvd da2 = bplg.f138081f.mo74144da();
        int i = (int) bfcp.f113410a;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bplg bplg = (bplg) da2.f164949b;
        int i2 = bplg.f138083a | 1;
        bplg.f138083a = i2;
        bplg.f138084b = i;
        long j = bfcp.f113411b;
        bplg.f138083a = i2 | 2;
        bplg.f138085c = (int) j;
        int b = (int) cewm.m138364b();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bplg bplg2 = (bplg) da2.f164949b;
        bplg2.f138083a |= 4;
        bplg2.f138086d = b;
        int c = (int) cewm.m138365c();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bplg bplg3 = (bplg) da2.f164949b;
        bplg3.f138083a |= 8;
        bplg3.f138087e = c;
        bplg bplg4 = (bplg) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bplf bplf2 = (bplf) da.f164949b;
        bplg4.getClass();
        bplf2.f138079c = bplg4;
        bplf2.f138077a |= 2;
        bplf bplf3 = (bplf) da.mo74062i();
        bxvd da3 = bonq.f133833p.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bonq bonq = (bonq) da3.f164949b;
        bonq.f133836b = 6;
        int i3 = 1 | bonq.f133835a;
        bonq.f133835a = i3;
        bplf3.getClass();
        bonq.f133842h = bplf3;
        bonq.f133835a = i3 | 64;
        long j2 = bfcp.f113411b;
        long j3 = bfcp.f113410a;
        StringBuilder sb = new StringBuilder(62);
        sb.append("logging cache stats: ");
        sb.append(j2);
        sb.append("/");
        sb.append(j3);
        sb.toString();
        this.f115471l.mo24335a(((bonq) da3.mo74062i()).mo73642k()).mo24327b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
    /* renamed from: a */
    private final void m98017a(bszb bszb, List list, int i, Locale locale, String str) {
        Integer num;
        bszb bszb2 = bszb;
        int i2 = i;
        String str2 = str;
        if ((bszb2.f147787a & 1) != 0) {
            bszc bszc = bszb2.f147789c;
            if (bszc == null) {
                bszc = bszc.f147790c;
            }
            if (bszc.f147793b > 0) {
                ConcurrentHashMap concurrentHashMap = this.f115474o;
                bszc bszc2 = bszb2.f147789c;
                if (bszc2 == null) {
                    bszc2 = bszc.f147790c;
                }
                if ((bszc2.f147792a & 1) != 0) {
                    bszc bszc3 = bszb2.f147789c;
                    if (bszc3 == null) {
                        bszc3 = bszc.f147790c;
                    }
                    num = Integer.valueOf(bszc3.f147793b);
                } else {
                    num = null;
                }
                concurrentHashMap.put(str2, num);
                if (bszb2.f147788b.size() == 0) {
                    ArrayList arrayList = new ArrayList(bszb2.f147788b);
                    if (arrayList.size() > i2) {
                        arrayList.subList(i2, arrayList.size()).clear();
                    }
                    int size = arrayList.size();
                    int i3 = 0;
                    int i4 = 0;
                    while (i4 < size) {
                        bsza bsza = (bsza) arrayList.get(i4);
                        Address address = new Address(locale);
                        bsyz bsyz = bsza.f147784d;
                        if (bsyz == null) {
                            bsyz = bsyz.f147775c;
                        }
                        if ((bsyz.f147777a & 1) != 0) {
                            bsyz bsyz2 = bsza.f147784d;
                            if (bsyz2 == null) {
                                bsyz2 = bsyz.f147775c;
                            }
                            bzrv bzrv = bsyz2.f147778b;
                            if (bzrv == null) {
                                bzrv = bzrv.f171206c;
                            }
                            address.setLatitude(bzrv.f171208a);
                            bsyz bsyz3 = bsza.f147784d;
                            if (bsyz3 == null) {
                                bsyz3 = bsyz.f147775c;
                            }
                            bzrv bzrv2 = bsyz3.f147778b;
                            if (bzrv2 == null) {
                                bzrv2 = bzrv.f171206c;
                            }
                            address.setLongitude(bzrv2.f171209b);
                        }
                        bxwc bxwc = bsza.f147783c;
                        if (bxwc.size() > 0) {
                            address.setFeatureName(((bsyy) bxwc.get(i3)).f147772c);
                            int size2 = bxwc.size();
                            for (int i5 = 0; i5 < size2; i5++) {
                                bsyy bsyy = (bsyy) bxwc.get(i5);
                                if (bsyy.f147771a.size() != 0) {
                                    bsyx bsyx = bsyx.ADDRESS_COMPONENT_TYPE_UNSPECIFIED;
                                    for (bsyx bsyx2 : new bxvv(bsyy.f147771a, bsyy.f147768b)) {
                                        if (m98014a(bsyx2) >= m98014a(bsyx)) {
                                            bsyx = bsyx2;
                                        }
                                    }
                                    int ordinal = bsyx.ordinal();
                                    if (ordinal == 2) {
                                        address.setThoroughfare(bsyy.f147772c);
                                    } else if (ordinal == 12) {
                                        address.setLocality(bsyy.f147772c);
                                    } else if (ordinal == 15) {
                                        address.setSubLocality(bsyy.f147772c);
                                    } else if (ordinal == 21) {
                                        address.setPremises(bsyy.f147772c);
                                    } else if (ordinal == 23) {
                                        address.setPostalCode(bsyy.f147772c);
                                    } else if (ordinal != 34) {
                                        switch (ordinal) {
                                            case 5:
                                                address.setCountryName(bsyy.f147772c);
                                                address.setCountryCode(bsyy.f147773d);
                                                break;
                                            case 6:
                                                address.setAdminArea(bsyy.f147772c);
                                                break;
                                            case 7:
                                                address.setSubAdminArea(bsyy.f147772c);
                                                break;
                                            case 8:
                                                if (address.getLocality() != null) {
                                                    break;
                                                } else {
                                                    address.setLocality(bsyy.f147772c);
                                                    break;
                                                }
                                            case 9:
                                                if (address.getSubLocality() != null) {
                                                    break;
                                                } else {
                                                    address.setSubLocality(bsyy.f147772c);
                                                    break;
                                                }
                                        }
                                    } else {
                                        address.setSubThoroughfare(bsyy.f147772c);
                                    }
                                }
                            }
                        } else if ((bsza.f147781a & 1) != 0) {
                            address.setFeatureName(bsza.f147782b);
                        }
                        if ((bsza.f147781a & 1) != 0) {
                            address.setAddressLine(0, bsza.f147782b);
                        }
                        list.add(address);
                        i4++;
                        i3 = 0;
                    }
                    return;
                }
                return;
            }
        }
        this.f115474o.remove(str2);
        if (bszb2.f147788b.size() == 0) {
        }
    }

    /* renamed from: a */
    public final void mo62332a() {
        if (cewm.f183477a.mo6606a().geocoderLogErrorStats()) {
            if (this.f115468i == -1) {
                this.f115468i = m98015a("LastClearcutErrorStats");
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f115468i > TimeUnit.SECONDS.toMillis(cewm.f183477a.mo6606a().geocoderLogErrorStatsIntervalSecs())) {
                bxvd da = bplf.f138075e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bplf bplf = (bplf) da.f164949b;
                bplf.f138078b = 2;
                bplf.f138077a |= 1;
                bxvd da2 = bpld.f138067f.mo74144da();
                int i = this.f115461b;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpld bpld = (bpld) da2.f164949b;
                int i2 = 2 | bpld.f138069a;
                bpld.f138069a = i2;
                bpld.f138071c = i;
                int i3 = this.f115462c;
                int i4 = i2 | 1;
                bpld.f138069a = i4;
                bpld.f138070b = i3;
                int i5 = this.f115463d;
                int i6 = i4 | 8;
                bpld.f138069a = i6;
                bpld.f138073e = i5;
                int i7 = this.f115464e;
                bpld.f138069a = i6 | 4;
                bpld.f138072d = i7;
                bpld bpld2 = (bpld) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bplf bplf2 = (bplf) da.f164949b;
                bpld2.getClass();
                bplf2.f138080d = bpld2;
                bplf2.f138077a |= 4;
                bplf bplf3 = (bplf) da.mo74062i();
                bxvd da3 = bonq.f133833p.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                bonq bonq = (bonq) da3.f164949b;
                bonq.f133836b = 6;
                int i8 = bonq.f133835a | 1;
                bonq.f133835a = i8;
                bplf3.getClass();
                bonq.f133842h = bplf3;
                bonq.f133835a = i8 | 64;
                this.f115462c = 0;
                this.f115461b = 0;
                this.f115464e = 0;
                this.f115463d = 0;
                this.f115471l.mo24335a(((bonq) da3.mo74062i()).mo73642k()).mo24327b();
                this.f115468i = currentTimeMillis;
                this.f115472m.edit().putLong("LastClearcutErrorStats", this.f115468i).apply();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    public final void mo62333a(long j) {
        if (cewm.f183477a.mo6606a().geocoderLogCacheStats()) {
            long j2 = this.f115467h;
            if (j2 == -1) {
                j2 = m98015a("LastClearcutCacheStats");
                this.f115467h = j2;
            }
            if (j - j2 > TimeUnit.SECONDS.toMillis(cewm.f183477a.mo6606a().geocoderLogCacheStatsIntervalSecs())) {
                this.f115469j.readLock().lock();
                try {
                    bfcq bfcq = this.f115465f;
                    bfcp bfcp = new bfcp(bfcq.f113414c.get(), bfcq.f113415d.get());
                    this.f115469j.readLock().unlock();
                    bfcp bfcp2 = this.f115470k;
                    if (bfcp2 == null) {
                        m98016a(bfcp);
                    } else {
                        m98016a(new bfcp(Math.max(0L, bfcp.f113410a - bfcp2.f113410a), Math.max(0L, bfcp.f113411b - bfcp2.f113411b)));
                    }
                    this.f115470k = bfcp;
                    this.f115467h = j;
                    this.f115472m.edit().putLong("LastClearcutCacheStats", this.f115467h).apply();
                } catch (Throwable th) {
                    this.f115469j.readLock().unlock();
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo62334a(Locale locale, String str, double d, double d2, int i, List list) {
        bfno bfno;
        Object obj;
        bfcq bfcq;
        Integer num;
        String str2 = str;
        List list2 = list;
        int max = Math.max(0, Math.min(30, i));
        int b = (int) cewm.m138364b();
        if (!(str2 == null || (num = (Integer) this.f115474o.get(str2)) == null)) {
            b = num.intValue();
            StringBuilder sb = new StringBuilder(str.length() + 39);
            sb.append("app ");
            sb.append(str2);
            sb.append(" forced to use s2 level ");
            sb.append(b);
            sb.toString();
        }
        long a = ayvd.m84899a(ayvd.m84895a(d, d2), b);
        double[] dArr = new double[2];
        ayvd.m84903a(a, dArr);
        bxvd da = bzrv.f171206c.mo74144da();
        double d3 = dArr[0];
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bzrv bzrv = (bzrv) da.f164949b;
        bzrv.f171208a = d3;
        bzrv.f171209b = dArr[1];
        bzrv bzrv2 = (bzrv) da.mo74062i();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 75);
        sb2.append("Reverse Geocode from ");
        sb2.append(str2);
        sb2.append(" for ");
        sb2.append(d);
        sb2.append(",");
        sb2.append(d2);
        sb2.toString();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f115466g > TimeUnit.SECONDS.toMillis(cewm.f183477a.mo6606a().geocoderCacheMinManagementTtlSecs())) {
            this.f115469j.writeLock().lock();
            try {
                bfcq bfcq2 = this.f115465f;
                long millis = currentTimeMillis - TimeUnit.SECONDS.toMillis(cewm.f183477a.mo6606a().geocoderCacheMaxTtlSecs());
                synchronized (bfcq2.f113412a) {
                    Iterator it = bfcq2.f113412a.entrySet().iterator();
                    while (it.hasNext()) {
                        bfno bfno2 = (bfno) ((Map.Entry) it.next()).getValue();
                        bfcq bfcq3 = bfcq2;
                        if (bfno2.f114496b < millis) {
                            it.remove();
                            bfcq2 = bfcq3;
                        } else if (bfno2.f114497c < 0) {
                            it.remove();
                            bfcq2 = bfcq3;
                        } else {
                            bfcq2 = bfcq3;
                        }
                    }
                    bfcq = bfcq2;
                }
                bfcq.f113413b = millis;
                this.f115469j.writeLock().unlock();
                this.f115466g = currentTimeMillis;
            } catch (Throwable th) {
                this.f115469j.writeLock().unlock();
                throw th;
            }
        }
        String hexString = Long.toHexString(a);
        String locale2 = locale.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(hexString).length() + 13 + String.valueOf(locale2).length());
        sb3.append(hexString);
        sb3.append(",");
        sb3.append(locale2);
        sb3.append(",");
        sb3.append(max);
        String sb4 = sb3.toString();
        String valueOf = String.valueOf(sb4);
        if (valueOf.length() == 0) {
            new String("checking cache key ");
        } else {
            "checking cache key ".concat(valueOf);
        }
        this.f115469j.readLock().lock();
        try {
            bfcq bfcq4 = this.f115465f;
            long currentTimeMillis2 = System.currentTimeMillis();
            bmxy.m108582a(sb4, "Key cannot be null.");
            bfcq4.f113414c.incrementAndGet();
            synchronized (bfcq4.f113412a) {
                bfno = (bfno) bfcq4.f113412a.get(sb4);
            }
            if (bfno != null) {
                bfcq4.f113415d.incrementAndGet();
                bfno.f114497c = currentTimeMillis2;
                obj = bfno.f114495a;
            } else {
                obj = null;
            }
            if (obj == null) {
                this.f115469j.readLock().unlock();
                ClientContext clientContext = new ClientContext();
                clientContext.f30216f = "com.google.android.gms";
                if (str2 != null) {
                    clientContext.f30215e = str2;
                }
                bxvd da2 = bsze.f147803f.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bsze bsze = (bsze) da2.f164949b;
                bzrv2.getClass();
                bsze.f147806b = bzrv2;
                int i2 = bsze.f147805a | 1;
                bsze.f147805a = i2;
                if (str2 != null) {
                    str.getClass();
                    i2 |= 16;
                    bsze.f147805a = i2;
                    bsze.f147809e = str2;
                }
                bsze.f147805a = i2 | 8;
                bsze.f147808d = max;
                String locale3 = locale.toString();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bsze bsze2 = (bsze) da2.f164949b;
                locale3.getClass();
                bsze2.f147805a |= 4;
                bsze2.f147807c = locale3;
                bfvx bfvx = new bfvx(this, (bsze) da2.mo74062i(), clientContext);
                try {
                    this.f115473n.mo25812a(bfvx).get(cewm.m138366d(), TimeUnit.MILLISECONDS);
                    Throwable th2 = bfvx.f115456b;
                    if (th2 == null) {
                        m98017a(bfvx.f115455a, list, max, locale, str);
                        this.f115469j.writeLock().lock();
                        try {
                            bfcq bfcq5 = this.f115465f;
                            long currentTimeMillis3 = System.currentTimeMillis();
                            bmxy.m108582a(sb4, "Key cannot be null.");
                            bfno bfno3 = new bfno(list2, currentTimeMillis3);
                            synchronized (bfcq5.f113412a) {
                                bfcq5.f113412a.put(sb4, bfno3);
                            }
                            this.f115469j.writeLock().unlock();
                        } catch (Throwable th3) {
                            this.f115469j.writeLock().unlock();
                            throw th3;
                        }
                    } else {
                        throw new IOException("grpc failed", th2);
                    }
                } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
                    throw new IOException("grpc failed", e);
                }
            } else {
                list2.addAll(obj);
                this.f115469j.readLock().unlock();
            }
        } catch (Throwable th4) {
            this.f115469j.readLock().unlock();
            throw th4;
        }
    }

    /* renamed from: a */
    public final void mo62335a(Locale locale, String str, String str2, double d, double d2, double d3, double d4, int i, List list) {
        String str3 = str;
        String str4 = str2;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(str2).length());
        sb.append("Forward Geocode from ");
        sb.append(str);
        sb.append(" for ");
        sb.append(str2);
        sb.toString();
        int max = Math.max(0, Math.min(30, i));
        ClientContext clientContext = new ClientContext();
        clientContext.f30216f = "com.google.android.gms";
        if (str3 != null) {
            clientContext.f30215e = str3;
        }
        bxvd da = bszd.f147794h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bszd bszd = (bszd) da.f164949b;
        str2.getClass();
        bszd.f147796a |= 1;
        bszd.f147797b = str4;
        String locale2 = locale.toString();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bszd bszd2 = (bszd) da.f164949b;
        locale2.getClass();
        int i2 = bszd2.f147796a | 8;
        bszd2.f147796a = i2;
        bszd2.f147800e = locale2;
        if (str3 != null) {
            str.getClass();
            i2 |= 64;
            bszd2.f147796a = i2;
            bszd2.f147802g = str3;
        }
        bszd2.f147796a = i2 | 32;
        bszd2.f147801f = max;
        bxvd da2 = bzrv.f171206c.mo74144da();
        bxvd da3 = bzrv.f171206c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bzrv bzrv = (bzrv) da2.f164949b;
        bzrv.f171208a = d3;
        bzrv.f171209b = d4;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bszd bszd3 = (bszd) da.f164949b;
        bzrv bzrv2 = (bzrv) da2.mo74062i();
        bzrv2.getClass();
        bszd3.f147799d = bzrv2;
        bszd3.f147796a |= 4;
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bzrv bzrv3 = (bzrv) da3.f164949b;
        bzrv3.f171208a = d;
        bzrv3.f171209b = d2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bszd bszd4 = (bszd) da.f164949b;
        bzrv bzrv4 = (bzrv) da3.mo74062i();
        bzrv4.getClass();
        bszd4.f147798c = bzrv4;
        bszd4.f147796a |= 2;
        bfvw bfvw = new bfvw(this, (bszd) da.mo74062i(), clientContext);
        try {
            this.f115473n.mo25812a(bfvw).get(cewm.m138366d(), TimeUnit.MILLISECONDS);
            Throwable th = bfvw.f115451b;
            if (th == null) {
                m98017a(bfvw.f115450a, list, max, locale, str);
                return;
            }
            throw new IOException("grpc failed", th);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            throw new IOException("grpc failed", e);
        }
    }
}
