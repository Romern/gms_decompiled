package p000;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.nearby.sharing.FileAttachment;

/* renamed from: ajja */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajja {

    /* renamed from: a */
    public Uri f70731a;

    /* renamed from: b */
    public long f70732b = -1;

    /* renamed from: c */
    public int f70733c = 0;

    /* renamed from: d */
    public String f70734d = "application/octet-stream";

    /* renamed from: e */
    private final String f70735e;

    public ajja(String str) {
        this.f70735e = str;
    }

    /* renamed from: a */
    public final FileAttachment mo38689a() {
        return new FileAttachment(this.f70735e, this.f70733c, this.f70732b, this.f70731a, new Bundle(), this.f70734d);
    }
}
