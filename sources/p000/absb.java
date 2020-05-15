package p000;

/* renamed from: absb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class absb implements absc {
    /* renamed from: a */
    public final String mo32333a(String str, String str2) {
        try {
            absd.m48178b(str, str2, 64000);
            return null;
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: absd.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, byte[]]
     candidates:
      absd.a(int, com.google.android.gms.appdatasearch.STSortSpec):java.lang.String
      absd.a(java.lang.String, byte[]):void
      absd.a(java.lang.String, java.lang.Object):void */
    /* renamed from: a */
    public final String mo32334a(String str, byte[] bArr) {
        try {
            absd.m48173a(str, (Object) bArr);
            absd.m48175a(str, bArr);
            return null;
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }
}
