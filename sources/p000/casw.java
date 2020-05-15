package p000;

/* renamed from: casw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class casw {
    /* renamed from: a */
    static int m127118a(byte[] bArr) {
        if (bArr == null) {
            return 3;
        }
        String lowerCase = new String(bArr).toLowerCase();
        if (lowerCase.equalsIgnoreCase("mastercard")) {
            return 1;
        }
        if (lowerCase.contains("maestro") || lowerCase.contains("debit")) {
            return 2;
        }
        return 3;
    }

    /* renamed from: a */
    public static /* synthetic */ String m127119a(int i) {
        return i != 1 ? i != 2 ? "UNKNOWN" : "DEBIT" : "CREDIT";
    }
}
