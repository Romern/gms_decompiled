package p000;

import android.os.BadParcelableException;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: apka */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apka {
    /* renamed from: a */
    public static int m70503a(int i) {
        if (i != 0) {
            return i != 1 ? 2 : 4;
        }
        return 3;
    }

    /* renamed from: b */
    public static int m70508b(int i) {
        return i != 1 ? 2 : 3;
    }

    /* renamed from: c */
    public static int m70509c(int i) {
        return i != 1 ? 1 : 2;
    }

    /* renamed from: d */
    public static int m70510d(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 4) {
            return 9;
        }
        if (i != 8) {
            if (i == 32) {
                return 11;
            }
            if (i == 64) {
                return 13;
            }
            if (i == 256) {
                return 12;
            }
            if (i != 512) {
                if (i != 1024) {
                    return i != 2048 ? 1 : 7;
                }
                return 10;
            }
        }
        return 8;
    }

    /* renamed from: e */
    public static int m70511e(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 2 ? 1 : 3;
        }
        return 4;
    }

    /* renamed from: a */
    public static aaos m70504a(int i, int i2) {
        bxvd da = aaos.f28714d.mo74144da();
        String valueOf = String.valueOf(i2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aaos aaos = (aaos) da.f164949b;
        valueOf.getClass();
        int i3 = 2;
        int i4 = aaos.f28716a | 2;
        aaos.f28716a = i4;
        aaos.f28718c = valueOf;
        if (i != 1) {
            i3 = i != 2 ? i != 4 ? i != 8 ? i != 16 ? 1 : 6 : 5 : 4 : 3;
        }
        aaos.f28717b = i3 - 1;
        aaos.f28716a = i4 | 1;
        return (aaos) da.mo74062i();
    }

    /* renamed from: a */
    public static aapj m70505a(apid apid) {
        bxvd da = aapj.f28776e.mo74144da();
        Bundle bundle = apid.f84444n.f63120m;
        boolean z = true;
        if (bundle == null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aapj aapj = (aapj) da.f164949b;
            int i = aapj.f28778a | 4;
            aapj.f28778a = i;
            aapj.f28781d = true;
            int i2 = 1 | i;
            aapj.f28778a = i2;
            aapj.f28779b = 0;
            aapj.f28778a = i2 | 2;
            aapj.f28780c = 0;
            return (aapj) da.mo74062i();
        }
        try {
            Bundle bundle2 = new Bundle(bundle);
            long c = (long) aeca.m51622c(bundle2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aapj aapj2 = (aapj) da.f164949b;
            aapj2.f28778a |= 2;
            aapj2.f28780c = c;
            long size = (long) bundle2.size();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aapj aapj3 = (aapj) da.f164949b;
            aapj3.f28778a |= 1;
            aapj3.f28779b = size;
            try {
                aeca.m51621b(bundle2);
            } catch (IllegalArgumentException e) {
                z = false;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aapj aapj4 = (aapj) da.f164949b;
            aapj4.f28778a |= 4;
            aapj4.f28781d = z;
        } catch (BadParcelableException e2) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aapj aapj5 = (aapj) da.f164949b;
            aapj5.f28778a |= 4;
            aapj5.f28781d = false;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof ClassNotFoundException) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                aapj aapj6 = (aapj) da.f164949b;
                aapj6.f28778a |= 4;
                aapj6.f28781d = false;
            } else {
                throw e3;
            }
        }
        return (aapj) da.mo74062i();
    }

    /* renamed from: a */
    public static aapp m70506a(long j, long j2) {
        bxvd da = aapp.f28818e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aapp aapp = (aapp) da.f164949b;
        aapp.f28823d = 2;
        aapp.f28820a |= 1;
        bxvd da2 = aapi.f28771d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        aapi aapi = (aapi) da2.f164949b;
        int i = aapi.f28773a | 1;
        aapi.f28773a = i;
        aapi.f28774b = j;
        aapi.f28773a = i | 2;
        aapi.f28775c = j2;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aapp aapp2 = (aapp) da.f164949b;
        aapi aapi2 = (aapi) da2.mo74062i();
        aapi2.getClass();
        aapp2.f28822c = aapi2;
        aapp2.f28821b = 2;
        return (aapp) da.mo74062i();
    }

    /* renamed from: a */
    public static synchronized List m70507a(Iterable iterable) {
        ArrayList arrayList;
        synchronized (apka.class) {
            C1223np npVar = new C1223np();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                apid apid = (apid) it.next();
                bxvd bxvd = (bxvd) npVar.get(Integer.valueOf((int) apid.f84431a.f28809e));
                if (bxvd == null) {
                    bxvd = aapv.f28840e.mo74144da();
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    aapv aapv = (aapv) bxvd.f164949b;
                    int i = aapv.f28842a | 4;
                    aapv.f28842a = i;
                    aapv.f28845d = 0;
                    int i2 = i | 2;
                    aapv.f28842a = i2;
                    aapv.f28844c = 0;
                    aapm aapm = apid.f84431a;
                    long j = aapm.f28809e;
                    aapv.f28842a = i2 | 1;
                    aapv.f28843b = (long) ((int) j);
                    npVar.put(Integer.valueOf((int) aapm.f28809e), bxvd);
                }
                if (!apid.mo47278o()) {
                    long j2 = ((aapv) bxvd.f164949b).f28844c + 1;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    aapv aapv2 = (aapv) bxvd.f164949b;
                    aapv aapv3 = aapv.f28840e;
                    aapv2.f28842a |= 2;
                    aapv2.f28844c = j2;
                } else {
                    long j3 = ((aapv) bxvd.f164949b).f28845d + 1;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    aapv aapv4 = (aapv) bxvd.f164949b;
                    aapv aapv5 = aapv.f28840e;
                    aapv4.f28842a |= 4;
                    aapv4.f28845d = j3;
                }
            }
            arrayList = new ArrayList(npVar.f26809h);
            for (bxvd bxvd2 : npVar.values()) {
                arrayList.add((aapv) bxvd2.mo74062i());
            }
        }
        return arrayList;
    }
}
