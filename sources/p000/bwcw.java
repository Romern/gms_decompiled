package p000;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.HashMap;

/* renamed from: bwcw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwcw implements bwcg {

    /* renamed from: a */
    public final bwcg f158869a;

    public bwcw(bwcg bwcg) {
        this.f158869a = bwcg;
    }

    /* renamed from: a */
    public static bwcw m121805a(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        short readShort = dataInputStream.readShort();
        if (dataInputStream.readUTF().length() == 0) {
            int i = 0;
            while (true) {
                if (i < bwcz.f158876b.length) {
                    if (bwcz.f158876b[i] == readShort) {
                        String str = bwcz.f158875a[i];
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        dataInputStream.readUTF();
        HashMap hashMap = new HashMap();
        byte readByte = dataInputStream.readByte() & 255;
        for (int i2 = 0; i2 < readByte; i2++) {
            hashMap.put(dataInputStream.readUTF(), dataInputStream.readUTF());
        }
        int readInt = dataInputStream.readInt();
        String readUTF = dataInputStream.readUTF();
        bwcf bwcf = new bwcf(dataInputStream, readInt);
        bwcx bwcx = new bwcx(readUTF, -1, bwcf);
        bwcf.mo73453a();
        return new bwcw(bwcx);
    }

    /* renamed from: a */
    public final int mo73458a() {
        throw null;
    }

    /* renamed from: b */
    public final InputStream mo73459b() {
        throw null;
    }
}
