package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: aqbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqbt {

    /* renamed from: a */
    public Map f85606a = new HashMap();

    /* renamed from: b */
    public apgv f85607b;

    /* renamed from: c */
    public final ReadWriteLock f85608c = new ReentrantReadWriteLock();

    /* renamed from: d */
    public byte[] f85609d;

    /* renamed from: e */
    private byte[] f85610e;

    /* renamed from: f */
    private final int f85611f;

    static {
        aqbt.class.getSimpleName();
    }

    public aqbt(int i) {
        this.f85611f = i;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo47745a(Set set) {
        int i;
        this.f85608c.readLock().lock();
        try {
            HashMap hashMap = new HashMap(this.f85606a);
            apgv apgv = this.f85607b;
            if (apgv != null) {
                apgu apgu = new apgu(apgv);
                while (true) {
                    int[] iArr = apgu.f84349b.f84350a;
                    if (iArr == null || (i = apgu.f84348a) >= iArr.length) {
                        break;
                    }
                    long a = apgv.m70255a((long) iArr[i]);
                    apgu.f84348a++;
                    byte[] bArr = new byte[4];
                    bArr[3] = (byte) ((int) (255 & a));
                    bArr[2] = (byte) ((int) ((65280 & a) >>> 8));
                    bArr[1] = (byte) ((int) ((16711680 & a) >>> 16));
                    bArr[0] = (byte) ((int) ((a & -16777216) >>> 24));
                    hashMap.put(new apgr(bArr), null);
                }
            }
            this.f85608c.readLock().unlock();
            HashSet<apgr> hashSet = new HashSet();
            for (Map.Entry entry : hashMap.entrySet()) {
                List list = (List) entry.getValue();
                if (list == null || list.isEmpty()) {
                    apgr apgr = (apgr) entry.getKey();
                    set.add(apgr);
                    if (apgr.mo47192a() > 4) {
                        hashSet.add(apgr);
                    }
                }
            }
            for (apgr apgr2 : hashSet) {
                set.remove(apgr2.mo47194b());
            }
        } catch (Throwable th) {
            this.f85608c.readLock().unlock();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo47748b() {
        this.f85608c.writeLock().lock();
        try {
            this.f85607b = null;
        } finally {
            this.f85608c.writeLock().unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo47746a(List list, Queue queue, byte[] bArr, byte[] bArr2, boolean z) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0) {
            return false;
        }
        TreeSet treeSet = new TreeSet(new apgq());
        if (!z) {
            try {
                mo47745a(treeSet);
            } catch (OutOfMemoryError e) {
                return false;
            }
        }
        if (queue != null) {
            Iterator it = treeSet.iterator();
            int i = 0;
            while (it.hasNext() && !queue.isEmpty()) {
                apgr apgr = (apgr) it.next();
                if (i == ((Integer) queue.peek()).intValue()) {
                    it.remove();
                    queue.remove();
                }
                i++;
            }
        }
        if (list != null && !list.isEmpty()) {
            try {
                treeSet.addAll(list);
            } catch (OutOfMemoryError e2) {
                return false;
            }
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            Iterator it2 = treeSet.iterator();
            while (it2.hasNext()) {
                instance.update(((apgr) it2.next()).f84346a);
            }
            if (!Arrays.equals(instance.digest(), bArr)) {
                return false;
            }
            apgv apgv = new apgv(this.f85611f, treeSet);
            HashMap hashMap = new HashMap();
            Iterator it3 = treeSet.iterator();
            while (it3.hasNext()) {
                apgr apgr2 = (apgr) it3.next();
                if (apgr2.mo47192a() != 4) {
                    hashMap.put(apgr2, null);
                    apgr b = apgr2.mo47194b();
                    if (hashMap.containsKey(b)) {
                        List list2 = (List) hashMap.get(b);
                        if (list2 == null) {
                            return false;
                        }
                        list2.add(apgr2);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(apgr2);
                        hashMap.put(b, arrayList);
                    }
                }
            }
            treeSet.clear();
            this.f85608c.writeLock().lock();
            try {
                this.f85606a.clear();
                this.f85606a = hashMap;
                this.f85607b = apgv;
                this.f85609d = bArr;
                this.f85610e = bArr2;
                this.f85608c.writeLock().unlock();
                return true;
            } catch (Throwable th) {
                this.f85608c.writeLock().unlock();
                throw th;
            }
        } catch (NoSuchAlgorithmException e3) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final byte[] mo47747a() {
        this.f85608c.readLock().lock();
        try {
            return this.f85610e;
        } finally {
            this.f85608c.readLock().unlock();
        }
    }
}
