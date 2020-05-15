package p000;

import java.util.NoSuchElementException;

/* renamed from: bxtm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxtm extends bxtn {

    /* renamed from: a */
    final /* synthetic */ ByteString f164782a;

    /* renamed from: b */
    private int f164783b = 0;

    /* renamed from: c */
    private final int f164784c = this.f164782a.mo73744a();

    public bxtm(ByteString bxtx) {
        this.f164782a = bxtx;
    }

    /* renamed from: a */
    public final byte mo73738a() {
        int i = this.f164783b;
        if (i < this.f164784c) {
            this.f164783b = i + 1;
            return this.f164782a.mo73746b(i);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f164783b < this.f164784c;
    }
}
