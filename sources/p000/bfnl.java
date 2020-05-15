package p000;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.crypto.SecretKey;

/* renamed from: bfnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfnl {

    /* renamed from: c */
    public static final bfnk f114483c = new bfnj();

    /* renamed from: a */
    public final File f114484a;

    /* renamed from: b */
    public volatile int f114485b = -1;

    /* renamed from: d */
    private final SecretKey f114486d;

    /* renamed from: e */
    private final bfmf f114487e;

    /* renamed from: f */
    private final int f114488f;

    /* renamed from: g */
    private final int f114489g;

    /* renamed from: h */
    private final bsaz f114490h;

    /* renamed from: i */
    private final bfnk f114491i;

    public bfnl(int i, SecretKey secretKey, int i2, byte[] bArr, bsaz bsaz, File file, bfnk bfnk) {
        this.f114490h = bsaz;
        this.f114484a = file;
        this.f114488f = i;
        this.f114489g = i2;
        this.f114486d = secretKey;
        this.f114487e = bArr != null ? bfmf.m97226a(bArr, (bhdb) null) : null;
        this.f114491i = bfnk;
    }

    /* renamed from: a */
    public final bsax mo61993a() {
        DataInputStream dataInputStream;
        File file = this.f114484a;
        if (file != null) {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStream inputStream = null;
            try {
                dataInputStream = new DataInputStream(fileInputStream);
                try {
                    this.f114485b = dataInputStream.readUnsignedShort();
                    if (this.f114485b != this.f114488f) {
                        if (this.f114485b != this.f114489g) {
                            throw new IOException(String.format("Invalid version, desired = %d or %d, actual = %d", Integer.valueOf(this.f114488f), Integer.valueOf(this.f114489g), Integer.valueOf(this.f114485b)));
                        }
                    }
                    if (this.f114485b == this.f114488f) {
                        inputStream = bfmr.m97274a(new BufferedInputStream(dataInputStream), this.f114486d);
                    } else {
                        bfmf bfmf = this.f114487e;
                        if (bfmf != null) {
                            byte[] bArr = bfmf.mo61917a(dataInputStream).f114390b;
                            if (bArr != null) {
                                inputStream = new ByteArrayInputStream(bArr);
                            } else {
                                throw new IOException("Could not decrypt");
                            }
                        } else {
                            throw new IOException("No cipher key specified.");
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    bhcy.m100661a(inputStream);
                    bhcy.m100661a(dataInputStream);
                    throw th;
                }
                try {
                    bsax a = bhcr.m100642a(inputStream, this.f114490h);
                    if (this.f114491i.mo60977a(a)) {
                        bhcy.m100661a(inputStream);
                        bhcy.m100661a(dataInputStream);
                        return a;
                    }
                    throw new IOException("Invalid file format.");
                } catch (Throwable th2) {
                    th = th2;
                    bhcy.m100661a(inputStream);
                    bhcy.m100661a(dataInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                dataInputStream = null;
                bhcy.m100661a(inputStream);
                bhcy.m100661a(dataInputStream);
                throw th;
            }
        } else {
            throw new IOException("file does not exist");
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f114490h);
        String valueOf2 = String.valueOf(this.f114484a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39 + String.valueOf(valueOf2).length());
        sb.append("SimpleProtoBufStore loading ");
        sb.append(valueOf);
        sb.append(" from file ");
        sb.append(valueOf2);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo61994a(bsax bsax) {
        File file = this.f114484a;
        if (file != null) {
            if (!file.exists()) {
                this.f114484a.createNewFile();
            }
            mo61995a(bsax, new FileOutputStream(this.f114484a));
        }
    }

    /* renamed from: a */
    public final void mo61995a(bsax bsax, OutputStream outputStream) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(outputStream);
            try {
                dataOutputStream.writeShort(this.f114489g);
                if (this.f114487e != null) {
                    this.f114487e.mo61918a(dataOutputStream, bsax.mo70120b());
                    dataOutputStream.flush();
                    bhcy.m100661a(dataOutputStream);
                    return;
                }
                throw new IOException("No cipher specified.");
            } catch (Exception e) {
                File file = this.f114484a;
                if (file != null) {
                    file.delete();
                }
                throw new IOException("Runtime while writing protobuf to bytes.");
            } catch (Throwable th) {
                th = th;
                bhcy.m100661a(dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream = null;
            bhcy.m100661a(dataOutputStream);
            throw th;
        }
    }
}
