package p000;

/* renamed from: bcqr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcqr extends bcqz {
    /* renamed from: b */
    public final bcul mo57226b() {
        return bcul.ITALIC;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcuj) {
            bcuj bcuj = (bcuj) obj;
            if (bcul.ITALIC == bcuj.mo57226b() && bcuj.mo57243f()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo57243f() {
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(23);
        sb.append("TextStyle{italic=true}");
        return sb.toString();
    }
}
