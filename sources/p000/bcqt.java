package p000;

/* renamed from: bcqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bcqt extends bcqz {
    /* renamed from: b */
    public final bcul mo57226b() {
        return bcul.STRIKETHROUGH;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bcuj) {
            bcuj bcuj = (bcuj) obj;
            if (bcul.STRIKETHROUGH == bcuj.mo57226b() && bcuj.mo57251h()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo57251h() {
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("TextStyle{strikethrough=true}");
        return sb.toString();
    }
}
