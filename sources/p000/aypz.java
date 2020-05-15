package p000;

import android.net.Uri;
import com.google.android.libraries.bluetooth.fastpair.AutoValue_HeadsetPiece;
import com.google.android.libraries.bluetooth.fastpair.HeadsetPiece;

/* renamed from: aypz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aypz {

    /* renamed from: a */
    public Uri f98222a;

    /* renamed from: b */
    private Integer f98223b;

    /* renamed from: c */
    private Integer f98224c;

    /* renamed from: d */
    private String f98225d;

    /* renamed from: e */
    private Boolean f98226e;

    /* renamed from: a */
    public final HeadsetPiece mo54213a() {
        String str = this.f98223b == null ? " lowLevelThreshold" : "";
        if (this.f98224c == null) {
            str = str.concat(" batteryLevel");
        }
        if (this.f98225d == null) {
            str = String.valueOf(str).concat(" imageUrl");
        }
        if (this.f98226e == null) {
            str = String.valueOf(str).concat(" charging");
        }
        if (str.isEmpty()) {
            return new AutoValue_HeadsetPiece(this.f98223b.intValue(), this.f98224c.intValue(), this.f98225d, this.f98226e.booleanValue(), this.f98222a);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo54217b(int i) {
        this.f98223b = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo54214a(int i) {
        this.f98224c = Integer.valueOf(i);
    }

    /* renamed from: a */
    public final void mo54215a(String str) {
        if (str != null) {
            this.f98225d = str;
            return;
        }
        throw new NullPointerException("Null imageUrl");
    }

    /* renamed from: a */
    public final void mo54216a(boolean z) {
        this.f98226e = Boolean.valueOf(z);
    }
}
