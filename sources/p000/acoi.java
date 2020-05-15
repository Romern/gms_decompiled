package p000;

/* renamed from: acoi */
final /* synthetic */ class acoi implements Runnable {

    /* renamed from: a */
    private final acok f60333a;

    public acoi(acok acok) {
        this.f60333a = acok;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: acom.a(java.lang.String, boolean):int
     arg types: [java.lang.String, int]
     candidates:
      acom.a(android.content.Context, ftw):acom
      acom.a(java.util.List, java.lang.String):int
      acom.a(java.lang.String, java.util.Iterator):acol
      ftv.a(java.lang.String, java.lang.String):java.lang.String
      ftv.a(android.database.sqlite.SQLiteDatabase, ftz):void
      ftv.a(ftz, long):boolean
      acom.a(java.lang.String, boolean):int */
    public final void run() {
        acok acok = this.f60333a;
        bxvd da = bpyu.f139934g.mo74144da();
        acom a = acok.mo32950a();
        try {
            int a2 = acok.f60344f.mo32961a(acok.f60336a, false) - a.mo32955a("sms", false);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpyu bpyu = (bpyu) da.f164949b;
            bpyu.f139936a |= 1;
            bpyu.f139937b = a2;
            int a3 = acok.f60344f.mo32961a(acok.f60337b, false) - a.mo32955a("mms", false);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpyu bpyu2 = (bpyu) da.f164949b;
            bpyu2.f139936a |= 2;
            bpyu2.f139938c = a3;
            int a4 = acok.f60344f.mo32961a(acok.f60336a, true) - a.mo32955a("sms", true);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpyu bpyu3 = (bpyu) da.f164949b;
            bpyu3.f139936a |= 4;
            bpyu3.f139939d = a4;
            int a5 = acok.f60344f.mo32961a(acok.f60337b, true) - a.mo32955a("mms", true);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpyu bpyu4 = (bpyu) da.f164949b;
            bpyu4.f139936a |= 8;
            bpyu4.f139940e = a5;
            int a6 = (int) (sra.m36059a(acok.f60342d, "icing_mmssms.db") >> 10);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpyu bpyu5 = (bpyu) da.f164949b;
            bpyu5.f139936a |= 16;
            bpyu5.f139941f = a6;
        } finally {
            acok.f60343e.mo32444a((bpyu) da.mo74062i());
        }
    }
}
