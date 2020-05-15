package p000;

import android.content.Context;
import android.database.Cursor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.DogfoodsToken;

/* renamed from: anhf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anhf extends angu {

    /* renamed from: a */
    private final angj f76861a;

    public anhf(angj angj) {
        super("GetDogfoodsTokenOperationCall", caif.GET_DOGFOODS_TOKEN);
        sdo.m34959a(angj);
        this.f76861a = angj;
    }

    /* renamed from: a */
    public final cahp mo41825a() {
        return null;
    }

    /* renamed from: b */
    public final void mo41827b(Context context) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f76861a.mo41786a(status, (DogfoodsToken) null);
    }

    /* renamed from: b */
    public final void mo41828b(Context context, anfw anfw) {
        byte[] bArr;
        Cursor query = anfw.getWritableDatabase().query("DogfoodsToken", new String[]{"token"}, null, null, null, null, null);
        try {
            if (query.moveToFirst()) {
                bArr = query.getBlob(0);
            } else {
                bArr = null;
            }
            if (query != null) {
                query.close();
            }
            this.f76861a.mo41786a(Status.f30107a, new DogfoodsToken(bArr));
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
