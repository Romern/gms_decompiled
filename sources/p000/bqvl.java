package p000;

/* renamed from: bqvl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqvl implements bqoe {
    public bqvl(byte[] bArr) {
        if (bArr.length == 32) {
            bqwa.m113509a(bArr);
        } else {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
    }
}
