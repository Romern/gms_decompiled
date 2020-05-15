package p000;

/* renamed from: mhr */
final /* synthetic */ class mhr implements mjm {

    /* renamed from: a */
    private final mhu f33739a;

    public mhr(mhu mhu) {
        this.f33739a = mhu;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: mhu.a(int, java.lang.String, boolean):void
     arg types: [int, java.lang.String, int]
     candidates:
      mhu.a(int, int, java.lang.String):mpn
      mhu.a(int, java.lang.String, boolean):void */
    /* renamed from: a */
    public final void mo20024a(int i) {
        mhu mhu = this.f33739a;
        if (i - 1 == 2) {
            mhu.f33742a.mo25418e("Error while sending a byte array input stream. Should be impossible.", new Object[0]);
            mhu.mo20031a(2, "Error while sending a byte array input stream. Should be impossible.", true);
        }
    }
}
