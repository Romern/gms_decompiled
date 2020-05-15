package p000;

import java.io.DataInputStream;
import java.io.InputStream;

/* renamed from: bwdh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bwdh extends bwcv implements bwcg {

    /* renamed from: a */
    protected final bwcf f158895a;

    /* renamed from: b */
    public final int f158896b;

    public bwdh(bwcf bwcf) {
        this.f158895a = bwcf;
        DataInputStream dataInputStream = new DataInputStream(bwcf);
        mo73498a(dataInputStream.readUnsignedShort());
        this.f158896b = dataInputStream.readUnsignedShort();
    }

    /* renamed from: a */
    public abstract int mo73458a();

    /* renamed from: b */
    public abstract InputStream mo73459b();

    /* renamed from: d */
    public final void mo73512d() {
        bwcf bwcf = this.f158895a;
        if (bwcf != null) {
            bwcf.mo73453a();
        }
    }
}
