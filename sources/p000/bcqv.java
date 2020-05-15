package p000;

/* renamed from: bcqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcqv extends bcqz {
    /* renamed from: b */
    public final bcul mo57226b() {
        return bcul.SUPERSCRIPT;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcuj) {
            bcuj bcuj = (bcuj) obj;
            if (bcul.SUPERSCRIPT == bcuj.mo57226b() && bcuj.mo57260j()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return 1231;
    }

    /* renamed from: j */
    public final boolean mo57260j() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(28);
        sb.append("TextStyle{superscript=true}");
        return sb.toString();
    }
}
