package p000;

/* renamed from: bcqo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcqo extends bcqz {
    /* renamed from: b */
    public final bcul mo57226b() {
        return bcul.BOLD;
    }

    /* renamed from: c */
    public final boolean mo57230c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcuj) {
            bcuj bcuj = (bcuj) obj;
            if (bcul.BOLD == bcuj.mo57226b() && bcuj.mo57230c()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(21);
        sb.append("TextStyle{bold=true}");
        return sb.toString();
    }
}
