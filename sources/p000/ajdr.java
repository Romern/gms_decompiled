package p000;

import android.text.TextUtils;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.util.Arrays;

/* renamed from: ajdr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajdr {

    /* renamed from: a */
    public final String f70397a;

    /* renamed from: b */
    public final ClientAppIdentifier f70398b;

    private ajdr(ClientAppIdentifier clientAppIdentifier, String str) {
        this.f70398b = clientAppIdentifier;
        this.f70397a = str;
    }

    /* renamed from: a */
    public static ajdr m58562a(ClientAppIdentifier clientAppIdentifier, String str) {
        sdo.m34975b(!TextUtils.isEmpty(str), "PublishId cannot be null or empty");
        return new ajdr(clientAppIdentifier, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.f70397a, ((ajdr) obj).f70397a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f70397a});
    }

    public final String toString() {
        String str = this.f70397a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 14);
        sb.append("Unpublish(id=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
