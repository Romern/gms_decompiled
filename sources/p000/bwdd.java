package p000;

import java.io.DataInputStream;
import java.io.InputStream;

/* renamed from: bwdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwdd extends bwdh {

    /* renamed from: c */
    private final bwcx f158885c;

    public bwdd(bwcf bwcf) {
        super(bwcf);
        DataInputStream dataInputStream = new DataInputStream(bwcf);
        this.f158885c = new bwcx(dataInputStream.readUTF(), dataInputStream.readInt(), bwcf);
    }

    /* renamed from: a */
    public final int mo73458a() {
        return this.f158885c.f158871b;
    }

    /* renamed from: b */
    public final InputStream mo73459b() {
        return this.f158885c.f158870a;
    }
}
