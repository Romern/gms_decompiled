package p000;

import com.google.android.gms.leveldb.WriteBatch;

/* renamed from: bguf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bguf {

    /* renamed from: a */
    public final WriteBatch f117555a = WriteBatch.create();

    /* renamed from: b */
    public int f117556b;

    /* renamed from: a */
    public final void mo63188a() {
        this.f117555a.close();
    }

    /* renamed from: a */
    public final void mo63189a(byte[] bArr, byte[] bArr2) {
        this.f117555a.put(bArr, bArr2);
        this.f117556b++;
    }
}
