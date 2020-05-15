package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: casd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class casd {

    /* renamed from: a */
    public casc f175742a;

    /* renamed from: b */
    final List f175743b = new ArrayList();

    /* renamed from: c */
    public carw f175744c;

    /* renamed from: d */
    public cary f175745d;

    /* renamed from: e */
    public carv f175746e;

    /* renamed from: f */
    public carz f175747f;

    /* renamed from: a */
    public final casa mo74805a() {
        int size = this.f175743b.size();
        carx[] carxArr = new carx[size];
        for (int i = 0; i < size; i++) {
            carxArr[i] = (carx) this.f175743b.get(i);
        }
        return new casa(this, new casb(this, carxArr));
    }

    /* renamed from: b */
    public final void mo74811b(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f175745d = new cary(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    /* renamed from: a */
    public final void mo74806a(byte b, byte b2, byte[] bArr) {
        this.f175743b.add(new carx(b, b2, bArr));
    }

    /* renamed from: a */
    public final void mo74807a(byte[] bArr, byte[] bArr2) {
        this.f175746e = new carv(bArr, bArr2);
    }

    /* renamed from: a */
    public final void mo74808a(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte[] bArr9) {
        this.f175742a = new casc(bArr, bArr2, i, bArr3, bArr4, bArr5, bArr6, bArr7, bArr8, bArr9);
    }

    /* renamed from: a */
    public final void mo74809a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f175747f = new carz(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    /* renamed from: a */
    public final void mo74810a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8) {
        this.f175744c = new carw(bArr, bArr2, bArr3, bArr4, bArr5, bArr6, bArr7, bArr8);
    }
}
