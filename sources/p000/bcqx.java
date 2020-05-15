package p000;

/* renamed from: bcqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcqx extends bcqz {
    /* renamed from: b */
    public final bcul mo57226b() {
        return bcul.UNDERLINE;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcuj) {
            bcuj bcuj = (bcuj) obj;
            if (bcul.UNDERLINE == bcuj.mo57226b() && bcuj.mo57268l()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return 1231;
    }

    /* renamed from: l */
    public final boolean mo57268l() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(26);
        sb.append("TextStyle{underline=true}");
        return sb.toString();
    }
}
