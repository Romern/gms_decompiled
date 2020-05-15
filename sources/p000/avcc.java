package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: avcc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avcc {

    /* renamed from: a */
    public final boolean f92944a;

    /* renamed from: b */
    public final avch f92945b;

    /* renamed from: c */
    private final avcd f92946c;

    /* renamed from: d */
    private final Set f92947d;

    public avcc(Context context, Account account) {
        HashSet hashSet = new HashSet();
        this.f92946c = new avcd(context, account);
        boolean c = chbe.m147973c();
        this.f92944a = c;
        if (c) {
            avch avch = new avch(context, account);
            this.f92945b = avch;
            hashSet.addAll(avch.mo51151a());
        } else {
            this.f92945b = null;
        }
        hashSet.addAll(this.f92946c.mo51144b());
        this.f92947d = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    static bxrq m78224a(int i) {
        bxvd da = bxrq.f164586f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxrq bxrq = (bxrq) da.f164949b;
        bxrq.f164590c = 2;
        int i2 = 2 | bxrq.f164588a;
        bxrq.f164588a = i2;
        bxrq.f164588a = i2 | 1;
        bxrq.f164589b = i;
        return (bxrq) da.mo74062i();
    }

    /* renamed from: c */
    private final List m78226c() {
        aucb aucb;
        long b = chbe.m147972b();
        try {
            avch avch = this.f92945b;
            if (!chbe.m147973c()) {
                aucb = aucu.m76777a((Exception) new IllegalStateException("LocationSettings is not enabled"));
            } else {
                aucb = avch.f92962b.mo24736c(avch.f92961a).mo50364a(avcf.f92957a);
            }
            return (List) aucu.m76783a(aucb, b, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            return bngx.m109376e();
        }
    }

    /* renamed from: b */
    public final bxsr mo51141b() {
        bxvd da = bxsr.f164725b.mo74144da();
        Set set = this.f92947d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxsr bxsr = (bxsr) da.f164949b;
        if (!bxsr.f164727a.mo73666a()) {
            bxsr.f164727a = GeneratedMessageLite.m124019a(bxsr.f164727a);
        }
        bxsy.m123078a(set, bxsr.f164727a);
        return (bxsr) da.mo74062i();
    }

    /* renamed from: a */
    private static List m78225a(Set set, List list, Set set2) {
        ArrayList arrayList = new ArrayList();
        HashSet<Integer> hashSet = new HashSet(set);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bxrq bxrq = (bxrq) it.next();
            if (set2.contains(Integer.valueOf(bxrq.f164589b)) && set.contains(Integer.valueOf(bxrq.f164589b))) {
                arrayList.add(bxrq);
                hashSet.remove(Integer.valueOf(bxrq.f164589b));
            }
        }
        for (Integer num : hashSet) {
            if (set2.contains(num)) {
                arrayList.add(m78224a(num.intValue()));
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avcc.a(boolean, java.util.Set):avcb
     arg types: [int, java.util.Set]
     candidates:
      avcc.a(bxsd[], java.lang.String):com.google.android.gms.common.api.Status
      avcc.a(boolean, java.util.Set):avcb */
    /* renamed from: a */
    public final avcb mo51137a() {
        return mo51138a(true, this.f92947d);
    }

    /* renamed from: a */
    public final avcb mo51138a(boolean z, Set<Integer> set) {
        if (set == null || set.isEmpty()) {
            set = this.f92947d;
        }
        ArrayList arrayList = new ArrayList();
        if (z && this.f92946c.mo51145c() && set != null && (set.contains(10) || set.contains(9))) {
            arrayList.addAll(m78225a(set, this.f92946c.mo51142a(), this.f92946c.mo51144b()));
        }
        if (this.f92944a && this.f92945b.mo51152a(set)) {
            arrayList.addAll(m78225a(set, m78226c(), this.f92945b.mo51151a()));
        }
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(Integer.valueOf(((bxrq) arrayList.get(i)).f164589b));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Integer num : set) {
            if (!hashSet.contains(num)) {
                arrayList2.add(m78224a(num.intValue()));
            }
        }
        arrayList.addAll(arrayList2);
        return new avcb(Status.f30107a, arrayList);
    }

    /* renamed from: a */
    public final Status mo51139a(bxsd[] bxsdArr, String str) {
        aucb aucb;
        long b = chbe.m147972b();
        try {
            avch avch = this.f92945b;
            if (!chbe.m147973c()) {
                aucb = aucu.m76777a((Exception) new IllegalStateException("LocationSettings is not enabled"));
            } else {
                boolean z = false;
                boolean z2 = false;
                for (bxsd bxsd : bxsdArr) {
                    if (bxsd.f164667b == 15) {
                        int a = bxsn.m123069a(bxsd.f164668c);
                        z = a != 0 && a == 3;
                    }
                    if (bxsd.f164667b == 2) {
                        int a2 = bxsn.m123069a(bxsd.f164668c);
                        z2 = a2 != 0 && a2 == 3;
                    }
                }
                if (!z) {
                    if (!z2) {
                        aucb = aucu.m76777a((Exception) new IllegalArgumentException("At least LR or LH must be requested"));
                    }
                }
                aucb = avch.f92962b.mo24736c(avch.f92961a).mo50364a(new avcg(avch, str));
            }
            aucu.m76783a(aucb, b, TimeUnit.MILLISECONDS);
            return Status.f30107a;
        } catch (ExecutionException e) {
            return Status.f30109c;
        } catch (InterruptedException e2) {
            return Status.f30108b;
        } catch (TimeoutException e3) {
            return Status.f30110d;
        }
    }

    /* renamed from: a */
    public final void mo51140a(bxsd[] bxsdArr) {
        this.f92946c.mo51143a(bxsdArr);
    }
}
