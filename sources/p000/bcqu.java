package p000;

/* renamed from: bcqu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcqu extends bcqz {
    /* renamed from: b */
    public final bcul mo57226b() {
        return bcul.SUBSCRIPT;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcuj) {
            bcuj bcuj = (bcuj) obj;
            if (bcul.SUBSCRIPT == bcuj.mo57226b() && bcuj.mo57256i()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return 1231;
    }

    /* renamed from: i */
    public final boolean mo57256i() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(26);
        sb.append("TextStyle{subscript=true}");
        return sb.toString();
    }
}
