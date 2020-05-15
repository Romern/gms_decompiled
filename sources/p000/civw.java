package p000;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: civw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class civw {
    /* renamed from: a */
    public static civw m151056a(int i) {
        if (i == 2) {
            return new civx();
        }
        if (i == 3) {
            return new civy();
        }
        StringBuilder sb = new StringBuilder(28);
        sb.append("Unknown version: ");
        sb.append(i);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: b */
    private final byte[] m151058b(byte[] bArr, byte[] bArr2, int i) {
        double d = (double) i;
        Double.isNaN(d);
        try {
            int ceil = (int) Math.ceil(d / 32.0d);
            byte[] bArr3 = new byte[0];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (int a = mo86599a(); a < mo86599a() + ceil; a++) {
                Mac instance = Mac.getInstance("HmacSHA256");
                instance.init(new SecretKeySpec(bArr, "HmacSHA256"));
                instance.update(bArr3);
                if (bArr2 != null) {
                    instance.update(bArr2);
                }
                instance.update((byte) a);
                bArr3 = instance.doFinal();
                int min = Math.min(i, bArr3.length);
                byteArrayOutputStream.write(bArr3, 0, min);
                i -= min;
            }
            return byteArrayOutputStream.toByteArray();
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo86599a();

    /* renamed from: a */
    private static final byte[] m151057a(byte[] bArr, byte[] bArr2) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(bArr, "HmacSHA256"));
            return instance.doFinal(bArr2);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final byte[] mo86600a(byte[] bArr, byte[] bArr2, int i) {
        return mo86601a(bArr, new byte[32], bArr2, i);
    }

    /* renamed from: a */
    public final byte[] mo86601a(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        return m151058b(m151057a(bArr2, bArr), bArr3, i);
    }
}
