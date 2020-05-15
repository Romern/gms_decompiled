package p000;

/* renamed from: bcqy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcqy extends bcqz {
    /* renamed from: b */
    public final bcul mo57226b() {
        return bcul.UNKNOWN;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcuj) {
            bcuj bcuj = (bcuj) obj;
            if (bcul.UNKNOWN == bcuj.mo57226b() && bcuj.mo57272m()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return 1231;
    }

    /* renamed from: m */
    public final boolean mo57272m() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(24);
        sb.append("TextStyle{unknown=true}");
        return sb.toString();
    }
}
