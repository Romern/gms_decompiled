package p000;

import android.util.Log;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: bfkw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfkw {

    /* renamed from: a */
    public final C1226ns f114321a;

    /* renamed from: b */
    public final int f114322b;

    /* renamed from: c */
    public final bfmf f114323c;

    public bfkw(int i, File file, bfmf bfmf) {
        this.f114322b = i;
        this.f114323c = bfmf;
        this.f114321a = new C1226ns(file);
    }

    /* renamed from: a */
    public final bxxc mo61862a(bxxk bxxk) {
        DataInputStream dataInputStream;
        C1226ns nsVar = this.f114321a;
        if (nsVar.f26762b.exists()) {
            nsVar.f26761a.delete();
            nsVar.f26762b.renameTo(nsVar.f26761a);
        }
        FileInputStream fileInputStream = new FileInputStream(nsVar.f26761a);
        if (this.f114323c != null) {
            try {
                dataInputStream = new DataInputStream(fileInputStream);
                try {
                    int readUnsignedShort = dataInputStream.readUnsignedShort();
                    int i = this.f114322b;
                    if (readUnsignedShort == i) {
                        bxxc bxxc = (bxxc) bxxk.mo73657a(this.f114323c.mo61917a(dataInputStream).f114390b);
                        bhcy.m100661a((Closeable) null);
                        bhcy.m100661a(dataInputStream);
                        return bxxc;
                    }
                    throw new IOException(String.format("Invalid version, desired = %d, actual = %d", Integer.valueOf(i), Integer.valueOf(readUnsignedShort)));
                } catch (Throwable th) {
                    th = th;
                    bhcy.m100661a((Closeable) null);
                    bhcy.m100661a(dataInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                dataInputStream = null;
                bhcy.m100661a((Closeable) null);
                bhcy.m100661a(dataInputStream);
                throw th;
            }
        } else {
            throw new IOException("No cipher specified.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ea A[RETURN] */
    /* renamed from: a */
    public final void mo61863a(bxxc bxxc) {
        FileOutputStream fileOutputStream;
        C1226ns nsVar;
        try {
            nsVar = this.f114321a;
            if (nsVar.f26761a.exists()) {
                if (nsVar.f26762b.exists()) {
                    nsVar.f26761a.delete();
                } else if (!nsVar.f26761a.renameTo(nsVar.f26762b)) {
                    Log.w("AtomicFile", "Couldn't rename file " + nsVar.f26761a + " to backup file " + nsVar.f26762b);
                }
            }
            fileOutputStream = new FileOutputStream(nsVar.f26761a);
            try {
                if (this.f114323c != null) {
                    DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                    dataOutputStream.writeShort(this.f114322b);
                    this.f114323c.mo61918a(dataOutputStream, bxxc.mo73642k());
                    C1226ns nsVar2 = this.f114321a;
                    C1226ns.m19707a(fileOutputStream);
                    try {
                        fileOutputStream.close();
                        nsVar2.f26762b.delete();
                    } catch (IOException e) {
                        Log.w("AtomicFile", "finishWrite: Got exception:", e);
                    }
                } else {
                    throw new IOException("No cipher specified.");
                }
            } catch (IOException e2) {
                if (fileOutputStream == null) {
                }
            }
        } catch (FileNotFoundException e3) {
            throw new IOException("Couldn't create " + nsVar.f26761a);
        } catch (FileNotFoundException e4) {
            if (nsVar.f26761a.getParentFile().mkdirs()) {
                fileOutputStream = new FileOutputStream(nsVar.f26761a);
            } else {
                throw new IOException("Couldn't create directory " + nsVar.f26761a);
            }
        } catch (IOException e5) {
            fileOutputStream = null;
            if (fileOutputStream == null) {
                C1226ns nsVar3 = this.f114321a;
                C1226ns.m19707a(fileOutputStream);
                try {
                    fileOutputStream.close();
                    nsVar3.f26761a.delete();
                    nsVar3.f26762b.renameTo(nsVar3.f26761a);
                } catch (IOException e6) {
                    Log.w("AtomicFile", "failWrite: Got exception:", e6);
                }
            }
        }
    }
}
