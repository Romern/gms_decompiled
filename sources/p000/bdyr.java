package p000;

import android.util.Log;

/* renamed from: bdyr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdyr extends bdyx {
    public bdyr(bdyw bdyw, String str, Double d) {
        super(bdyw, str, d);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo58442a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException e) {
            }
        }
        String b = super.mo58453b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 27 + String.valueOf(valueOf).length());
        sb.append("Invalid double value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
