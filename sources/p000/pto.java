package p000;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.EqualizerSettings;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.LaunchOptions;

/* renamed from: pto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pto extends dcj implements ptq {
    public pto(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastDeviceController");
    }

    /* renamed from: a */
    public final void mo23645a() {
        mo8530c(1, mo8529bj());
    }

    /* renamed from: a */
    public final void mo23646a(double d, double d2, boolean z) {
        throw null;
    }

    /* renamed from: a */
    public final void mo23647a(EqualizerSettings equalizerSettings) {
        throw null;
    }

    /* renamed from: a */
    public final void mo23649a(String str, LaunchOptions launchOptions) {
        throw null;
    }

    /* renamed from: a */
    public final void mo23651a(String str, String str2, long j, String str3) {
        throw null;
    }

    /* renamed from: a */
    public final void mo23653a(String str, boolean z) {
        throw null;
    }

    /* renamed from: a */
    public final void mo23654a(String str, byte[] bArr, long j) {
        throw null;
    }

    /* renamed from: b */
    public final void mo23657b(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8530c(11, bj);
    }

    /* renamed from: c */
    public final void mo23658c() {
        mo8530c(4, mo8529bj());
    }

    /* renamed from: d */
    public final void mo23660d() {
        mo8530c(6, mo8529bj());
    }

    /* renamed from: e */
    public final void mo23661e() {
        mo8530c(17, mo8529bj());
    }

    /* renamed from: f */
    public final void mo23662f() {
        mo8530c(19, mo8529bj());
    }

    /* renamed from: g */
    public final void mo23663g(String str, String str2) {
        throw null;
    }

    /* renamed from: c */
    public final void mo23659c(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        mo8530c(12, bj);
    }

    /* renamed from: a */
    public final void mo23648a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(null);
        mo8530c(5, bj);
    }

    /* renamed from: a */
    public final void mo23650a(String str, String str2, long j) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeString(str2);
        bj.writeLong(j);
        mo8530c(9, bj);
    }

    /* renamed from: a */
    public final void mo23652a(String str, String str2, JoinOptions joinOptions) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        bj.writeString(null);
        dcl.m8165a(bj, joinOptions);
        mo8530c(14, bj);
    }

    /* renamed from: a */
    public final void mo23655a(ptt ptt) {
        Parcel bj = mo8529bj();
        dcl.m8164a(bj, ptt);
        mo8530c(18, bj);
    }

    /* renamed from: a */
    public final void mo23656a(boolean z, double d, boolean z2) {
        Parcel bj = mo8529bj();
        dcl.m8166a(bj, z);
        bj.writeDouble(d);
        dcl.m8166a(bj, z2);
        mo8530c(8, bj);
    }
}
