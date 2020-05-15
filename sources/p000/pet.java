package p000;

import com.google.android.gms.cast.CastDevice;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* renamed from: pet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pet {

    /* renamed from: a */
    public String f38993a;

    /* renamed from: b */
    public String f38994b;

    /* renamed from: c */
    public String f38995c;

    /* renamed from: d */
    public String f38996d = "-1";

    /* renamed from: e */
    public int f38997e = 8009;

    /* renamed from: f */
    public List f38998f = new ArrayList();

    /* renamed from: g */
    public int f38999g = 0;

    /* renamed from: h */
    public int f39000h = -1;

    /* renamed from: i */
    public String f39001i;

    /* renamed from: j */
    public String f39002j;

    /* renamed from: k */
    public int f39003k;

    /* renamed from: l */
    public String f39004l;

    /* renamed from: m */
    public byte[] f39005m;

    /* renamed from: n */
    public String f39006n;

    /* renamed from: o */
    private String f39007o;

    public pet(CastDevice castDevice) {
        this.f38993a = castDevice.mo17494a();
        this.f38994b = castDevice.f29716d;
        this.f38995c = castDevice.f29717e;
        this.f38996d = castDevice.f29718f;
        this.f39007o = castDevice.f29714b;
        this.f38997e = castDevice.f29719g;
        this.f38998f = castDevice.mo17499d();
        this.f38999g = castDevice.f29720h;
        this.f39000h = castDevice.f29721i;
        this.f39001i = castDevice.f29722j;
        this.f39002j = castDevice.f29723k;
        this.f39003k = castDevice.f29724l;
        this.f39004l = castDevice.f29725m;
        this.f39005m = castDevice.f29726n;
        this.f39006n = castDevice.f29727o;
    }

    /* renamed from: a */
    public final CastDevice mo22985a() {
        return new CastDevice(this.f38993a, this.f39007o, this.f38994b, this.f38995c, this.f38996d, this.f38997e, this.f38998f, this.f38999g, this.f39000h, this.f39001i, this.f39002j, this.f39003k, this.f39004l, this.f39005m, this.f39006n);
    }

    public pet(String str, InetAddress inetAddress) {
        this.f39007o = inetAddress != null ? inetAddress.getHostAddress() : null;
        this.f38993a = str;
    }

    public pet(String str, byte[] bArr) {
        this.f39004l = str;
        this.f39005m = bArr;
        this.f38993a = String.format(Locale.US, "%s_%s", "__cast_ble__", UUID.randomUUID().toString());
    }
}
