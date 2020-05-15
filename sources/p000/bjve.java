package p000;

/* renamed from: bjve */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjve {

    /* renamed from: a */
    public static final char[] f123376a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static int m104686a(byte b) {
        return b & 255;
    }

    /* renamed from: a */
    public static byte[] m104687a(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            str = String.format("0%s", str);
            length++;
        }
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) | Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }
}
