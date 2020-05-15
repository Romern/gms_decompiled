package p000;

import com.google.android.gms.tapandpay.firstparty.TransactionData;

/* renamed from: atbr */
public final /* synthetic */ class atbr implements atbl {

    /* renamed from: a */
    private final atbu f90024a;

    /* renamed from: b */
    private final TransactionData f90025b;

    /* renamed from: c */
    private final byte[] f90026c;

    /* renamed from: d */
    private final boolean f90027d;

    /* renamed from: e */
    private final btiy f90028e;

    public atbr(atbu atbu, TransactionData transactionData, byte[] bArr, boolean z, btiy btiy) {
        this.f90024a = atbu;
        this.f90025b = transactionData;
        this.f90026c = bArr;
        this.f90027d = z;
        this.f90028e = btiy;
    }

    /* renamed from: a */
    public final Object mo49778a(atda atda) {
        atbu atbu = this.f90024a;
        TransactionData transactionData = this.f90025b;
        byte[] bArr = this.f90026c;
        boolean z = this.f90027d;
        btiy btiy = this.f90028e;
        atcv atcv = atda.f90108i;
        if (atcv != null) {
            try {
                atcq a = atcv.mo49795a(new atcp(transactionData.f108461a, transactionData.f108466f, transactionData.f108462b, transactionData.f108463c, transactionData.f108464d, transactionData.f108465e, transactionData.f108467g, bArr, z), atbu.f90033b, btiy);
                atbu.mo49792a(atcv);
                return a;
            } catch (atcr e) {
                throw new atbk(e);
            }
        } else {
            throw new atbk(new atcr());
        }
    }
}
