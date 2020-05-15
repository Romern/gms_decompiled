package p000;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* renamed from: bdyu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdyu extends bdyx {

    /* renamed from: a */
    final /* synthetic */ bdyv f106639a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bdyu(bdyw bdyw, String str, Object obj, bdyv bdyv) {
        super(bdyw, str, obj);
        this.f106639a = bdyv;
    }

    /* renamed from: a */
    public final Object mo58442a(Object obj) {
        if (obj instanceof String) {
            try {
                return this.f106639a.mo24436a(Base64.decode((String) obj, 3));
            } catch (IOException | IllegalArgumentException e) {
            }
        }
        String b = super.mo58453b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 27 + String.valueOf(valueOf).length());
        sb.append("Invalid byte[] value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
