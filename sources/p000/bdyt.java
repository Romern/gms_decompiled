package p000;

import android.util.Base64;
import android.util.Log;

/* renamed from: bdyt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdyt extends bdyx {
    public bdyt(bdyw bdyw, String str, byte[] bArr) {
        super(bdyw, str, bArr);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo58442a(Object obj) {
        if (obj instanceof String) {
            try {
                return Base64.decode((String) obj, 3);
            } catch (IllegalArgumentException e) {
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
