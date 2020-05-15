package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: bwao */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwao {

    /* renamed from: a */
    public static final bwao f158669a = new bwao();

    private bwao() {
    }

    /* renamed from: a */
    public static final bxxc m121657a(bxxk bxxk, DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        InputStream bwal = new bwal(dataInputStream, Math.abs(readInt));
        if (readInt < 0) {
            bwal = new GZIPInputStream(bwal);
        }
        try {
            return (bxxc) bxxk.mo73656a(bwal);
        } finally {
            bwal.close();
        }
    }

    /* renamed from: a */
    public static final void m121658a(OutputStream outputStream, bxxc bxxc) {
        new DataOutputStream(outputStream).writeInt(bxxc.mo74145db());
        bxxc.mo73638a(outputStream);
    }
}
