package p000;

import android.util.Log;

/* renamed from: bdyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bdyq extends bdyx {
    public bdyq(bdyw bdyw, String str, Boolean bool) {
        super(bdyw, str, bool);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo58442a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (aymn.f97982c.matcher(str).matches()) {
                return true;
            }
            if (aymn.f97983d.matcher(str).matches()) {
                return false;
            }
        }
        String b = super.mo58453b();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(b);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
