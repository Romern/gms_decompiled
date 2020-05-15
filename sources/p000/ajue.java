package p000;

import android.os.Bundle;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;

/* renamed from: ajue */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajue {

    /* renamed from: a */
    public int f71288a = 0;

    /* renamed from: b */
    public String f71289b;

    /* renamed from: c */
    public boolean f71290c = false;

    /* renamed from: d */
    private final String f71291d;

    public ajue(String str) {
        this.f71291d = str;
    }

    /* renamed from: a */
    public final WifiCredentialsAttachment mo38921a() {
        return new WifiCredentialsAttachment(this.f71291d, this.f71288a, new Bundle(), this.f71289b, this.f71290c);
    }
}
