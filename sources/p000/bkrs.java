package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: bkrs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkrs extends bkrn {

    /* renamed from: d */
    public final String f125169d;

    /* renamed from: e */
    public final blhp f125170e;

    /* renamed from: f */
    public final blhp f125171f;

    public bkrs(bkqn bkqn, bkqw bkqw, List list, String str, blhp blhp, blhp blhp2) {
        super(bkqn, bkqw, list);
        this.f125169d = str;
        this.f125171f = blhp;
        this.f125170e = blhp2;
    }

    /* renamed from: a */
    public final bkrn mo66284a(bkqo bkqo) {
        return new bkrs((bkqn) bkqo, this.f125157b, this.f125158c, this.f125169d, this.f125171f, this.f125170e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        bkrs bkrs = (bkrs) obj;
        return bkwv.m106780a(this.f125169d, bkrs.f125169d, this.f125171f, bkrs.f125171f, this.f125170e, bkrs.f125170e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(super.hashCode()), this.f125169d, this.f125170e, this.f125171f});
    }

    public final String toString() {
        String str = this.f125169d;
        String valueOf = String.valueOf(this.f125170e);
        String valueOf2 = String.valueOf(this.f125171f);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 51 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("ValueChangedEvent [property=");
        sb.append(str);
        sb.append(", oldValue=");
        sb.append(valueOf);
        sb.append(", newValue=");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
