package p000;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: mjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mjx extends mjq {

    /* renamed from: a */
    private final ParcelFileDescriptor f33857a;

    /* renamed from: b */
    private final FileInputStream f33858b;

    /* renamed from: c */
    private final FileOutputStream f33859c;

    public mjx(ParcelFileDescriptor parcelFileDescriptor, FileInputStream fileInputStream, FileOutputStream fileOutputStream) {
        this.f33857a = parcelFileDescriptor;
        this.f33858b = fileInputStream;
        this.f33859c = fileOutputStream;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20112a() {
        srz.m36171a((Closeable) this.f33858b);
        srz.m36171a(this.f33859c);
        srz.m36170a(this.f33857a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo20107b(byte[] bArr, int i, int i2) {
        return this.f33858b.read(bArr, i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo20113c(byte[] bArr, int i, int i2) {
        try {
            this.f33859c.write(bArr, i, i2);
        } catch (IOException e) {
            throw new mjp("Unable to write data to USB.", e);
        }
    }
}
