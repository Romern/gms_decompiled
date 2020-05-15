package p000;

import java.util.Arrays;

/* renamed from: anhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anhu {

    /* renamed from: a */
    public final braj f76902a;

    /* renamed from: b */
    public anhx f76903b = null;

    public anhu(String str, int i, String[] strArr, int[] iArr, byte[] bArr, boolean z, String str2) {
        braf braf = (braf) braj.f142139l.mo74144da();
        if (braf.f164950c) {
            braf.mo74035c();
            braf.f164950c = false;
        }
        braj braj = (braj) braf.f164949b;
        int i2 = braj.f142141a | 2;
        braj.f142141a = i2;
        braj.f142145e = i;
        int i3 = i2 | 8;
        braj.f142141a = i3;
        braj.f142149i = z;
        braj.f142150j = 1;
        int i4 = i3 | 64;
        braj.f142141a = i4;
        if (str != null) {
            str.getClass();
            braj.f142141a = i4 | 1;
            braj.f142144d = str;
        }
        if (strArr != null && strArr.length > 0) {
            braf.mo69472a(Arrays.asList(strArr));
        }
        if (iArr != null && (r5 = iArr.length) > 0) {
            for (int i5 : iArr) {
                braf.mo69471a(i5);
            }
        }
        if (bArr != null && bArr.length > 0) {
            bxtx a = bxtx.m123261a(bArr);
            if (braf.f164950c) {
                braf.mo74035c();
                braf.f164950c = false;
            }
            braj braj2 = (braj) braf.f164949b;
            a.getClass();
            braj2.f142141a |= 4;
            braj2.f142148h = a;
        }
        if (str2 != null) {
            if (braf.f164950c) {
                braf.mo74035c();
                braf.f164950c = false;
            }
            braj braj3 = (braj) braf.f164949b;
            str2.getClass();
            braj3.f142142b = 7;
            braj3.f142143c = str2;
        }
        this.f76902a = (braj) braf.mo74062i();
    }
}
