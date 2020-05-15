package p000;

import android.util.Log;

/* renamed from: bdyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdyp extends bdyx {
    public bdyp(bdyw bdyw, String str, Integer num) {
        super(bdyw, str, num);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo58442a(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            return Integer.valueOf(((Long) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException e) {
            }
        }
        String b = super.mo58453b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 24 + String.valueOf(valueOf).length());
        sb.append("Invalid int value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
