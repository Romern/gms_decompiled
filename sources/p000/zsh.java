package p000;

import com.google.android.gms.leveldb.LevelDb;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: zsh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class zsh {

    /* renamed from: a */
    public final caae f55778a;

    /* renamed from: b */
    public bxuc f55779b;

    /* renamed from: c */
    public int f55780c;

    /* renamed from: d */
    private final int f55781d = ((int) cdzd.f182003a.mo6606a().mo78551R());

    /* renamed from: e */
    private final LevelDb.Iterator f55782e;

    /* renamed from: f */
    private final byte[] f55783f;

    /* renamed from: g */
    private int f55784g;

    /* renamed from: h */
    private byte[] f55785h;

    /* renamed from: i */
    private boolean f55786i;

    private zsh(LevelDb.Iterator iterator, caae caae, byte[] bArr) {
        this.f55782e = iterator;
        this.f55778a = caae;
        this.f55783f = bArr;
        this.f55784g = AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        byte[] bArr2 = new byte[AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES];
        this.f55785h = bArr2;
        this.f55779b = bxuc.m123419a(bArr2);
    }

    /* renamed from: a */
    public static zsh m46160a(LevelDb.Iterator iterator, caae caae, byte[] bArr) {
        zsh zsh = new zsh(iterator, caae, bArr);
        zsh.m46161c();
        return zsh;
    }

    /* renamed from: c */
    private final void m46161c() {
        while (true) {
            this.f55786i = this.f55782e.bufferedValue(0, this.f55783f, this.f55785h);
            bxuc a = bxuc.m123419a(this.f55785h);
            this.f55779b = a;
            int t = a.mo73811t();
            this.f55780c = t;
            if (t == 0 && this.f55786i) {
                int i = this.f55784g;
                int i2 = i + i;
                this.f55784g = i2;
                if (i2 <= this.f55781d) {
                    this.f55785h = new byte[i2];
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo31432a() {
        return this.f55780c > 0;
    }

    /* renamed from: b */
    public final void mo31433b() {
        int t = this.f55779b.mo73811t();
        this.f55780c = t;
        if (t == 0 && this.f55786i) {
            m46161c();
        }
    }
}
