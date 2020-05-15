package p000;

import android.os.Build;
import android.util.SparseArray;
import com.google.android.gms.leveldb.WriteBatch;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: adjm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adjm implements adjl {

    /* renamed from: h */
    private static final Comparator f61917h = bqcv.f140491b;

    /* renamed from: a */
    final adfc f61918a;

    /* renamed from: b */
    final adfc f61919b;

    /* renamed from: c */
    final adfc f61920c;

    /* renamed from: d */
    final adfc f61921d;

    /* renamed from: e */
    final adfc f61922e;

    /* renamed from: f */
    final adfc f61923f;

    /* renamed from: g */
    public adje f61924g;

    /* renamed from: i */
    private final adfs f61925i = new adfs("HashPrefixDataStore");

    /* renamed from: j */
    private final adha f61926j;

    public adjm(adha adha, adfd adfd) {
        this.f61926j = adha;
        this.f61921d = adfd.mo33415b("HashPrefixFilterImpl.IncrementalDigestWithoutDomainsMissing");
        this.f61922e = adfd.mo33415b("HashPrefixFilterImpl.IncrementalExtraDigestWithoutDomainsExists");
        this.f61923f = adfd.mo33415b("HashPrefixFilterImpl.IncrementalDigestWithoutDomainsMismatchesFound");
        this.f61918a = adfd.mo33415b("HashPrefixFilterImpl.IncrementalDigestWithDomainsMissing");
        this.f61919b = adfd.mo33415b("HashPrefixFilterImpl.IncrementalExtraDigestWithDomainsExists");
        this.f61920c = adfd.mo33415b("HashPrefixFilterImpl.IncrementalDigestWithDomainsMismatchesFound");
    }

    /* renamed from: a */
    private static final Set m50651a(Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(adla.m50783a(adjk.m50643b((String) it.next()))));
        }
        return hashSet;
    }

    /* renamed from: b */
    private static final SparseArray m50654b(Collection collection) {
        SparseArray sparseArray = new SparseArray(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int a = adla.m50783a(adjk.m50643b(str));
            List list = (List) sparseArray.get(a);
            if (list == null) {
                list = new ArrayList();
                sparseArray.put(a, list);
            }
            list.add(str);
        }
        return sparseArray;
    }

    /* renamed from: a */
    private static final void m50652a(adfc adfc, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            adfc.mo33410a();
        }
    }

    /* renamed from: a */
    private static final void m50653a(WriteBatch writeBatch, byte[] bArr, Collection collection) {
        bxvd da = adit.f61842b.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        adit adit = (adit) da.f164949b;
        if (!adit.f61844a.mo73666a()) {
            adit.f61844a = GeneratedMessageLite.m124021a(adit.f61844a);
        }
        bxsy.m123078a(collection, adit.f61844a);
        writeBatch.put(bArr, ((adit) da.mo74062i()).serializeToBytes());
    }

    /* renamed from: b */
    static byte[] m50655b(int i) {
        return ByteBuffer.allocate(4).putInt(i).array();
    }

    /* renamed from: b */
    public final void mo33586b(Collection collection, Collection collection2) {
        Set a = m50651a(collection);
        C1225nr nrVar = new C1225nr();
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            Integer valueOf = Integer.valueOf(((Integer) it.next()).intValue());
            if (!a.contains(valueOf)) {
                nrVar.add(valueOf);
            }
        }
        mo33584a(collection, bngx.m109376e(), bngx.m109376e(), nrVar);
    }

    /* renamed from: a */
    public final bmxv mo33587a(int i) {
        if (this.f61926j.mo33513a()) {
            byte[] a = this.f61926j.mo33514a(m50655b(i));
            return a != null ? bmxv.m108566b(mo33588a(a)) : bmvz.f131120a;
        }
        throw new IOException("Hash Prefix dataStore was null!");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Set mo33588a(byte[] bArr) {
        try {
            return new C1225nr(((adit) GeneratedMessageLite.m124016a(adit.f61842b, bArr, bxus.m123743b())).f61844a);
        } catch (bxwf e) {
            this.f61925i.mo33425a(e, "Failed to parse the domain list!", new Object[0]);
            return bnon.f131923a;
        }
    }

    /* renamed from: a */
    public final void mo33582a(PrintWriter printWriter) {
        if (!this.f61926j.mo33513a()) {
            printWriter.printf("\t\tHashPrefixDatastore initialization failed!\n", new Object[0]);
        } else if (this.f61924g == null) {
            printWriter.printf("\t\tDomainFilter registration failed!\n", new Object[0]);
        } else {
            adgy c = this.f61926j.mo33517c();
            try {
                c.mo33504c();
                int i = 0;
                while (c.mo33507e()) {
                    i++;
                    c.mo33506d();
                }
                printWriter.printf("\t\tHash prefix count: %d\n", Integer.valueOf(i));
            } catch (Exception e) {
                printWriter.printf("\t\tHash prefix count failed.\n", new Object[0]);
            } catch (Throwable th) {
                c.close();
                throw th;
            }
            c.close();
        }
    }

    /* renamed from: a */
    public final void mo33583a(Collection collection, Collection collection2) {
        int i = Build.VERSION.SDK_INT;
        if (this.f61926j.mo33513a()) {
            SparseArray b = m50654b(collection);
            TreeSet treeSet = new TreeSet(f61917h);
            adgy c = this.f61926j.mo33517c();
            try {
                c.mo33504c();
                while (c.mo33507e()) {
                    treeSet.add(c.mo33502a());
                    c.mo33506d();
                }
                if (c != null) {
                    c.close();
                }
                WriteBatch create = WriteBatch.create();
                try {
                    int size = b.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] b2 = m50655b(b.keyAt(i2));
                        m50653a(create, b2, (Collection) b.valueAt(i2));
                        treeSet.remove(b2);
                    }
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        byte[] b3 = m50655b(((Integer) it.next()).intValue());
                        m50653a(create, b3, bngx.m109376e());
                        treeSet.remove(b3);
                    }
                    Iterator it2 = treeSet.iterator();
                    while (it2.hasNext()) {
                        create.delete((byte[]) it2.next());
                    }
                    this.f61926j.mo33510a(create);
                    create.close();
                    return;
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            } catch (Throwable th2) {
                bqye.m113761a(th, th2);
            }
        } else {
            throw new IOException("Hash Prefix dataStore was null!");
        }
        throw th;
        throw th;
    }

    /* renamed from: a */
    public final void mo33584a(Collection collection, Collection collection2, Collection collection3, Collection collection4) {
        int i = Build.VERSION.SDK_INT;
        if (this.f61926j.mo33513a()) {
            SparseArray b = m50654b(collection);
            Set<Integer> a = m50651a(collection2);
            WriteBatch create = WriteBatch.create();
            try {
                for (Integer num : a) {
                    create.delete(m50655b(num.intValue()));
                }
                Iterator it = collection4.iterator();
                while (it.hasNext()) {
                    create.delete(m50655b(((Integer) it.next()).intValue()));
                }
                int size = b.size();
                for (int i2 = 0; i2 < size; i2++) {
                    m50653a(create, m50655b(b.keyAt(i2)), (Collection) b.valueAt(i2));
                }
                Iterator it2 = collection3.iterator();
                while (it2.hasNext()) {
                    m50653a(create, m50655b(((Integer) it2.next()).intValue()), bngx.m109376e());
                }
                this.f61926j.mo33510a(create);
                create.close();
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            throw new IOException("Hash Prefix dataStore was null!");
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo33585a(Collection collection, Collection collection2, Collection collection3, Collection collection4, Collection collection5, Collection collection6) {
        int i = Build.VERSION.SDK_INT;
        if (this.f61926j.mo33513a()) {
            HashSet hashSet = new HashSet(collection4);
            Set a = m50651a(collection);
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            adgy c = this.f61926j.mo33517c();
            try {
                c.mo33504c();
                while (c.mo33507e()) {
                    int i2 = ByteBuffer.wrap(c.mo33502a()).getInt();
                    if (!mo33588a(c.mo33503b()).isEmpty()) {
                        hashSet3.add(Integer.valueOf(i2));
                    } else {
                        hashSet2.add(Integer.valueOf(i2));
                    }
                    c.mo33506d();
                }
                if (c != null) {
                    c.close();
                }
                hashSet2.removeAll(collection6);
                hashSet2.addAll(collection5);
                hashSet3.removeAll(m50651a(collection3));
                hashSet3.addAll(m50651a(collection2));
                int size = rsr.m34361b(hashSet, hashSet2).size();
                int size2 = rsr.m34361b(hashSet2, hashSet).size();
                m50652a(this.f61921d, size);
                m50652a(this.f61922e, size2);
                if (size > 0 || size2 > 0) {
                    this.f61923f.mo33410a();
                }
                int size3 = rsr.m34361b(a, hashSet3).size();
                int size4 = rsr.m34361b(hashSet3, a).size();
                m50652a(this.f61918a, size3);
                m50652a(this.f61919b, size4);
                if (size3 > 0 || size4 > 0) {
                    this.f61920c.mo33410a();
                }
                mo33583a(collection, collection4);
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            throw new IOException("Hash Prefix dataStore was null!");
        }
        throw th;
    }
}
