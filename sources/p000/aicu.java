package p000;

/* renamed from: aicu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aicu extends buqn {

    /* renamed from: a */
    final /* synthetic */ String f68731a;

    /* renamed from: b */
    final /* synthetic */ aicw f68732b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aicu(aicw aicw, String str, String str2) {
        super(str);
        this.f68732b = aicw;
        this.f68731a = str2;
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
        ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("Enable certain discovery device in cache");
        this.f68732b.mo37417a(true, this.f68731a);
    }
}
