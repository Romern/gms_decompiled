package p000;

/* renamed from: bxwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxwt {

    /* renamed from: b */
    private static final bxxa f165006b = new bxwr();

    /* renamed from: a */
    public final bxxa f165007a;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bxwd.a(java.lang.Object, java.lang.String):void
     arg types: [bxws, java.lang.String]
     candidates:
      bxwd.a(java.lang.Object, java.lang.Object):java.lang.Object
      bxwd.a(java.lang.Object, java.lang.String):void */
    public bxwt() {
        bxxa bxxa;
        bxxa[] bxxaArr = new bxxa[2];
        bxxaArr[0] = bxvc.f164947a;
        try {
            bxxa = (bxxa) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            bxxa = f165006b;
        }
        bxxaArr[1] = bxxa;
        bxws bxws = new bxws(bxxaArr);
        bxwd.m124084a((Object) bxws, "messageInfoFactory");
        this.f165007a = bxws;
    }

    /* renamed from: a */
    public static boolean m124132a(bxwz bxwz) {
        return bxwz.mo74215c() == 1;
    }
}
