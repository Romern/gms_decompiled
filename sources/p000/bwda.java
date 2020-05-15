package p000;

import java.io.DataInputStream;
import java.io.InputStream;

/* renamed from: bwda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwda extends bwdh {

    /* renamed from: c */
    private final bwcw f158877c;

    /* renamed from: d */
    private final bwcw[] f158878d;

    /* renamed from: e */
    private final int f158879e;

    public bwda(bwcf bwcf) {
        super(bwcf);
        DataInputStream dataInputStream = new DataInputStream(bwcf);
        this.f158877c = bwcw.m121805a(dataInputStream);
        int readShort = dataInputStream.readShort();
        this.f158879e = readShort;
        this.f158878d = new bwcw[readShort];
        for (int i = 0; i < this.f158879e; i++) {
            this.f158878d[i] = bwcw.m121805a(dataInputStream);
        }
    }

    /* renamed from: a */
    public final int mo73458a() {
        return ((bwcx) this.f158877c.f158869a).f158871b;
    }

    /* renamed from: b */
    public final InputStream mo73459b() {
        return ((bwcx) this.f158877c.f158869a).f158870a;
    }
}
