package p000;

import com.google.location.nearby.common.fastpair.slice.AutoValue_DeviceDetailsLinks;
import com.google.location.nearby.common.fastpair.slice.DeviceDetailsLinks;

/* renamed from: butd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class butd {

    /* renamed from: a */
    private byte[] f154839a;

    /* renamed from: b */
    private Boolean f154840b;

    /* renamed from: c */
    private String f154841c;

    /* renamed from: d */
    private String f154842d;

    /* renamed from: e */
    private Boolean f154843e;

    /* renamed from: f */
    private String f154844f;

    /* renamed from: g */
    private String f154845g;

    /* renamed from: a */
    public final DeviceDetailsLinks mo73099a() {
        String str = this.f154839a == null ? " accountKey" : "";
        if (this.f154840b == null) {
            str = str.concat(" assistantSupported");
        }
        if (this.f154841c == null) {
            str = String.valueOf(str).concat(" actionUrl");
        }
        if (this.f154842d == null) {
            str = String.valueOf(str).concat(" address");
        }
        if (this.f154843e == null) {
            str = String.valueOf(str).concat(" firmwareUpdateAvailable");
        }
        if (this.f154844f == null) {
            str = String.valueOf(str).concat(" authority");
        }
        if (this.f154845g == null) {
            str = String.valueOf(str).concat(" signature");
        }
        if (str.isEmpty()) {
            return new AutoValue_DeviceDetailsLinks(this.f154839a, this.f154840b.booleanValue(), this.f154841c, this.f154842d, this.f154843e.booleanValue(), this.f154844f, this.f154845g);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
    }

    /* renamed from: b */
    public final void mo73103b(String str) {
        if (str != null) {
            this.f154842d = str;
            return;
        }
        throw new NullPointerException("Null address");
    }

    /* renamed from: c */
    public final void mo73105c(String str) {
        if (str != null) {
            this.f154844f = str;
            return;
        }
        throw new NullPointerException("Null authority");
    }

    /* renamed from: d */
    public final void mo73106d(String str) {
        if (str != null) {
            this.f154845g = str;
            return;
        }
        throw new NullPointerException("Null signature");
    }

    /* renamed from: b */
    public final void mo73104b(boolean z) {
        this.f154843e = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final void mo73100a(String str) {
        if (str != null) {
            this.f154841c = str;
            return;
        }
        throw new NullPointerException("Null actionUrl");
    }

    /* renamed from: a */
    public final void mo73101a(boolean z) {
        this.f154840b = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final void mo73102a(byte[] bArr) {
        if (bArr != null) {
            this.f154839a = bArr;
            return;
        }
        throw new NullPointerException("Null accountKey");
    }
}
