package p000;

import java.nio.ByteBuffer;

/* renamed from: oix */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oix extends oij {

    /* renamed from: b */
    public static final bnsn f37730b = odk.m28481a("CAR.GAL.MIC");

    /* renamed from: c */
    public volatile boolean f37731c;

    /* renamed from: d */
    public volatile int f37732d = 0;

    /* renamed from: e */
    private final oiw f37733e;

    public oix(oiw oiw, ojm ojm) {
        super(6, oiw, ojm, 4);
        this.f37733e = oiw;
        this.f37731c = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo22180a(bish bish) {
        if ((bish.f121559a & 2) != 0) {
            this.f37697a = bish.f121561c;
        }
        this.f37733e.mo21572a(bish.f121560b == 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo22181b(ByteBuffer byteBuffer) {
        this.f37732d++;
        if (this.f37731c) {
            this.f37733e.mo21571a(byteBuffer);
        }
        int i = this.f37697a;
        bxvd da = biom.f121063d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        biom biom = (biom) da.f164949b;
        int i2 = biom.f121065a | 1;
        biom.f121065a = i2;
        biom.f121066b = i;
        biom.f121065a = i2 | 2;
        biom.f121067c = 1;
        mo22206a(32772, (biom) da.mo74062i());
    }

    /* renamed from: c */
    public final void mo22199c() {
        if (this.f37731c) {
            bxvd da = bisg.f121549e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bisg bisg = (bisg) da.f164949b;
            bisg.f121551a |= 1;
            bisg.f121552b = false;
            mo22206a(32773, (bisg) da.mo74062i());
            this.f37731c = false;
            bnsi d = f37730b.mo68390d();
            d.mo68432a("oix", "c", 58, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68409a("Sent microphone close request, frames received %d", this.f37732d);
            return;
        }
        bnsi c = f37730b.mo68388c();
        c.mo68432a("oix", "c", 60, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68405a("Microphone already closed");
    }

    /* renamed from: a */
    public final void mo22198a(boolean z, boolean z2) {
        if (!this.f37731c) {
            this.f37732d = 0;
            bxvd da = bisg.f121549e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bisg bisg = (bisg) da.f164949b;
            int i = bisg.f121551a | 1;
            bisg.f121551a = i;
            bisg.f121552b = true;
            int i2 = i | 2;
            bisg.f121551a = i2;
            bisg.f121553c = z;
            bisg.f121551a = i2 | 4;
            bisg.f121554d = z2;
            bisg.m102784a(bisg);
            mo22206a(32773, (bisg) da.mo74062i());
            this.f37731c = true;
            bnsi d = f37730b.mo68390d();
            d.mo68432a("oix", "a", 47, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            d.mo68405a("Sent microphone open request");
            return;
        }
        bnsi c = f37730b.mo68388c();
        c.mo68432a("oix", "a", 49, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68405a("Microphone already open");
    }
}
