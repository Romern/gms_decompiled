package p000;

import com.felicanetworks.mfc.AppInfo;
import com.felicanetworks.mfc.FelicaException;

/* renamed from: brhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brhb {

    /* renamed from: a */
    public int f142843a;

    /* renamed from: b */
    public String f142844b;

    /* renamed from: c */
    public Integer f142845c;

    /* renamed from: d */
    public Integer f142846d;

    /* renamed from: e */
    public String f142847e;

    /* renamed from: f */
    public AppInfo f142848f;

    /* renamed from: g */
    public FelicaException f142849g;

    public final String toString() {
        int i = this.f142843a;
        String str = this.f142844b;
        String valueOf = String.valueOf(this.f142845c);
        String valueOf2 = String.valueOf(this.f142846d);
        String str2 = this.f142847e;
        String valueOf3 = String.valueOf(this.f142848f);
        String valueOf4 = String.valueOf(this.f142849g);
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 141 + length2 + length3 + length4 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("FelicaEventData{elapsedTimeMillis=");
        sb.append(i);
        sb.append(", onetimeUrl='");
        sb.append(str);
        sb.append("', onlineOperationStatus=");
        sb.append(valueOf);
        sb.append(", errorCode=");
        sb.append(valueOf2);
        sb.append(", errorMessage='");
        sb.append(str2);
        sb.append("', otherAppInfo=");
        sb.append(valueOf3);
        sb.append(", exception=");
        sb.append(valueOf4);
        sb.append('}');
        return sb.toString();
    }
}
