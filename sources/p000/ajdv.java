package p000;

import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import com.google.android.gms.nearby.messages.internal.BleSignalImpl;
import com.google.android.gms.nearby.messages.internal.DistanceImpl;
import com.google.android.gms.nearby.messages.internal.Update;

/* renamed from: ajdv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajdv {

    /* renamed from: a */
    public int f70401a;

    /* renamed from: b */
    public Message f70402b;

    /* renamed from: c */
    public DistanceImpl f70403c;

    /* renamed from: d */
    public BleSignalImpl f70404d;

    /* renamed from: e */
    public NearbyDevice f70405e;

    /* renamed from: f */
    public byte[] f70406f;

    public ajdv() {
    }

    /* renamed from: a */
    private final void m58565a(int i) {
        this.f70401a = i | this.f70401a;
    }

    /* renamed from: b */
    public final boolean mo38531b() {
        return this.f70401a == 0;
    }

    /* renamed from: c */
    public final void mo38532c() {
        m58565a(1);
    }

    /* renamed from: d */
    public final void mo38533d() {
        m58565a(2);
    }

    public ajdv(Update update) {
        this.f70401a = update.f80794b;
        this.f70402b = update.f80795c;
        this.f70403c = update.f80796d;
        this.f70404d = update.f80797e;
        this.f70405e = update.f80798f;
        this.f70406f = update.f80799g;
    }

    /* renamed from: a */
    public final Update mo38525a() {
        return new Update(1, this.f70401a, this.f70402b, this.f70403c, this.f70404d, this.f70405e, this.f70406f);
    }

    /* renamed from: a */
    public final void mo38526a(aizv aizv) {
        if (aizv != null) {
            mo38530a(aizv.f70191c);
        }
    }

    /* renamed from: a */
    public final void mo38527a(NearbyDevice nearbyDevice) {
        m58565a(16);
        this.f70405e = nearbyDevice;
    }

    /* renamed from: a */
    public final void mo38528a(BleSignalImpl bleSignalImpl) {
        m58565a(8);
        this.f70404d = bleSignalImpl;
    }

    /* renamed from: a */
    public final void mo38529a(DistanceImpl distanceImpl) {
        m58565a(4);
        this.f70403c = distanceImpl;
    }

    /* renamed from: a */
    public final void mo38530a(byte[] bArr) {
        m58565a(32);
        this.f70406f = bArr;
    }
}
