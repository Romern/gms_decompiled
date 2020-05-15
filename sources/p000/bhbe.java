package p000;

import android.content.Context;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: bhbe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhbe {

    /* renamed from: a */
    public final Context f118227a;

    /* renamed from: b */
    public volatile byte[] f118228b;

    /* renamed from: c */
    public final String f118229c = "geofencer_ks";

    /* renamed from: a */
    public final bfmf mo63515a() {
        rzz.m34727a(this.f118228b, "createCipher needs to be called after createOrLoadKey");
        return bfmf.m97226a(this.f118228b, (bhdb) null);
    }

    /* renamed from: b */
    public final byte[] mo63516b() {
        Throwable th;
        DataInputStream dataInputStream;
        DataInputStream dataInputStream2 = null;
        try {
            dataInputStream = new DataInputStream(this.f118227a.openFileInput(this.f118229c));
            try {
                dataInputStream.readUnsignedShort();
                byte[] bArr = new byte[32];
                dataInputStream.readFully(bArr);
                bhcy.m100661a(dataInputStream);
                return bArr;
            } catch (FileNotFoundException e) {
                boolean z = bfxc.f115575a;
                bhcy.m100661a(dataInputStream);
                return null;
            } catch (EOFException e2) {
                boolean z2 = bfxc.f115575a;
                bhcy.m100661a(dataInputStream);
                return null;
            } catch (IOException e3) {
                boolean z3 = bfxc.f115575a;
                bhcy.m100661a(dataInputStream);
                return null;
            }
        } catch (FileNotFoundException e4) {
            dataInputStream = null;
            boolean z4 = bfxc.f115575a;
            bhcy.m100661a(dataInputStream);
            return null;
        } catch (EOFException e5) {
            dataInputStream = null;
            boolean z22 = bfxc.f115575a;
            bhcy.m100661a(dataInputStream);
            return null;
        } catch (IOException e6) {
            dataInputStream = null;
            boolean z32 = bfxc.f115575a;
            bhcy.m100661a(dataInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            dataInputStream2 = dataInputStream;
            bhcy.m100661a(dataInputStream2);
            throw th;
        }
    }

    public bhbe(Context context) {
        this.f118227a = context;
    }
}
