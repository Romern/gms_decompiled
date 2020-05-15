package p000;

import android.os.Handler;

/* renamed from: aiel */
final /* synthetic */ class aiel implements aubq {

    /* renamed from: a */
    private final aifl f68838a;

    public aiel(aifl aifl) {
        this.f68838a = aifl;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aidf.a(rjx, java.lang.String):aucb
     arg types: [aifl, java.lang.String]
     candidates:
      aidf.a(rjx, rjk):aidf
      aidf.a(rjx, rob):aucb
      aidf.a(java.lang.Object, java.lang.String):rob
      aidf.a(java.lang.String, java.lang.String):rob
      aidf.a(rjx, java.lang.String):aucb */
    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        aifl aifl = this.f68838a;
        aifl.f68876a.mo37435a((rjx) aifl, "connection");
        rnm rnm = aifl.f43166E;
        rme rme = new rme(aifl.f43162A);
        Handler handler = rnm.f43405o;
        handler.sendMessage(handler.obtainMessage(14, rme));
    }
}
