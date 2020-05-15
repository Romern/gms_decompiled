package p000;

/* renamed from: adfa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adfa {

    /* renamed from: a */
    private String f61538a;

    /* renamed from: b */
    private int f61539b;

    /* renamed from: c */
    private byte[] f61540c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized byte[] mo33407a(String str, int i) {
        if (i == this.f61539b) {
            if (str.equals(this.f61538a)) {
                return this.f61540c;
            }
        }
        this.f61538a = str;
        this.f61539b = i;
        bxvd da = bkjz.f124483d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bkjz bkjz = (bkjz) da.f164949b;
        str.getClass();
        int i2 = bkjz.f124485a | 1;
        bkjz.f124485a = i2;
        bkjz.f124486b = str;
        bkjz.f124485a = i2 | 2;
        bkjz.f124487c = i;
        byte[] k = ((bkjz) da.mo74062i()).serializeToBytes();
        this.f61540c = k;
        return k;
    }
}
