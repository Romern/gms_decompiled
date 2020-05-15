package p000;

import com.google.android.gms.leveldb.WriteBatch;

/* renamed from: bgud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgud {

    /* renamed from: a */
    public final WriteBatch f117549a = WriteBatch.create();

    /* renamed from: b */
    public int f117550b;

    /* renamed from: a */
    public final void mo63175a() {
        this.f117549a.close();
    }

    /* renamed from: a */
    public final void mo63176a(byte[] bArr, byte[] bArr2) {
        this.f117549a.put(bArr, bArr2);
        this.f117550b++;
    }
}
