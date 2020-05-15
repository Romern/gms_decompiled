package p000;

import java.util.Arrays;

/* renamed from: aiju */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiju extends aysd {

    /* renamed from: a */
    final /* synthetic */ int f68990a;

    /* renamed from: b */
    final /* synthetic */ aikx f68991b;

    public aiju(aikx aikx, int i) {
        this.f68991b = aikx;
        this.f68990a = i;
    }

    /* renamed from: a */
    public final byte[] mo37594a(int i) {
        aijw aijw = (aijw) this.f68991b.f69080b.get(Integer.valueOf(this.f68990a));
        if (aijw == null) {
            return new byte[0];
        }
        byte[] bArr = aijw.f68997b;
        return Arrays.copyOfRange(bArr, i, bArr.length);
    }
}
