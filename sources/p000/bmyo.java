package p000;

/* renamed from: bmyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bmyo extends bmwa {

    /* renamed from: g */
    final /* synthetic */ bmyp f131206g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bmyo(bmyp bmyp, bmyx bmyx, CharSequence charSequence) {
        super(bmyx, charSequence);
        this.f131206g = bmyp;
    }

    /* renamed from: a */
    public final int mo66819a(int i) {
        int length = this.f131206g.f131207a.length();
        int length2 = this.f131122b.length() - length;
        while (i <= length2) {
            int i2 = 0;
            while (i2 < length) {
                if (this.f131122b.charAt(i2 + i) == this.f131206g.f131207a.charAt(i2)) {
                    i2++;
                } else {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo66820b(int i) {
        return i + this.f131206g.f131207a.length();
    }
}
