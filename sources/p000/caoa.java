package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;

/* renamed from: caoa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caoa {

    /* renamed from: a */
    public canr f175431a;

    /* renamed from: b */
    public canq f175432b;

    /* renamed from: c */
    public canu f175433c;

    /* renamed from: d */
    public int f175434d = -1;

    /* renamed from: e */
    public canw f175435e;

    public final String toString() {
        StringBuilder sb = new StringBuilder((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR);
        sb.append("<<\n mode: ");
        sb.append(this.f175431a);
        sb.append("\n ecLevel: ");
        sb.append(this.f175432b);
        sb.append("\n version: ");
        sb.append(this.f175433c);
        sb.append("\n maskPattern: ");
        sb.append(this.f175434d);
        if (this.f175435e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f175435e.toString());
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
