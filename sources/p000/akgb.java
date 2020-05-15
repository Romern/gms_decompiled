package p000;

/* renamed from: akgb */
final /* synthetic */ class akgb implements Runnable {

    /* renamed from: a */
    private final akgy f71849a;

    /* renamed from: b */
    private final String f71850b;

    /* renamed from: c */
    private final byte[] f71851c;

    public akgb(akgy akgy, String str, byte[] bArr) {
        this.f71849a = akgy;
        this.f71850b = str;
        this.f71851c = bArr;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: akgy.a(java.lang.String, byte[], boolean):void
     arg types: [java.lang.String, byte[], int]
     candidates:
      akgy.a(akdd, ajnv, long):ajnw
      akgy.a(java.io.File, java.io.File, com.google.android.gms.nearby.sharing.FileAttachment):android.net.Uri
      akgy.a(int, int, java.lang.String[]):void
      akgy.a(akbw, java.lang.String, ajud):void
      akgy.a(com.google.android.gms.nearby.sharing.ShareTarget, ajud, java.lang.String):void
      akgy.a(java.lang.String, ajud, akbw):void
      akgy.a(java.lang.String, com.google.android.gms.nearby.sharing.ShareTarget, ajud):void
      akgy.a(java.lang.String, byte[], akdd):void
      akgy.a(byte[], akdd, java.lang.String):void
      akcd.a(java.lang.String, ajud, akbw):void
      akcd.a(java.lang.String, com.google.android.gms.nearby.sharing.ShareTarget, ajud):void
      akds.a(java.lang.String, byte[], akdd):void
      akgy.a(java.lang.String, byte[], boolean):void */
    public final void run() {
        this.f71849a.mo39387a(this.f71850b, this.f71851c, true);
    }
}
