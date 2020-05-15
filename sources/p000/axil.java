package p000;

import com.google.android.gms.walletp2p.feature.rpcclient.types.FundsTransferNotices;
import com.google.android.gms.walletp2p.feature.rpcclient.types.LegalDocuments;
import java.util.List;

/* renamed from: axil */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axil {

    /* renamed from: a */
    public final String f95991a;

    /* renamed from: b */
    public final List f95992b;

    /* renamed from: c */
    public final List f95993c;

    /* renamed from: d */
    public final byte[] f95994d;

    /* renamed from: e */
    public final FundsTransferNotices f95995e;

    /* renamed from: f */
    public final LegalDocuments f95996f;

    public axil(List list, List list2, List list3, List list4, String str, byte[] bArr) {
        this.f95991a = str;
        this.f95992b = list;
        this.f95993c = list2;
        this.f95995e = new FundsTransferNotices(list3);
        this.f95994d = bArr;
        this.f95996f = new LegalDocuments(list4);
    }
}
