package p000;

import android.util.Log;

/* renamed from: bdyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdyo extends bdyx {
    public bdyo(bdyw bdyw, String str, Long l) {
        super(bdyw, str, l);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo58442a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException e) {
            }
        }
        String b = super.mo58453b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 25 + String.valueOf(valueOf).length());
        sb.append("Invalid long value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
