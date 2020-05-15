package p000;

/* renamed from: bib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bib {

    /* renamed from: a */
    public static final bin f3271a = new bin("00", "SUCCESS: NO FURTHER ACTION REQUIRED!!");

    /* renamed from: b */
    public static final bin f3272b = new bin("01", "SUCCESS: FURTHER ACTION REQUIRED!!");

    /* renamed from: c */
    public static final bin f3273c = new bin("02", "SUCCESS: TRANSACTION AMOUNT LOW!!");

    /* renamed from: d */
    public static final bin f3274d = new bin("03", "SUCCESS: TRANSACTION AMOUNT HIGH!!");

    /* renamed from: e */
    public static final bin f3275e = new bin("11", "FAILURE: UNEXPECTED ERROR!!");

    /* renamed from: f */
    public static final bin f3276f = new bin("12", "FAILURE: OPERATION NOT SUPPORTED IN CURRENT CONTEXT!!");

    /* renamed from: g */
    public static final bin f3277g = new bin("13", "FAILURE: REQUIRED DATA IS NULL!!");

    /* renamed from: h */
    public static final bin f3278h = new bin("14", "FAILURE: INVALID DATA!!");

    /* renamed from: i */
    public static final bin f3279i = new bin("15", "FAILURE: APDU PROCESSING FAILED!!");

    /* renamed from: j */
    public static final bin f3280j = new bin("16", "FAILURE: NO MORE LUPC LEFT!!");

    /* renamed from: k */
    public static final bin f3281k = new bin("21", "FAILURE: NFC ATC & MST ATC MISMATCH!!");

    /* renamed from: l */
    public static final bin f3282l = new bin("22", "FAILURE: NFC & MST LUPC COUNT MISMATCH!!");

    /* renamed from: m */
    public static final bin f3283m = new bin("23", "FAILURE: NEW ATC IS LESS THAN CURRENT HIGHEST ATC!!");

    /* renamed from: n */
    public static final bin f3284n = new bin("24", "FAILURE: SHA MESSAGE DIGEST GENERATION FAILED");

    /* renamed from: o */
    public static final bin f3285o = new bin("25", "FAILURE: MST DATA NOT PRESENT IN PROVISIONED OR UPDATE DATA!!");

    /* renamed from: p */
    public static final bin f3286p = new bin("26", "FAILURE: INVALID CARD PROFILE!!");

    /* renamed from: q */
    public static final bin f3287q = new bin("27", "FAILURE: TOKEN REFERENCE ID ALREADY PROVISIONED!!");

    /* renamed from: r */
    public static final bin f3288r = new bin("28", "FAILURE: TOKEN DATA VERSION MISMATCH!!");

    /* renamed from: s */
    public static final bin f3289s = new bin("45", "FAILURE: SDK DATA CORRUPTION IN OPEN/UNWRAP OPERATION!!");

    static {
        new bin("FF", "TA FAILURE: GENERIC ERROR AT TA!!");
        new bin("FE", "TA FAILURE: OPERATION NOT ALLOWED!!");
        new bin("FD", "TA FAILURE: LLVAR PARSING FAILED!!");
        new bin("FC", "TA FAILURE: KEY GENERATION FAILED!!");
        new bin("F5", "TA FAILURE: KCV MISMATCH!!");
        new bin("F4", "TA FAILURE: SIGNATURE MISMATCH!!");
        new bin("F3", "TA FAILURE: SECURE CHANNEL NOT AVAILABLE!!");
        new bin("F2", "TA FAILURE: INVALID PADDING!!");
        new bin("F1", "TA FAILURE: INVALID INPUT PARAMETERS!!");
        new bin("F0", "TA FAILURE: INVALID INTERNAL STATE!!");
        new bin("EF", "TA FAILURE: INVALID CRYPTO OPERATION!!");
        new bin("EE", "TA FAILURE: DATA NOT AVAILABLE IN TA!!");
        new bin("ED", "TA FAILURE: INVALID LOCK CODE!!");
        new bin("EC", "TA FAILURE: WRAP?UNWRAP KEY NOT AVAILABLE!!");
        new bin("EB", "TA FAILURE: LENGTH INCORRECT FOR DATA TO BE SIGNED!!");
        new bin("EA", "TA FAILURE: CDCVM NOT PERFORMED!!");
        new bin("E9", "TA FAILURE: INVALID CDCVM METHOD!!");
        new bin("E8", "TA FAILURE: LUPC NOT AVAILABLE!!");
    }
}
