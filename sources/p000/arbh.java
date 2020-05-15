package p000;

import com.google.android.gms.nearby.bootstrap.Device;
import java.util.Locale;

/* renamed from: arbh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class arbh implements ahcp {

    /* renamed from: a */
    final /* synthetic */ arbj f87273a;

    public arbh(arbj arbj) {
        this.f87273a = arbj;
    }

    /* renamed from: a */
    public final void mo36303a() {
        armu armu = this.f87273a.f87279e;
        if (armu != null) {
            armu.mo48347a();
        }
        this.f87273a.f87278d = null;
    }

    /* renamed from: b */
    public final void mo36307b() {
        armu armu = this.f87273a.f87279e;
        if (armu != null) {
            armu.mo48351a((String) null);
        }
    }

    /* renamed from: a */
    public final void mo36304a(int i) {
        Logger Logger = arbj.f87275a;
        String valueOf = String.valueOf(ahcu.m55496a(i));
        Logger.mo25418e(valueOf.length() == 0 ? new String("Nearby.Bootstrap ConnectionListener error: ") : "Nearby.Bootstrap ConnectionListener error: ".concat(valueOf), new Object[0]);
        armu armu = this.f87273a.f87279e;
        if (armu != null) {
            armu.mo48348a(10557);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: b */
    public final void mo36308b(String str) {
        sdo.m34969a(str, (Object) "base64 cannot be null.");
        sdo.m34971a(str.length() >= 6, (Object) "base64 must be 6 or more characters.");
        StringBuilder sb = new StringBuilder(str.toUpperCase(Locale.US).substring(0, 6));
        sdo.checkIfNull(sb, "sb cannot be null.");
        for (int i = 0; i < sb.length(); i++) {
            char charAt = sb.charAt(i);
            if (charAt == '+') {
                sb.setCharAt(i, '5');
            } else if (charAt == '/') {
                sb.setCharAt(i, '6');
            } else if (charAt == 'A') {
                sb.setCharAt(i, '0');
            } else if (charAt == 'E') {
                sb.setCharAt(i, '1');
            } else if (charAt == 'I') {
                sb.setCharAt(i, '2');
            } else if (charAt == 'O') {
                sb.setCharAt(i, '3');
            } else if (charAt == 'U') {
                sb.setCharAt(i, '4');
            }
        }
        String sb2 = sb.toString();
        armu armu = this.f87273a.f87279e;
        if (armu != null) {
            armu.mo48351a(sb2);
        }
    }

    /* renamed from: a */
    public final void mo36305a(Device device, byte[] bArr) {
        bmxy.m108582a(device, "device is null.");
        Logger Logger = arbj.f87275a;
        String str = device.f80397b;
        String str2 = device.f80399d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length());
        sb.append("Connected to target device:");
        sb.append(str);
        sb.append(" (");
        sb.append(str2);
        sb.append(")");
        Logger.logVerbose(sb.toString(), new Object[0]);
        arnn arnn = new arnn(this.f87273a.f87276b, device);
        bmxy.m108582a(arnn, "DeviceMessageSender is null.");
        armu armu = this.f87273a.f87279e;
        if (armu != null) {
            armu.mo48349a(arnn, null);
        }
    }

    /* renamed from: a */
    public final void mo36306a(String str) {
        arbj.f87275a.mo25420f("ConnectionListener.onTokenFailure(String) called on source device. This should not happen.", new Object[0]);
        throw new UnsupportedOperationException("Token failure not supported on source device.");
    }
}
