package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.usagereporting.ConsentInformation;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: avvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avvl {

    /* renamed from: a */
    protected static bdtr f93980a;

    /* renamed from: c */
    private static final int[] f93981c = {7, 9, 8, 10};

    /* renamed from: d */
    private static final UdcCacheRequest f93982d = new UdcCacheRequest(f93981c);

    /* renamed from: b */
    public final avvn f93983b;

    /* renamed from: e */
    private final bqgj f93984e = new soc(1, 10);

    public avvl(avvn avvn) {
        this.f93983b = avvn;
    }

    /* renamed from: a */
    public static final void m79431a(Map map, bymg bymg, avup avup) {
        boolean z;
        HashMap hashMap = new HashMap();
        ArrayDeque arrayDeque = new ArrayDeque(bymg.f167022a);
        boolean z2 = true;
        boolean z3 = false;
        while (!arrayDeque.isEmpty()) {
            bymf bymf = (bymf) arrayDeque.remove();
            Iterator it = map.entrySet().iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Set hashSet = hashMap.containsKey(entry.getKey()) ? (Set) hashMap.get(entry.getKey()) : new HashSet();
                bxwc bxwc = bymf.f167017b;
                int size = bxwc.size();
                int i = 0;
                while (i < size) {
                    byme byme = (byme) bxwc.get(i);
                    calo calo = (calo) entry.getValue();
                    calo calo2 = byme.f167011a;
                    if (calo2 == null) {
                        calo2 = calo.f175155l;
                    }
                    int a = caln.m126760a(calo2.f175158b);
                    Iterator it2 = it;
                    if (a == 0 || a != 4) {
                        int a2 = caln.m126760a(calo2.f175158b);
                        if (a2 == 0) {
                            a2 = 1;
                        }
                        int a3 = caln.m126760a(calo.f175158b);
                        if (a3 == 0) {
                            a3 = 1;
                        }
                        if (a2 != a3) {
                            i++;
                            it = it2;
                        }
                    }
                    int a4 = caln.m126760a(calo2.f175159c);
                    if (a4 == 0 || a4 != 4) {
                        int a5 = caln.m126760a(calo2.f175159c);
                        if (a5 == 0) {
                            a5 = 1;
                        }
                        int a6 = caln.m126760a(calo.f175159c);
                        if (a6 == 0) {
                            a6 = 1;
                        }
                        if (a5 != a6) {
                            i++;
                            it = it2;
                        }
                    }
                    int a7 = caln.m126760a(calo2.f175160d);
                    if (a7 == 0 || a7 != 4) {
                        int a8 = caln.m126760a(calo2.f175160d);
                        if (a8 == 0) {
                            a8 = 1;
                        }
                        int a9 = caln.m126760a(calo.f175160d);
                        if (a9 == 0) {
                            a9 = 1;
                        }
                        if (a8 != a9) {
                            i++;
                            it = it2;
                        }
                    }
                    int a10 = caln.m126760a(calo2.f175161e);
                    if (a10 == 0 || a10 != 4) {
                        int a11 = caln.m126760a(calo2.f175161e);
                        if (a11 == 0) {
                            a11 = 1;
                        }
                        int a12 = caln.m126760a(calo.f175161e);
                        if (a12 == 0) {
                            a12 = 1;
                        }
                        if (a11 != a12) {
                            i++;
                            it = it2;
                        }
                    }
                    int a13 = caln.m126760a(calo2.f175162f);
                    if (a13 == 0 || a13 != 4) {
                        int a14 = caln.m126760a(calo2.f175162f);
                        if (a14 == 0) {
                            a14 = 1;
                        }
                        int a15 = caln.m126760a(calo.f175162f);
                        if (a15 == 0) {
                            a15 = 1;
                        }
                        if (a14 != a15) {
                            i++;
                            it = it2;
                        }
                    }
                    int a16 = caln.m126760a(calo2.f175163g);
                    if (a16 == 0 || a16 != 4) {
                        int a17 = caln.m126760a(calo2.f175163g);
                        if (a17 == 0) {
                            a17 = 1;
                        }
                        int a18 = caln.m126760a(calo.f175163g);
                        if (a18 == 0) {
                            a18 = 1;
                        }
                        if (a17 != a18) {
                            i++;
                            it = it2;
                        }
                    }
                    int a19 = caln.m126760a(calo2.f175164h);
                    if (a19 == 0 || a19 != 4) {
                        int a20 = caln.m126760a(calo2.f175164h);
                        if (a20 == 0) {
                            a20 = 1;
                        }
                        int a21 = caln.m126760a(calo.f175164h);
                        if (a21 == 0) {
                            a21 = 1;
                        }
                        if (a20 != a21) {
                            i++;
                            it = it2;
                        }
                    }
                    int a22 = caln.m126760a(calo2.f175165i);
                    if (a22 == 0 || a22 != 4) {
                        int a23 = caln.m126760a(calo2.f175165i);
                        if (a23 == 0) {
                            a23 = 1;
                        }
                        int a24 = caln.m126760a(calo.f175165i);
                        if (a24 == 0) {
                            a24 = 1;
                        }
                        if (a23 != a24) {
                            i++;
                            it = it2;
                        }
                    }
                    int a25 = caln.m126760a(calo2.f175166j);
                    if (a25 == 0 || a25 != 4) {
                        int a26 = caln.m126760a(calo2.f175166j);
                        if (a26 == 0) {
                            a26 = 1;
                        }
                        int a27 = caln.m126760a(calo.f175166j);
                        if (a27 == 0) {
                            a27 = 1;
                        }
                        if (a26 != a27) {
                            i++;
                            it = it2;
                        }
                    }
                    int a28 = caln.m126760a(calo2.f175167k);
                    if (a28 == 0 || a28 != 4) {
                        int a29 = caln.m126760a(calo2.f175167k);
                        if (a29 == 0) {
                            a29 = 1;
                        }
                        int a30 = caln.m126760a(calo.f175167k);
                        if (a30 == 0) {
                            a30 = 1;
                        }
                        if (a29 != a30) {
                            i++;
                            it = it2;
                        }
                    }
                    bymk a31 = bymk.m124955a(byme.f167012b);
                    if (a31 == null) {
                        a31 = bymk.UNKNOWN;
                    }
                    hashSet.add(Integer.valueOf(a31.f167032d));
                    if (!hashMap.containsKey(entry.getKey())) {
                        hashMap.put((String) entry.getKey(), hashSet);
                    }
                    bymd bymd = bymf.f167016a;
                    if (bymd == null) {
                        bymd = bymd.f167004c;
                    }
                    z2 &= bymd.f167006a;
                    if (chdn.m148521b()) {
                        bymd bymd2 = bymf.f167016a;
                        if (bymd2 == null) {
                            bymd2 = bymd.f167004c;
                        }
                        z3 = bymd2.f167007b | z3;
                    }
                    z4 = true;
                    i++;
                    it = it2;
                }
            }
            if (!z4) {
                arrayDeque.addAll(bymf.f167018c);
            }
        }
        avts b = ConsentInformation.m93760b();
        if (!z2) {
            z = false;
        } else {
            z = true;
        }
        b.f93900a = z;
        if (chdn.m148521b()) {
            b.f93901b = z3;
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            calo calo3 = (calo) map.get(entry2.getKey());
            bngx a32 = bngx.m109368a((Collection) entry2.getValue());
            sdo.checkIfNull(calo3, "Account Consents proto cannot be null");
            b.mo51611a(new ConsentInformation.AccountConsentInformation((String) entry2.getKey(), calo3.serializeToBytes(), a32));
        }
        try {
            avup.mo51616a(Status.f30107a, !hashMap.isEmpty(), b.mo51610a());
        } catch (RemoteException e) {
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo51640a(Context context, bymg bymg, avup avup) {
        boolean z;
        int i;
        int i2;
        Context context2 = context;
        bymg bymg2 = bymg;
        avup avup2 = avup;
        sdo.m34971a(aytw.m84815b(context), (Object) "User is not unlocked.");
        avvn avvn = this.f93983b;
        bxvd da = calo.f175155l.mo74144da();
        synchronized (avvn.f93986a) {
            SharedPreferences b = avvn.mo51647b();
            rzz.m34727a(b, "Unexpected null from getPrefs.");
            int i3 = b.getInt("OptInGMSCoreVersion", -1);
            if (!avvn.m79438a(b)) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                calo calo = (calo) da.f164949b;
                calo.f175158b = 1;
                int i4 = calo.f175157a | 1;
                calo.f175157a = i4;
                calo.f175160d = 1;
                calo.f175157a = i4 | 4;
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                calo calo2 = (calo) da.f164949b;
                calo2.f175158b = 2;
                calo2.f175157a |= 1;
                if (((long) i3) < chdz.m148556c()) {
                    i2 = 2;
                } else {
                    i2 = 3;
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                calo calo3 = (calo) da.f164949b;
                calo3.f175160d = i2 - 1;
                calo3.f175157a |= 4;
            }
            int i5 = !b.getBoolean("CbFromSetupWizard", false) ? 2 : 3;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            calo calo4 = (calo) da.f164949b;
            calo4.f175167k = i5 - 1;
            calo4.f175157a |= 512;
        }
        int i6 = !chdz.f188510a.mo6606a().mo85160d() ? 2 : 3;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        calo calo5 = (calo) da.f164949b;
        calo5.f175165i = i6 - 1;
        calo5.f175157a |= 128;
        if (chdn.m148524e()) {
            int i7 = Build.VERSION.SDK_INT;
            int i8 = !avvm.m79435a(avvn.f93988c) ? 2 : 3;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            calo calo6 = (calo) da.f164949b;
            calo6.f175159c = i8 - 1;
            calo6.f175157a |= 2;
        }
        calo calo7 = (calo) da.mo74062i();
        HashMap hashMap = new HashMap();
        List<Account> d = soz.m35801d(context2, context.getPackageName());
        if (!d.isEmpty()) {
            bxvd bxvd = (bxvd) calo7.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) calo7);
            boolean a = chdt.f188503a.mo6606a().mo85152a();
            for (Account account : d) {
                if (!a) {
                    auzz.m78131a(context2, new auzy(account)).mo24689a(f93982d).mo50378a(this.f93984e, new avvk(this, account, bxvd, hashMap, d, bymg, avup));
                    bxvd = bxvd;
                    hashMap = hashMap;
                } else {
                    bxvd bxvd2 = bxvd;
                    HashMap hashMap2 = hashMap;
                    try {
                        if (f93980a == null) {
                            bdtt bdtt = new bdtt();
                            bdtt.mo58364a(context2);
                            bdtt.mo58366b("gmscoreusagereportingfacsid");
                            f93980a = bdtt.mo58363a();
                        }
                        bdtq b2 = f93980a.mo58362b(account);
                        boolean booleanValue = ((Boolean) b2.mo58355a(4).get(15, TimeUnit.SECONDS)).booleanValue();
                        boolean booleanValue2 = ((Boolean) b2.mo58355a(5).get(15, TimeUnit.SECONDS)).booleanValue();
                        if (!bxvd2.f164950c) {
                            z = false;
                        } else {
                            bxvd2.mo74035c();
                            z = false;
                            try {
                                bxvd2.f164950c = false;
                            } catch (ExecutionException | TimeoutException e) {
                                avup2.mo51616a(Status.f30109c, z, ConsentInformation.f109531a);
                                return;
                            } catch (InterruptedException e2) {
                                avup2.mo51616a(Status.f30109c, z, ConsentInformation.f109531a);
                                Thread.currentThread().interrupt();
                                return;
                            }
                        }
                        calo calo8 = (calo) bxvd2.f164949b;
                        int i9 = calo8.f175157a & -65;
                        calo8.f175157a = i9;
                        calo8.f175164h = z ? 1 : 0;
                        int i10 = i9 & -33;
                        calo8.f175157a = i10;
                        calo8.f175163g = z;
                        int i11 = i10 & -17;
                        calo8.f175157a = i11;
                        calo8.f175162f = z;
                        int i12 = i11 & -9;
                        calo8.f175157a = i12;
                        calo8.f175161e = z;
                        calo8.f175157a = i12 & -257;
                        calo8.f175166j = z;
                        int b3 = this.f93983b.mo51646b(account.name);
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = z;
                        }
                        calo calo9 = (calo) bxvd2.f164949b;
                        calo9.f175166j = b3 - 1;
                        int i13 = calo9.f175157a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                        calo9.f175157a = i13;
                        if (booleanValue) {
                            calo9.f175161e = 2;
                            int i14 = i13 | 8;
                            calo9.f175157a = i14;
                            calo9.f175162f = 2;
                            i = i14 | 16;
                            calo9.f175157a = i;
                        } else {
                            calo9.f175161e = 1;
                            int i15 = i13 | 8;
                            calo9.f175157a = i15;
                            calo9.f175162f = 1;
                            i = i15 | 16;
                            calo9.f175157a = i;
                        }
                        if (!booleanValue2) {
                            calo9.f175163g = 1;
                            int i16 = i | 32;
                            calo9.f175157a = i16;
                            calo9.f175164h = 1;
                            calo9.f175157a = i16 | 64;
                        } else {
                            calo9.f175163g = 2;
                            int i17 = i | 32;
                            calo9.f175157a = i17;
                            calo9.f175164h = 2;
                            calo9.f175157a = i17 | 64;
                        }
                        hashMap = hashMap2;
                        hashMap.put(account.name, (calo) bxvd2.mo74062i());
                        bxvd = bxvd2;
                    } catch (ExecutionException | TimeoutException e3) {
                        z = false;
                        avup2.mo51616a(Status.f30109c, z, ConsentInformation.f109531a);
                        return;
                    } catch (InterruptedException e4) {
                        z = false;
                        avup2.mo51616a(Status.f30109c, z, ConsentInformation.f109531a);
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
            if (a && hashMap.size() == d.size()) {
                m79431a(hashMap, bymg2, avup2);
                return;
            }
            return;
        }
        hashMap.put("", calo7);
        m79431a(hashMap, bymg2, avup2);
    }
}
