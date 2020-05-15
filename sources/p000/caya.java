package p000;

/* renamed from: caya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caya {
    /* renamed from: a */
    public static String m127524a(caue caue) {
        int indexOf = caue.f175994e.indexOf(47, caue.f175990a.length() + 3);
        String str = caue.f175994e;
        String substring = caue.f175994e.substring(indexOf, caue.m127218a(str, indexOf, str.length(), "?#"));
        String f = caue.mo74891f();
        if (f == null) {
            return substring;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 1 + f.length());
        sb.append(substring);
        sb.append('?');
        sb.append(f);
        return sb.toString();
    }
}
