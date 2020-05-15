package p000;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: batm */
final /* synthetic */ class batm implements bmxj {

    /* renamed from: a */
    private final byte[] f101709a;

    public batm(byte[] bArr) {
        this.f101709a = bArr;
    }

    public final Object apply(Object obj) {
        byte[] bArr = this.f101709a;
        for (basd basd : (Collection) obj) {
            if (Arrays.equals(bArr, basd.f101654b)) {
                return bmxv.m108566b(basd);
            }
        }
        return bmvz.f131120a;
    }
}
