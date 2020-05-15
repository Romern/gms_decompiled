package p000;

import java.util.zip.Inflater;

/* renamed from: cawt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cawt extends Inflater {
    public final int inflate(byte[] bArr, int i, int i2) {
        int inflate = super.inflate(bArr, i, i2);
        if (inflate != 0 || !needsDictionary()) {
            return inflate;
        }
        setDictionary(caxa.f176302a);
        return super.inflate(bArr, i, i2);
    }
}
