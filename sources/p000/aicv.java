package p000;

/* renamed from: aicv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aicv extends buqn {

    /* renamed from: a */
    final /* synthetic */ String f68733a;

    /* renamed from: b */
    final /* synthetic */ aicw f68734b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aicv(aicw aicw, String str, String str2) {
        super(str);
        this.f68734b = aicw;
        this.f68733a = str2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aicw.a(boolean, java.lang.String):void
     arg types: [int, java.lang.String]
     candidates:
      aicw.a(java.lang.String, int):android.content.Intent
      aicw.a(ahsu, boolean):java.lang.String
      butb.a(android.content.Context, bvin):android.content.Intent
      aicw.a(boolean, java.lang.String):void */
    public final void run() {
        ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("Disable certain discovery device in cache");
        this.f68734b.mo37417a(false, this.f68733a);
    }
}
