package p000;

/* renamed from: ctw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ctw {
    ZIP(new cud(), ctd.PDOL.mo8255a(csx.TERMINAL_TRANSACTION_QUALIFIERS.mo8233a(4), csx.AMOUNT_AUTHORISED_NUMERIC.mo8233a(6), csx.AMOUNT_OTHER_NUMERIC.mo8233a(6), csx.TERMINAL_COUNTRY_CODE.mo8233a(2), csx.TRANSACTION_CURRENCY_CODE.mo8233a(2), csx.TRANSACTION_DATE.mo8233a(3), csx.TRANSACTION_TYPE.mo8233a(1), csx.UNPREDICTABLE_NUMBER.mo8233a(4), csx.TERMINAL_TYPE.mo8233a(1), csx.CARD_NAME.mo8233a(1), csx.CARD_PRODUCT_FUNCTIONS.mo8233a(2), csx.ASI.mo8233a(2), csx.CARD_PRODUCT_TYPE.mo8233a(2))),
    DPAS(new cua(), ctd.PDOL.mo8255a(csx.UNPREDICTABLE_NUMBER.mo8233a(1)));
    

    /* renamed from: c */
    public final ctx f12045c;

    /* renamed from: d */
    private final cte f12046d;

    private ctw(ctx ctx, cte cte) {
        this.f12045c = ctx;
        this.f12046d = cte;
    }

    /* renamed from: a */
    public final cte mo8294a(csv csv) {
        return (cte) czm.m8008a(ctc.m7525a((cta[]) csv.f12004b, ctd.PDOL), this.f12046d);
    }
}
