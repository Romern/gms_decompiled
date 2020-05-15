package p000;

import android.util.Log;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.List;

/* renamed from: axzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axzw implements axzu {

    /* renamed from: a */
    private final ayev f96864a;

    /* renamed from: b */
    private final List f96865b;

    /* renamed from: c */
    private final axyt f96866c;

    /* renamed from: d */
    private final String f96867d;

    /* renamed from: e */
    private FileInputStream f96868e;

    /* renamed from: f */
    private final MessageDigest f96869f = axxv.m83507d();

    /* renamed from: g */
    private final ByteBuffer f96870g;

    public axzw(int i, ayev ayev, axyt axyt, int i2) {
        sdo.m34959a(ayev);
        this.f96866c = axyt;
        this.f96870g = ByteBuffer.allocate(i2 - 73);
        if (this.f96866c != null) {
            bxvd bxvd = (bxvd) ayev.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) ayev);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            ayev ayev2 = (ayev) bxvd.f164949b;
            ayev ayev3 = ayev.f97376n;
            ayev2.f97378a |= 2048;
            ayev2.f97390m = true;
            ayev = (ayev) bxvd.mo74062i();
            try {
                this.f96868e = new FileInputStream(this.f96866c.f96802b);
            } catch (FileNotFoundException e) {
                Log.w("wearable", "Failed to open attachment file to send.", e);
                this.f96868e = null;
            }
        } else {
            this.f96868e = null;
        }
        this.f96864a = ayev;
        List a = aybb.m83729a(ayev, i2, i);
        this.f96865b = a;
        this.f96867d = ((ayew) a.get(0)).f97396c;
    }

    /* renamed from: a */
    public final ayev mo53810a() {
        return this.f96864a;
    }

    /* renamed from: b */
    public final boolean mo53811b() {
        return this.f96865b.isEmpty() && this.f96868e == null;
    }

    /* renamed from: c */
    public final ayew mo53812c() {
        boolean z;
        if (mo53811b()) {
            throw new IllegalArgumentException("Called getNextMessagePiece on an empty array.");
        } else if (!this.f96865b.isEmpty()) {
            return (ayew) this.f96865b.remove(0);
        } else {
            ByteBuffer byteBuffer = this.f96870g;
            try {
                byteBuffer.clear();
                while (true) {
                    if (!byteBuffer.hasRemaining()) {
                        z = false;
                        break;
                    }
                    int read = this.f96868e.read(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining());
                    if (read < 0) {
                        z = true;
                        break;
                    }
                    byteBuffer.position(byteBuffer.position() + read);
                }
            } catch (IOException e) {
                Log.w("wearable", "QueuedMessage: Error when trying to read next segment in file.", e);
                z = true;
            }
            this.f96869f.update(this.f96870g.array(), 0, this.f96870g.position());
            ByteString a = ByteString.m123262a(this.f96870g.array(), 0, this.f96870g.position());
            String str = this.f96867d;
            MessageDigest messageDigest = this.f96869f;
            bxvd da = ayev.f97376n.mo74144da();
            bxvd da2 = ayet.f97366f.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ayet ayet = (ayet) da2.f164949b;
            str.getClass();
            int i = 1 | ayet.f97368a;
            ayet.f97368a = i;
            ayet.f97369b = str;
            a.getClass();
            int i2 = i | 4;
            ayet.f97368a = i2;
            ayet.f97371d = a;
            ayet.f97368a = i2 | 2;
            ayet.f97370c = z;
            if (z) {
                String b = axxv.m83503b(messageDigest.digest());
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                ayet ayet2 = (ayet) da2.f164949b;
                b.getClass();
                ayet2.f97368a |= 8;
                ayet2.f97372e = b;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ayev ayev = (ayev) da.f164949b;
            ayet ayet3 = (ayet) da2.mo74062i();
            ayet3.getClass();
            ayev.f97389l = ayet3;
            ayev.f97378a |= 1024;
            ayev ayev2 = (ayev) da.mo74062i();
            if (z) {
                if (Log.isLoggable("wearable", 3)) {
                    ayet ayet4 = ayev2.f97389l;
                    if (ayet4 == null) {
                        ayet4 = ayet.f97366f;
                    }
                    String valueOf = String.valueOf(ayet4.f97372e);
                    Log.d("wearable", valueOf.length() == 0 ? new String("Sending final file piece for file with digest: ") : "Sending final file piece for file with digest: ".concat(valueOf));
                }
                mo53813d();
            }
            return aybb.m83734b(ayev2);
        }
    }

    /* renamed from: d */
    public final void mo53813d() {
        this.f96865b.clear();
        FileInputStream fileInputStream = this.f96868e;
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException e) {
            }
            this.f96868e = null;
        }
    }
}
