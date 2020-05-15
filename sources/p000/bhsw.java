package p000;

import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.leveldb.WriteBatch;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bhsw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhsw {

    /* renamed from: b */
    private static final byte[] f119504b = new byte[0];

    /* renamed from: a */
    private LevelDb f119505a;

    /* renamed from: c */
    private final C1231nx f119506c;

    /* renamed from: d */
    private final C1245ok f119507d;

    /* renamed from: e */
    private int f119508e = 0;

    /* renamed from: f */
    private int f119509f = 0;

    /* renamed from: g */
    private int f119510g = 0;

    /* renamed from: h */
    private int f119511h = 0;

    /* renamed from: i */
    private int f119512i = 0;

    /* renamed from: j */
    private int f119513j = 0;

    /* renamed from: k */
    private int f119514k = 0;

    /* renamed from: l */
    private int f119515l = 0;

    /* renamed from: m */
    private final int f119516m;

    /* renamed from: n */
    private final File f119517n;

    /* renamed from: o */
    private final bhsy f119518o;

    /* renamed from: p */
    private final AtomicLong f119519p;

    /* renamed from: q */
    private int f119520q;

    /* renamed from: r */
    private final bhwp f119521r;

    public bhsw(int i, int i2, File file, bhsy bhsy, bhwp bhwp) {
        this.f119516m = i;
        this.f119517n = file;
        this.f119518o = bhsy;
        this.f119506c = new C1231nx(i2);
        this.f119507d = new C1245ok();
        this.f119519p = new AtomicLong(System.currentTimeMillis());
        this.f119521r = bhwp;
    }

    /* renamed from: a */
    private final long m101483a(boolean z) {
        long andIncrement = this.f119519p.getAndIncrement();
        return z ? andIncrement + TimeUnit.DAYS.toMillis(15) : andIncrement;
    }

    /* renamed from: e */
    private final int m101486e() {
        FileOutputStream fileOutputStream;
        DataOutputStream dataOutputStream;
        this.f119517n.mkdirs();
        try {
            int i = this.f119516m;
            fileOutputStream = new FileOutputStream(new File(this.f119517n, "version"));
            dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeInt(i);
            m101484a(fileOutputStream);
            m101484a(dataOutputStream);
        } catch (IOException e) {
            this.f119521r.mo64360b("Failed to write version to disk");
        } catch (Throwable th) {
            m101484a(fileOutputStream);
            m101484a(dataOutputStream);
            throw th;
        }
        LevelDb.Options options = new LevelDb.Options();
        options.mCreateIfMissing = true;
        options.mDeleteIfCorrupted = true;
        options.mUseSnappy = false;
        try {
            this.f119505a = LevelDb.open(this.f119517n, options);
            int d = mo64246d();
            this.f119520q = d;
            return d;
        } catch (LevelDbException e2) {
            this.f119505a = null;
            this.f119521r.mo64359a("Failed to initiate LevelDb", e2);
            return -1;
        }
    }

    /* renamed from: f */
    private final boolean m101487f() {
        return this.f119505a != null;
    }

    /* renamed from: b */
    public final void mo64243b() {
        if (!m101487f()) {
            this.f119521r.mo64360b("Storage not started, ignoring stop");
            return;
        }
        this.f119506c.mo15548a();
        this.f119505a.close();
        this.f119505a = null;
    }

    /* renamed from: c */
    public final void mo64245c() {
        File[] listFiles;
        this.f119520q = 0;
        this.f119506c.mo15548a();
        boolean f = m101487f();
        if (f) {
            this.f119505a.close();
            this.f119505a = null;
        }
        try {
            LevelDb.destroy(this.f119517n);
            if (this.f119517n.exists() && (listFiles = this.f119517n.listFiles()) != null) {
                for (File file : listFiles) {
                    file.delete();
                }
            }
            if (f) {
                m101486e();
            }
        } catch (LevelDbException e) {
            this.f119521r.mo64359a("Failed to clear leveldb", e);
        }
    }

    /* renamed from: d */
    public final int mo64246d() {
        LevelDb.Iterator it = this.f119505a.iterator();
        it.seekToFirst();
        int i = 0;
        while (it.isValid()) {
            i++;
            it.next();
        }
        it.close();
        this.f119520q = i;
        return i;
    }

    /* renamed from: a */
    private static void m101484a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
        }
    }

    /* renamed from: b */
    public final void mo64244b(Set set) {
        this.f119508e += set.size();
        for (Object obj : set) {
            if (this.f119506c.mo15552b(obj) != null) {
                this.f119509f++;
            }
            this.f119507d.remove(obj);
        }
        if (m101487f()) {
            m101485a((Iterable) set);
        } else {
            this.f119521r.mo64360b("delete() called when leveldb is not active. Operating in memory only mode");
        }
        this.f119520q -= set.size();
    }

    /* renamed from: a */
    private final void m101485a(Iterable iterable) {
        WriteBatch create = WriteBatch.create();
        try {
            for (Object obj : iterable) {
                byte[] bArr = new byte[this.f119518o.mo64249a(obj)];
                this.f119518o.mo64251a(obj, bxuk.m123637a(bArr));
                create.delete(bArr);
            }
            this.f119505a.write(create);
        } catch (IOException e) {
            this.f119521r.mo64359a("Failed to persist delete to leveldb", e);
        } catch (Throwable th) {
            create.close();
            throw th;
        }
        create.close();
    }

    /* renamed from: a */
    public final int mo64238a() {
        FileInputStream fileInputStream;
        DataInputStream dataInputStream;
        if (m101487f()) {
            this.f119521r.mo64360b("Storage already started, ignoring start");
            return -1;
        }
        try {
            int i = this.f119516m;
            fileInputStream = new FileInputStream(new File(this.f119517n, "version"));
            dataInputStream = new DataInputStream(fileInputStream);
            int readInt = dataInputStream.readInt();
            m101484a(fileInputStream);
            m101484a(dataInputStream);
            if (i != readInt) {
                mo64245c();
            }
        } catch (IOException e) {
        } catch (Throwable th) {
            m101484a(fileInputStream);
            m101484a(dataInputStream);
            throw th;
        }
        return m101486e();
    }

    /* renamed from: a */
    public final int mo64239a(Map map, boolean z) {
        return mo64240a(map, z, true);
    }

    /* renamed from: a */
    public final int mo64240a(Map map, boolean z, boolean z2) {
        this.f119511h += map.size();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            this.f119506c.mo15547a(key, entry.getValue());
            this.f119507d.put(key, Long.valueOf(m101483a(z)));
        }
        if (!m101487f()) {
            this.f119521r.mo64360b("put() called when leveldb is not active. Operating in memory only mode");
        } else {
            WriteBatch create = WriteBatch.create();
            if (z2) {
                try {
                    byte[] bArr = new byte[AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT];
                    bxuk a = bxuk.m123637a(bArr);
                    for (Map.Entry entry2 : map.entrySet()) {
                        Object key2 = entry2.getKey();
                        Object value = entry2.getValue();
                        int b = this.f119518o.mo64252b(value) + 8;
                        byte[] bArr2 = new byte[b];
                        int a2 = this.f119518o.mo64249a(key2);
                        byte[] bArr3 = new byte[a2];
                        int i = a2 + b + 11;
                        this.f119518o.mo64251a(key2, bxuk.m123637a(bArr3));
                        bxuk a3 = bxuk.m123637a(bArr2);
                        a3.mo73857d(((Long) this.f119507d.get(key2)).longValue());
                        this.f119518o.mo64254b(value, a3);
                        if (b <= 15000) {
                            if (a.mo73827a() <= i) {
                                a.mo73872g(0);
                                create.bufferedPut(f119504b, bArr);
                                a = bxuk.m123637a(bArr);
                            }
                            a.mo73867c(bArr2);
                            a.mo73865b(bArr3);
                        } else {
                            create.put(bArr3, bArr2);
                        }
                    }
                    a.mo73872g(0);
                    create.bufferedPut(f119504b, bArr);
                } catch (IOException e) {
                    this.f119521r.mo64359a("failed to write data to leveldb", e);
                } catch (Throwable th) {
                    create.close();
                    throw th;
                }
            } else {
                for (Map.Entry entry3 : map.entrySet()) {
                    Object key3 = entry3.getKey();
                    Object value2 = entry3.getValue();
                    byte[] bArr4 = new byte[(this.f119518o.mo64252b(value2) + 8)];
                    byte[] bArr5 = new byte[this.f119518o.mo64249a(key3)];
                    this.f119518o.mo64251a(key3, bxuk.m123637a(bArr5));
                    bxuk a4 = bxuk.m123637a(bArr4);
                    a4.mo73857d(((Long) this.f119507d.get(key3)).longValue());
                    this.f119518o.mo64254b(value2, a4);
                    create.put(bArr5, bArr4);
                }
            }
            this.f119505a.write(create);
            create.close();
        }
        int size = this.f119520q + map.size();
        this.f119520q = size;
        return size;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* renamed from: a */
    public final bhsz mo64241a(float f) {
        C1223np npVar;
        HashMap hashMap = new HashMap();
        if (!m101487f()) {
            this.f119521r.mo64360b("freeDiskSpace() called when leveldb is not active. Operating in memory only mode");
            npVar = this.f119506c.mo15553b();
        } else {
            C1223np npVar2 = new C1223np();
            LevelDb.Iterator it = this.f119505a.iterator();
            try {
                it.seekToFirst();
                while (it.isValid()) {
                    bxuc a = bxuc.m123419a(it.value());
                    long g = a.mo73798g();
                    Object a2 = this.f119518o.mo64250a(bxuc.m123419a(it.key()));
                    npVar2.put(a2, this.f119518o.mo64253b(a));
                    Long l = (Long) this.f119507d.get(a2);
                    if (l != null) {
                        if (l.longValue() >= g) {
                            it.next();
                        }
                    }
                    this.f119507d.put(a2, Long.valueOf(g));
                    it.next();
                }
            } catch (IOException e) {
                this.f119521r.mo64359a("failed to load data from leveldb", e);
            } catch (Throwable th) {
                it.close();
                throw th;
            }
            it.close();
            npVar = npVar2;
        }
        TreeMap treeMap = new TreeMap();
        int i = 0;
        while (true) {
            C1245ok okVar = this.f119507d;
            if (i >= okVar.f26809h) {
                break;
            }
            treeMap.put((Long) this.f119507d.mo15621c(i), okVar.mo15620b(i));
            i++;
        }
        int size = (int) (f * ((float) npVar.size()));
        for (Object obj : treeMap.values()) {
            if (size <= 0) {
                break;
            }
            size--;
            Object remove = npVar.remove(obj);
            this.f119506c.mo15552b(obj);
            if (remove != null) {
                this.f119507d.remove(obj);
                hashMap.put(obj, remove);
            } else {
                this.f119521r.mo64360b("Failed to delete from disk, removing from memory only");
            }
        }
        if (m101487f()) {
            m101485a((Iterable) hashMap.keySet());
        }
        this.f119520q = npVar.size();
        return new bhsz(npVar.values(), hashMap.values());
    }

    /* renamed from: a */
    public final bhtq mo64242a(Set set) {
        this.f119510g += set.size();
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Object a = this.f119506c.mo15546a(next);
            if (a != null) {
                this.f119512i++;
                hashMap.put(next, a);
                if (((Long) this.f119507d.get(next)).longValue() > this.f119519p.get()) {
                    z = true;
                }
                this.f119507d.put(next, Long.valueOf(m101483a(z)));
            } else {
                this.f119513j++;
                hashSet.add(next);
            }
        }
        if (m101487f()) {
            try {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    byte[] bArr = new byte[this.f119518o.mo64249a(next2)];
                    this.f119518o.mo64251a(next2, bxuk.m123637a(bArr));
                    byte[] bArr2 = this.f119505a.get(bArr);
                    if (bArr2 != null) {
                        it2.remove();
                        this.f119514k++;
                        bxuc a2 = bxuc.m123419a(bArr2);
                        boolean z2 = a2.mo73798g() > this.f119519p.get();
                        Object b = this.f119518o.mo64253b(a2);
                        hashMap.put(next2, b);
                        this.f119506c.mo15547a(next2, b);
                        this.f119507d.put(next2, Long.valueOf(m101483a(z2)));
                    } else {
                        this.f119515l++;
                    }
                }
            } catch (Exception e) {
                this.f119521r.mo64359a("Failed to load data from leveldb", e);
            }
            return new bhtq(hashMap, hashSet);
        }
        this.f119521r.mo64360b("get() called when leveldb is not active. Operating in memory only mode");
        return new bhtq(hashMap, hashSet);
    }
}
