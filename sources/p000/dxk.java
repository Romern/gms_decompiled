package p000;

import android.content.Context;
import com.google.android.gms.contextmanager.ContextData;
import java.util.Collection;

/* renamed from: dxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dxk extends dxd {

    /* renamed from: f */
    private final Collection f14360f;

    public dxk(Context context, doh doh, Collection collection, dwu dwu, dqb dqb) {
        super(context, "WriteBatchTask", doh, "writebatchinternal", 12547, 4, bxjt.f163677b, cdhr.m133452b(), dwu, dqb, null);
        sdo.m34959a(collection);
        this.f14360f = collection;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bxjd mo9827a(bxxc bxxc) {
        bxjd bxjd = ((bxjt) bxxc).f163679a;
        return bxjd == null ? bxjd.f163616c : bxjd;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bxxc mo9830c() {
        bxvd da = bxjs.f163672d.mo74144da();
        bxjc a = dwv.m9720a(this.f14340c, this.f14341d);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxjs bxjs = (bxjs) da.f164949b;
        a.getClass();
        bxjs.f163675b = a;
        bxjs.f163674a |= 1;
        for (ContextData contextData : this.f14360f) {
            ByteString aL = contextData.mo18013c().mo73639aL();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxjs bxjs2 = (bxjs) da.f164949b;
            aL.getClass();
            if (!bxjs2.f163676c.mo73666a()) {
                bxjs2.f163676c = GeneratedMessageLite.m124021a(bxjs2.f163676c);
            }
            bxjs2.f163676c.add(aL);
            new Object[1][0] = contextData;
        }
        return (bxjs) da.mo74062i();
    }
}
