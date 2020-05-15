package p000;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: bhzk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhzk implements bhyv {

    /* renamed from: a */
    public int f119950a = 0;

    /* renamed from: b */
    public long f119951b = -1;

    /* renamed from: c */
    public final File f119952c;

    /* renamed from: d */
    public final File f119953d;

    /* renamed from: e */
    public final Executor f119954e;

    /* renamed from: f */
    public final bhwp f119955f = new bhwp("Places", new bhxj());

    /* renamed from: g */
    public bhsw f119956g;

    /* renamed from: h */
    public bhsw f119957h;

    /* renamed from: i */
    private final Executor f119958i;

    public bhzk(File file, Executor executor, Executor executor2) {
        this.f119953d = file;
        this.f119958i = executor;
        this.f119954e = executor2;
        this.f119952c = new File(file, "ttl2");
    }

    /* renamed from: a */
    public final void mo64426a() {
        this.f119958i.execute(new bhzc(this));
    }

    /* renamed from: b */
    public final void mo64430b() {
        this.f119958i.execute(new bhzd(this));
    }

    /* renamed from: c */
    public final void mo64449c() {
        File[] listFiles = this.f119953d.listFiles();
        for (File file : listFiles) {
            if (!file.isDirectory()) {
                file.delete();
            }
        }
        bhsw bhsw = this.f119956g;
        if (bhsw != null && this.f119957h != null) {
            bhsw.mo64245c();
            this.f119957h.mo64245c();
            this.f119951b = System.currentTimeMillis();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f119952c);
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                dataOutputStream.write(2);
                dataOutputStream.writeLong(this.f119951b);
                dataOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                this.f119955f.mo64359a("Failed to write TTL", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo64448a(int i) {
        if (this.f119956g != null && this.f119957h != null) {
            bhwp bhwp = this.f119955f;
            StringBuilder sb = new StringBuilder(50);
            sb.append("internalFreeSpace invoked with reason: ");
            sb.append(i);
            bhwp.mo64358a(sb.toString());
            bhsz a = this.f119956g.mo64241a((float) cgfr.f186745a.mo6606a().mo83627b());
            HashSet hashSet = new HashSet();
            for (List list : a.f119526b) {
                hashSet.addAll(list);
            }
            for (List list2 : a.f119525a) {
                hashSet.removeAll(list2);
            }
            this.f119957h.mo64244b(hashSet);
        }
    }

    /* renamed from: b */
    public final void mo64431b(Map map) {
        this.f119958i.execute(new bhzf(this, map));
    }

    /* renamed from: a */
    public final void mo64427a(Collection collection, bhyg bhyg) {
        this.f119958i.execute(new bhzg(this, collection, bhyg));
    }

    /* renamed from: a */
    public final void mo64428a(Collection collection, bhyu bhyu) {
        this.f119958i.execute(new bhzi(this, collection, bhyu));
    }

    /* renamed from: a */
    public final void mo64429a(Map map) {
        this.f119958i.execute(new bhze(this, map));
    }
}
