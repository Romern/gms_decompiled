package p000;

import android.content.ComponentName;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: aclr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aclr {

    /* renamed from: a */
    public final String f60112a;

    /* renamed from: b */
    private final String f60113b;

    public aclr(ComponentName componentName, String str) {
        this.f60112a = componentName.flattenToString();
        this.f60113b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aclr) {
            aclr aclr = (aclr) obj;
            return TextUtils.equals(this.f60112a, aclr.f60112a) && TextUtils.equals(this.f60113b, aclr.f60113b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f60112a, this.f60113b});
    }

    public final String toString() {
        String str = this.f60112a;
        String str2 = this.f60113b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53 + String.valueOf(str2).length());
        sb.append("ComponentData: flattenedComponentName=");
        sb.append(str);
        sb.append(", displayname=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
