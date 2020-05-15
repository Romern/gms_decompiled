package p000;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.TreeSet;

/* renamed from: abvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abvw implements Closeable {

    /* renamed from: a */
    public final File f58573a;

    /* renamed from: b */
    public final bxxk f58574b;

    /* renamed from: c */
    public final abvt f58575c;

    /* renamed from: d */
    public final Object f58576d = new Object();

    /* renamed from: e */
    public long f58577e;

    /* renamed from: f */
    public abvv f58578f;

    /* renamed from: g */
    public final Object f58579g = new Object();

    /* renamed from: h */
    public abvu f58580h;

    /* renamed from: i */
    public volatile String f58581i;

    /* renamed from: j */
    public volatile String f58582j;

    /* renamed from: k */
    public final bxvd f58583k = bpys.f139925f.mo74144da();

    public abvw(File file, bxxk bxxk, abvt abvt) {
        this.f58573a = file;
        this.f58574b = bxxk;
        this.f58575c = abvt;
        TreeSet a = mo32369a();
        while (!a.isEmpty()) {
            String str = (String) a.last();
            Long a2 = m48365a(str);
            if (a2 == null) {
                absg.m48206e("Invalid shard name: %s. Shard will be skipped and deleted.", str);
                mo32370a(bqba.INVALID_SHARD_NAME);
                File file2 = new File(file, str);
                if (file2.delete()) {
                    a = mo32369a();
                } else {
                    mo32370a(bqba.SHARD_DELETE_FAILED);
                    String valueOf = String.valueOf(file2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                    sb.append("Failed to delete file: ");
                    sb.append(valueOf);
                    throw new IOException(sb.toString());
                }
            } else {
                this.f58577e = a2.longValue() + 1;
                return;
            }
        }
    }

    /* renamed from: a */
    public static Long m48365a(String str) {
        if (str.length() == 16) {
            try {
                return Long.valueOf(Long.parseLong(str, 16));
            } catch (NumberFormatException e) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo32371b() {
        try {
            this.f58580h.close();
        } catch (IOException e) {
        }
        if (!this.f58580h.f58567b.delete()) {
            absg.m48206e("Failed to delete file %s", this.f58580h.f58567b);
            mo32370a(bqba.SHARD_DELETE_FAILED);
        }
        this.f58580h = null;
    }

    public final void close() {
        synchronized (this.f58576d) {
            abvv abvv = this.f58578f;
            if (abvv != null) {
                abvv.close();
                this.f58578f = null;
                this.f58582j = null;
            }
        }
        synchronized (this.f58579g) {
            abvu abvu = this.f58580h;
            if (abvu != null) {
                abvu.close();
                this.f58580h = null;
            }
        }
    }

    /* renamed from: a */
    public final TreeSet mo32369a() {
        TreeSet treeSet = new TreeSet();
        if (!this.f58573a.isDirectory()) {
            absg.m48206e("Request queue work dir \"%s\" disappeared", this.f58573a);
            mo32370a(bqba.WORK_DIR_DISAPPEARED);
            return treeSet;
        }
        String[] list = this.f58573a.list();
        if (list == null) {
            absg.m48206e("Failed to list contents of request queue work dir \"%s\"", this.f58573a);
            mo32370a(bqba.WORK_DIR_LIST_ERROR);
            return treeSet;
        }
        Collections.addAll(treeSet, list);
        return treeSet;
    }

    /* renamed from: a */
    public final void mo32370a(bqba bqba) {
        synchronized (this.f58583k) {
            bxvd bxvd = this.f58583k;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bpys bpys = (bpys) bxvd.f164949b;
            bpys bpys2 = bpys.f139925f;
            bqba.getClass();
            if (!bpys.f139928b.mo73666a()) {
                bpys.f139928b = bxvk.m124019a(bpys.f139928b);
            }
            bpys.f139928b.mo74153d(bqba.mo3214a());
        }
    }
}
